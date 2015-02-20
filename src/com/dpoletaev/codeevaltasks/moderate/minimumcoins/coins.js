var line = '11';
console.log(calculateNumOfCoins(line));


function calculateNumOfCoins(num){
    var nominals = [5, 3, 1];
    num = +num;
    var count = 0;
    var step = 0;
    while(num > 0){
        if(num >= nominals[step]){
            num -= nominals[step];
            count++;
        }
        else{
            step++;
        }
    }
    return count;
}


