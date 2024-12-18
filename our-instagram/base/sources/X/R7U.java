package X;

import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.os.Handler;
import android.os.Looper;
import android.webkit.WebViewClient;
import com.facebook.secure.webkit.WebView;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes10.dex */
public final class R7U extends WebView {
    public C58717Q4q A00;
    public C61693RsA A01;
    public boolean A02;
    public final List A03;

    public R7U(Context context, C61693RsA c61693RsA) {
        super(context, null, R.attr.webViewStyle);
        this.A03 = AbstractC166987dD.A1E();
        this.A02 = true;
        this.A01 = c61693RsA;
    }

    @Override // android.webkit.WebView
    public C58717Q4q getWebViewClient() {
        return this.A00;
    }

    public final void A00(String str) {
        Looper mainLooper = Looper.getMainLooper();
        if (Looper.myLooper() == mainLooper) {
            String A0R = AnonymousClass001.A0R("javascript: ", str);
            try {
                evaluateJavascript(str, null);
                return;
            } catch (IllegalStateException unused) {
                loadUrl(A0R);
                return;
            }
        }
        new Handler(mainLooper).post(new TN6(this, str));
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.A02 && computeVerticalScrollRange() > getHeight()) {
            this.A02 = false;
            Iterator it = this.A03.iterator();
            if (it.hasNext()) {
                it.next();
                throw AbstractC166987dD.A15("onFirstScrollReady");
            }
        }
    }

    @Override // android.webkit.WebView
    public void setWebViewClient(WebViewClient webViewClient) {
        super.setWebViewClient(webViewClient);
        this.A00 = (C58717Q4q) webViewClient;
    }

    @Override // android.webkit.WebView
    public /* bridge */ /* synthetic */ WebViewClient getWebViewClient() {
        return this.A00;
    }
}
