/* Copyright (c) 2011 Danish Maritime Authority.
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
package dk.dma.ais.packet;

/**
 * The enum Compare to operator.
 */
public enum CompareToOperator {
    /**
     * Equals compare to operator.
     */
    EQUALS("="),
    /**
     * Not equals compare to operator.
     */
    NOT_EQUALS("!="),
    /**
     * Less than compare to operator.
     */
    LESS_THAN("<"),
    /**
     * Less than or equals compare to operator.
     */
    LESS_THAN_OR_EQUALS("<="),
    /**
     * Greater than compare to operator.
     */
    GREATER_THAN(">"),
    /**
     * Greater than or equals compare to operator.
     */
    GREATER_THAN_OR_EQUALS(">=");

    private final String operator;

    CompareToOperator(String operator) {
        this.operator = operator;
    }

    /**
     * From string compare to operator.
     *
     * @param operator the operator
     * @return the compare to operator
     */
    static CompareToOperator fromString(String operator) {
        if ("=".equals(operator)) {
            return EQUALS;
        } else if ("!=".equals(operator)) {
            return NOT_EQUALS;
        } else if (">".equals(operator)) {
            return GREATER_THAN;
        } else if (">=".equals(operator)) {
            return GREATER_THAN_OR_EQUALS;
        } else if ("<".equals(operator)) {
            return LESS_THAN;
        } else if ("<=".equals(operator)) {
            return LESS_THAN_OR_EQUALS;
        } else {
            throw new IllegalArgumentException("Operator " + operator + " not implemented.");
        }
    }
}
