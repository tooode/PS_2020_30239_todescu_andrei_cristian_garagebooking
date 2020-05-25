$(document).ready(function()    {
    $("#all_cars").click(function(e)    {
        $.ajax({
            type: 'GET',
            url: 'http://localhost:8080/allCars',
            dataType: 'json',
            success: function(data){
                console.log(data);
                var str="<thead><tr><th>Index</th><th>Marca&Model</th><th>Numar Inmatriculare</th><th>An fabricatie</th><th>Nr kilometrii</th></tr></thead>";
                $.each(data, function (i, car) {
                    //str = str +car.id+' '+ car.numarInmatriculare+' ' + car.idproprietar+' ' + car.marcaModel+' ' +car.anFabricatie+' '+car.nrKilometrii ", ";
                    str = str + "<tr>" +
                    "<td>" + (i + 1) + ".</td>" +
                    "<td>" + car.marcaModel + "</th>" +
                    "<td>" + car.numarInmatriculare + "</th>" +
                    "<td>" + car.anFabricatie + "</th>" +
                    "<td>" + car.nrKilometrii + "</th>" +
                    "</tr>";
                })
                $("#car").html(str); 
            },
            error: function(){
                $("#all_cars").html("error")
            }

        });
    });


});