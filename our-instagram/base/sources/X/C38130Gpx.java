package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Gpx, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38130Gpx implements InterfaceC62702t9 {
    public final UserSession A00;
    public final boolean A01;

    @Override // X.InterfaceC62702t9
    public final String BKe(C59062n7 c59062n7) {
        C14360o3.A0B(c59062n7, 0);
        AbstractC127945qN abstractC127945qN = (AbstractC127945qN) c59062n7.A03;
        if (this.A01 && (abstractC127945qN instanceof C37931GmT)) {
            C37931GmT c37931GmT = (C37931GmT) abstractC127945qN;
            return AnonymousClass001.A0R(Integer.toHexString(AbstractC31177DnL.A04(AbstractC41071vF.A0F(this.A00, c37931GmT.BQN()))), c37931GmT.getKey());
        }
        return abstractC127945qN.getKey();
    }

    public C38130Gpx(UserSession userSession) {
        this.A00 = userSession;
        this.A01 = C18U.A06(C06090Tz.A06, userSession, 36315881223098020L);
    }
}
