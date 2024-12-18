package X;

import androidx.compose.ui.Modifier;
import com.facebook.common.dextricks.DalvikInternals;
import com.instagram.common.typedurl.ImageUrl;

/* loaded from: classes5.dex */
public abstract class CZI {
    public static final void A00(C5Tl c5Tl, InterfaceC58202Pr8 interfaceC58202Pr8, C26052Bff c26052Bff, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16660sJ interfaceC16660sJ, int i) {
        int i2;
        C5UU ASZ;
        int i3;
        C14360o3.A0B(c26052Bff, 0);
        AbstractC167027dH.A0a(1, interfaceC16820sZ, interfaceC16820sZ2, interfaceC16660sJ, interfaceC58202Pr8);
        c5Tl.Enr(-402253941);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0R(c5Tl, c26052Bff) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0I(c5Tl, interfaceC16820sZ);
        }
        if ((i & 384) == 0) {
            i2 |= AbstractC25232BEp.A0J(c5Tl, interfaceC16820sZ2);
        }
        if ((i & 3072) == 0) {
            i2 |= AbstractC25232BEp.A0K(c5Tl, interfaceC16660sJ);
        }
        if ((i & DalvikInternals.IOPRIO_BACKGROUND) == 0) {
            i2 |= AbstractC25232BEp.A0L(c5Tl, interfaceC58202Pr8);
        }
        if ((i2 & 9363) == 9362 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(1861989968, "instagram.features.clips.spins.feedback.ui.ClipsSpinsReplyBottomSheetContent (ClipsSpinsReplyBottomSheetContent.kt:45)");
            }
            String str = c26052Bff.A02;
            if (str == null) {
                if (C0fH.A02()) {
                    C0fH.A00(1200224033);
                }
                ASZ = c5Tl.ASZ();
                if (ASZ == null) {
                    return;
                }
                i3 = 13;
                ASZ.A06 = new DUL(i, i3, c26052Bff, interfaceC16820sZ, interfaceC16820sZ2, interfaceC16660sJ, interfaceC58202Pr8);
            }
            C1130158n c1130158n = Modifier.A00;
            InterfaceC1127857k A0Y = AbstractC25229BEm.A0Y(c5Tl, 0);
            int A00 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, c1130158n);
            AbstractC25233BEq.A11(c5Tl, c117505Tk);
            AbstractC25231BEo.A12(c5Tl, A0Y, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A00);
            }
            AbstractC25225BEi.A1K(c5Tl, A01);
            CLL.A00(c5Tl, c26052Bff, interfaceC16820sZ, AbstractC25225BEi.A01(i2));
            c5Tl.Eno(1869628537);
            if (c26052Bff.A05) {
                int i4 = i2 << 3;
                A01(c5Tl, interfaceC58202Pr8, str, interfaceC16820sZ, interfaceC16820sZ2, interfaceC16660sJ, AbstractC25233BEq.A01(i4 & 896, i4 & 7168, i4), c26052Bff.A06);
            }
            if (AbstractC25230BEn.A1U(c5Tl, c117505Tk, false)) {
                C0fH.A00(455925488);
            }
        }
        ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            i3 = 12;
            ASZ.A06 = new DUL(i, i3, c26052Bff, interfaceC16820sZ, interfaceC16820sZ2, interfaceC16660sJ, interfaceC58202Pr8);
        }
    }

    public static final void A01(C5Tl c5Tl, InterfaceC58202Pr8 interfaceC58202Pr8, String str, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16660sJ interfaceC16660sJ, int i, boolean z) {
        int i2;
        c5Tl.Enr(-1365201263);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0R(c5Tl, str) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0c(c5Tl, z);
        }
        if ((i & 384) == 0) {
            i2 |= AbstractC25232BEp.A0J(c5Tl, interfaceC16820sZ);
        }
        if ((i & 3072) == 0) {
            i2 |= AbstractC25232BEp.A0K(c5Tl, interfaceC16820sZ2);
        }
        if ((i & DalvikInternals.IOPRIO_BACKGROUND) == 0) {
            i2 |= AbstractC25232BEp.A0L(c5Tl, interfaceC16660sJ);
        }
        if ((196608 & i) == 0) {
            i2 |= AbstractC25232BEp.A0M(c5Tl, interfaceC58202Pr8);
        }
        if ((74899 & i2) == 74898 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(1641334232, "instagram.features.clips.spins.feedback.ui.FeedbackRow (ClipsSpinsReplyBottomSheetContent.kt:69)");
            }
            ImageUrl A0U = AbstractC25234BEr.A0U(c5Tl);
            Object A0q = AbstractC25227BEk.A0q(c5Tl, 815901766);
            Object obj = C5UI.A00;
            if (A0q == obj) {
                A0q = AbstractC25232BEp.A0w(c5Tl, "");
            }
            InterfaceC74953Yl interfaceC74953Yl = (InterfaceC74953Yl) A0q;
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C117505Tk.A0L(c117505Tk, false);
            C25338BJh c25338BJh = (C25338BJh) AbstractC25236BEt.A0V(c5Tl, obj, 815903780);
            C117505Tk.A0L(c117505Tk, false);
            C0eB c0eB = C0eB.A00;
            Object A0q2 = AbstractC25227BEk.A0q(c5Tl, 815905488);
            if (A0q2 == obj) {
                A0q2 = new D4r(c25338BJh, null, 16);
                c5Tl.FBy(A0q2);
            }
            int A05 = AbstractC25235BEs.A05(c5Tl, c117505Tk, A0q2, c0eB);
            C1130158n c1130158n = Modifier.A00;
            Modifier A0E = AbstractC118175Wb.A0E(c1130158n, 0.0f, 0.0f, 0.0f, 16.0f);
            InterfaceC1127857k A0d = AbstractC25228BEl.A0d(c5Tl);
            int A00 = C5X2.A00(c5Tl);
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, A0E);
            AbstractC25233BEq.A11(c5Tl, c117505Tk);
            AbstractC25231BEo.A12(c5Tl, A0d, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A00);
            }
            AbstractC25225BEi.A1K(c5Tl, A01);
            C6L0 c6l0 = C6L0.A00;
            boolean z2 = false;
            BGD.A02(c5Tl, AbstractC118175Wb.A0A(c1130158n, 8.0f, 0.0f), AbstractC43541zP.A00(c5Tl, A0U), C29190Ctv.A00, 432);
            String A1D = AbstractC25226BEj.A1D(interfaceC74953Yl);
            Modifier A002 = c6l0.A00(AbstractC118175Wb.A0E(AbstractC25230BEn.A0X(c1130158n, c25338BJh), 0.0f, 0.0f, 12.0f, 0.0f));
            C6L4 c6l4 = new C6L4(AbstractC25226BEj.A0M(c5Tl));
            C118125Vw A003 = C118125Vw.A00(null, null, AbstractC25226BEj.A0g(c5Tl), null, null, null, 0, 66305, 0, 6291454, AbstractC25226BEj.A0G(c5Tl), 0L, 0L, 0L);
            C28281CdS c28281CdS = new C28281CdS(null, -1, 0, 4);
            c5Tl.Eno(-1299361098);
            boolean A1W = AbstractC25234BEr.A1W(i2);
            if ((i2 & 7168) == 2048) {
                z2 = true;
            }
            boolean z3 = A1W | z2;
            Object EEc = c5Tl.EEc();
            if (z3 || EEc == obj) {
                EEc = C30184DRp.A00(c5Tl, interfaceC16820sZ2, interfaceC74953Yl, interfaceC16660sJ, 46);
            }
            C28367CfT c28367CfT = new C28367CfT(null, null, AbstractC25225BEi.A1B(c117505Tk, EEc, false));
            Object A0q3 = AbstractC25227BEk.A0q(c5Tl, -1299378757);
            if (A0q3 == obj) {
                A0q3 = DRR.A00(interfaceC74953Yl, A05);
                c5Tl.FBy(A0q3);
            }
            AbstractC28411CgH.A01(null, c28367CfT, c28281CdS, c5Tl, A002, c6l4, A003, null, A1D, AbstractC25225BEi.A1B(c117505Tk, A0q3, false), null, C5UA.A01(c5Tl, new C30537DcK(interfaceC58202Pr8, interfaceC74953Yl, str, 4), 18878928), 0, 0, 1572912, 196608, 16152, false, false, false);
            CLM.A00(c5Tl, interfaceC16820sZ, ((i2 >> 6) & 14) | (i2 & 112), z);
            if (AbstractC25227BEk.A1R(c5Tl)) {
                C0fH.A00(785046716);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DVF(interfaceC16820sZ, interfaceC16820sZ2, interfaceC16660sJ, interfaceC58202Pr8, str, i, 3, z);
        }
    }
}
