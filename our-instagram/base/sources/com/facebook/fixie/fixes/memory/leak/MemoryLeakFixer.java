package com.facebook.fixie.fixes.memory.leak;

import X.C06K;
import X.C0Ct;
import X.C0R8;
import X.C1TE;
import X.C211511r;
import X.C69192VjL;
import X.RunnableC71409WtX;
import X.TQO;
import android.app.Activity;
import android.app.ActivityThread;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import androidx.fragment.app.FragmentActivity;

/* loaded from: classes.dex */
public final class MemoryLeakFixer extends C0R8 implements Application.ActivityLifecycleCallbacks {
    public C1TE A00;
    public final long A01;
    public final Handler A02;
    public final C06K A03;
    public final C211511r A04;
    public final boolean A05;
    public final boolean A06;
    public final Context A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;

    @Override // X.InterfaceC05710Rv
    public final String getName() {
        return "MemoryLeakFixer";
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

    @Override // X.InterfaceC05710Rv
    public final void CNZ() {
        Activity A00;
        if (this.A09) {
            ActivityThread.currentActivityThread().getApplication().registerActivityLifecycleCallbacks(this);
            if (this.A06 && (A00 = C0Ct.A00()) != null && (A00 instanceof FragmentActivity)) {
                ((FragmentActivity) A00).mFragments.A00.A03.A0q(this.A03, true);
            }
            A08();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        if (this.A06 && activity != null && (activity instanceof FragmentActivity)) {
            ((FragmentActivity) activity).mFragments.A00.A03.A0q(this.A03, true);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (this.A0A) {
            C1TE c1te = this.A00;
            if (c1te == null) {
                c1te = new C1TE(this.A07, this.A02);
                this.A00 = c1te;
            }
            C69192VjL c69192VjL = c1te.A00;
            if (c69192VjL == null || c69192VjL.A03) {
                c1te.A02.post(new RunnableC71409WtX(activity, c1te));
            }
        }
        if (this.A08) {
            this.A02.postDelayed(new TQO(this.A04, activity, this.A05), this.A01);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0058, code lost:
    
        if (X.C20150ym.A07(X.AbstractC20100yh.A00(36314103112534482L)) == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x006d, code lost:
    
        if (X.C20150ym.A07(X.AbstractC20100yh.A00(36314103112927699L)) == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x002e, code lost:
    
        if (X.C20150ym.A07(X.AbstractC20100yh.A00(36314103111944651L)) == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0043, code lost:
    
        if (X.C20150ym.A07(X.AbstractC20100yh.A00(36314103112468945L)) == false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MemoryLeakFixer(X.C211511r r8, X.C0Rw r9) {
        /*
            r7 = this;
            r7.<init>(r9)
            X.1TD r0 = new X.1TD
            r0.<init>()
            r7.A03 = r0
            r7.A04 = r8
            r0 = r9
            X.0RK r0 = (X.C0RK) r0
            android.content.Context r0 = r0.A01
            r7.A07 = r0
            java.lang.Class<X.0hA> r0 = X.C10420hA.class
            X.0Rw r6 = r7.A05(r0)
            boolean r0 = X.C1TE.A03
            r5 = 1
            if (r0 == 0) goto L30
            if (r6 == 0) goto L30
            r0 = 36314103111944651(0x81037c005309cb, double:3.028523260925626E-306)
            X.0tH r0 = X.AbstractC20100yh.A00(r0)
            boolean r0 = X.C20150ym.A07(r0)
            r4 = 1
            if (r0 != 0) goto L31
        L30:
            r4 = 0
        L31:
            r7.A0A = r4
            if (r6 == 0) goto L45
            r0 = 36314103112468945(0x81037c005b09d1, double:3.0285232612571916E-306)
            X.0tH r0 = X.AbstractC20100yh.A00(r0)
            boolean r0 = X.C20150ym.A07(r0)
            r3 = 1
            if (r0 != 0) goto L46
        L45:
            r3 = 0
        L46:
            r7.A08 = r3
            if (r6 == 0) goto L5a
            r0 = 36314103112534482(0x81037c005c09d2, double:3.0285232612986374E-306)
            X.0tH r0 = X.AbstractC20100yh.A00(r0)
            boolean r0 = X.C20150ym.A07(r0)
            r2 = 1
            if (r0 != 0) goto L5b
        L5a:
            r2 = 0
        L5b:
            r7.A06 = r2
            if (r6 == 0) goto L6f
            r0 = 36314103112927699(0x81037c006209d3, double:3.0285232615473095E-306)
            X.0tH r0 = X.AbstractC20100yh.A00(r0)
            boolean r1 = X.C20150ym.A07(r0)
            r0 = 1
            if (r1 != 0) goto L70
        L6f:
            r0 = 0
        L70:
            r7.A05 = r0
            if (r6 == 0) goto L93
            r0 = 36595578089703622(0x82037c006308c6, double:3.2065291702691607E-306)
            X.0tH r0 = X.AbstractC20100yh.A00(r0)
            long r0 = X.C20150ym.A01(r0)
        L81:
            r7.A01 = r0
            android.os.Handler r0 = r9.Aex()
            r7.A02 = r0
            if (r4 != 0) goto L90
            if (r3 != 0) goto L90
            if (r2 != 0) goto L90
            r5 = 0
        L90:
            r7.A09 = r5
            return
        L93:
            r0 = 30000(0x7530, double:1.4822E-319)
            goto L81
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.fixie.fixes.memory.leak.MemoryLeakFixer.<init>(X.11r, X.0Rw):void");
    }
}
