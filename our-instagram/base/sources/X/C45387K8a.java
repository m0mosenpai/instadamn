package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.perf.constants.ThreadFetchReason;
import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.K8a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45387K8a extends AnonymousClass935 {
    public final /* synthetic */ InterfaceC37261GbE A00;
    public final /* synthetic */ C29701bl A01;
    public final /* synthetic */ DirectThreadKey A02;
    public final /* synthetic */ C2EY A03;
    public final /* synthetic */ String A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C45387K8a(UserSession userSession, InterfaceC37261GbE interfaceC37261GbE, C29701bl c29701bl, DirectThreadKey directThreadKey, C2EY c2ey, String str) {
        super(userSession);
        this.A01 = c29701bl;
        this.A02 = directThreadKey;
        this.A03 = c2ey;
        this.A04 = str;
        this.A00 = interfaceC37261GbE;
    }

    @Override // X.AnonymousClass935
    public final /* bridge */ /* synthetic */ void A05(UserSession userSession, Object obj) {
        int A03 = C0f9.A03(1073528773);
        C32207EDg c32207EDg = (C32207EDg) obj;
        int A032 = C0f9.A03(-1842428835);
        UserSession userSession2 = this.A01.A00;
        DirectThreadKey directThreadKey = this.A02;
        C2EY c2ey = this.A03;
        String str = this.A04;
        C14360o3.A0B(userSession2, 0);
        AbstractC167027dH.A0a(1, directThreadKey, c2ey, str, c32207EDg);
        C2DS A00 = AbstractC28761aE.A00(userSession2);
        String BK3 = c32207EDg.BK3();
        long A002 = c32207EDg.A00();
        C2DU c2du = (C2DU) A00;
        synchronized (c2du) {
            C4GV A0P = c2du.A0P(directThreadKey);
            if (A0P != null) {
                C83403nh A0H = A0P.A0H(c2ey, str);
                if (A0H == null) {
                    C0w9.A03("DirectThreadStore", "Could not find local message using client context.");
                } else {
                    C4GV A0P2 = c2du.A0P(directThreadKey);
                    if (A0P2 != null && A0H.A0h() == null) {
                        A0H.A1F(BK3);
                        A0H.A1A(null);
                        A0H.A1B(Long.valueOf(A002));
                        A0H.A1m(C05F.A0j);
                        A0P2.A0F(A0H, true);
                        C2Io c2Io = new C2Io(directThreadKey, C05F.A0C, null, null, AbstractC166987dD.A1J(A0H), false);
                        c2du.A06.E4s(c2Io);
                        c2du.A09.accept(c2Io);
                        C2DU.A0F(c2du, A0P2);
                        C28741aC c28741aC = c2du.A0H;
                        c28741aC.A02.ATO(new KM1(c28741aC, directThreadKey));
                    }
                }
            }
        }
        String A01 = c32207EDg.A01();
        if (A01 != null && c2du.A0N(A01) == null) {
            LL3.A03(userSession2, ThreadFetchReason.CONFIRM_PENDING_MESSAGES, null, 20, A01, true);
        }
        InterfaceC37261GbE interfaceC37261GbE = this.A00;
        C162337Ov.A0a(interfaceC37261GbE.BtO(), C05F.A00);
        interfaceC37261GbE.DUq(null, null);
        C0f9.A0A(1496096323, A032);
        C0f9.A0A(-103587563, A03);
    }

    @Override // X.AnonymousClass935
    public final void A04(AbstractC115105If abstractC115105If, UserSession userSession) {
        int A03 = C0f9.A03(1314198586);
        InterfaceC37261GbE interfaceC37261GbE = this.A00;
        C162337Ov.A0Z(interfaceC37261GbE.B4C(), C05F.A00);
        interfaceC37261GbE.DUq(AbstractC35240FgZ.A00(abstractC115105If), null);
        C0f9.A0A(428504075, A03);
    }
}
