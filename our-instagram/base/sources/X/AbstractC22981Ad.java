package X;

import android.os.Build;

/* renamed from: X.1Ad, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC22981Ad {
    public static final boolean A00;

    static {
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 31) {
            z = true;
        }
        A00 = z;
    }
}
