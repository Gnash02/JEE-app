$('document').ready(function(){
	
	$('#Submit-btn').on('click',function(event){
				event.preventDefault();
		$('#confirmationModal').modal();
	});
})

