package X;

import java.util.concurrent.TimeUnit;

/* renamed from: X.U6w, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC66276U6w {
    public static final Object A00(C6FW c6fw) {
        int A0D = AbstractC25230BEn.A0D(c6fw.A01(), "null cannot be cast to non-null type kotlin.Number");
        Object A02 = c6fw.A02();
        C14360o3.A0C(A02, "null cannot be cast to non-null type kotlin.String");
        Object A00 = c6fw.A00();
        C14360o3.A0C(A00, "null cannot be cast to non-null type kotlin.String");
        String str = (String) A00;
        int A0D2 = AbstractC25230BEn.A0D(c6fw.A03(3), "null cannot be cast to non-null type kotlin.Number");
        C14360o3.A0B(str, 2);
        InterfaceC72008XEw A002 = U4N.A00((String) A02, A0D);
        if (A002 != null) {
            A002.AA2(str, TimeUnit.SECONDS, A0D2);
            return null;
        }
        return null;
    }
}
