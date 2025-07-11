/*
  Copyright 2025 Jose Morales contact@josdem.io

  Licensed under the Apache License, Version 2.0 (the "License");
  you may not use this file except in compliance with the License.
  You may obtain a copy of the License at

  http://www.apache.org/licenses/LICENSE-2.0

  Unless required by applicable law or agreed to in writing, software
  distributed under the License is distributed on an "AS IS" BASIS,
  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
  See the License for the specific language governing permissions and
  limitations under the License.
*/

package com.josdem.gmail.helper

import org.junit.jupiter.api.Assertions.assertNotNull
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInfo
import org.mockito.Mock
import org.mockito.MockitoAnnotations
import org.slf4j.LoggerFactory
import java.util.Properties

internal class SessionHelperTest {

    @Mock
    private lateinit var properties: Properties

    private val sessionHelper = SessionHelper()

    @BeforeEach
    fun setup() {
        MockitoAnnotations.openMocks(this)
    }

    private val log = LoggerFactory.getLogger(this::class.java)

    @Test
    fun `should create session`(testInfo: TestInfo) {
        log.info(testInfo.displayName)
        assertNotNull(sessionHelper.createSession(properties))
    }
}
