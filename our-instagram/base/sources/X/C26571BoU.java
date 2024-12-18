package X;

import java.util.List;

/* renamed from: X.BoU, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26571BoU extends AbstractC51572Yf {
    public final C40 A00;
    public final Integer A01;
    public final InterfaceC16660sJ A02;
    public final boolean A03;
    public final boolean A04;
    public final C51722Yv A05;
    public final C7N A06;
    public final InterfaceC16620sF A07;
    public final InterfaceC16600sD A08;
    public final boolean A09;

    public C26571BoU(C51722Yv c51722Yv, C40 c40, C7N c7n, Integer num, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16620sF interfaceC16620sF, InterfaceC16600sD interfaceC16600sD, boolean z, boolean z2, boolean z3) {
        AbstractC167007dF.A1J(c7n, 4, interfaceC16660sJ);
        this.A00 = c40;
        this.A03 = z;
        this.A04 = z2;
        this.A06 = c7n;
        this.A01 = num;
        this.A09 = z3;
        this.A07 = interfaceC16620sF;
        this.A08 = interfaceC16600sD;
        this.A02 = interfaceC16660sJ;
        this.A05 = c51722Yv;
    }

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        Object obj;
        boolean z;
        EnumC27372C6b enumC27372C6b;
        C14360o3.A0B(c76223bS, 0);
        C40 c40 = this.A00;
        C28002CVz c28002CVz = c40.A00;
        if (c28002CVz != null) {
            obj = c28002CVz.A02;
            z = c28002CVz.A03;
        } else {
            obj = C16930sl.A00;
            z = false;
        }
        List list = (List) AbstractC77183d4.A00(c76223bS, C29896DGk.A00(obj, this, 33), AbstractC25228BEl.A1a(obj, z));
        Boolean valueOf = Boolean.valueOf(this.A04);
        InterfaceC16660sJ interfaceC16660sJ = this.A02;
        InterfaceC16660sJ interfaceC16660sJ2 = (InterfaceC16660sJ) C29910DGy.A00(c76223bS, this, new Object[]{valueOf, interfaceC16660sJ, obj}, 8);
        InterfaceC16600sD interfaceC16600sD = (InterfaceC16600sD) C29910DGy.A00(c76223bS, this, new Object[]{valueOf, interfaceC16660sJ, obj}, 10);
        InterfaceC16660sJ interfaceC16660sJ3 = (InterfaceC16660sJ) C29910DGy.A00(c76223bS, this, new Object[]{interfaceC16660sJ, obj}, 11);
        InterfaceC16660sJ interfaceC16660sJ4 = (InterfaceC16660sJ) C29910DGy.A00(c76223bS, this, new Object[]{interfaceC16660sJ, obj}, 9);
        InterfaceC16620sF interfaceC16620sF = (InterfaceC16620sF) C29910DGy.A00(c76223bS, this, new Object[]{interfaceC16660sJ, obj}, 7);
        AbstractC70653Fc abstractC70653Fc = (AbstractC70653Fc) AbstractC77183d4.A00(c76223bS, DEX.A00, AbstractC25225BEi.A1b());
        boolean z2 = c40.A04;
        if (z2) {
            enumC27372C6b = EnumC27372C6b.A03;
        } else {
            enumC27372C6b = EnumC27372C6b.A02;
        }
        int i = Integer.MAX_VALUE;
        if (enumC27372C6b != EnumC27372C6b.A02) {
            abstractC70653Fc = null;
            i = Integer.MIN_VALUE;
        }
        C7N c7n = this.A06;
        boolean z3 = this.A09;
        return new C26576BoZ(abstractC70653Fc, this.A05, enumC27372C6b, c7n, list, C29910DGy.A01(this, 6), null, interfaceC16660sJ2, interfaceC16660sJ3, interfaceC16660sJ4, DQP.A00, interfaceC16620sF, C30465DbA.A00, interfaceC16600sD, i, z3, z2);
    }

    public static final void A03(C28266CdB c28266CdB, C26571BoU c26571BoU, CVV cvv, Integer num, InterfaceC16820sZ interfaceC16820sZ) {
        CWM cwm;
        if (c28266CdB != null && (cwm = c28266CdB.A01) != null) {
            InterfaceC16660sJ interfaceC16660sJ = c26571BoU.A02;
            interfaceC16660sJ.invoke(C27310C3r.A00);
            int intValue = c26571BoU.A01.intValue();
            if (intValue != 0) {
                if (intValue != 1) {
                    if (intValue == 2) {
                        InterfaceC16600sD interfaceC16600sD = c26571BoU.A08;
                        if (num != null) {
                            interfaceC16600sD.invoke(cwm, cvv, Integer.valueOf(num.intValue()), interfaceC16820sZ);
                            return;
                        }
                        return;
                    }
                    return;
                }
                c26571BoU.A07.invoke(cwm, cvv);
                return;
            }
            interfaceC16660sJ.invoke(new C3Z(cwm));
        }
    }
}
