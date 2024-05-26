
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
    },
    listarProductos(idCategoria) {
        return new Promise((resolve, reject) => {
            $.ajax({
                type: 'get',
                url: 'http://localhost:8001/productos/listar/'+idCategoria,
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
    },
}

function init(){

    methods.listarCategorias().then(dataCategorias => {
        let print = `<ul class="nav canvas-alt-tabs2 tabs nav-pills nav-fill mb-5" id="canvas-tab-nav2" role="tablist">`;
        dataCategorias.forEach(categorias => {
            var active="";
            if(categorias.idCategoria ==1){
                active= "active";
            }

            print += `<li class="nav-item" role="presentation">`;
            print += `<button class="nav-link ${active}" id="canvas-tabs-${categorias.nombre}-tab" data-bs-toggle="pill" data-bs-target="#tabs-${categorias.nombre}"
            type="button" role="tab" aria-controls="canvas-tabs-${categorias.nombre}" aria-selected="true"><img src="demos/restaurant/images/icons/${categorias.icono}" alt="Image"> ${categorias.nombre}</button>`;
            print += `</li>`;
        });
        print += `</ul>`;

        print += `<div id="canvas-tab-alt-content" class="tab-content mt-4">`;
        dataCategorias.forEach(categorias => {
            var active="";
            if(categorias.idCategoria ==1){
                active= "show active";
            }
            print += `<div class="tab-pane fade ${active}" id="tabs-${categorias.nombre}" role="tabpanel" aria-labelledby="canvas-tabs-${categorias.nombre}-tab" tabindex="0">`;

            print += `<div class="row gutter-40">`;

            methods.listarProductos(categorias.idCategoria).then(dataProductos => {
                dataProductos.forEach(productos => {
                    print += `XXXXX`;
                    console.log(productos);
                });    
            });        
            print += `</div>`;
            print += `</div>`;
        });    
        print += `</div>`;

        console.log(print);

        $('#tab-restuarant').html("");
        $('#tab-restuarant').html(print);

        
    });
}

init();