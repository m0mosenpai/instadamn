package com.google.android.gms.analytics;

import X.AbstractC43592JPx;
import X.AbstractC63371Sic;
import X.C08770cf;
import X.C0f9;
import X.C60687RMf;
import X.C63335Shm;
import X.InterfaceC65413Tjk;
import X.SYW;
import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;

/* loaded from: classes10.dex */
public final class AnalyticsService extends Service implements InterfaceC65413Tjk {
    public SYW A00;

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        if (this.A00 == null) {
            this.A00 = new SYW(this);
            return null;
        }
        return null;
    }

    @Override // X.InterfaceC65413Tjk
    public final void FFe(JobParameters jobParameters, boolean z) {
        throw AbstractC43592JPx.A11();
    }

    @Override // android.app.Service
    public final void onCreate() {
        int A04 = C0f9.A04(290715201);
        super.onCreate();
        SYW syw = this.A00;
        if (syw == null) {
            syw = new SYW(this);
            this.A00 = syw;
        }
        C60687RMf c60687RMf = C63335Shm.A01(syw.A00).A0C;
        C63335Shm.A02(c60687RMf);
        AbstractC63371Sic.A09(c60687RMf, "Local AnalyticsService is starting up", 2);
        C0f9.A0B(1563828197, A04);
    }

    @Override // android.app.Service
    public final void onDestroy() {
        int A04 = C0f9.A04(-657970395);
        SYW syw = this.A00;
        if (syw == null) {
            syw = new SYW(this);
            this.A00 = syw;
        }
        C60687RMf c60687RMf = C63335Shm.A01(syw.A00).A0C;
        C63335Shm.A02(c60687RMf);
        AbstractC63371Sic.A09(c60687RMf, "Local AnalyticsService is shutting down", 2);
        super.onDestroy();
        C0f9.A0B(1303338529, A04);
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        int A04 = C0f9.A04(-279201795);
        if (intent != null) {
            C08770cf.A01.A01(this, intent);
        }
        SYW syw = this.A00;
        if (syw == null) {
            syw = new SYW(this);
            this.A00 = syw;
        }
        int A01 = syw.A01(intent, i2);
        C0f9.A0B(168731270, A04);
        return A01;
    }
}
