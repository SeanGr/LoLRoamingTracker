var http = require('https');

var options = {
	host: 'br.api.pvp.net',
	path: '/api/lol/br/v2.2/match/542478739?includeTimeline=false&api_key='
}

var staticCall = {
	host: 'global.api.pvp.net',
	path: '/api/lol/static-data/na/v1.2/champion/1?locale=en_US&champData=all&api_key='
}

callback = function (response){
	var str='';


response.on('data', function (chunk){
	str+=chunk;
});

response.on('end', function(){
	printStr(str);
});

}

callback2 = function (response){
	var str='';


response.on('data', function (chunk){
	str+=chunk;
});

response.on('end', function(){
	staticInfo(str);
});

}

http.request(options, callback).end();
http.request(staticCall, callback2).end();

function printStr(test){
	var stuff = JSON.parse(test);

	var midblue;
	var midpurp;	
	var already = false;

	//Figure out which ID on each team is the Mid laner.
	for (var i=0;i<10;i++){
		if(stuff.participants[i].timeline.lane == 'MIDDLE'){
			if (already==false){
				midblue = stuff.participants[i];
				//midblue = i;
				already = true;
			}
			else{
				//midpurp = i;
				midpurp = stuff.participants[i];
			}
		}
	}

	console.log("blue mid laner" + midblue);
	console.log(midblue.stats.item0);
	console.log(midblue.championId);
	console.log("purple mid laner" + midpurp);
	//console.log(stuff.participants[1].timeline.lane);
}

function staticInfo(test){
	var theInfo = JSON.parse(test);



	console.log("The champions name is " + theInfo.name);
}