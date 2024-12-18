package X;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.3ZE, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3ZE {
    public final C50525MSe A00;
    public final C0f6 A01;
    public final C5H0 A02;
    public final C3ZP A03;
    public final List A04;
    public final Map A05;
    public final C05A A06;
    public final C0UO A07;
    public final C0UO A08;

    public C3ZE(C50525MSe c50525MSe, C0f6 c0f6, InterfaceC16660sJ interfaceC16660sJ) {
        C5H0 c5h0;
        C14360o3.A0B(c50525MSe, 1);
        C14360o3.A0B(c0f6, 2);
        this.A00 = c50525MSe;
        this.A01 = c0f6;
        if (interfaceC16660sJ != null) {
            c5h0 = (C5H0) interfaceC16660sJ.invoke(this);
        } else {
            c5h0 = null;
        }
        this.A02 = c5h0;
        this.A04 = new ArrayList();
        this.A05 = new LinkedHashMap();
        C008002u c008002u = new C008002u(0);
        this.A06 = c008002u;
        this.A08 = AbstractC208910l.A02(c008002u);
        C3ZP c3zp = new C3ZP(c50525MSe);
        this.A03 = c3zp;
        this.A07 = c3zp.A03;
    }

    public static final void A00(C3ZE c3ze, int i, int i2) {
        List list = c3ze.A04;
        synchronized (list) {
            int i3 = i + 1;
            int i4 = 1;
            if (!list.isEmpty()) {
                i4 = ((List) list.get(0)).size();
            }
            for (int size = list.size(); size < i3; size++) {
                ArrayList arrayList = new ArrayList(i4);
                for (int i5 = 0; i5 < i4; i5++) {
                    arrayList.add(new C3ZR(c3ze.A02, size, i5));
                }
                list.add(arrayList);
                for (int i6 = 0; i6 < i4; i6++) {
                    if (size > 0) {
                        C3ZR c3zr = (C3ZR) ((List) list.get(size - 1)).get(i6);
                        C3ZR c3zr2 = (C3ZR) ((List) list.get(size)).get(i6);
                        c3zr.A00 = c3zr2;
                        c3zr2.A04 = c3zr;
                    }
                    if (i6 < i4 - 1) {
                        C3ZR c3zr3 = (C3ZR) ((List) list.get(size)).get(i6);
                        C3ZR c3zr4 = (C3ZR) ((List) list.get(size)).get(i6 + 1);
                        c3zr3.A03 = c3zr4;
                        c3zr4.A02 = c3zr3;
                    }
                }
            }
            c3ze.A06.Egh(Integer.valueOf(i3));
            int i7 = i2 + 1;
            if (((List) list.get(0)).size() != i7) {
                int size2 = list.size();
                for (int i8 = 0; i8 < size2; i8++) {
                    for (int size3 = ((List) list.get(i8)).size(); size3 < i7; size3++) {
                        C3ZR c3zr5 = new C3ZR(c3ze.A02, i8, size3);
                        ((List) list.get(i8)).add(c3zr5);
                        int i9 = size3 - 1;
                        ((C3ZR) ((List) list.get(i8)).get(i9)).A03 = c3zr5;
                        c3zr5.A02 = (C3ZQ) ((List) list.get(i8)).get(i9);
                        if (i8 > 0) {
                            int i10 = i8 - 1;
                            ((C3ZR) ((List) list.get(i10)).get(size3)).A00 = c3zr5;
                            c3zr5.A04 = (C3ZQ) ((List) list.get(i10)).get(size3);
                        }
                    }
                }
            }
        }
    }

    public final boolean A01(Object obj) {
        C3ZQ c3zq = (C3ZQ) this.A05.get(obj);
        if (c3zq != null) {
            c3zq.DR6(obj);
            C3ZP c3zp = this.A03;
            if (((Boolean) C3ZP.A00(c3zp, c3zp, new C9F5(1, c3zq, c3zp))).booleanValue()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean A02(Object obj) {
        C3ZQ c3zq = (C3ZQ) this.A05.get(obj);
        if (c3zq != null) {
            C3ZP c3zp = this.A03;
            boolean booleanValue = ((Boolean) C3ZP.A00(c3zp, c3zp, new C9F5(2, c3zq, c3zp))).booleanValue();
            c3zq.DR7(obj);
            if (booleanValue) {
                return true;
            }
            return false;
        }
        return false;
    }
}
