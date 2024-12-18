package com.facebook.errorreporting.lacrima.detector.lifecycle;

import X.C005801x;
import X.C05F;
import X.C07960bG;
import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Bundle;

/* loaded from: classes.dex */
public class ApplicationLifecycleDetector$ActivityCallbacks implements Application.ActivityLifecycleCallbacks {
    public final /* synthetic */ C005801x A00;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public ApplicationLifecycleDetector$ActivityCallbacks(C005801x c005801x) {
        this.A00 = c005801x;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0013, code lost:
    
        if (r8.equals(X.C05F.A01) != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A00(android.app.Activity r7, java.lang.Integer r8) {
        /*
            r6 = this;
            X.01x r5 = r6.A00
            java.lang.Object r4 = r5.A0P
            monitor-enter(r4)
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L41
            r0 = 29
            r3 = 0
            if (r1 < r0) goto L15
            java.lang.Integer r0 = X.C05F.A01     // Catch: java.lang.Throwable -> L41
            boolean r0 = r8.equals(r0)     // Catch: java.lang.Throwable -> L41
            r2 = 0
            if (r0 == 0) goto L20
        L15:
            r2 = 1
            X.C005801x.A01(r7, r5)     // Catch: java.lang.Throwable -> L41
            X.0AG r1 = r5.A0A     // Catch: java.lang.Throwable -> L41
            java.lang.Integer r0 = X.C05F.A0N     // Catch: java.lang.Throwable -> L41
            r1.A03(r0, r7)     // Catch: java.lang.Throwable -> L41
        L20:
            android.content.Intent r0 = r7.getIntent()     // Catch: java.lang.Throwable -> L41
            if (r0 != 0) goto L2c
            java.lang.String r0 = "Null intent"
        L28:
            r5.A03(r7, r8, r0, r3)     // Catch: java.lang.Throwable -> L41
            goto L31
        L2c:
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L41
            goto L28
        L31:
            if (r2 == 0) goto L3c
            X.0bG r1 = r5.A0F     // Catch: java.lang.Throwable -> L41
            if (r1 == 0) goto L3c
            java.lang.Integer r0 = X.C05F.A0N     // Catch: java.lang.Throwable -> L41
            r1.A04(r0, r7)     // Catch: java.lang.Throwable -> L41
        L3c:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L41
            X.C005801x.A00()
            return
        L41:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L41
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.errorreporting.lacrima.detector.lifecycle.ApplicationLifecycleDetector$ActivityCallbacks.A00(android.app.Activity, java.lang.Integer):void");
    }

    public final void A01(Activity activity, Integer num) {
        C07960bG c07960bG;
        C005801x c005801x = this.A00;
        synchronized (c005801x.A0P) {
            boolean z = false;
            if (Build.VERSION.SDK_INT < 29 || num.equals(C05F.A01)) {
                C005801x.A01(null, c005801x);
                c005801x.A0A.A03(C05F.A0u, activity);
                z = true;
            }
            c005801x.A03(activity, num, null, true);
            if (z && (c07960bG = c005801x.A0F) != null) {
                c07960bG.A04(C05F.A0u, activity);
            }
        }
        if (c005801x.A0B != null) {
            C005801x.A00();
        }
    }

    public final void A02(Activity activity, Integer num) {
        C07960bG c07960bG;
        C005801x c005801x = this.A00;
        synchronized (c005801x.A0P) {
            boolean z = false;
            if (Build.VERSION.SDK_INT < 29 || num.equals(C05F.A01)) {
                C005801x.A01(null, c005801x);
                c005801x.A0A.A03(C05F.A0Y, activity);
                z = true;
            }
            c005801x.A03(activity, num, null, activity.isFinishing());
            if (z && (c07960bG = c005801x.A0F) != null) {
                c07960bG.A04(C05F.A0Y, activity);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0012, code lost:
    
        if (r7.equals(X.C05F.A01) != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A03(android.app.Activity r6, java.lang.Integer r7) {
        /*
            r5 = this;
            X.01x r4 = r5.A00
            java.lang.Object r3 = r4.A0P
            monitor-enter(r3)
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L32
            r0 = 29
            if (r1 < r0) goto L14
            java.lang.Integer r0 = X.C05F.A01     // Catch: java.lang.Throwable -> L32
            boolean r0 = r7.equals(r0)     // Catch: java.lang.Throwable -> L32
            r2 = 0
            if (r0 == 0) goto L20
        L14:
            r2 = 1
            r0 = 0
            X.C005801x.A01(r0, r4)     // Catch: java.lang.Throwable -> L32
            X.0AG r1 = r4.A0A     // Catch: java.lang.Throwable -> L32
            java.lang.Integer r0 = X.C05F.A00     // Catch: java.lang.Throwable -> L32
            r1.A03(r0, r6)     // Catch: java.lang.Throwable -> L32
        L20:
            r1 = 0
            r0 = 0
            r4.A03(r6, r7, r0, r1)     // Catch: java.lang.Throwable -> L32
            if (r2 == 0) goto L30
            X.0bG r1 = r4.A0F     // Catch: java.lang.Throwable -> L32
            if (r1 == 0) goto L30
            java.lang.Integer r0 = X.C05F.A00     // Catch: java.lang.Throwable -> L32
            r1.A04(r0, r6)     // Catch: java.lang.Throwable -> L32
        L30:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L32
            return
        L32:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L32
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.errorreporting.lacrima.detector.lifecycle.ApplicationLifecycleDetector$ActivityCallbacks.A03(android.app.Activity, java.lang.Integer):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0012, code lost:
    
        if (r7.equals(X.C05F.A01) != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A04(android.app.Activity r6, java.lang.Integer r7) {
        /*
            r5 = this;
            X.01x r4 = r5.A00
            java.lang.Object r3 = r4.A0P
            monitor-enter(r3)
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L32
            r0 = 29
            if (r1 < r0) goto L14
            java.lang.Integer r0 = X.C05F.A01     // Catch: java.lang.Throwable -> L32
            boolean r0 = r7.equals(r0)     // Catch: java.lang.Throwable -> L32
            r2 = 0
            if (r0 == 0) goto L20
        L14:
            r2 = 1
            r0 = 0
            X.C005801x.A01(r0, r4)     // Catch: java.lang.Throwable -> L32
            X.0AG r1 = r4.A0A     // Catch: java.lang.Throwable -> L32
            java.lang.Integer r0 = X.C05F.A0C     // Catch: java.lang.Throwable -> L32
            r1.A03(r0, r6)     // Catch: java.lang.Throwable -> L32
        L20:
            r1 = 0
            r0 = 0
            r4.A03(r6, r7, r0, r1)     // Catch: java.lang.Throwable -> L32
            if (r2 == 0) goto L30
            X.0bG r1 = r4.A0F     // Catch: java.lang.Throwable -> L32
            if (r1 == 0) goto L30
            java.lang.Integer r0 = X.C05F.A0C     // Catch: java.lang.Throwable -> L32
            r1.A04(r0, r6)     // Catch: java.lang.Throwable -> L32
        L30:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L32
            return
        L32:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L32
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.errorreporting.lacrima.detector.lifecycle.ApplicationLifecycleDetector$ActivityCallbacks.A04(android.app.Activity, java.lang.Integer):void");
    }

    public final void A05(Activity activity, Integer num) {
        C07960bG c07960bG;
        C005801x c005801x = this.A00;
        synchronized (c005801x.A0P) {
            boolean z = false;
            if (Build.VERSION.SDK_INT < 29 || num.equals(C05F.A01)) {
                z = true;
                C005801x.A01(null, c005801x);
                c005801x.A0A.A03(C05F.A0j, activity);
            }
            c005801x.A03(activity, num, null, activity.isFinishing());
            if (z && (c07960bG = c005801x.A0F) != null) {
                c07960bG.A04(C05F.A0j, activity);
            }
        }
    }

    public final boolean A06(Activity activity) {
        return activity.getClass().getName().equals(this.A00.A03);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        if (!A06(activity)) {
            A00(activity, C05F.A0C);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (!A06(activity)) {
            A01(activity, C05F.A0C);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (!A06(activity)) {
            A02(activity, C05F.A0C);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        if (!A06(activity)) {
            A03(activity, C05F.A0C);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        if (!A06(activity)) {
            A04(activity, C05F.A0C);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        if (!A06(activity)) {
            A05(activity, C05F.A0C);
        }
    }
}
