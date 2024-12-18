package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.GoM, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38033GoM implements C2u2 {
    public final /* synthetic */ C37432GeC A00;

    public C38033GoM(C37432GeC c37432GeC) {
        this.A00 = c37432GeC;
    }

    @Override // X.C2u2
    public final /* bridge */ /* synthetic */ void DNT(Object obj, int i, int i2) {
        C38321qM A0H = AbstractC37301Gc2.A0H(obj);
        C37432GeC c37432GeC = this.A00;
        UserSession userSession = c37432GeC.A05;
        C5SE c5se = new C5SE(userSession, A0H);
        InterfaceC60442pS interfaceC60442pS = c37432GeC.A09;
        C32U.A0N(userSession, c5se, A0H, interfaceC60442pS, C05F.A01, "delivery");
        if (!C5SG.A00(userSession, A0H) && !AbstractC61652rS.A08(userSession, AbstractC23021Ah.A00(userSession))) {
            C32U.A0O(userSession, c5se, A0H, interfaceC60442pS, Integer.valueOf(A0H.A0n()), "duplicate_ad_received", A0H.A2w(), AbstractC166987dD.A1J("duplicate_ad_inserted"), AbstractC166987dD.A1J("duplicate_ad_received"));
        }
    }
}
