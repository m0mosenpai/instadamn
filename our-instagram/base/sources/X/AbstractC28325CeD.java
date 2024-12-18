package X;

import androidx.compose.ui.Modifier;
import com.facebook.R;

/* renamed from: X.CeD, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC28325CeD {
    public static final void A01(C5Tl c5Tl, C54695ODv c54695ODv, int i, int i2) {
        int i3;
        boolean z;
        C14360o3.A0B(c54695ODv, 1);
        c5Tl.Enr(1458656090);
        if ((i2 & 6) == 0) {
            i3 = AbstractC25232BEp.A08(c5Tl, i) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= AbstractC25230BEn.A05(AbstractC25233BEq.A1U(c5Tl, c54695ODv, i2) ? 1 : 0);
        }
        if ((i3 & 19) == 18 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-1933148553, "com.instagram.profilecard.ui.ProfileCardDownloadBottomSheetContent (ProfileCardDownloadBottomSheetContent.kt:27)");
            }
            Modifier A00 = C30711Df9.A00(Modifier.A00, C5XU.A00, 1);
            InterfaceC1127857k A02 = AbstractC119595bH.A02(AbstractC118255Wn.A07, c5Tl, C118195Wf.A02, 0);
            int A002 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, A00);
            AbstractC25233BEq.A11(c5Tl, c117505Tk);
            AbstractC25231BEo.A12(c5Tl, A02, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A002)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A002);
            }
            AbstractC25225BEi.A1K(c5Tl, A01);
            A00(c5Tl, i, i3 & 14);
            String A003 = AbstractC136736Hc.A00(c5Tl, 2131961147);
            c5Tl.Eno(524282954);
            int i4 = i3 & 112;
            boolean z2 = true;
            if (i4 == 32 || ((i3 & 64) != 0 && c5Tl.AH6(c54695ODv))) {
                z = true;
            } else {
                z = false;
            }
            Object EEc = c5Tl.EEc();
            if (z || EEc == C5UI.A00) {
                EEc = AbstractC25230BEn.A0x(c5Tl, c54695ODv, 38);
            }
            A02(c5Tl, A003, AbstractC25225BEi.A1A(c117505Tk, EEc, false), R.drawable.instagram_scan_qr_pano_outline_24, 0);
            String A004 = AbstractC136736Hc.A00(c5Tl, 2131961146);
            c5Tl.Eno(524290482);
            if (i4 != 32 && ((i3 & 64) == 0 || !c5Tl.AH6(c54695ODv))) {
                z2 = false;
            }
            Object EEc2 = c5Tl.EEc();
            if (z2 || EEc2 == C5UI.A00) {
                EEc2 = new C57244PbS(c54695ODv, 39);
                c5Tl.FBy(EEc2);
            }
            A02(c5Tl, A004, AbstractC25225BEi.A1A(c117505Tk, EEc2, false), R.drawable.instagram_user_circle_pano_outline_24, 0);
            if (AbstractC25227BEk.A1R(c5Tl)) {
                C0fH.A00(366914297);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30501Dbk.A01(ASZ, c54695ODv, i, i2, 21);
        }
    }

    public static final void A00(C5Tl c5Tl, int i, int i2) {
        int i3;
        c5Tl.Enr(-1368382139);
        if ((i2 & 6) == 0) {
            i3 = AbstractC25232BEp.A08(c5Tl, i) | i2;
        } else {
            i3 = i2;
        }
        if ((i3 & 3) == 2 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(1491882555, "com.instagram.profilecard.ui.ProfileCardBottomSheetHeader (ProfileCardDownloadBottomSheetContent.kt:42)");
            }
            C1130158n c1130158n = Modifier.A00;
            Modifier A0H = AbstractC25227BEk.A0H(c1130158n, 16.0f);
            InterfaceC1127857k A0d = AbstractC25228BEl.A0d(c5Tl);
            int A00 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, A0H);
            AbstractC25233BEq.A11(c5Tl, c117505Tk);
            AbstractC25231BEo.A12(c5Tl, A0d, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A00);
            }
            AbstractC25225BEi.A1K(c5Tl, A01);
            C5WR.A0K(c5Tl, AbstractC25226BEj.A0T(c1130158n), AbstractC25226BEj.A0h(c5Tl), AbstractC136736Hc.A00(c5Tl, i), 3120, 16240, AbstractC25226BEj.A0G(c5Tl), AbstractC118155Vz.A01(16));
            if (AbstractC25227BEk.A1R(c5Tl)) {
                C0fH.A00(911760026);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30483DbS.A00(ASZ, i, i2, 9);
        }
    }

    public static final void A02(C5Tl c5Tl, String str, InterfaceC16820sZ interfaceC16820sZ, int i, int i2) {
        int i3;
        c5Tl.Enr(1544005200);
        if ((i2 & 6) == 0) {
            i3 = AbstractC25232BEp.A08(c5Tl, i) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= AbstractC25232BEp.A0S(c5Tl, str);
        }
        if ((i2 & 384) == 0) {
            i3 |= AbstractC25232BEp.A0J(c5Tl, interfaceC16820sZ);
        }
        if ((i3 & 147) == 146 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-1789160250, "com.instagram.profilecard.ui.MenuItemRow (ProfileCardDownloadBottomSheetContent.kt:56)");
            }
            C1130158n c1130158n = Modifier.A00;
            boolean A1Q = AbstractC25233BEq.A1Q(c5Tl, -894732967, i3);
            Object EEc = c5Tl.EEc();
            if (A1Q || EEc == C5UI.A00) {
                EEc = AbstractC25230BEn.A0x(c5Tl, interfaceC16820sZ, 37);
            }
            C117505Tk A0K = AbstractC25225BEi.A0K(c5Tl, false);
            Modifier A04 = AbstractC118175Wb.A04(AbstractC25225BEi.A0Q(C5XR.A06(c1130158n, (InterfaceC16820sZ) EEc)));
            InterfaceC1127857k A0d = AbstractC25228BEl.A0d(c5Tl);
            int A00 = C5X2.A00(c5Tl);
            C59P A042 = C117505Tk.A04(A0K);
            Modifier A01 = C5X3.A01(c5Tl, A04);
            AbstractC25233BEq.A11(c5Tl, A0K);
            AbstractC25231BEo.A12(c5Tl, A0d, A042);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (A0K.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A00);
            }
            AbstractC25225BEi.A1K(c5Tl, A01);
            C5YS.A08(c5Tl, AbstractC25227BEk.A0I(c1130158n, 12.0f), AbstractC25226BEj.A0Y(c5Tl, i3, i), str, (i3 & 112) | 384, AbstractC25226BEj.A0F(c5Tl));
            int i4 = ((i3 >> 3) & 14) | 3072;
            C5WR.A0H(c5Tl, null, null, str, 3, i4, 32626, AbstractC25226BEj.A0G(c5Tl), AbstractC118155Vz.A01(16));
            if (AbstractC25227BEk.A1R(c5Tl)) {
                C0fH.A00(-1628928900);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DT2(interfaceC16820sZ, str, i, i2, 11);
        }
    }
}
