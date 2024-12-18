package X;

import android.graphics.DashPathEffect;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import com.facebook.R;

/* renamed from: X.Cf4, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC28346Cf4 {
    public static final long A00 = AbstractC118155Vz.A00(-0.32f, 4294967296L);

    public static final void A00(C5Tl c5Tl, EnumC222619s2 enumC222619s2, InterfaceC16660sJ interfaceC16660sJ, int i, int i2) {
        int i3;
        C14360o3.A0B(interfaceC16660sJ, 1);
        c5Tl.Enr(1760624365);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = AbstractC25232BEp.A0R(c5Tl, enumC222619s2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= AbstractC25232BEp.A0I(c5Tl, interfaceC16660sJ);
        }
        if ((i3 & 19) == 18 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (i4 != 0) {
                enumC222619s2 = EnumC222619s2.A03;
            }
            if (C0fH.A02()) {
                C0fH.A01(1573067588, "com.instagram.creation.capture.quickcapture.sundial.overlay.ui.PostCaptureOverlay (OverlayComposables.kt:47)");
            }
            if (enumC222619s2 != EnumC222619s2.A03) {
                if (enumC222619s2 == EnumC222619s2.A02) {
                    A01(c5Tl, interfaceC16660sJ, (i3 >> 3) & 14, 2, false);
                } else {
                    throw B4Z.A00();
                }
            }
            if (C0fH.A02()) {
                C0fH.A00(-1268541785);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = C30504Dbn.A01(interfaceC16660sJ, enumC222619s2, i2, i, 28);
        }
    }

    public static final void A01(C5Tl c5Tl, InterfaceC16660sJ interfaceC16660sJ, int i, int i2, boolean z) {
        int i3;
        Modifier A02;
        boolean z2 = z;
        C14360o3.A0B(interfaceC16660sJ, 0);
        c5Tl.Enr(-1351109689);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = AbstractC25232BEp.A0H(c5Tl, interfaceC16660sJ) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= AbstractC25232BEp.A0c(c5Tl, z2);
        }
        if ((i3 & 19) == 18 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            z2 = AbstractC25226BEj.A1V(i4, z2);
            if (C0fH.A02()) {
                C0fH.A01(1262931093, "com.instagram.creation.capture.quickcapture.sundial.overlay.ui.FloatingGhostAddTextOverlay (OverlayComposables.kt:58)");
            }
            C62V c62v = new C62V(new C28803CnZ(new DashPathEffect(new float[]{10.0f, 10.0f}, 0.0f)), 2.0f, 4.0f, 0, 0);
            float A01 = C5XT.A01(c5Tl);
            float A022 = C5XT.A02(c5Tl, R.dimen.account_discovery_bottom_gap);
            long A002 = AbstractC118155Vz.A00(C5XT.A02(c5Tl, R.dimen.contextual_sticker_tray_text_size), 4294967296L);
            String A003 = AbstractC136736Hc.A00(c5Tl, 2131955522);
            long A0H = AbstractC25226BEj.A0H(c5Tl);
            C1130158n c1130158n = Modifier.A00;
            if (z2) {
                A02 = AbstractC25226BEj.A0U(c1130158n);
            } else {
                A02 = AbstractC118185Wd.A02(C118195Wf.A09, c1130158n);
            }
            InterfaceC1127857k A0e = AbstractC25228BEl.A0e(c5Tl);
            int A004 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A012 = C5X3.A01(c5Tl, A02);
            InterfaceC16820sZ interfaceC16820sZ = C5X8.A00;
            AbstractC25233BEq.A12(c5Tl, c117505Tk, interfaceC16820sZ);
            InterfaceC16620sF interfaceC16620sF = C5X8.A03;
            InterfaceC16620sF A0q = AbstractC25229BEm.A0q(c5Tl, A0e, A04, interfaceC16620sF);
            InterfaceC16620sF interfaceC16620sF2 = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A004)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A004);
            }
            InterfaceC16620sF A1K = AbstractC25226BEj.A1K(c5Tl, A012);
            float f = 0.0f;
            if (z2) {
                f = 128.0f;
            }
            Modifier A005 = AbstractC28010CWi.A00(c1130158n, 0.0f, f);
            Alignment alignment = C118195Wf.A09;
            Modifier A023 = AbstractC118185Wd.A02(alignment, A005);
            C5XQ A0W = AbstractC25225BEi.A0W(0);
            boolean A1X = AbstractC25234BEr.A1X(c5Tl, 555513875, i3);
            Object EEc = c5Tl.EEc();
            if (A1X || EEc == C5UI.A00) {
                EEc = new C57521Pfv(interfaceC16660sJ, 41);
                c5Tl.FBy(EEc);
            }
            Modifier A006 = CY3.A00(c5Tl, A023, A0W, null, null, AbstractC25225BEi.A1A(c117505Tk, EEc, false), 0.0f, 0.0f, 0.0f, 0.0f, 191, false);
            boolean A1U = AbstractC25228BEl.A1U(c5Tl, c62v, AbstractC25227BEk.A1T(c5Tl, A01, 555518570), c5Tl.AH3(A0H));
            Object EEc2 = c5Tl.EEc();
            if (A1U || EEc2 == C5UI.A00) {
                EEc2 = new DHV(c62v, A01, 1, A0H);
                c5Tl.FBy(EEc2);
            }
            Modifier A007 = CB8.A00(AbstractC119675bQ.A00(A006, AbstractC25225BEi.A1B(c117505Tk, EEc2, false)), 0.4f);
            InterfaceC1127857k A008 = C5XX.A00(alignment, false);
            int A009 = C5X2.A00(c5Tl);
            C59P A042 = C117505Tk.A04(c117505Tk);
            Modifier A013 = C5X3.A01(c5Tl, A007);
            AbstractC25233BEq.A12(c5Tl, c117505Tk, interfaceC16820sZ);
            C5XJ.A00(c5Tl, A008, interfaceC16620sF);
            if (AbstractC25225BEi.A1W(c5Tl, c117505Tk, A042, A0q) || !AbstractC25231BEo.A1O(c5Tl, A009)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A009);
            }
            C5XJ.A00(c5Tl, A013, A1K);
            Modifier A08 = AbstractC118175Wb.A08(c1130158n, A022);
            C118125Vw c118125Vw = C118125Vw.A03;
            C119875bl c119875bl = AbstractC119845bi.A00;
            long A0I = AbstractC25226BEj.A0I(c5Tl);
            C5W5 c5w5 = C5W5.A01;
            long j = A00;
            C5WR.A06(c5Tl, A08, C118125Vw.A00(null, new C62V(null, 17.0f, 3.0f, 2, 1), c118125Vw, c119875bl, c5w5, null, 3, 0, 0, 16727896, A0I, A002, j, 0L), A003);
            C5WR.A06(c5Tl, AbstractC118175Wb.A08(c1130158n, A022), C118125Vw.A00(null, null, c118125Vw, c119875bl, c5w5, null, 3, 0, 0, 16744280, AbstractC25226BEj.A0H(c5Tl), A002, j, 0L), A003);
            if (AbstractC25230BEn.A1T(c5Tl)) {
                C0fH.A00(-41733281);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30215DSu(interfaceC16660sJ, i, i2, 2, z2);
        }
    }
}
