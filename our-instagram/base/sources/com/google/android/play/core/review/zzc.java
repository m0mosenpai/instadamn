package com.google.android.play.core.review;

import X.C58411Pup;
import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;

/* loaded from: classes10.dex */
public final class zzc extends ResultReceiver {
    public final /* synthetic */ C58411Pup A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzc(Handler handler, C58411Pup c58411Pup) {
        super(handler);
        this.A00 = c58411Pup;
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i, Bundle bundle) {
        this.A00.A00.A0G(null);
    }
}
