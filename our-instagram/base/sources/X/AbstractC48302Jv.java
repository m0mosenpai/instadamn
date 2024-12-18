package X;

import android.content.Context;

/* renamed from: X.2Jv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC48302Jv {
    public static C2Ju A00(Context context) {
        C2K0 c2k0;
        synchronized (AbstractC48312Jw.class) {
            c2k0 = AbstractC48312Jw.A00;
            if (c2k0 == null) {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext != null) {
                    context = applicationContext;
                }
                c2k0 = new C48342Jz(new C48322Jx(context));
                AbstractC48312Jw.A00 = c2k0;
            }
        }
        return (C2Ju) ((C48342Jz) c2k0).A00.FFc();
    }
}
