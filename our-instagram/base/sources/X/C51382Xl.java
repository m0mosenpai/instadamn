package X;

import android.app.Activity;
import android.app.Application;
import android.app.Service;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import com.facebook.rendercore.MountContentPools$PoolsActivityCallback;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: X.2Xl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C51382Xl {
    public static MountContentPools$PoolsActivityCallback A00;
    public static C47968LIc A01;
    public static final Object A02 = new Object();
    public static final Map A05 = new HashMap(4);
    public static final WeakHashMap A06 = new WeakHashMap();
    public static final WeakHashMap A03 = new WeakHashMap();
    public static final ThreadLocal A04 = new ThreadLocal();

    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, com.facebook.rendercore.MountContentPools$PoolsActivityCallback] */
    public static final C2Wm A00(Context context, InterfaceC50822Vd interfaceC50822Vd, int i) {
        if (i <= 0) {
            return null;
        }
        synchronized (A02) {
            Map map = A05;
            Map map2 = (Map) map.get(context);
            if (map2 == null) {
                final Context context2 = context;
                while ((context2 instanceof ContextWrapper) && !(context2 instanceof Activity) && !(context2 instanceof Application) && !(context2 instanceof Service)) {
                    context2 = ((ContextWrapper) context2).getBaseContext();
                }
                if (A06.containsKey(context2)) {
                    return null;
                }
                if (context2 instanceof C07X) {
                    WeakHashMap weakHashMap = A03;
                    if (!weakHashMap.containsKey(context2)) {
                        weakHashMap.put(context2, true);
                        AbstractC79383gk.A01(new Runnable() { // from class: X.3hJ
                            @Override // java.lang.Runnable
                            public final void run() {
                                C07X c07x = (C07X) context2;
                                C07T lifecycle = c07x.getLifecycle();
                                final C07S A07 = c07x.getLifecycle().A07();
                                lifecycle.A09(new InterfaceC65626Tpm(A07) { // from class: X.3hM
                                    public final C07S A00;

                                    /* JADX WARN: Multi-variable type inference failed */
                                    @Override // X.InterfaceC65626Tpm
                                    public final void onCreate(C07X c07x2) {
                                        C14360o3.A0B(c07x2, 0);
                                        if (!this.A00.A00(C07S.CREATED)) {
                                            C51382Xl.A02((Context) c07x2);
                                        }
                                    }

                                    /* JADX WARN: Multi-variable type inference failed */
                                    @Override // X.InterfaceC65626Tpm
                                    public final void onDestroy(C07X c07x2) {
                                        C14360o3.A0B(c07x2, 0);
                                        Context context3 = (Context) c07x2;
                                        C51382Xl.A03(context3);
                                        c07x2.getLifecycle().A0A(this);
                                        synchronized (C51382Xl.A02) {
                                            C51382Xl.A03.remove(context3);
                                        }
                                    }

                                    @Override // X.InterfaceC65626Tpm
                                    public final /* synthetic */ void onPause(C07X c07x2) {
                                    }

                                    @Override // X.InterfaceC65626Tpm
                                    public final /* synthetic */ void onResume(C07X c07x2) {
                                    }

                                    @Override // X.InterfaceC65626Tpm
                                    public final /* synthetic */ void onStart(C07X c07x2) {
                                    }

                                    @Override // X.InterfaceC65626Tpm
                                    public final /* synthetic */ void onStop(C07X c07x2) {
                                    }

                                    {
                                        this.A00 = A07;
                                    }
                                });
                            }
                        });
                    }
                } else if (A00 == null) {
                    A00 = new Object();
                    Context applicationContext = context2.getApplicationContext();
                    C14360o3.A0C(applicationContext, "null cannot be cast to non-null type android.app.Application");
                    ((Application) applicationContext).registerActivityLifecycleCallbacks(A00);
                }
                map2 = new HashMap();
                map.put(context, map2);
            }
            Object BeR = interfaceC50822Vd.BeR();
            C2Wm c2Wm = (C2Wm) map2.get(BeR);
            if (c2Wm == null && (c2Wm = interfaceC50822Vd.D8D(i)) == null) {
                c2Wm = new C51152Wl(BeR, i);
            }
            map2.put(BeR, c2Wm);
            return c2Wm;
        }
    }

    public static final Object A01(Context context, InterfaceC50822Vd interfaceC50822Vd) {
        Object ALq;
        String obj;
        Class cls;
        C47968LIc c47968LIc;
        C2Wm A002;
        C14360o3.A0B(interfaceC50822Vd, 1);
        if (!interfaceC50822Vd.BeU().A00 || (A002 = A00(context, interfaceC50822Vd, interfaceC50822Vd.E4c())) == null || (ALq = A002.A7I(interfaceC50822Vd)) == null) {
            boolean isTracing = C1LN.A01.isTracing();
            if (isTracing) {
                Object BeR = interfaceC50822Vd.BeR();
                if (!(BeR instanceof Class) || (cls = (Class) BeR) == null || (obj = cls.getSimpleName()) == null) {
                    obj = BeR.toString();
                }
                C1LN.A01(AnonymousClass001.A0R("MountContentPools:createMountContent ", obj));
            }
            ALq = interfaceC50822Vd.ALq(context);
            if (isTracing) {
                C1LN.A00();
            }
        }
        if ((ALq instanceof View) && (c47968LIc = A01) != null) {
            c47968LIc.A01((View) ALq);
        }
        return ALq;
    }

    public static final void A02(Context context) {
        C14360o3.A0B(context, 0);
        synchronized (A02) {
            if (!(!A05.containsKey(context))) {
                throw new IllegalStateException("The MountContentPools has a reference to an activity that has just been created");
            }
        }
    }

    public static final void A03(Context context) {
        C14360o3.A0B(context, 0);
        synchronized (A02) {
            Map map = A05;
            map.remove(context);
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                Context context2 = (Context) ((Map.Entry) it.next()).getKey();
                Context context3 = context;
                while (context3 instanceof ContextWrapper) {
                    context3 = ((ContextWrapper) context3).getBaseContext();
                }
                while (context2 instanceof ContextWrapper) {
                    context2 = ((ContextWrapper) context2).getBaseContext();
                }
                if (context2 == context3) {
                    it.remove();
                }
            }
            WeakHashMap weakHashMap = A06;
            while ((context instanceof ContextWrapper) && !(context instanceof Activity) && !(context instanceof Application) && !(context instanceof Service)) {
                context = ((ContextWrapper) context).getBaseContext();
            }
            weakHashMap.put(context, true);
        }
    }
}
