package com.example.docs

import com.example.docs.internal.SomeHelper

/**
 * Documentation for subproject A
 */
class SubprojectA {

    val helper = SomeHelper()

    /**
     * @return "foo helped"
     */
    fun bar(): String = "foo " + helper.bar()
}