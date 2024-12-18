package X;

import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import com.instagram.neko.playables.activity.PlayableProgressBar;

/* loaded from: classes10.dex */
public final class R7O extends AbstractC62760SPs {
    public boolean A00;
    public final /* synthetic */ Rb4 A01;

    public R7O(Rb4 rb4) {
        this.A01 = rb4;
    }

    @Override // X.AbstractC62760SPs
    public final void A02(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        boolean A1a = AbstractC167017dG.A1a(webView, webResourceRequest);
        C14360o3.A0B(webResourceError, 2);
        super.A02(webView, webResourceRequest, webResourceError);
        this.A00 = A1a;
    }

    @Override // X.AbstractC62760SPs
    public final void A03(WebView webView, String str) {
        AbstractC167017dG.A1N(webView, str);
        super.A03(webView, str);
        PlayableProgressBar playableProgressBar = this.A01.A02;
        if (playableProgressBar == null) {
            C14360o3.A0F("playableProgressBar");
            throw C00O.createAndThrow();
        }
        playableProgressBar.A00(100);
        if (!this.A00) {
            StringBuilder A1C = AbstractC166987dD.A1C();
            A1C.append("javascript:");
            A1C.append("FbPlayableAd = {");
            A1C.append("onCTAClick() {");
            A1C.append("var isTrusted = Boolean(event && event.isTrusted);");
            A1C.append("SecureFbPlayableAd.onCTAClick(isTrusted);");
            A1C.append("},");
            A1C.append("initializeLogging(endpoint_url) {");
            A1C.append("SecureFbPlayableAd.initializeLogging(endpoint_url);");
            A1C.append("},");
            A1C.append("logGameLoad() {");
            A1C.append("SecureFbPlayableAd.initializeLogging();");
            A1C.append("},");
            A1C.append("logButtonClick(name, x, y) {");
            A1C.append("SecureFbPlayableAd.logButtonClick(name, x, y);");
            A1C.append("},");
            A1C.append("logLevelComplete(level_name) {");
            A1C.append("SecureFbPlayableAd.logLevelComplete(level_name);");
            A1C.append("},");
            A1C.append("logEndCardShowUp() {");
            A1C.append("SecureFbPlayableAd.logEndCardShowUp();");
            A1C.append("},");
            String A0x = AbstractC166997dE.A0x("};", A1C);
            C14360o3.A07(A0x);
            webView.evaluateJavascript(A0x, null);
        }
    }
}
