package X;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.IBinder;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.HashSet;

/* renamed from: X.0xx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractServiceC19690xx extends Service {
    public static final java.util.Set A01 = new HashSet();
    public AbstractC19560xi A00;

    public final synchronized AbstractC19560xi A00() {
        AbstractC19560xi abstractC19560xi;
        C0eQ.A00();
        abstractC19560xi = this.A00;
        if (abstractC19560xi == null) {
            C0BJ.A00("AsyncService.getDelegateInstance()");
            try {
                try {
                    try {
                        try {
                            Object newInstance = Class.forName(A01()).getDeclaredConstructor(AbstractServiceC19690xx.class).newInstance(this);
                            C14360o3.A0C(newInstance, "null cannot be cast to non-null type com.facebook.startup.services.AsyncServiceDelegate");
                            abstractC19560xi = (AbstractC19560xi) newInstance;
                            C0BI.A00();
                            this.A00 = abstractC19560xi;
                        } catch (InvocationTargetException e) {
                            Throwable cause = e.getCause();
                            if (cause == null) {
                                cause = e;
                            }
                            if (cause instanceof RuntimeException) {
                                throw ((RuntimeException) cause);
                            }
                            throw new RuntimeException(cause);
                        }
                    } catch (ClassNotFoundException e2) {
                        throw new IllegalArgumentException(e2);
                    } catch (IllegalAccessException e3) {
                        throw new IllegalArgumentException(e3);
                    }
                } catch (InstantiationException e4) {
                    throw new IllegalArgumentException(e4);
                } catch (NoSuchMethodException e5) {
                    throw new IllegalArgumentException(e5);
                }
            } catch (Throwable th) {
                C0BI.A00();
                throw th;
            }
        }
        C14360o3.A0A(abstractC19560xi);
        abstractC19560xi.A08();
        return abstractC19560xi;
    }

    public abstract String A01();

    @Override // android.app.Service, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        C14360o3.A0B(context, 0);
        C0BJ.A00("AsyncService.attachBaseContext()");
        super.attachBaseContext(context);
        A00();
        C0BI.A00();
    }

    @Override // android.app.Service
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        C14360o3.A0B(fileDescriptor, 0);
        C14360o3.A0B(printWriter, 1);
        C14360o3.A0B(strArr, 2);
        C0BJ.A00("AsyncService.dump()");
        A00().A0A(fileDescriptor, printWriter, strArr);
        C0BI.A00();
    }

    @Override // android.app.Service, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        C14360o3.A0B(configuration, 0);
        C0BJ.A00("AsyncService.onConfigurationChanged()");
        super.onConfigurationChanged(configuration);
        C0BI.A00();
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        C0BJ.A00("AsyncService.onBind()");
        IBinder A0B = A00().A0B(intent);
        C0BI.A00();
        return A0B;
    }

    @Override // android.app.Service, android.content.ComponentCallbacks
    public final void onLowMemory() {
        C0BJ.A00("AsyncService.onLowMemory()");
        super.onLowMemory();
        C0BI.A00();
    }

    @Override // android.app.Service
    public final void onStart(Intent intent, int i) {
        C0BJ.A00("AsyncService.onStart()");
        A00().A09(intent, i);
        C0BI.A00();
    }

    @Override // android.app.Service
    public final void onTaskRemoved(Intent intent) {
        C0BJ.A00("AsyncService.onTaskRemoved()");
        super.onTaskRemoved(intent);
        C0BI.A00();
    }

    @Override // android.app.Service, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        C0BJ.A00("AsyncService.onTrimMemory()");
        super.onTrimMemory(i);
        C0BI.A00();
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        C0BJ.A00("AsyncService.onUnbind()");
        boolean A0E = A00().A0E(intent);
        C0BI.A00();
        return A0E;
    }

    public AbstractServiceC19690xx() {
        C14360o3.A07(getClass().getName());
    }

    public final void A02() {
        super.onCreate();
    }

    public final void A03() {
        super.onDestroy();
    }

    public final void A04() {
        super.stopSelf();
    }

    public final boolean A08(Intent intent) {
        return super.onUnbind(intent);
    }

    @Override // android.app.Service
    public final void onCreate() {
        int A04 = C0f9.A04(340973479);
        C0BJ.A00("AsyncService.onCreate()");
        A00().A0C();
        C0BI.A00();
        C0f9.A0B(697421735, A04);
    }

    @Override // android.app.Service
    public final void onDestroy() {
        int A04 = C0f9.A04(1471674110);
        C0BJ.A00("AsyncService.onDestroy()");
        A00().A0F();
        C0BI.A00();
        C0f9.A0B(-1025078543, A04);
    }

    @Override // android.app.Service
    public final void onRebind(Intent intent) {
        int A04 = C0f9.A04(151367287);
        C0BJ.A00("AsyncService.onRebind()");
        A00().A0D(intent);
        C0BI.A00();
        C0f9.A0B(-246986482, A04);
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        int A04 = C0f9.A04(957196320);
        if (intent != null) {
            C08770cf.A01.A01(this, intent);
        }
        C0BJ.A00("AsyncService.onStartCommand()");
        int A07 = A00().A07(intent, i, i2);
        C0BI.A00();
        C0f9.A0B(-502040724, A04);
        return A07;
    }

    public final void A05(Intent intent) {
        super.onRebind(intent);
    }

    public final void A06(Intent intent, int i) {
        super.onStart(intent, i);
    }

    public final void A07(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(fileDescriptor, printWriter, strArr);
    }
}
