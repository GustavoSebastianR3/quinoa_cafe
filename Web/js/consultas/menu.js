
let methods = {
    listarCategorias() {

        return new Promise((resolve, reject) => {
            $.ajax({
                type: 'get',
                url: 'http://localhost:8001/categorias/listar',
                crossDomain: true,
                data: '',
                dataType: 'JSON',
                beforeSend: function (xhr) {
                    console.log('Cargando...');
                },
                success: function (data, textStatus, jqXHR) {
                    if (textStatus === 'success' && jqXHR.status === 200) {
                        resolve(data)
                    } else {
                        reject('La petición retorno un error: ' + data + ' - ' + textStatus)
                    }
                },
                error: function (jqXHR, textStatus, errorThrown) {
                    if (jqXHR.status == 500) {
                        //muestraError('ERROR DE CONEXIÓN 500', 'Actualmente no se tiene conexión con el servidor.');
                    } else if (jqXHR.status == 404) {
                        //muestraError('ERROR DE APLICACIÓN 404', 'No se puede acceder al aplicativo.');
                    }
                    reject('No se pudo realizar la petición: ' + jqXHR)
                }
            })
        })
    }
}

function init(){

    methods.listarCategorias().then(data => {
        let print = `<ul class="nav canvas-alt-tabs2 tabs nav-pills nav-fill mb-5" id="canvas-tab-nav2" role="tablist">`;
        data.forEach(categorias => {
            print += `<li class="nav-item" role="presentation">`;
            print += `<button class="nav-link" id="canvas-tabs-${categorias.nombre}-tab" data-bs-toggle="pill" data-bs-target="#tabs-${categorias.nombre}"
            type="button" role="tab" aria-controls="canvas-tabs-${categorias.nombre}" aria-selected="true"><img src="demos/restaurant/images/icons/breakfast.svg" alt="Image"> ${categorias.nombre}</button>`;
            print += `</li>`;				
            console.log(categorias.idCategoria);
            console.log(categorias.nombre);
        });
        print += `</ul>`;

        $('#tab-restuarant').html("");
        $('#tab-restuarant').html(print);

        
    });
}

init();
