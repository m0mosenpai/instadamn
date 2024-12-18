package X;

import android.content.Context;

/* renamed from: X.1JI, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1JI {
    public Context A00;
    public final C1J4 A01;

    public final void A00(int i, int i2) {
        C1JB A07 = this.A01.A07(i);
        for (C2050395s c2050395s : A07.A07) {
            java.util.Set set = c2050395s.A02;
            if (set == null || !set.contains(Integer.valueOf(i2))) {
                InterfaceC219914z A00 = C1JB.A00(A07, c2050395s);
                try {
                    if (A00.EE7(false)) {
                        A07.A05.A00(A00, A07.A01, i2, false);
                    }
                } catch (Error | Exception e) {
                    AnonymousClass155 anonymousClass155 = A07.A06;
                    anonymousClass155.A04(A00, e);
                    anonymousClass155.A03(A00);
                }
            }
        }
    }

    public C1JI(Context context, C1J4 c1j4) {
        this.A01 = c1j4;
        Context applicationContext = context.getApplicationContext();
        this.A00 = applicationContext;
        c1j4.A06.A00(applicationContext);
    }
}
