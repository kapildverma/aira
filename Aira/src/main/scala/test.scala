import com.aira.xbrl.model.taxonomy.DataType
import com.aira.xbrl.model.instance.Fact
import com.aira.xbrl.util.Preamble._
import com.aira.xbrl.model.taxonomy.Concept
import com.aira.xbrl.model.instance.FactValue
import com.aira.xbrl.model.instance.Tuple

class StringDataType extends DataType{
  
}

class StringValue(_value:String) extends FactValue[StringDataType]{
  val value = _value
}

class IntDataType extends DataType{
  
}

class IntValue(_value : Int) extends FactValue[IntDataType]{
  val value = _value
}


object Test{
  
  def main(args : Array[String])={
    val intType = new IntDataType()
    val stringType = new StringDataType()
    
    
    var list = List[DataType](intType, stringType)
    
    val stringConcept = new Concept[StringDataType]("StringConcept", "testnamespace")
    
    val intConcept = new Concept[IntDataType]("IntConcept", "testnamespace")
    
    val stringFact = Concept.newFact(new StringValue("testFact"), stringConcept, null, null, "1")
    
    val intFact = Concept.newFact(new IntValue(10), intConcept, null, null, "2")
    
    val facts = List[Fact[DataType]](intFact, stringFact)
    
    val tuple = new Tuple(facts)
  }
}