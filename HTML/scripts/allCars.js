  
$(document).ready(function()    {
    $("#all_books").click(function(e)    {
        $.ajax({
            type: 'GET',
            url: 'http://localhost:8080/allBooks',
            dataType: 'json',
            success: function(data){
                var $tr = $('<tr>').append(
                    $('<td>').text("Cod carte"),
                    $('<td>').text("Nume"),
                    $('<td>').text("Autor"),
                    $('<td>').text("Gen literar"),
                ).appendTo('#records_table');

                $.each(data, function(i, item) {
                    var $tr = $('<tr>').append(
                        $('<td>').text(item.id),
                        $('<td>').text(item.name),
                        $('<td>').text(item.author),
                        $('<td>').text(item.genre),
                    ).appendTo('#records_table');
                })
            },
            error: function(){
                console.log("Error");
            }

        });
    });


});