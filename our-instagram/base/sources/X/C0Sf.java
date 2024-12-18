package X;

import android.content.Context;

/* renamed from: X.0Sf, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C0Sf {
    /* JADX WARN: Type inference failed for: r2v0, types: [X.0di, java.lang.Object] */
    public static boolean A00(Context context, String str) {
        ?? obj = new Object();
        obj.A00 = context;
        try {
            boolean z = true;
            if (AbstractC05790Sg.A00(obj, str, 0) != 1) {
                z = false;
            }
            return z;
        } finally {
            AbstractC05790Sg.A02(obj, str);
        }
    }
}
