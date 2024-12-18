package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.BoZ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26576BoZ extends AbstractC51572Yf {
    public final int A00;
    public final AbstractC70653Fc A01;
    public final C51722Yv A02;
    public final EnumC27372C6b A03;
    public final C7N A04;
    public final List A05;
    public final InterfaceC16820sZ A06;
    public final InterfaceC16820sZ A07;
    public final InterfaceC16660sJ A08;
    public final InterfaceC16660sJ A09;
    public final InterfaceC16660sJ A0A;
    public final InterfaceC16660sJ A0B;
    public final InterfaceC16620sF A0C;
    public final InterfaceC16620sF A0D;
    public final InterfaceC16600sD A0E;
    public final boolean A0F;
    public final boolean A0G;

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        Boolean bool;
        float f;
        InterfaceC16660sJ interfaceC16660sJ;
        C14360o3.A0B(c76223bS, 0);
        long A0J = AbstractC25230BEn.A0J();
        C51762Yz A00 = AbstractC77073ct.A00(c76223bS, DEU.A00);
        EnumC27372C6b enumC27372C6b = this.A03;
        C7N c7n = this.A04;
        Object A002 = AbstractC77183d4.A00(c76223bS, C29896DGk.A00(c76223bS, this, 18), new Object[]{enumC27372C6b, c7n});
        C51762Yz A003 = AbstractC77073ct.A00(c76223bS, DET.A00);
        C51762Yz A004 = AbstractC77073ct.A00(c76223bS, DEQ.A00);
        List list = this.A05;
        int size = list.size();
        Number number = (Number) A004.A03;
        int intValue = number.intValue();
        if (intValue >= 0 && intValue < size && (interfaceC16660sJ = this.A09) != null) {
            interfaceC16660sJ.invoke(list.get(number.intValue()));
        }
        C168127f7 c168127f7 = (C168127f7) AbstractC77183d4.A00(c76223bS, DES.A00, new Object[0]);
        C25907BdA c25907BdA = new C25907BdA(1, c168127f7, A004, this);
        C51762Yz A005 = AbstractC77073ct.A00(c76223bS, DER.A00);
        AbstractC77313dH.A00(c76223bS, DH2.A01(A005, c168127f7, this, 17), AbstractC25228BEl.A1Y(list.size()));
        Integer valueOf = Integer.valueOf(list.size());
        CTp cTp = (CTp) AbstractC001800i.A0J(list);
        if (cTp != null) {
            bool = Boolean.valueOf(cTp.A01);
        } else {
            bool = null;
        }
        AbstractC77313dH.A00(c76223bS, DH2.A01(A005, c168127f7, this, 18), new Object[]{valueOf, bool, A005.A03});
        InterfaceC16620sF A02 = AbstractC85303rL.A02(c76223bS, C30482DbR.A00(this, 46));
        Object A006 = AbstractC77183d4.A00(c76223bS, C29890DGe.A00(this, 38), new Object[]{list});
        CTp cTp2 = (CTp) AbstractC001800i.A0J(list);
        if (list.size() == 1 && cTp2 != null && ((cTp2 instanceof C3R) || (cTp2 instanceof C3S))) {
            C75933ay c75933ay = C51722Yv.A02;
            C51722Yv A0C = AbstractC25234BEr.A0C(null, AbstractC25225BEi.A0m(C05F.A0Y, c7n.A00, 1), 0);
            C51722Yv c51722Yv = this.A02;
            long A0F = AbstractC25229BEm.A0F();
            long A0J2 = AbstractC25229BEm.A0J();
            C9CU A0n = AbstractC25225BEi.A0n(C05F.A08, 0, A0F);
            if (c51722Yv == c75933ay) {
                c51722Yv = null;
            }
            return A03(c76223bS, A0C, AbstractC25230BEn.A0d(AbstractC25234BEr.A0E(c51722Yv, A0n, 0, A0J2), C05F.A00, 100.0f, 0), this, cTp2, null, false, false);
        }
        int ordinal = enumC27372C6b.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    C75933ay c75933ay2 = C51722Yv.A02;
                    C51722Yv A0d = AbstractC25230BEn.A0d(C9CU.A00(null, C05F.A0E, 0, AbstractC25229BEm.A0B()), C05F.A0Y, c7n.A00, 1);
                    Integer num = C05F.A01;
                    C51722Yv A0d2 = AbstractC25230BEn.A0d(A0d, num, 100.0f, 0);
                    ArrayList A1E = AbstractC166987dD.A1E();
                    for (Object obj : list) {
                        if ((obj instanceof C3R) || (obj instanceof C3S)) {
                            A1E.add(obj);
                        }
                    }
                    int i = this.A00;
                    AbstractC70653Fc abstractC70653Fc = this.A01;
                    C51722Yv c51722Yv2 = this.A02;
                    long A0J3 = AbstractC25229BEm.A0J();
                    C9CU A0n2 = AbstractC25225BEi.A0n(C05F.A0F, 0, A0J3);
                    if (c51722Yv2 == c75933ay2) {
                        c51722Yv2 = null;
                    }
                    C51722Yv A007 = C9CU.A00(AbstractC25225BEi.A0h(c51722Yv2, A0n2), C05F.A04, 0, A0J3);
                    long A0D = AbstractC25229BEm.A0D();
                    C3F1 c3f1 = AbstractC169037gc.A00;
                    C2XE c2xe = c76223bS.A05;
                    C2V3 c2v3 = c2xe.A02.A01;
                    C2VF c2vf = c2v3.A02;
                    boolean z = c2v3.A0W;
                    C168887gN c168887gN = new C168887gN();
                    DQU dqu = DQU.A00;
                    C30182DRn A01 = C30182DRn.A01(A004, 11);
                    DT0 dt0 = new DT0(25, this, A004, A0d2, A002);
                    C14360o3.A0B(dqu, 1);
                    C168937gS c168937gS = new C168937gS(c2xe);
                    Iterator it = A1E.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        c168887gN.A01(dqu.invoke(next), new C57261Pbj(13, c168937gS, dt0, next), (Object[]) A01.invoke(next), 100.0f);
                    }
                    return new C168977gW(c3f1, abstractC70653Fc, null, c25907BdA, A007, null, AbstractC168947gT.A01(c2xe, c2vf, num, 0, i, AbstractC25232BEp.A0n(c76223bS, A0D), false, z), c168887gN, c168127f7, null, null, null, null, null, false, false, null, 2, null, null, null, true, false);
                }
                throw B4Z.A00();
            }
            int ordinal2 = c7n.ordinal();
            if (ordinal2 != 0) {
                if (ordinal2 == 1) {
                    f = c7n.A00;
                } else {
                    throw B4Z.A00();
                }
            } else {
                f = 0.65f;
            }
            C75933ay c75933ay3 = C51722Yv.A02;
            long A0J4 = AbstractC25229BEm.A0J();
            C51722Yv A0d3 = AbstractC25230BEn.A0d(C9CU.A00(null, C05F.A0G, 0, A0J4), C05F.A0Y, f, 1);
            Integer num2 = C05F.A01;
            C51722Yv A0d4 = AbstractC25230BEn.A0d(A0d3, num2, 100.0f, 0);
            Integer num3 = C05F.A00;
            C51722Yv A0d5 = AbstractC25230BEn.A0d(A0d4, num3, 100.0f, 0);
            int i2 = this.A00;
            AbstractC70653Fc abstractC70653Fc2 = this.A01;
            C51722Yv c51722Yv3 = this.A02;
            C9CT A0m = AbstractC25225BEi.A0m(num3, 100.0f, 0);
            if (c51722Yv3 == c75933ay3) {
                c51722Yv3 = null;
            }
            C51722Yv A0G = AbstractC25234BEr.A0G(AbstractC25233BEq.A0T(c51722Yv3, A0m, num2, 100.0f, 0), AbstractC25225BEi.A0n(C05F.A0E, 0, A0J4), 0, A0J4);
            C29890DGe A008 = C29890DGe.A00(A005, 37);
            C2Z3 A0p = AbstractC25225BEi.A0p(A0J);
            long A0D2 = AbstractC25229BEm.A0D();
            C3F1 c3f12 = AbstractC169037gc.A00;
            C2XE c2xe2 = c76223bS.A05;
            C2V3 c2v32 = c2xe2.A02.A01;
            C2VF c2vf2 = c2v32.A02;
            boolean z2 = c2v32.A0W;
            C28943Cpr c28943Cpr = new C28943Cpr(c2xe2);
            c28943Cpr.A00(list, DQS.A00, DQT.A00, new DT0(24, this, A0d5, A006, A02));
            return new C168977gW(c3f12, abstractC70653Fc2, null, c25907BdA, A0G, null, new C212149aj(c2xe2, c2vf2, 1, i2, AbstractC25232BEp.A0n(c76223bS, A0D2), 2, z2), c28943Cpr.A01, c168127f7, null, null, null, null, A0p, null, null, null, 2, null, A008, null, false, false);
        }
        C75933ay c75933ay4 = C51722Yv.A02;
        long A0J5 = AbstractC25229BEm.A0J();
        return CCI.A00(c76223bS, AbstractC25234BEr.A0C(AbstractC25234BEr.A0E(null, AbstractC25225BEi.A0n(C05F.A04, 0, A0J5), 0, A0J5), AbstractC25225BEi.A0m(C05F.A00, 100.0f, 0), 0), new DU9(c25907BdA, A00, A005, A003, c168127f7, this, A0J));
    }

    public static final C2WH A03(C2Z1 c2z1, C51722Yv c51722Yv, C51722Yv c51722Yv2, C26576BoZ c26576BoZ, CTp cTp, InterfaceC16610sE interfaceC16610sE, boolean z, boolean z2) {
        boolean z3;
        AbstractC50812Vc abstractC50812Vc;
        boolean z4;
        int size = c26576BoZ.A05.size();
        boolean z5 = true;
        if (size == 4 ? cTp.A00 < 2 : !(size != 6 || cTp.A00 >= 4)) {
            z3 = true;
        } else {
            z3 = false;
        }
        int i = cTp.A00;
        if (i % 2 != 0) {
            z5 = false;
        }
        int i2 = 48;
        if (z3) {
            i2 = 80;
        }
        int i3 = 5;
        if (z5) {
            i3 = 3;
        }
        int i4 = i2 | i3;
        C2Z0 A0L = AbstractC25233BEq.A0L(c2z1);
        String str = null;
        if (cTp instanceof C3R) {
            C3R c3r = (C3R) cTp;
            C29509CzN c29509CzN = c3r.A01;
            if (c29509CzN != null) {
                str = c29509CzN.A04;
            }
            abstractC50812Vc = c3r.A00;
            z4 = false;
        } else if (cTp instanceof C3S) {
            C3S c3s = (C3S) cTp;
            CWM cwm = c3s.A01.A01;
            if (cwm != null) {
                str = cwm.A0A;
            }
            abstractC50812Vc = c3s.A00;
            z4 = c3s.A02;
        } else {
            throw AbstractC166987dD.A12("Unsupported ImagineContentListItem type");
        }
        return AbstractC25226BEj.A0l(new C26492BnD(c51722Yv, new CSI(abstractC50812Vc, str, i, z4), C30170DRa.A00(c26576BoZ, cTp, 0), C30170DRa.A00(c26576BoZ, cTp, 1), new C30498Dbh(i4, 18, interfaceC16610sE), new C30486DbV(13, cTp, c26576BoZ), z, z2), A0L, c2z1, c51722Yv2);
    }

    public C26576BoZ(AbstractC70653Fc abstractC70653Fc, C51722Yv c51722Yv, EnumC27372C6b enumC27372C6b, C7N c7n, List list, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16660sJ interfaceC16660sJ2, InterfaceC16660sJ interfaceC16660sJ3, InterfaceC16660sJ interfaceC16660sJ4, InterfaceC16620sF interfaceC16620sF, InterfaceC16620sF interfaceC16620sF2, InterfaceC16600sD interfaceC16600sD, int i, boolean z, boolean z2) {
        AbstractC167027dH.A13(list, c7n, interfaceC16660sJ);
        C14360o3.A0B(interfaceC16660sJ2, 5);
        C14360o3.A0B(c51722Yv, 17);
        this.A05 = list;
        this.A04 = c7n;
        this.A08 = interfaceC16660sJ;
        this.A0E = interfaceC16600sD;
        this.A0A = interfaceC16660sJ2;
        this.A09 = interfaceC16660sJ3;
        this.A0C = interfaceC16620sF;
        this.A0D = interfaceC16620sF2;
        this.A0B = interfaceC16660sJ4;
        this.A03 = enumC27372C6b;
        this.A01 = abstractC70653Fc;
        this.A00 = i;
        this.A0F = z;
        this.A0G = z2;
        this.A06 = interfaceC16820sZ;
        this.A07 = interfaceC16820sZ2;
        this.A02 = c51722Yv;
    }
}
