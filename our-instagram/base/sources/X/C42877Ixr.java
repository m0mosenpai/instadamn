package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.model.payments.checkout.CheckoutLaunchParams;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.Ixr, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42877Ixr implements JI0 {
    public final AbstractC59962oe A00;
    public final UserSession A01;
    public final InterfaceC60442pS A02;
    public final InterfaceC86363t8 A03;
    public final InterfaceC43425JGp A04;

    public C42877Ixr(AbstractC59962oe abstractC59962oe, UserSession userSession, InterfaceC60442pS interfaceC60442pS, InterfaceC86363t8 interfaceC86363t8, InterfaceC43425JGp interfaceC43425JGp) {
        C14360o3.A0B(userSession, 3);
        this.A00 = abstractC59962oe;
        this.A02 = interfaceC60442pS;
        this.A01 = userSession;
        this.A04 = interfaceC43425JGp;
        this.A03 = interfaceC86363t8;
    }

    @Override // X.JI0
    public final void Crb(Product product, String str, String str2, String str3, String str4) {
        AbstractC167017dG.A1P(str, str2);
        C42130Ile A0L = C1XJ.A00.A0L(this.A00.requireActivity(), this.A01, this.A02, product, str3, str);
        A0L.A0N = str2;
        A0L.A0R = str4;
        C42130Ile.A01(A0L);
    }

    @Override // X.JI0
    public final void Crl(List list, int i, String str) {
        C14360o3.A0B(str, 0);
        UserSession userSession = this.A01;
        IA1.A00(this.A00.requireActivity(), userSession, this.A03, this.A04, str, list, i);
    }

    @Override // X.JI0
    public final void Crf(User user, String str, String str2) {
        C14360o3.A0B(str, 1);
        FragmentActivity requireActivity = this.A00.requireActivity();
        UserSession userSession = this.A01;
        C140966Yy A0P = AbstractC31173DnH.A0P(requireActivity, userSession);
        C28431Ze A02 = AbstractC31364DqT.A02();
        C31368DqX A0J = AbstractC37304Gc5.A0J(this.A02, userSession, AbstractC37303Gc4.A0W(user), "merchant_shopping_bag_view_shop_row");
        A0J.A0L = str;
        C31368DqX.A02(A0P, userSession, A02, A0J);
    }

    @Override // X.JI0
    public final void Crj(User user, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        AbstractC167027dH.A12(user, str, str2);
        AbstractC25229BEm.A1I(str3, 3, str6);
        C1XJ c1xj = C1XJ.A00;
        FragmentActivity requireActivity = this.A00.requireActivity();
        UserSession userSession = this.A01;
        InterfaceC60442pS interfaceC60442pS = this.A02;
        String A0W = AbstractC37303Gc4.A0W(user);
        String A0U = AbstractC37300Gc1.A0U(user);
        if (A0U == null) {
            A0U = "";
        }
        C41749IeN A0N = c1xj.A0N(requireActivity, AbstractC37300Gc1.A08(user), userSession, interfaceC60442pS, str, str3, str7, A0W, A0U);
        A0N.A06(str2, str4, str5, str6, str3);
        A0N.A05();
    }

    @Override // X.JI0
    public final void Cqg(CheckoutLaunchParams checkoutLaunchParams) {
        AbstractC40758I4m.A00().A04(this.A00.requireActivity(), this.A01, checkoutLaunchParams, "cart");
    }
}
