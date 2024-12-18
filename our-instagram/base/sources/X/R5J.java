package X;

import android.view.View;
import android.webkit.WebView;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.views.webview.ReactWebViewManager;

/* loaded from: classes10.dex */
public final class R5J extends AbstractC70462WWz {
    @Override // X.AbstractC70462WWz, X.InterfaceC65496TlK
    public final void E8c(View view, String str, ReadableArray readableArray) {
        switch (str.hashCode()) {
            case -1241591313:
                if (!str.equals("goBack")) {
                    return;
                }
                ((WebView) view).goBack();
                return;
            case -948122918:
                if (!str.equals("stopLoading")) {
                    return;
                }
                ((WebView) view).stopLoading();
                return;
            case -934641255:
                if (!str.equals("reload")) {
                    return;
                }
                ((WebView) view).reload();
                return;
            case -318289731:
                if (!str.equals("goForward")) {
                    return;
                }
                ((WebView) view).goForward();
                return;
            case 336631465:
                if (!str.equals("loadUrl")) {
                    return;
                }
                ((WebView) view).loadUrl(readableArray.getString(0));
                return;
            case 1490029383:
                if (!str.equals("postMessage")) {
                    return;
                }
                ((ReactWebViewManager) this.A00).postMessage(view, readableArray.getString(0), readableArray.getString(1));
                return;
            case 2104576510:
                if (!str.equals("injectJavaScript")) {
                    return;
                }
                ((ReactWebViewManager) this.A00).injectJavaScript(view, readableArray.getString(0));
                return;
            default:
                return;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00e5, code lost:
    
        if (r7.equals("originAllowlist") == false) goto L4;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01e6  */
    @Override // X.AbstractC70462WWz, X.InterfaceC65496TlK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Ebq(android.view.View r5, java.lang.Object r6, java.lang.String r7) {
        /*
            Method dump skipped, instructions count: 602
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.R5J.Ebq(android.view.View, java.lang.Object, java.lang.String):void");
    }
}
