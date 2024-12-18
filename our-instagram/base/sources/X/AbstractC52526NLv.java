package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;

/* renamed from: X.NLv, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC52526NLv extends C31253Dob {
    public C140626Xq A00;
    public final AbstractC60672pq A01;
    public final UserSession A02;
    public final C3G2 A03;
    public final C38E A04;
    public final String A05;
    public final String A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC52526NLv(AbstractC60672pq abstractC60672pq, InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        super(abstractC60672pq.requireActivity(), interfaceC11380iw, userSession);
        C14360o3.A0B(userSession, 3);
        this.A01 = abstractC60672pq;
        this.A02 = userSession;
        this.A03 = C3G2.A0l;
        this.A06 = AbstractC167017dG.A0j();
        this.A05 = AbstractC167017dG.A0j();
        this.A04 = new C38E(abstractC60672pq, userSession, new C38C(abstractC60672pq));
    }

    public void A02() {
    }

    @Override // X.C31253Dob, X.InterfaceC37216GaR
    public final void Ddq(C34644FOb c34644FOb, String str, int i) {
        UserSession userSession = this.A02;
        Reel A0R = MSY.A0R(userSession, str);
        if (A0R != null) {
            C140626Xq c140626Xq = this.A00;
            if (c140626Xq != null) {
                if (c140626Xq.A07 && C14360o3.A0K(c140626Xq.A0D, A0R)) {
                    return;
                } else {
                    c140626Xq.A05(C05F.A0Y);
                }
            }
            AbstractC60672pq abstractC60672pq = this.A01;
            C140626Xq A03 = C1OU.A03(abstractC60672pq.requireContext(), userSession, A0R, new C6X7(new P8O(0, this, c34644FOb, A0R), c34644FOb.A0F, A0R.A1P), AbstractC82003lM.A00(userSession), abstractC60672pq.getModuleName(), -1);
            A03.A04();
            this.A00 = A03;
            c34644FOb.A01 = A03;
        }
    }
}
