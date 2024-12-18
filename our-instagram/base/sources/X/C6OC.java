package X;

import androidx.compose.runtime.snapshots.Snapshot;

/* renamed from: X.6OC, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C6OC {
    public static final void A00(C6MJ c6mj, C5Tl c5Tl, Object obj, InterfaceC16620sF interfaceC16620sF, int i, int i2) {
        int i3;
        InterfaceC16660sJ interfaceC16660sJ;
        c5Tl.Enr(-2079116560);
        if ((i2 & 6) == 0) {
            int i4 = 2;
            if (c5Tl.AH6(obj)) {
                i4 = 4;
            }
            i3 = i4 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            int i5 = 16;
            if (c5Tl.AH2(i)) {
                i5 = 32;
            }
            i3 |= i5;
        }
        if ((i2 & 384) == 0) {
            int i6 = 128;
            if (c5Tl.AH6(c6mj)) {
                i6 = 256;
            }
            i3 |= i6;
        }
        if ((i2 & 3072) == 0) {
            int i7 = 1024;
            if (c5Tl.AH6(interfaceC16620sF)) {
                i7 = C3OO.FLAG_MOVED;
            }
            i3 |= i7;
        }
        if ((i3 & 1171) == 1170 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-1576709928, "androidx.compose.foundation.lazy.layout.LazyLayoutPinnableItem (LazyLayoutPinnableItem.kt:52)");
            }
            boolean AH4 = c5Tl.AH4(obj) | c5Tl.AH4(c6mj);
            Object EEc = c5Tl.EEc();
            if (AH4 || EEc == C5UI.A00) {
                EEc = new C6OD(c6mj, obj);
                ((C117505Tk) c5Tl).A0Q(EEc);
            }
            C6OD c6od = (C6OD) EEc;
            c6od.A00.EWE(i);
            C5UP c5up = C6OH.A00;
            C6OF c6of = (C6OF) C5UT.A01(c5up, C117505Tk.A04((C117505Tk) c5Tl));
            Snapshot A02 = C3Z5.A02();
            C6OD c6od2 = null;
            if (A02 != null) {
                interfaceC16660sJ = A02.A03();
            } else {
                interfaceC16660sJ = null;
            }
            Snapshot A03 = C3Z5.A03(A02);
            try {
                InterfaceC74953Yl interfaceC74953Yl = c6od.A02;
                if (c6of != ((C6OF) interfaceC74953Yl.getValue())) {
                    interfaceC74953Yl.Egh(c6of);
                    if (c6od.A01.BIi() > 0) {
                        InterfaceC74953Yl interfaceC74953Yl2 = c6od.A03;
                        C6OE c6oe = (C6OE) interfaceC74953Yl2.getValue();
                        if (c6oe != null) {
                            c6oe.release();
                        }
                        if (c6of != null) {
                            c6od2 = c6of.E4L();
                        }
                        interfaceC74953Yl2.Egh(c6od2);
                    }
                }
                C3Z5.A06(A02, A03, interfaceC16660sJ);
                boolean AH42 = c5Tl.AH4(c6od);
                Object EEc2 = c5Tl.EEc();
                if (AH42 || EEc2 == C5UI.A00) {
                    EEc2 = new C206929Dx(c6od, 20);
                    c5Tl.FBy(EEc2);
                }
                C5UX.A03(c5Tl, c6od, (InterfaceC16660sJ) EEc2);
                AbstractC117695Ue.A00(c5Tl, c5up.A02(c6od), interfaceC16620sF, ((i3 >> 6) & 112) | 8);
                if (C0fH.A02()) {
                    C0fH.A00(-206744414);
                }
            } catch (Throwable th) {
                C3Z5.A06(A02, A03, interfaceC16660sJ);
                throw th;
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30196DSb(c6mj, obj, interfaceC16620sF, i, i2);
        }
    }
}
