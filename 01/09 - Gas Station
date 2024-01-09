





//-----------------------------Time Limit exceeded solution

// class Solution {
//     public int canCompleteCircuit(int[] gas, int[] cost) {
//         int success = -1;
//         for(int i=0;i<gas.length;i++){
//             if(gas[i]>=cost[i]){
//                 int currFuel = gas[i];
//                 int j = (i == gas.length-1) ? 0 : i+1;
//                 currFuel = currFuel - cost[i] + gas[j];
//                 System.out.println(currFuel);
//                 while(currFuel>=cost[j]){
//                     if(j==i){
//                         success = i;
//                         break;
//                     }
//                     currFuel = currFuel - cost[j];
//                     j = (j == gas.length-1) ? 0 : j+1;
//                     currFuel = currFuel + gas[j];
//                 }
//             }
//             if(success!=-1){
//                 break;
//             }
//         }
//         return success;
//     }
// }
