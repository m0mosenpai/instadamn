package com.facebook.analytics2.logger;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC58318PtA;
import X.AbstractC58319PtB;
import X.AbstractC61760RtF;
import X.AnonymousClass001;
import X.C04750Mt;
import X.C0K8;
import X.C0f9;
import X.C5GK;
import X.C63336Sho;
import X.C88643xQ;
import X.C906842g;
import X.MSW;
import X.Q1F;
import android.app.AlarmManager;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import com.facebook.common.gcmcompat.Task;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.GooglePlayServicesUtil;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes10.dex */
public class GooglePlayUploadService extends Q1F {
    public static boolean A01;
    public static final long A02;
    public static final long A03;
    public static final AtomicInteger A04;
    public C88643xQ A00;

    static {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        A02 = timeUnit.toMillis(2L);
        A03 = timeUnit.toMillis(5L);
        A04 = AbstractC58319PtB.A16();
    }

    @Override // X.Q1F, android.app.Service
    public final void onCreate() {
        int A042 = C0f9.A04(-1030730689);
        super.onCreate();
        this.A00 = C88643xQ.A00(this);
        C0f9.A0B(56126258, A042);
    }

    @Override // X.Q1F, android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        int onStartCommand;
        int i3;
        int A042 = C0f9.A04(906668551);
        try {
            if (intent != null) {
                String action = intent.getAction();
                if (action.startsWith("com.facebook.analytics2.logger.gms.TRY_SCHEDULE")) {
                    Bundle extras = intent.getExtras();
                    int i4 = extras.getInt("job_id", -1);
                    if (i4 != -1) {
                        Task task = (Task) extras.getParcelable("task");
                        if (task != null) {
                            int A05 = AbstractC58318PtA.A05(this, GoogleApiAvailability.A00);
                            if (A05 != 0) {
                                if (A04.incrementAndGet() == 3) {
                                    boolean z = GooglePlayServicesUtil.A00;
                                    C0K8.A0Q("GooglePlayUploadService", "Google Play Services became consistently unavailable after initial check: %s", ConnectionResult.A00(A05));
                                } else {
                                    boolean z2 = GooglePlayServicesUtil.A00;
                                    AlarmManager alarmManager = (AlarmManager) getSystemService("alarm");
                                    C04750Mt c04750Mt = new C04750Mt();
                                    Intent action2 = MSW.A08(this, GooglePlayUploadService.class).setAction(AnonymousClass001.A0O("com.facebook.analytics2.logger.gms.TRY_SCHEDULE-", i4));
                                    Bundle A0b = AbstractC166987dD.A0b();
                                    A0b.putInt("job_id", i4);
                                    A0b.putParcelable("task", task);
                                    action2.putExtras(A0b);
                                    c04750Mt.A0B(action2, getClassLoader());
                                    alarmManager.set(2, SystemClock.elapsedRealtime() + A03, c04750Mt.A03(this, 0, 134217728));
                                }
                            } else {
                                try {
                                    C63336Sho.A01(this).A03(task);
                                } catch (IllegalArgumentException e) {
                                    AbstractC61760RtF.A00(new ComponentName(this, task.A00), this, e);
                                }
                                A04.set(0);
                            }
                            C0f9.A0B(-477882720, A042);
                            return 2;
                        }
                        throw new Exception("Missing task");
                    }
                    StringBuilder A1C = AbstractC166987dD.A1C();
                    A1C.append("Invalid job_id: ");
                    throw new Exception(AbstractC166997dE.A0v(extras.get("job_id"), A1C));
                }
                if (action.startsWith("com.facebook")) {
                    onStartCommand = this.A00.A02(intent, new C5GK(this, i2));
                    i3 = 456369191;
                } else {
                    onStartCommand = super.onStartCommand(intent, i, i2);
                    i3 = -229868435;
                }
                C0f9.A0B(i3, A042);
                return onStartCommand;
            }
            Exception exc = new Exception("Received a null intent, did you ever return START_STICKY?");
            C0f9.A0B(-1634905976, A042);
            throw exc;
        } catch (C906842g e2) {
            C0K8.A0P("GooglePlayUploadService", "Unexpected service start parameters: %s", AbstractC58319PtB.A1Z(e2));
            stopSelf(i2);
            C0f9.A0B(-758250566, A042);
            return 2;
        }
    }
}
