package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.1eI, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C31131eI implements InterfaceC29301b7 {
    public static final C0KV A02 = new C0KV() { // from class: X.1eJ
        @Override // X.C0KV
        public final /* bridge */ /* synthetic */ Object AXR(UserSession userSession) {
            int A03 = C0f9.A03(2034522904);
            int A032 = C0f9.A03(793552949);
            C31131eI c31131eI = new C31131eI(userSession);
            C0f9.A0A(-2080096060, A032);
            C0f9.A0A(580535961, A03);
            return c31131eI;
        }
    };
    public final UserSession A00;
    public final C2DS A01;

    @Override // X.InterfaceC29301b7
    public final /* bridge */ /* synthetic */ boolean CfR(C1OW c1ow, MNP mnp) {
        return LCX.A01(mnp, (AbstractC29011ae) c1ow, this.A01);
    }

    @Override // X.InterfaceC29301b7
    public final /* bridge */ /* synthetic */ void ENr(C19260xA c19260xA, InterfaceC37261GbE interfaceC37261GbE, C1OW c1ow) {
        C31111eG c31111eG = (C31111eG) c1ow;
        boolean z = true;
        if (c31111eG.C7R().size() != 1) {
            z = false;
        }
        C18C.A0E(z);
        JTa jTa = ((C1OW) c31111eG).A02;
        UserSession userSession = this.A00;
        DirectThreadKey directThreadKey = (DirectThreadKey) c31111eG.C7R().get(0);
        String str = c31111eG.A00.A0Z;
        String A06 = c31111eG.A06();
        String str2 = c31111eG.A05;
        boolean z2 = jTa.A09;
        boolean z3 = jTa.A0A;
        L1W l1w = jTa.A00;
        String str3 = jTa.A04;
        C25621Ms c25621Ms = new C25621Ms(userSession);
        c25621Ms.A05();
        c25621Ms.A0B("direct_v2/threads/broadcast/static_sticker/");
        c25621Ms.A9s("sticker_id", str);
        c25621Ms.A9s(AbstractC31688Dvt.A01(), C16030qx.A00(AbstractC12290kX.A00));
        c25621Ms.A0S(C40781ul.class, C55702hA.class);
        AbstractC47995LLh.A0D(c25621Ms, l1w, directThreadKey, A06, str2, str3, z2, false, z3);
        C1ON A0N = c25621Ms.A0N();
        A0N.A00 = AbstractC46987Kq6.A00(userSession, interfaceC37261GbE);
        C1GJ.A03(A0N);
    }

    public C31131eI(UserSession userSession) {
        this.A00 = userSession;
        this.A01 = AbstractC28761aE.A00(userSession);
    }
}
