$('document').ready(function(){
  $('table #edit-btn').on('click',function(event){
    event.preventDefault();
    var href=$(this).attr('href');
    $.get(href,function(Booking, status){
      $("#id-edit").val(Booking.id);
      $("#Status-edit").val(Booking.status);
    	 $("#startdate-edit").val(new Date(Booking.startdate).toISOString().substring(0, 10));
		$("#enddate-edit").val(new Date(Booking.enddate).toISOString().substring(0, 10));
      	$("#client-edit option").each(function() {
        if ($(this).text() == Booking.client.name) {
          $(this).prop("selected", true);
        }
      });
      $("#vehicle-edit option").each(function() {
        if ($(this).text() == Booking.vehicle.Model) {
          $(this).prop("selected", true);
        }
      });
      $("#Totalamount-edit").val(Booking.totalamount);
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