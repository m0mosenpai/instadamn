package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ProgressBar;
import com.facebook.R;
import com.instagram.common.session.UserSession;

@Deprecated
/* renamed from: X.Raw, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60888Raw extends AbstractC59962oe implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "ReportWebViewFragment";
    public WebView A01;
    public ProgressBar A02;
    public UserSession A03;
    public Integer A04;
    public Integer A05;
    public String A06;
    public String A07;
    public String A09;
    public int A00 = 2131954754;
    public boolean A08 = true;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "report_web_view";
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        String str = this.A07;
        if (str != null) {
            interfaceC56362iU.setTitle(str);
        }
        interfaceC56362iU.EkS(this.A08);
        if (this.A04 == C05F.A00) {
            interfaceC56362iU.AAF(new ViewOnClickListenerC63507Soa(this, 16), this.A00);
        }
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return this.A03;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Integer num;
        Integer num2;
        int A02 = C0f9.A02(-1590224024);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A03 = (UserSession) AbstractC60492pY.A02(this).getValue();
        String A0j = AbstractC31173DnH.A0j(requireArguments, "extra_url");
        this.A09 = A0j;
        this.A06 = AbstractC08820cl.A03(A0j).getHost();
        String string = requireArguments.getString("extra_page");
        if (string != null && !string.equals("REPORT")) {
            if (string.equals("SUPPORT_INFO")) {
                num = C05F.A01;
            } else {
                throw AbstractC166987dD.A12(string);
            }
        } else {
            num = C05F.A00;
        }
        this.A04 = num;
        String string2 = requireArguments.getString("extra_report_target");
        if (string2 != null && !string2.equals("MEDIA")) {
            if (string2.equals("DIRECT_CONVERSATION")) {
                num2 = C05F.A01;
            } else {
                throw AbstractC166987dD.A12(string2);
            }
        } else {
            num2 = C05F.A00;
        }
        this.A05 = num2;
        if (this.A04 == C05F.A00) {
            this.A07 = AbstractC166997dE.A0N(this).getString(2131972368);
        }
        C0f9.A09(-2061090580, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1221003465);
        View A0A = AbstractC31172DnG.A0A(layoutInflater, viewGroup, R.layout.report_webview);
        C0f9.A09(1743272912, A02);
        return A0A;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(912455418);
        super.onDestroyView();
        this.A01.stopLoading();
        this.A01.destroy();
        this.A01 = null;
        this.A02 = null;
        C0f9.A09(1461168634, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.A01 = (WebView) view.requireViewById(R.id.web_view);
        this.A02 = (ProgressBar) view.requireViewById(R.id.progress);
        this.A01.setScrollBarStyle(0);
        WebSettings settings = this.A01.getSettings();
        settings.setJavaScriptEnabled(true);
        Context context = getContext();
        if (context != null) {
            C62817SSp.A00(this.A03, null);
        }
        if (C1QD.A01(this.A09)) {
            settings.setUserAgentString(C1FO.A01(settings.getUserAgentString()));
        }
        this.A01.setWebViewClient(new Q4r(1, context, this));
        this.A01.loadUrl(this.A09);
    }
}
