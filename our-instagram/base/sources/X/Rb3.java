package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;

/* loaded from: classes10.dex */
public final class Rb3 extends AbstractC59962oe implements InterfaceC60442pS, InterfaceC60122ou {
    public static final String __redex_internal_original_name = "AdHideReasonsFragment";
    public int A00;
    public String A01;
    public String A02;
    public String A03;
    public boolean A04;
    public WebView A05;
    public String A06;
    public final InterfaceC09390do A07 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        AbstractC25229BEm.A1G(interfaceC56362iU, 2131972369);
        interfaceC56362iU.Ehg(new C35026Fbz(C05F.A00).A01());
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return AbstractC111324zv.A00(3842);
    }

    @Override // X.InterfaceC60442pS
    public final boolean isOrganicEligible() {
        return false;
    }

    @Override // X.InterfaceC60442pS
    public final boolean isSponsoredEligible() {
        return true;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        WebSettings settings;
        String str;
        WebSettings settings2;
        WebSettings settings3;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        WebView webView = this.A05;
        if (webView != null && (settings3 = webView.getSettings()) != null) {
            settings3.setJavaScriptEnabled(true);
        }
        WebView webView2 = this.A05;
        if (webView2 != null && (settings = webView2.getSettings()) != null) {
            WebView webView3 = this.A05;
            if (webView3 == null || (settings2 = webView3.getSettings()) == null || (str = settings2.getUserAgentString()) == null) {
                str = "";
            }
            settings.setUserAgentString(C1FO.A01(str));
        }
        Context requireContext = requireContext();
        String str2 = "/ads/flag/ad";
        if (!this.A04) {
            str2 = AbstractC13670mt.A06("%s?ad_id=%s", "/ads/flag/ad", this.A06);
        }
        String A02 = AbstractC63260SgI.A02(requireContext, C1HO.A03(str2));
        C14360o3.A07(A02);
        Context context = getContext();
        if (context != null) {
            A02 = AbstractC63260SgI.A02(context, A02);
        }
        WebView webView4 = this.A05;
        if (webView4 != null) {
            webView4.loadUrl(A02);
        }
        WebView webView5 = this.A05;
        if (webView5 != null) {
            webView5.setWebViewClient(new Q4s(this, 4));
        }
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A07);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        AbstractC12990ll A0o;
        int A02 = C0f9.A02(-925064809);
        Bundle requireArguments = requireArguments();
        this.A01 = requireArguments.getString("AdHideReasonsFragment.FEED_ITEM_ID");
        this.A00 = requireArguments.getInt("AdHideReasonsFragment.MEDIA_AD_CAROUSEL_INDEX");
        this.A04 = requireArguments.getBoolean("AdHideReasonsFragment.IS_SURVEY", false);
        this.A03 = requireArguments.getString("AdHideReasonsFragment.TOKEN");
        this.A02 = requireArguments.getString("AdHideReasonsFragment.SOURCE");
        this.A06 = requireArguments.getString("AdHideReasonsFragment.AD_ID");
        if (getContext() != null && (A0o = AbstractC166987dD.A0o(this.A07)) != null) {
            C62817SSp.A00(A0o, null);
        }
        super.onCreate(bundle);
        C0f9.A09(1998526837, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-412484804);
        WebView webView = this.A05;
        if (webView != null) {
            webView.destroy();
        }
        com.facebook.secure.webkit.WebView webView2 = new com.facebook.secure.webkit.WebView(requireActivity());
        this.A05 = webView2;
        C0f9.A09(180160496, A02);
        return webView2;
    }
}
