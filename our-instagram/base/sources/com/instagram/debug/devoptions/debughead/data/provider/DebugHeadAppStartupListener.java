package com.instagram.debug.devoptions.debughead.data.provider;

import X.C00O;
import X.C14360o3;
import com.instagram.debug.devoptions.debughead.data.delegates.AppStartupDelegate;

/* loaded from: classes11.dex */
public final class DebugHeadAppStartupListener {
    public AppStartupDelegate delegate;

    public final void onEndStartup(long j, String str) {
        C14360o3.A0B(str, 1);
        getDelegate().onEndStartup(j, str);
    }

    public final void setAppStartupDelegate(AppStartupDelegate appStartupDelegate) {
        C14360o3.A0B(appStartupDelegate, 0);
        this.delegate = appStartupDelegate;
    }

    public final void setDelegate(AppStartupDelegate appStartupDelegate) {
        C14360o3.A0B(appStartupDelegate, 0);
        this.delegate = appStartupDelegate;
    }

    public final AppStartupDelegate getDelegate() {
        AppStartupDelegate appStartupDelegate = this.delegate;
        if (appStartupDelegate != null) {
            return appStartupDelegate;
        }
        C14360o3.A0F("delegate");
        throw C00O.createAndThrow();
    }
}
