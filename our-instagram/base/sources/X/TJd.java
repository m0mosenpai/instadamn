package X;

import com.facebook.browser.lite.BrowserLiteFragment;
import com.facebook.browser.lite.webview.SystemWebView;
import java.util.Stack;

/* loaded from: classes10.dex */
public final class TJd implements Runnable {
    public final /* synthetic */ BrowserLiteFragment A00;

    public TJd(BrowserLiteFragment browserLiteFragment) {
        this.A00 = browserLiteFragment;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Stack stack = this.A00.A1O;
        if (!stack.isEmpty()) {
            ((SystemWebView) ((AbstractC61598RqN) stack.peek())).A04.reload();
        }
    }
}
