class Frequency_Vinchester(var P:Double) {


    override fun Qp():Double{
        println("Введите объем винчестера (Гб)")
        p= readLine()!!.toDouble()
        var Qp=0.0
        Qp=Q+(0.5*P)
        return  Qp
    }

}