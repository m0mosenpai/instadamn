package X;

import X.C103744ls;
import X.RunnableC58462Pvn;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.facebook.location.appstate.GeoApiLocationAppStateListener$LifecycleCallback;
import java.lang.ref.Reference;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: X.4ls, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C103744ls {
    public static C103744ls A04;
    public ScheduledExecutorService A00;
    public final Application A01;
    public final GeoApiLocationAppStateListener$LifecycleCallback A02 = new Application.ActivityLifecycleCallbacks() { // from class: com.facebook.location.appstate.GeoApiLocationAppStateListener$LifecycleCallback
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(Activity activity) {
            C103744ls c103744ls = C103744ls.this;
            if (!c103744ls.A03.isEmpty()) {
                c103744ls.A00.schedule(new RunnableC58462Pvn(c103744ls), 250L, TimeUnit.MILLISECONDS);
            }
        }
    };
    public final CopyOnWriteArrayList A03 = new CopyOnWriteArrayList();

    public static Integer A00(C103744ls c103744ls) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        Application application = c103744ls.A01;
        ActivityManager activityManager = (ActivityManager) application.getSystemService("activity");
        if (activityManager != null && (runningAppProcesses = activityManager.getRunningAppProcesses()) != null) {
            String packageName = application.getPackageName();
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (packageName.equals(runningAppProcessInfo.processName)) {
                    int i = runningAppProcessInfo.importance;
                    if (i == 100) {
                        return C05F.A00;
                    }
                    if (i == 125) {
                        return C05F.A01;
                    }
                }
            }
        }
        return C05F.A0C;
    }

    public final void A01(AbstractC128665rZ abstractC128665rZ) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.A03;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            Reference reference = (Reference) it.next();
            Object obj = reference.get();
            if (obj == abstractC128665rZ || obj == null) {
                copyOnWriteArrayList.remove(reference);
            }
        }
        synchronized (this) {
            if (copyOnWriteArrayList.isEmpty()) {
                this.A01.unregisterActivityLifecycleCallbacks(this.A02);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.facebook.location.appstate.GeoApiLocationAppStateListener$LifecycleCallback] */
    public C103744ls(Context context) {
        this.A01 = (Application) context.getApplicationContext();
    }
}
