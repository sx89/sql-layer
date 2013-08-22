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

package com.foundationdb.server.expression.std;

import com.foundationdb.server.expression.ExpressionEvaluation;
import com.foundationdb.server.types.ValueSource;

import java.util.List;

public abstract class AbstractTwoArgExpressionEvaluation extends AbstractCompositeExpressionEvaluation {

    public ExpressionEvaluation leftEvaluation() {
        return children().get(0);
    }

    protected final ValueSource left() {
        return leftEvaluation().eval();
    }

    public ExpressionEvaluation rightEvaluation() {
        return children().get(1);
    }

    protected final ValueSource right() {
        return rightEvaluation().eval();
    }

    protected AbstractTwoArgExpressionEvaluation(List<? extends ExpressionEvaluation> children) {
        super(children);
        if (children().size() != 2) {
            throw new IllegalArgumentException("required 2 children, but saw" + children().size());
        }
    }
}