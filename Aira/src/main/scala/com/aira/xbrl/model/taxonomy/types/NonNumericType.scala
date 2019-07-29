package com.aira.xbrl.model.taxonomy.types

abstract class NonNumericType extends DataType

abstract class StringItemType extends NonNumericType

object StringItemType{

}

object BooleanItemType extends NonNumericType{

}

object HexBinaryItemType extends NonNumericType{

}

object Base64BinaryItemType extends NonNumericType{

}

object AnyURIItemType extends NonNumericType{

}

object QNameItemType extends NonNumericType{

}

object NormalizedStringItemType extends StringItemType{

}

object TokenItemType extends StringItemType{

}

object LanguageItemType extends StringItemType{

}

object NameItemType extends StringItemType{

}

object NCNameItemType extends StringItemType{

}