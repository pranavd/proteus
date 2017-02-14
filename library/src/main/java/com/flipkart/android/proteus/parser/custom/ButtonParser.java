/*
 * Apache License
 * Version 2.0, January 2004
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * TERMS AND CONDITIONS FOR USE, REPRODUCTION, AND DISTRIBUTION
 *
 * Copyright (c) 2017 Flipkart Internet Pvt. Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use
 * this file except in compliance with the License. You may obtain a copy of the
 * License at http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed
 * under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */

package com.flipkart.android.proteus.parser.custom;


import android.view.ViewGroup;
import android.widget.Button;

import com.flipkart.android.proteus.value.Layout;
import com.flipkart.android.proteus.ProteusLayoutInflater;
import com.flipkart.android.proteus.ProteusView;
import com.flipkart.android.proteus.ViewTypeParser;
import com.flipkart.android.proteus.toolbox.Styles;
import com.flipkart.android.proteus.view.ProteusButton;
import com.google.gson.JsonObject;

/**
 * Created by kiran.kumar on 12/05/14.
 */
public class ButtonParser<T extends Button> extends ViewTypeParser<T> {

    @Override
    public ProteusView createView(ProteusLayoutInflater.Internal inflater, Layout layout, JsonObject data, ViewGroup parent, Styles styles, int index) {
        return new ProteusButton(parent.getContext());
    }

    @Override
    protected void addAttributeProcessors() {
    }
}
