package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.NTw, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52711NTw extends AbstractC54988OTw {
    public boolean A00;
    public final C05A A01;
    public final UserSession A02;
    public final InterfaceC16820sZ A03;
    public final InterfaceC16820sZ A04;
    public final InterfaceC16820sZ A05;

    public final void A00(boolean z) {
        C55188Odt c55188Odt;
        AbstractC53622NnT abstractC53622NnT;
        if (z && AbstractC166997dE.A1Z(((C51885MwT) this.A01.getValue()).A00, true)) {
            UserSession userSession = this.A02;
            if (C18U.A06(C06090Tz.A05, userSession, 36323887042014891L) && (c55188Odt = (C55188Odt) userSession.A00(C55188Odt.class)) != null && (abstractC53622NnT = c55188Odt.A02) != null) {
                C55188Odt.A00(abstractC53622NnT, c55188Odt, false, true);
            }
        }
        C05A c05a = this.A01;
        C51885MwT c51885MwT = (C51885MwT) c05a.getValue();
        c05a.F8m(new C51885MwT(c51885MwT.A00, c51885MwT.A01, c51885MwT.A02, c51885MwT.A03, c51885MwT.A04, c51885MwT.A06, c51885MwT.A05, c51885MwT.A07, c51885MwT.A0A, c51885MwT.A09, z));
    }

    public C52711NTw(UserSession userSession, C54446O4a c54446O4a, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16820sZ interfaceC16820sZ3) {
        super(c54446O4a);
        this.A02 = userSession;
        this.A04 = interfaceC16820sZ;
        this.A05 = interfaceC16820sZ2;
        this.A03 = interfaceC16820sZ3;
        this.A01 = AbstractC25225BEi.A1H(new C51885MwT(null, null, null, null, false, false, false, true, true, false, true));
    }
}
