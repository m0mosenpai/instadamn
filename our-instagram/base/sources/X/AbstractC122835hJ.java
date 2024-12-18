package X;

import android.os.Build;

/* renamed from: X.5hJ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC122835hJ {
    public static final int A00(int i) {
        if (i == 2) {
            if (Build.VERSION.SDK_INT > 32) {
                return 4;
            }
            return 2;
        }
        return 0;
    }
}
