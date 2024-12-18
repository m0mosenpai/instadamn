package X;

import android.content.Context;
import androidx.compose.ui.Modifier;
import com.facebook.common.dextricks.Constants;
import com.facebook.common.dextricks.DalvikConstants;
import com.facebook.common.dextricks.DalvikInternals;
import com.instagram.barcelona.permalink.ui.component.PermalinkContentKt$PermalinkContent$6;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

/* renamed from: X.CXi, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC28034CXi {
    public static final void A01(C5Tl c5Tl, Modifier modifier, InterfaceC16820sZ interfaceC16820sZ, C5Hc c5Hc, int i, int i2, boolean z) {
        int i3;
        Modifier modifier2 = modifier;
        AbstractC167017dG.A1P(c5Hc, interfaceC16820sZ);
        c5Tl.Enr(-1556800617);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = AbstractC25232BEp.A0b(c5Tl, z) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= AbstractC25232BEp.A0S(c5Tl, c5Hc);
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= AbstractC25232BEp.A0J(c5Tl, interfaceC16820sZ);
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            i3 |= 3072;
        } else if ((i & 7168) == 0) {
            i3 |= AbstractC25232BEp.A0U(c5Tl, modifier2);
        }
        if ((i3 & 5851) == 1170 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (i4 != 0) {
                modifier2 = Modifier.A00;
            }
            if (C0fH.A02()) {
                C0fH.A01(1405587187, "com.instagram.barcelona.permalink.ui.component.TopThreadContinuation (PermalinkContent.kt:465)");
            }
            C25245BFe A00 = C25245BFe.A00(500, 0);
            long j = C5AD.A01;
            AbstractC28495Cho.A07(AbstractC28503Chw.A02(A00, 0.0f, j), AbstractC28503Chw.A07(AbstractC25225BEi.A0I(null, 1.0f, 400.0f), 0.0f, j), c5Tl, modifier2, null, C30716DfE.A00(c5Tl, interfaceC16820sZ, c5Hc, 23, -1477199249), 200064 | (i3 & 14) | ((i3 >> 6) & 112), 16, z);
            if (C0fH.A02()) {
                C0fH.A00(199953609);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DUI(c5Hc, interfaceC16820sZ, modifier2, i, i2, 4, z);
        }
    }

    public static final void A00(C5Tl c5Tl, Modifier modifier, C27958CUc c27958CUc, InterfaceC132365yF interfaceC132365yF, C45079Jx9 c45079Jx9, C44508JmE c44508JmE, String str, String str2, String str3, String str4, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16820sZ interfaceC16820sZ3, InterfaceC16820sZ interfaceC16820sZ4, InterfaceC16820sZ interfaceC16820sZ5, InterfaceC16820sZ interfaceC16820sZ6, InterfaceC16820sZ interfaceC16820sZ7, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16660sJ interfaceC16660sJ2, InterfaceC16660sJ interfaceC16660sJ3, C5Hc c5Hc, float f, int i, int i2, int i3, int i4, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        C0eB c0eB;
        InterfaceC16620sF A1C;
        Modifier modifier2 = modifier;
        String str5 = str4;
        String str6 = str3;
        boolean A1R = AbstractC167007dF.A1R(0, c45079Jx9, c27958CUc);
        AbstractC167007dF.A1E(c44508JmE, 2, interfaceC132365yF);
        AbstractC25233BEq.A0y(5, c5Hc, interfaceC16660sJ, interfaceC16820sZ2);
        c5Tl.Enr(-865068969);
        if ((i4 & Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP) != 0) {
            modifier2 = Modifier.A00;
        }
        if ((i4 & 1048576) != 0) {
            str6 = null;
        }
        if ((i4 & 2097152) != 0) {
            str5 = null;
        }
        boolean A1U = AbstractC25226BEj.A1U(i4 & 4194304, z2);
        boolean A1U2 = AbstractC25226BEj.A1U(i4 & DalvikConstants.FB4A_LINEAR_ALLOC_BUFFER_SIZE, z3);
        boolean A1U3 = AbstractC25226BEj.A1U(i4 & 16777216, z4);
        boolean A1U4 = AbstractC25226BEj.A1U(i4 & 33554432, z5);
        if (C0fH.A02()) {
            C0fH.A01(1481145578, "com.instagram.barcelona.permalink.ui.component.PermalinkContent (PermalinkContent.kt:109)");
        }
        Object EEc = c5Tl.EEc();
        Object obj = C5UI.A00;
        C19L c19l = ((C137536Kz) AbstractC25234BEr.A0b(c5Tl, EEc, obj)).A00;
        Object A0q = AbstractC25227BEk.A0q(c5Tl, 896015204);
        if (A0q == obj) {
            A0q = new CQ8(c27958CUc, c19l);
            c5Tl.FBy(A0q);
        }
        CQ8 cq8 = (CQ8) A0q;
        C117505Tk A0K = AbstractC25225BEi.A0K(c5Tl, false);
        L3A A00 = CE6.A00(c5Tl, c27958CUc);
        Context A0P = AbstractC25230BEn.A0P(c5Tl);
        C15370ps A1F = AbstractC25225BEi.A1F();
        A1F.A00 = c45079Jx9.A0I;
        List list = c45079Jx9.A0F;
        UserSession A0u = AbstractC25228BEl.A0u(c5Tl);
        if (c45079Jx9.A0d && AbstractC166987dD.A1b(list) && c45079Jx9.A0O) {
            Collection collection = (Collection) A1F.A00;
            HashSet A1H = AbstractC166987dD.A1H();
            ArrayList A1E = AbstractC166987dD.A1E();
            for (Object obj2 : list) {
                AbstractC25231BEo.A1F(((InterfaceC132245y2) obj2).BKd(), obj2, A1H, A1E);
            }
            A1F.A00 = AbstractC133095zb.A00(AbstractC001800i.A0S(A1E, collection));
        }
        if (!((Collection) A1F.A00).isEmpty()) {
            c5Tl.Eno(2007601301);
            AbstractC28345Cf3.A01(c5Tl, null, C5UA.A01(c5Tl, new DZ0(A0P, modifier2, interfaceC132365yF, A00, cq8, c45079Jx9, c44508JmE, A0u, str, str6, str5, str2, list, interfaceC16820sZ, interfaceC16820sZ2, interfaceC16820sZ6, interfaceC16820sZ7, interfaceC16660sJ3, interfaceC16660sJ, interfaceC16660sJ2, A1F, c5Hc, c19l, f, z, A1U4, A1U, A1U2, A1U3), -1285412358), 48, A1R ? 1 : 0);
            Integer num = c45079Jx9.A04;
            if (num == C05F.A0C) {
                c5Tl.Eno(2020621208);
                c0eB = C0eB.A00;
                c5Tl.Eno(896466215);
                boolean z6 = (((i2 & 7168) ^ 3072) > 2048 && c5Tl.AH4(interfaceC16820sZ4)) || (i2 & 3072) == 2048;
                Object EEc2 = c5Tl.EEc();
                if (z6 || EEc2 == obj) {
                    EEc2 = new MCC(interfaceC16820sZ4, null, 29);
                    c5Tl.FBy(EEc2);
                }
                A1C = AbstractC25225BEi.A1C(A0K, EEc2);
            } else if (num == C05F.A0N) {
                c5Tl.Eno(2020731320);
                c0eB = C0eB.A00;
                c5Tl.Eno(896469767);
                boolean z7 = (((57344 & i2) ^ DalvikInternals.IOPRIO_BACKGROUND) > 16384 && c5Tl.AH4(interfaceC16820sZ5)) || (i2 & DalvikInternals.IOPRIO_BACKGROUND) == 16384;
                Object EEc3 = c5Tl.EEc();
                if (z7 || EEc3 == obj) {
                    EEc3 = new MCC(interfaceC16820sZ5, null, 30);
                    c5Tl.FBy(EEc3);
                }
                A1C = AbstractC25225BEi.A1C(A0K, EEc3);
            } else {
                c5Tl.Eno(2020792824);
                C117505Tk.A0L(A0K, false);
            }
            C5UX.A04(c5Tl, c0eB, A1C);
            C117505Tk.A0L(A0K, false);
        } else {
            Integer num2 = c45079Jx9.A04;
            if (num2 != C05F.A00 && num2 != C05F.A01) {
                if (num2 == C05F.A0N && c45079Jx9.A0S && c45079Jx9.A0N) {
                    c5Tl.Eno(2021135653);
                    C5UX.A04(c5Tl, C0eB.A00, new PermalinkContentKt$PermalinkContent$6(A0P, A0u, str, C5YD.A00(c5Tl, 2131953700), null, interfaceC16820sZ3, interfaceC16820sZ4));
                } else {
                    c5Tl.Eno(2021871841);
                    interfaceC16820sZ5.invoke();
                    AbstractC27547CDr.A00(c5Tl, modifier2, new D5Z(c44508JmE, 65), (i2 >> 18) & 112, 0);
                }
            } else {
                c5Tl.Eno(2020895093);
                InterfaceC1127857k A0b = AbstractC25226BEj.A0b(false);
                int A002 = C5X2.A00(c5Tl);
                C59P A04 = C117505Tk.A04(A0K);
                Modifier A01 = C5X3.A01(c5Tl, modifier2);
                AbstractC25233BEq.A11(c5Tl, A0K);
                AbstractC25231BEo.A12(c5Tl, A0b, A04);
                InterfaceC16620sF interfaceC16620sF = C5X8.A02;
                if (A0K.A0K || !AbstractC25231BEo.A1O(c5Tl, A002)) {
                    AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A002);
                }
                AbstractC25225BEi.A1K(c5Tl, A01);
                AbstractC27548CDt.A00(c5Tl, AbstractC25225BEi.A0P(C119645bN.A00, Modifier.A00), null, 0, 2);
                c5Tl.ASW();
            }
        }
        if (AbstractC25227BEk.A1b(A0K, false)) {
            C0fH.A00(-992110394);
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DZ3(modifier2, c27958CUc, interfaceC132365yF, c45079Jx9, c44508JmE, str, str2, str6, str5, interfaceC16820sZ, interfaceC16820sZ2, interfaceC16820sZ3, interfaceC16820sZ4, interfaceC16820sZ5, interfaceC16820sZ6, interfaceC16820sZ7, interfaceC16660sJ, interfaceC16660sJ2, interfaceC16660sJ3, c5Hc, f, i, i2, i3, i4, z, A1U, A1U2, A1U3, A1U4);
        }
    }
}
