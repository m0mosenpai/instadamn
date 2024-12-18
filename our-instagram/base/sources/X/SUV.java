package X;

import android.content.Context;
import android.os.Looper;
import android.webkit.CookieSyncManager;
import android.webkit.WebView;
import java.util.Vector;
import java.util.regex.Pattern;

/* loaded from: classes10.dex */
public abstract class SUV {
    public static final Pattern A01 = Pattern.compile("(?:\\sChrome/)(\\d{2,3})(?:\\.)");
    public static final Vector A00 = new Vector();

    public static void A00(Context context) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            try {
                CookieSyncManager.createInstance(context);
                C63940SwF A002 = AbstractC61712RsT.A00();
                try {
                    A002.EEu(null);
                } catch (Exception unused) {
                }
                try {
                    A002.flush();
                } catch (Exception unused2) {
                }
                WebView webView = new WebView(context);
                webView.clearCache(true);
                webView.destroy();
                return;
            } catch (Exception unused3) {
                return;
            }
        }
        STG.A00(new RunnableC64554TJr(context));
    }
}
