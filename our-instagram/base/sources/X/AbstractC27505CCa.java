package X;

import androidx.compose.ui.Modifier;
import com.instagram.common.session.UserSession;

/* renamed from: X.CCa, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC27505CCa {
    public static final void A00(C5Tl c5Tl, String str, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16620sF interfaceC16620sF, C5Hc c5Hc, int i) {
        int i2;
        C14360o3.A0B(c5Hc, 0);
        AbstractC25233BEq.A0v(1, str, interfaceC16660sJ, interfaceC16620sF);
        c5Tl.Enr(2121586472);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0R(c5Tl, c5Hc) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0S(c5Tl, str);
        }
        if ((i & 384) == 0) {
            i2 |= AbstractC25232BEp.A0J(c5Tl, interfaceC16660sJ);
        }
        if ((i & 3072) == 0) {
            i2 |= AbstractC25232BEp.A0K(c5Tl, interfaceC16620sF);
        }
        if ((i2 & 1171) == 1170 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-2075511177, "com.instagram.aistudio.editor.AiConversationScreen (AiConversationScreen.kt:38)");
            }
            UserSession A0u = AbstractC25228BEl.A0u(c5Tl);
            Object A0q = AbstractC25227BEk.A0q(c5Tl, 2043798668);
            Object obj = C5UI.A00;
            if (A0q == obj) {
                A0q = AbstractC25232BEp.A0w(c5Tl, C29183Cto.A00);
            }
            InterfaceC74953Yl interfaceC74953Yl = (InterfaceC74953Yl) A0q;
            C117505Tk A0K = AbstractC25225BEi.A0K(c5Tl, false);
            Object A0q2 = AbstractC25227BEk.A0q(c5Tl, 2043801444);
            Object obj2 = A0q2;
            if (A0q2 == obj) {
                C29183Cto c29183Cto = C29183Cto.A00;
                C6MK c6mk = new C6MK();
                c6mk.addAll(AbstractC009903n.A0J(new C29183Cto[]{c29183Cto, c29183Cto, c29183Cto}));
                c5Tl.FBy(c6mk);
                obj2 = c6mk;
            }
            C6MK c6mk2 = (C6MK) obj2;
            C117505Tk.A0L(A0K, false);
            String A00 = C5YD.A00(c5Tl, 2131961928);
            int A07 = AbstractC25225BEi.A07(AbstractC166997dE.A0U(A0u), A0u, 36605486573360398L);
            int A072 = AbstractC25225BEi.A07(AbstractC166997dE.A0U(A0u), A0u, 36605486573622546L);
            Object AJX = c5Tl.AJX(C5V2.A0A);
            Modifier A002 = C30711Df9.A00(Modifier.A00, C5XU.A00, 0);
            boolean A1Y = AbstractC25227BEk.A1Y(c5Tl, AJX, 2043818767);
            Object EEc = c5Tl.EEc();
            if (A1Y || EEc == obj) {
                EEc = DGW.A00(AJX, 34);
                c5Tl.FBy(EEc);
            }
            Modifier A05 = C5XR.A05(A002, null, null, AbstractC25225BEi.A1A(A0K, EEc, false), true);
            boolean A1V = AbstractC25228BEl.A1V(c5Tl, A00, AbstractC25234BEr.A1Y(c5Tl, 2043821788, i2), c5Tl.AH2(A07)) | AbstractC25233BEq.A1J(i2) | AbstractC25233BEq.A1H(i2) | c5Tl.AH2(A072) | AbstractC25235BEs.A1T(i2);
            Object EEc2 = c5Tl.EEc();
            if (A1V || EEc2 == obj) {
                EEc2 = new DIG(interfaceC74953Yl, c6mk2, str, A00, interfaceC16660sJ, interfaceC16620sF, c5Hc, A07, A072);
                c5Tl.FBy(EEc2);
            }
            C6IS.A07(c5Tl, A05, AbstractC25225BEi.A1B(A0K, EEc2, false), 0);
            if (C0fH.A02()) {
                C0fH.A00(182169852);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30224DTd(c5Hc, interfaceC16660sJ, interfaceC16620sF, str, i, 0);
        }
    }
}
