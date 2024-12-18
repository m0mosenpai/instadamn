package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Binder;
import android.os.IBinder;
import android.os.Process;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* renamed from: X.SkO, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class ServiceConnectionC63445SkO implements ServiceConnection {
    public boolean A00;
    public BinderC58704Q2h A01;
    public final Context A02;
    public final Intent A03;
    public final Queue A04;
    public final ScheduledExecutorService A05;

    public static final synchronized void A00(ServiceConnectionC63445SkO serviceConnectionC63445SkO) {
        Queue queue;
        synchronized (serviceConnectionC63445SkO) {
            android.util.Log.isLoggable("EnhancedIntentService", 3);
            while (true) {
                queue = serviceConnectionC63445SkO.A04;
                if (queue.isEmpty()) {
                    break;
                }
                android.util.Log.isLoggable("EnhancedIntentService", 3);
                BinderC58704Q2h binderC58704Q2h = serviceConnectionC63445SkO.A01;
                if (binderC58704Q2h == null || !binderC58704Q2h.isBinderAlive()) {
                    break;
                }
                android.util.Log.isLoggable("EnhancedIntentService", 3);
                SMK smk = (SMK) queue.poll();
                BinderC58704Q2h binderC58704Q2h2 = serviceConnectionC63445SkO.A01;
                if (Binder.getCallingUid() == Process.myUid()) {
                    android.util.Log.isLoggable("EnhancedIntentService", 3);
                    AbstractServiceC58445PvQ abstractServiceC58445PvQ = binderC58704Q2h2.A00;
                    if (abstractServiceC58445PvQ.A02(smk.A01)) {
                        smk.A00();
                    } else {
                        android.util.Log.isLoggable("EnhancedIntentService", 3);
                        abstractServiceC58445PvQ.A03.execute(new RunnableC64659TOq(smk, binderC58704Q2h2));
                    }
                } else {
                    throw new SecurityException("Binding only allowed within app");
                }
            }
            android.util.Log.isLoggable("EnhancedIntentService", 3);
            if (!serviceConnectionC63445SkO.A00) {
                serviceConnectionC63445SkO.A00 = true;
                try {
                } catch (SecurityException e) {
                    android.util.Log.e("EnhancedIntentService", "Exception while binding the service", e);
                }
                if (!C1341263x.A00().A03(serviceConnectionC63445SkO.A02, serviceConnectionC63445SkO.A03, serviceConnectionC63445SkO, 65)) {
                    android.util.Log.e("EnhancedIntentService", "binding to the service failed");
                    serviceConnectionC63445SkO.A00 = false;
                    while (!queue.isEmpty()) {
                        ((SMK) queue.poll()).A00();
                    }
                }
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        AbstractC58320PtC.A1L("EnhancedIntentService", componentName);
        this.A00 = false;
        if (!(iBinder instanceof BinderC58704Q2h)) {
            String valueOf = String.valueOf(iBinder);
            android.util.Log.e("EnhancedIntentService", MSZ.A0u("Invalid service connection: ", valueOf, AbstractC58318PtA.A0q(AbstractC58319PtB.A05(valueOf) + 28)));
            while (true) {
                Queue queue = this.A04;
                if (queue.isEmpty()) {
                    break;
                } else {
                    ((SMK) queue.poll()).A00();
                }
            }
        } else {
            this.A01 = (BinderC58704Q2h) iBinder;
            A00(this);
        }
    }

    public ServiceConnectionC63445SkO(Context context) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(0, new ThreadFactoryC58412Puq("Firebase-FirebaseInstanceIdServiceConnection"));
        this.A04 = new ArrayDeque();
        this.A00 = false;
        Context applicationContext = context.getApplicationContext();
        this.A02 = applicationContext;
        this.A03 = AbstractC58318PtA.A0E("com.google.firebase.MESSAGING_EVENT").setPackage(applicationContext.getPackageName());
        this.A05 = scheduledThreadPoolExecutor;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        AbstractC58320PtC.A1L("EnhancedIntentService", componentName);
        A00(this);
    }
}
