package X;

import android.content.Context;
import android.webkit.CookieSyncManager;
import android.webkit.WebView;
import java.util.regex.Pattern;

/* renamed from: X.TJr, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class RunnableC64554TJr implements Runnable {
    public final /* synthetic */ Context A00;

    public RunnableC64554TJr(Context context) {
        this.A00 = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context = this.A00;
        Pattern pattern = SUV.A01;
        try {
            CookieSyncManager.createInstance(context);
            C63940SwF A00 = AbstractC61712RsT.A00();
            try {
                A00.EEu(null);
            } catch (Exception unused) {
            }
            try {
                A00.flush();
            } catch (Exception unused2) {
            }
            WebView webView = new WebView(context);
            webView.clearCache(true);
            webView.destroy();
        } catch (Exception unused3) {
        }
    }
}
