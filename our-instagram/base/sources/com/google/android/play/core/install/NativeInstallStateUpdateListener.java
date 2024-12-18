package com.google.android.play.core.install;

import X.C2KN;

/* loaded from: classes10.dex */
public final class NativeInstallStateUpdateListener implements C2KN {
    @Override // X.C2KN
    public final /* bridge */ /* synthetic */ void DoW(Object obj) {
        onStateUpdate(null);
    }

    public native void onStateUpdate(InstallState installState);
}
