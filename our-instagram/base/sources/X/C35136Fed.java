package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Fed, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35136Fed {
    public static final C35136Fed A00 = new Object();

    public static final Object A00(C6FQ c6fq, String str, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16660sJ interfaceC16660sJ) {
        C14360o3.A0B(str, 1);
        UserSession A0S = AbstractC31177DnL.A0S(c6fq);
        if (!AbstractC31171DnF.A1V(A0S, str)) {
            interfaceC16820sZ.invoke();
            return null;
        }
        C1GL A0C = C6BQ.A0C(c6fq);
        C25621Ms A0c = AbstractC167017dG.A0c(A0S);
        A0c.A0B("fxcal/get_native_linking_auth_blob/");
        C1ON A0e = AbstractC25227BEk.A0e(A0c, C32157EBe.class, FVO.class);
        C31456Ds0.A00(A0e, interfaceC16820sZ, interfaceC16660sJ, 3);
        A0C.schedule(A0e);
        return null;
    }

    public final Object A01(C6FQ c6fq, C6FW c6fw) {
        String A0d = AbstractC31177DnL.A0d(c6fw);
        InterfaceC103384lE A0G = AbstractC31175DnJ.A0G(c6fw);
        return A00(c6fq, A0d, new MHW(c6fq, A0G, 40), new C50369MLw(c6fq, A0G, 14));
    }
}
