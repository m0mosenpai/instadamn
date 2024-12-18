package com.facebook.video.heroplayer.client;

import android.os.Bundle;
import android.os.ResultReceiver;

/* loaded from: classes3.dex */
public class HeroClientResultReceiver extends ResultReceiver {
    public Runnable A00;

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i, Bundle bundle) {
        Runnable runnable = this.A00;
        if (runnable != null) {
            runnable.run();
        }
        this.A00 = null;
    }
}
