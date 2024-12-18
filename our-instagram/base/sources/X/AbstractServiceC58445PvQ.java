package X;

import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: X.PvQ, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractServiceC58445PvQ extends Service {
    public int A00;
    public int A01;
    public Binder A02;
    public final ExecutorService A03;
    public final Object A04;

    public abstract void A01(Intent intent);

    @Override // android.app.Service
    public final synchronized IBinder onBind(Intent intent) {
        Binder binder;
        android.util.Log.isLoggable("EnhancedIntentService", 3);
        binder = this.A02;
        if (binder == null) {
            binder = new BinderC58704Q2h(this);
            this.A02 = binder;
        }
        return binder;
    }

    public static final void A00(Intent intent, AbstractServiceC58445PvQ abstractServiceC58445PvQ) {
        if (intent != null) {
            PvO.A01(intent);
        }
        synchronized (abstractServiceC58445PvQ.A04) {
            int i = abstractServiceC58445PvQ.A01 - 1;
            abstractServiceC58445PvQ.A01 = i;
            if (i == 0) {
                abstractServiceC58445PvQ.stopSelfResult(abstractServiceC58445PvQ.A00);
            }
        }
    }

    public AbstractServiceC58445PvQ() {
        String valueOf = String.valueOf(AbstractC31173DnH.A0q(this));
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC58412Puq(AbstractC58320PtC.A0w(valueOf.length(), "Firebase-", valueOf)));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.A03 = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.A04 = AbstractC58318PtA.A0b();
        this.A01 = 0;
    }

    public final boolean A02(Intent intent) {
        if ("com.google.firebase.messaging.NOTIFICATION_OPEN".equals(intent.getAction())) {
            PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra("pending_intent");
            if (pendingIntent != null) {
                try {
                    pendingIntent.send();
                } catch (PendingIntent.CanceledException unused) {
                    android.util.Log.e("FirebaseMessaging", "Notification pending intent canceled");
                }
            }
            if (AbstractC58447PvV.A01(intent)) {
                if (RealtimeSubscription.GRAPHQL_MQTT_VERSION.equals(intent.getStringExtra("google.c.a.tc"))) {
                    C63342Shx A00 = C63342Shx.A00();
                    C63342Shx.A01(A00);
                    A00.A02.A03(InterfaceC65282ThF.class);
                    android.util.Log.isLoggable("FirebaseMessaging", 3);
                    android.util.Log.w("FirebaseMessaging", "Unable to set user property for conversion tracking:  analytics library is missing");
                } else {
                    android.util.Log.isLoggable("FirebaseMessaging", 3);
                }
                AbstractC58447PvV.A00(intent, "_no");
                return true;
            }
            return true;
        }
        return false;
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        int i3;
        int A04 = C0f9.A04(1517681828);
        if (intent != null) {
            C08770cf.A01.A01(this, intent);
        }
        synchronized (this.A04) {
            try {
                this.A00 = i2;
                this.A01++;
            } catch (Throwable th) {
                C0f9.A0B(1602681485, A04);
                throw th;
            }
        }
        Intent intent2 = (Intent) C58433PvC.A00().A03.poll();
        int i4 = 2;
        if (intent2 == null) {
            A00(intent, this);
            i3 = 1320837126;
        } else if (A02(intent2)) {
            A00(intent, this);
            i3 = -2060694170;
        } else {
            this.A03.execute(new TQA(intent2, intent, this));
            i4 = 3;
            i3 = 91601060;
        }
        C0f9.A0B(i3, A04);
        return i4;
    }
}
