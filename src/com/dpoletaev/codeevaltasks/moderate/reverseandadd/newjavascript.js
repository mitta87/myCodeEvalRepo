

console.log(getCount('195'));

function getCount(line){
    var count = 0;
    var result = line;
    do{
      result = '' + (+result + +reverse(result));
      count++;
    }while(!isPalindrome(result));
    return count + ' ' + result;
}

function reverse(line){
    return line.split('').reverse().join('');
}

function isPalindrome(inp){
    var left = 0, right = inp.length - 1;    
    for(;left < right;){       
       if(inp[left++] != inp[right--]){
           return false;
       }
    }
    return true;
}

