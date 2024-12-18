package X;

import androidx.compose.ui.Modifier;

/* renamed from: X.CGs, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC27621CGs {
    public static final void A00(C5Tl c5Tl, InterfaceC16620sF interfaceC16620sF, int i, int i2, int i3, int i4, int i5) {
        int i6;
        InterfaceC16620sF interfaceC16620sF2 = interfaceC16620sF;
        c5Tl.Enr(1252292545);
        if ((i5 & 1) != 0) {
            i6 = i4 | 6;
        } else if ((i4 & 6) == 0) {
            i6 = AbstractC25232BEp.A08(c5Tl, i) | i4;
        } else {
            i6 = i4;
        }
        if ((i5 & 2) != 0) {
            i6 |= 48;
        } else if ((i4 & 48) == 0) {
            i6 |= AbstractC25232BEp.A09(c5Tl, i2);
        }
        if ((i5 & 4) != 0) {
            i6 |= 384;
        } else if ((i4 & 384) == 0) {
            i6 |= AbstractC25236BEt.A03(c5Tl, i3);
        }
        int i7 = i5 & 8;
        if (i7 != 0) {
            i6 |= 3072;
        } else if ((i4 & 3072) == 0) {
            i6 |= AbstractC25232BEp.A0K(c5Tl, interfaceC16620sF2);
        }
        if ((i6 & 1171) == 1170 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (i7 != 0) {
                interfaceC16620sF2 = AbstractC27786CNb.A01;
            }
            if (C0fH.A02()) {
                C0fH.A01(1991977215, "com.instagram.creation.genai.attribution.bottomsheet.ListCell (CreatedWithAIBottomSheetFragment.kt:137)");
            }
            C1130158n c1130158n = Modifier.A00;
            Modifier A04 = AbstractC118175Wb.A04(c1130158n);
            InterfaceC1127857k A02 = AbstractC118375Wz.A02(AbstractC118255Wn.A01, c5Tl, C118195Wf.A05, 0);
            int A00 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A042 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, A04);
            InterfaceC16820sZ interfaceC16820sZ = C5X8.A00;
            AbstractC25233BEq.A12(c5Tl, c117505Tk, interfaceC16820sZ);
            InterfaceC16620sF interfaceC16620sF3 = C5X8.A03;
            InterfaceC16620sF A0q = AbstractC25229BEm.A0q(c5Tl, A02, A042, interfaceC16620sF3);
            InterfaceC16620sF interfaceC16620sF4 = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF4, A00);
            }
            InterfaceC16620sF A1K = AbstractC25226BEj.A1K(c5Tl, A01);
            C5YS.A06(c5Tl, AbstractC118175Wb.A0E(c1130158n, 0.0f, 7.0f, 12.0f, 0.0f), AbstractC25226BEj.A0Y(c5Tl, i6, i), AbstractC25226BEj.A0F(c5Tl));
            InterfaceC1127857k A0Y = AbstractC25229BEm.A0Y(c5Tl, 0);
            int A002 = C5X2.A00(c5Tl);
            C59P A043 = C117505Tk.A04(c117505Tk);
            Modifier A012 = C5X3.A01(c5Tl, c1130158n);
            AbstractC25233BEq.A12(c5Tl, c117505Tk, interfaceC16820sZ);
            C5XJ.A00(c5Tl, A0Y, interfaceC16620sF3);
            if (AbstractC25225BEi.A1W(c5Tl, c117505Tk, A043, A0q) || !AbstractC25231BEo.A1O(c5Tl, A002)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF4, A002);
            }
            C5XJ.A00(c5Tl, A012, A1K);
            C5WR.A0u(c5Tl, AbstractC25226BEj.A0g(c5Tl), AbstractC136736Hc.A00(c5Tl, i2), AbstractC25226BEj.A0G(c5Tl));
            AbstractC25236BEt.A0l(c5Tl, AbstractC136736Hc.A00(c5Tl, i3));
            AbstractC25231BEo.A14(c5Tl, interfaceC16620sF2, i6 >> 9);
            if (AbstractC25227BEk.A1R(c5Tl)) {
                C0fH.A00(-1190625771);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DTD(interfaceC16620sF2, i, i2, i3, i4, i5);
        }
    }
}
