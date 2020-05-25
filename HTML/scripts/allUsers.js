$(document).ready(function()    {
    $("#all_users").click(function(e)    {
        $.ajax({
            type: 'GET',
            url: 'http://localhost:8080/allMechanicsUsers',
            dataType: 'json',
            success: function(data){
                console.log(data);
                var str="<thead><tr><th>Index</th><th>Nume</th><th>Nr telefon</th><th>Tip User</th></tr></thead>";
                $.each(data, function (i, user) {
                    str = str + "<tr>" +
                    "<td>" + (i + 1) + ".</td>" +
                    "<td>" + user.nume + "</th>" +
                    "<td>" + user.phoneNumber + "</th>" +
                    "<td>" + user.type + "</th>" +
                    "</tr>";
                })
                $("#user").html(str); 
            },
            error: function(){
                $("#all_users").html("error")
            }

        });
    });


});