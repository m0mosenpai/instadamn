package X;

import android.app.Activity;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.facebook.systrace.Systrace;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.0lY, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC12860lY {
    public static final java.util.Set A00 = new CopyOnWriteArraySet();
    public static final AtomicInteger A01 = new AtomicInteger();

    public static final void A07(InterfaceC12850lX interfaceC12850lX) {
        C14360o3.A0B(interfaceC12850lX, 0);
        java.util.Set set = A00;
        if (!set.contains(interfaceC12850lX)) {
            set.add(interfaceC12850lX);
        }
    }

    public static final void A08(InterfaceC12850lX interfaceC12850lX) {
        C14360o3.A0B(interfaceC12850lX, 0);
        A00.remove(interfaceC12850lX);
    }

    public static final void A00(Activity activity) {
        if (Systrace.A0E(1L)) {
            C0fO.A01("ActivityListenerManager.activityBeforeSuperOnCreate", -2065397849);
        }
        try {
            java.util.Set set = A00;
            A0A(new C0Q0(activity, set), "onActivityBeforeSuperOnCreate", set.size());
            if (Systrace.A0E(1L)) {
                C0fO.A00(-909145967);
            }
        } catch (Throwable th) {
            if (Systrace.A0E(1L)) {
                C0fO.A00(-619002115);
            }
            throw th;
        }
    }

    public static final void A01(Activity activity) {
        if (Systrace.A0E(1L)) {
            C0fO.A01("ActivityListenerManager.activityCreated", -914422883);
        }
        try {
            java.util.Set set = A00;
            A0A(new C05270Py(activity, set), "onActivityCreate", set.size());
            if (Systrace.A0E(1L)) {
                C0fO.A00(662794652);
            }
        } catch (Throwable th) {
            if (Systrace.A0E(1L)) {
                C0fO.A00(1952026975);
            }
            throw th;
        }
    }

    public static final void A02(Activity activity) {
        if (Systrace.A0E(1L)) {
            C0fO.A01("ActivityListenerManager.activityDestroyed", -1151021018);
        }
        try {
            java.util.Set set = A00;
            A0A(new C05250Pw(activity, set), "onActivityDestroy", set.size());
            if (Systrace.A0E(1L)) {
                C0fO.A00(1682781153);
            }
        } catch (Throwable th) {
            if (Systrace.A0E(1L)) {
                C0fO.A00(1351704310);
            }
            throw th;
        }
    }

    public static final void A03(Activity activity) {
        if (Systrace.A0E(1L)) {
            C0fO.A01("ActivityListenerManager.activityPaused", -674815865);
        }
        try {
            java.util.Set set = A00;
            A0A(new C05220Pt(activity, set), "onActivityPause", set.size());
            if (Systrace.A0E(1L)) {
                C0fO.A00(-113289045);
            }
        } catch (Throwable th) {
            if (Systrace.A0E(1L)) {
                C0fO.A00(-1415945924);
            }
            throw th;
        }
    }

    public static final void A04(Activity activity) {
        if (Systrace.A0E(1L)) {
            C0fO.A01("ActivityListenerManager.activityResumed", -1064354060);
        }
        try {
            java.util.Set set = A00;
            A0A(new C05140Pf(activity, set), "onActivityResume", set.size());
            if (Systrace.A0E(1L)) {
                C0fO.A00(-1531762537);
            }
        } catch (Throwable th) {
            if (Systrace.A0E(1L)) {
                C0fO.A00(-1831531019);
            }
            throw th;
        }
    }

    public static final void A05(Activity activity) {
        if (Systrace.A0E(1L)) {
            C0fO.A01("ActivityListenerManager.activityStarted", -1950894718);
        }
        try {
            java.util.Set set = A00;
            A0A(new C0PW(activity, set), "onActivityStart", set.size());
            if (Systrace.A0E(1L)) {
                C0fO.A00(-70234808);
            }
        } catch (Throwable th) {
            if (Systrace.A0E(1L)) {
                C0fO.A00(-1797581496);
            }
            throw th;
        }
    }

    public static final void A06(Activity activity) {
        if (Systrace.A0E(1L)) {
            C0fO.A01("ActivityListenerManager.activityStopped", -829970062);
        }
        try {
            java.util.Set set = A00;
            A0A(new C0PT(activity, set), "onActivityStop", set.size());
            if (Systrace.A0E(1L)) {
                C0fO.A00(1748075008);
            }
        } catch (Throwable th) {
            if (Systrace.A0E(1L)) {
                C0fO.A00(284420094);
            }
            throw th;
        }
    }

    public static final void A09(String str, String str2, InterfaceC16820sZ interfaceC16820sZ) {
        if (!AbstractC12110kF.A01) {
            interfaceC16820sZ.invoke();
            return;
        }
        QuickPerformanceLogger quickPerformanceLogger = AbstractC12110kF.A00;
        if (quickPerformanceLogger == null) {
            C14360o3.A0F("internalLogger");
            throw C00O.createAndThrow();
        }
        int andIncrement = A01.getAndIncrement();
        quickPerformanceLogger.markerStart(694559669, andIncrement, false);
        quickPerformanceLogger.markerAnnotate(694559669, andIncrement, "operation", str);
        quickPerformanceLogger.markerAnnotate(694559669, andIncrement, "listener", AnonymousClass001.A0g("<cls>", str2, "</cls>"));
        interfaceC16820sZ.invoke();
        quickPerformanceLogger.markerEnd(694559669, andIncrement, (short) 2);
    }

    public static final void A0A(InterfaceC16820sZ interfaceC16820sZ, String str, int i) {
        if (!AbstractC12110kF.A01) {
            interfaceC16820sZ.invoke();
            return;
        }
        QuickPerformanceLogger quickPerformanceLogger = AbstractC12110kF.A00;
        if (quickPerformanceLogger == null) {
            C14360o3.A0F("internalLogger");
            throw C00O.createAndThrow();
        }
        int andIncrement = A01.getAndIncrement();
        quickPerformanceLogger.markerStart(694555839, andIncrement, false);
        quickPerformanceLogger.markerAnnotate(694555839, andIncrement, "operation", str);
        quickPerformanceLogger.markerAnnotate(694555839, andIncrement, "number_of_listeners", i);
        interfaceC16820sZ.invoke();
        quickPerformanceLogger.markerEnd(694555839, andIncrement, (short) 2);
    }
}
