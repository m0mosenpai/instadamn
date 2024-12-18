package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout;
import com.instagram.shopping.fragment.destination.productcollection.ProductCollectionFragment;
import com.instagram.shopping.intf.ProductDetailsPageArguments;
import java.security.InvalidParameterException;
import java.util.HashMap;

/* loaded from: classes7.dex */
public final class HCJ extends AbstractC59962oe implements InterfaceC60442pS, C2d4 {
    public static final String __redex_internal_original_name = "ReelSwipeUpFragment";
    public Bundle A00;
    public View A01;
    public Fragment A02;
    public C56352iT A03;
    public UserSession A04;
    public TouchInterceptorFrameLayout A05;
    public TouchInterceptorFrameLayout A06;
    public String A07;
    public int A08;
    public C41140IJf A09;
    public String A0A;
    public String A0B;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "reel_swipe_up";
    }

    @Override // X.InterfaceC60442pS
    public final boolean isOrganicEligible() {
        return true;
    }

    @Override // X.InterfaceC60442pS
    public final boolean isSponsoredEligible() {
        return true;
    }

    @Override // X.C2d4
    public final C56352iT AYT() {
        return this.A03;
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return this.A04;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String str;
        int A02 = C0f9.A02(84497824);
        super.onCreate(bundle);
        this.A00 = requireArguments();
        this.A04 = AbstractC31176DnK.A0S(this);
        this.A07 = AbstractC31173DnH.A0j(this.A00, "content_fragment_type");
        this.A0A = this.A00.getString("cta_action_source");
        this.A08 = this.A00.getInt("carousel_ad_index", -1);
        ProductDetailsPageArguments productDetailsPageArguments = (ProductDetailsPageArguments) this.A00.getParcelable("pdp_arguments");
        if (productDetailsPageArguments != null) {
            this.A0B = productDetailsPageArguments.A0M;
        }
        String str2 = this.A07;
        switch (str2.hashCode()) {
            case -1744365060:
                str = "product_collection_bloks";
                break;
            case -1610081298:
                str = "product_collection";
                break;
            case -1310090308:
                str = "product_details_page";
                break;
        }
        if (str2.equals(str)) {
            this.A00.putString("shopping_session_id", AbstractC61112qZ.A00(this.A00));
        }
        C0f9.A09(584136420, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1566495439);
        View A0A = AbstractC31172DnG.A0A(layoutInflater, viewGroup, R.layout.reel_swipe_up_fragment);
        C0f9.A09(-1258861213, A02);
        return A0A;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0077  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onPause() {
        /*
            Method dump skipped, instructions count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.HCJ.onPause():void");
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(1291946640);
        super.onResume();
        View view = this.mView;
        view.getClass();
        view.getRootView().setBackgroundColor(0);
        C0f9.A09(2139039054, A02);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        Fragment A0C;
        super.onViewCreated(view, bundle);
        this.A06 = (TouchInterceptorFrameLayout) view.requireViewById(R.id.swipe_up_root_container);
        this.A05 = (TouchInterceptorFrameLayout) view.requireViewById(R.id.action_bar_container);
        this.A01 = view.requireViewById(R.id.swipe_up_fragment_container);
        C38321qM A02 = C1DW.A00(this.A04).A02(this.A0B);
        if (C2Fb.A3e.toString().equals(this.A0A) && A02 != null) {
            C71313Hs A00 = C71313Hs.A00(this.A04);
            View view2 = this.mView;
            view2.getClass();
            A00.A06(view2, EnumC71343Hv.A0a, this.A08);
            View view3 = this.mView;
            view3.getClass();
            A00.A0A(view3, new C79623hD(new C139726Ub(requireContext(), this.A04, A02), this.A04, A02, this));
        }
        if (this.A02 == null) {
            requireActivity();
            UserSession userSession = this.A04;
            String str2 = this.A07;
            Bundle bundle2 = this.A00;
            switch (str2.hashCode()) {
                case -1744365060:
                    if (str2.equals("product_collection_bloks")) {
                        C1XJ.A00.A0T();
                        A0C = C41769Iel.A00(bundle2, null, userSession, 37355530, "com.bloks.www.minishops.collection.ig_encoded", "instagram_shopping_product_collection", null, R.layout.mini_shop_collection_loading_screen);
                        break;
                    }
                    throw new InvalidParameterException(AnonymousClass001.A0g("Unknown content fragment type ", str2, "."));
                case -1689823252:
                    if (str2.equals("mini_shop_bloks")) {
                        A0C = C1XJ.A00.A0T().A09(bundle2, userSession);
                        break;
                    }
                    throw new InvalidParameterException(AnonymousClass001.A0g("Unknown content fragment type ", str2, "."));
                case -1610081298:
                    if (str2.equals("product_collection")) {
                        C1XJ.A00.A0T();
                        A0C = new ProductCollectionFragment();
                        A0C.setArguments(bundle2);
                        break;
                    }
                    throw new InvalidParameterException(AnonymousClass001.A0g("Unknown content fragment type ", str2, "."));
                case -1310090308:
                    if (str2.equals("product_details_page")) {
                        A0C = C1XJ.A00.A0T().A0A(bundle2, userSession);
                        break;
                    }
                    throw new InvalidParameterException(AnonymousClass001.A0g("Unknown content fragment type ", str2, "."));
                case 1819173716:
                    if (str2.equals("product_collection_mini_shops_bloks")) {
                        C41769Iel A0T = C1XJ.A00.A0T();
                        String string = bundle2.getString("media_id");
                        String string2 = bundle2.getString("product_collection_title");
                        C38321qM A0h = AbstractC25229BEm.A0h(userSession, string);
                        A0h.getClass();
                        C38687GzS A002 = AbstractC41355ISa.A00(userSession, A0h);
                        String str3 = A002.A01;
                        A0C = A0T.A0C(userSession, str3, str3, string2, (HashMap) A002.A00);
                        break;
                    }
                    throw new InvalidParameterException(AnonymousClass001.A0g("Unknown content fragment type ", str2, "."));
                default:
                    throw new InvalidParameterException(AnonymousClass001.A0g("Unknown content fragment type ", str2, "."));
            }
            this.A02 = A0C;
            C14240no c14240no = new C14240no(getChildFragmentManager());
            Fragment fragment = this.A02;
            c14240no.A0D(fragment, fragment.getClass().getCanonicalName(), R.id.swipe_up_fragment_container);
            c14240no.A00();
            getChildFragmentManager().A0Z();
        }
        boolean z = this.A02 instanceof InterfaceC60122ou;
        TouchInterceptorFrameLayout touchInterceptorFrameLayout = this.A05;
        if (z) {
            C56352iT A01 = C56342iS.A01(new ViewOnClickListenerC42033Ik2(this, 1), touchInterceptorFrameLayout);
            this.A03 = A01;
            A01.A0X(new C70568Wd2(this, 3));
        } else {
            touchInterceptorFrameLayout.setVisibility(8);
            AbstractC13880nE.A0f(this.A01, 0);
        }
        Context requireContext = requireContext();
        TouchInterceptorFrameLayout touchInterceptorFrameLayout2 = this.A06;
        View view4 = this.mView;
        view4.getClass();
        AbstractC148046la.A00(touchInterceptorFrameLayout2, new GestureDetectorOnGestureListenerC148016lX(requireContext, new J18(view4.getRootView(), C55942hf.A04(50.0d, 8.0d), this, AbstractC13880nE.A06(requireContext) * 0.3f)));
        UserSession userSession2 = this.A04;
        Bundle bundle3 = this.A00;
        String str4 = this.A07;
        View view5 = this.mView;
        view5.getClass();
        C41140IJf c41140IJf = new C41140IJf(bundle3, view5, userSession2, this, str4);
        this.A09 = c41140IJf;
        String str5 = c41140IJf.A05;
        switch (str5.hashCode()) {
            case -1744365060:
                str = "product_collection_bloks";
                break;
            case -1610081298:
                str = "product_collection";
                break;
            case -1310090308:
                if (!str5.equals("product_details_page")) {
                    return;
                }
                c41140IJf.A00 = System.currentTimeMillis();
                C71313Hs.A00(c41140IJf.A03).A07(c41140IJf.A02, EnumC71343Hv.A0a, new String[0], 2);
                return;
            default:
                return;
        }
        if (!str5.equals(str)) {
            return;
        }
        c41140IJf.A00 = System.currentTimeMillis();
    }
}
