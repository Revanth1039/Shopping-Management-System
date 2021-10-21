var express=require('express');
var app=express();
app.use(express.static(__dirname+'/frontend'));
app.get('/',function(req,res){
    res.sendFile(__dirname+'/frontend/Home-Page.html');
})
var port=process.env.PORT||3000;
app.listen(port,function(){
    console.log('Site run on HTTP://localhost:'+port);
})