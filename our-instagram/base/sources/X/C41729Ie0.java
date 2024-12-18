package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.RankingInfo;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;
import com.instagram.model.shopping.ProductArEffectMetadata;
import com.instagram.profile.intf.UserDetailLaunchConfig;
import com.instagram.shopping.model.analytics.ProductDetailsPageLoggingInfo;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;
import java.util.BitSet;
import java.util.List;
import java.util.Map;

/* renamed from: X.Ie0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41729Ie0 {
    public IgBloksScreenConfig A00;
    public C38321qM A01;
    public IJF A02;
    public Product A03;
    public final long A04;
    public final FragmentActivity A05;
    public final RankingInfo A06;
    public final AbstractC59962oe A07;
    public final UserSession A08;
    public final InterfaceC60442pS A09;
    public final ID2 A0A;
    public final JI6 A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;
    public final String A0G;
    public final String A0H;
    public final String A0I;
    public final String A0J;

    public C41729Ie0(RankingInfo rankingInfo, AbstractC59962oe abstractC59962oe, UserSession userSession, InterfaceC60442pS interfaceC60442pS, ID2 id2, JI6 ji6, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        AbstractC25234BEr.A0k(2, userSession, id2, str, str2);
        C14360o3.A0B(str5, 11);
        this.A07 = abstractC59962oe;
        this.A08 = userSession;
        this.A09 = interfaceC60442pS;
        this.A0B = ji6;
        this.A0A = id2;
        this.A0J = str;
        this.A0C = str2;
        this.A0E = str3;
        this.A0G = str4;
        this.A06 = rankingInfo;
        this.A0H = str5;
        this.A0D = str6;
        this.A0I = str7;
        this.A0F = str8;
        FragmentActivity activity = abstractC59962oe.getActivity();
        if (activity != null) {
            this.A05 = activity;
            this.A04 = 600L;
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    public final void A03(C22P c22p, ProductArEffectMetadata productArEffectMetadata, Product product) {
        C14360o3.A0B(product, 1);
        FragmentActivity fragmentActivity = this.A05;
        if (!C6PX.A00(fragmentActivity)) {
            C9GR.A07(fragmentActivity, 2131953164);
            return;
        }
        C1XJ c1xj = C1XJ.A00;
        AbstractC59962oe abstractC59962oe = this.A07;
        FragmentActivity requireActivity = abstractC59962oe.requireActivity();
        UserSession userSession = this.A08;
        String str = this.A0J;
        C41623IbD A08 = c1xj.A08(requireActivity, c22p, userSession, productArEffectMetadata, product, str, this.A09.getModuleName());
        A08.A00 = abstractC59962oe;
        A08.A03 = str;
        A08.A01 = this.A0C;
        A08.A02 = AbstractC25231BEo.A0s(this.A01);
        A08.A01();
    }

    public final void A05(User user, List list, boolean z) {
        C14360o3.A0B(list, 0);
        C1XJ.A00.A15(this.A05, this.A08, user, this.A09.getModuleName(), this.A0G, this.A0E, this.A0J, list, z);
    }

    public static final ProductDetailsPageLoggingInfo A00(C41729Ie0 c41729Ie0) {
        JI6 ji6 = c41729Ie0.A0B;
        Product product = ji6.C02().A08;
        if (product != null) {
            Product A00 = C41726Idx.A00(ji6);
            if (A00 != null) {
                return new ProductDetailsPageLoggingInfo(product, A00);
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }

    public static final void A01(C41729Ie0 c41729Ie0, String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z) {
        UserSession userSession = c41729Ie0.A08;
        IgBloksScreenConfig A0C = AbstractC31171DnF.A0C(userSession);
        A0C.A0R = AbstractC111324zv.A00(363);
        c41729Ie0.A00 = A0C;
        IJF ijf = new IJF(c41729Ie0.A07.requireContext());
        Map map = ijf.A04;
        map.put("merchant_name", str);
        BitSet bitSet = ijf.A02;
        bitSet.set(0);
        map.put(AbstractC111324zv.A00(5100), str2);
        bitSet.set(1);
        map.put("shopping_session_id", str3);
        map.put("checkout_session_id", str4);
        map.put("is_checkout_enabled", Boolean.valueOf(z));
        map.put("layout", str5);
        C14360o3.A0B(str6, 0);
        map.put("prior_module", str6);
        map.put("prior_submodule", str7);
        C06090Tz c06090Tz = C06090Tz.A06;
        map.put("is_lightbox_preloading_enabled", AbstractC166997dE.A0c(c06090Tz, userSession, 36313235523766106L));
        map.put("is_shimmer_enabled", AbstractC166997dE.A0c(c06090Tz, userSession, 36313235523700569L));
        c41729Ie0.A02 = ijf;
    }

    public static final boolean A02(C41729Ie0 c41729Ie0) {
        C3DN A00 = C3DN.A00.A00(c41729Ie0.A07.requireActivity());
        if (A00 != null && ((C3DP) A00).A0h) {
            return true;
        }
        return false;
    }

    public final void A04(Product product) {
        AbstractC41776Ies.A0B(this.A05, this.A08, product, AbstractC25231BEo.A0s(this.A01), this.A0J, this.A09.getModuleName());
    }

    public final void A06(String str, String str2, String str3) {
        Product product = this.A03;
        if (product != null) {
            UserSession userSession = this.A08;
            InterfaceC60442pS interfaceC60442pS = this.A09;
            String str4 = product.A0H;
            if (str4 == null) {
                str4 = "";
            }
            C32U.A0K(userSession, new C42544IsN(str3, this, 0), C65.BRAND, new C42552IsV(str4), interfaceC60442pS, null, null, PublicKeyCredentialControllerUtility.JSON_KEY_NAME, false);
            C28431Ze A02 = AbstractC31364DqT.A02();
            C31368DqX A0J = AbstractC37304Gc5.A0J(interfaceC60442pS, userSession, str, str2);
            A0J.A0L = this.A0J;
            UserDetailLaunchConfig A03 = A0J.A03();
            if (A02(this)) {
                AbstractC25228BEl.A1G(this.A05, A02.A01(userSession, A03), userSession, ModalActivity.class, "profile");
                return;
            } else {
                C140966Yy A0P = AbstractC31173DnH.A0P(this.A05, userSession);
                A0P.A0B(null, A02.A02(userSession, A03));
                A0P.A04();
                return;
            }
        }
        throw AbstractC166997dE.A0g();
    }
}
