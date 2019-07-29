package com.aira.xbrl.model.taxonomy.types

abstract class Numeric extends DataType

abstract class Decimal extends Numeric

abstract class Float extends Numeric

abstract class Double extends Numeric

//DecimalItemType
abstract class DecimalItemType extends Decimal

object DecimalItemType{

}

//FloatItemType
abstract class FloatItemType extends Float

object FloatItemType{

}

//DoubleItemType
abstract class DoubleItemType extends Double

object DoubleItemType{

}

//Shares Types
abstract class SharesItemType extends Decimal

object SharesItemType{

}

//Monetary types
abstract class MonetaryItemType extends Decimal

object MonetaryItemType {

}

//Pure types
abstract class PureItemType extends Decimal

object PureItemType {

}

//Fraction
object FractionItemType extends Numeric{

}

abstract class Integer extends Numeric

object IntegerItemType extends Integer{

}

object PositiveIntegerItemType extends Integer{

}

object NonPositiveIntegerItemType extends Integer{

}

object NegativeIntegerItemType extends Integer{

}

object NonNegativeIntegerItemType extends Integer{

}

object IntItemType extends Integer{

}

object LongItemType extends Integer{

}

object ShortItemType extends Integer{

}

object ByteItemType extends Integer{

}

object UnsignedIntItemType extends Integer{

}

object UnsignedLongItemType extends Integer{

}

object UnsignedShortItemType extends Integer{

}

object UnsignedByteItemType extends Integer{

}
