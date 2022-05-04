package com.functionalkotlin.custom;

import kotlinx.serialization.Serializable

@Serializable
sealed class SumTypes

@Serializable
data class Name(val value: String) : SumTypes()
@Serializable
data class Description(val value: String) : SumTypes()
