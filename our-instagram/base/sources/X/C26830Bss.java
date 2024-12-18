package X;

import android.os.Bundle;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.ComposeView;
import com.facebook.R;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.Bss, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26830Bss extends AbstractC59962oe implements InterfaceC60442pS {
    public static final String __redex_internal_original_name = "OpenCarouselReviewPageHeaderFragment";
    public User A00;
    public final InterfaceC09390do A01 = AbstractC60492pY.A02(this);
    public final InterfaceC09390do A02;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return AbstractC111324zv.A00(1157);
    }

    @Override // X.InterfaceC60442pS
    public final boolean isOrganicEligible() {
        return true;
    }

    @Override // X.InterfaceC60442pS
    public final boolean isSponsoredEligible() {
        return false;
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A01);
    }

    public C26830Bss() {
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new J7S(new J7S(this, 23), 21));
        C0YZ A1D = AbstractC25225BEi.A1D(C38333GtS.class);
        this.A02 = AbstractC25225BEi.A0a(new J7S(A00, 22), new D8M(27, A00, this), new D8M(26, null, A00), A1D);
    }

    public static final void A00(C5Tl c5Tl, C37838Gks c37838Gks, C26830Bss c26830Bss, int i) {
        int i2;
        String str;
        List Ab8;
        c5Tl.Enr(-1574236929);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0H(c5Tl, c37838Gks) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0I(c5Tl, c26830Bss);
        }
        if ((i2 & 19) == 18 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-94481417, "com.instagram.feed.opencarousel.reviewpage.fragment.OpenCarouselReviewPageHeaderFragment.AuthorComponent (OpenCarouselReviewPageHeaderFragment.kt:102)");
            }
            InterfaceC118225Wj interfaceC118225Wj = C118195Wf.A04;
            C1130158n c1130158n = Modifier.A00;
            String str2 = null;
            Modifier A0D = AbstractC118175Wb.A0D(c1130158n, 16.0f, 0.0f, 8.0f);
            InterfaceC1127857k A0V = AbstractC25225BEi.A0V(c5Tl, interfaceC118225Wj);
            int A00 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, A0D);
            AbstractC25233BEq.A11(c5Tl, c117505Tk);
            AbstractC25231BEo.A12(c5Tl, A0V, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A00);
            }
            AbstractC25225BEi.A1K(c5Tl, A01);
            User user = c26830Bss.A00;
            if (user != null) {
                str = AbstractC25228BEl.A19(user);
            } else {
                str = null;
            }
            c5Tl.Eno(-1262993933);
            if (str != null) {
                C2DB A002 = AbstractC43541zP.A00(c5Tl, AbstractC81033jX.A00(AbstractC25227BEk.A0B(str), -1, -1));
                Modifier A0W = AbstractC25226BEj.A0W(AbstractC118175Wb.A0E(AbstractC118185Wd.A0G(c1130158n, 26.0f, 20.0f), 0.0f, 0.0f, 6.0f, 0.0f));
                boolean A1Z = AbstractC25227BEk.A1Z(c5Tl, c26830Bss, 53831711);
                Object EEc = c5Tl.EEc();
                if (A1Z || EEc == C5UI.A00) {
                    EEc = new J7S(c26830Bss, 18);
                    c5Tl.FBy(EEc);
                }
                C6LQ.A08(c5Tl, CY3.A01(c5Tl, A0W, AbstractC25225BEi.A1A(c117505Tk, EEc, false)), A002, C5YJ.A01);
            }
            C117505Tk.A0L(c117505Tk, false);
            User user2 = c26830Bss.A00;
            if (user2 != null) {
                str2 = user2.getUsername();
            }
            c5Tl.Eno(-1262975128);
            if (str2 != null) {
                C118125Vw A0h = AbstractC25226BEj.A0h(c5Tl);
                long A0G = AbstractC25226BEj.A0G(c5Tl);
                boolean A1Z2 = AbstractC25227BEk.A1Z(c5Tl, c26830Bss, 53844191);
                Object EEc2 = c5Tl.EEc();
                if (A1Z2 || EEc2 == C5UI.A00) {
                    EEc2 = new J7S(c26830Bss, 19);
                    c5Tl.FBy(EEc2);
                }
                C5WR.A0E(c5Tl, CY3.A01(c5Tl, c1130158n, AbstractC25225BEi.A1A(c117505Tk, EEc2, false)), A0h, str2, 1, 0, 15352, A0G);
                c5Tl.Eno(-1262965797);
                User user3 = c26830Bss.A00;
                if (user3 != null && user3.isVerified()) {
                    AbstractC137516Kw.A00(c5Tl, AbstractC118175Wb.A0E(c1130158n, 1.0f, 0.0f, 0.0f, 0.0f));
                }
                C117505Tk.A0L(c117505Tk, false);
                c5Tl.Eno(-1262961593);
                C38321qM c38321qM = (C38321qM) c37838Gks.A05;
                if (c38321qM != null && (Ab8 = c38321qM.A0C.Ab8()) != null && AbstractC166987dD.A1b(Ab8)) {
                    A02(c5Tl, c37838Gks, c26830Bss, AbstractC25225BEi.A02(i2));
                }
                C117505Tk.A0L(c117505Tk, false);
            }
            if (AbstractC25230BEn.A1U(c5Tl, c117505Tk, false)) {
                C0fH.A00(2000951229);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30510Dbt.A01(ASZ, c26830Bss, c37838Gks, i, 24);
        }
    }

    public static final void A01(C5Tl c5Tl, C37838Gks c37838Gks, C26830Bss c26830Bss, int i) {
        int i2;
        String A2v;
        c5Tl.Enr(-1990391272);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0H(c5Tl, c37838Gks) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(2069647486, "com.instagram.feed.opencarousel.reviewpage.fragment.OpenCarouselReviewPageHeaderFragment.PromptComponent (OpenCarouselReviewPageHeaderFragment.kt:90)");
            }
            C38321qM c38321qM = (C38321qM) c37838Gks.A05;
            if (c38321qM != null && (A2v = c38321qM.A2v()) != null) {
                C5WR.A0J(c5Tl, AbstractC118175Wb.A0D(Modifier.A00, 16.0f, 0.0f, 8.0f), AbstractC25225BEi.A0X(c5Tl), A2v, 5, 16252, 0L);
            }
            if (C0fH.A02()) {
                C0fH.A00(-1918839485);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30510Dbt.A01(ASZ, c26830Bss, c37838Gks, i, 25);
        }
    }

    public static final void A02(C5Tl c5Tl, C37838Gks c37838Gks, C26830Bss c26830Bss, int i) {
        int i2;
        int i3;
        List Ab8;
        c5Tl.Enr(-6353222);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0H(c5Tl, c37838Gks) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0I(c5Tl, c26830Bss);
        }
        if ((i2 & 19) == 18 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-195990374, "com.instagram.feed.opencarousel.reviewpage.fragment.OpenCarouselReviewPageHeaderFragment.SubmitterCountComponent (OpenCarouselReviewPageHeaderFragment.kt:137)");
            }
            C38321qM c38321qM = (C38321qM) c37838Gks.A05;
            if (c38321qM != null && (Ab8 = c38321qM.A0C.Ab8()) != null) {
                i3 = Ab8.size();
            } else {
                i3 = 0;
            }
            Spanned A02 = AbstractC07900bA.A02(AbstractC166997dE.A0N(c26830Bss), new String[]{"", String.valueOf(i3)}, R.plurals.open_carousel_media_user_name_header, i3);
            C14360o3.A07(A02);
            Object obj = null;
            C6C7 A0g = AbstractC25228BEl.A0g();
            A0g.A09(" ");
            String obj2 = A02.toString();
            Object[] spans = A02.getSpans(0, A02.length(), Object.class);
            C14360o3.A07(spans);
            if (0 < spans.length) {
                obj = spans[0];
            }
            A0g.A09(obj2);
            if (obj != null) {
                int spanStart = A02.getSpanStart(obj) + 1;
                int spanEnd = A02.getSpanEnd(obj) + 1;
                A0g.A06(new C5W3(null, null, null, C5W5.A03, null, 65531, 0L, 0L, 0L), spanStart, spanEnd);
                A0g.A0A("submitters", "Submitters", spanStart, spanEnd);
            }
            C5C8 A022 = A0g.A02();
            C118125Vw A0c = AbstractC25226BEj.A0c(c5Tl);
            long A0G = AbstractC25226BEj.A0G(c5Tl);
            C1130158n c1130158n = Modifier.A00;
            boolean A1W = AbstractC25233BEq.A1W(c5Tl, c26830Bss, c37838Gks, 923035727);
            Object EEc = c5Tl.EEc();
            if (A1W || EEc == C5UI.A00) {
                EEc = new D8M(25, c37838Gks, c26830Bss);
                c5Tl.FBy(EEc);
            }
            AbstractC25225BEi.A1V(c5Tl, false);
            C5WR.A01(c5Tl, CY3.A01(c5Tl, c1130158n, (InterfaceC16820sZ) EEc), A022, A0c, 24568, A0G);
            if (C0fH.A02()) {
                C0fH.A00(30226602);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30510Dbt.A01(ASZ, c26830Bss, c37838Gks, i, 26);
        }
    }

    public static final void A03(C5Tl c5Tl, C26830Bss c26830Bss, int i) {
        c5Tl.Enr(-1992476345);
        if ((i & 1) == 0 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-793889692, "com.instagram.feed.opencarousel.reviewpage.fragment.OpenCarouselReviewPageHeaderFragment.Separator (OpenCarouselReviewPageHeaderFragment.kt:230)");
            }
            C1130158n c1130158n = Modifier.A00;
            AbstractC25229BEm.A16(c5Tl, AbstractC118185Wd.A08(AbstractC25226BEj.A0T(c1130158n), 0.5f), AbstractC25225BEi.A0D(c5Tl));
            AbstractC25226BEj.A1O(c5Tl, c1130158n, 8.0f);
            if (C0fH.A02()) {
                C0fH.A00(1356365525);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30497Dbg.A01(ASZ, c26830Bss, i, 16);
        }
    }

    public static final void A04(C5Tl c5Tl, C26830Bss c26830Bss, int i) {
        int i2;
        c5Tl.Enr(-1156136344);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0H(c5Tl, c26830Bss) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(475409250, "com.instagram.feed.opencarousel.reviewpage.fragment.OpenCarouselReviewPageHeaderFragment.ViewPostButtonComponent (OpenCarouselReviewPageHeaderFragment.kt:167)");
            }
            boolean A1Z = AbstractC25227BEk.A1Z(c5Tl, c26830Bss, -1753113227);
            Object EEc = c5Tl.EEc();
            if (A1Z || EEc == C5UI.A00) {
                EEc = new J7S(c26830Bss, 20);
                c5Tl.FBy(EEc);
            }
            boolean A1W = AbstractC25228BEl.A1W(c5Tl);
            String A00 = AbstractC136736Hc.A00(c5Tl, 2131969183);
            Modifier A0D = AbstractC118175Wb.A0D(AbstractC25226BEj.A0T(Modifier.A00), 16.0f, 6.0f, 20.0f);
            C25267BGf A0u = AbstractC25225BEi.A0u(c5Tl);
            C6GE.A00(null, c5Tl, A0D, null, C6GD.A02, A0u, A00, (InterfaceC16820sZ) EEc, 14180352, 264, true, A1W);
            if (C0fH.A02()) {
                C0fH.A00(-341243143);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30497Dbg.A01(ASZ, c26830Bss, i, 17);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1851263395);
        ComposeView A00 = AbstractC25319BIo.A00(this, new C30191DRw(this, 6), -1381756590);
        C0f9.A09(-1762906801, A02);
        return A00;
    }
}
