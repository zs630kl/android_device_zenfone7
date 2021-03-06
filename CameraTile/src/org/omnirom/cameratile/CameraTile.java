/*
 * Copyright (C) 2019 The LineageOS Project
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
package org.omnirom.cameratile;

import android.content.Intent;
import android.graphics.drawable.Icon;
import android.service.quicksettings.Tile;
import android.service.quicksettings.TileService;

public class CameraTile extends TileService {

    @Override
    public void onStartListening() {
        super.onStartListening();

        getQsTile().setIcon(Icon.createWithResource(this, R.drawable.ic_camera));
        getQsTile().setState(Tile.STATE_ACTIVE);
        getQsTile().updateTile();
    }

    @Override
    public void onClick() {
        super.onClick();

        Intent intent = new Intent("com.asus.motorservice.action.WIDGET_BTN_CLICKED");
        intent.setPackage("com.asus.motorservice");
        sendBroadcast(intent);
    }
}
