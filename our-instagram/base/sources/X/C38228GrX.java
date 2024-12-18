package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.GrX, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38228GrX extends AbstractC64162vb {
    public final UserSession A00;
    public final InterfaceC60442pS A01;
    public final InterfaceC09390do A02;
    public final C07T A03;
    public final InterfaceC43589JPu A04;

    public C38228GrX(C07T c07t, UserSession userSession, InterfaceC60442pS interfaceC60442pS, InterfaceC43589JPu interfaceC43589JPu) {
        super(C1BX.A03.A01(AbstractC62752tE.A00(userSession, "clips_viewer_netego")));
        this.A03 = c07t;
        this.A00 = userSession;
        this.A01 = interfaceC60442pS;
        this.A04 = interfaceC43589JPu;
        this.A02 = AbstractC09440dt.A00(EnumC09460dv.A02, new BQP(this, 3));
    }

    private final C82713mZ A00(C120985dq c120985dq, C37644Ghd c37644Ghd, String str) {
        String str2;
        Integer num;
        int i;
        C82713mZ A04 = AbstractC82703mY.A04(c120985dq, this.A01, str);
        C11520jB A0B = AbstractC37300Gc1.A0B();
        A04.A5k = c120985dq.getId();
        A04.A6D = c120985dq.getId();
        C38661Gz2 A02 = c120985dq.A02();
        String str3 = null;
        if (A02 == null || (str2 = A02.A0B) == null) {
            str2 = "";
        }
        A04.A6F = str2;
        if (A02 != null) {
            num = A02.A03;
        } else {
            num = null;
        }
        A04.A38 = num;
        if (A02 != null) {
            str3 = A02.A0E;
        }
        A04.A7Q = str3;
        A04.A09(c37644Ghd.A06());
        A04.A70 = this.A04.getSessionId();
        A04.A0E(A0B);
        C75113Zb c75113Zb = c37644Ghd.A0E;
        if (c75113Zb != null) {
            i = c75113Zb.A0H;
        } else {
            i = -1;
        }
        A04.A0Q(Integer.valueOf(i));
        return A04;
    }

    @Override // X.AbstractC64162vb
    public final /* bridge */ /* synthetic */ void A03(Object obj, Object obj2) {
        String str;
        C120985dq c120985dq = (C120985dq) obj;
        C37644Ghd c37644Ghd = (C37644Ghd) obj2;
        AbstractC167007dF.A1K(c120985dq, c37644Ghd);
        UserSession userSession = this.A00;
        InterfaceC60442pS interfaceC60442pS = this.A01;
        C18920wW A01 = AbstractC12220kQ.A01(interfaceC60442pS, userSession);
        C82713mZ A00 = A00(c120985dq, c37644Ghd, "instagram_netego_impression");
        if (AbstractC166997dE.A0c(C06090Tz.A06, userSession, 36329964420743771L).booleanValue()) {
            C41712Idi.A00(userSession).A01(c120985dq, null, c37644Ghd.A06());
        }
        AbstractC125235lU.A01(A01, A00, interfaceC60442pS);
        C38661Gz2 A02 = c120985dq.A02();
        if (A02 != null) {
            str = A02.A0D;
        } else {
            str = null;
        }
        if ("Reels Upsell".equals(str)) {
            AbstractC23021Ah.A00(userSession).A0m(AbstractC31177DnL.A06());
        }
        C37695GiW c37695GiW = (C37695GiW) this.A02.getValue();
        if (c37695GiW != null) {
            C37695GiW.A03(c120985dq, c37644Ghd, interfaceC60442pS, c37695GiW, false);
        }
    }

    @Override // X.AbstractC64162vb
    public final /* bridge */ /* synthetic */ void A04(Object obj, Object obj2) {
        C120985dq c120985dq = (C120985dq) obj;
        C37644Ghd c37644Ghd = (C37644Ghd) obj2;
        boolean A1a = AbstractC167017dG.A1a(c120985dq, c37644Ghd);
        UserSession userSession = this.A00;
        InterfaceC60442pS interfaceC60442pS = this.A01;
        AbstractC123855iz.A00(AbstractC12220kQ.A01(interfaceC60442pS, userSession), A00(c120985dq, c37644Ghd, AbstractC111324zv.A00(4687)), interfaceC60442pS);
        C37695GiW c37695GiW = (C37695GiW) this.A02.getValue();
        if (c37695GiW != null) {
            C37695GiW.A03(c120985dq, c37644Ghd, interfaceC60442pS, c37695GiW, A1a);
        }
    }
}
