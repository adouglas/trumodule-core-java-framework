
/*
 * // The MIT License
 * //
 * // Copyright (c) 2017 TruRating Ltd. https://www.trurating.com
 * //
 * // Permission is hereby granted, free of charge, to any person obtaining a copy
 * // of this software and associated documentation files (the "Software"), to deal
 * // in the Software without restriction, including without limitation the rights
 * // to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * // copies of the Software, and to permit persons to whom the Software is
 * // furnished to do so, subject to the following conditions:
 * //
 * // The above copyright notice and this permission notice shall be included in
 * // all copies or substantial portions of the Software.
 * //
 * // THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * // IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * // FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * // AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * // LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * // OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * // THE SOFTWARE.
 */

package com.trurating.trumodule;

import com.trurating.service.v210.xml.RequestTransaction;
import com.trurating.service.v210.xml.Response;

public interface ITruModuleStandalone {
    /**
     * Do rating string.
     *
     * @param merchantId the merchant id
     * @param terminalId the terminal id
     * @return the string
     */
    String doRating(String merchantId, String terminalId);

    /**
     * Cancel rating.
     */
    @SuppressWarnings("WeakerAccess,unused")
    void cancelRating();

    /**
     * Send transaction response.
     *
     * @param merchantId         the merchant id
     * @param terminalId         the terminal id
     * @param requestTransaction the request transaction
     * @return the response
     */
    Response sendTransaction(String merchantId, String terminalId, RequestTransaction requestTransaction);
}
