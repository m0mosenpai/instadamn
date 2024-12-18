package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ProgressBar;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.facebook.react.views.webview.ReactWebViewManager;
import java.net.URISyntaxException;
import java.util.HashSet;

/* renamed from: X.Q7q, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58761Q7q extends Fragment {
    public WebView A00;
    public ProgressBar A01;
    public String A02;
    public String A03;
    public boolean A04;
    public final HashSet A05 = AbstractC166987dD.A1H();

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        C14360o3.A0B(view, 0);
        this.A00 = (WebView) view.requireViewById(R.id.auth_web_view);
        ProgressBar progressBar = (ProgressBar) view.requireViewById(R.id.fbpay_auth_progress_bar);
        this.A01 = progressBar;
        if (progressBar == null) {
            str = "progressBar";
        } else {
            progressBar.setVisibility(8);
            WebView webView = this.A00;
            if (webView != null) {
                webView.setFocusable(true);
                WebView webView2 = this.A00;
                if (webView2 != null) {
                    webView2.setFocusableInTouchMode(true);
                    WebView webView3 = this.A00;
                    if (webView3 != null) {
                        WebSettings settings = webView3.getSettings();
                        C14360o3.A07(settings);
                        settings.setJavaScriptEnabled(true);
                        settings.setJavaScriptCanOpenWindowsAutomatically(true);
                        settings.setSupportMultipleWindows(true);
                        AbstractC58323PtF.A1D(settings);
                        Q4s q4s = new Q4s(this, 1);
                        WebView webView4 = this.A00;
                        if (webView4 != null) {
                            webView4.setWebViewClient(q4s);
                            WebView webView5 = this.A00;
                            if (webView5 != null) {
                                webView5.setWebChromeClient(new C58713Q4i(this, 0));
                                C2FP A05 = C2FP.A05();
                                C2FP.A0K(A05);
                                C02R.A03(A05.A00.A0L, "WebViewHelper Factory is not provided!");
                                A05.A00.A0L.get();
                                String str2 = this.A03;
                                str = "loadUrl";
                                WebView webView6 = this.A00;
                                if (str2 != null) {
                                    if (webView6 != null) {
                                        String str3 = this.A02;
                                        if (str3 != null) {
                                            webView6.postUrl(str3, MSY.A1a(str2));
                                            return;
                                        }
                                    }
                                } else if (webView6 != null) {
                                    String str4 = this.A02;
                                    if (str4 != null) {
                                        webView6.loadUrl(str4);
                                        return;
                                    }
                                }
                                throw C00O.createAndThrow();
                            }
                        }
                    }
                }
            }
            C14360o3.A0F("webView");
            throw C00O.createAndThrow();
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        IllegalStateException A14;
        int i;
        int A02 = C0f9.A02(-199607994);
        super.onCreate(bundle);
        String string = requireArguments().getString("WEB_VIEW_URL");
        if (string != null) {
            this.A02 = string;
            this.A03 = requireArguments().getString("WEB_VIEW_POST_DATA");
            this.A04 = requireArguments().getBoolean("WEB_VIEW_FULL_SCREEN");
            String[] stringArray = requireArguments().getStringArray("WEB_VIEW_ALLOWED_INTERCEPT_URLS");
            if (stringArray != null) {
                for (String str : stringArray) {
                    try {
                        this.A05.add(new java.net.URI(str));
                    } catch (URISyntaxException unused) {
                    }
                }
                C0f9.A09(-1524415750, A02);
                return;
            }
            A14 = AbstractC166987dD.A14("Required value was null.");
            i = -1714515283;
        } else {
            A14 = AbstractC166987dD.A14("Required value was null.");
            i = 1039439227;
        }
        C0f9.A09(i, A02);
        throw A14;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1351919041);
        C14360o3.A0B(layoutInflater, 0);
        Context requireContext = requireContext();
        C2FP.A0A();
        LayoutInflater A0C = AbstractC43593JPy.A0C(requireContext, layoutInflater, R.style.FBPayUIWidget);
        C2FP.A0H();
        View inflate = A0C.inflate(R.layout.fbpay_auth_ig_web_view, viewGroup, false);
        if (this.A04) {
            C14360o3.A0A(inflate);
            AbstractC166997dE.A0S(inflate, R.id.web_view_layout).setMinimumHeight(AbstractC167007dF.A0K(requireContext()).heightPixels);
        }
        C0f9.A09(-1443457826, A02);
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(2142151378);
        super.onDestroyView();
        WebView webView = this.A00;
        if (webView != null) {
            webView.loadUrl(ReactWebViewManager.BLANK_URL);
            WebView webView2 = this.A00;
            if (webView2 != null) {
                webView2.clearCache(true);
                CookieManager.getInstance().removeAllCookie();
                WebView webView3 = this.A00;
                if (webView3 != null) {
                    webView3.setTag(null);
                    WebView webView4 = this.A00;
                    if (webView4 != null) {
                        webView4.clearHistory();
                        WebView webView5 = this.A00;
                        if (webView5 != null) {
                            webView5.removeAllViews();
                            WebView webView6 = this.A00;
                            if (webView6 != null) {
                                webView6.onPause();
                                WebView webView7 = this.A00;
                                if (webView7 != null) {
                                    webView7.destroy();
                                    C0f9.A09(85637932, A02);
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        }
        C14360o3.A0F("webView");
        throw C00O.createAndThrow();
    }
}
