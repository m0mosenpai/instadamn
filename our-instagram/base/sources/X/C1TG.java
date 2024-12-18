package X;

import X.C1TG;
import android.app.Activity;
import android.app.ActivityThread;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.contentcapture.ContentCaptureManager;

/* renamed from: X.1TG, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1TG extends C0R8 {
    public static final boolean A01;
    public final boolean A00;

    @Override // X.InterfaceC05710Rv
    public final String getName() {
        return "ContentCaptureManagerFixer";
    }

    static {
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 29) {
            z = true;
        }
        A01 = z;
    }

    public static void A00(Context context) {
        ContentCaptureManager contentCaptureManager = (ContentCaptureManager) context.getSystemService(ContentCaptureManager.class);
        if (contentCaptureManager != null) {
            contentCaptureManager.setContentCaptureEnabled(false);
        }
    }

    @Override // X.InterfaceC05710Rv
    public final void CNZ() {
        if (this.A00 && Build.VERSION.SDK_INT >= 29) {
            ActivityThread.currentActivityThread().getApplication().registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() { // from class: com.facebook.fixie.fixes.common.ContentCaptureManagerFixer$1
                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityDestroyed(Activity activity) {
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityPaused(Activity activity) {
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityResumed(Activity activity) {
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityStarted(Activity activity) {
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityStopped(Activity activity) {
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityCreated(Activity activity, Bundle bundle) {
                    C1TG.A00(activity);
                }
            });
            Activity A00 = C0Ct.A00();
            if (A00 != null) {
                A00(A00);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x001d, code lost:
    
        if (X.C20150ym.A07(X.AbstractC20100yh.A00(36314103112141261L)) == false) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C1TG(X.C0Rw r3) {
        /*
            r2 = this;
            r2.<init>(r3)
            java.lang.Class<X.0hA> r0 = X.C10420hA.class
            X.0Rw r1 = r2.A05(r0)
            boolean r0 = X.C1TG.A01
            if (r0 == 0) goto L1f
            if (r1 == 0) goto L1f
            r0 = 36314103112141261(0x81037c005609cd, double:3.028523261049963E-306)
            X.0tH r0 = X.AbstractC20100yh.A00(r0)
            boolean r1 = X.C20150ym.A07(r0)
            r0 = 1
            if (r1 != 0) goto L20
        L1f:
            r0 = 0
        L20:
            r2.A00 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1TG.<init>(X.0Rw):void");
    }
}
