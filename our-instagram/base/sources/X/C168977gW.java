package X;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;

/* renamed from: X.7gW, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C168977gW extends AbstractC51572Yf {
    public final C168887gN A00;
    public final C168137f8 A01;
    public final InterfaceC16590sC A02;
    public final boolean A03;
    public final C3F1 A04;
    public final AbstractC70653Fc A05;
    public final C7LD A06;
    public final C1I4 A07;
    public final C51722Yv A08;
    public final InterfaceC168047ez A09;
    public final AbstractC168967gV A0A;
    public final C168127f7 A0B;
    public final C2Z3 A0C;
    public final C2Z3 A0D;
    public final C2Z3 A0E;
    public final C2Z3 A0F;
    public final Boolean A0G;
    public final Boolean A0H;
    public final Integer A0I;
    public final Integer A0J;
    public final List A0K;
    public final InterfaceC16820sZ A0L;
    public final boolean A0M;
    public final boolean A0N;
    public final boolean A0O;
    public final boolean A0P;
    public final boolean A0Q;

    public C168977gW(C3F1 c3f1, AbstractC70653Fc abstractC70653Fc, C7LD c7ld, C1I4 c1i4, C51722Yv c51722Yv, InterfaceC168047ez interfaceC168047ez, AbstractC168967gV abstractC168967gV, C168887gN c168887gN, C168127f7 c168127f7, C168137f8 c168137f8, C2Z3 c2z3, C2Z3 c2z32, C2Z3 c2z33, C2Z3 c2z34, Boolean bool, Boolean bool2, Integer num, Integer num2, List list, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16590sC interfaceC16590sC, boolean z, boolean z2) {
        C14360o3.A0B(c168887gN, 37);
        this.A0A = abstractC168967gV;
        this.A04 = c3f1;
        this.A05 = abstractC70653Fc;
        this.A0H = bool;
        this.A0G = bool2;
        this.A0E = c2z3;
        this.A0C = c2z32;
        this.A0F = c2z33;
        this.A0J = num;
        this.A0I = num2;
        this.A09 = interfaceC168047ez;
        this.A06 = c7ld;
        this.A08 = c51722Yv;
        this.A02 = interfaceC16590sC;
        this.A0L = interfaceC16820sZ;
        this.A01 = c168137f8;
        this.A07 = c1i4;
        this.A0K = list;
        this.A0B = c168127f7;
        this.A03 = true;
        this.A0N = true;
        this.A0O = true;
        this.A0P = z;
        this.A0M = true;
        this.A0D = c2z34;
        this.A0Q = z2;
        this.A00 = c168887gN;
    }

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        int i;
        int i2;
        int i3;
        C14360o3.A0B(c76223bS, 0);
        C2XE c2xe = c76223bS.A05;
        new C169827hw(c2xe);
        C168997gY c168997gY = (C168997gY) AbstractC77073ct.A00(c76223bS, C168987gX.A00).A03;
        C169007gZ c169007gZ = new C169007gZ(c168997gY, this);
        C169017ga c169017ga = new C169017ga(c168997gY, this);
        C169847hy c169847hy = new C169847hy();
        String[] strArr = {"childrenBuilder"};
        BitSet bitSet = new BitSet(1);
        bitSet.clear();
        c169847hy.A01 = new C206999Ee(this, 20);
        bitSet.set(0);
        InterfaceC16820sZ interfaceC16820sZ = this.A0L;
        if (interfaceC16820sZ != null) {
            c169847hy.A00 = interfaceC16820sZ;
        }
        c169847hy.A02 = c169007gZ;
        c169847hy.A03 = c169017ga;
        AbstractC169877i1.A00(bitSet, strArr, 1);
        C169047gd c169047gd = new C169047gd(c2xe, new C169027gb());
        C169027gb c169027gb = c169047gd.A01;
        c169027gb.A07 = c169847hy;
        BitSet bitSet2 = c169047gd.A02;
        bitSet2.set(0);
        AbstractC168967gV abstractC168967gV = this.A0A;
        c169027gb.A08 = abstractC168967gV.A00;
        c169027gb.A04 = this.A04;
        c169027gb.A05 = this.A05;
        c169027gb.A0G = abstractC168967gV.A01;
        c169027gb.A0C = this.A0H;
        c169027gb.A0B = this.A0G;
        C2Z3 c2z3 = this.A0E;
        if (c2z3 != null) {
            long j = c2z3.A00;
            C2XH c2xh = c76223bS.ArD().A0D;
            C14360o3.A07(c2xh);
            i = C2Z3.A00(c2xh, j);
        } else {
            i = 0;
        }
        c169027gb.A02 = i;
        C2Z3 c2z32 = this.A0C;
        if (c2z32 != null) {
            long j2 = c2z32.A00;
            C2XH c2xh2 = c76223bS.ArD().A0D;
            C14360o3.A07(c2xh2);
            i2 = C2Z3.A00(c2xh2, j2);
        } else {
            i2 = 0;
        }
        c169027gb.A00 = i2;
        C2Z3 c2z33 = this.A0F;
        if (c2z33 != null) {
            long j3 = c2z33.A00;
            C2XH c2xh3 = c76223bS.ArD().A0D;
            C14360o3.A07(c2xh3);
            i3 = C2Z3.A00(c2xh3, j3);
        } else {
            i3 = 0;
        }
        c169027gb.A03 = i3;
        c169027gb.A0E = this.A0J;
        c169027gb.A0D = this.A0I;
        c169027gb.A09 = this.A09;
        c169027gb.A06 = this.A06;
        c169047gd.A06(null);
        C1I4 c1i4 = this.A07;
        if (c1i4 != null) {
            List list = c169027gb.A0F;
            if (list == Collections.EMPTY_LIST) {
                list = new ArrayList();
                c169027gb.A0F = list;
            }
            list.add(c1i4);
        }
        List list2 = this.A0K;
        if (list2 != null) {
            if (c169027gb.A0F.isEmpty()) {
                c169027gb.A0F = list2;
            } else {
                c169027gb.A0F.addAll(list2);
            }
        }
        c169027gb.A0A = this.A0B;
        c169027gb.A0M = this.A0Q;
        C2Z3 c2z34 = this.A0D;
        if (c2z34 != null) {
            int A00 = C2Z3.A00(c76223bS.BoZ(), c2z34.A00);
            if (Integer.valueOf(A00) != null && A00 > 0) {
                c169027gb.A01 = A00;
                if (abstractC168967gV.A02) {
                    c169027gb.A0N = true;
                } else {
                    c169027gb.A0H = true;
                }
                c169027gb.A0J = this.A0N;
                c169027gb.A0K = this.A0O;
                c169027gb.A0L = this.A0P;
                c169027gb.A0I = this.A0M;
            }
        }
        AbstractC77743dy.A00(c169047gd, this.A08);
        AbstractC77733dx.A00(bitSet2, c169047gd.A03, 1);
        c169047gd.A03();
        return c169027gb;
    }
}
