package com.instagram.util.startup.tracking;

import X.AbstractC12960li;
import X.AbstractC23641Du;
import X.C006802i;
import X.C08770cf;
import X.C0YR;
import X.C0f9;
import X.C14360o3;
import X.C17280tP;
import X.C19L;
import X.C1CC;
import X.C1KW;
import X.C226218q;
import X.C226418s;
import X.C25131Kr;
import X.C50108MAe;
import X.C5J5;
import X.C6QM;
import X.InterfaceC16530ry;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.facebook.common.time.AwakeTimeSinceBootClock;

/* loaded from: classes2.dex */
public final class TaskLifeDetectingService extends Service {
    public static boolean A01;
    public static boolean A02;
    public boolean A00;

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final void onTaskRemoved(Intent intent) {
        if (this.A00) {
            C226418s A012 = C226218q.A01(AbstractC12960li.A00);
            C1CC.A03();
            if (A012.A05 != null) {
                A012.A0R(A012.A02, "APP_TERMINATED", "killed_by_task_removal");
                A012.A0M(A012.A02, C226418s.A0Q, null);
            }
            C1KW c1kw = A012.A06;
            if (c1kw != null) {
                C1KW.A00(c1kw);
            }
            int i = C25131Kr.A00;
            long now = AwakeTimeSinceBootClock.INSTANCE.now();
            long currentTimeMillis = System.currentTimeMillis();
            if (C25131Kr.A01()) {
                AbstractC23641Du.A05(C25131Kr.A0A.AOT(1291882252, 3), new C50108MAe(null, 1, now, currentTimeMillis), (C19L) C25131Kr.A0D.getValue());
            } else {
                C17280tP A013 = C17280tP.A4E.A01(this);
                InterfaceC16530ry interfaceC16530ry = A013.A21;
                C0YR[] c0yrArr = C17280tP.A4G;
                interfaceC16530ry.Egi(A013, Long.valueOf(now), c0yrArr[68]);
                A013.A22.Egi(A013, Long.valueOf(currentTimeMillis), c0yrArr[69]);
            }
            C5J5 c5j5 = C25131Kr.A05;
            if (c5j5 != null && c5j5.A03) {
                C006802i c006802i = c5j5.A08;
                c006802i.markerPoint(817897470, "app_terminated");
                c006802i.markerAnnotate(817897470, "app_terminated_on_same_module", C14360o3.A0K(c5j5.A0B, c5j5.A01));
                c5j5.A09.run();
            }
            C25131Kr.A08 = true;
            if (!A01) {
                stopSelf();
            }
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        int A04 = C0f9.A04(927670871);
        super.onDestroy();
        C6QM.A00(this);
        if (C25131Kr.A07 && !C25131Kr.A08) {
            Context applicationContext = getApplicationContext();
            try {
                applicationContext.startService(new Intent(applicationContext, getClass()));
            } catch (Exception unused) {
            }
        } else {
            C25131Kr.A09 = true;
        }
        C0f9.A0B(834886698, A04);
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        int A04 = C0f9.A04(374556871);
        if (intent != null) {
            C08770cf.A01.A01(this, intent);
        }
        int i3 = 1;
        this.A00 = true;
        C25131Kr.A09 = false;
        C25131Kr.A06 = getClass();
        if (!A02) {
            i3 = 2;
        }
        C0f9.A0B(420134160, A04);
        return i3;
    }
}
