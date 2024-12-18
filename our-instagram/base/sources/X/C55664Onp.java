package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Onp, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55664Onp implements InterfaceC48192Ji {
    public final int A00;
    public final Object A01;
    public final boolean A02;

    public C55664Onp(int i, Object obj, boolean z) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = z;
    }

    @Override // X.InterfaceC48192Ji
    public final void invoke(AnonymousClass436 anonymousClass436) {
        C2JS c2js;
        Object value;
        C59228Qb0 c59228Qb0;
        if (this.A00 != 0) {
            C31588DuG c31588DuG = (C31588DuG) this.A01;
            PZW.A01(c31588DuG, ((C4A7) c31588DuG).A01, 47, this.A02);
            ((C006802i) AbstractC166987dD.A17(c31588DuG.A01)).markerEnd(834877734, (short) 2);
            return;
        }
        UserSession userSession = (UserSession) this.A01;
        C173467ny A00 = AbstractC173457nx.A00(userSession);
        if (anonymousClass436 != null) {
            c2js = AbstractC25225BEi.A0k(anonymousClass436);
        } else {
            c2js = null;
        }
        boolean z = this.A02;
        if (c2js != null) {
            C05A c05a = A00.A01;
            do {
                value = c05a.getValue();
                c59228Qb0 = (C59228Qb0) c2js.A05(C59228Qb0.class, "xdt_set_text_post_app_onboarding(request_data:$data)", -1800118107);
                C14360o3.A07(c59228Qb0);
            } while (!c05a.AIi(value, new C56374P1j(c59228Qb0, z)));
        }
        AbstractC25651Mw.A00(userSession).E4s(new C55984OtH(C05F.A01));
    }
}
