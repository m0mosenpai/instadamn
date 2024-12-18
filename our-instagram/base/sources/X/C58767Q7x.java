package X;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ProgressBar;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.facebook.react.views.webview.ReactWebViewManager;
import java.net.URISyntaxException;

/* renamed from: X.Q7x, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58767Q7x extends Fragment implements InterfaceC65382TjF {
    public C61561Rpj A00;
    public java.util.Set A01;
    public C60612RDh A02;
    public String A03;

    @Override // X.InterfaceC65382TjF
    public final boolean onBackPressed() {
        C61561Rpj c61561Rpj = this.A00;
        if (c61561Rpj != null && c61561Rpj.A00.canGoBack()) {
            this.A00.A00.goBack();
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.Rpj, java.lang.Object] */
    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        ?? obj = new Object();
        obj.A01 = (ProgressBar) view.requireViewById(R.id.fbpay_auth_progress_bar);
        WebView webView = (WebView) view.requireViewById(R.id.auth_web_view);
        obj.A00 = webView;
        this.A00 = obj;
        webView.setFocusable(true);
        this.A00.A00.setFocusableInTouchMode(true);
        WebSettings settings = this.A00.A00.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        settings.setSupportMultipleWindows(true);
        AbstractC58323PtF.A1D(settings);
        this.A00.A00.setWebChromeClient(new C58713Q4i(this, 1));
        this.A00.A00.setWebViewClient(new Q4s(this, 2));
        if (!TextUtils.isEmpty(this.A03)) {
            this.A00.A00.loadUrl(this.A03);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(1455285550);
        super.onCreate(bundle);
        this.A02 = (C60612RDh) C2FP.A03().A03(getActivity(), C60612RDh.class);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            this.A03 = bundle2.getString("WEB_FRAGMENT_LOAD_URL");
            this.A01 = AbstractC166987dD.A1H();
            String[] stringArray = bundle2.getStringArray("WEB_FRAGMENT_INTERCEPT_URLS");
            if (stringArray != null) {
                for (String str : stringArray) {
                    try {
                        this.A01.add(new java.net.URI(str));
                    } catch (URISyntaxException unused) {
                    }
                }
            }
        }
        C0f9.A09(-271611429, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(846859192);
        C60612RDh c60612RDh = this.A02;
        InterfaceC65381TjE interfaceC65381TjE = c60612RDh.A01;
        View A0A = AbstractC31172DnG.A0A(((T34) interfaceC65381TjE).A00, viewGroup, c60612RDh.A00);
        C14360o3.A07(A0A);
        C0f9.A09(-742202134, A02);
        return A0A;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(1110457254);
        super.onDestroyView();
        WebView webView = this.A00.A00;
        webView.loadUrl(ReactWebViewManager.BLANK_URL);
        webView.clearCache(true);
        webView.setTag(null);
        webView.clearHistory();
        webView.removeAllViews();
        webView.onPause();
        webView.destroy();
        this.A00 = null;
        C0f9.A09(1501645186, A02);
    }
}
