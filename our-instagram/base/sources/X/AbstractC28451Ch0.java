package X;

import androidx.compose.ui.Modifier;
import com.facebook.R;
import com.facebook.common.dextricks.Constants;
import com.facebook.common.dextricks.DalvikInternals;
import com.instagram.common.typedurl.ImageUrl;
import java.util.List;

/* renamed from: X.Ch0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC28451Ch0 {
    public static final List A00 = AbstractC16960so.A1Q(EnumC27374C6d.A04, EnumC27374C6d.A05);

    public static final void A01(C5Tl c5Tl, EnumC27374C6d enumC27374C6d, ImageUrl imageUrl, String str, String str2, String str3, InterfaceC16620sF interfaceC16620sF, int i) {
        int i2;
        Modifier A08;
        boolean A1R = AbstractC167007dF.A1R(0, str, imageUrl);
        int A07 = AbstractC25230BEn.A07(2, str2, str3);
        AbstractC167007dF.A1G(enumC27374C6d, 4, interfaceC16620sF);
        c5Tl.Enr(1318277349);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0R(c5Tl, str) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0S(c5Tl, imageUrl);
        }
        if ((i & 384) == 0) {
            i2 |= AbstractC25232BEp.A0T(c5Tl, str2);
        }
        if ((i & 3072) == 0) {
            i2 |= AbstractC25232BEp.A0U(c5Tl, str3);
        }
        if ((i & DalvikInternals.IOPRIO_BACKGROUND) == 0) {
            i2 |= AbstractC25232BEp.A0V(c5Tl, enumC27374C6d);
        }
        if ((196608 & i) == 0) {
            i2 |= AbstractC25232BEp.A0M(c5Tl, interfaceC16620sF);
        }
        if ((74899 & i2) == 74898 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(236925129, "com.instagram.aistudio.editor.TemplateCardComponent (TemplateCardComponent.kt:62)");
            }
            C1130158n A0N = AbstractC25225BEi.A0N(c5Tl, -246920893);
            int ordinal = enumC27374C6d.ordinal();
            if (ordinal != A1R && ordinal != 0) {
                A08 = A0N;
            } else {
                A08 = AbstractC118185Wd.A08(A0N, 200.0f);
            }
            Modifier A0J = AbstractC25227BEk.A0J(AbstractC25225BEi.A0Q(A08), 12.0f);
            if (enumC27374C6d != EnumC27374C6d.A02) {
                if (AbstractC25227BEk.A1U(c5Tl, -610140983)) {
                    C0fH.A01(-1427950869, "com.instagram.aistudio.editor.cardBackground (TemplateCardComponent.kt:44)");
                }
                Modifier A0A = AbstractC118175Wb.A0A(AbstractC28015CWn.A00(c5Tl, A0N, A1R), 8.0f, 12.0f);
                if (C0fH.A02()) {
                    C0fH.A00(841942356);
                }
                AbstractC25225BEi.A1V(c5Tl, false);
                A0J = A0J.Eq3(A0A);
            }
            C117505Tk A0K = AbstractC25225BEi.A0K(c5Tl, false);
            float f = 1.0f;
            if (enumC27374C6d == EnumC27374C6d.A03) {
                f = 0.38f;
            }
            Modifier A002 = CB8.A00(A0J, f);
            boolean contains = A00.contains(enumC27374C6d);
            c5Tl.Eno(-246913119);
            boolean A1N = AbstractC25231BEo.A1N(57344, i2, Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET) | AbstractC25231BEo.A1N(458752, i2, Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP) | AbstractC167007dF.A1P(i2 & 14, 4) | AbstractC25233BEq.A1J(i2);
            Object EEc = c5Tl.EEc();
            if (A1N || EEc == C5UI.A00) {
                EEc = new C57265Pbn(enumC27374C6d, interfaceC16620sF, str2, str, A1R ? 1 : 0);
                c5Tl.FBy(EEc);
            }
            Modifier A05 = C5XR.A05(A002, null, null, AbstractC25225BEi.A1A(A0K, EEc, false), contains);
            InterfaceC1127857k A0O = AbstractC25235BEs.A0O(c5Tl);
            int A003 = C5X2.A00(c5Tl);
            C59P A04 = C117505Tk.A04(A0K);
            Modifier A01 = C5X3.A01(c5Tl, A05);
            AbstractC25233BEq.A11(c5Tl, A0K);
            AbstractC25231BEo.A12(c5Tl, A0O, A04);
            InterfaceC16620sF interfaceC16620sF2 = C5X8.A02;
            if (A0K.A0K || !AbstractC25231BEo.A1O(c5Tl, A003)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A003);
            }
            AbstractC25225BEi.A1K(c5Tl, A01);
            if (ordinal != A1R) {
                if (ordinal != 0 && ordinal != A07) {
                    if (ordinal == 2) {
                        c5Tl.Eno(1193110509);
                        int i3 = i2 >> 6;
                        A03(c5Tl, imageUrl, str2, str3, interfaceC16620sF, ((i2 << A07) & 896) | AbstractC25225BEi.A01(i3) | (i3 & 7168));
                    } else {
                        throw AbstractC25231BEo.A0v(c5Tl, A0K, 1193103203, false);
                    }
                } else {
                    c5Tl.Eno(1193107999);
                    A02(c5Tl, imageUrl, str2, str3, AbstractC25225BEi.A02(i2 >> 6) | ((i2 << A07) & 896));
                }
            } else {
                c5Tl.Eno(1193104676);
                A00(c5Tl, 0);
            }
            if (AbstractC25230BEn.A1U(c5Tl, A0K, false)) {
                C0fH.A00(-1395389135);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DVJ(imageUrl, enumC27374C6d, interfaceC16620sF, str, str2, str3, i, 0);
        }
    }

    public static final void A02(C5Tl c5Tl, ImageUrl imageUrl, String str, String str2, int i) {
        int i2;
        C14360o3.A0B(str, 0);
        AbstractC167017dG.A1P(str2, imageUrl);
        c5Tl.Enr(-1248463917);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0R(c5Tl, str) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0S(c5Tl, str2);
        }
        if ((i & 384) == 0) {
            i2 |= AbstractC25232BEp.A0T(c5Tl, imageUrl);
        }
        if ((i2 & 147) == 146 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(433882157, "com.instagram.aistudio.editor.TemplateCard (TemplateCardComponent.kt:119)");
            }
            C1130158n c1130158n = Modifier.A00;
            C6LQ.A03(c5Tl, AbstractC25236BEt.A0H(c5Tl, c1130158n, 120.0f), AbstractC25226BEj.A0w(c5Tl, imageUrl, i2 >> 6));
            C5WR.A0P(c5Tl, AbstractC118175Wb.A07(c1130158n), AbstractC25226BEj.A0f(c5Tl), str, (i2 & 14) | 48, AbstractC25226BEj.A0G(c5Tl));
            C5WR.A0P(c5Tl, AbstractC118175Wb.A07(c1130158n), AbstractC25225BEi.A0Y(c5Tl), str2, AbstractC25225BEi.A03(i2), AbstractC25226BEj.A0M(c5Tl));
            if (C0fH.A02()) {
                C0fH.A00(-852331135);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30489DbY(imageUrl, str, str2, i, 0);
        }
    }

    public static final void A03(C5Tl c5Tl, ImageUrl imageUrl, String str, String str2, InterfaceC16620sF interfaceC16620sF, int i) {
        int i2;
        AbstractC167017dG.A1R(imageUrl, interfaceC16620sF);
        c5Tl.Enr(-287163877);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0R(c5Tl, str) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0S(c5Tl, str2);
        }
        if ((i & 384) == 0) {
            i2 |= AbstractC25232BEp.A0T(c5Tl, imageUrl);
        }
        if ((i & 3072) == 0) {
            i2 |= AbstractC25232BEp.A0K(c5Tl, interfaceC16620sF);
        }
        if ((i2 & 1171) == 1170 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-1880831690, "com.instagram.aistudio.editor.CreatorCard (TemplateCardComponent.kt:147)");
            }
            Object A11 = AbstractC25225BEi.A11(c5Tl);
            C0eB c0eB = C0eB.A00;
            boolean A1Z = AbstractC25227BEk.A1Z(c5Tl, A11, -66759360);
            Object EEc = c5Tl.EEc();
            if (A1Z || EEc == C5UI.A00) {
                EEc = new MW8(A11, null, 46);
                c5Tl.FBy(EEc);
            }
            C117505Tk A0E = AbstractC25235BEs.A0E(c5Tl, EEc, c0eB);
            C1130158n c1130158n = Modifier.A00;
            C6LQ.A03(c5Tl, AbstractC25236BEt.A0H(c5Tl, AbstractC118175Wb.A0E(c1130158n, 0.0f, 4.0f, 0.0f, 0.0f), 120.0f), AbstractC25226BEj.A0w(c5Tl, imageUrl, i2 >> 6));
            C5WR.A0P(c5Tl, AbstractC118175Wb.A0A(AbstractC118175Wb.A0E(c1130158n, 0.0f, 24.0f, 0.0f, 0.0f), 32.0f, 0.0f), C5XL.A01(c5Tl).A04, str, (i2 & 14) | 48, AbstractC25226BEj.A0G(c5Tl));
            C5WR.A0P(c5Tl, AbstractC118175Wb.A0A(AbstractC118175Wb.A0C(c1130158n, 0.0f, 0.0f, 24.0f), 32.0f, 0.0f), AbstractC25226BEj.A0c(c5Tl), str2, AbstractC25225BEi.A03(i2), AbstractC25226BEj.A0M(c5Tl));
            boolean z = false;
            String A002 = C5YD.A00(c5Tl, 2131975775);
            C25267BGf A0u = AbstractC25225BEi.A0u(c5Tl);
            Modifier A0E2 = AbstractC118175Wb.A0E(AbstractC118175Wb.A0A(AbstractC25226BEj.A0T(c1130158n), 32.0f, 0.0f), 0.0f, 0.0f, 0.0f, 8.0f);
            boolean A1Z2 = AbstractC25227BEk.A1Z(c5Tl, A11, -66732181);
            if ((i2 & 7168) == 2048) {
                z = true;
            }
            boolean z2 = z | A1Z2;
            Object EEc2 = c5Tl.EEc();
            if (z2 || EEc2 == C5UI.A00) {
                EEc2 = C29897DGl.A00(c5Tl, interfaceC16620sF, A11, 8);
            }
            C6GE.A02(c5Tl, A0E2, A0u, A002, AbstractC25225BEi.A1A(A0E, EEc2, false));
            if (C0fH.A02()) {
                C0fH.A00(-1679888135);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30225DTe(interfaceC16620sF, imageUrl, str2, str, i, 0);
        }
    }

    public static final void A00(C5Tl c5Tl, int i) {
        c5Tl.Enr(1634199262);
        if (i == 0 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(2127919078, "com.instagram.aistudio.editor.CustomCard (TemplateCardComponent.kt:99)");
            }
            C1130158n c1130158n = Modifier.A00;
            Modifier A002 = C6L3.A00(AbstractC25231BEo.A0R(c1130158n, 120.0f), CNP.A00, C5AF.A00);
            InterfaceC1127857k A0O = AbstractC25235BEs.A0O(c5Tl);
            int A003 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, A002);
            AbstractC25233BEq.A11(c5Tl, c117505Tk);
            AbstractC25231BEo.A12(c5Tl, A0O, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A003)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A003);
            }
            AbstractC25225BEi.A1K(c5Tl, A01);
            C6LQ.A07(c5Tl, null, C5Y7.A00(c5Tl, R.drawable.instagram_add_pano_outline_24, 0), 48, 124);
            c5Tl.ASW();
            C5WR.A0T(c5Tl, AbstractC118175Wb.A07(c1130158n), AbstractC25226BEj.A0f(c5Tl), C5YD.A00(c5Tl, 2131952762), AbstractC25226BEj.A0G(c5Tl));
            if (C0fH.A02()) {
                C0fH.A00(-1532589444);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30494Dbd.A01(ASZ, i, 8);
        }
    }
}
