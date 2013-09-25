// geocode.js

function GScript(src) {document.write('<' + 'script src="' + src + '"' +' type="text/javascript"><' + '/script>');}

if (window.location.toString().substr(0,4)=='file')
	var key = "ABQIAAAAS-9BXlmhAxzk5tMQ6009tBQ60YHOa08tQ3Rk7kk6p9CpE9bRLhRgOlUOLYUPHsGwp_XgmEwZWB1hnA";
else
	var key = "AIzaSyADhh4oi0t8r3WDIyIaIQ6rC68xTX4_oPg";

GScript('http://maps.google.com/maps?file=api&amp;v=2&amp;key=' + key);

function geocodeAddress () {
	var address = document.getElementById("latlon").value;
	var geocoder = new GClientGeocoder();
	geocoder.getLatLng(address, rewriteAddr);
}

function rewriteAddr (gLatLng) {
	if (gLatLng==null) {
		if (document.getElementById("latlon").value=="") {
			alert('Please enter and address and try again.');
		} else {
			alert('Unable to locate\n\n '+document.getElementById("latlon").value+' \n\nPlease try again.');
		}
		return false;
	}
	
	document.getElementById("latlon").value = gLatLng.lat()+","+gLatLng.lng();
}

function clearform () {
	document.getElementById("latlon").value = '';
}

