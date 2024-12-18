package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.bottomsheet.BottomSheetFragment;
import com.instagram.modal.ModalActivity;
import com.instagram.modal.TransparentModalActivity;
import com.instagram.model.payments.checkout.CheckoutLaunchParams;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.Ixq, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42876Ixq implements JI0 {
    public final AbstractC59962oe A00;
    public final UserSession A01;
    public final InterfaceC60442pS A02;
    public final BottomSheetFragment A03;

    public C42876Ixq(AbstractC59962oe abstractC59962oe, UserSession userSession, InterfaceC60442pS interfaceC60442pS, BottomSheetFragment bottomSheetFragment) {
        AbstractC167007dF.A1F(bottomSheetFragment, 2, userSession);
        this.A00 = abstractC59962oe;
        this.A03 = bottomSheetFragment;
        this.A02 = interfaceC60442pS;
        this.A01 = userSession;
    }

    @Override // X.JI0
    public final void Crb(Product product, String str, String str2, String str3, String str4) {
        AbstractC167007dF.A1D(str, 1, str2);
        C42130Ile A0L = C1XJ.A00.A0L(this.A00.requireActivity(), this.A01, this.A02, product, str3, str);
        A0L.A0N = str2;
        A0L.A0R = str4;
        A0L.A0Z = true;
        C42130Ile.A01(A0L);
    }

    @Override // X.JI0
    public final void Crj(User user, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        C14360o3.A0B(user, 0);
        AbstractC25233BEq.A0v(1, str, str2, str3);
        C14360o3.A0B(str6, 6);
        C1XJ c1xj = C1XJ.A00;
        FragmentActivity requireActivity = this.A00.requireActivity();
        UserSession userSession = this.A01;
        InterfaceC60442pS interfaceC60442pS = this.A02;
        String A0W = AbstractC37303Gc4.A0W(user);
        String A0U = AbstractC37300Gc1.A0U(user);
        C14360o3.A0A(A0U);
        C41749IeN A0N = c1xj.A0N(requireActivity, AbstractC37300Gc1.A08(user), userSession, interfaceC60442pS, str, str3, str7, A0W, A0U);
        A0N.A06(str2, str4, str5, str6, str3);
        A0N.A0L = true;
        A0N.A05();
    }

    @Override // X.JI0
    public final void Crl(List list, int i, String str) {
        C14360o3.A0B(str, 0);
        FragmentActivity requireActivity = this.A00.requireActivity();
        UserSession userSession = this.A01;
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putString(AbstractC58317Pt9.A00(697), str);
        A0b.putString(MSV.A00(4), AbstractC111324zv.A00(3286));
        A0b.putBoolean(AbstractC43591JPw.A00(156), true);
        Bundle A0b2 = AbstractC166987dD.A0b();
        A0b2.putString("IgSessionManager.SESSION_TOKEN_KEY", userSession.getToken());
        A0b2.putStringArrayList("arg_values", AbstractC166987dD.A1F(list));
        A0b2.putInt("arg_selected_index", i);
        A0b2.putBoolean("arg_is_modal", true);
        A0b.putBundle(AbstractC111324zv.A00(213), A0b2);
        C6XJ.A06(requireActivity, A0b, TransparentModalActivity.class, "bottom_sheet");
    }

    @Override // X.JI0
    public final void Crf(User user, String str, String str2) {
        C14360o3.A0B(str, 1);
        UserSession userSession = this.A01;
        C28431Ze A02 = AbstractC31364DqT.A02();
        C31368DqX A0J = AbstractC37304Gc5.A0J(this.A02, userSession, AbstractC37303Gc4.A0W(user), "merchant_shopping_bag_view_shop_row");
        A0J.A0L = str;
        Bundle A04 = AbstractC37301Gc2.A04(userSession, A02, A0J);
        AbstractC59962oe abstractC59962oe = this.A00;
        AbstractC31171DnF.A0L(abstractC59962oe.requireActivity(), A04, userSession, ModalActivity.class, "profile").A0C(abstractC59962oe.requireContext());
    }

    @Override // X.JI0
    public final void Cqg(CheckoutLaunchParams checkoutLaunchParams) {
        AbstractC40758I4m.A00().A04(this.A00.requireActivity(), this.A01, checkoutLaunchParams, "bottom_sheet");
    }
}
