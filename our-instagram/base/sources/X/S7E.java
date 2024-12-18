package X;

import android.os.Build;

/* loaded from: classes10.dex */
public abstract class S7E {
    public static final int A00;

    static {
        A00 = Build.VERSION.SDK_INT >= 31 ? 33554432 : 0;
    }
}
