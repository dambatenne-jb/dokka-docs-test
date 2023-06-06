package com.example.docs

abstract class SubprojectBSuper {

    /**
     * @return Hello string specific for the implementation
     */
    protected abstract fun getHello(): String
}

/**
 * Documentation for subproject B
 */
class SubprojectB: SubprojectBSuper() {

    /**
     * This is a function.
     */
    fun foo(): String = getHello() + " bar"

    /**
     * This is a helper function.
     */
    override fun getHello(): String = "Hello"
}