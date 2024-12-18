package X;

import android.os.Build;

/* renamed from: X.CLm, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC27745CLm {
    public static final boolean A00;

    static {
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 34) {
            z = true;
        }
        A00 = z;
    }
}
