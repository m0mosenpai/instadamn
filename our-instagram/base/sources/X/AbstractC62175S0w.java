package X;

import android.os.Build;
import android.view.Window;

/* renamed from: X.S0w, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC62175S0w {
    public static final void A00(Window window, boolean z) {
        int i;
        int i2 = Build.VERSION.SDK_INT;
        if (z) {
            if (i2 >= 30) {
                window.getAttributes().layoutInDisplayCutoutMode = 1;
                window.setDecorFitsSystemWindows(false);
            }
            window.addFlags(1024);
            i = C3OO.FLAG_MOVED;
        } else {
            if (i2 >= 30) {
                window.getAttributes().layoutInDisplayCutoutMode = 0;
                window.setDecorFitsSystemWindows(true);
            }
            window.addFlags(C3OO.FLAG_MOVED);
            i = 1024;
        }
        window.clearFlags(i);
    }
}
