package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;

/* loaded from: classes8.dex */
public final class KWK extends C32891hD {
    public final C47359Kw8 A00;

    @Override // X.C32891hD, X.InterfaceC29451bM
    public final void EHt(C1OW c1ow, boolean z) {
        C14360o3.A0B(c1ow, 0);
        C33151hd c33151hd = (C33151hd) c1ow;
        C47359Kw8 c47359Kw8 = this.A00;
        DirectThreadKey C7Q = c33151hd.C7Q();
        C14360o3.A07(C7Q);
        boolean z2 = c33151hd.A03;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c47359Kw8.A00, "new_poll_submit_success");
        C0Zx c0Zx = new C0Zx();
        String A07 = JRE.A07(C7Q);
        if (A07 != null) {
            AbstractC43594JPz.A1F(c0Zx, A07, z2);
            AbstractC43592JPx.A1L(A0f, c0Zx);
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.C32891hD, X.InterfaceC29451bM
    public final void EHu(C19260xA c19260xA, C1OW c1ow, C114675Fx c114675Fx, boolean z, boolean z2) {
        AbstractC25233BEq.A0w(0, c1ow, c114675Fx, c19260xA);
        if (!z) {
            C33151hd c33151hd = (C33151hd) c1ow;
            C47359Kw8 c47359Kw8 = this.A00;
            DirectThreadKey C7Q = c33151hd.C7Q();
            C14360o3.A07(C7Q);
            boolean z3 = c33151hd.A03;
            String str = c114675Fx.A04;
            if (str == null) {
                str = "";
            }
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c47359Kw8.A00, "new_poll_submit_error");
            C0Zx c0Zx = new C0Zx();
            String A07 = JRE.A07(C7Q);
            if (A07 != null) {
                AbstractC43594JPz.A1F(c0Zx, A07, z3);
                c0Zx.A06("exception_message", str);
                AbstractC43592JPx.A1L(A0f, c0Zx);
                return;
            }
            throw AbstractC166997dE.A0g();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KWK(InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        super(AbstractC11060iN.A00(userSession), interfaceC11380iw, "direct_mutation_waterfall");
        C14360o3.A0B(userSession, 1);
        this.A00 = new C47359Kw8(interfaceC11380iw, userSession);
    }
}
