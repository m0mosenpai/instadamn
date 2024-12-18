package X;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.facebook.browser.lite.webview.SystemWebView;

/* renamed from: X.AFs, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC23086AFs {
    public static Handler A00;
    public static AXN A01;
    public static A9E A02;
    public static C224439vU A03;
    public static final ACQ A04 = new ACQ();

    public static void A00() {
        Looper mainLooper;
        A9E a9e = A02;
        if (a9e != null) {
            final QF6 qf6 = a9e.A02;
            Context context = ((SystemWebView) qf6).A04.getContext();
            if (context != null && (mainLooper = context.getMainLooper()) != null) {
                new Handler(mainLooper).post(new Runnable() { // from class: X.ApD
                    @Override // java.lang.Runnable
                    public final void run() {
                        QF6.this.A09();
                    }
                });
            } else {
                qf6.A09();
            }
        }
        A02 = null;
    }
}
