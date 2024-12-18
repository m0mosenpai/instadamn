package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.BoM, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26563BoM extends AbstractC51572Yf {
    public final CWJ A00;
    public final InterfaceC16820sZ A01;
    public final InterfaceC16820sZ A02;
    public final InterfaceC16660sJ A03;
    public final InterfaceC16660sJ A04;
    public final InterfaceC16610sE A05;
    public final C51722Yv A06;

    public C26563BoM(C51722Yv c51722Yv, CWJ cwj, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16660sJ interfaceC16660sJ2, InterfaceC16610sE interfaceC16610sE) {
        C14360o3.A0B(cwj, 1);
        this.A00 = cwj;
        this.A01 = interfaceC16820sZ;
        this.A02 = interfaceC16820sZ2;
        this.A04 = interfaceC16660sJ;
        this.A03 = interfaceC16660sJ2;
        this.A05 = interfaceC16610sE;
        this.A06 = c51722Yv;
    }

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        C27338C4t A03;
        InterfaceC31004Dk3 c29521CzZ;
        C14360o3.A0B(c76223bS, 0);
        BX7 bx7 = (BX7) AbstractC77183d4.A00(c76223bS, DEJ.A00, new Object[0]);
        CWJ cwj = this.A00;
        C28260Cd5 c28260Cd5 = cwj.A00;
        boolean z = c28260Cd5.A00;
        AbstractC77313dH.A00(c76223bS, new D8K(18, bx7, this), AbstractC25228BEl.A1b(z));
        C51722Yv c51722Yv = this.A06;
        Integer num = C05F.A00;
        C9CT A0m = AbstractC25228BEl.A0m(num, 0);
        if (c51722Yv == C51722Yv.A02) {
            c51722Yv = null;
        }
        C51722Yv A0h = AbstractC25225BEi.A0h(c51722Yv, A0m);
        C2Z0 A12 = AbstractC25232BEp.A12(c76223bS);
        C28267CdC c28267CdC = cwj.A02;
        C168977gW c168977gW = null;
        if (c28267CdC.A03) {
            C25906Bd9 A00 = CCM.A00(A12, AbstractC25225BEi.A0p(AbstractC25229BEm.A0J()), null, null);
            Integer num2 = C05F.A01;
            double d = 12.0d;
            long doubleToRawLongBits = Double.doubleToRawLongBits(12.0d);
            C51722Yv A002 = C9CU.A00(null, C05F.A04, 0, doubleToRawLongBits);
            if (c28260Cd5.A01) {
                d = 0.0d;
            }
            C51722Yv A16 = AbstractC25232BEp.A16(AbstractC25234BEr.A0E(A002, AbstractC25226BEj.A0m(0, doubleToRawLongBits), 0, Double.doubleToRawLongBits(d)), C05F.A0C, false);
            long A0D = AbstractC25229BEm.A0D();
            C3F1 c3f1 = AbstractC169037gc.A00;
            C2XE ArD = A12.ArD();
            C2V3 c2v3 = ArD.A02.A01;
            C2VF c2vf = c2v3.A02;
            boolean z2 = c2v3.A0W;
            C168877gM c168877gM = new C168877gM(ArD);
            List list = c28267CdC.A00;
            ArrayList A0q = AbstractC167017dG.A0q(list);
            int i = 0;
            for (Object obj : list) {
                int i2 = i + 1;
                if (i < 0) {
                    AbstractC16960so.A1U();
                    throw C00O.createAndThrow();
                }
                C27994CVr c27994CVr = (C27994CVr) obj;
                Integer num3 = c27994CVr.A00;
                if (c28267CdC.A01) {
                    c29521CzZ = new C29520CzY(i, c27994CVr.A01);
                } else {
                    c29521CzZ = new C29521CzZ(c27994CVr.A01, new J8Z(this, 2), DH2.A01(num3, c27994CVr, this, 30), i);
                }
                A0q.add(c29521CzZ);
                i = i2;
            }
            c168877gM.A01(A0q, C30157DQn.A00, C30470DbF.A00);
            c168977gW = new C168977gW(c3f1, A00, null, null, A16, null, AbstractC168947gT.A01(ArD, c2vf, num2, 0, Integer.MIN_VALUE, AbstractC25232BEp.A0n(A12, A0D), false, z2), c168877gM.A01, null, null, null, null, null, null, false, false, null, 0, null, null, null, true, false);
        }
        A12.A00(c168977gW);
        C51762Yz A003 = AbstractC77073ct.A00(c76223bS, new J8Z(bx7, 1));
        boolean z3 = !z;
        String A0F = AbstractC77623dm.A0F(A12, 2131966596);
        C26522Bnh c26522Bnh = null;
        if (c28260Cd5.A01) {
            Object A06 = A12.ArD().A06(InterfaceC30923Dia.class);
            if (A06 != null) {
                InterfaceC31128DmB A004 = C28351CfB.A00((InterfaceC30923Dia) A06);
                Integer num4 = C05F.A01;
                long A0A = AbstractC25235BEs.A0A(A004, num4);
                D8K d8k = new D8K(17, bx7, this);
                D8K d8k2 = new D8K(16, bx7, A003);
                EnumC25697BXh enumC25697BXh = EnumC25697BXh.A06;
                C25699BXj c25699BXj = new C25699BXj(d8k, 2);
                if (z3) {
                    A03 = A03(A12, C88.A0P, new J8Z(d8k, 0), AbstractC25229BEm.A1W(A003));
                } else {
                    A03 = A03(A12, C88.A0O, C29843DEj.A00, false);
                }
                C51722Yv A005 = C9CU.A00(null, num4, 0, A0A);
                long A0L = AbstractC25230BEn.A0L();
                C51722Yv A006 = C9CU.A00(A005, C05F.A0G, 0, A0L);
                long A0J = AbstractC25229BEm.A0J();
                c26522Bnh = new C26522Bnh(c25699BXj, AbstractC25230BEn.A0e(C9CU.A00(C9CU.A00(C9CU.A00(A006, C05F.A05, 0, A0J), C05F.A0u, 0, A0L), C05F.A1F, 0, A0J), num, C30181DRm.A01(this, 34), null), bx7, enumC25697BXh, C88.A02, A03, A0F, d8k2, null, 1, z3);
            } else {
                throw AbstractC166997dE.A0g();
            }
        }
        return AbstractC25227BEk.A0V(c26522Bnh, A12, c76223bS, A0h);
    }

    public static final C27338C4t A03(C2Z1 c2z1, C88 c88, InterfaceC16820sZ interfaceC16820sZ, boolean z) {
        C87 c87;
        Integer num = C05F.A00;
        Integer num2 = C05F.A0Y;
        if (z) {
            c87 = C87.A0Q;
        } else {
            c87 = C87.A0V;
        }
        return new C27338C4t(c87, C88.A0r, c88, num, num2, num2, num, num, num, num, C05F.A01, AbstractC77623dm.A0F(c2z1, 2131966588), interfaceC16820sZ, true);
    }
}
