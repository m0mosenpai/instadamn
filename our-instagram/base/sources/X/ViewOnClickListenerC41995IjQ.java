package X;

import android.app.Activity;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.model.shopping.productfeed.ProductCollectionFooter;
import com.instagram.model.shopping.productfeed.ProductCollectionFooterLink;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.IjQ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class ViewOnClickListenerC41995IjQ implements View.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final String A05;

    public ViewOnClickListenerC41995IjQ(Object obj, Object obj2, Object obj3, Object obj4, String str, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A04 = obj3;
        this.A02 = obj2;
        this.A05 = str;
        this.A03 = obj4;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05;
        int i;
        String str;
        ProductCollectionFooterLink productCollectionFooterLink;
        String str2;
        String str3;
        Long l;
        switch (this.A00) {
            case 0:
                A05 = C0f9.A05(-1694272176);
                C47983LJh c47983LJh = (C47983LJh) this.A02;
                User user = (User) this.A03;
                String id = user.getId();
                String str4 = this.A05;
                C14360o3.A0B(str4, 1);
                c47983LJh.A01.A01(C47983LJh.A00(c47983LJh, null, null, C05F.A0N, C05F.A03, null, str4, id, null), c47983LJh.A00.A03);
                C45525KDq c45525KDq = (C45525KDq) this.A04;
                Activity activity = (Activity) this.A01;
                FCD.A00(activity, activity, c45525KDq, c45525KDq, AbstractC166987dD.A0r(c45525KDq.A08), new GIT(activity, 0), user);
                i = -1454836701;
                C0f9.A0C(i, A05);
                return;
            case 1:
                A05 = C0f9.A05(770863999);
                Activity activity2 = (Activity) this.A01;
                UserSession userSession = (UserSession) this.A04;
                InterfaceC11380iw interfaceC11380iw = (InterfaceC11380iw) this.A02;
                String str5 = this.A05;
                InterfaceC16660sJ interfaceC16660sJ = (InterfaceC16660sJ) this.A03;
                WEz A01 = AbstractC69993VzD.A01(activity2, interfaceC11380iw, userSession, EnumC65855TvH.A0A, VG2.A0d, str5);
                A01.A03 = new J2E(userSession, str5, interfaceC16660sJ);
                WEz.A00(null, A01);
                i = -279180885;
                C0f9.A0C(i, A05);
                return;
            case 2:
                A05 = C0f9.A05(1745880413);
                ViewOnKeyListenerC67976V4r viewOnKeyListenerC67976V4r = (ViewOnKeyListenerC67976V4r) this.A02;
                V2M v2m = (V2M) this.A03;
                List list = v2m.A02;
                Product product = (Product) this.A04;
                String str6 = this.A05;
                String id2 = v2m.getId();
                if (C14360o3.A0K(str6, id2)) {
                    id2 = null;
                }
                String A0W = AbstractC37300Gc1.A0W(this.A01);
                C14360o3.A0B(A0W, 4);
                FragmentActivity requireActivity = viewOnKeyListenerC67976V4r.A0I.requireActivity();
                UserSession userSession2 = viewOnKeyListenerC67976V4r.A0O;
                C38321qM c38321qM = viewOnKeyListenerC67976V4r.A0Q;
                C1NI c1ni = viewOnKeyListenerC67976V4r.A08;
                if (c1ni == null) {
                    str = "impressionItem";
                } else {
                    Wk6 wk6 = viewOnKeyListenerC67976V4r.A04;
                    if (wk6 == null) {
                        str = "insightProcessor";
                    } else {
                        AbstractC40544HyQ.A00(requireActivity, userSession2, wk6, c1ni, c38321qM, viewOnKeyListenerC67976V4r, product, A0W, str6, id2, null, list, viewOnKeyListenerC67976V4r.A0S);
                        i = -287168623;
                        C0f9.A0C(i, A05);
                        return;
                    }
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 3:
                A05 = C0f9.A05(-901460579);
                ProductCollectionFooter productCollectionFooter = (ProductCollectionFooter) this.A02;
                FragmentActivity fragmentActivity = (FragmentActivity) this.A01;
                String str7 = this.A05;
                C38321qM c38321qM2 = (C38321qM) this.A03;
                UserSession userSession3 = (UserSession) this.A04;
                ArrayList arrayList = productCollectionFooter.A01;
                if (!arrayList.isEmpty() && (productCollectionFooterLink = (ProductCollectionFooterLink) arrayList.get(0)) != null) {
                    EnumC906041v enumC906041v = EnumC906041v.AD_DESTINATION_WEB;
                    EnumC906041v enumC906041v2 = productCollectionFooterLink.A00;
                    if (enumC906041v == enumC906041v2) {
                        str2 = productCollectionFooterLink.A02;
                        str3 = "webclick";
                    } else if (EnumC906041v.AD_DESTINATION_DEEPLINK == enumC906041v2) {
                        str2 = productCollectionFooterLink.A01;
                        str3 = "deeplink";
                    } else {
                        throw AbstractC166987dD.A14(AbstractC167017dG.A0n(productCollectionFooterLink, "Unexpected value for footerLink: ", AbstractC166987dD.A1C()));
                    }
                    String id3 = c38321qM2.getId();
                    String A0I = AbstractC41071vF.A0I(userSession3, id3);
                    C42583It1 c42583It1 = new C42583It1(str7);
                    User A2E = c38321qM2.A2E(userSession3);
                    A2E.getClass();
                    C18920wW A012 = AbstractC12220kQ.A01(c42583It1, userSession3);
                    String A07 = AbstractC41071vF.A07(userSession3, c38321qM2);
                    InterfaceC02590Ai A0f = AbstractC166987dD.A0f(A012, "instagram_ad_shop_collection_action");
                    AbstractC31171DnF.A1C(A0f, str3);
                    A0f.AAP("from", "shopping_sheet_action");
                    AbstractC37300Gc1.A0o(A0f, A0I);
                    A0f.AAP("url", str2);
                    if (A07 != null) {
                        l = Long.valueOf(A07);
                    } else {
                        l = null;
                    }
                    AbstractC37300Gc1.A0g(A0f, l);
                    A0f.AAP("follow_status", A2E.B7L().toString());
                    A0f.AAP("author_id", A2E.getId());
                    A0f.AAP("media_id", c38321qM2.getId());
                    A0f.AAP("source_of_action", "instagram_shopping_product_collection");
                    A0f.Cht();
                    AbstractC41776Ies.A07(fragmentActivity, userSession3, productCollectionFooterLink.A00, null, str2, id3, str7, null, null, Collections.emptyList());
                }
                i = -706450258;
                C0f9.A0C(i, A05);
                return;
            case 4:
                A05 = C0f9.A05(-380913669);
                C1XJ.A00.A1C((FragmentActivity) this.A01, (UserSession) this.A04, this.A05, AbstractC37300Gc1.A0W(this.A02), "tags", null, AbstractC25231BEo.A0s((C38321qM) this.A03), null);
                i = -2091580364;
                C0f9.A0C(i, A05);
                return;
            default:
                A05 = C0f9.A05(1220448089);
                C1XJ.A00.A1C((FragmentActivity) this.A01, (UserSession) this.A04, this.A05, AbstractC37300Gc1.A0W(this.A02), "tags", null, AbstractC25231BEo.A0s((C38321qM) this.A03), null);
                i = 1013012044;
                C0f9.A0C(i, A05);
                return;
        }
    }
}
