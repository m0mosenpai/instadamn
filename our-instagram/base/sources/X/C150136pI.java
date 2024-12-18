package X;

import android.app.ActivityManager;
import android.content.Context;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.facebook.quicklog.QuickPerformanceLoggerProvider;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;

/* renamed from: X.6pI, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C150136pI {
    public final InterfaceC150356pk A00;
    public final ActivityManager A01;
    public final AbstractC150536q2 A02;
    public volatile WeakHashMap A03 = new WeakHashMap(2);

    public static InterfaceC201488vd A00(C150136pI c150136pI, String str) {
        Iterator it = c150136pI.A03.entrySet().iterator();
        while (it.hasNext()) {
            InterfaceC178407wE B4Z = ((InterfaceC142616cN) ((Map.Entry) it.next()).getKey()).B4Z();
            if (B4Z != null && str != null && str.equals(B4Z.getActiveSessionId())) {
                return B4Z.BYr();
            }
        }
        return null;
    }

    public static void A02(boolean z) {
        QuickPerformanceLogger qPLInstance;
        if (!z && (qPLInstance = QuickPerformanceLoggerProvider.getQPLInstance()) != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("use_case", "jni_null_ard");
            qPLInstance.markerGenerateWithAnnotations(11282540, (short) 4, 1L, TimeUnit.MILLISECONDS, hashMap);
        }
    }

    public C150136pI(Context context, AbstractC150536q2 abstractC150536q2, InterfaceC150356pk interfaceC150356pk) {
        this.A00 = interfaceC150356pk;
        this.A02 = abstractC150536q2;
        this.A01 = (ActivityManager) context.getSystemService("activity");
    }

    public static void A01(C150136pI c150136pI, String str) {
        QuickPerformanceLogger qPLInstance = QuickPerformanceLoggerProvider.getQPLInstance();
        ActivityManager activityManager = c150136pI.A01;
        if (activityManager != null && qPLInstance != null) {
            int hashCode = str.hashCode();
            if (qPLInstance.isMarkerOn(16323880, hashCode)) {
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                activityManager.getMemoryInfo(memoryInfo);
                qPLInstance.markerAnnotateCrucialForUserFlow(16323880, hashCode, "ann_avail_mem_at_start", AnonymousClass001.A0Q("", memoryInfo.availMem));
            }
        }
    }
}
