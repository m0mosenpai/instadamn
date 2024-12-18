package X;

import com.instagram.common.session.UserSession;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes5.dex */
public final class BV9 extends AbstractC51572Yf {
    public final BVB A00;
    public final UserSession A01;
    public final C25366BKj A02;
    public final C41704IdY A03;
    public final C37522Gfe A04;
    public final InterfaceC31152Dmw A05;
    public final HashMap A06;
    public final HashMap A07;
    public final boolean A08;

    public BV9(BVB bvb, UserSession userSession, C25366BKj c25366BKj, C41704IdY c41704IdY, C37522Gfe c37522Gfe, InterfaceC31152Dmw interfaceC31152Dmw, HashMap hashMap, HashMap hashMap2, boolean z) {
        C14360o3.A0B(c37522Gfe, 1);
        AbstractC25234BEr.A1R(userSession, c25366BKj, bvb, hashMap, hashMap2);
        C14360o3.A0B(c41704IdY, 7);
        this.A04 = c37522Gfe;
        this.A01 = userSession;
        this.A02 = c25366BKj;
        this.A00 = bvb;
        this.A06 = hashMap;
        this.A07 = hashMap2;
        this.A03 = c41704IdY;
        this.A08 = z;
        this.A05 = interfaceC31152Dmw;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, X.DkM] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, X.DkN] */
    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        C37522Gfe c37522Gfe;
        D0Y d0y;
        C26250BjJ c26250BjJ;
        BVB bvb = this.A00;
        if (BVB.A00(bvb, 1)) {
            C25366BKj c25366BKj = this.A02;
            C37522Gfe c37522Gfe2 = this.A04;
            UserSession userSession = this.A01;
            BWM bwm = (BWM) bvb.A01;
            C14360o3.A0B(c37522Gfe2, 0);
            AbstractC167007dF.A1D(userSession, 1, bwm);
            C25361BKe c25361BKe = c25366BKj.A03;
            C25665BWb c25665BWb = new C25665BWb(userSession, new BWZ(userSession, c25361BKe, c37522Gfe2), new Object(), new Object(), new C25664BWa(userSession, c37522Gfe2), bwm, c25361BKe, c37522Gfe2);
            C41704IdY c41704IdY = this.A03;
            c25665BWb.EXC(new BVG(c41704IdY, 4));
            c25665BWb.EXK(new C29642D5f(c41704IdY, 9));
            c25665BWb.A03 = new J7C(c41704IdY, 4);
            c25665BWb.EXL(new C25344BJn(c41704IdY, 51));
            c25665BWb.EXI(new C38247Grq(c41704IdY, 11));
            c25665BWb.EXM(new C38247Grq(c41704IdY, 12));
            c25665BWb.A09.A00 = new BVI(c41704IdY, 43);
            c25665BWb.A00 = new C9GQ(c41704IdY, 12);
            c25665BWb.A05 = new BV8(c41704IdY, 15);
            BV8 bv8 = new BV8(c41704IdY, 13);
            D0V d0v = c25665BWb.A0A;
            d0v.A01 = bv8;
            c25665BWb.A02 = new BVI(c41704IdY, 41);
            c25665BWb.A01 = new BVI(c41704IdY, 42);
            c25665BWb.A04 = new C25344BJn(c41704IdY, 49);
            d0v.A00 = new C57228PbC(c41704IdY, 19);
            c25665BWb.EXm(new BV8(c41704IdY, 14));
            c25665BWb.EXt(new C25344BJn(c41704IdY, 50));
            c25665BWb.EXD(new BVG(c41704IdY, 3));
            return new C25668BWe(c37522Gfe2, userSession, bwm, c25665BWb, this.A05, this.A06, this.A07, this.A08);
        }
        if (BVB.A00(bvb, 0)) {
            C25366BKj c25366BKj2 = this.A02;
            c37522Gfe = this.A04;
            BWU bwu = (BWU) bvb.A01;
            boolean A1R = AbstractC167007dF.A1R(0, c37522Gfe, bwu);
            C25367BKk c25367BKk = c25366BKj2.A01;
            C25368BKl c25368BKl = c25367BKk.A02;
            C25670BWg c25670BWg = new C25670BWg(c25367BKk.A00, bwu, new BVC(c25368BKl.A00, c25368BKl, c37522Gfe, new D8I(15, bwu, c25367BKk)), c37522Gfe);
            C41704IdY c41704IdY2 = this.A03;
            c25670BWg.EXm(new BV8(c41704IdY2, 11));
            c25670BWg.EXt(new C25344BJn(c41704IdY2, 47));
            c25670BWg.EXD(new BVG(c41704IdY2, A1R ? 1 : 0));
            c25670BWg.A01 = new MTX(c41704IdY2, 67);
            c25670BWg.A00 = new J72(c41704IdY2, 4);
            c26250BjJ = bwu;
            d0y = c25670BWg;
        } else if (BVB.A00(bvb, 2)) {
            C25366BKj c25366BKj3 = this.A02;
            c37522Gfe = this.A04;
            C26250BjJ c26250BjJ2 = (C26250BjJ) bvb.A01;
            AbstractC167007dF.A1K(c37522Gfe, c26250BjJ2);
            C25369BKm c25369BKm = c25366BKj3.A04;
            UserSession userSession2 = c25369BKm.A00;
            List list = c26250BjJ2.A02;
            C25368BKl c25368BKl2 = c25369BKm.A02;
            D0Y d0y2 = new D0Y(userSession2, new BVC(c25368BKl2.A00, c25368BKl2, c37522Gfe, C29891DGf.A00(list, 26)), c26250BjJ2, c37522Gfe);
            C41704IdY c41704IdY3 = this.A03;
            d0y2.A01 = new C29642D5f(c41704IdY3, 8);
            d0y2.A00 = new C25344BJn(c41704IdY3, 48);
            d0y2.EXm(new BV8(c41704IdY3, 12));
            d0y2.EXD(new BVG(c41704IdY3, 2));
            c26250BjJ = c26250BjJ2;
            d0y = d0y2;
        } else {
            throw B4Z.A00();
        }
        return new BVL(c37522Gfe, this.A01, d0y, c26250BjJ, d0y, this.A06, AbstractC166987dD.A1G());
    }
}
