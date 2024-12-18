package X;

import androidx.compose.ui.Modifier;
import com.instagram.settings2.core.viewmodel.SettingsScreenViewModel;

/* loaded from: classes5.dex */
public abstract class CKJ {
    public static final void A00(C5Tl c5Tl, C38688GzT c38688GzT, SettingsScreenViewModel settingsScreenViewModel, InterfaceC57989PnZ interfaceC57989PnZ, InterfaceC16820sZ interfaceC16820sZ, int i, int i2) {
        int i3;
        InterfaceC16820sZ interfaceC16820sZ2 = interfaceC16820sZ;
        boolean A1b = AbstractC25233BEq.A1b(interfaceC57989PnZ, c38688GzT, settingsScreenViewModel);
        c5Tl.Enr(19229050);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = AbstractC25232BEp.A0H(c5Tl, interfaceC57989PnZ) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= AbstractC25232BEp.A0I(c5Tl, c38688GzT);
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= AbstractC25232BEp.A0J(c5Tl, settingsScreenViewModel);
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= AbstractC25232BEp.A0K(c5Tl, interfaceC16820sZ2);
        }
        if ((i3 & 1171) == 1170 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (i4 != 0) {
                interfaceC16820sZ2 = C29821DDn.A00;
            }
            if (C0fH.A02()) {
                C0fH.A01(117172270, "com.instagram.settings2.core.view.SettingBanner (SettingBanner.kt:31)");
            }
            boolean A1W = AbstractC25233BEq.A1W(c5Tl, settingsScreenViewModel, interfaceC57989PnZ, -2109345461);
            Object EEc = c5Tl.EEc();
            if (A1W || EEc == C5UI.A00) {
                EEc = new C43171J6q(settingsScreenViewModel, interfaceC57989PnZ, (InterfaceC23621Ds) null, 21);
                c5Tl.FBy(EEc);
            }
            C117505Tk A0E = AbstractC25235BEs.A0E(c5Tl, EEc, interfaceC57989PnZ);
            C1130158n c1130158n = Modifier.A00;
            Modifier A08 = AbstractC118175Wb.A08(c1130158n, 16.0f);
            InterfaceC1127857k A0b = AbstractC25226BEj.A0b(false);
            int A00 = C5X2.A00(c5Tl);
            C59P A04 = C117505Tk.A04(A0E);
            Modifier A01 = C5X3.A01(c5Tl, A08);
            InterfaceC16820sZ interfaceC16820sZ3 = C5X8.A00;
            AbstractC25233BEq.A12(c5Tl, A0E, interfaceC16820sZ3);
            InterfaceC16620sF interfaceC16620sF = C5X8.A03;
            InterfaceC16620sF A0q = AbstractC25229BEm.A0q(c5Tl, A0b, A04, interfaceC16620sF);
            InterfaceC16620sF interfaceC16620sF2 = C5X8.A02;
            if (A0E.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A00);
            }
            InterfaceC16620sF A1K = AbstractC25226BEj.A1K(c5Tl, A01);
            InterfaceC118335Wv interfaceC118335Wv = AbstractC118255Wn.A02;
            Modifier A0x = AbstractC25232BEp.A0x(c5Tl, AbstractC25228BEl.A0X(AbstractC25225BEi.A0Q(AbstractC28015CWn.A01(c1130158n, C5WF.A01(16.0f), 12.0f, C5XL.A00(c5Tl).A09, C5XL.A00(c5Tl).A09, AbstractC25230BEn.A1O(12.0f))), 16.0f));
            InterfaceC1127857k A0a = AbstractC25230BEn.A0a(interfaceC118335Wv, c5Tl);
            int A002 = C5X2.A00(c5Tl);
            C59P A042 = C117505Tk.A04(A0E);
            Modifier A012 = C5X3.A01(c5Tl, A0x);
            AbstractC25233BEq.A12(c5Tl, A0E, interfaceC16820sZ3);
            C5XJ.A00(c5Tl, A0a, interfaceC16620sF);
            if (AbstractC25225BEi.A1W(c5Tl, A0E, A042, A0q) || !AbstractC25231BEo.A1O(c5Tl, A002)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A002);
            }
            C5XJ.A00(c5Tl, A012, A1K);
            String A013 = AbstractC25703BXn.A01(c5Tl, (C51759Mti) c38688GzT.A03);
            long A0G = AbstractC25226BEj.A0G(c5Tl);
            C5WR.A0R(c5Tl, AbstractC118175Wb.A0E(c1130158n, 16.0f, 16.0f, 16.0f, 0.0f), AbstractC25225BEi.A0X(c5Tl), A013, A0G);
            String A014 = AbstractC25703BXn.A01(c5Tl, (C51759Mti) c38688GzT.A02);
            long A0G2 = AbstractC25226BEj.A0G(c5Tl);
            C5WR.A0R(c5Tl, AbstractC118175Wb.A0D(c1130158n, 16.0f, 4.0f, 0.0f), AbstractC25225BEi.A0Y(c5Tl), A014, A0G2);
            String A015 = AbstractC25703BXn.A01(c5Tl, (C51759Mti) c38688GzT.A01);
            long A0N = AbstractC25226BEj.A0N(c5Tl);
            C118125Vw A0f = AbstractC25226BEj.A0f(c5Tl);
            Modifier A0D = AbstractC118175Wb.A0D(c1130158n, 16.0f, 4.0f, 16.0f);
            boolean A1W2 = AbstractC25233BEq.A1W(c5Tl, settingsScreenViewModel, interfaceC57989PnZ, -1708858502) | AbstractC25233BEq.A1K(i3);
            Object EEc2 = c5Tl.EEc();
            if (A1W2 || EEc2 == C5UI.A00) {
                EEc2 = new C43210J8h(13, settingsScreenViewModel, interfaceC57989PnZ, interfaceC16820sZ2);
                c5Tl.FBy(EEc2);
            }
            C5WR.A0R(c5Tl, C5XR.A05(A0D, null, null, AbstractC25225BEi.A1A(A0E, EEc2, false), A1b), A0f, A015, A0N);
            if (AbstractC25230BEn.A1T(c5Tl)) {
                C0fH.A00(-1445354928);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30492Dbb(c38688GzT, settingsScreenViewModel, interfaceC57989PnZ, interfaceC16820sZ2, i, i2, 24);
        }
    }
}
