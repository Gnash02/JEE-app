
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
			$("#price-edit").val(Vehicle.price);

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
	$('table #image-btn').on('click',function(event){
		  
		   try {
       	 	var href=$(this).attr('href');
			$.get(href,function(Vehicle){
			$("#id-editimg").val(Vehicle.id);});
			$('#uploadphoto').modal();
    } catch(ex) {
        alert('An error occurred');
    }
     event.preventDefault();
	});
	$('.table #photoButton').on('click',function(event) {
   event.preventDefault();
   var href = $(this).attr('href');
   $('#photoModal #vehiclePhoto').attr('src', href);
   $('#photoModal').modal();		
});	
 
})