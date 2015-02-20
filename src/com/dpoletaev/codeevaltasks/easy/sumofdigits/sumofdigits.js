process('23')

function process(line){
    var sum = 0;
    for(var i = 0; i < line.length; i++){
     sum += +line[i];   
    }
    console.log(sum);
}

