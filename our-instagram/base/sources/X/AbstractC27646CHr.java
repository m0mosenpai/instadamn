package X;

import androidx.compose.ui.Modifier;
import com.facebook.common.dextricks.DalvikInternals;

/* renamed from: X.CHr, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC27646CHr {
    public static final void A00(C5Tl c5Tl, Modifier modifier, String str, String str2, String str3, String str4, int i, int i2) {
        int i3;
        Modifier modifier2 = modifier;
        c5Tl.Enr(895675233);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = AbstractC25232BEp.A0R(c5Tl, str) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= AbstractC25232BEp.A0S(c5Tl, str2);
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= AbstractC25232BEp.A0T(c5Tl, str3);
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 7168) == 0) {
            i3 |= AbstractC25232BEp.A0U(c5Tl, str4);
        }
        int i4 = i2 & 16;
        if (i4 != 0) {
            i3 |= DalvikInternals.IOPRIO_BACKGROUND;
        } else if ((57344 & i) == 0) {
            i3 |= AbstractC25232BEp.A0V(c5Tl, modifier2);
        }
        if ((46811 & i3) == 9362 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (i4 != 0) {
                modifier2 = Modifier.A00;
            }
            if (C0fH.A02()) {
                C0fH.A01(-1751085550, "com.instagram.creator.achievements.modules.views.EarnedAchievementListCell (EarnedAchievementListCell.kt:28)");
            }
            InterfaceC118225Wj interfaceC118225Wj = C118195Wf.A04;
            InterfaceC118335Wv interfaceC118335Wv = AbstractC118255Wn.A04;
            Modifier A0A = AbstractC118175Wb.A0A(modifier2, 16.0f, 8.0f);
            InterfaceC1127857k A00 = AbstractC118375Wz.A00(interfaceC118335Wv, c5Tl, interfaceC118225Wj);
            int A002 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, A0A);
            InterfaceC16820sZ interfaceC16820sZ = C5X8.A00;
            AbstractC25233BEq.A12(c5Tl, c117505Tk, interfaceC16820sZ);
            InterfaceC16620sF interfaceC16620sF = C5X8.A03;
            InterfaceC16620sF A0q = AbstractC25229BEm.A0q(c5Tl, A00, A04, interfaceC16620sF);
            InterfaceC16620sF interfaceC16620sF2 = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A002)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A002);
            }
            InterfaceC16620sF A1K = AbstractC25226BEj.A1K(c5Tl, A01);
            InterfaceC118275Wp interfaceC118275Wp = AbstractC118255Wn.A01;
            C1130158n c1130158n = Modifier.A00;
            InterfaceC1127857k A003 = AbstractC118375Wz.A00(interfaceC118275Wp, c5Tl, interfaceC118225Wj);
            int A004 = C5X2.A00(c5Tl);
            C59P A042 = C117505Tk.A04(c117505Tk);
            Modifier A012 = C5X3.A01(c5Tl, c1130158n);
            AbstractC25233BEq.A12(c5Tl, c117505Tk, interfaceC16820sZ);
            C5XJ.A00(c5Tl, A003, interfaceC16620sF);
            if (AbstractC25225BEi.A1W(c5Tl, c117505Tk, A042, A0q) || !AbstractC25231BEo.A1O(c5Tl, A004)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A004);
            }
            C5XJ.A00(c5Tl, A012, A1K);
            C2DB A005 = AbstractC43541zP.A00(c5Tl, AbstractC25225BEi.A0t(str));
            C6LQ.A00(c5Tl, C118195Wf.A09, AbstractC118185Wd.A0C(c1130158n, 76.0f), null, A005, null, null, 0.0f, 3128, 112);
            Modifier A0E = AbstractC118175Wb.A0E(c1130158n, 16.0f, 0.0f, 0.0f, 0.0f);
            InterfaceC1127857k A0Y = AbstractC25229BEm.A0Y(c5Tl, 0);
            int A006 = C5X2.A00(c5Tl);
            C59P A043 = C117505Tk.A04(c117505Tk);
            Modifier A013 = C5X3.A01(c5Tl, A0E);
            AbstractC25233BEq.A12(c5Tl, c117505Tk, interfaceC16820sZ);
            C5XJ.A00(c5Tl, A0Y, interfaceC16620sF);
            if (AbstractC25225BEi.A1W(c5Tl, c117505Tk, A043, A0q) || !AbstractC25231BEo.A1O(c5Tl, A006)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A006);
            }
            C5XJ.A00(c5Tl, A013, A1K);
            C5WR.A0k(c5Tl, AbstractC25226BEj.A0h(c5Tl), str2, (i3 >> 3) & 14, 16382);
            c5Tl.Eno(621131597);
            if (str4 != null) {
                C5WR.A0j(c5Tl, AbstractC25226BEj.A0c(c5Tl), str4);
            }
            C117505Tk.A0L(c117505Tk, false);
            c5Tl.Eno(621137705);
            if (str3 != null) {
                AbstractC25233BEq.A13(c5Tl, str3);
            }
            C117505Tk.A0L(c117505Tk, false);
            c5Tl.ASW();
            if (AbstractC25230BEn.A1T(c5Tl)) {
                C0fH.A00(-175954143);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30242DTv(modifier2, str, str2, str3, str4, i, i2);
        }
    }
}
