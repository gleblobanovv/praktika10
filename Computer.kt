open class Computer(var frequency1:Double,var operativka1:Int,var processor_name1:String):PC() {
    override var frequency_processor=frequency1
    override var operativka=operativka1
    override var processor_name=processor_name1

    override fun Q():Double{
        var Q=(0.1*frequency_processor)+operativka
        return Q
    }
    fun Input(){
        println("Введите наименование процессора")
        processor_name= readLine()!!.toString()
        println("Введите частоту процессора")
        frequency_processor= readLine()!!.toDouble()
        println("Введите объем оперативной памяти")
        operativka= readLine()!!.toInt()
    }

}