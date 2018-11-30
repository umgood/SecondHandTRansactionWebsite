package bean;

import MessageManagement.Dialogue;
import MessageManagement.Message;
import UserManagement.User;
import model.DialogueDao;
import model.MessageDao;

import java.io.Serializable;
import java.util.ArrayList;

public class UserBean implements Serializable {
    private String username;
    private ArrayList<Dialogue> dialogueArrayList;
    private String userType;

    public UserBean(){
        dialogueArrayList = new ArrayList<Dialogue>();
        userType = "visitor";
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public ArrayList<Dialogue> getDialogueArrayList() {
        return dialogueArrayList;
    }

    public void setDialogueArrayList(User user) {
        System.out.println("UserBean - setDialogueArrayList: start");
        ArrayList<String> dialogIDList = new ArrayList<String>();
        ArrayList<Dialogue> dialogueArrayList = new ArrayList<Dialogue>();
        MessageDao messageDao = new MessageDao();
        dialogIDList = user.getDialogueIDList();
        DialogueDao dialogueDao = new DialogueDao();
        for (int i = 0; i < dialogIDList.size(); i++){
            Dialogue dialogue = new Dialogue();
            ArrayList<Message> messageArrayList = new ArrayList<Message>();

            dialogue = dialogueDao.getDialouge(dialogIDList.get(i), user.getUsername());
            messageArrayList = messageDao.getDialogueMessageList(dialogIDList.get(i));
            dialogue.setMessageArrayList(messageArrayList);
            dialogueArrayList.add(dialogue);
        }
        System.out.println("sendMessageServlet: set dialogList success:" + Integer.toString(dialogueArrayList.size()));
        this.dialogueArrayList = dialogueArrayList;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }
}
