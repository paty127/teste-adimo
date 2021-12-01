$(document).ready(function() {
	$("#addFavorito").on('click',function() {
		var id = $(this).val();
				if (id > 0) {
			$.ajax({
				url: '/casa/add',
				data: { "id": id },
				success:function() {
					alert('inserido com sucesso!');		
				}	
			});
		}
	});
});