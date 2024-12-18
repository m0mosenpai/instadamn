package X;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;

/* loaded from: classes10.dex */
public abstract class S2J {
    public static boolean A00(Context context) {
        Display display;
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        if (displayManager == null || (display = displayManager.getDisplay(0)) == null || !display.isHdr()) {
            return false;
        }
        int[] supportedHdrTypes = display.getHdrCapabilities().getSupportedHdrTypes();
        for (int i : supportedHdrTypes) {
            if (i == 1) {
                return true;
            }
        }
        return false;
    }
}
