/**
 * Theme: Highdmin - Responsive Bootstrap 4 Admin Dashboard
 * Author: Coderthemes
 * X editable
 */


$(function(){
    //modify buttons style
    $.fn.editableform.buttons =
        '<button type="submit" class="btn btn-primary editable-submit btn-sm waves-effect waves-light"><i class="mdi mdi-check"></i></button>' +
        '<button type="button" class="btn btn-light editable-cancel btn-sm waves-effect"><i class="mdi mdi-close"></i></button>';

    //Inline editables
    $('#inline-username').editable({
        validate: function(value) {
            if($.trim(value).length > 12) return '用户名长度不能大于12！';
            if($.trim(value).length < 2) return '用户名长度不能小于2！';
            if($.trim(value) == '') return '不能为空！';
        },
        
        mode: 'inline',
        inputclass: 'form-control-sm'
    });

    $('#inline-firstname').editable({
        validate: function(value) {
            if($.trim(value) == '') return 'This field is required';
        },
        mode: 'inline',
        inputclass: 'form-control-sm'
    });

    $('.editor').editable({
        validate: function(value) {
            if($.trim(value) == '') return '不能为空！';
        },
        mode: 'inline',
        inputclass: 'form-control-sm'
    });

    $('#inline-sex').editable({
        mode: 'inline',
        inputclass: 'form-control-sm',
        source: [
            {value: 1, text: '男'},
            {value: 2, text: '女'}
        ],
        display: function(value, sourceData) {
            var colors = {"": "gray", 1: "green", 2: "blue"};
            var elem = $.grep(sourceData, function(o){return o.value == value;});
            if(elem.length) {
                $(this).text(elem[0].text);
            } else {
                $(this).empty();
            }
        }
    });
    // $('#inline-area').editable({
    //     mode: 'inline',
    //     inputclass: 'form-control-sm province_city_area_choose',
    //     inputid: 'test',

    //     display: function(value, sourceData) {

    //     },
    //     success: function(){
    //         console.log(this)
    //     },
    //     source: function(value){
    //         $('.editable-input').html('\
    //             <div>\
    //                 <select name="" class="form-control form-control-sm" id="province" onchange="getCity()"></select>\
    //                 <select name="" class="form-control form-control-sm" id="city" onchange="getArea()"></select>\
    //                 <select name="" class="form-control form-control-sm" id="area" onchange="test()"></select>\
    //             </div>'
    //         )
    //         $.getJSON("/json/city.json",function(data){
    //             province = data;
    //             province.forEach(value=>{
    //                 $('#province').append(new Option(value.name, value.name));
    //             })
    //             province[0]['city'].forEach(value=>{
    //                 $('#city').append(new Option(value.name, value.name));
    //             })
    //             province[0]['city'][0]['area'].forEach(value=>{
    //                 $('#area').append(new Option(value, value));
    //             })
    //         })
    //     }
    // });
    
    $('#inline-group').editable({
        showbuttons: false,
        mode: 'inline',
        inputclass: 'form-control-sm'
    });

    $('#inline-status').editable({
        mode: 'inline',
        inputclass: 'form-control-sm'
    });

    $('#inline-dob').editable({
        mode: 'inline',
        inputclass: 'form-control-sm'
    });

    $('#inline-event').editable({
        placement: 'right',
        mode: 'inline',
        combodate: {
            firstItem: 'name'
        },
        inputclass: 'form-control-sm'
    });

    $('#inline-comments').editable({
        showbuttons: 'bottom',
        mode: 'inline',
        inputclass: 'form-control-sm'
    });

    $('#inline-fruits').editable({
        pk: 1,
        limit: 3,
        mode: 'inline',
        inputclass: 'form-control-sm',
        source: [
            {value: 1, text: 'Banana'},
            {value: 2, text: 'Peach'},
            {value: 3, text: 'Apple'},
            {value: 4, text: 'Watermelon'},
            {value: 5, text: 'Orange'}
        ]
    });

});