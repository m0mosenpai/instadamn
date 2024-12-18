package X;

import android.content.Context;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.ui.Modifier;
import com.facebook.R;
import java.util.List;

/* loaded from: classes5.dex */
public abstract class Ce4 {
    public static final void A02(C5Tl c5Tl, MR5 mr5, int i) {
        int i2;
        C14360o3.A0B(mr5, 0);
        c5Tl.Enr(2041385986);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0H(c5Tl, mr5) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(1227084388, "com.instagram.direct.securityalert.keyalertdetail.ui.KeyAlertDetailScreen (KeyAlertDetailView.kt:44)");
            }
            InterfaceC74963Ym A02 = C6IB.A02(c5Tl, mr5.CCF(), 0);
            if (AbstractC25228BEl.A1X(((C51761Mtk) A02.getValue()).A00)) {
                A01(c5Tl, (C26013Bf1) AbstractC001800i.A0I((List) ((C51761Mtk) A02.getValue()).A00), mr5, ((i2 << 3) & 112) | 8);
            }
            if (C0fH.A02()) {
                C0fH.A00(207578480);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30497Dbg.A01(ASZ, mr5, i, 13);
        }
    }

    public static final C5C8 A00(C5Tl c5Tl, int i, int i2) {
        if (AbstractC25227BEk.A1U(c5Tl, 1675549925)) {
            C0fH.A01(636468491, "com.instagram.direct.securityalert.keyalertdetail.ui.buildClickAbleText (KeyAlertDetailView.kt:134)");
        }
        C6C7 A0g = AbstractC25228BEl.A0g();
        String A00 = AbstractC136736Hc.A00(c5Tl, i2);
        String A002 = AbstractC136736Hc.A00(c5Tl, i);
        A0g.A09(A002);
        A0g.A09(" ");
        A0g.A09(A00);
        int A0A = AbstractC167007dF.A0A(A002) + 1;
        int A0A2 = AbstractC167007dF.A0A(A00) + A0A;
        A0g.A06(new C5W3(null, null, null, null, null, 65534, AbstractC25226BEj.A0M(c5Tl), 0L, 0L), 0, A0A);
        A0g.A06(new C5W3(null, null, null, C5W5.A03, null, 65530, AbstractC25226BEj.A0C(c5Tl), 0L, 0L), A0A, A0A2);
        C5C8 A0R = AbstractC25227BEk.A0R(A0g, "learn_more", "Clickable learn more link", A0A, A0A2);
        if (C0fH.A02()) {
            C0fH.A00(-433797450);
        }
        AbstractC25225BEi.A1V(c5Tl, false);
        return A0R;
    }

    public static final void A01(C5Tl c5Tl, C26013Bf1 c26013Bf1, MR5 mr5, int i) {
        int i2;
        C118125Vw A00;
        boolean z;
        c5Tl.Enr(1302068217);
        if ((i & 6) == 0) {
            i2 = AbstractC25230BEn.A04(AbstractC25233BEq.A1T(c5Tl, c26013Bf1, i) ? 1 : 0) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0I(c5Tl, mr5);
        }
        if ((i2 & 19) == 18 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-1158651272, "com.instagram.direct.securityalert.keyalertdetail.ui.Success (KeyAlertDetailView.kt:53)");
            }
            Context A0K = AbstractC25228BEl.A0K(c5Tl);
            C1130158n c1130158n = Modifier.A00;
            Modifier A01 = AbstractC28285CdX.A01(AbstractC28285CdX.A00(c5Tl), c1130158n);
            InterfaceC1127857k A0Y = AbstractC25229BEm.A0Y(c5Tl, 0);
            int A002 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A012 = C5X3.A01(c5Tl, A01);
            AbstractC25233BEq.A11(c5Tl, c117505Tk);
            AbstractC25231BEo.A12(c5Tl, A0Y, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A002)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A002);
            }
            AbstractC25225BEi.A1K(c5Tl, A012);
            Modifier A0E = AbstractC118175Wb.A0E(c1130158n, C5XT.A00(c5Tl), 14.0f, C5XT.A00(c5Tl), 0.0f);
            A00 = C118125Vw.A00(null, null, AbstractC25225BEi.A0X(c5Tl), null, null, null, 0, 0, 0, 6291454, AbstractC25226BEj.A0G(c5Tl), 0L, 0L, 0L);
            C5WR.A06(c5Tl, A0E, A00, AbstractC136736Hc.A00(c5Tl, c26013Bf1.A04));
            Integer num = c26013Bf1.A09;
            if (num != null) {
                c5Tl.Eno(1191002409);
                C5C8 A003 = A00(c5Tl, c26013Bf1.A05, num.intValue());
                Modifier A0I = AbstractC25236BEt.A0I(c5Tl, c1130158n, 0.0f, 14.0f);
                boolean A1Z = AbstractC25227BEk.A1Z(c5Tl, mr5, 592624472);
                Object EEc = c5Tl.EEc();
                if (A1Z || EEc == C5UI.A00) {
                    EEc = new C50160MDn(mr5, 15);
                    c5Tl.FBy(EEc);
                }
                C5WR.A01(c5Tl, AbstractC25229BEm.A0T(c117505Tk, A0I, EEc), A003, AbstractC25226BEj.A0c(c5Tl), 24568, AbstractC25226BEj.A0M(c5Tl));
            } else {
                c5Tl.Eno(1191636824);
                C5WR.A0R(c5Tl, AbstractC25236BEt.A0I(c5Tl, c1130158n, 0.0f, 14.0f), AbstractC25226BEj.A0c(c5Tl), AbstractC136736Hc.A00(c5Tl, c26013Bf1.A05), AbstractC25226BEj.A0M(c5Tl));
            }
            C117505Tk.A0L(c117505Tk, false);
            Modifier A08 = AbstractC118185Wd.A08(c1130158n, 6.0f);
            FillElement fillElement = AbstractC118185Wd.A02;
            Modifier Eq3 = A08.Eq3(fillElement);
            long A0D = AbstractC25225BEi.A0D(c5Tl);
            C5AH c5ah = C5AF.A00;
            AbstractC119685bS.A00(c5Tl, C6L3.A01(Eq3, c5ah, A0D));
            BY1.A04(c5Tl, AbstractC136736Hc.A00(c5Tl, 2131966896));
            AbstractC25705BXp.A06(c5Tl, null, C5Y7.A00(c5Tl, R.drawable.instagram_device_phone_pano_outline_24, 0), null, AbstractC136736Hc.A00(c5Tl, 2131958549), BHY.A01(c5Tl, c26013Bf1.A08), 131022);
            AbstractC25705BXp.A06(c5Tl, null, C5Y7.A00(c5Tl, R.drawable.instagram_clock_pano_outline_24, 0), null, AbstractC136736Hc.A00(c5Tl, 2131973148), MX0.A00(A0K, c26013Bf1.A06), 131022);
            String A004 = AbstractC136736Hc.A00(c5Tl, c26013Bf1.A01);
            String A013 = BHY.A01(c5Tl, c26013Bf1.A07);
            C2DC A005 = C5Y7.A00(c5Tl, c26013Bf1.A00, 0);
            boolean A1W = AbstractC25233BEq.A1W(c5Tl, mr5, A0K, 592675105);
            if ((i2 & 14) == 4 || ((i2 & 8) != 0 && c5Tl.AH6(c26013Bf1))) {
                z = true;
            } else {
                z = false;
            }
            boolean z2 = A1W | z;
            Object EEc2 = c5Tl.EEc();
            if (z2 || EEc2 == C5UI.A00) {
                EEc2 = new ME4(22, c26013Bf1, mr5, A0K);
                c5Tl.FBy(EEc2);
            }
            AbstractC25705BXp.A06(c5Tl, AbstractC25229BEm.A0T(c117505Tk, c1130158n, EEc2), A005, null, A004, A013, 131020);
            AbstractC119685bS.A00(c5Tl, C6L3.A01(AbstractC118185Wd.A08(c1130158n, 6.0f).Eq3(fillElement), c5ah, AbstractC25225BEi.A0D(c5Tl)));
            BY1.A04(c5Tl, AbstractC136736Hc.A00(c5Tl, 2131977067));
            C5C8 A006 = A00(c5Tl, c26013Bf1.A03, c26013Bf1.A02);
            Modifier A0E2 = AbstractC118175Wb.A0E(c1130158n, C5XT.A00(c5Tl), 0.0f, C5XT.A00(c5Tl), 0.0f);
            boolean A1Z2 = AbstractC25227BEk.A1Z(c5Tl, mr5, 592697561);
            Object EEc3 = c5Tl.EEc();
            if (A1Z2 || EEc3 == C5UI.A00) {
                EEc3 = new C50160MDn(mr5, 16);
                c5Tl.FBy(EEc3);
            }
            C5WR.A01(c5Tl, AbstractC25229BEm.A0T(c117505Tk, A0E2, EEc3), A006, null, 32764, 0L);
            if (AbstractC25227BEk.A1R(c5Tl)) {
                C0fH.A00(1083757331);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30510Dbt.A01(ASZ, mr5, c26013Bf1, i, 21);
        }
    }
}
