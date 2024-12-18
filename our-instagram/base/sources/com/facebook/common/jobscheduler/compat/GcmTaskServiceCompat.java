package com.facebook.common.jobscheduler.compat;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC31174DnI;
import X.AbstractC58318PtA;
import X.AbstractC61760RtF;
import X.AnonymousClass001;
import X.C04750Mt;
import X.C0K8;
import X.C0f9;
import X.C61816RuA;
import X.C63336Sho;
import X.MSW;
import X.Q1F;
import X.QFc;
import X.RjC;
import android.app.AlarmManager;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import com.facebook.common.gcmcompat.Task;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.instagram.notifications.push.fcm.GetFCMTokenAndRegisterWithServerGCMService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes10.dex */
public abstract class GcmTaskServiceCompat extends Q1F {
    public static GoogleApiAvailability A00;
    public static final long A01;
    public static final long A02;

    static {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        A02 = timeUnit.toMillis(5L);
        A01 = timeUnit.toMillis(2L);
        A00 = GoogleApiAvailability.A00;
    }

    @Override // X.Q1F, android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int A04 = C0f9.A04(2000333845);
        try {
        } catch (RjC e) {
            C0K8.A0F("GcmTaskServiceCompat", "Unexpected service start parameters", e);
            C0f9.A0B(-647072025, A04);
            return 2;
        }
        if (intent != null) {
            String action = intent.getAction();
            if (action != null) {
                if (action.startsWith("com.facebook.common.jobscheduler.compat.GcmTaskServiceCompat.gms.TRY_SCHEDULE-")) {
                    Bundle extras = intent.getExtras();
                    if (extras.getString("job_tag", null) != null) {
                        Task task = (Task) extras.getParcelable("task");
                        if (task != null) {
                            int i6 = extras.getInt("num_failures", -1);
                            if (i6 > 0) {
                                int A05 = AbstractC58318PtA.A05(this, A00);
                                if (A05 != 0) {
                                    if (i6 >= 3) {
                                        String str = task.A01;
                                        boolean z = GooglePlayServicesUtil.A00;
                                        C0K8.A0Q("GcmTaskServiceCompat", "Job %s was not scheduled because Google Play Services became consistentlyunavailable after initial check: %s", str, ConnectionResult.A00(A05));
                                    } else {
                                        boolean z2 = GooglePlayServicesUtil.A00;
                                        int i7 = i6 + 1;
                                        try {
                                            String str2 = task.A01;
                                            Intent intent2 = MSW.A08(this, Class.forName(task.A00)).setAction(AnonymousClass001.A0R("com.facebook.common.jobscheduler.compat.GcmTaskServiceCompat.gms.TRY_SCHEDULE-", str2)).setPackage(getPackageName());
                                            Bundle A0F = AbstractC31174DnI.A0F("job_tag", str2);
                                            A0F.putParcelable("task", task);
                                            A0F.putInt("num_failures", i7);
                                            intent2.putExtras(A0F);
                                            long elapsedRealtime = SystemClock.elapsedRealtime() + A02;
                                            AlarmManager alarmManager = (AlarmManager) getSystemService("alarm");
                                            C04750Mt c04750Mt = new C04750Mt();
                                            c04750Mt.A0A(intent2);
                                            c04750Mt.A08();
                                            alarmManager.set(2, elapsedRealtime, c04750Mt.A03(this, 0, 134217728));
                                        } catch (ClassNotFoundException e2) {
                                            throw AbstractC58318PtA.A0f(e2);
                                        }
                                    }
                                    i5 = 1283764449;
                                } else {
                                    try {
                                        C63336Sho.A01(this).A03(task);
                                    } catch (IllegalArgumentException e3) {
                                        AbstractC61760RtF.A00(new ComponentName(this, task.A00), this, e3);
                                    }
                                    i5 = 1283764449;
                                }
                                C0K8.A0F("GcmTaskServiceCompat", "Unexpected service start parameters", e);
                                C0f9.A0B(-647072025, A04);
                                return 2;
                            }
                            throw new Exception(AnonymousClass001.A0O("invalid num_failures: ", i6));
                        }
                        throw new Exception("Missing task");
                    }
                    StringBuilder A1C = AbstractC166987dD.A1C();
                    A1C.append("Invalid job_tag: ");
                    throw new Exception(AbstractC166997dE.A0v(extras.get("job_tag"), A1C));
                }
                if (action.startsWith("com.google")) {
                    i3 = super.onStartCommand(intent, i, i2);
                    i4 = 609333806;
                } else {
                    if (this instanceof GetFCMTokenAndRegisterWithServerGCMService) {
                        new Object();
                    } else {
                        C61816RuA c61816RuA = QFc.A02;
                    }
                    i3 = 2;
                    i4 = -1133190647;
                }
                C0f9.A0B(i4, A04);
                return i3;
            }
            i5 = 852979966;
            C0f9.A0B(i5, A04);
            return 2;
        }
        Exception exc = new Exception("Received a null intent, did you ever return START_STICKY?");
        C0f9.A0B(-1344329694, A04);
        throw exc;
    }
}
