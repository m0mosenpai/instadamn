package X;

import X.C26981Su;
import android.app.Activity;
import android.app.ActivityThread;
import android.app.Application;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.TransactionTooLargeException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1Su, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C26981Su extends C0R8 implements InterfaceC03430Gv {
    public WeakReference A00;
    public WeakReference A01;
    public final Application.ActivityLifecycleCallbacks A02;
    public final boolean A03;

    @Override // X.InterfaceC05710Rv
    public final String getName() {
        return "TransactionTooLargeDebugger";
    }

    @Override // X.InterfaceC05710Rv
    public final void CNZ() {
        if (this.A03) {
            ActivityThread.currentActivityThread().getApplication().registerActivityLifecycleCallbacks(this.A02);
            C03400Gs.A03(this, 100);
            A08();
        }
    }

    @Override // X.InterfaceC03430Gv
    public final int handleUncaughtException(Thread thread, Throwable th, C0Gl c0Gl) {
        if ((th instanceof RuntimeException) && th.getCause() != null) {
            Throwable cause = th.getCause();
            Bundle bundle = (Bundle) this.A01.get();
            Object obj = this.A00.get();
            if ((cause instanceof TransactionTooLargeException) && obj != null && bundle != null) {
                for (StackTraceElement stackTraceElement : cause.getStackTrace()) {
                    if (stackTraceElement.getMethodName().endsWith("activityStopped")) {
                        long A00 = A00(bundle);
                        C63275SgZ c63275SgZ = new C63275SgZ(this);
                        JSONObject A002 = C63275SgZ.A00(c63275SgZ, bundle, new LinkedList(), A00(bundle));
                        c63275SgZ.A02 = A002;
                        try {
                            AbstractC47832Hr.A00(A002, "Call parse() before getting result");
                            A002.put("v", "v1.6.0");
                            A002.put("blame_activity", obj.getClass().getName());
                            C0L6.A05(C0LK.A9v, A002.toString());
                        } catch (JSONException e) {
                            A0C(e);
                        }
                        if (A00 > 512000) {
                            List list = c63275SgZ.A01;
                            if (list == null) {
                                list = new ArrayList(0);
                            }
                            TransactionTooLargeException transactionTooLargeException = new TransactionTooLargeException(AnonymousClass001.A0e("bundle size ", " bytes.", A00(bundle)));
                            ArrayList arrayList = new ArrayList(list.size() + 1);
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                arrayList.add(new StackTraceElement((String) it.next(), "onSaveInstanceState", null, -1));
                            }
                            Class<?> cls = obj.getClass();
                            arrayList.add(new StackTraceElement(cls.getName(), "onSaveInstanceState", AnonymousClass001.A0R(cls.getSimpleName(), ".java"), -1));
                            transactionTooLargeException.setStackTrace((StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]));
                            cause.initCause(transactionTooLargeException);
                            return 0;
                        }
                        return 0;
                    }
                }
                return 0;
            }
            return 0;
        }
        return 0;
    }

    public C26981Su(C0Rw c0Rw) {
        super(c0Rw);
        this.A01 = new WeakReference(null);
        this.A00 = new WeakReference(null);
        this.A02 = new Application.ActivityLifecycleCallbacks() { // from class: com.facebook.fixie.fixes.common.TransactionTooLargeDebugger$1
            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityCreated(Activity activity, Bundle bundle) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityDestroyed(Activity activity) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityPaused(Activity activity) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityResumed(Activity activity) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityStarted(Activity activity) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityStopped(Activity activity) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityPostSaveInstanceState(Activity activity, Bundle bundle) {
                C26981Su c26981Su = C26981Su.this;
                c26981Su.A01 = new WeakReference(bundle);
                c26981Su.A00 = new WeakReference(activity);
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                C26981Su c26981Su = C26981Su.this;
                c26981Su.A01 = new WeakReference(bundle);
                c26981Su.A00 = new WeakReference(activity);
            }
        };
        this.A03 = A05(C10420hA.class) != null;
    }

    public static long A00(Parcelable parcelable) {
        Parcel obtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(obtain, 0);
            return obtain.dataSize();
        } finally {
            obtain.recycle();
        }
    }
}
