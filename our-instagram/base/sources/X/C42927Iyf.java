package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;

/* renamed from: X.Iyf, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42927Iyf implements InterfaceC43444JHi {
    public final FragmentActivity A00;
    public final UserSession A01;
    public final C38321qM A02;
    public final InterfaceC60442pS A03;
    public final IIH A04;
    public final IIX A05;
    public final Integer A06;
    public final String A07;
    public final String A08;

    public C42927Iyf(FragmentActivity fragmentActivity, UserSession userSession, C57112jm c57112jm, C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, C5GU c5gu, Integer num, String str, String str2, String str3, String str4) {
        AbstractC167007dF.A1F(userSession, 2, c57112jm);
        C14360o3.A0B(str3, 7);
        this.A00 = fragmentActivity;
        this.A01 = userSession;
        this.A03 = interfaceC60442pS;
        this.A07 = str;
        this.A08 = str3;
        this.A06 = num;
        this.A02 = c38321qM;
        IIH iih = new IIH(userSession, c38321qM, interfaceC60442pS, c5gu, str, str2, str3, str4);
        this.A04 = iih;
        this.A05 = new IIX(userSession, c57112jm, iih, AbstractC25231BEo.A0s(c38321qM));
    }

    @Override // X.InterfaceC43444JHi
    public final void A8F(User user) {
        C14360o3.A0B(user, 0);
        IIX iix = this.A05;
        C63622uj c63622uj = iix.A01;
        String str = iix.A03;
        String str2 = str;
        if (str == null) {
            str = "";
        }
        String A0i = AnonymousClass001.A0i("continue_shopping_row_impression_", str, "", '_');
        C0eB c0eB = C0eB.A00;
        if (str2 == null) {
            str2 = "";
        }
        AbstractC31176DnK.A1V(iix.A02, C59062n7.A00(user, c0eB, AnonymousClass001.A0i("continue_shopping_row_impression_", str2, "", '_')), c63622uj, A0i);
    }

    @Override // X.InterfaceC43444JHi
    public final void D7m(User user) {
        String str;
        C14360o3.A0B(user, 0);
        IIH iih = this.A04;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(iih.A03, "instagram_shopping_continue_shopping_row_tap");
        if (A0f.isSampled()) {
            AbstractC37300Gc1.A0f(A0f, iih.A02);
            AbstractC37301Gc2.A17(A0f, AbstractC76433bn.A00(user));
            A0f.AAK(null, "marketer_id");
            A0f.AAQ(iih.A00, "collections_logging_info");
            A0f.AAQ(iih.A01, "feed_item_info");
            A0f.Cht();
        }
        C1XJ c1xj = C1XJ.A00;
        FragmentActivity fragmentActivity = this.A00;
        UserSession userSession = this.A01;
        InterfaceC60442pS interfaceC60442pS = this.A03;
        String str2 = this.A08;
        String str3 = this.A07;
        if (3 - this.A06.intValue() != 0) {
            str = "shopping_product_collection_page";
        } else {
            str = "shopping_more_products";
        }
        String A0W = AbstractC37303Gc4.A0W(user);
        String A0U = AbstractC37300Gc1.A0U(user);
        C14360o3.A0A(A0U);
        C41749IeN A0N = c1xj.A0N(fragmentActivity, AbstractC37300Gc1.A08(user), userSession, interfaceC60442pS, str2, str3, str, A0W, A0U);
        A0N.A0L = true;
        C38321qM c38321qM = this.A02;
        A0N.A03 = c38321qM;
        if (c38321qM != null && c38321qM.BRp() == EnumC40111tc.A0a) {
            ArrayList A1E = AbstractC166987dD.A1E();
            A1E.addAll(C76513bv.A01(c38321qM, null));
            A0N.A0H = A1E;
        }
        A0N.A05();
    }

    @Override // X.InterfaceC43444JHi
    public final void EDC(View view) {
        C14360o3.A0B(view, 0);
        IIX iix = this.A05;
        C63622uj c63622uj = iix.A01;
        String str = iix.A03;
        if (str == null) {
            str = "";
        }
        iix.A00.A05(view, c63622uj.A00(AnonymousClass001.A0i("continue_shopping_row_impression_", str, "", '_')));
    }
}
