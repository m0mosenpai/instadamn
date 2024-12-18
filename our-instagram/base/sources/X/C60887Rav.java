package X;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.facebook.R;

/* renamed from: X.Rav, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60887Rav extends AbstractC59962oe implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "SponsoredAboutFragment";
    public final InterfaceC09390do A00 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        AbstractC25229BEm.A1G(interfaceC56362iU, 2131974339);
        interfaceC56362iU.Ehg(new C35026Fbz(C05F.A00).A01());
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "sponsored_about";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        WebView webView = (WebView) AbstractC166997dE.A0R(view, R.id.webView);
        webView.setScrollbarFadingEnabled(false);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setUserAgentString(AbstractC58320PtC.A0x(webView.getSettings()));
        Bundle requireArguments = requireArguments();
        String A02 = AbstractC63260SgI.A02(requireContext(), C1HO.A03(AbstractC13670mt.A06("/xwoiynko?tracking_token=%s&show_ad_choices=%d&locale=%s", requireArguments.getString("tracking_token"), Integer.valueOf(requireArguments.getBoolean("show_ad_choices") ? 1 : 0), C1Q2.A02())));
        C14360o3.A07(A02);
        if (getContext() != null) {
            C62817SSp.A00(AbstractC166987dD.A0o(this.A00), null);
        }
        webView.loadUrl(A02);
        webView.setWebViewClient(new WebViewClient());
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A00);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-237442045);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.fragment_sponsored_about, viewGroup, false);
        C0f9.A09(1940013879, A02);
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        InterfaceC53712dA interfaceC53712dA;
        int A02 = C0f9.A02(714403569);
        super.onPause();
        ComponentCallbacks2 rootActivity = getRootActivity();
        if ((rootActivity instanceof InterfaceC53712dA) && (interfaceC53712dA = (InterfaceC53712dA) rootActivity) != null) {
            interfaceC53712dA.EfL(0);
        }
        C0f9.A09(-1379059924, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        InterfaceC53712dA interfaceC53712dA;
        int A02 = C0f9.A02(-60719492);
        super.onResume();
        ComponentCallbacks2 rootActivity = getRootActivity();
        if ((rootActivity instanceof InterfaceC53712dA) && (interfaceC53712dA = (InterfaceC53712dA) rootActivity) != null) {
            interfaceC53712dA.EfL(8);
        }
        C0f9.A09(-649973083, A02);
    }
}
