package X;

import android.graphics.Picture;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.ui.Modifier;
import com.instagram.common.typedurl.SimpleImageUrl;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Chq, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC28497Chq {
    public static final void A01(Picture picture, C5Tl c5Tl, C148336m3 c148336m3, List list, int i) {
        int i2;
        String str;
        C14360o3.A0B(picture, 2);
        c5Tl.Enr(924566998);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0H(c5Tl, list) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0S(c5Tl, c148336m3);
        }
        if ((i & 384) == 0) {
            i2 |= AbstractC25232BEp.A0J(c5Tl, picture);
        }
        if ((i2 & 147) == 146 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(865274626, "com.instagram.direct.fragment.thread.threaddetail.customization.EmojiProfilePhoto (CustomGroupEmojiImagePicker.kt:123)");
            }
            C1130158n c1130158n = Modifier.A00;
            boolean A1Z = AbstractC25227BEk.A1Z(c5Tl, picture, 1776747760);
            Object EEc = c5Tl.EEc();
            if (A1Z || EEc == C5UI.A00) {
                EEc = new C50359MLl(picture, 23);
                c5Tl.FBy(EEc);
            }
            AbstractC25228BEl.A1O(c5Tl);
            Modifier A08 = AbstractC118175Wb.A08(C6L3.A00(AbstractC25226BEj.A0W(AbstractC119675bQ.A01(c1130158n, (InterfaceC16660sJ) EEc)), A00(c5Tl, list), C5AF.A00), 20.0f);
            if (c148336m3 == null || (str = c148336m3.A02) == null) {
                str = "";
            }
            C5WR.A0K(c5Tl, A08, AbstractC25226BEj.A0g(c5Tl), str, 3072, 16244, 0L, AbstractC118155Vz.A01(48));
            if (C0fH.A02()) {
                C0fH.A00(-430498304);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = C30509Dbs.A01(list, picture, c148336m3, i, 38);
        }
    }

    public static final void A03(C5Tl c5Tl, C51753Mtc c51753Mtc, InterfaceC16820sZ interfaceC16820sZ, int i, boolean z) {
        int i2;
        long j;
        AbstractC167007dF.A1D(c51753Mtc, 0, interfaceC16820sZ);
        c5Tl.Enr(1337638997);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0H(c5Tl, c51753Mtc) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0c(c5Tl, z);
        }
        if ((i & 384) == 0) {
            i2 |= AbstractC25232BEp.A0J(c5Tl, interfaceC16820sZ);
        }
        if ((i2 & 147) == 146 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(2000100216, "com.instagram.direct.fragment.thread.threaddetail.customization.ColorThemeOption (CustomGroupEmojiImagePicker.kt:172)");
            }
            String A00 = C5YD.A00(c5Tl, c51753Mtc.A01);
            Modifier A0C = AbstractC118185Wd.A0C(Modifier.A00, 40.0f);
            boolean A1Y = AbstractC25227BEk.A1Y(c5Tl, A00, -936162547);
            Object EEc = c5Tl.EEc();
            if (A1Y || EEc == C5UI.A00) {
                EEc = AbstractC25230BEn.A13(c5Tl, A00, 26);
            }
            C117505Tk A0K = AbstractC25225BEi.A0K(c5Tl, false);
            boolean z2 = true;
            Modifier A002 = AnonymousClass598.A00(A0C, (InterfaceC16660sJ) EEc, false);
            C5WI c5wi = C5WF.A00;
            Modifier A01 = C6L2.A01(A002, c5wi);
            float f = 0.0f;
            if (z) {
                f = 2.0f;
            }
            c5Tl.Eno(-936156658);
            if (z) {
                j = AbstractC25226BEj.A0N(c5Tl);
            } else {
                j = C1132359l.A07;
            }
            C117505Tk.A0L(A0K, false);
            Modifier A03 = C6L7.A03(A01, c5wi, f, j);
            boolean A1P = AbstractC25233BEq.A1P(c5Tl, -936152238, i2);
            if ((i2 & 896) != 256) {
                z2 = false;
            }
            boolean z3 = A1P | z2;
            Object EEc2 = c5Tl.EEc();
            if (z3 || EEc2 == C5UI.A00) {
                EEc2 = AbstractC25229BEm.A0x(c5Tl, interfaceC16820sZ, 27, z);
            }
            if (AbstractC25227BEk.A1X(c5Tl, C6L3.A00(AbstractC25229BEm.A0T(A0K, A03, EEc2), A00(c5Tl, (List) c51753Mtc.A02), C5AF.A00))) {
                C0fH.A00(-2101354840);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30488DbX(i, 12, c51753Mtc, interfaceC16820sZ, z);
        }
    }

    public static final void A04(C5Tl c5Tl, MWT mwt, C148336m3 c148336m3, InterfaceC16660sJ interfaceC16660sJ, int i) {
        int i2;
        AbstractC167007dF.A1D(mwt, 0, interfaceC16660sJ);
        c5Tl.Enr(-1055442747);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0H(c5Tl, mwt) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0S(c5Tl, c148336m3);
        }
        if ((i & 384) == 0) {
            i2 |= AbstractC25232BEp.A0J(c5Tl, interfaceC16660sJ);
        }
        if ((i2 & 147) == 146 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-202772529, "com.instagram.direct.fragment.thread.threaddetail.customization.EmojiPicker (CustomGroupEmojiImagePicker.kt:192)");
            }
            Iterable iterable = (Iterable) mwt.A00;
            boolean A1Y = AbstractC25227BEk.A1Y(c5Tl, iterable, 863578927);
            Object EEc = c5Tl.EEc();
            if (A1Y || EEc == C5UI.A00) {
                EEc = AbstractC001800i.A0Q(iterable, 6);
                c5Tl.FBy(EEc);
            }
            C117505Tk A0K = AbstractC25225BEi.A0K(c5Tl, false);
            LazyListState A0E = AbstractC25227BEk.A0E(c5Tl);
            boolean z = true;
            Modifier Eq3 = AbstractC25226BEj.A0T(Modifier.A00).Eq3(AbstractC118185Wd.A00);
            C1333560c c1333560c = new C1333560c(16.0f, 16.0f, 16.0f, 16.0f);
            C6ID A01 = AbstractC118255Wn.A01(16.0f);
            InterfaceC118245Wl interfaceC118245Wl = C118195Wf.A00;
            boolean A1Z = AbstractC25227BEk.A1Z(c5Tl, EEc, 863590988) | AbstractC25231BEo.A1K(i2);
            if ((i2 & 896) != 256) {
                z = false;
            }
            boolean z2 = A1Z | z;
            Object EEc2 = c5Tl.EEc();
            if (z2 || EEc2 == C5UI.A00) {
                EEc2 = new C50364MLq(13, interfaceC16660sJ, EEc, c148336m3);
                c5Tl.FBy(EEc2);
            }
            C6IS.A01(null, A01, c1333560c, A0E, c5Tl, interfaceC118245Wl, Eq3, AbstractC25225BEi.A1B(A0K, EEc2, false), 12804486, 72, false, true);
            if (C0fH.A02()) {
                C0fH.A00(-2071118900);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = C30509Dbs.A01(mwt, interfaceC16660sJ, c148336m3, i, 37);
        }
    }

    public static final void A06(C5Tl c5Tl, C44502Jm8 c44502Jm8, L7D l7d, List list, List list2, int i) {
        int i2;
        AbstractC167007dF.A1K(list, c44502Jm8);
        C14360o3.A0B(l7d, 3);
        c5Tl.Enr(-1762320195);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0H(c5Tl, list) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0I(c5Tl, c44502Jm8);
        }
        if ((i & 384) == 0) {
            i2 |= AbstractC25232BEp.A0J(c5Tl, list2);
        }
        if ((i & 3072) == 0) {
            i2 |= AbstractC25232BEp.A0K(c5Tl, l7d);
        }
        if ((i2 & 1171) == 1170 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-1855012873, "com.instagram.direct.fragment.thread.threaddetail.customization.ThemesPicker (CustomGroupEmojiImagePicker.kt:151)");
            }
            LazyListState A00 = C6IE.A00(c5Tl, 0, 0, 0, 3);
            Modifier A0J = AbstractC25227BEk.A0J(AbstractC25228BEl.A0W(), 24.0f);
            InterfaceC118225Wj interfaceC118225Wj = C118195Wf.A04;
            C1333560c c1333560c = new C1333560c(16.0f, 8.0f, 16.0f, 8.0f);
            C6ID A01 = AbstractC118255Wn.A01(16.0f);
            boolean A1X = AbstractC25226BEj.A1X(c5Tl, l7d, AbstractC25226BEj.A1X(c5Tl, c44502Jm8, AbstractC25233BEq.A1W(c5Tl, list, list2, -1079325817)));
            Object EEc = c5Tl.EEc();
            if (A1X || EEc == C5UI.A00) {
                EEc = new C50372MLz(39, list2, c44502Jm8, list, l7d);
                c5Tl.FBy(EEc);
            }
            AbstractC25225BEi.A1V(c5Tl, false);
            C6IS.A02(A01, c1333560c, A00, c5Tl, interfaceC118225Wj, A0J, (InterfaceC16660sJ) EEc, 12804486, 72);
            if (C0fH.A02()) {
                C0fH.A00(-974686462);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30491Dba(c44502Jm8, list, l7d, list2, i, 11);
        }
    }

    public static final void A08(C5Tl c5Tl, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, int i) {
        int i2;
        boolean A1R = AbstractC167007dF.A1R(0, interfaceC16820sZ, interfaceC16820sZ2);
        c5Tl.Enr(1149708792);
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
                C0fH.A01(-2114359695, "com.instagram.direct.fragment.thread.threaddetail.customization.TopRow (CustomGroupEmojiImagePicker.kt:284)");
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
            boolean A1O = AbstractC25233BEq.A1O(c5Tl, 752425379, i2);
            Object EEc = c5Tl.EEc();
            if (A1O || EEc == C5UI.A00) {
                EEc = new C37052GUi(interfaceC16820sZ, 23);
                c5Tl.FBy(EEc);
            }
            C5WR.A0H(c5Tl, AbstractC118175Wb.A08(C5XR.A05(c1130158n, null, null, AbstractC25225BEi.A1A(c117505Tk, EEc, false), A1R), 4.0f), AbstractC25226BEj.A0g(c5Tl), A002, 5, 3072, 16240, AbstractC25226BEj.A0G(c5Tl), AbstractC118155Vz.A01(17));
            String A003 = C5YD.A00(c5Tl, 2131961124);
            boolean A1Y = AbstractC25234BEr.A1Y(c5Tl, 752434593, i2);
            Object EEc2 = c5Tl.EEc();
            if (A1Y || EEc2 == C5UI.A00) {
                EEc2 = new C37052GUi(interfaceC16820sZ2, 24);
                c5Tl.FBy(EEc2);
            }
            C5WR.A0H(c5Tl, AbstractC118175Wb.A08(C5XR.A05(c1130158n, null, null, AbstractC25225BEi.A1A(c117505Tk, EEc2, false), A1R), 4.0f), AbstractC25226BEj.A0g(c5Tl), A003, 6, 3072, 16240, AbstractC25226BEj.A0N(c5Tl), AbstractC118155Vz.A01(17));
            if (AbstractC25227BEk.A1R(c5Tl)) {
                C0fH.A00(151519385);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30510Dbt(interfaceC16820sZ, interfaceC16820sZ2, i, 9);
        }
    }

    public static final void A05(C5Tl c5Tl, C44502Jm8 c44502Jm8, L7D l7d, FPE fpe, int i) {
        int i2;
        boolean z;
        boolean z2;
        AbstractC167017dG.A1P(c44502Jm8, l7d);
        c5Tl.Enr(1836554396);
        if ((i & 6) == 0) {
            i2 = AbstractC25230BEn.A04(AbstractC25233BEq.A1T(c5Tl, fpe, i) ? 1 : 0) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0I(c5Tl, c44502Jm8);
        }
        if ((i & 384) == 0) {
            i2 |= AbstractC25232BEp.A0J(c5Tl, l7d);
        }
        if ((i2 & 147) == 146 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(295458098, "com.instagram.direct.fragment.thread.threaddetail.customization.CustomGroupEmojiImagePicker (CustomGroupEmojiImagePicker.kt:73)");
            }
            InterfaceC74963Ym A02 = C6IB.A02(c5Tl, c44502Jm8.A04, 0);
            C1130158n c1130158n = Modifier.A00;
            Modifier A0U = AbstractC25226BEj.A0U(c1130158n);
            InterfaceC1127857k A022 = AbstractC119595bH.A02(AbstractC118255Wn.A07, c5Tl, C118195Wf.A00, 48);
            int A00 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, A0U);
            AbstractC25233BEq.A11(c5Tl, c117505Tk);
            AbstractC25231BEo.A12(c5Tl, A022, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A00);
            }
            AbstractC25225BEi.A1K(c5Tl, A01);
            boolean A1Z = AbstractC25232BEp.A1Z(c5Tl, ((MWT) A02.getValue()).A01, ((MWT) A02.getValue()).A05, 1479371848);
            Object EEc = c5Tl.EEc();
            if (A1Z || EEc == C5UI.A00) {
                EEc = new Picture();
                c5Tl.FBy(EEc);
            }
            Picture picture = (Picture) EEc;
            C117505Tk.A0L(c117505Tk, false);
            Object EEc2 = c5Tl.EEc();
            Object obj = C5UI.A00;
            C19L c19l = ((C137536Kz) AbstractC25234BEr.A0b(c5Tl, EEc2, obj)).A00;
            Object A19 = AbstractC25226BEj.A19(c5Tl);
            boolean A1Z2 = AbstractC25227BEk.A1Z(c5Tl, l7d, 1479378136);
            int i3 = i2 & 14;
            if (i3 == 4 || ((i2 & 8) != 0 && c5Tl.AH6(fpe))) {
                z = true;
            } else {
                z = false;
            }
            boolean z3 = A1Z2 | z;
            Object EEc3 = c5Tl.EEc();
            if (z3 || EEc3 == obj) {
                EEc3 = new C37018GSz(48, l7d, fpe);
                c5Tl.FBy(EEc3);
            }
            InterfaceC16820sZ A1A = AbstractC25225BEi.A1A(c117505Tk, EEc3, false);
            boolean A1Z3 = AbstractC25227BEk.A1Z(c5Tl, l7d, 1479383909);
            if (i3 == 4 || ((i2 & 8) != 0 && c5Tl.AH6(fpe))) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean A1X = AbstractC25226BEj.A1X(c5Tl, A19, AbstractC25233BEq.A1X(c5Tl, c19l, picture, A1Z3, z2));
            Object EEc4 = c5Tl.EEc();
            if (A1X || EEc4 == obj) {
                EEc4 = new MEB(20, A19, c19l, l7d, picture, fpe);
                c5Tl.FBy(EEc4);
            }
            A08(c5Tl, A1A, AbstractC25225BEi.A1A(c117505Tk, EEc4, false), 0);
            A01(picture, c5Tl, (C148336m3) ((MWT) A02.getValue()).A01, (List) ((MWT) A02.getValue()).A05, 0);
            A06(c5Tl, c44502Jm8, l7d, (List) ((MWT) A02.getValue()).A02, (List) ((MWT) A02.getValue()).A05, (i2 & 112) | ((i2 << 3) & 7168));
            AbstractC28389Cfs.A02(c5Tl, AbstractC118175Wb.A0A(c1130158n, 0.0f, 8.0f), 0.0f, 6, 4, C5XL.A00(c5Tl).A0D);
            String str = ((MWT) A02.getValue()).A03;
            boolean A1Z4 = AbstractC25227BEk.A1Z(c5Tl, c44502Jm8, 1479412552);
            Object EEc5 = c5Tl.EEc();
            if (A1Z4 || EEc5 == obj) {
                EEc5 = new C50359MLl(c44502Jm8, 22);
                c5Tl.FBy(EEc5);
            }
            BY5.A00(null, c5Tl, AbstractC118175Wb.A0E(AbstractC25226BEj.A0T(c1130158n), 16.0f, 8.0f, 16.0f, 0.0f), null, str, null, AbstractC25225BEi.A1B(c117505Tk, EEc5, false), 0, 56);
            MWT mwt = (MWT) A02.getValue();
            C148336m3 c148336m3 = (C148336m3) ((MWT) A02.getValue()).A01;
            boolean A1W = AbstractC25233BEq.A1W(c5Tl, c44502Jm8, l7d, 1479420185);
            Object EEc6 = c5Tl.EEc();
            if (A1W || EEc6 == obj) {
                EEc6 = new C50363MLp(15, l7d, c44502Jm8);
                c5Tl.FBy(EEc6);
            }
            A04(c5Tl, mwt, c148336m3, AbstractC25225BEi.A1B(c117505Tk, EEc6, false), 0);
            if (AbstractC25227BEk.A1R(c5Tl)) {
                C0fH.A00(-260100953);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = C30509Dbs.A01(c44502Jm8, fpe, l7d, i, 36);
        }
    }

    public static final C25766Ba5 A00(C5Tl c5Tl, List list) {
        C25766Ba5 A00;
        int i;
        if (AbstractC25227BEk.A1U(c5Tl, 576839376)) {
            C0fH.A01(-989298340, "com.instagram.direct.fragment.thread.threaddetail.customization.getBackgroundColorMapping (CustomGroupEmojiImagePicker.kt:267)");
        }
        if (list != null) {
            A00 = C6L6.A00(list, 0L, 9187343241974906880L);
            if (C0fH.A02()) {
                i = -189129788;
                C0fH.A00(i);
            }
        } else {
            A00 = C6L6.A00(AbstractC16960so.A1Q(AbstractC25227BEk.A0O(4283814143L), AbstractC25227BEk.A0O(4285896663L), AbstractC25227BEk.A0O(4294942643L)), 0L, 9187343241974906880L);
            if (C0fH.A02()) {
                i = 1211868616;
                C0fH.A00(i);
            }
        }
        AbstractC25225BEi.A1T(c5Tl);
        return A00;
    }

    public static final void A02(C5Tl c5Tl, Modifier modifier, C148336m3 c148336m3, C148336m3 c148336m32, InterfaceC16660sJ interfaceC16660sJ, int i) {
        int i2;
        long j;
        c5Tl.Enr(490240670);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0R(c5Tl, c148336m3) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0S(c5Tl, modifier);
        }
        if ((i & 384) == 0) {
            i2 |= AbstractC25232BEp.A0T(c5Tl, c148336m32);
        }
        if ((i & 3072) == 0) {
            i2 |= AbstractC25232BEp.A0K(c5Tl, interfaceC16660sJ);
        }
        if ((i2 & 1171) == 1170 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-1069594008, "com.instagram.direct.fragment.thread.threaddetail.customization.EmojiImage (CustomGroupEmojiImagePicker.kt:230)");
            }
            Object A0q = AbstractC25227BEk.A0q(c5Tl, -252844734);
            Object obj = C5UI.A00;
            InterfaceC74953Yl interfaceC74953Yl = (InterfaceC74953Yl) AbstractC25234BEr.A0c(c5Tl, A0q, obj, true);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C117505Tk.A0L(c117505Tk, false);
            if (c148336m32 != null && c148336m32.equals(c148336m3)) {
                j = AbstractC25227BEk.A0g(c5Tl, -252839620).A0C;
            } else {
                j = AbstractC25227BEk.A0g(c5Tl, -252837908).A17;
            }
            C117505Tk.A0L(c117505Tk, false);
            boolean A1P = AbstractC167007dF.A1P(i2 & 14, 4) | AbstractC25233BEq.A1R(c5Tl, -252834952, i2);
            Object EEc = c5Tl.EEc();
            if (A1P || EEc == obj) {
                EEc = new C37018GSz(49, interfaceC16660sJ, c148336m3);
                c5Tl.FBy(EEc);
            }
            Modifier A0X = AbstractC25226BEj.A0X(AbstractC25226BEj.A0W(AbstractC25235BEs.A0H(c5Tl, c117505Tk, modifier, EEc)), j);
            InterfaceC1127857k A0M = AbstractC25235BEs.A0M(c5Tl);
            int A00 = C5X2.A00(c5Tl);
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, A0X);
            AbstractC25233BEq.A11(c5Tl, c117505Tk);
            AbstractC25231BEo.A12(c5Tl, A0M, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A00);
            }
            AbstractC25225BEi.A1K(c5Tl, A01);
            String str = c148336m3.A01;
            String str2 = c148336m3.A02;
            SimpleImageUrl A002 = C168157fA.A00(str, str2);
            long A0J = AbstractC25226BEj.A0J(c5Tl);
            Object A0q2 = AbstractC25227BEk.A0q(c5Tl, 678783290);
            if (A0q2 == obj) {
                A0q2 = new C37052GUi(interfaceC74953Yl, 22);
                c5Tl.FBy(A0q2);
            }
            C2DB A02 = AbstractC43541zP.A02(c5Tl, A002, null, AbstractC25225BEi.A1A(c117505Tk, A0q2, false), null, 3072, 116, A0J, false, false);
            C1130158n c1130158n = Modifier.A00;
            C6LQ.A0C(c5Tl, AbstractC25226BEj.A0U(c1130158n), A02, str2, 384);
            c5Tl.Eno(678787831);
            if (AbstractC25230BEn.A1X(interfaceC74953Yl)) {
                BIR.A01(c5Tl, AbstractC118185Wd.A04(c1130158n));
            }
            if (AbstractC25230BEn.A1U(c5Tl, c117505Tk, false)) {
                C0fH.A00(1747250208);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30491Dba(interfaceC16660sJ, modifier, c148336m32, c148336m3, i, 10);
        }
    }

    public static final void A07(C5Tl c5Tl, C148336m3 c148336m3, List list, InterfaceC16660sJ interfaceC16660sJ, int i) {
        int i2;
        c5Tl.Enr(646012860);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0H(c5Tl, list) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0S(c5Tl, c148336m3);
        }
        if ((i & 384) == 0) {
            i2 |= AbstractC25232BEp.A0J(c5Tl, interfaceC16660sJ);
        }
        if ((i2 & 147) == 146 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(1757075010, "com.instagram.direct.fragment.thread.threaddetail.customization.EmojiRow (CustomGroupEmojiImagePicker.kt:208)");
            }
            int size = 6 - list.size();
            C1130158n c1130158n = Modifier.A00;
            int i3 = 1;
            Modifier A0T = AbstractC25226BEj.A0T(c1130158n);
            InterfaceC1127857k A02 = AbstractC118375Wz.A02(AbstractC118255Wn.A03, c5Tl, C118195Wf.A05, 6);
            int A00 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, A0T);
            AbstractC25233BEq.A11(c5Tl, c117505Tk);
            AbstractC25231BEo.A12(c5Tl, A02, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A00);
            }
            AbstractC25225BEi.A1K(c5Tl, A01);
            Iterator A0x = AbstractC25227BEk.A0x(c5Tl, list, -800544999);
            while (A0x.hasNext()) {
                int i4 = i2 << 3;
                A02(c5Tl, AbstractC118185Wd.A0C(c1130158n, 48.0f), (C148336m3) A0x.next(), c148336m3, interfaceC16660sJ, (i4 & 896) | 48 | (i4 & 7168));
            }
            C117505Tk.A0I(c117505Tk);
            c5Tl.Eno(-800537983);
            if (1 <= size) {
                while (true) {
                    AbstractC119685bS.A00(c5Tl, AbstractC118185Wd.A0C(c1130158n, 48.0f));
                    if (i3 == size) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
            C117505Tk.A0I(c117505Tk);
            if (AbstractC25227BEk.A1R(c5Tl)) {
                C0fH.A00(696419844);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = C30509Dbs.A01(c148336m3, list, interfaceC16660sJ, i, 39);
        }
    }
}
