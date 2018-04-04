/*
 * Copyright (C) 2018 Olmo Gallegos Hernández.
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
package es.voghdev.prjdagger2.global;

import android.content.Context;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import es.voghdev.prjdagger2.ui.activity.DetailActivity;

public class AndroidResLocator implements ResLocator {

    Context context;

    public AndroidResLocator(DetailActivity context){
        context = context;
    }

    @Override
    public String getString(int resID) {
        return context.getString(resID);
    }

    @Override
    public List<String> getStringArray(int resID) {
        return (Arrays.asList(context.getResources().getStringArray(resID)).isEmpty()) ?
                Collections.<String>emptyList() :
                Arrays.asList(context.getResources().getStringArray(resID));
    }
}