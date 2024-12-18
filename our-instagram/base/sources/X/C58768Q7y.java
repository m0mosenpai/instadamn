package X;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.facebook.react.modules.dialog.DialogModule;
import com.facebook.react.views.webview.ReactWebViewManager;
import com.fbpay.hub.common.view.HubProgressBar;
import java.net.URISyntaxException;

/* renamed from: X.Q7y, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58768Q7y extends Fragment implements InterfaceC65382TjF, InterfaceC65387TjK {
    public HubProgressBar A00;
    public WebView A01;
    public String A02;
    public final java.util.Set A03 = AbstractC166987dD.A1H();

    @Override // X.InterfaceC65387TjK
    public final SOB C8u() {
        boolean z;
        String str;
        Bundle bundle = this.mArguments;
        if (bundle != null) {
            z = true;
            int i = bundle.getInt("title_res");
            Bundle bundle2 = this.mArguments;
            if (i != 0) {
                str = getString(bundle2.getInt("title_res"));
            } else {
                str = bundle2.getString(DialogModule.KEY_TITLE);
            }
        } else {
            z = false;
            str = null;
        }
        return new SOB(null, null, null, str, 0, 0, false, false, z);
    }

    @Override // X.InterfaceC65382TjF
    public final boolean onBackPressed() {
        if (this.A01.canGoBack()) {
            this.A01.goBack();
            return true;
        }
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(1239536250);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            this.A02 = bundle2.getString("web_fragment_load_url");
            String[] stringArray = bundle2.getStringArray("web_fragment_intercept_urls");
            if (stringArray != null) {
                for (String str : stringArray) {
                    try {
                        this.A03.add(new java.net.URI(str));
                    } catch (URISyntaxException unused) {
                    }
                }
            }
        }
        C0f9.A09(-1401836163, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1293650017);
        C2FP.A0E();
        View A0A = AbstractC31172DnG.A0A(layoutInflater, viewGroup, R.layout.fragment_hub_web_view);
        C0f9.A09(1719184425, A02);
        return A0A;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-36887658);
        super.onDestroyView();
        WebView webView = this.A01;
        webView.loadUrl(ReactWebViewManager.BLANK_URL);
        webView.clearCache(true);
        webView.setTag(null);
        webView.clearHistory();
        webView.removeAllViews();
        webView.onPause();
        webView.destroy();
        this.A01 = null;
        this.A00 = null;
        C0f9.A09(-1296932875, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        this.A00 = (HubProgressBar) view.requireViewById(R.id.fbpay_hub_progress_bar);
        WebView webView = (WebView) view.requireViewById(R.id.fbpay_hub_web_view);
        this.A01 = webView;
        webView.setFocusable(true);
        this.A01.setFocusableInTouchMode(true);
        WebSettings settings = this.A01.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        AbstractC58323PtF.A1D(settings);
        this.A01.setWebChromeClient(new C58713Q4i(this, 2));
        this.A01.setWebViewClient(new Q4s(this, 3));
        if (!TextUtils.isEmpty(this.A02)) {
            this.A01.loadUrl(this.A02);
        }
    }
}
