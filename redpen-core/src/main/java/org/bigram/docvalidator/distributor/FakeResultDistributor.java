/**
 * redpen: a text inspection tool
 * Copyright (C) 2014 Recruit Technologies Co., Ltd. and contributors
 * (see CONTRIBUTORS.md)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.bigram.docvalidator.distributor;

import org.bigram.docvalidator.ValidationError;
import org.bigram.docvalidator.formatter.Formatter;

/**
 * FakeResultDistributor does nothing. this class is just for testing.
 */
public class FakeResultDistributor implements ResultDistributor {
  /**
   * Constructor.
   */
  public FakeResultDistributor() {
    super();
  }

  @Override
  public int flushResult(ValidationError err) {
    return 0;
  }

  @Override
  public void setFormatter(Formatter formatter) { }

  @Override
  public void flushHeader() { }

  @Override
  public void flushFooter() { }
}