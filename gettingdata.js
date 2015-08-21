var http = require('https');

var options = {
	host: 'br.api.pvp.net',
	path: '/api/lol/br/v2.2/match/542478739?includeTimeline=false&api_key=API_KEY_HERE'
}

callback = function (response){
	var str='';


response.on('data', function (chunk){
	str+=chunk;
});

response.on('end', function(){
	console.log(str);
});

}

http.request(options, callback).end();
