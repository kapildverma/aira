package com.aira.xbrl.model.instance

import java.time.LocalDateTime
import java.time.{Duration => jDuration}
import com.aira.xbrl.model.XbrlElement

object Period{
  val name="period"
}

abstract class Period()
    extends InstanceElement(){
  
}

object Instant{
  val name="instant"
}

case class Instant(instant: LocalDateTime) extends Period(){
  
}

object Duration{
  val name="duration"
}

case class Duration(start: LocalDateTime, end: LocalDateTime) extends Period(){
  
  def this(start: LocalDateTime, duration: jDuration) = this(start, start.plus(duration))
  
}

object Forever{
  val name="forever"
}

case class Forever() extends Period(){
  
}
