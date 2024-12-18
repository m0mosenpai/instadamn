package X;

import java.util.Map;

/* renamed from: X.DwB, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC31706DwB {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        InterfaceC103384lE interfaceC103384lE;
        InterfaceC103384lE interfaceC103384lE2;
        String str;
        String A0d = AbstractC31177DnL.A0d(c6fw);
        Object A02 = c6fw.A02();
        C14360o3.A0C(A02, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.Any, kotlin.Any>");
        Map map = (Map) A02;
        C102884kP A0F = AbstractC31175DnJ.A0F(c6fw, 2);
        if (A0F != null) {
            interfaceC103384lE = A0F.A09();
            interfaceC103384lE2 = A0F.A0A();
        } else {
            interfaceC103384lE = null;
            interfaceC103384lE2 = null;
        }
        Map A0B = U5E.A0B(c6fq, A0F, 40);
        C14360o3.A0C(A0B, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, java.lang.Object>");
        if (A0F == null || (str = A0F.A0I()) == null) {
            str = "current-screen";
        }
        C6BQ.A09(c6fq);
        C1GL A00 = AbstractC31705DwA.A00(C6BQ.A02(c6fq), C6BQ.A0C(c6fq), str, A0d);
        if (A00 == null) {
            return null;
        }
        AbstractC192798gL A022 = C192108fB.A02(null, C6BQ.A0B(c6fq), A0d, C6BQ.A0H(map));
        A022.A00(new C31707DwC(c6fq, interfaceC103384lE, interfaceC103384lE2, A0d, A0B));
        A00.schedule(A022);
        return null;
    }
}
