package com.instagram.direct.notifications.armadillo.service;

import X.AbstractC12290kX;
import X.AbstractC18680vv;
import X.AbstractC34770FTt;
import X.AbstractC43591JPw;
import X.AbstractC61628Rqs;
import X.C023409i;
import X.C04750Mt;
import X.C08770cf;
import X.C0f9;
import X.C54s;
import X.C60H;
import X.C6QM;
import X.C913045j;
import X.MSV;
import X.RunnableC64596TLh;
import X.XN9;
import android.app.Notification;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import com.facebook.R;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class IgSecureMessageOverWANotificationService extends Service {
    public String A00;
    public String A01;
    public boolean A02;
    public Handler A03;
    public final Runnable A04 = new RunnableC64596TLh(this);

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        int A04 = C0f9.A04(-23833446);
        this.A03 = new Handler(Looper.getMainLooper());
        C0f9.A0B(-1561726481, A04);
    }

    @Override // android.app.Service
    public final void onDestroy() {
        String str;
        int A04 = C0f9.A04(-1291933106);
        AbstractC18680vv A05 = C023409i.A0A.A05(this);
        C54s c54s = new C54s(C913045j.A00);
        if (this.A02) {
            str = AbstractC43591JPw.A00(482);
        } else {
            str = "offline_marker";
        }
        c54s.A0F("reason", str);
        C60H.A01(new C60H(A05), null, null, "ARMADILLO_NOTIFICATIONS_STOP_SERVICE", this.A00, this.A01, c54s.toString(), null);
        Handler handler = this.A03;
        if (handler != null) {
            handler.removeCallbacks(this.A04);
        }
        super.onDestroy();
        C6QM.A00(this);
        C0f9.A0B(-843460124, A04);
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        int A04 = C0f9.A04(-1721804121);
        if (intent != null) {
            C08770cf.A01.A01(this, intent);
            this.A00 = intent.getStringExtra("push_notif_id");
            this.A01 = intent.getStringExtra("wa_push_id");
        }
        Intent A00 = AbstractC34770FTt.A00(this, "all", MSV.A00(1125), null, 67174400);
        Context applicationContext = AbstractC12290kX.A00.getApplicationContext();
        C04750Mt c04750Mt = new C04750Mt();
        c04750Mt.A0A(A00);
        int i3 = 0;
        PendingIntent A01 = c04750Mt.A01(applicationContext, (int) System.currentTimeMillis(), 0);
        XN9 xn9 = new XN9(this, MSV.A00(474));
        xn9.A04(R.drawable.notification_icon);
        xn9.A0C(applicationContext.getResources().getString(2131964160));
        xn9.A0B(applicationContext.getResources().getString(2131964159));
        xn9.A05 = -1;
        xn9.A0g = true;
        xn9.A0A.when = 0L;
        xn9.A0E(true);
        if (A01 != null) {
            xn9.A0C = A01;
        }
        Notification A03 = xn9.A03();
        if (Build.VERSION.SDK_INT >= 29) {
            i3 = 1;
        }
        AbstractC61628Rqs.A00(A03, this, i3);
        Handler handler = this.A03;
        if (handler != null) {
            handler.postDelayed(this.A04, TimeUnit.SECONDS.toMillis(15L));
        }
        C0f9.A0B(-971243302, A04);
        return 2;
    }
}
