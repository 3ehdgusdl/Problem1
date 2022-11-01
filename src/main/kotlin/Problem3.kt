//number 매개변수 3,6,9 해당 숫자 cnt++

class Solution3 {
    fun solution(number: Int): Int {
     var cntRes = 0

        for (i in 1 .. number){
            var Clap = i

            while (Clap != 0){
                if ((Clap%10)%3 == 0 && (Clap%10) != 0){
                    cntRes++
                }
                Clap /= 10
            }

        }
        println(cntRes)

        return cntRes
    }
}




fun main() {
    Solution3().solution(14)
    Solution3().solution(33)

}