package com.aira.xbrl.model.instance

import com.aira.xbrl.model.XbrlElement
import com.aira.xbrl.model.Namespace
import com.aira.xbrl.model.taxonomy.DataType
import com.aira.xbrl.model.taxonomy.Taxonomy
import com.aira.xbrl.model.Relationship
import com.aira.xbrl.model.taxonomy.Linkbase
import com.aira.xbrl.model.Link

object XbrlInstance{
  val name = "xbrl"
}

object FootnoteArc{
  val role = "http://www.xbrl.org/2003/arcrole/fact-footnote"
}

class FootnoteArc(fact:Fact[DataType], footnote:Footnote)
  extends Relationship[Fact[DataType], Footnote](fact, footnote, FootnoteArc.role){
  
  
}

class FootnoteLink extends Link[FootnoteArc]("http://www.xbrl.org/2003/role/link", "extended"){
  
  var footnotesByFact : Map[Fact[DataType], List[Footnote]] = _
}

class XbrlInstance()
    extends InstanceElement() {
  
  var taxonomies : List[Taxonomy] = _
  var linkbases : List[Linkbase] = _
  var contexts : List[Context] = _
  var units : List[Unit] = _
  var facts : List[Fact[DataType]] = _
  var footnotes : List[Footnote] = _
  
  var contextsById : Map[String, Context] = _
  var unitsById : Map[String, Unit] = _
  
  var footnoteLinks : List[FootnoteLink] = _
}