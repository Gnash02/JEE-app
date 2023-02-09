$('document').ready(function(){
	
	$('.rent-btn').on('click',function(event){event.preventDefault();
		var href=$(this).attr('href');
		$.get(href,function(Vehicle, status){
			$("#Vehicle").val(Vehicle.Model);
			$("#Vehicle_id").val(Vehicle.id);
		$('#rentModal').modal();
		
	});})
	
$('#Submit-btn').on('click',function(){
				
		$('#confirmationModal').modal();
	});
})


