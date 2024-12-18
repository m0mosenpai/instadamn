package X;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.HashSet;

/* renamed from: X.0yJ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractJobServiceC19890yJ extends JobService {
    public static final java.util.Set A01 = new HashSet();
    public AbstractC19880yI A00;

    public final synchronized AbstractC19880yI A00() {
        AbstractC19880yI abstractC19880yI;
        C0eQ.A00();
        synchronized (this) {
            try {
                abstractC19880yI = this.A00;
                if (abstractC19880yI == null) {
                    C0BJ.A00("AsyncJobService.getDelegateInstance()");
                    try {
                        try {
                            Object newInstance = Class.forName("com.facebook.analytics2.logger.legacy.uploader.LollipopUploadServiceDelegate").getDeclaredConstructor(AbstractJobServiceC19890yJ.class).newInstance(this);
                            C14360o3.A0C(newInstance, "null cannot be cast to non-null type com.facebook.startup.services.AsyncJobServiceDelegate");
                            abstractC19880yI = (AbstractC19880yI) newInstance;
                            C0BI.A00();
                            this.A00 = abstractC19880yI;
                        } catch (Exception e) {
                            if (e instanceof InvocationTargetException) {
                                Throwable cause = ((InvocationTargetException) e).getCause();
                                if (cause == null) {
                                    cause = e;
                                }
                                if (!(cause instanceof RuntimeException)) {
                                    throw new RuntimeException(cause);
                                }
                                throw cause;
                            }
                            if ((e instanceof ClassNotFoundException) || (e instanceof InstantiationException) || (e instanceof NoSuchMethodException) || (e instanceof IllegalAccessException)) {
                                throw new IllegalArgumentException(e);
                            }
                            throw new RuntimeException(e);
                        }
                    } catch (Throwable th) {
                        C0BI.A00();
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return abstractC19880yI;
        AbstractC05810Sj.A00(abstractC19880yI);
        synchronized (abstractC19880yI) {
            try {
                if (!abstractC19880yI.A00) {
                    abstractC19880yI.A00 = true;
                    super.onCreate();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return abstractC19880yI;
    }

    @Override // android.app.Service, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        C14360o3.A0B(context, 0);
        C0BJ.A00("AsyncJobService.attachBaseContext()");
        super.attachBaseContext(context);
        A00();
        C0BI.A00();
    }

    @Override // android.app.Service
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        C14360o3.A0B(fileDescriptor, 0);
        C14360o3.A0B(printWriter, 1);
        C14360o3.A0B(strArr, 2);
        C0BJ.A00("AsyncJobService.dump()");
        super.dump(fileDescriptor, printWriter, strArr);
        C0BI.A00();
    }

    @Override // android.app.Service, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        C14360o3.A0B(configuration, 0);
        C0BJ.A00("AsyncJobService.onConfigurationChanged()");
        super.onConfigurationChanged(configuration);
        C0BI.A00();
    }

    @Override // android.app.Service, android.content.ComponentCallbacks
    public final void onLowMemory() {
        C0BJ.A00("AsyncJobService.onLowMemory()");
        super.onLowMemory();
        C0BI.A00();
    }

    @Override // android.app.Service
    public final void onStart(Intent intent, int i) {
        C0BJ.A00("AsyncJobService.onStart()");
        super.onStart(intent, i);
        C0BI.A00();
    }

    @Override // android.app.Service
    public final void onTaskRemoved(Intent intent) {
        C0BJ.A00("AsyncJobService.onTaskRemoved()");
        super.onTaskRemoved(intent);
        C0BI.A00();
    }

    @Override // android.app.Service, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        C0BJ.A00("AsyncJobService.onTrimMemory()");
        super.onTrimMemory(i);
        C0BI.A00();
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        C0BJ.A00("AsyncJobService.onUnbind()");
        boolean onUnbind = super.onUnbind(intent);
        C0BI.A00();
        return onUnbind;
    }

    public AbstractJobServiceC19890yJ() {
        C14360o3.A07(getClass().getName());
    }

    public final void A01() {
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onCreate() {
        int A04 = C0f9.A04(1480644006);
        C0BJ.A00("AsyncJobService.onCreate()");
        A00().A02();
        C0BI.A00();
        C0f9.A0B(-682206136, A04);
    }

    @Override // android.app.Service
    public final void onDestroy() {
        int A04 = C0f9.A04(1239182287);
        C0BJ.A00("AsyncJobService.onDestroy()");
        A00().A01();
        C0BI.A00();
        C0f9.A0B(-1839215291, A04);
    }

    @Override // android.app.Service
    public final void onRebind(Intent intent) {
        int A04 = C0f9.A04(1571256607);
        C0BJ.A00("AsyncJobService.onRebind()");
        super.onRebind(intent);
        C0BI.A00();
        C0f9.A0B(1803412913, A04);
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        int A04 = C0f9.A04(-685649291);
        C0BJ.A00("AsyncJobService.onStartCommand()");
        int A00 = A00().A00(intent, i, i2);
        C0BI.A00();
        C0f9.A0B(368094462, A04);
        return A00;
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        C0fN.A00(jobParameters, this);
        C14360o3.A0B(jobParameters, 0);
        C0BJ.A00("AsyncJobService.onStartJob()");
        boolean A03 = A00().A03(jobParameters);
        C0BI.A00();
        return A03;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        C0fN.A01(jobParameters, this);
        C14360o3.A0B(jobParameters, 0);
        C0BJ.A00("AsyncJobService.onStopJob()");
        A00().A04(jobParameters);
        C0BI.A00();
        return true;
    }
}
