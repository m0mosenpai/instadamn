package X;

import android.content.ComponentCallbacks2;
import android.content.Intent;
import android.os.Bundle;
import android.view.InflateException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.simplewebview.SimpleWebViewConfig;
import org.apache.http.util.EncodingUtils;

/* loaded from: classes10.dex */
public class Rb0 extends AbstractC59962oe implements InterfaceC60072op, InterfaceC60122ou {
    public static final String __redex_internal_original_name = "SimpleWebViewFragment";
    public View A00;
    public ValueCallback A01;
    public WebView A02;
    public AbstractC18680vv A03;
    public SimpleWebViewConfig A04;
    public int A05;
    public static final java.util.Set A07 = AbstractC31171DnF.A0k(AbstractC16960so.A1N("geo", "maps", "mailto", "sms", "tel"));
    public static final InterfaceC08100bW A06 = AbstractC31175DnJ.A0B();

    /* JADX WARN: Code restructure failed: missing block: B:66:0x00fb, code lost:
    
        if (r8 != null) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean A03(android.net.Uri r12, android.webkit.WebView r13) {
        /*
            Method dump skipped, instructions count: 301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Rb0.A03(android.net.Uri, android.webkit.WebView):boolean");
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        SimpleWebViewConfig simpleWebViewConfig = this.A04;
        if (simpleWebViewConfig != null) {
            if (simpleWebViewConfig.A08) {
                interfaceC56362iU.EkF(false);
                return;
            }
            interfaceC56362iU.EkF(true);
            String str = simpleWebViewConfig.A02;
            if (str != null) {
                if (simpleWebViewConfig.A0B) {
                    interfaceC56362iU.Ehk(str);
                } else {
                    WebView webView = this.A02;
                    if (simpleWebViewConfig.A0E && webView != null && webView.getUrl() != null) {
                        String host = android.net.Uri.parse(webView.getUrl()).getHost();
                        C56352iT c56352iT = (C56352iT) interfaceC56362iU;
                        C56352iT.A0J(c56352iT, str, false);
                        c56352iT.Ef5(host);
                    } else {
                        interfaceC56362iU.setTitle(str);
                    }
                }
            }
            interfaceC56362iU.EkH(new ViewOnClickListenerC63507Soa(this, 15), simpleWebViewConfig.A0D);
            interfaceC56362iU.EkS(simpleWebViewConfig.A0C);
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "web_view";
    }

    public void A02(WebView webView) {
        if (this instanceof Rd2) {
            webView.getSettings().setDomStorageEnabled(true);
            webView.getSettings().setUserAgentString(AbstractC58320PtC.A0x(webView.getSettings()));
            ((Rd2) this).A00 = webView;
        } else {
            if (!(this instanceof Rd3)) {
                return;
            }
            ((Rd3) this).A00 = webView;
        }
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return this.A03;
    }

    public boolean onBackPressed() {
        WebView webView = this.A02;
        if (webView == null) {
            return false;
        }
        boolean equals = "file:///android_asset/webview_error.html".equals(webView.getUrl());
        SimpleWebViewConfig simpleWebViewConfig = this.A04;
        if (simpleWebViewConfig != null) {
            if (!simpleWebViewConfig.A06 || equals || !webView.canGoBack()) {
                return false;
            }
            webView.goBack();
            return true;
        }
        throw AbstractC166997dE.A0g();
    }

    public static final void A01(FrameLayout frameLayout, Rb0 rb0) {
        rb0.A00 = frameLayout.requireViewById(R.id.loading_indicator);
        rb0.A02 = (WebView) frameLayout.requireViewById(R.id.web_view);
        rb0.requireContext();
        AbstractC18680vv abstractC18680vv = rb0.A03;
        if (abstractC18680vv != null) {
            C62817SSp.A00(abstractC18680vv, null);
        }
        WebView webView = rb0.A02;
        if (webView != null) {
            webView.setScrollBarStyle(0);
            webView.setDownloadListener(new C63521Soo(rb0));
            webView.setWebChromeClient(new C58713Q4i(rb0, 4));
            WebSettings settings = webView.getSettings();
            C14360o3.A07(settings);
            settings.setJavaScriptEnabled(true);
            SimpleWebViewConfig simpleWebViewConfig = rb0.A04;
            if (simpleWebViewConfig != null) {
                if (simpleWebViewConfig.A05 || C1QD.A01(simpleWebViewConfig.A03)) {
                    settings.setUserAgentString(AbstractC58320PtC.A0x(settings));
                }
                webView.setWebViewClient(new Q4s(rb0, 6));
                String str = simpleWebViewConfig.A03;
                if (str != null) {
                    String str2 = simpleWebViewConfig.A01;
                    if (str2 != null && str2.length() != 0) {
                        byte[] bytes = EncodingUtils.getBytes(str2, "BASE64");
                        if (bytes != null) {
                            webView.postUrl(str, bytes);
                        } else {
                            throw AbstractC166987dD.A14("Required value was null.");
                        }
                    } else {
                        webView.loadUrl(str);
                    }
                }
                WebView webView2 = rb0.A02;
                if (webView2 != null) {
                    rb0.A02(webView2);
                    return;
                }
                throw AbstractC166987dD.A14("Required value was null.");
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 101) {
            ValueCallback valueCallback = this.A01;
            if (i2 == -1 && intent != null && intent.getData() != null) {
                try {
                    android.net.Uri data = intent.getData();
                    if (data != null) {
                        C54846OMr c54846OMr = new C54846OMr();
                        c54846OMr.A01(requireActivity(), data);
                        android.net.Uri fromFile = android.net.Uri.fromFile(c54846OMr.A00());
                        if (valueCallback != null) {
                            boolean z = true;
                            android.net.Uri[] uriArr = {fromFile};
                            if (fromFile == null) {
                                z = false;
                            }
                            if (!AbstractC31174DnI.A1b(z)) {
                                uriArr = null;
                            }
                            valueCallback.onReceiveValue(uriArr);
                            this.A01 = null;
                            return;
                        }
                        return;
                    }
                    return;
                } catch (SecurityException unused) {
                    StringBuilder A1C = AbstractC166987dD.A1C();
                    A1C.append("failed to open file from uri = ");
                    C0w9.A03(__redex_internal_original_name, AbstractC166997dE.A0v(intent.getData(), A1C));
                    return;
                }
            }
            if (valueCallback != null) {
                AbstractC18680vv abstractC18680vv = this.A03;
                if (abstractC18680vv == null || AbstractC31178DnM.A1X(C06090Tz.A05, abstractC18680vv, 2342160724387698170L)) {
                    valueCallback.onReceiveValue(null);
                    this.A01 = null;
                }
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(705742582);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        if (requireArguments.getString("IgSessionManager.SESSION_TOKEN_KEY") != null) {
            this.A03 = C023409i.A0A.A04(requireArguments);
        }
        this.A04 = (SimpleWebViewConfig) AbstractC153636vY.A00(requireArguments, SimpleWebViewConfig.class, MSV.A00(2));
        C0f9.A09(31362087, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View view;
        int A02 = C0f9.A02(-650125492);
        C14360o3.A0B(layoutInflater, 0);
        try {
            View inflate = layoutInflater.inflate(R.layout.simple_web_view, viewGroup, false);
            C14360o3.A0C(inflate, AbstractC111324zv.A00(1));
            FrameLayout frameLayout = (FrameLayout) inflate;
            A01(frameLayout, this);
            view = frameLayout;
        } catch (InflateException unused) {
            View inflate2 = layoutInflater.inflate(R.layout.simple_web_view_stub, viewGroup, false);
            C14360o3.A0C(inflate2, AbstractC111324zv.A00(1));
            ViewStub viewStub = (ViewStub) AbstractC166997dE.A0R(inflate2, R.id.web_view_stub);
            this.A02 = null;
            this.A00 = null;
            AbstractC167007dF.A0J().postDelayed(new TPE(viewStub, this), 500L);
            view = inflate2;
        }
        C0f9.A09(1606445307, A02);
        return view;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public void onDestroyView() {
        int A02 = C0f9.A02(107568648);
        this.A00 = null;
        WebView webView = this.A02;
        if (webView != null) {
            webView.destroy();
            this.A02 = null;
        }
        super.onDestroyView();
        C0f9.A09(-1384815293, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        int A02 = C0f9.A02(-1846874484);
        super.onStart();
        ComponentCallbacks2 rootActivity = getRootActivity();
        if (rootActivity instanceof InterfaceC53712dA) {
            this.A05 = ((InterfaceC53712dA) rootActivity).C4u();
            SimpleWebViewConfig simpleWebViewConfig = this.A04;
            if (simpleWebViewConfig != null) {
                if (simpleWebViewConfig.A07) {
                    ComponentCallbacks2 rootActivity2 = getRootActivity();
                    if (rootActivity2 instanceof InterfaceC53712dA) {
                        ((InterfaceC53712dA) rootActivity2).EfL(8);
                    }
                }
            } else {
                IllegalStateException A0g = AbstractC166997dE.A0g();
                C0f9.A09(1658451451, A02);
                throw A0g;
            }
        }
        C0f9.A09(-11748405, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        int A02 = C0f9.A02(-1434085798);
        super.onStop();
        ComponentCallbacks2 rootActivity = getRootActivity();
        if (rootActivity instanceof InterfaceC53712dA) {
            ((InterfaceC53712dA) rootActivity).EfL(this.A05);
        }
        C0f9.A09(130692516, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onCreate(bundle);
        FragmentActivity requireActivity = requireActivity();
        C14360o3.A0C(requireActivity, AbstractC43591JPw.A00(6));
        ((BaseFragmentActivity) requireActivity).A0a();
    }
}
