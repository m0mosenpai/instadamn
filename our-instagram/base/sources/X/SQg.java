package X;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.os.DeadObjectException;
import android.webkit.WebView;
import com.facebook.browser.lite.BrowserLiteInMainProcessIntentService;

/* loaded from: classes10.dex */
public abstract class SQg {
    public static boolean A01(Context context) {
        boolean z = false;
        try {
            PackageInfo currentWebViewPackage = WebView.getCurrentWebViewPackage();
            if (currentWebViewPackage != null) {
                context.getPackageManager().getPackageInfo(currentWebViewPackage.packageName, 0);
                z = true;
                return true;
            }
        } catch (Exception e) {
            C0K8.A0H("BrowserLiteIntentServiceHelper", "Checking for WebView package failed", e);
        }
        return z;
    }

    public static void A00(Context context, String str) {
        Intent A08 = MSW.A08(context, BrowserLiteInMainProcessIntentService.class);
        A08.putExtra("EXTRA_ACTION", str);
        try {
            try {
                AnonymousClass028.enqueueWork(context, BrowserLiteInMainProcessIntentService.class, 560821342, A08);
            } catch (RuntimeException e) {
                if (!(e.getCause() instanceof DeadObjectException)) {
                    if ((e instanceof IllegalArgumentException) && String.valueOf(e.getMessage()).contains("No such service")) {
                        C0K8.A0F("BrowserLiteInMainProcessIntentService", "Could not enqueue work", e);
                        return;
                    }
                    throw e;
                }
            }
        } catch (SecurityException unused) {
        }
    }
}
