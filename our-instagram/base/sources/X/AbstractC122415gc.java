package X;

import android.content.Context;
import android.graphics.Typeface;
import java.util.List;

/* renamed from: X.5gc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC122415gc {
    public static AbstractC119845bi A00;
    public static AbstractC119845bi A01;
    public static AbstractC119845bi A02;

    public static final AbstractC119845bi A01(Context context, C5W5 c5w5) {
        AbstractC119845bi abstractC119845bi;
        C14360o3.A0B(context, 0);
        C1350369c c1350369c = null;
        if (!AbstractC14710oj.A08()) {
            return null;
        }
        if (!C14360o3.A0K(c5w5, C5W5.A03) && !C14360o3.A0K(c5w5, C5W5.A05)) {
            if (C14360o3.A0K(c5w5, C5W5.A01)) {
                abstractC119845bi = A00;
                if (abstractC119845bi == null) {
                    Typeface A022 = AbstractC15960qq.A00(context).A02(EnumC15950qp.A0p);
                    if (A022 != null) {
                        c1350369c = C69Y.A00(A022);
                    }
                    A00 = c1350369c;
                    return c1350369c;
                }
            } else {
                abstractC119845bi = A01;
                if (abstractC119845bi == null) {
                    Typeface A023 = AbstractC15960qq.A00(context).A02(EnumC15950qp.A0q);
                    if (A023 != null) {
                        c1350369c = C69Y.A00(A023);
                    }
                    A01 = c1350369c;
                    return c1350369c;
                }
            }
        } else {
            abstractC119845bi = A02;
            if (abstractC119845bi == null) {
                Typeface A024 = AbstractC15960qq.A00(context).A02(EnumC15950qp.A0r);
                if (A024 != null) {
                    c1350369c = C69Y.A00(A024);
                }
                A02 = c1350369c;
                return c1350369c;
            }
        }
        return abstractC119845bi;
    }

    public static final C5C8 A00(Context context, C5C8 c5c8, C118125Vw c118125Vw) {
        C14360o3.A0B(context, 0);
        C14360o3.A0B(c118125Vw, 2);
        if (!AbstractC14710oj.A08()) {
            return c5c8;
        }
        C6C7 c6c7 = new C6C7(16);
        c6c7.A05(c5c8);
        List<C127015of> list = c5c8.A03;
        if (list == null) {
            list = C16930sl.A00;
        }
        for (C127015of c127015of : list) {
            C5W3 c5w3 = (C5W3) c127015of.A02;
            C5W5 c5w5 = c5w3.A08;
            if (c5w5 == null) {
                c5w5 = c118125Vw.A02.A08;
            }
            AbstractC119845bi A012 = A01(context, c5w5);
            C5W2 c5w2 = c5w3.A0C;
            long ApK = c5w2.ApK();
            long j = c5w3.A01;
            C122165gC c122165gC = c5w3.A06;
            C122175gD c122175gD = c5w3.A07;
            String str = c5w3.A0E;
            long j2 = c5w3.A02;
            C122185gE c122185gE = c5w3.A0A;
            C122195gF c122195gF = c5w3.A0D;
            C114095Cv c114095Cv = c5w3.A09;
            long j3 = c5w3.A00;
            C122205gG c122205gG = c5w3.A0B;
            C122215gH c122215gH = c5w3.A03;
            AbstractC119825bg abstractC119825bg = c5w3.A04;
            long ApK2 = c5w2.ApK();
            long j4 = C1132359l.A01;
            if (ApK != ApK2) {
                c5w2 = C5W0.A00(ApK);
            }
            c6c7.A06(new C5W3(c122215gH, abstractC119825bg, A012, c122165gC, c122175gD, c5w5, c114095Cv, c122185gE, c122205gG, c5w2, c122195gF, str, j, j2, j3), c127015of.A01, c127015of.A00);
        }
        return c6c7.A02();
    }
}
