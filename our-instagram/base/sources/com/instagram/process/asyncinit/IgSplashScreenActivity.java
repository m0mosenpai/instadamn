package com.instagram.process.asyncinit;

import X.C14360o3;
import X.C99894eB;
import android.app.Activity;
import android.os.Bundle;

/* loaded from: classes.dex */
public final class IgSplashScreenActivity extends Activity {
    public C99894eB A00;
    public Bundle A01;

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        C14360o3.A0B(bundle, 0);
        if (this.A01 != null) {
            bundle.clear();
            bundle.putAll(this.A01);
        } else {
            bundle.putBoolean("async_app_init_recreate", true);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x007e, code lost:
    
        if (r3 > 0) goto L19;
     */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r7) {
        /*
            r6 = this;
            r0 = -21792008(0xfffffffffeb37af8, float:-1.1928515E38)
            int r5 = X.C0f9.A00(r0)
            X.C0fM.A00(r6)
            super.onCreate(r7)
            boolean r0 = X.AbstractC58327PtK.A00
            android.content.Intent r3 = r6.getIntent()
            X.C14360o3.A07(r3)
            java.util.List r2 = X.AbstractC58327PtK.A03
            monitor-enter(r2)
            java.util.Iterator r1 = r2.iterator()     // Catch: java.lang.Throwable -> Lbb
        L1d:
            boolean r0 = r1.hasNext()     // Catch: java.lang.Throwable -> Lbb
            if (r0 == 0) goto L2d
            java.lang.Object r0 = r1.next()     // Catch: java.lang.Throwable -> Lbb
            X.0sJ r0 = (X.InterfaceC16660sJ) r0     // Catch: java.lang.Throwable -> Lbb
            r0.invoke(r3)     // Catch: java.lang.Throwable -> Lbb
            goto L1d
        L2d:
            r2.clear()     // Catch: java.lang.Throwable -> Lbb
            monitor-exit(r2)
            r6.A01 = r7
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 30
            if (r1 > r0) goto L8b
            android.content.res.Resources r0 = r6.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r0 = r0.uiMode
            r1 = r0 & 48
            r0 = 32
            r4 = 0
            if (r1 != r0) goto L4b
            r4 = 1
        L4b:
            java.lang.String r0 = "window"
            java.lang.Object r1 = r6.getSystemService(r0)
            java.lang.String r0 = "null cannot be cast to non-null type android.view.WindowManager"
            X.C14360o3.A0C(r1, r0)
            android.view.WindowManager r1 = (android.view.WindowManager) r1
            android.view.Display r1 = r1.getDefaultDisplay()
            X.C14360o3.A07(r1)
            android.util.DisplayMetrics r0 = new android.util.DisplayMetrics
            r0.<init>()
            r1.getRealMetrics(r0)
            int r3 = r0.heightPixels
            int r2 = r0.widthPixels
            android.util.DisplayMetrics r0 = new android.util.DisplayMetrics
            r0.<init>()
            r1.getMetrics(r0)
            int r1 = r0.heightPixels
            int r0 = r0.widthPixels
            int r2 = r2 - r0
            if (r2 > 0) goto L80
            int r3 = r3 - r1
            r1 = 0
            if (r3 <= 0) goto L81
        L80:
            r1 = 1
        L81:
            X.4eB r0 = new X.4eB
            r0.<init>(r6, r4, r1)
            r6.A00 = r0
            r0.A02()
        L8b:
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            android.os.Handler r4 = new android.os.Handler
            r4.<init>(r0)
            r0 = 31
            X.9EQ r3 = new X.9EQ
            r3.<init>(r6, r0)
            android.os.ConditionVariable r2 = X.AbstractC58327PtK.A02
            monitor-enter(r2)
            r0 = -1
            boolean r0 = r2.block(r0)     // Catch: java.lang.Throwable -> Lbb
            if (r0 == 0) goto Laa
            r3.invoke()     // Catch: java.lang.Throwable -> Lbb
            goto Lb3
        Laa:
            r1 = 43
            X.Pbd r0 = new X.Pbd     // Catch: java.lang.Throwable -> Lbb
            r0.<init>(r1, r4, r3)     // Catch: java.lang.Throwable -> Lbb
            X.AbstractC58327PtK.A05 = r0     // Catch: java.lang.Throwable -> Lbb
        Lb3:
            monitor-exit(r2)
            r0 = 232229321(0xdd789c9, float:1.3283569E-30)
            X.C0f9.A07(r0, r5)
            return
        Lbb:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.process.asyncinit.IgSplashScreenActivity.onCreate(android.os.Bundle):void");
    }
}
