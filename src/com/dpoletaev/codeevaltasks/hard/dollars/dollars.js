var getFunc = function(){

var nums = ['One', 'Two', 'Three', 'Four', 'Five', 'Six', 'Seven', 'Eight', 'Nine'];
var teens = ['Ten', 'Eleven', 'Twelve', 'Thirteen', 'Fourteen', 'Fifteen', 'Sixteen', 'Seventeen', 'Eighteen', 'Nineteen'];
var tens = ['Twenty', 'Thirty', 'Forty', 'Fifty', 'Sixty', 'Seventy', 'Eighty', 'Ninety'];  


var processLine = function(line) {
    var startIndex = 0;
    var endIndex = line.length % 3;
    if(endIndex == 0){
     endIndex +=3;   
    }
    var result = '';
    do {
        var strToProcess = line.substring(startIndex, endIndex);
        result += processRank(strToProcess);
        var postfix = getPostfix(endIndex, line, strToProcess);
        if(postfix){
            result += postfix;
        }
        startIndex = endIndex;
        endIndex += 3;
    } while (endIndex <= line.length);
    result += line == 1 ? 'Dollar' : 'Dollars';
    //console.log(result);
   
}

function getPostfix(endIndex, line, str) {
    var rightSignsLength = line.length - endIndex;
    
    switch (rightSignsLength) {
        case 3:
            if(str != '000')
            return 'Thousand';
            break;
        case 6:
           return 'Million';            
    }
}

var processRank = function (inp) {
    var result = '';
    if(inp){
    if (inp.length == 3 && inp[0] != '0') {
        result += nums[inp[0] - 1] + 'Hundred';
    }
    if (inp.length >= 2 && inp[inp.length - 2] != '0') {
        if (inp[inp.length - 2] != '1') {
            result += tens[inp[inp.length - 2] - 2];
        }
        else {
            result += teens[inp[inp.length - 1]];
            return result;
        }
    }

    if (inp[inp.length - 1] != '0') {
        result += nums[inp[inp.length - 1] - 1];
    }
}
    return result;
};
return processLine;
};


var processLine = getFunc();


var start = new Date().getTime();
console.log(start);
for(var i = 1000000; i < 1000000000; i++){
processLine('' + i);
}
console.log(new Date().getTime() - start);


