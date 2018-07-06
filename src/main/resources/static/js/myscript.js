function sendAjax()
{
    var cur_data;
    $.ajax(
        {
            type: "post",
            url: "/count",
            data: {user:"huqingzhong"},
            dataType:"json",
            //async : false,
            success:function(data)
            {
                cur_data=JSON.stringify(data.currentCount);
                $("#display").html(cur_data);
                if(cur_data>15){
                    $("#light").html("<img src='/image/red.png' width='50' height='50'>");
                }else if(cur_data>10){
                    $("#light").html("<img src='/image/yellow.png' width='50' height='50'>");
                }else{
                    $("#light").html("<img src='/image/green.png' width='50' height='50'>");
                }
            },
            error: function() {
                $("#error").html("<span style='color:#1b2280;'>error</span>");
            }
        });
}