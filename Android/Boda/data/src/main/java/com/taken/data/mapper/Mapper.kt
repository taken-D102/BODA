package com.taken.data.mapper

interface Mapper<I, O> {

    fun map(input: I): O
}