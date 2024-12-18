package com.facebook.analytics2.logger.legacy.uploader;

import X.AbstractC05810Sj;
import X.C08770cf;
import X.C0f9;
import X.C5GK;
import X.C88643xQ;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class AlarmBasedUploadService extends Service {
    public C88643xQ A00;

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    static {
        TimeUnit.MINUTES.toMillis(5L);
        TimeUnit.HOURS.toMillis(6L);
    }

    @Override // android.app.Service
    public final void onCreate() {
        int A04 = C0f9.A04(-267131111);
        this.A00 = C88643xQ.A00(this);
        C0f9.A0B(-108753737, A04);
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        int A04 = C0f9.A04(1734182304);
        if (intent != null) {
            C08770cf.A01.A01(this, intent);
            if (intent.getAction().startsWith("com.facebook.analytics2.logger.UPLOAD_NOW")) {
                intent.setAction("com.facebook.analytics2.logger.UPLOAD_NOW");
            }
        }
        C88643xQ c88643xQ = this.A00;
        AbstractC05810Sj.A00(c88643xQ);
        int A02 = c88643xQ.A02(intent, new C5GK(this, i2));
        C0f9.A0B(972277338, A04);
        return A02;
    }
}
