package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.messageid.MessageIdentifier;
import java.util.Map;

/* renamed from: X.Lgg, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48712Lgg implements C7U0 {
    public C49098Lnb A00;
    public final C41761wQ A01;
    public final UserSession A02;
    public final C49207LpO A03;
    public final C7T0 A04;
    public final C49206LpN A05;
    public final C7TQ A06;
    public final InterfaceC42241xE A07;
    public final C7TH A08;
    public final C7TM A09;

    @Override // X.C7U0
    public final boolean AHB(EnumC2054697t enumC2054697t) {
        C14360o3.A0B(enumC2054697t, 0);
        return this.A04.A0B.A00(enumC2054697t);
    }

    @Override // X.C7U0
    public final void Cn4(InterfaceC83733oI interfaceC83733oI, int i) {
        C83693oE c83693oE = (C83693oE) this.A05.A04.A0W();
        if (c83693oE != null) {
            C2DS A00 = AbstractC28761aE.A00(this.A02);
            String str = c83693oE.A00;
            C14360o3.A0B(str, 0);
            C81663kb A0N = ((C2DU) A00).A0N(str);
            C206259Bi c206259Bi = null;
            if (A0N != null) {
                C83403nh BLs = A0N.BLs();
                C83403nh BM6 = A0N.BM6();
                if (BLs == null) {
                    if (BM6 != null) {
                        BLs = BM6;
                    }
                }
                if (BLs.A0h() == null) {
                    C0w9.A04(AbstractC111324zv.A00(4865), AnonymousClass001.A0R(AbstractC111324zv.A00(3780), BLs.A1u), 1);
                } else {
                    c206259Bi = new C206259Bi(BLs, BM6);
                }
            }
            this.A06.CnG(c206259Bi, new EgH(c83693oE, AbstractC1345466e.A03(interfaceC83733oI)), false);
            return;
        }
        this.A06.CnG(null, interfaceC83733oI, false);
    }

    @Override // X.C7U0
    public final void FBQ(L3Q l3q, String str) {
        C14360o3.A0B(str, 0);
        C7O4 c7o4 = this.A05.A09;
        if (c7o4 != null) {
            c7o4.A06 = str;
            c7o4.A04 = l3q;
        }
    }

    @Override // X.C7U0
    public final void A8d(Map map) {
        map.put(AbstractC111324zv.A00(4312), "msys");
        if (C6X6.A08(this.A02, this.A04.C7W())) {
            map.put("is_dmm_enabled", "yes");
        }
    }

    @Override // X.C7U0
    public final InterfaceC163577Tu AkT() {
        return this.A00;
    }

    @Override // X.C7U0
    public final C2EE Aq4() {
        C3o9 Afi;
        C7T0 c7t0 = this.A04;
        if (!c7t0.CeQ() || (Afi = c7t0.Afi()) == null) {
            return null;
        }
        C7TT C7W = c7t0.C7W();
        C14360o3.A0B(C7W, 0);
        return new C49174Lor(C7W, Afi);
    }

    @Override // X.C7U0
    public final /* bridge */ /* synthetic */ InterfaceC163857Uz Avk() {
        return this.A05;
    }

    @Override // X.C7U0
    public final /* bridge */ /* synthetic */ InterfaceC163817Uv BDF() {
        return this.A03;
    }

    @Override // X.C7U0
    public final EnumC159397Cz BT4(String str) {
        C160787Im BT7 = this.A05.BT7(str);
        if (BT7 != null) {
            C83403nh c83403nh = BT7.A0e;
            C14360o3.A07(c83403nh);
            return AbstractC1586079v.A00(c83403nh);
        }
        return EnumC159397Cz.A06;
    }

    @Override // X.C7U0
    public final /* bridge */ /* synthetic */ InterfaceC163557Ts BT6() {
        return this.A00;
    }

    @Override // X.C7U0
    public final C160787Im Bko(String str) {
        C160787Im BT7 = this.A05.BT7(str);
        if (BT7 == null) {
            return null;
        }
        return BT7;
    }

    @Override // X.C7U0
    public final C7TH Bt9() {
        return this.A08;
    }

    @Override // X.C7U0
    public final C7TM BtA() {
        return this.A09;
    }

    @Override // X.C7U0
    public final C7TQ C78() {
        return this.A06;
    }

    @Override // X.C7U0
    public final /* bridge */ /* synthetic */ InterfaceC163837Ux C7r() {
        return this.A04;
    }

    @Override // X.C7U0
    public final void CMk(String str) {
        C7T7 c7t7;
        InterfaceC66482zP interfaceC66482zP = (InterfaceC66482zP) this.A00.A0D.get(str);
        if ((interfaceC66482zP instanceof InterfaceC162797Qq) && (c7t7 = ((InterfaceC162797Qq) interfaceC66482zP).Apt().A0G) != null && c7t7.A07) {
            C49206LpN c49206LpN = this.A05;
            c49206LpN.A0D.A01(new BJF(null, null, 3, 3, c49206LpN.A0G), JQ1.A0E(c49206LpN.A05, c49206LpN));
            C49206LpN.A01(c49206LpN);
        }
    }

    @Override // X.C7U0
    public final boolean CYU(String str) {
        return AbstractC167007dF.A1W(this.A05.BT7(str));
    }

    @Override // X.C7U0
    public final C42221xC E5m(MessageIdentifier messageIdentifier) {
        C42221xC A09;
        C26084BgD c26084BgD;
        EnumC40111tc enumC40111tc;
        C42221xC A00;
        int i;
        String str = messageIdentifier.A01;
        C160787Im Bko = Bko(str);
        if (Bko != null) {
            C83403nh c83403nh = Bko.A0e;
            C14360o3.A07(c83403nh);
            C2EY c2ey = c83403nh.A10;
            C14360o3.A07(c2ey);
            return C42221xC.A09(new LnZ(c83403nh, c2ey, c83403nh.A0W()));
        }
        C49098Lnb c49098Lnb = this.A00;
        InterfaceC66482zP A01 = c49098Lnb.A01(messageIdentifier);
        if (A01 instanceof InterfaceC162797Qq) {
            InterfaceC129555tK ArC = ((InterfaceC162797Qq) A01).ArC();
            if (ArC instanceof JUe) {
                JUe jUe = (JUe) ArC;
                C158797Aq c158797Aq = jUe.A06;
                c158797Aq.A00();
                if (jUe.A0H) {
                    enumC40111tc = EnumC40111tc.A0a;
                } else {
                    enumC40111tc = EnumC40111tc.A0Q;
                }
                A00 = c158797Aq.A00();
                i = 35;
            } else if ((ArC instanceof C129565tL) && (c26084BgD = ((C129565tL) ArC).A01.A01) != null) {
                InterfaceC50520MRx interfaceC50520MRx = (InterfaceC50520MRx) c26084BgD.A03;
                int i2 = c26084BgD.A01;
                Long Ad4 = interfaceC50520MRx.Ad4(i2);
                String Ad1 = interfaceC50520MRx.Ad1(i2);
                Integer Ad6 = interfaceC50520MRx.Ad6(i2);
                if (Ad4 != null && Ad1 != null && Ad6 != null) {
                    android.net.Uri A002 = LHB.A00(Ad1, null, Ad4.longValue());
                    if (Ad6.intValue() == 4) {
                        enumC40111tc = EnumC40111tc.A0a;
                    } else {
                        enumC40111tc = EnumC40111tc.A0Q;
                    }
                    A00 = C48433Lbm.A00(C137756Lx.A03.A01(c49098Lnb.A07, EnumC132075xi.A0c).A01, A002.toString());
                    i = 36;
                }
            }
            A09 = C43597JQd.A00(A00, enumC40111tc, i);
            return A09.A0K(C48403LbI.A00);
        }
        A09 = C42221xC.A09(new C48496Lcn(AbstractC166987dD.A14(AnonymousClass001.A0u("can not find media content by id ", str, " ", messageIdentifier.A00()))));
        return A09.A0K(C48403LbI.A00);
    }

    @Override // X.C7U0
    public final String EL1(String str) {
        C7T7 c7t7;
        InterfaceC66482zP interfaceC66482zP = (InterfaceC66482zP) this.A00.A0D.get(str);
        if ((interfaceC66482zP instanceof InterfaceC162797Qq) && (c7t7 = ((InterfaceC162797Qq) interfaceC66482zP).Apt().A0G) != null && c7t7.A07) {
            C49206LpN c49206LpN = this.A05;
            c49206LpN.A0D.A01(new BJF(null, str, 1, 3, c49206LpN.A0G), JQ1.A0E(c49206LpN.A05, c49206LpN));
            C49206LpN.A01(c49206LpN);
            return null;
        }
        return null;
    }

    @Override // X.C7U0
    public final void onCreate() {
        C7T0 c7t0 = this.A04;
        C42221xC A02 = this.A05.A02();
        C41761wQ c41761wQ = c7t0.A0A;
        c41761wQ.A02(AbstractC43592JPx.A0Q(C48408LbN.A00, A02), c7t0.A02);
        c41761wQ.A02(AbstractC43592JPx.A0Q(C48409LbO.A00, A02), c7t0.A01);
        C42221xC A0K = A02.A0K(C48410LbP.A00);
        C09530e4 A1L = AbstractC166987dD.A1L(C16930sl.A00, new C47750L6u());
        JYF jyf = new JYF((InterfaceC16620sF) MME.A00, 1);
        JQn.A00(C43597JQd.A02(new C42221xC(new C72335XbX(new C72091XNl(jyf), A0K.A00, new M8C(A1L))), MKB.A00, 22), c41761wQ, c7t0, 21);
        C42221xC A0Q = AbstractC43592JPx.A0Q(C48411LbQ.A00, C43601JQh.A00(A02, MKC.A00, 0));
        C42201xA c42201xA = c7t0.A07;
        c41761wQ.A02(A0Q, c42201xA);
        JQn.A00(C43601JQh.A00(A02, MKD.A00, 0).A0K(C48404LbJ.A00), c41761wQ, c7t0, 19);
        C42221xC A0Q2 = AbstractC43592JPx.A0Q(C48405LbK.A00, c42201xA);
        C42201xA c42201xA2 = c7t0.A08;
        c41761wQ.A02(A0Q2, c42201xA2);
        c41761wQ.A02(AbstractC43592JPx.A0Q(C48406LbL.A00, c42201xA), c7t0.A06);
        JQn.A00(c42201xA2, c41761wQ, c7t0, 20);
        c41761wQ.A02(AbstractC43592JPx.A0Q(C48407LbM.A00, C43601JQh.A00(c42201xA2, MKA.A00, 0)), c7t0.A09);
        c41761wQ.A02(c42201xA2, new GKK(c7t0, 2));
    }

    @Override // X.C7U0
    public final void onDestroy() {
        this.A04.A0A.A01();
    }

    public C48712Lgg(UserSession userSession, C49207LpO c49207LpO, C7T0 c7t0, C49098Lnb c49098Lnb, C49206LpN c49206LpN, C7TQ c7tq, C7TH c7th, C7TM c7tm, InterfaceC42241xE interfaceC42241xE) {
        AbstractC37302Gc3.A1U(c7th, c7tm);
        C14360o3.A0B(interfaceC42241xE, 9);
        this.A02 = userSession;
        this.A05 = c49206LpN;
        this.A08 = c7th;
        this.A09 = c7tm;
        this.A04 = c7t0;
        this.A06 = c7tq;
        this.A00 = c49098Lnb;
        this.A03 = c49207LpO;
        this.A07 = interfaceC42241xE;
        this.A01 = AbstractC31173DnH.A0S();
    }

    @Override // X.C7U0
    public final boolean CYS(String str) {
        return BT4(str).A01();
    }

    @Override // X.C7U0
    public final boolean CZj(String str) {
        return AbstractC167007dF.A1W(Bko(str));
    }

    @Override // X.C7U0
    public final AbstractC46511KiA E5u(String str) {
        C3o9 A05;
        C160787Im Bko = Bko(str);
        if (Bko != null) {
            InterfaceC83733oI interfaceC83733oI = Bko.A0G.A0P;
            if (interfaceC83733oI == null || (A05 = AbstractC1345466e.A05(interfaceC83733oI)) == null) {
                return null;
            }
            C83403nh c83403nh = Bko.A0e;
            C14360o3.A07(c83403nh);
            return new KWh(c83403nh, A05);
        }
        Long A0j = AbstractC166997dE.A0j(str);
        if (A0j != null) {
            long longValue = A0j.longValue();
            C3o9 Afi = this.A04.Afi();
            if (Afi == null) {
                return null;
            }
            return new KWg(Afi, longValue);
        }
        C0w9.A03("MsysClientInfra", AnonymousClass001.A0R("msys unsend message failed with ", str));
        return null;
    }
}
