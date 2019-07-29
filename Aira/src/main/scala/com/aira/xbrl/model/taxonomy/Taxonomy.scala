package com.aira.xbrl.model.taxonomy

import com.aira.xbrl.model.taxonomy.types.DataType

class Taxonomy {
  var concepts : List[Concept[DataType]] = _
  var linkbases : List[Linkbase] = _
}