/*
 * Copyright (C) 2020 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.android.libraries.car.app.samples.places;

import android.content.Intent;
import androidx.annotation.NonNull;
import com.google.android.libraries.car.app.CarAppService;
import com.google.android.libraries.car.app.Screen;

/**
 * Entry point for the app.
 *
 * <p>{@link CarAppService} is the main interface between the app and Android Auto. For more
 * details, see the <a href="https://developer.android.com/training/cars/navigation">Android for
 * Cars Library developer guide</a>.
 */
public class PlacesCarAppService extends CarAppService {
  @NonNull
  @Override
  public Screen onCreateScreen(@NonNull Intent intent) {
    return PlaceCategoryListScreen.create(getCarContext());
  }
}