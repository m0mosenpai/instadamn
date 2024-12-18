package X;

import androidx.compose.ui.Modifier;

/* loaded from: classes5.dex */
public abstract class CY7 {
    public static final void A00(int i, int i2, int i3, C5Tl c5Tl, int i4) {
        int i5;
        c5Tl.Enr(-801064855);
        if ((i4 & 6) == 0) {
            i5 = AbstractC25232BEp.A08(c5Tl, i) | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            i5 |= AbstractC25232BEp.A09(c5Tl, i2);
        }
        if ((i4 & 384) == 0) {
            i5 |= AbstractC25236BEt.A03(c5Tl, i3);
        }
        if ((i5 & 147) == 146 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-1579199367, "com.instagram.creation.capture.quickcapture.publiccollections.ItemRow (PublicCollectionsDeprecationBottomSheet.kt:103)");
            }
            C1130158n c1130158n = Modifier.A00;
            Modifier A0E = AbstractC118175Wb.A0E(AbstractC25226BEj.A0T(c1130158n), 34.0f, 0.0f, 34.0f, 24.0f);
            InterfaceC1127857k A02 = AbstractC118375Wz.A02(AbstractC118255Wn.A01, c5Tl, C118195Wf.A05, 0);
            int A00 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, A0E);
            InterfaceC16820sZ interfaceC16820sZ = C5X8.A00;
            AbstractC25233BEq.A12(c5Tl, c117505Tk, interfaceC16820sZ);
            InterfaceC16620sF interfaceC16620sF = C5X8.A03;
            InterfaceC16620sF A0q = AbstractC25229BEm.A0q(c5Tl, A02, A04, interfaceC16620sF);
            InterfaceC16620sF interfaceC16620sF2 = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A00);
            }
            InterfaceC16620sF A1K = AbstractC25226BEj.A1K(c5Tl, A01);
            C6L0 c6l0 = C6L0.A00;
            C5YS.A01(c5Tl, AbstractC118175Wb.A0E(c1130158n, 0.0f, 0.0f, 20.0f, 0.0f), AbstractC25226BEj.A0Y(c5Tl, i5, i), 432, 24, 0L);
            Modifier A002 = c6l0.A00(c1130158n);
            InterfaceC1127857k A0Y = AbstractC25229BEm.A0Y(c5Tl, 0);
            int A003 = C5X2.A00(c5Tl);
            C59P A042 = C117505Tk.A04(c117505Tk);
            Modifier A012 = C5X3.A01(c5Tl, A002);
            AbstractC25233BEq.A12(c5Tl, c117505Tk, interfaceC16820sZ);
            C5XJ.A00(c5Tl, A0Y, interfaceC16620sF);
            if (AbstractC25225BEi.A1W(c5Tl, c117505Tk, A042, A0q) || !AbstractC25231BEo.A1O(c5Tl, A003)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A003);
            }
            C5XJ.A00(c5Tl, A012, A1K);
            C5WR.A0o(c5Tl, AbstractC25226BEj.A0h(c5Tl), C5YD.A00(c5Tl, i2), 5, 16254, 0L);
            C5WR.A0o(c5Tl, AbstractC25226BEj.A0c(c5Tl), C5YD.A00(c5Tl, i3), 5, 16254, 0L);
            if (AbstractC25230BEn.A1T(c5Tl)) {
                C0fH.A00(-1530329753);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DSK(i, i2, i3, i4);
        }
    }

    public static final void A01(C5Tl c5Tl, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, int i) {
        int i2;
        c5Tl.Enr(1488877672);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0H(c5Tl, interfaceC16820sZ) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0I(c5Tl, interfaceC16820sZ2);
        }
        if ((i2 & 19) == 18 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-243728725, "com.instagram.creation.capture.quickcapture.publiccollections.Content (PublicCollectionsDeprecationBottomSheet.kt:69)");
            }
            if (AbstractC25235BEs.A1Y(c5Tl, AbstractC25228BEl.A0W(), new C30485DbU(32, interfaceC16820sZ2, interfaceC16820sZ), -447815190)) {
                C0fH.A00(1991826911);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30507Dbq(interfaceC16820sZ, interfaceC16820sZ2, i, 36);
        }
    }
}
