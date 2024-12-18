package X;

import java.util.List;

/* loaded from: classes11.dex */
public abstract class U4O {
    /* JADX WARN: Type inference failed for: r5v0, types: [X.4kP, X.4kO] */
    public static final C102874kO A00(C6FQ c6fq, C6FW c6fw) {
        int A0D = AbstractC25230BEn.A0D(c6fw.A01(), "null cannot be cast to non-null type kotlin.Int");
        List list = c6fw.A00;
        ?? c102884kP = new C102884kP(c6fq.A0D, A0D, list.size() / 2);
        C17v A0B = C17s.A0B(C17s.A0C(1, list.size()), 2);
        int i = A0B.A00;
        int i2 = A0B.A01;
        int i3 = A0B.A02;
        if (i3 <= 0 ? !(i3 >= 0 || i2 > i) : i <= i2) {
            while (true) {
                Object A03 = c6fw.A03(i);
                C14360o3.A0C(A03, "null cannot be cast to non-null type kotlin.Int");
                c102884kP.A0Q(((Number) A03).intValue(), list.get(i + 1));
                if (i == i2) {
                    break;
                }
                i += i3;
            }
        }
        c102884kP.A0P();
        return c102884kP;
    }
}
