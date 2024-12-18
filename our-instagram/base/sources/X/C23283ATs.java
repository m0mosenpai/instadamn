package X;

import android.webkit.DownloadListener;
import com.facebook.browser.lite.BrowserLiteFragment;
import com.facebook.browser.lite.webview.SystemWebView;

/* renamed from: X.ATs, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23283ATs implements DownloadListener {
    public final /* synthetic */ BrowserLiteFragment A00;
    public final /* synthetic */ QF6 A01;

    public C23283ATs(BrowserLiteFragment browserLiteFragment, QF6 qf6) {
        this.A00 = browserLiteFragment;
        this.A01 = qf6;
    }

    @Override // android.webkit.DownloadListener
    public final void onDownloadStart(String str, String str2, String str3, String str4, long j) {
        BrowserLiteFragment browserLiteFragment = this.A00;
        if (!browserLiteFragment.A0f(str)) {
            QF6 qf6 = this.A01;
            if (str.equals(qf6.A05())) {
                if (qf6.A0H()) {
                    ((SystemWebView) qf6).A04.goBack();
                } else if (browserLiteFragment.A1O.size() > 1) {
                    BrowserLiteFragment.A0D(browserLiteFragment);
                } else {
                    BrowserLiteFragment.A0G(browserLiteFragment, "ON_DOWNLOAD_START");
                    browserLiteFragment.AIE(4, str);
                }
            }
        }
    }
}
