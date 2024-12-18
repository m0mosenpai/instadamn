package X;

import android.graphics.Shader;

/* renamed from: X.6L5, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C6L5 {
    public static final C6L6 A00 = new Object();

    public final void A00(C5AO c5ao, float f, long j) {
        long A02;
        if (this instanceof C62Y) {
            C62Y c62y = (C62Y) this;
            Shader shader = c62y.A01;
            if (shader == null || c62y.A00 != j) {
                if (C5YC.A04(j)) {
                    c62y.A01 = null;
                    c62y.A00 = 9205357640488583168L;
                    shader = null;
                } else {
                    shader = c62y.A01(j);
                    c62y.A01 = shader;
                    c62y.A00 = j;
                }
            }
            C5AN c5an = (C5AN) c5ao;
            long color = c5an.A01.getColor() << 32;
            long j2 = C1132359l.A01;
            if (color != j2) {
                c5ao.ERg(j2);
            }
            if (!C14360o3.A0K(c5an.A02, shader)) {
                c5an.A02 = shader;
                c5an.A01.setShader(shader);
            }
            if (c5an.A01.getAlpha() / 255.0f != f) {
                c5ao.EPa(f);
                return;
            }
            return;
        }
        C6L4 c6l4 = (C6L4) this;
        c5ao.EPa(1.0f);
        if (f == 1.0f) {
            A02 = c6l4.A00;
        } else {
            long j3 = c6l4.A00;
            A02 = C5AC.A02(AbstractC1132459m.A0K[(int) (j3 & 63)], C1132359l.A03(j3), C1132359l.A02(j3), C1132359l.A01(j3), C1132359l.A00(j3) * f);
        }
        c5ao.ERg(A02);
        C5AN c5an2 = (C5AN) c5ao;
        if (c5an2.A02 == null) {
            return;
        }
        c5an2.A02 = null;
        c5an2.A01.setShader(null);
    }
}
