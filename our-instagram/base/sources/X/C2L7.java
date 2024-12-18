package X;

import android.content.Context;
import androidx.work.WorkerParameters;

/* renamed from: X.2L7, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C2L7 {
    public static final String A00 = C48442Kl.A01("WorkerFactory");

    public final AbstractC48352Kc A00(Context appContext, WorkerParameters workerClassName, String workerParameters) {
        String str;
        StringBuilder sb;
        String str2;
        AbstractC48352Kc abstractC48352Kc = null;
        try {
            Class<? extends U> asSubclass = Class.forName(workerParameters).asSubclass(AbstractC48352Kc.class);
            if (asSubclass != 0) {
                try {
                    AbstractC48352Kc abstractC48352Kc2 = (AbstractC48352Kc) asSubclass.getDeclaredConstructor(Context.class, WorkerParameters.class).newInstance(appContext, workerClassName);
                    abstractC48352Kc = abstractC48352Kc2;
                    if (abstractC48352Kc2 != null && abstractC48352Kc2.mUsed) {
                        throw new IllegalStateException(AnonymousClass001.A11("WorkerFactory (", getClass().getName(), ") returned an instance of a ListenableWorker (", workerParameters, ") which has already been invoked. createWorker() must always return a new instance of a ListenableWorker."));
                    }
                } catch (Throwable th) {
                    th = th;
                    C48442Kl.A00();
                    str = A00;
                    sb = new StringBuilder();
                    str2 = "Could not instantiate ";
                    sb.append(str2);
                    sb.append(workerParameters);
                    android.util.Log.e(str, sb.toString(), th);
                    return abstractC48352Kc;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            C48442Kl.A00();
            str = A00;
            sb = new StringBuilder();
            str2 = "Invalid class: ";
        }
        return abstractC48352Kc;
    }
}
