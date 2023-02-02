
$('document').ready(function(){
	$('table #edit-btn').on('click',function(event){
		event.preventDefault();
		var href=$(this).attr('href');
		$.get(href,function(client, status){
			$("#id-edit").val(client.id);
			$("#name-edit").val(client.name);
			$("#address-edit").val(client.address);
			$("#city-edit").val(client.city);
			$("#phone-edit").val(client.phone);
			$("#email-edit").val(client.email);

		})
		$('#editModal').modal();
	});
	$('table #delete-btn').on('click',function(event){
				event.preventDefault();
		var href=$(this).attr('href');
		$("#confirm-delete-btn").attr('href', href);
		$('#DeleteModal').modal();
	});
});