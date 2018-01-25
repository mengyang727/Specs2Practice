abstract class PatternMatchExample

case class Student( name:String, age:Int, studentNo:Int) extends PatternMatchExample

case class Teacher( name:String, age:Int, teacherNo:Int) extends PatternMatchExample

case class Nobody( name:String) extends PatternMatchExample

//SchoolClass为接受多个Person类型参数的类
case class SchoolClass(classDescription:String,persons:PatternMatchExample*)

//下列代码给出的是其模式匹配应用示例
object CaseClassDemo{
  def main(args: Array[String]): Unit = {
    val sc=SchoolClass("学途无忧网Scala培训班",Teacher("摇摆少年梦",27,2015),Student("摇摆少年梦",27,2015))
    sc match{
      case SchoolClass(_,_,Student(name,age,studetNo))=>println(name)
      case _ => println("Nobody")
    }
  }
}