package com.instagram.direct.perf.navigation;

import X.AbstractC42021ws;
import X.C14360o3;
import X.C42201xA;
import X.C42221xC;

/* loaded from: classes3.dex */
public final class MPLTamSyncGroupStateNotifyOnCompletionCallback {
    public static final MPLTamSyncGroupStateNotifyOnCompletionCallback INSTANCE = new Object();
    public static final C42201xA isCompleted = AbstractC42021ws.A01(false);

    public static final C42221xC getIsCompleted() {
        return isCompleted;
    }

    public static final boolean getIsCompletedValue() {
        return C14360o3.A0K(isCompleted.A0W(), true);
    }

    public static final void success() {
        isCompleted.accept(true);
    }
}
