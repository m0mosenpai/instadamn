package com.facebook.video.heroplayer.service;

import X.C08770cf;
import X.C0f9;
import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;

/* loaded from: classes2.dex */
public final class HeroKeepAliveService extends Service {
    public final Binder A00 = new Binder();

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        int A04 = C0f9.A04(87171365);
        if (intent != null) {
            C08770cf.A01.A01(this, intent);
        }
        int onStartCommand = super.onStartCommand(intent, i, i2);
        C0f9.A0B(-1415623181, A04);
        return onStartCommand;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.A00;
    }
}
