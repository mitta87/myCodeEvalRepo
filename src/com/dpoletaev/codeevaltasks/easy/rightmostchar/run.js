/**
 * Created by Митя on 22.02.2015.
 */

var line = 'Hello CodeEval,E';

var sepIndex = line.indexOf(',');
var inp = line.substring(0, sepIndex);
var char = line.substring(sepIndex + 1);

var index = -1;
for (var i = inp.length - 1; i >= 0; i--) {
    if (inp[i] == char) {
        index = i;
        break;
    }
}
console.log(index);


