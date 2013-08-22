/**
 * Copyright (C) 2009-2013 FoundationDB, LLC
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.foundationdb.server.types.util;

import com.foundationdb.server.types.AbstractValueSource;
import com.foundationdb.server.types.AkType;
import com.foundationdb.server.types.ValueSource;
import com.foundationdb.server.types.ValueSourceIsNullException;

public final class BoolValueSource extends AbstractValueSource {

    // BoolValueSource class interface

    public static final ValueSource OF_TRUE = new BoolValueSource(true);
    public static final ValueSource OF_FALSE = new BoolValueSource(false);
    public static final ValueSource OF_NULL = new BoolValueSource(null);

    public static ValueSource of(Boolean value) {
        return value == null ? OF_NULL : of(value.booleanValue());
    }

    public static ValueSource of(boolean value) {
        return value ? OF_TRUE : OF_FALSE;
    }

    // ValueSource interface

    @Override
    public boolean getBool() {
        if (value == null)
            throw new ValueSourceIsNullException();
        return value;
    }

    @Override
    public boolean isNull() {
        return value == null;
    }

    @Override
    public AkType getConversionType() {
        return AkType.BOOL;
    }

    // object interface

    @Override
    public String toString() {
        return toString;
    }

    // for use in this class

    private BoolValueSource(Boolean value) {
        this.value = value;
        this.toString = "BoolValueSource(" + value + ")";
    }

    // object state
    private final Boolean value;
    private final String toString;
}