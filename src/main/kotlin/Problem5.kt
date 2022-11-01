class Solution5 {
    fun solution(money: Int): List<Int> {
        var N = money
        var list = listOf<Int>(50000,10000,5000,1000,500,100,50,10,1)
        var result = mutableListOf<Int>()

        for (i in list){
            result.add(N/i)
            N %= i
        }
        println(result)
        return result

    }
}
fun main() {
    Solution5().solution(50237)
    Solution5().solution(15000)

}