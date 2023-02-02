
$('document').ready(function(){
	$('table #edit-btn').on('click',function(event){
		event.preventDefault();
		var href=$(this).attr('href');
		$.get(href,function(Vehicle, status){
			$("#id-edit").val(Vehicle.id);
			$("#Type-edit").val(Vehicle.Type);
			$("#Model-edit").val(Vehicle.Model);
			$("#FuelType-edit").val(Vehicle.FuelType);
			$("#Status-edit").val(Vehicle.Status);
			$("#LastVisit-edit").val(Vehicle.LastVisit);

		})
		$('#editModal').modal();
	});
	$('table #delete-btn').on('click',function(event){
				event.preventDefault();
		var href=$(this).attr('href');
		$("#confirm-delete-btn").attr('href', href);
		$('#DeleteModal').modal();
	});
	$('.table #photoButton').on('click',function(event) {
   event.preventDefault();
   var href = $(this).attr('href');
   $('#photoModal #carPhoto').attr('src', href);
   $('#photoModal').modal();		
});

});