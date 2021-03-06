/*
  Copyright (c) 2012, 2020, Anatole Tresch, Werner Keil and others by the @author tag.

  Licensed under the Apache License, Version 2.0 (the "License"); you may not
  use this file except in compliance with the License. You may obtain a copy of
  the License at

  http://www.apache.org/licenses/LICENSE-2.0

  Unless required by applicable law or agreed to in writing, software
  distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
  WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
  License for the specific language governing permissions and limitations under
  the License.
 */
package org.javamoney.moneta.spi;

import java.util.Objects;

import javax.money.CurrencyUnit;
import javax.money.MonetaryAmount;

import org.javamoney.moneta.FastMoney;

/**
 * The implementation of {@link MonetaryAmountProducer} that creates {@link MonetaryAmount}
 * using {@link FastMoney} implementation.
 * @author Otavio Santana
 */
public final class FastMoneyProducer implements MonetaryAmountProducer {

	@Override
	public MonetaryAmount create(CurrencyUnit currency, Number number) {
		return FastMoney.of(Objects.requireNonNull(number), Objects.requireNonNull(currency));
	}

}
