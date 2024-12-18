package X;

import android.content.Context;

/* renamed from: X.1U4, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1U4 {
    public static final C1U4 A00 = new Object();
    public static volatile C1UI A01;

    public static final C1UI A00(Context context) {
        C14360o3.A0B(context, 0);
        C1UI c1ui = A01;
        if (c1ui == null) {
            synchronized (A00) {
                c1ui = A01;
                if (c1ui == null) {
                    c1ui = new C1U5(context.getApplicationContext()).A00();
                    A01 = c1ui;
                }
            }
        }
        return c1ui;
    }
}
