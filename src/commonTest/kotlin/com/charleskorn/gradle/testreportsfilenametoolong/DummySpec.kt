package com.charleskorn.gradle.testreportsfilenametoolong

import io.kotest.core.spec.style.ShouldSpec
import io.kotest.matchers.shouldBe

class DummySpec : ShouldSpec({
    context("a very, very, very long context name") {
        context("nested in another very, very, very long context name") {
            context("nested in yet another very, very, very long context name") {
                context("with another another very, very, very long context name") {
                    should("be able to do the thing with a very, very, very long context name") {
                        1 + 1 shouldBe 2
                    }
                }
            }
        }
    }
})
