var line = 'XMJYAUZ;MZJAWXU';

line = 'abcdgh;ffffffbfffcfdffffgdh';

var arr = line.split(';');
var result = compare(arr[0], arr[1]);
if (result) {
    console.log(result);
}


function compare(str1, str2) {
    var longest;
    for (var start = 0; start < str1.length; start++) {
        var seq;
        var rightStart = str2.indexOf(str1[start]);
        if (rightStart >= 0) {
            seq = str1[start];
            for (var i = start + 1; i < str1.length && rightStart != (str2.length - 1); i++) {
                var index = str2.indexOf(str1[i])
                if (index >= 0 && index > rightStart) {
                    seq += str1[i];
                    rightStart = index;
                }
            }
            if (seq.length > 1 && (!longest || seq.length > longest.length)) {
                longest = seq;
            }
        }
    }
    return longest;
}