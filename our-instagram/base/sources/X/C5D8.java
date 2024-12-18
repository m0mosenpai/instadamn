package X;

import android.content.Context;
import android.os.Build;

/* renamed from: X.5D8, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C5D8 {
    public static final int A00(Context context) {
        if (Build.VERSION.SDK_INT >= 31) {
            return C5D9.A00(context);
        }
        return 0;
    }
}
