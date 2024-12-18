package X;

import android.os.Build;

/* renamed from: X.46x, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C46x {
    public static final C46y A00;

    static {
        C46y c46y;
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            c46y = null;
        } else if (i >= 32) {
            c46y = A41.A00;
        } else if (i >= 31) {
            c46y = AbstractC110334y4.A00;
        } else if (i >= 30) {
            c46y = AbstractC104584nO.A00;
        } else if (i >= 29) {
            c46y = AbstractC107804tP.A00;
        } else {
            c46y = A40.A00;
        }
        A00 = c46y;
    }
}
