/*
 * (c) Copyright 2021 Palantir Technologies Inc. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.palantir.conjure.java.undertow.processor.sample;

import com.palantir.conjure.java.undertow.annotations.Handle;
import com.palantir.conjure.java.undertow.annotations.Handle.QueryParam;
import com.palantir.conjure.java.undertow.annotations.HttpMethod;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;

public interface OptionalPrimitives {

    @Handle(method = HttpMethod.GET, path = "/integer")
    void integers(@QueryParam("one") OptionalInt one, @QueryParam("two") Optional<Integer> two);

    @Handle(method = HttpMethod.GET, path = "/double")
    void doubles(@QueryParam("one") OptionalDouble one, @QueryParam("two") Optional<Double> two);

    @Handle(method = HttpMethod.GET, path = "/long")
    void longs(@QueryParam("one") OptionalLong one, @QueryParam("two") Optional<Long> two);
}
