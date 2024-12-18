package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.model.payments.checkout.CheckoutLaunchParams;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;

/* renamed from: X.Ixo, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42874Ixo implements InterfaceC43454JHs {
    public final AbstractC59962oe A00;
    public final UserSession A01;
    public final InterfaceC60442pS A02;

    public C42874Ixo(AbstractC59962oe abstractC59962oe, UserSession userSession, InterfaceC60442pS interfaceC60442pS) {
        C14360o3.A0B(userSession, 3);
        this.A00 = abstractC59962oe;
        this.A02 = interfaceC60442pS;
        this.A01 = userSession;
    }

    @Override // X.InterfaceC43454JHs
    public final void CrJ(User user, Long l, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        C14360o3.A0B(user, 0);
        AbstractC167027dH.A13(str, str2, str3);
        C1XJ c1xj = C1XJ.A00;
        FragmentActivity requireActivity = this.A00.requireActivity();
        String A0W = AbstractC37303Gc4.A0W(user);
        c1xj.A0m(requireActivity, EnumC39651Hig.A0I, EnumC39644HiZ.UNKNOWN, EnumC39650Hif.A0I, EnumC39649Hie.A0C, this.A01, l, A0W, str, str2, str3, null, str6, str5, str4, null, str7, str8, str9, null, null, false);
    }

    @Override // X.InterfaceC43454JHs
    public final void Cra(Product product, String str, String str2, String str3) {
        AbstractC167017dG.A1P(str, str2);
        C42130Ile A0L = C1XJ.A00.A0L(this.A00.requireActivity(), this.A01, this.A02, product, "shopping_bag_product_collection", str);
        A0L.A0N = str2;
        C42130Ile.A01(A0L);
    }

    @Override // X.InterfaceC43454JHs
    public final void Cri(User user, String str, String str2, String str3, String str4) {
        AbstractC167027dH.A12(user, str, str2);
        C14360o3.A0B(str3, 3);
        C1XJ c1xj = C1XJ.A00;
        FragmentActivity requireActivity = this.A00.requireActivity();
        UserSession userSession = this.A01;
        InterfaceC60442pS interfaceC60442pS = this.A02;
        String A0W = AbstractC37303Gc4.A0W(user);
        String A0U = AbstractC37300Gc1.A0U(user);
        C14360o3.A0A(A0U);
        C41749IeN A0N = c1xj.A0N(requireActivity, AbstractC37300Gc1.A08(user), userSession, interfaceC60442pS, str, str2, "unavailable_product_card", A0W, A0U);
        A0N.A06(null, str3, str2, null, null);
        A0N.A05();
    }

    @Override // X.InterfaceC43454JHs
    public final void Cqg(CheckoutLaunchParams checkoutLaunchParams) {
        AbstractC40758I4m.A00().A04(this.A00.requireActivity(), this.A01, checkoutLaunchParams, "index_cart");
    }
}
