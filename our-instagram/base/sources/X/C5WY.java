package X;

import android.content.Context;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* renamed from: X.5WY, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C5WY {
    /* JADX WARN: Type inference failed for: r27v0 */
    /* JADX WARN: Type inference failed for: r27v1, types: [X.0sJ, X.0sZ] */
    /* JADX WARN: Type inference failed for: r27v2 */
    public static final void A00(C5Tl c5Tl, C85233rE c85233rE, EnumC85263rH enumC85263rH, int i, boolean z) {
        int i2;
        C206209Bd c206209Bd;
        InterfaceC16660sJ interfaceC16660sJ;
        C206209Bd c206209Bd2;
        String str;
        C9C8 c9c8;
        C9C8 c9c82;
        C9C8 c9c83;
        String str2;
        String str3;
        C1132359l c1132359l;
        C1132359l c1132359l2;
        c5Tl.Enr(1003865434);
        if ((i & 6) == 0) {
            int i3 = 2;
            if (c5Tl.AH6(c85233rE)) {
                i3 = 4;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            int i4 = 16;
            if (c5Tl.AH5(z)) {
                i4 = 32;
            }
            i2 |= i4;
        }
        if ((i & 384) == 0) {
            int i5 = 128;
            if (c5Tl.AH4(enumC85263rH)) {
                i5 = 256;
            }
            i2 |= i5;
        }
        if ((i2 & 147) == 146 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-1160823382, "com.instagram.feed.adapter.row.ufi.Ufi (MediaUfiComposeBinder.kt:217)");
            }
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            Object A01 = C5UT.A01(AndroidCompositionLocals_androidKt.A03, C117505Tk.A04(c117505Tk));
            Object A012 = C5UT.A01(AbstractC117935Vd.A00, C117505Tk.A04(c117505Tk));
            c5Tl.Eno(-1743565483);
            C85083qw c85083qw = c85233rE.A04;
            InterfaceC16820sZ interfaceC16820sZ = null;
            if (c85083qw.A07) {
                int i6 = c85083qw.A00;
                InterfaceC76613c6 interfaceC76613c6 = c85233rE.A07.A00;
                Object id = interfaceC76613c6.getId();
                c5Tl.Eno(-1743559906);
                boolean AH4 = c5Tl.AH4(id);
                Object EEc = c5Tl.EEc();
                if (AH4 || EEc == C5UI.A00) {
                    int i7 = c85233rE.A09.A02;
                    int min = Math.min(i6 - 1, 4);
                    C119565bE c119565bE = new C119565bE(i7, i6, min, min);
                    C74883Yd A00 = AbstractC74873Yc.A00();
                    InterfaceC09390do interfaceC09390do = AbstractC74903Yf.A01;
                    EEc = new ParcelableSnapshotMutableState(A00, c119565bE);
                    c117505Tk.A0Q(EEc);
                }
                InterfaceC74953Yl interfaceC74953Yl = (InterfaceC74953Yl) EEc;
                C117505Tk.A0L(c117505Tk, false);
                String id2 = interfaceC76613c6.getId();
                c5Tl.Eno(-1743539116);
                boolean AH42 = c5Tl.AH4(interfaceC74953Yl) | c5Tl.AH6(c85233rE);
                Object EEc2 = c5Tl.EEc();
                if (AH42 || EEc2 == C5UI.A00) {
                    EEc2 = new C207189Ex(46, c85233rE, interfaceC74953Yl);
                    c5Tl.FBy(EEc2);
                }
                C117505Tk.A0L(c117505Tk, false);
                C5UX.A03(c5Tl, id2, (InterfaceC16660sJ) EEc2);
                C119565bE c119565bE2 = (C119565bE) interfaceC74953Yl.getValue();
                Integer num = c85083qw.A02.A00;
                c5Tl.Eno(-1743516343);
                if (num == null) {
                    c1132359l = null;
                } else {
                    c1132359l = new C1132359l(AbstractC119585bG.A00(c5Tl, num.intValue()));
                }
                C117505Tk.A0L(c117505Tk, false);
                Integer num2 = c85083qw.A03.A00;
                if (num2 == null) {
                    c1132359l2 = null;
                } else {
                    c1132359l2 = new C1132359l(AbstractC119585bG.A00(c5Tl, num2.intValue()));
                }
                c206209Bd = new C206209Bd(c1132359l, c1132359l2, c119565bE2);
            } else {
                c206209Bd = null;
            }
            C117505Tk.A0L(c117505Tk, false);
            InterfaceC74953Yl A002 = C5WZ.A00(c5Tl, c85233rE.A05);
            c5Tl.Eno(-1743502733);
            boolean z2 = c85233rE.A0M;
            if (z2 && c85233rE.A02 == EnumC85043qs.A05) {
                Object A003 = AbstractC13330mJ.A00((Context) C5UT.A01(AndroidCompositionLocals_androidKt.A01, C117505Tk.A04(c117505Tk)));
                Object A013 = C5UT.A01(AbstractC117915Vb.A00, C117505Tk.A04(c117505Tk));
                String id3 = c85233rE.A07.A00.getId();
                c5Tl.Eno(-1743492950);
                if (id3 != null) {
                    c5Tl.Eno(-241962559);
                    boolean AH6 = c5Tl.AH6(A012) | c5Tl.AH6(A013) | c5Tl.AH4(id3);
                    Object EEc3 = c5Tl.EEc();
                    if (AH6 || EEc3 == C5UI.A00) {
                        EEc3 = new C9G2(A012, A013, id3, 17);
                        c5Tl.FBy(EEc3);
                    }
                    interfaceC16820sZ = (InterfaceC16820sZ) EEc3;
                    C117505Tk.A0L(c117505Tk, false);
                }
                C117505Tk.A0L(c117505Tk, false);
                interfaceC16660sJ = 0;
                C2DB A02 = AbstractC43541zP.A02(c5Tl, c85233rE.A01, null, null, null, 0, 126, 0L, false, false);
                c5Tl.Eno(-1743482523);
                boolean AH43 = c5Tl.AH4(A002) | c5Tl.AH6(A003);
                Object EEc4 = c5Tl.EEc();
                if (AH43 || EEc4 == C5UI.A00) {
                    EEc4 = new C9FA(44, A003, A002);
                    c5Tl.FBy(EEc4);
                }
                C117505Tk.A0L(c117505Tk, false);
                c206209Bd2 = new C206209Bd(A02, (InterfaceC16820sZ) EEc4, interfaceC16820sZ);
            } else {
                interfaceC16660sJ = 0;
                c206209Bd2 = null;
            }
            C117505Tk.A0L(c117505Tk, false);
            boolean z3 = c85233rE.A0G;
            if (c85233rE.A0R) {
                str = c85233rE.A0C;
            } else {
                str = interfaceC16660sJ;
            }
            InterfaceC16820sZ interfaceC16820sZ2 = ((C85103qy) A002.getValue()).A01;
            c5Tl.Eno(-1743473600);
            boolean AH44 = c5Tl.AH4(A002) | c5Tl.AH6(A01);
            Object EEc5 = c5Tl.EEc();
            if (AH44 || EEc5 == C5UI.A00) {
                EEc5 = new C207189Ex(41, A01, A002);
                c5Tl.FBy(EEc5);
            }
            C117505Tk.A0L(c117505Tk, false);
            C9C8 c9c84 = new C9C8(str, interfaceC16820sZ2, (InterfaceC16660sJ) EEc5, interfaceC16660sJ, interfaceC16660sJ, interfaceC16660sJ, 28, z3);
            c5Tl.Eno(-1743460457);
            if (c85233rE.A0F) {
                c5Tl.Eno(-1743458102);
                boolean AH45 = c5Tl.AH4(A002);
                Object EEc6 = c5Tl.EEc();
                if (AH45 || EEc6 == C5UI.A00) {
                    EEc6 = new C206849Dp(A002, 6);
                    c5Tl.FBy(EEc6);
                }
                InterfaceC16660sJ interfaceC16660sJ2 = (InterfaceC16660sJ) EEc6;
                C117505Tk.A0L(c117505Tk, false);
                c5Tl.Eno(-1743455819);
                boolean AH46 = c5Tl.AH4(A002) | c5Tl.AH6(A01);
                Object EEc7 = c5Tl.EEc();
                if (AH46 || EEc7 == C5UI.A00) {
                    EEc7 = new C207189Ex(42, A01, A002);
                    c5Tl.FBy(EEc7);
                }
                InterfaceC16660sJ interfaceC16660sJ3 = (InterfaceC16660sJ) EEc7;
                C117505Tk.A0L(c117505Tk, false);
                if (c85233rE.A0Q) {
                    str3 = c85233rE.A0B;
                } else {
                    str3 = interfaceC16660sJ;
                }
                c9c8 = new C9C8(str3, interfaceC16660sJ, interfaceC16660sJ2, interfaceC16660sJ, interfaceC16660sJ, interfaceC16660sJ3, 78, false);
            } else {
                c9c8 = interfaceC16660sJ;
            }
            C117505Tk.A0L(c117505Tk, false);
            c5Tl.Eno(-1743441907);
            if (z2) {
                c5Tl.Eno(-1743439856);
                boolean AH62 = c5Tl.AH6(c85233rE) | c5Tl.AH4(A002);
                Object EEc8 = c5Tl.EEc();
                if (AH62 || EEc8 == C5UI.A00) {
                    EEc8 = new C207189Ex(43, c85233rE, A002);
                    c5Tl.FBy(EEc8);
                }
                InterfaceC16660sJ interfaceC16660sJ4 = (InterfaceC16660sJ) EEc8;
                C117505Tk.A0L(c117505Tk, false);
                c5Tl.Eno(-1743430454);
                boolean AH47 = c5Tl.AH4(A002);
                Object EEc9 = c5Tl.EEc();
                if (AH47 || EEc9 == C5UI.A00) {
                    EEc9 = new C206849Dp(A002, 7);
                    c5Tl.FBy(EEc9);
                }
                InterfaceC16660sJ interfaceC16660sJ5 = (InterfaceC16660sJ) EEc9;
                C117505Tk.A0L(c117505Tk, false);
                c5Tl.Eno(-1743428200);
                boolean AH48 = c5Tl.AH4(A002) | c5Tl.AH6(A01);
                Object EEc10 = c5Tl.EEc();
                if (AH48 || EEc10 == C5UI.A00) {
                    EEc10 = new C207189Ex(44, A01, A002);
                    c5Tl.FBy(EEc10);
                }
                InterfaceC16660sJ interfaceC16660sJ6 = (InterfaceC16660sJ) EEc10;
                C117505Tk.A0L(c117505Tk, false);
                c5Tl.Eno(-1743423501);
                boolean AH49 = c5Tl.AH4(A002) | c5Tl.AH6(A01);
                Object EEc11 = c5Tl.EEc();
                if (AH49 || EEc11 == C5UI.A00) {
                    EEc11 = new C207189Ex(45, A01, A002);
                    c5Tl.FBy(EEc11);
                }
                InterfaceC16660sJ interfaceC16660sJ7 = (InterfaceC16660sJ) EEc11;
                C117505Tk.A0L(c117505Tk, false);
                if (c85233rE.A0S) {
                    str2 = c85233rE.A0D;
                } else {
                    str2 = interfaceC16660sJ;
                }
                c9c82 = new C9C8(str2, interfaceC16660sJ, interfaceC16660sJ4, interfaceC16660sJ5, interfaceC16660sJ6, interfaceC16660sJ7, 66, false);
            } else {
                c9c82 = interfaceC16660sJ;
            }
            C117505Tk.A0L(c117505Tk, false);
            c5Tl.Eno(-1743410506);
            if (c85233rE.A0K) {
                boolean z4 = c85233rE.A0L;
                c5Tl.Eno(-1743406489);
                boolean AH410 = c5Tl.AH4(A002);
                Object EEc12 = c5Tl.EEc();
                if (AH410 || EEc12 == C5UI.A00) {
                    EEc12 = new C206849Dp(A002, 8);
                    c5Tl.FBy(EEc12);
                }
                InterfaceC16660sJ interfaceC16660sJ8 = (InterfaceC16660sJ) EEc12;
                C117505Tk.A0L(c117505Tk, false);
                c5Tl.Eno(-1743404405);
                boolean AH411 = c5Tl.AH4(A002);
                Object EEc13 = c5Tl.EEc();
                if (AH411 || EEc13 == C5UI.A00) {
                    EEc13 = new C206849Dp(A002, 9);
                    c5Tl.FBy(EEc13);
                }
                C117505Tk.A0L(c117505Tk, false);
                c9c83 = new C9C8(interfaceC16660sJ, interfaceC16660sJ, interfaceC16660sJ8, interfaceC16660sJ, (InterfaceC16660sJ) EEc13, interfaceC16660sJ, 116, z4);
            } else {
                c9c83 = interfaceC16660sJ;
            }
            C117505Tk.A0L(c117505Tk, false);
            AbstractC118165Wa.A02(c5Tl, c206209Bd2, c206209Bd, c9c84, c9c8, c9c82, c9c83, enumC85263rH, (57344 & (i2 << 6)) | ((i2 << 18) & 29360128), 0, z);
            if (C0fH.A02()) {
                C0fH.A00(-695014902);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C118765Yv(c85233rE, enumC85263rH, i, z);
        }
    }
}
