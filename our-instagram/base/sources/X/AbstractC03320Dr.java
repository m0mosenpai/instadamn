package X;

import android.os.Build;

/* renamed from: X.0Dr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC03320Dr {
    public static final boolean A00;

    static {
        boolean z = false;
        if (Build.VERSION.SDK_INT <= 30) {
            z = true;
        }
        A00 = z;
    }
}
