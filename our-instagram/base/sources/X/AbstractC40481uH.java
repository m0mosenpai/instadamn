package X;

import android.content.Context;

/* renamed from: X.1uH, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC40481uH {
    public static AbstractC40481uH A00;

    public abstract long A01(int i);

    public abstract void A02(C40401u8 c40401u8, String str, int i, long j, long j2);

    public static synchronized AbstractC40481uH A00(Context context) {
        AbstractC40481uH abstractC40481uH;
        synchronized (AbstractC40481uH.class) {
            abstractC40481uH = A00;
            if (abstractC40481uH == null) {
                abstractC40481uH = new C88603xK(context);
                A00 = abstractC40481uH;
            }
        }
        return abstractC40481uH;
    }
}
