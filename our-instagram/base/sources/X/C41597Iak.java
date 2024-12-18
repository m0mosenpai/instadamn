package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.RankingInfo;
import com.instagram.api.schemas.ShopManagementAccessState;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;
import com.instagram.model.shopping.productfeed.ProductTile;
import com.instagram.shopping.fragment.pdp.AdsProductPageFragment;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.Iak, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41597Iak {
    public final RankingInfo A00;
    public final AbstractC59962oe A01;
    public final UserSession A02;
    public final Product A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final List A08;
    public final ID2 A09;

    public C41597Iak(RankingInfo rankingInfo, AbstractC59962oe abstractC59962oe, UserSession userSession, ID2 id2, Product product, String str, String str2, String str3, String str4) {
        List A0S;
        User user;
        this.A01 = abstractC59962oe;
        this.A02 = userSession;
        this.A03 = product;
        this.A04 = str;
        this.A07 = str2;
        this.A05 = str3;
        this.A09 = id2;
        this.A00 = rankingInfo;
        this.A06 = str4;
        ArrayList A1E = AbstractC166987dD.A1E();
        this.A08 = A1E;
        String str5 = null;
        if (product != null && (user = product.A0B) != null) {
            str5 = AbstractC76433bn.A00(user);
        }
        C08730cb c08730cb = C17060sy.A01;
        User A01 = c08730cb.A01(userSession);
        Boolean AkY = A01.A03.AkY();
        if (AkY != null && AkY.booleanValue() && C14360o3.A0K(userSession.userId, str5)) {
            ShopManagementAccessState Bue = A01.A03.Bue();
            if ((Bue == null ? ShopManagementAccessState.A07 : Bue) != ShopManagementAccessState.A06 && product != null && product.A02()) {
                A1E.add(EnumC39582Hds.A03);
            }
            ShopManagementAccessState Bue2 = A01.A03.Bue();
            if ((Bue2 == null ? ShopManagementAccessState.A07 : Bue2) != ShopManagementAccessState.A07 && (A0S = c08730cb.A01(this.A02).A0S()) != null && A0S.contains(EnumC33406Epd.A06) && product != null && AbstractC166997dE.A1Z(product.A01.A0M, true)) {
                A1E.add(EnumC39582Hds.A05);
                A1E.add(EnumC39582Hds.A06);
            }
        }
        if (!C14360o3.A0K(userSession.userId, str5)) {
            A1E.add(EnumC39582Hds.A09);
            if (product != null) {
                if ("instagram_shopping_home".equals(str3)) {
                    A1E.add(EnumC39582Hds.A08);
                }
            } else {
                return;
            }
        } else if (product == null) {
            return;
        }
        if (C2TN.A00(userSession)) {
            A1E.add(EnumC39582Hds.A04);
            A1E.add(EnumC39582Hds.A0A);
            A1E.add(EnumC39582Hds.A07);
        }
    }

    public static final void A00(EnumC39582Hds enumC39582Hds, C41597Iak c41597Iak) {
        C1XJ c1xj;
        FragmentActivity requireActivity;
        UserSession userSession;
        String A0n;
        String obj;
        String str;
        String str2;
        boolean z;
        boolean z2;
        String str3;
        switch (enumC39582Hds.ordinal()) {
            case 0:
            case 1:
                Product product = c41597Iak.A03;
                if (product != null) {
                    AbstractC59962oe abstractC59962oe = c41597Iak.A01;
                    abstractC59962oe.requireActivity();
                    C9GR.A07(abstractC59962oe.getActivity(), 2131970003);
                    UserSession userSession2 = c41597Iak.A02;
                    AbstractC25651Mw.A00(userSession2).E4s(new C42247InX(product));
                    ProductTile productTile = new ProductTile(product);
                    productTile.A04 = c41597Iak.A00;
                    I6M.A00(AbstractC12220kQ.A01(abstractC59962oe, userSession2), productTile, c41597Iak.A07, c41597Iak.A05);
                    return;
                }
                throw AbstractC166997dE.A0g();
            case 2:
                Product product2 = c41597Iak.A03;
                if (product2 != null) {
                    C140966Yy A0r = AbstractC25225BEi.A0r(c41597Iak.A01.requireActivity(), c41597Iak.A02);
                    Bundle A0b = AbstractC166987dD.A0b();
                    A0b.putParcelable("product", product2);
                    HC3 hc3 = new HC3();
                    hc3.setArguments(A0b);
                    A0r.A0D(hc3);
                    A0r.A04();
                    return;
                }
                throw AbstractC166987dD.A14("Required value was null.");
            case 3:
                Product product3 = c41597Iak.A03;
                if (product3 != null) {
                    HashMap A1G = AbstractC166987dD.A1G();
                    A1G.put("product_id", product3.A0H);
                    A1G.put("merchant_id", AbstractC37302Gc3.A0d(product3));
                    A1G.put("rating_and_review_type", "product");
                    AbstractC59962oe abstractC59962oe2 = c41597Iak.A01;
                    String A0v = AbstractC25227BEk.A0v(abstractC59962oe2, 2131952355);
                    C66277U6x A01 = C66277U6x.A01(AbstractC111324zv.A00(2092), A1G);
                    FragmentActivity requireActivity2 = abstractC59962oe2.requireActivity();
                    IgBloksScreenConfig A0C = AbstractC31171DnF.A0C(c41597Iak.A02);
                    A0C.A0U = A0v;
                    A01.A04(requireActivity2, A0C);
                    return;
                }
                throw AbstractC166997dE.A0g();
            case 4:
                return;
            case 5:
                ID2 id2 = c41597Iak.A09;
                c1xj = C1XJ.A00;
                AdsProductPageFragment adsProductPageFragment = id2.A00;
                requireActivity = adsProductPageFragment.requireActivity();
                userSession = adsProductPageFragment.A01;
                A0n = AbstractC166997dE.A0n();
                obj = EnumC33406Epd.A06.toString();
                str = adsProductPageFragment.A0W;
                str2 = null;
                z = false;
                z2 = false;
                break;
            case 6:
                ID2 id22 = c41597Iak.A09;
                c1xj = C1XJ.A00;
                AdsProductPageFragment adsProductPageFragment2 = id22.A00;
                requireActivity = adsProductPageFragment2.requireActivity();
                userSession = adsProductPageFragment2.A01;
                A0n = AbstractC166997dE.A0n();
                obj = EnumC33406Epd.A06.toString();
                str = adsProductPageFragment2.A0W;
                str2 = null;
                z = false;
                z2 = true;
                break;
            case 7:
                Product product4 = c41597Iak.A03;
                if (product4 != null) {
                    AbstractC59962oe abstractC59962oe3 = c41597Iak.A01;
                    FragmentActivity activity = abstractC59962oe3.getActivity();
                    if (activity != null) {
                        UserSession userSession3 = c41597Iak.A02;
                        String str4 = c41597Iak.A07;
                        User user = product4.A0B;
                        if (user == null || (str3 = AbstractC37300Gc1.A0U(user)) == null) {
                            str3 = "";
                        }
                        AbstractC41356ISb.A00(activity, abstractC59962oe3, userSession3, str4, str3);
                        return;
                    }
                    return;
                }
                throw AbstractC166997dE.A0g();
            default:
                throw B4Z.A00();
        }
        c1xj.A1D(requireActivity, userSession, A0n, obj, str2, str, z, z2, z);
    }
}
