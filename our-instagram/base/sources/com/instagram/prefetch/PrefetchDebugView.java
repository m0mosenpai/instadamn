package com.instagram.prefetch;

import X.InterfaceC42421xW;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;

/* loaded from: classes12.dex */
public class PrefetchDebugView {
    public Context A00;
    public InterfaceC42421xW A01;
    public final Application.ActivityLifecycleCallbacks A02 = new Application.ActivityLifecycleCallbacks() { // from class: com.instagram.prefetch.PrefetchDebugView.1
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(Activity activity) {
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
        public final void onActivityPaused(Activity activity) {
            InterfaceC42421xW interfaceC42421xW = PrefetchDebugView.this.A01;
            if (interfaceC42421xW != null) {
                interfaceC42421xW.F9k();
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(Activity activity) {
            PrefetchDebugView.this.A01.F9k();
        }
    };

    public PrefetchDebugView(Context context, InterfaceC42421xW interfaceC42421xW) {
        this.A00 = context;
        this.A01 = interfaceC42421xW;
        interfaceC42421xW.F9k();
    }
}
