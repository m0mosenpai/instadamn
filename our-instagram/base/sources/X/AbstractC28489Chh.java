package X;

import android.graphics.Picture;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusChangedElement;
import com.facebook.R;
import com.facebook.common.dextricks.DalvikInternals;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.direct.fragment.thread.threaddetail.customization.ThreadDetailCustomGroupNameAndImageViewModel$PickerItem$EmojiItem;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Chh, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC28489Chh {
    public static final void A01(C5Tl c5Tl, AbstractC59962oe abstractC59962oe, L7D l7d, C44538Jmi c44538Jmi, FPE fpe, int i) {
        int i2;
        boolean z;
        C14360o3.A0B(fpe, 0);
        AbstractC167027dH.A13(c44538Jmi, abstractC59962oe, l7d);
        c5Tl.Enr(-177912250);
        if ((i & 6) == 0) {
            i2 = AbstractC25230BEn.A04(AbstractC25233BEq.A1T(c5Tl, fpe, i) ? 1 : 0) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0I(c5Tl, c44538Jmi);
        }
        if ((i & 384) == 0) {
            i2 |= AbstractC25232BEp.A0J(c5Tl, abstractC59962oe);
        }
        if ((i & 3072) == 0) {
            i2 |= AbstractC25232BEp.A0K(c5Tl, l7d);
        }
        if ((i2 & 1171) == 1170 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-1472120524, "com.instagram.direct.fragment.thread.threaddetail.customization.CustomGroupNameAndImage (DirectCustomGroupNameAndImage.kt:93)");
            }
            Modifier A0V = AbstractC25228BEl.A0V();
            InterfaceC1127857k A0e = AbstractC25228BEl.A0e(c5Tl);
            int A00 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, A0V);
            AbstractC25233BEq.A11(c5Tl, c117505Tk);
            AbstractC25231BEo.A12(c5Tl, A0e, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A00);
            }
            AbstractC25225BEi.A1K(c5Tl, A01);
            boolean z2 = true;
            InterfaceC74963Ym A02 = C6IB.A02(c5Tl, c44538Jmi.A07, 0);
            Object A19 = AbstractC25226BEj.A19(c5Tl);
            boolean z3 = ((C32072E6y) A02.getValue()).A07;
            boolean A1Z = AbstractC25227BEk.A1Z(c5Tl, l7d, -303871097);
            int i3 = i2 & 14;
            if (i3 == 4 || ((i2 & 8) != 0 && c5Tl.AH6(fpe))) {
                z = true;
            } else {
                z = false;
            }
            boolean z4 = A1Z | z;
            Object EEc = c5Tl.EEc();
            if (z4 || EEc == C5UI.A00) {
                EEc = new C50170MDx(0, fpe, l7d);
                c5Tl.FBy(EEc);
            }
            InterfaceC16820sZ A1A = AbstractC25225BEi.A1A(c117505Tk, EEc, false);
            boolean A1X = AbstractC25226BEj.A1X(c5Tl, A19, AbstractC25233BEq.A1W(c5Tl, l7d, c44538Jmi, -303865242));
            if (i3 != 4 && ((i2 & 8) == 0 || !c5Tl.AH6(fpe))) {
                z2 = false;
            }
            boolean z5 = A1X | z2;
            Object EEc2 = c5Tl.EEc();
            if (z5 || EEc2 == C5UI.A00) {
                EEc2 = new ME7(43, A19, c44538Jmi, fpe, l7d);
                c5Tl.FBy(EEc2);
            }
            A07(c5Tl, A1A, AbstractC25225BEi.A1A(c117505Tk, EEc2, false), 0, z3);
            A03(c5Tl, (ImageUrl) ((C32072E6y) A02.getValue()).A01, l7d, fpe, (File) ((C32072E6y) A02.getValue()).A02, (List) ((C32072E6y) A02.getValue()).A03, i3 | (458752 & (i2 << 6)), ((C32072E6y) A02.getValue()).A08);
            int i4 = i2 << 3;
            A04(c5Tl, l7d, fpe, ((C32072E6y) A02.getValue()).A05, (i4 & 112) | ((i2 >> 3) & 896));
            Object EEc3 = c5Tl.EEc();
            Object obj = C5UI.A00;
            C19L c19l = ((C137536Kz) AbstractC25234BEr.A0b(c5Tl, EEc3, obj)).A00;
            List list = (List) ((C32072E6y) A02.getValue()).A04;
            boolean A1X2 = AbstractC25226BEj.A1X(c5Tl, c44538Jmi, AbstractC25233BEq.A1W(c5Tl, c19l, A19, -303835615));
            Object EEc4 = c5Tl.EEc();
            if (A1X2 || EEc4 == obj) {
                EEc4 = new C50364MLq(14, c19l, A19, c44538Jmi);
                c5Tl.FBy(EEc4);
            }
            A02(c5Tl, abstractC59962oe, l7d, fpe, list, AbstractC25225BEi.A1B(c117505Tk, EEc4, false), AbstractC25231BEo.A06(i4, i3));
            if (AbstractC25227BEk.A1R(c5Tl)) {
                C0fH.A00(648708372);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30491Dba(c44538Jmi, l7d, fpe, abstractC59962oe, i, 12);
        }
    }

    public static final void A03(C5Tl c5Tl, ImageUrl imageUrl, L7D l7d, FPE fpe, File file, List list, int i, boolean z) {
        int i2;
        ImageUrl imageUrl2;
        boolean z2;
        C14360o3.A0B(fpe, 0);
        AbstractC167007dF.A1G(list, 4, l7d);
        c5Tl.Enr(1307114443);
        if ((i & 6) == 0) {
            i2 = AbstractC25230BEn.A04(AbstractC25233BEq.A1T(c5Tl, fpe, i) ? 1 : 0) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0I(c5Tl, file);
        }
        if ((i & 384) == 0) {
            i2 |= AbstractC25232BEp.A0d(c5Tl, z);
        }
        if ((i & 3072) == 0) {
            i2 |= AbstractC25232BEp.A0U(c5Tl, imageUrl);
        }
        if ((i & DalvikInternals.IOPRIO_BACKGROUND) == 0) {
            i2 |= AbstractC25232BEp.A0L(c5Tl, list);
        }
        if ((196608 & i) == 0) {
            i2 |= AbstractC25232BEp.A0M(c5Tl, l7d);
        }
        if ((74899 & i2) == 74898 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-986025622, "com.instagram.direct.fragment.thread.threaddetail.customization.PendingProfilePhoto (DirectCustomGroupNameAndImage.kt:146)");
            }
            C14360o3.A0C(AbstractC25226BEj.A19(c5Tl), AbstractC43591JPw.A00(4));
            AbstractC12990ll A0d = AbstractC25229BEm.A0d(c5Tl);
            C1130158n c1130158n = Modifier.A00;
            C5WI c5wi = C5WF.A00;
            Modifier A0C = AbstractC118185Wd.A0C(C6L2.A01(c1130158n, c5wi), 96.0f);
            String A00 = C5YD.A00(c5Tl, 2131963309);
            boolean A1Y = AbstractC25227BEk.A1Y(c5Tl, A00, -752397060);
            Object EEc = c5Tl.EEc();
            if (A1Y || EEc == C5UI.A00) {
                EEc = AbstractC25230BEn.A13(c5Tl, A00, 27);
            }
            C117505Tk A0K = AbstractC25225BEi.A0K(c5Tl, false);
            Modifier A002 = AnonymousClass598.A00(c1130158n, (InterfaceC16660sJ) EEc, false);
            InterfaceC1127857k A0b = AbstractC25226BEj.A0b(false);
            int A003 = C5X2.A00(c5Tl);
            C59P A04 = C117505Tk.A04(A0K);
            Modifier A01 = C5X3.A01(c5Tl, A002);
            AbstractC25233BEq.A11(c5Tl, A0K);
            AbstractC25231BEo.A12(c5Tl, A0b, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (A0K.A0K || !AbstractC25231BEo.A1O(c5Tl, A003)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A003);
            }
            AbstractC25225BEi.A1K(c5Tl, A01);
            C119645bN c119645bN = C119645bN.A00;
            if (file != null) {
                imageUrl2 = AbstractC81033jX.A01(file);
            } else {
                imageUrl2 = imageUrl;
            }
            if (imageUrl2 != null) {
                c5Tl.Eno(197668722);
                C6LQ.A03(c5Tl, A0C, AbstractC43541zP.A00(c5Tl, imageUrl2));
                C2DC A004 = C5Y7.A00(c5Tl, R.drawable.instagram_circle_x_pano_filled_24, 0);
                String A005 = C5YD.A00(c5Tl, 2131955185);
                Modifier A012 = C6L3.A01(C6L7.A03(c119645bN.AB5(C118195Wf.A0D, c1130158n), c5wi, 3.0f, AbstractC25226BEj.A09(c5Tl)), c5wi, AbstractC25226BEj.A09(c5Tl));
                C5XQ A0W = AbstractC25225BEi.A0W(0);
                boolean A1W = AbstractC25233BEq.A1W(c5Tl, l7d, file, 1807515103);
                if ((i2 & 14) == 4 || ((i2 & 8) != 0 && c5Tl.AH6(fpe))) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                boolean z3 = A1W | z2;
                Object EEc2 = c5Tl.EEc();
                if (z3 || EEc2 == C5UI.A00) {
                    EEc2 = new ME4(6, fpe, l7d, file);
                    c5Tl.FBy(EEc2);
                }
                C5YS.A09(c5Tl, AbstractC118635Yc.A02(c5Tl, A012, A0W, AbstractC25225BEi.A1A(A0K, EEc2, false)), A004, A005, AbstractC25226BEj.A0F(c5Tl));
            } else if (z && C18U.A06(C06090Tz.A05, A0d, 36327576418925250L)) {
                c5Tl.Eno(198904196);
                C5Hc A006 = AbstractC133095zb.A00(list);
                CGI.A00(c5Tl, C7Y.A04, C7I.A03, A006, 112.0f, 0, 28080, 224, 0L, false, false);
            } else {
                c5Tl.Eno(199204369);
                ArrayList A1E = AbstractC166987dD.A1E();
                for (Object obj : list) {
                    if (obj != null) {
                        A1E.add(obj);
                    }
                }
                if (AbstractC25226BEj.A1b(A1E)) {
                    A06(c5Tl, A1E, (i2 >> 6) & 14, z);
                }
            }
            if (AbstractC25230BEn.A1U(c5Tl, A0K, false)) {
                C0fH.A00(-1958344122);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DV6(imageUrl, fpe, l7d, file, list, i, 3, z);
        }
    }

    public static final void A04(C5Tl c5Tl, L7D l7d, FPE fpe, String str, int i) {
        int i2;
        String str2;
        AbstractC167007dF.A1D(fpe, 1, l7d);
        c5Tl.Enr(-1671256732);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0R(c5Tl, str) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25230BEn.A05(AbstractC25233BEq.A1U(c5Tl, fpe, i) ? 1 : 0);
        }
        if ((i & 384) == 0) {
            i2 |= AbstractC25232BEp.A0J(c5Tl, l7d);
        }
        if ((i2 & 147) == 146 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-1991586881, "com.instagram.direct.fragment.thread.threaddetail.customization.GroupName (DirectCustomGroupNameAndImage.kt:382)");
            }
            Object A0q = AbstractC25227BEk.A0q(c5Tl, -265986117);
            Object obj = C5UI.A00;
            C25338BJh c25338BJh = (C25338BJh) AbstractC25231BEo.A0l(c5Tl, A0q, obj);
            C117505Tk A0J = AbstractC25225BEi.A0J(c5Tl);
            if (str == null) {
                str2 = "";
            } else {
                str2 = str;
            }
            c5Tl.Eno(-265982604);
            boolean z = true;
            boolean A1P = AbstractC167007dF.A1P(i2 & 14, 4);
            if ((i2 & 112) != 32 && ((i2 & 64) == 0 || !c5Tl.AH6(fpe))) {
                z = false;
            }
            boolean z2 = A1P | z;
            Object EEc = c5Tl.EEc();
            if (z2 || EEc == obj) {
                EEc = new C50269MHy(str, fpe, 38);
                c5Tl.FBy(EEc);
            }
            InterfaceC16660sJ interfaceC16660sJ = (InterfaceC16660sJ) EEc;
            C117505Tk.A0I(A0J);
            String A00 = C5YD.A00(c5Tl, 2131959539);
            Modifier A0X = AbstractC25230BEn.A0X(AbstractC118175Wb.A0E(Modifier.A00, 0.0f, 16.0f, 0.0f, 8.0f), c25338BJh);
            boolean A1Z = AbstractC25227BEk.A1Z(c5Tl, l7d, -265969079);
            Object EEc2 = c5Tl.EEc();
            if (A1Z || EEc2 == obj) {
                EEc2 = new C50359MLl(l7d, 26);
                c5Tl.FBy(EEc2);
            }
            C117505Tk.A0I(A0J);
            AbstractC28505Chy.A01(null, null, null, c5Tl, A0X.Eq3(new FocusChangedElement((InterfaceC16660sJ) EEc2)), null, null, null, null, str2, A00, null, null, interfaceC16660sJ, 0, 0, 805306368, 0, 65008, true);
            if (C0fH.A02()) {
                C0fH.A00(782747373);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DT4(l7d, fpe, str, i, 11);
        }
    }

    public static final void A06(C5Tl c5Tl, List list, int i, boolean z) {
        int i2;
        ImageUrl imageUrl;
        C2DB c2db;
        C14360o3.A0B(list, 1);
        c5Tl.Enr(-1277023244);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0b(c5Tl, z) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0I(c5Tl, list);
        }
        if ((i2 & 19) == 18 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(530948318, "com.instagram.direct.fragment.thread.threaddetail.customization.MembersFacepile (DirectCustomGroupNameAndImage.kt:195)");
            }
            ImageUrl imageUrl2 = (ImageUrl) list.get(0);
            if (list.size() > 1) {
                imageUrl = (ImageUrl) list.get(1);
            } else {
                imageUrl = null;
            }
            C2DB A00 = AbstractC43541zP.A00(c5Tl, imageUrl2);
            c5Tl.Eno(-878893680);
            if (imageUrl != null) {
                c2db = AbstractC43541zP.A00(c5Tl, imageUrl);
            } else {
                c2db = null;
            }
            AbstractC25225BEi.A1V(c5Tl, false);
            BII.A01(c5Tl, null, A00, c2db, 100.0f, 0.0f, 0.75f, (1879048192 & (i2 << 27)) | 12582918, 340, AbstractC25226BEj.A09(c5Tl), 0L, false, z);
            if (C0fH.A02()) {
                C0fH.A00(-736956213);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30502Dbl.A01(ASZ, list, i, 12, z);
        }
    }

    public static final void A07(C5Tl c5Tl, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, int i, boolean z) {
        int i2;
        C118125Vw A0g;
        long j;
        AbstractC167007dF.A1D(interfaceC16820sZ, 1, interfaceC16820sZ2);
        c5Tl.Enr(-668654654);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0b(c5Tl, z) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0I(c5Tl, interfaceC16820sZ);
        }
        if ((i & 384) == 0) {
            i2 |= AbstractC25232BEp.A0J(c5Tl, interfaceC16820sZ2);
        }
        if ((i2 & 147) == 146 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(1737789035, "com.instagram.direct.fragment.thread.threaddetail.customization.ActionButtonsHeader (DirectCustomGroupNameAndImage.kt:215)");
            }
            C1130158n c1130158n = Modifier.A00;
            Modifier A0Q = AbstractC25225BEi.A0Q(AbstractC118175Wb.A02(c1130158n));
            InterfaceC1127857k A02 = AbstractC118375Wz.A02(AbstractC118255Wn.A04, c5Tl, C118195Wf.A05, 6);
            int A00 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, A0Q);
            AbstractC25233BEq.A11(c5Tl, c117505Tk);
            AbstractC25231BEo.A12(c5Tl, A02, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A00);
            }
            AbstractC25225BEi.A1K(c5Tl, A01);
            String A002 = C5YD.A00(c5Tl, 2131954754);
            boolean A1P = AbstractC25233BEq.A1P(c5Tl, -1720623458, i2);
            Object EEc = c5Tl.EEc();
            if (A1P || EEc == C5UI.A00) {
                EEc = new C37052GUi(interfaceC16820sZ, 25);
                c5Tl.FBy(EEc);
            }
            C5WR.A0H(c5Tl, AbstractC118175Wb.A08(C5XR.A05(c1130158n, null, null, AbstractC25225BEi.A1A(c117505Tk, EEc, false), true), 4.0f), AbstractC25226BEj.A0g(c5Tl), A002, 5, 3072, 16240, AbstractC25226BEj.A0G(c5Tl), AbstractC118155Vz.A01(17));
            String A003 = C5YD.A00(c5Tl, 2131961124);
            c5Tl.Eno(-1720613668);
            boolean z2 = (i2 & 896) == 256;
            Object EEc2 = c5Tl.EEc();
            if (z2 || EEc2 == C5UI.A00) {
                EEc2 = new C37052GUi(interfaceC16820sZ2, 26);
                c5Tl.FBy(EEc2);
            }
            Modifier A08 = AbstractC118175Wb.A08(C5XR.A05(c1130158n, null, null, AbstractC25225BEi.A1A(c117505Tk, EEc2, false), z), 4.0f);
            long A012 = AbstractC118155Vz.A01(17);
            if (z) {
                c5Tl.Eno(-1720609574);
                A0g = AbstractC25225BEi.A0X(c5Tl);
            } else {
                c5Tl.Eno(-1720608304);
                A0g = AbstractC25226BEj.A0g(c5Tl);
            }
            C117505Tk.A0L(c117505Tk, false);
            if (z) {
                j = AbstractC25227BEk.A0g(c5Tl, -1720605992).A0l;
            } else {
                j = AbstractC25227BEk.A0g(c5Tl, -1720604904).A0t;
            }
            C117505Tk.A0L(c117505Tk, false);
            C5WR.A0H(c5Tl, A08, A0g, A003, 6, 3072, 16240, j, A012);
            if (AbstractC25227BEk.A1R(c5Tl)) {
                C0fH.A00(533700712);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30488DbX(i, 13, interfaceC16820sZ2, interfaceC16820sZ, z);
        }
    }

    public static final void A00(C5Tl c5Tl, AbstractC59962oe abstractC59962oe, L7D l7d, C27207BzQ c27207BzQ, ThreadDetailCustomGroupNameAndImageViewModel$PickerItem$EmojiItem threadDetailCustomGroupNameAndImageViewModel$PickerItem$EmojiItem, FPE fpe, int i) {
        int i2;
        c5Tl.Enr(1319947604);
        if ((i & 6) == 0) {
            i2 = AbstractC25230BEn.A04(AbstractC25233BEq.A1T(c5Tl, fpe, i) ? 1 : 0) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0S(c5Tl, c27207BzQ);
        }
        if ((i & 384) == 0) {
            i2 |= AbstractC25232BEp.A0J(c5Tl, abstractC59962oe);
        }
        if ((i & 3072) == 0) {
            i2 |= AbstractC25232BEp.A0K(c5Tl, threadDetailCustomGroupNameAndImageViewModel$PickerItem$EmojiItem);
        }
        if ((i & DalvikInternals.IOPRIO_BACKGROUND) == 0) {
            i2 |= AbstractC25232BEp.A0L(c5Tl, l7d);
        }
        if ((i2 & 9363) == 9362 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-1383366477, "com.instagram.direct.fragment.thread.threaddetail.customization.ButtonItem (DirectCustomGroupNameAndImage.kt:279)");
            }
            Object A19 = AbstractC25226BEj.A19(c5Tl);
            Object A11 = AbstractC25225BEi.A11(c5Tl);
            Object AJX = c5Tl.AJX(C5V2.A0A);
            Object AJX2 = c5Tl.AJX(C5V2.A02);
            Modifier A0X = AbstractC25226BEj.A0X(AbstractC25231BEo.A0R(Modifier.A00, 70.0f), C5XL.A00(c5Tl).A0C);
            c5Tl.Eno(-381288353);
            boolean z = true;
            boolean A1X = AbstractC25233BEq.A1X(c5Tl, A11, threadDetailCustomGroupNameAndImageViewModel$PickerItem$EmojiItem, AbstractC167007dF.A1P(i2 & 112, 32), c5Tl.AH6(l7d));
            if ((i2 & 14) != 4 && ((i2 & 8) == 0 || !c5Tl.AH6(fpe))) {
                z = false;
            }
            boolean A1S = AbstractC25231BEo.A1S(c5Tl, AJX2, AJX, AbstractC25233BEq.A1X(c5Tl, A19, abstractC59962oe, A1X, z));
            Object EEc = c5Tl.EEc();
            if (A1S || EEc == C5UI.A00) {
                EEc = new MEH(fpe, AJX2, l7d, A11, AJX, threadDetailCustomGroupNameAndImageViewModel$PickerItem$EmojiItem, abstractC59962oe, A19, c27207BzQ, 1);
                c5Tl.FBy(EEc);
            }
            C117505Tk A0K = AbstractC25225BEi.A0K(c5Tl, false);
            Modifier A06 = C5XR.A06(A0X, (InterfaceC16820sZ) EEc);
            InterfaceC1127857k A0M = AbstractC25235BEs.A0M(c5Tl);
            int A00 = C5X2.A00(c5Tl);
            C59P A04 = C117505Tk.A04(A0K);
            Modifier A01 = C5X3.A01(c5Tl, A06);
            AbstractC25233BEq.A11(c5Tl, A0K);
            AbstractC25231BEo.A12(c5Tl, A0M, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (A0K.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A00);
            }
            AbstractC25225BEi.A1K(c5Tl, A01);
            C5YS.A07(c5Tl, null, C5Y7.A00(c5Tl, c27207BzQ.A01, 0), null, C5YD.A00(c5Tl, c27207BzQ.A00), 0, 20, AbstractC25226BEj.A0F(c5Tl));
            if (AbstractC25227BEk.A1R(c5Tl)) {
                C0fH.A00(1832252015);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DUL(i, 4, threadDetailCustomGroupNameAndImageViewModel$PickerItem$EmojiItem, fpe, abstractC59962oe, l7d, c27207BzQ);
        }
    }

    public static final void A02(C5Tl c5Tl, AbstractC59962oe abstractC59962oe, L7D l7d, FPE fpe, List list, InterfaceC16660sJ interfaceC16660sJ, int i) {
        int i2;
        boolean z;
        c5Tl.Enr(-1631854783);
        if ((i & 6) == 0) {
            i2 = AbstractC25230BEn.A04(AbstractC25233BEq.A1T(c5Tl, fpe, i) ? 1 : 0) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0I(c5Tl, list);
        }
        if ((i & 384) == 0) {
            i2 |= AbstractC25232BEp.A0J(c5Tl, interfaceC16660sJ);
        }
        if ((i & 3072) == 0) {
            i2 |= AbstractC25232BEp.A0K(c5Tl, abstractC59962oe);
        }
        if ((i & DalvikInternals.IOPRIO_BACKGROUND) == 0) {
            i2 |= AbstractC25232BEp.A0L(c5Tl, l7d);
        }
        if ((i2 & 9363) == 9362 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(295699693, "com.instagram.direct.fragment.thread.threaddetail.customization.GridOfOptions (DirectCustomGroupNameAndImage.kt:248)");
            }
            Object A0q = AbstractC25227BEk.A0q(c5Tl, 2089725302);
            Object obj = C5UI.A00;
            if (A0q == obj) {
                A0q = AbstractC25232BEp.A0w(c5Tl, null);
            }
            C117505Tk A0J = AbstractC25225BEi.A0J(c5Tl);
            C28747Cmf c28747Cmf = new C28747Cmf();
            C1333560c c1333560c = new C1333560c(16.0f, 8.0f, 16.0f, 8.0f);
            C6ID A01 = AbstractC118255Wn.A01(14.0f);
            InterfaceC118335Wv interfaceC118335Wv = AbstractC118255Wn.A05;
            boolean A1Z = AbstractC25227BEk.A1Z(c5Tl, list, 2089735788);
            boolean z2 = false;
            if ((i2 & 14) == 4 || ((i2 & 8) != 0 && c5Tl.AH6(fpe))) {
                z = true;
            } else {
                z = false;
            }
            boolean A1X = AbstractC25233BEq.A1X(c5Tl, abstractC59962oe, l7d, A1Z, z);
            if ((i2 & 896) == 256) {
                z2 = true;
            }
            boolean z3 = A1X | z2;
            Object EEc = c5Tl.EEc();
            if (z3 || EEc == obj) {
                EEc = new C43752JWo(10, A0q, l7d, interfaceC16660sJ, list, fpe, abstractC59962oe);
                c5Tl.FBy(EEc);
            }
            C117505Tk.A0L(A0J, false);
            AbstractC27471CAr.A00(null, interfaceC118335Wv, A01, c1333560c, c28747Cmf, null, c5Tl, null, (InterfaceC16660sJ) EEc, 1772544, 406, false, false);
            if (C0fH.A02()) {
                C0fH.A00(952658034);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DUL(i, 5, list, fpe, abstractC59962oe, l7d, interfaceC16660sJ);
        }
    }

    public static final void A05(C5Tl c5Tl, ThreadDetailCustomGroupNameAndImageViewModel$PickerItem$EmojiItem threadDetailCustomGroupNameAndImageViewModel$PickerItem$EmojiItem, InterfaceC16660sJ interfaceC16660sJ, int i) {
        int i2;
        c5Tl.Enr(1689394619);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0H(c5Tl, threadDetailCustomGroupNameAndImageViewModel$PickerItem$EmojiItem) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0I(c5Tl, interfaceC16660sJ);
        }
        if ((i2 & 19) == 18 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(1369112341, "com.instagram.direct.fragment.thread.threaddetail.customization.EmojiItem (DirectCustomGroupNameAndImage.kt:333)");
            }
            Object A0q = AbstractC25227BEk.A0q(c5Tl, 275990211);
            Object obj = C5UI.A00;
            if (A0q == obj) {
                A0q = new Picture();
                c5Tl.FBy(A0q);
            }
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            Modifier A0C = AbstractC118185Wd.A0C(AbstractC25226BEj.A0W(AbstractC25225BEi.A0O(c117505Tk)), 70.0f);
            boolean A1Z = AbstractC25227BEk.A1Z(c5Tl, A0q, 276003966);
            Object EEc = c5Tl.EEc();
            if (A1Z || EEc == obj) {
                EEc = new C50359MLl(A0q, 24);
                c5Tl.FBy(EEc);
            }
            Modifier A00 = C6L3.A00(AbstractC25233BEq.A0A(c117505Tk, A0C, EEc), C6L6.A00(threadDetailCustomGroupNameAndImageViewModel$PickerItem$EmojiItem.A01, 0L, 9187343241974906880L), C5AF.A00);
            boolean A1X = AbstractC25226BEj.A1X(c5Tl, A0q, AbstractC25233BEq.A1P(c5Tl, 276025132, i2));
            Object EEc2 = c5Tl.EEc();
            if (A1X || EEc2 == obj) {
                EEc2 = new C50170MDx(1, A0q, interfaceC16660sJ);
                c5Tl.FBy(EEc2);
            }
            Modifier A0H = AbstractC25235BEs.A0H(c5Tl, c117505Tk, A00, EEc2);
            InterfaceC1127857k A0M = AbstractC25235BEs.A0M(c5Tl);
            int A002 = C5X2.A00(c5Tl);
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, A0H);
            AbstractC25233BEq.A11(c5Tl, c117505Tk);
            AbstractC25231BEo.A12(c5Tl, A0M, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A002)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A002);
            }
            AbstractC25225BEi.A1K(c5Tl, A01);
            C5WR.A0s(c5Tl, AbstractC25226BEj.A0g(c5Tl), threadDetailCustomGroupNameAndImageViewModel$PickerItem$EmojiItem.A00, 16374, 0L, AbstractC118155Vz.A01(30));
            if (AbstractC25227BEk.A1R(c5Tl)) {
                C0fH.A00(-1211457349);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30510Dbt.A01(ASZ, threadDetailCustomGroupNameAndImageViewModel$PickerItem$EmojiItem, interfaceC16660sJ, i, 10);
        }
    }
}
