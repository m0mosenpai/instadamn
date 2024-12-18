package com.facebook.browser.helium.util.voltron;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import java.io.IOException;

/* loaded from: classes.dex */
public class HeliumVoltronHelper {
    public static AssetFileDescriptor getChildDexFd(Context context) {
        try {
            return context.getAssets().openFd("helium_child.dex.force-store");
        } catch (IOException unused) {
            return context.getAssets().openFd("heliumiab/helium_child.dex.force-store");
        }
    }
}
