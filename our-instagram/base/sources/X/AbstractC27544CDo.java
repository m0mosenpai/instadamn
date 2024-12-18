package X;

import androidx.compose.ui.Modifier;
import com.facebook.common.dextricks.DalvikInternals;

/* renamed from: X.CDo, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC27544CDo {
    public static final void A00(C5Tl c5Tl, Modifier modifier, C2DC c2dc, C26032BfL c26032BfL, String str, InterfaceC16820sZ interfaceC16820sZ, int i, int i2) {
        int i3;
        long A02;
        long A022;
        C26032BfL c26032BfL2 = c26032BfL;
        Modifier modifier2 = modifier;
        AbstractC167007dF.A1K(interfaceC16820sZ, c2dc);
        c5Tl.Enr(-437200455);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = AbstractC25232BEp.A0H(c5Tl, interfaceC16820sZ) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= AbstractC25232BEp.A0I(c5Tl, c2dc);
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= AbstractC25232BEp.A0T(c5Tl, str);
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= AbstractC25232BEp.A0U(c5Tl, modifier2);
        }
        int i5 = i2 & 16;
        if (i5 != 0) {
            i3 |= DalvikInternals.IOPRIO_BACKGROUND;
        } else if ((i & DalvikInternals.IOPRIO_BACKGROUND) == 0) {
            i3 |= AbstractC25232BEp.A0V(c5Tl, c26032BfL2);
        }
        if ((i3 & 9363) == 9362 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (i4 != 0) {
                modifier2 = Modifier.A00;
            }
            if (i5 != 0) {
                c26032BfL2 = C26032BfL.A04;
            }
            if (C0fH.A02()) {
                C0fH.A01(-1898372839, "com.instagram.barcelona.common.ui.button.IconButtonOnMedia (IconButtonOnMedia.kt:29)");
            }
            Modifier A0C = AbstractC118185Wd.A0C(AbstractC118635Yc.A02(c5Tl, modifier2, AbstractC25225BEi.A0W(0), interfaceC16820sZ), c26032BfL2.A01);
            A02 = C5AC.A02(AbstractC1132459m.A0K[(int) (r0 & 63)], C1132359l.A03(r0), C1132359l.A02(r0), C1132359l.A01(C1132359l.A01), 0.4f);
            C5WI c5wi = C5WF.A00;
            Modifier A01 = C6L3.A01(A0C, c5wi, A02);
            A022 = C5AC.A02(AbstractC1132459m.A0K[(int) (r0 & 63)], C1132359l.A03(r0), C1132359l.A02(r0), C1132359l.A01(C1132359l.A09), 0.2f);
            Modifier A012 = C6L3.A01(A01, c5wi, A022);
            InterfaceC1127857k A0a = AbstractC25226BEj.A0a(false);
            int A00 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A013 = C5X3.A01(c5Tl, A012);
            AbstractC25233BEq.A11(c5Tl, c117505Tk);
            AbstractC25231BEo.A12(c5Tl, A0a, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A00);
            }
            AbstractC25225BEi.A1K(c5Tl, A013);
            C5YS.A08(c5Tl, AbstractC118185Wd.A0C(Modifier.A00, c26032BfL2.A00), c2dc, str, AbstractC25225BEi.A01(i3 >> 3), AbstractC25233BEq.A07(c5Tl, AbstractC25226BEj.A0D(c5Tl)));
            if (AbstractC25227BEk.A1R(c5Tl)) {
                C0fH.A00(-1256949210);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DVE(c2dc, c26032BfL2, interfaceC16820sZ, modifier2, str, i, i2, 5);
        }
    }
}
