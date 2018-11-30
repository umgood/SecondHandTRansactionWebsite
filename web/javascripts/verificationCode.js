function createCode() { //创建验证码函数
    $.get('/getVerificationCode', (data, status) =>{
        $("#captchaPic").html(data);
    })  
}
