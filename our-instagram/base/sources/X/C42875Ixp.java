package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.bottomsheet.BottomSheetFragment;
import com.instagram.model.payments.checkout.CheckoutLaunchParams;
import com.instagram.shopping.fragment.cart.MerchantShoppingCartFragment;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;

/* renamed from: X.Ixp, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42875Ixp implements InterfaceC43454JHs {
    public final AbstractC59962oe A00;
    public final UserSession A01;
    public final InterfaceC60442pS A02;
    public final BottomSheetFragment A03;

    public C42875Ixp(AbstractC59962oe abstractC59962oe, UserSession userSession, InterfaceC60442pS interfaceC60442pS, BottomSheetFragment bottomSheetFragment) {
        AbstractC167007dF.A1F(bottomSheetFragment, 2, userSession);
        this.A00 = abstractC59962oe;
        this.A03 = bottomSheetFragment;
        this.A02 = interfaceC60442pS;
        this.A01 = userSession;
    }

    @Override // X.InterfaceC43454JHs
    public final void CrJ(User user, Long l, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        boolean A1R = AbstractC167007dF.A1R(0, user, str);
        C14360o3.A0B(str2, 2);
        C14360o3.A0B(str3, 3);
        C189478aR c189478aR = this.A03.A02;
        if (c189478aR != null) {
            MerchantShoppingCartFragment A0D = C1XJ.A00.A0T().A0D(l, AbstractC76433bn.A00(user), str, str2, str3, null, str6, str5, str4, null, str7, str8, str9, false, false);
            C189448aO A0y = AbstractC25225BEi.A0y(this.A01);
            AbstractC25226BEj.A1M(this.A00.requireContext(), A0y, 2131973957);
            AbstractC25225BEi.A1Q(A0y, A1R);
            A0y.A0x = A1R;
            A0y.A03 = 0.66f;
            A0y.A1O = false;
            C14360o3.A0C(A0D, MSV.A00(3));
            A0y.A0T = A0D;
            int[] iArr = C189448aO.A1X;
            A0y.A04(iArr[0], iArr[A1R ? 1 : 0], iArr[2], iArr[3]);
            c189478aR.A0F(A0D, A0y);
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.InterfaceC43454JHs
    public final void Cra(Product product, String str, String str2, String str3) {
        AbstractC167007dF.A1D(str, 1, str2);
        C42130Ile A0L = C1XJ.A00.A0L(this.A00.requireActivity(), this.A01, this.A02, product, "shopping_bag_product_collection", str);
        A0L.A0N = str2;
        A0L.A0Z = true;
        C42130Ile.A01(A0L);
    }

    @Override // X.InterfaceC43454JHs
    public final void Cri(User user, String str, String str2, String str3, String str4) {
        C14360o3.A0B(user, 0);
        AbstractC25233BEq.A0v(1, str, str2, str3);
        C1XJ c1xj = C1XJ.A00;
        FragmentActivity requireActivity = this.A00.requireActivity();
        UserSession userSession = this.A01;
        InterfaceC60442pS interfaceC60442pS = this.A02;
        String A0W = AbstractC37303Gc4.A0W(user);
        String A0U = AbstractC37300Gc1.A0U(user);
        if (A0U == null) {
            A0U = "";
        }
        C41749IeN A0N = c1xj.A0N(requireActivity, AbstractC37300Gc1.A08(user), userSession, interfaceC60442pS, str, str2, "unavailable_product_card", A0W, A0U);
        A0N.A06(null, str3, str2, null, null);
        A0N.A0L = true;
        A0N.A05();
    }

    @Override // X.InterfaceC43454JHs
    public final void Cqg(CheckoutLaunchParams checkoutLaunchParams) {
        AbstractC40758I4m.A00().A04(this.A00.requireActivity(), this.A01, checkoutLaunchParams, "bottom_sheet_index_cart");
    }
}
