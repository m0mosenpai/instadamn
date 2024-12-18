package com.android.webview.chromium.membrane;

/* loaded from: classes10.dex */
public interface AppHostedWebViewFactoryProvider {
    boolean hasActiveChildConnections();

    boolean hasSpareChildConnection(boolean z);

    boolean hasStarted();

    void initChildProcessRequirements(Runnable runnable);
}
