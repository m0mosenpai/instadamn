package X;

import android.graphics.Picture;
import android.webkit.WebView;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.views.webview.ReactWebViewManager;

/* renamed from: X.Sow, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63529Sow implements WebView.PictureListener {
    public final /* synthetic */ ReactWebViewManager A00;

    public C63529Sow(ReactWebViewManager reactWebViewManager) {
        this.A00 = reactWebViewManager;
    }

    @Override // android.webkit.WebView.PictureListener
    public final void onNewPicture(WebView webView, Picture picture) {
        ReactWebViewManager.dispatchEvent(webView, new R6A(UIManagerHelper.A01(webView), webView.getId(), webView.getWidth(), webView.getContentHeight()));
    }
}
