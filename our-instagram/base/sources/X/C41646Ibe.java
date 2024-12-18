package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.model.shopping.productfeed.ProductFeedItem;
import com.instagram.model.shopping.productfeed.ProductTile;
import com.instagram.save.api.SaveApiUtil;
import com.instagram.user.model.Product;
import com.instagram.user.model.UnavailableProductImpl;
import com.instagram.user.model.User;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.Ibe, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41646Ibe {
    public C38321qM A00;
    public C31349DqE A01;
    public final Fragment A02;
    public final UserSession A03;
    public final InterfaceC60442pS A04;
    public final EnumC39622HeW A05;
    public final AnonymousClass387 A06;
    public final C64952wt A07;
    public final InterfaceC43415JGf A08;
    public final InterfaceC43420JGk A09;
    public final C41633IbO A0A;
    public final Long A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;
    public final String A0G;
    public final String A0H;
    public final String A0I;
    public final InterfaceC09390do A0J;
    public final C57112jm A0K;
    public final C5GU A0L;
    public final IMI A0M;
    public final C64972wv A0N;
    public final Long A0O;
    public final String A0P;
    public final String A0Q;
    public final String A0R;
    public final String A0S;
    public final boolean A0T;
    public final boolean A0U;

    /* JADX WARN: Code restructure failed: missing block: B:52:0x015c, code lost:
    
        if (r12 == 27) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00fd, code lost:
    
        if (r20 != null) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A02(X.C38675GzG r20, com.instagram.model.shopping.productfeed.ProductFeedItem r21, java.lang.Long r22, java.lang.String r23, java.lang.String r24, int r25, int r26) {
        /*
            Method dump skipped, instructions count: 496
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41646Ibe.A02(X.GzG, com.instagram.model.shopping.productfeed.ProductFeedItem, java.lang.Long, java.lang.String, java.lang.String, int, int):void");
    }

    public final void A04(ProductFeedItem productFeedItem) {
        C14360o3.A0B(productFeedItem, 0);
        UnavailableProductImpl unavailableProductImpl = productFeedItem.A05;
        if (unavailableProductImpl != null) {
            FB6.A00();
            String str = unavailableProductImpl.A01;
            String A0e = AbstractC37302Gc3.A0e(unavailableProductImpl.A00);
            C14360o3.A0A(A0e);
            UserSession userSession = this.A03;
            InterfaceC60442pS interfaceC60442pS = this.A04;
            String str2 = this.A0E;
            this.A02.requireContext();
            AbstractC167007dF.A1K(str, A0e);
            SaveApiUtil.A08(userSession, interfaceC60442pS, str, A0e, str2);
            InterfaceC43420JGk interfaceC43420JGk = this.A09;
            if (interfaceC43420JGk != null) {
                interfaceC43420JGk.DbU(productFeedItem);
                return;
            }
            return;
        }
        throw AbstractC166987dD.A14(" productFeedItem unavailableProduct must not be null ");
    }

    public final void A05(Product product) {
        C14360o3.A0B(product, 0);
        this.A07.A03(product, "webclick");
        AbstractC41776Ies.A0B(this.A02.requireActivity(), this.A03, product, null, this.A0I, this.A04.getModuleName());
    }

    public final void A06(Product product, int i, int i2) {
        C14360o3.A0B(product, 0);
        EnumC39622HeW enumC39622HeW = this.A05;
        if (enumC39622HeW == EnumC39622HeW.A0O || enumC39622HeW == EnumC39622HeW.A0R) {
            C1XJ.A00.A0B(this.A03).A00(this.A02.getContext(), new C42902IyG(this, i, i2), product);
        }
    }

    public final void A07(Product product, String str) {
        String str2;
        C14360o3.A0B(product, 0);
        this.A07.A03(product, "add_to_bag");
        List list = product.A0O;
        if (list != null && !list.isEmpty()) {
            this.A0J.getValue();
            HashMap A1G = AbstractC166987dD.A1G();
            if (list.isEmpty()) {
                throw AbstractC31172DnG.A0u();
            }
            if (list.isEmpty()) {
                throw AbstractC31172DnG.A0u();
            }
            list.size();
            A1G.size();
        }
        InterfaceC60442pS interfaceC60442pS = this.A04;
        UserSession userSession = this.A03;
        String str3 = this.A0E;
        User user = product.A0B;
        String str4 = null;
        if (user != null) {
            str2 = AbstractC76433bn.A00(user);
        } else {
            str2 = null;
        }
        AbstractC41757IeY.A06(interfaceC60442pS, userSession, null, null, product, str, str3, "product_tile", str2, null, this.A0I, null);
        C1563470e A0G = AbstractC37300Gc1.A0G(userSession);
        if (user != null) {
            str4 = AbstractC76433bn.A00(user);
        }
        C14360o3.A0A(str4);
        A0G.A0D(new C42851IxR(this, product, str), product, str4, this.A0C);
    }

    public final boolean A09(ProductFeedItem productFeedItem) {
        Product product;
        C14360o3.A0B(productFeedItem, 0);
        Fragment fragment = this.A02;
        Context requireContext = fragment.requireContext();
        UserSession userSession = this.A03;
        C50674MYs c50674MYs = new C50674MYs(requireContext, userSession);
        ProductTile productTile = productFeedItem.A02;
        if (productTile == null) {
            return false;
        }
        c50674MYs.A01(ViewOnClickListenerC38053Gog.A02(productFeedItem, this, 10), 2131972388);
        if (!this.A0T) {
            c50674MYs.A01(new ViewOnClickListenerC42029Ijy(31, productFeedItem, productTile, this), 2131968678);
        }
        if (C2TN.A00(userSession) && productTile.A05 != null) {
            ViewOnClickListenerC38053Gog.A04(c50674MYs, productTile, this, 11, 2131975564);
        }
        if (C2TN.A00(userSession) && (product = productTile.A07) != null && product.A0D != null) {
            ViewOnClickListenerC38053Gog.A04(c50674MYs, productTile, this, 12, 2131969985);
        }
        new C31727DwY(c50674MYs).A07(fragment.requireContext());
        return true;
    }

    public static final void A00(C41646Ibe c41646Ibe, Product product, String str) {
        EnumC39650Hif enumC39650Hif;
        C1XJ c1xj = C1XJ.A00;
        FragmentActivity requireActivity = c41646Ibe.A02.requireActivity();
        String A0d = AbstractC37302Gc3.A0d(product);
        C14360o3.A0A(A0d);
        UserSession userSession = c41646Ibe.A03;
        String str2 = c41646Ibe.A0I;
        String moduleName = c41646Ibe.A04.getModuleName();
        String str3 = product.A0H;
        EnumC39651Hig enumC39651Hig = EnumC39651Hig.A0J;
        EnumC39644HiZ enumC39644HiZ = EnumC39644HiZ.SHOP_HOME;
        if (str.equals("view_in_cart_cta")) {
            enumC39650Hif = EnumC39650Hif.A08;
        } else {
            enumC39650Hif = EnumC39650Hif.A0H;
        }
        c1xj.A0m(requireActivity, enumC39651Hig, enumC39644HiZ, enumC39650Hif, EnumC39649Hie.A03, userSession, null, A0d, str2, moduleName, str, null, null, null, null, null, str3, null, null, null, null, false);
    }

    public final void A03(C38675GzG c38675GzG, ProductTile productTile, int i, int i2, boolean z) {
        String str;
        C41625IbF A01 = this.A0N.A01(this.A00, productTile);
        if (c38675GzG != null) {
            str = c38675GzG.A04;
        } else {
            str = null;
        }
        A01.A08 = str;
        A01.A07 = AbstractC154266wb.A01(i, i2);
        String str2 = this.A0S;
        C5GU c5gu = this.A0L;
        Long l = this.A0O;
        if (str2 != null || c5gu != null || l != null) {
            A01.A02 = new C51757Mtg(c5gu, l, str2, 25);
        }
        A01.A09 = z;
        A01.A00 = AbstractC25232BEp.A0t(this.A0B);
        A01.A03 = c38675GzG;
        A01.A00();
    }

    public final void A08(String str, String str2, int i, int i2) {
        IMI imi = this.A0M;
        if (str != null) {
            String str3 = this.A0Q;
            imi.A00(null, str, str3, null, i, i2);
            C1XJ.A00.A16(this.A02.requireActivity(), this.A03, false, null, this.A04.getModuleName(), null, this.A0I, str3, this.A0R, str2, this.A0D, null, null, false, false, false);
            return;
        }
        throw AbstractC166987dD.A14("submodule must not be null");
    }

    public final void A01(View view, C38675GzG c38675GzG, ProductFeedItem productFeedItem, String str, int i, int i2) {
        String str2;
        AbstractC167017dG.A1N(productFeedItem, view);
        C41633IbO c41633IbO = this.A0A;
        if (c41633IbO != null) {
            if (c38675GzG != null) {
                str2 = c38675GzG.A04;
            } else {
                str2 = null;
            }
            c41633IbO.A00.A05(view, C41633IbO.A00(new C41024IEt(i, i2), new H7J(productFeedItem, new C38670GzB(null, null, str2, null, null)), c41633IbO, str));
        }
    }

    public C41646Ibe(Fragment fragment, UserSession userSession, C57112jm c57112jm, C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, C5GU c5gu, EnumC39622HeW enumC39622HeW, C64952wt c64952wt, C64972wv c64972wv, InterfaceC43415JGf interfaceC43415JGf, InterfaceC43420JGk interfaceC43420JGk, C41633IbO c41633IbO, Long l, Long l2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, boolean z, boolean z2) {
        C14360o3.A0B(c64972wv, 11);
        this.A02 = fragment;
        this.A03 = userSession;
        this.A04 = interfaceC60442pS;
        this.A0I = str;
        this.A0E = str2;
        this.A0F = str3;
        this.A0S = str4;
        this.A0L = c5gu;
        this.A0O = l;
        this.A05 = enumC39622HeW;
        this.A0N = c64972wv;
        this.A09 = interfaceC43420JGk;
        this.A08 = interfaceC43415JGf;
        this.A0U = z;
        this.A0Q = str5;
        this.A0R = str6;
        this.A00 = c38321qM;
        this.A0D = str7;
        this.A07 = c64952wt;
        this.A0A = c41633IbO;
        this.A0H = str8;
        this.A0G = str9;
        this.A0T = z2;
        this.A0B = l2;
        this.A0K = c57112jm;
        this.A0C = str10;
        this.A0P = str11;
        this.A0M = new IMI(userSession, interfaceC60442pS, str, str2, str3, str7);
        this.A0J = J8X.A00(this, 24);
        this.A06 = new AnonymousClass387(fragment, userSession, interfaceC60442pS, null, null, null, null, null, null, true);
    }
}
