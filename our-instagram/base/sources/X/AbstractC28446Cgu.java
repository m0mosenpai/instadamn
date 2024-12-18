package X;

import androidx.compose.ui.Modifier;
import com.instagram.compose.core.ui.IgClickableTextKt;
import com.instagram.wonderwall.model.WallInfo;
import com.instagram.wonderwall.model.WallText;
import java.util.Iterator;

/* renamed from: X.Cgu, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC28446Cgu {
    public static final void A00(C5Tl c5Tl, C51752Mtb c51752Mtb, int i) {
        int i2;
        C14360o3.A0B(c51752Mtb, 0);
        c5Tl.Enr(1728016383);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0R(c5Tl, c51752Mtb) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-1095140272, "com.instagram.wonderwall.ui.compose.components.WallPostComposerAction (WallPostEditor.kt:167)");
            }
            C1130158n c1130158n = Modifier.A00;
            Modifier A0C = AbstractC118185Wd.A0C(c1130158n, 32.0f);
            boolean A1O = AbstractC25233BEq.A1O(c5Tl, 260172644, i2);
            Object EEc = c5Tl.EEc();
            if (A1O || EEc == C5UI.A00) {
                EEc = new C57529Pg3(c51752Mtb, 45);
                c5Tl.FBy(EEc);
            }
            C117505Tk A0K = AbstractC25225BEi.A0K(c5Tl, false);
            Modifier A01 = C6L3.A01(CY3.A01(c5Tl, A0C, (InterfaceC16820sZ) EEc), C5WF.A00, AbstractC25226BEj.A0B(c5Tl));
            InterfaceC1127857k A0a = AbstractC25226BEj.A0a(false);
            int A00 = C5X2.A00(c5Tl);
            C59P A04 = C117505Tk.A04(A0K);
            Modifier A012 = C5X3.A01(c5Tl, A01);
            AbstractC25233BEq.A11(c5Tl, A0K);
            AbstractC25231BEo.A12(c5Tl, A0a, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (A0K.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A00);
            }
            AbstractC25225BEi.A1K(c5Tl, A012);
            C5YS.A07(c5Tl, AbstractC118185Wd.A03(c1130158n), C5Y7.A00(c5Tl, c51752Mtb.A01, 0), null, AbstractC136736Hc.A00(c5Tl, c51752Mtb.A00), 384, 24, 0L);
            if (AbstractC25227BEk.A1R(c5Tl)) {
                C0fH.A00(548792382);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30498Dbh.A01(ASZ, c51752Mtb, i, 4);
        }
    }

    public static final void A01(C5Tl c5Tl, C26019Bf8 c26019Bf8, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16620sF interfaceC16620sF, InterfaceC16620sF interfaceC16620sF2, int i) {
        int i2;
        boolean A1b = AbstractC25233BEq.A1b(c26019Bf8, interfaceC16660sJ, interfaceC16620sF);
        C14360o3.A0B(interfaceC16620sF2, 3);
        c5Tl.Enr(190408266);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0R(c5Tl, c26019Bf8) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0I(c5Tl, interfaceC16660sJ);
        }
        if ((i & 384) == 0) {
            i2 |= AbstractC25232BEp.A0J(c5Tl, interfaceC16620sF);
        }
        if ((i & 3072) == 0) {
            i2 |= AbstractC25232BEp.A0K(c5Tl, interfaceC16620sF2);
        }
        if ((i2 & 1171) == 1170 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(1701527102, "com.instagram.wonderwall.ui.compose.components.WallPostEditor (WallPostEditor.kt:62)");
            }
            Object A0q = AbstractC25227BEk.A0q(c5Tl, 827884822);
            Object obj = C5UI.A00;
            C25338BJh c25338BJh = (C25338BJh) AbstractC25231BEo.A0l(c5Tl, A0q, obj);
            C117505Tk A0K = AbstractC25225BEi.A0K(c5Tl, false);
            Object AJX = c5Tl.AJX(C5V2.A0A);
            long j = C5XL.A00(c5Tl).A0b;
            c5Tl.Eno(827890676);
            boolean AH3 = c5Tl.AH3(j);
            Object EEc = c5Tl.EEc();
            if (AH3 || EEc == obj) {
                EEc = new C28866Coa(j);
                c5Tl.FBy(EEc);
            }
            C117505Tk.A0L(A0K, false);
            C5C3 c5c3 = c26019Bf8.A00;
            C118125Vw A0D = AbstractC28470ChM.A00(c5Tl, c5c3.A01.A00, AbstractC167007dF.A1W(c26019Bf8.A03)).A0D(new C118125Vw(null, null, null, 0, 0, 6291454, ((C1132359l) c5Tl.AJX(C6L9.A00)).A00, 0L, 0L, 0L));
            C6L4 c6l4 = new C6L4(AbstractC25226BEj.A0G(c5Tl));
            AbstractC28411CgH.A00(null, null, null, c5Tl, AbstractC25230BEn.A0X(Modifier.A00, c25338BJh), c6l4, A0D, c5c3, (InterfaceC31101Dlj) EEc, interfaceC16660sJ, null, C5UA.A01(c5Tl, new C30536DcJ(24, interfaceC16620sF, c26019Bf8, interfaceC16620sF2), -1329170553), 3, A1b ? 1 : 0, (i2 & 112) | 805306368, 196614, 12760, false, false, false);
            Boolean valueOf = Boolean.valueOf(c26019Bf8.A09);
            boolean AH4 = c5Tl.AH4(AJX) | AbstractC25234BEr.A1X(c5Tl, 827926232, i2);
            Object EEc2 = c5Tl.EEc();
            if (AH4 || EEc2 == obj) {
                EEc2 = new PZN(c25338BJh, AJX, c26019Bf8, null, 25);
                c5Tl.FBy(EEc2);
            }
            if (AbstractC25232BEp.A1V(c5Tl, A0K, EEc2, valueOf, false)) {
                C0fH.A00(395539640);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30491Dba(c26019Bf8, interfaceC16660sJ, interfaceC16620sF2, interfaceC16620sF, i, 27);
        }
    }

    public static final void A03(C5Tl c5Tl, C25868BcP c25868BcP, int i) {
        int i2;
        C14360o3.A0B(c25868BcP, 0);
        c5Tl.Enr(1607715704);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0R(c5Tl, c25868BcP) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(749645980, "com.instagram.wonderwall.ui.compose.components.WallPostComposerDisclosure (WallPostEditor.kt:183)");
            }
            Object A19 = AbstractC25226BEj.A19(c5Tl);
            boolean A1Z = AbstractC25227BEk.A1Z(c5Tl, A19, 1853038797);
            Object EEc = c5Tl.EEc();
            if (A1Z || EEc == C5UI.A00) {
                EEc = C30179DRk.A00(c5Tl, A19, 8);
            }
            InterfaceC16660sJ interfaceC16660sJ = (InterfaceC16660sJ) EEc;
            C117505Tk A0K = AbstractC25225BEi.A0K(c5Tl, false);
            long A0G = AbstractC25226BEj.A0G(c5Tl);
            Object A0q = AbstractC25227BEk.A0q(c5Tl, 1853042906);
            Object obj = C5UI.A00;
            if (A0q == obj) {
                C14360o3.A0B(interfaceC16660sJ, 1);
                C6C7 A0g = AbstractC25228BEl.A0g();
                WallInfo wallInfo = c25868BcP.A02;
                int i3 = 2131976961;
                if (wallInfo.A03) {
                    i3 = 2131976960;
                }
                String username = wallInfo.A00.getUsername();
                String str = (String) interfaceC16660sJ.invoke(new WallText.Res(i3, new String[]{username}));
                int A08 = AbstractC001900j.A08(str, username, 0, false);
                int A04 = AbstractC25226BEj.A04(username, A08);
                A0g.A09(str);
                if (A08 > 0) {
                    A0g.A06(new C5W3(null, null, null, C5W5.A02, null, 65530, A0G, 0L, 0L), A08, A04);
                    A0g.A0A(AbstractC50532MSl.A01(247, 8, 59), username, A08, A04);
                }
                A0q = A0g.A02();
                c5Tl.FBy(A0q);
            }
            C5C8 c5c8 = (C5C8) A0q;
            Modifier A0A = AbstractC118175Wb.A0A(AbstractC25225BEi.A0O(A0K), 54.0f, 16.0f);
            C118125Vw A0f = AbstractC25226BEj.A0f(c5Tl);
            long A0M = AbstractC25226BEj.A0M(c5Tl);
            boolean A1O = AbstractC25233BEq.A1O(c5Tl, 1853057918, i2);
            Object EEc2 = c5Tl.EEc();
            if (A1O || EEc2 == obj) {
                EEc2 = new C57751Pje(28, c5c8, c25868BcP);
                c5Tl.FBy(EEc2);
            }
            IgClickableTextKt.A02(c5Tl, A0A, c5c8, A0f, AbstractC25225BEi.A1B(A0K, EEc2, false), 3, 6, 0, 112568, A0M);
            if (C0fH.A02()) {
                C0fH.A00(-319688006);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30498Dbh.A01(ASZ, c25868BcP, i, 6);
        }
    }

    public static final void A04(C5Hc c5Hc, C5Tl c5Tl, int i) {
        int i2;
        C14360o3.A0B(c5Hc, 0);
        c5Tl.Enr(1191055602);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0R(c5Tl, c5Hc) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-526353071, "com.instagram.wonderwall.ui.compose.components.WallPostComposerActions (WallPostEditor.kt:151)");
            }
            if (AbstractC166987dD.A1b(c5Hc)) {
                C1130158n c1130158n = Modifier.A00;
                InterfaceC1127857k A0f = AbstractC25228BEl.A0f(c5Tl, 0);
                int A00 = C5X2.A00(c5Tl);
                C117505Tk c117505Tk = (C117505Tk) c5Tl;
                C59P A04 = C117505Tk.A04(c117505Tk);
                Modifier A01 = C5X3.A01(c5Tl, c1130158n);
                AbstractC25233BEq.A11(c5Tl, c117505Tk);
                AbstractC25231BEo.A12(c5Tl, A0f, A04);
                InterfaceC16620sF interfaceC16620sF = C5X8.A02;
                if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                    AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A00);
                }
                AbstractC25225BEi.A1K(c5Tl, A01);
                Iterator A0x = AbstractC25227BEk.A0x(c5Tl, c5Hc, -1958951421);
                int i3 = 0;
                while (A0x.hasNext()) {
                    Object next = A0x.next();
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        AbstractC16960so.A1U();
                        throw C00O.createAndThrow();
                    }
                    A00(c5Tl, (C51752Mtb) next, 0);
                    c5Tl.Eno(-1958948918);
                    if (i3 < AbstractC25226BEj.A05(c5Hc)) {
                        AbstractC25227BEk.A16(c5Tl, c1130158n, 12.0f);
                    }
                    C117505Tk.A0L(c117505Tk, false);
                    i3 = i4;
                }
                C117505Tk.A0L(c117505Tk, false);
                c5Tl.ASW();
            }
            if (C0fH.A02()) {
                C0fH.A00(617033657);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30498Dbh.A01(ASZ, c5Hc, i, 5);
        }
    }

    public static final void A02(C5Tl c5Tl, C26019Bf8 c26019Bf8, InterfaceC16620sF interfaceC16620sF, InterfaceC16620sF interfaceC16620sF2, InterfaceC16620sF interfaceC16620sF3, int i) {
        int i2;
        c5Tl.Enr(-254652409);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0R(c5Tl, c26019Bf8) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0I(c5Tl, interfaceC16620sF);
        }
        if ((i & 384) == 0) {
            i2 |= AbstractC25232BEp.A0J(c5Tl, interfaceC16620sF2);
        }
        if ((i & 3072) == 0) {
            i2 |= AbstractC25232BEp.A0K(c5Tl, interfaceC16620sF3);
        }
        if ((i2 & 1171) == 1170 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(1935175838, "com.instagram.wonderwall.ui.compose.components.WallPostEditorDecorationBox (WallPostEditor.kt:119)");
            }
            c5Tl.Eno(1418626542);
            boolean A1P = AbstractC167007dF.A1P(i2 & 14, 4);
            Object EEc = c5Tl.EEc();
            if (A1P || EEc == C5UI.A00) {
                EEc = new C57529Pg3(c26019Bf8, 46);
                c5Tl.FBy(EEc);
            }
            C117505Tk A0K = AbstractC25225BEi.A0K(c5Tl, false);
            C113775Bp A0L = AbstractC25225BEi.A0L(null, (InterfaceC16820sZ) EEc);
            InterfaceC118245Wl interfaceC118245Wl = C118195Wf.A00;
            C1130158n c1130158n = Modifier.A00;
            InterfaceC1127857k A0Z = AbstractC25226BEj.A0Z(c5Tl, interfaceC118245Wl);
            int A00 = C5X2.A00(c5Tl);
            C59P A04 = C117505Tk.A04(A0K);
            Modifier A01 = C5X3.A01(c5Tl, c1130158n);
            AbstractC25233BEq.A11(c5Tl, A0K);
            AbstractC25231BEo.A12(c5Tl, A0Z, A04);
            InterfaceC16620sF interfaceC16620sF4 = C5X8.A02;
            if (A0K.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF4, A00);
            }
            AbstractC25225BEi.A1K(c5Tl, A01);
            CKV.A00(c5Tl, AbstractC118185Wd.A09(AbstractC118185Wd.A0D(c1130158n, 220.0f), 128.0f), C5UA.A01(c5Tl, new DT0(22, interfaceC16620sF, interfaceC16620sF3, interfaceC16620sF2, A0L), -807913114), 0.0f, 24582, 14, false, false);
            AbstractC25226BEj.A1O(c5Tl, c1130158n, 12.0f);
            String str = c26019Bf8.A04;
            C118125Vw A0c = AbstractC25226BEj.A0c(c5Tl);
            long A0M = AbstractC25226BEj.A0M(c5Tl);
            long j = C1132359l.A01;
            boolean z = false;
            if (!c26019Bf8.A0B) {
                z = true;
            }
            c5Tl.Eno(774414676);
            if (!z) {
                A0M = AbstractC25226BEj.A07(c5Tl);
            }
            C117505Tk.A0L(A0K, false);
            C5WR.A0u(c5Tl, A0c, str, A0M);
            if (AbstractC25227BEk.A1R(c5Tl)) {
                C0fH.A00(-624321005);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30491Dba(c26019Bf8, interfaceC16620sF, interfaceC16620sF3, interfaceC16620sF2, i, 28);
        }
    }
}
