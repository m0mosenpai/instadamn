package X;

import android.app.Activity;
import android.app.ActivityThread;
import android.os.Build;
import com.facebook.common.hiddenapis2.ApiExemption;
import java.lang.reflect.Field;
import java.util.Map;

/* renamed from: X.92V, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C92V {
    public static Field A00;
    public static Field A01;
    public static C92W A02;
    public static C92V A03;
    public static final C0h7 A04;
    public static final boolean A05;

    public static /* synthetic */ Boolean A02() {
        Field declaredField;
        try {
            if (ApiExemption.removeRestriction_DO_NOT_USE() && !((Boolean) C220915k.A00().A01.get()).booleanValue()) {
                ActivityThread currentActivityThread = ActivityThread.currentActivityThread();
                if (Build.VERSION.SDK_INT >= 29) {
                    declaredField = ActivityThread.class.getDeclaredField("mLastProcessState");
                    A01 = declaredField;
                } else {
                    Field declaredField2 = ActivityThread.class.getDeclaredField("mAppThread");
                    A00 = declaredField2;
                    declaredField2.setAccessible(true);
                    Object obj = A00.get(currentActivityThread);
                    if (obj != null) {
                        declaredField = obj.getClass().getDeclaredField("mLastProcessState");
                        A01 = declaredField;
                    }
                    return true;
                }
                declaredField.setAccessible(true);
                return true;
            }
            return false;
        } catch (Throwable th) {
            C0f5 A012 = C220915k.A00().A01("RefActivityThread.ensureInit");
            A012.ERI(th);
            A012.report();
            return false;
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.0gv, X.0h7, java.lang.Object] */
    static {
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 30) {
            z = true;
        }
        A05 = z;
        InterfaceC08830cm interfaceC08830cm = new InterfaceC08830cm() { // from class: X.B1y
            @Override // X.InterfaceC08830cm
            public final Object get() {
                return C92V.A02();
            }
        };
        ?? obj = new Object();
        obj.A00 = interfaceC08830cm;
        A04 = obj;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, X.92V] */
    public static C92V A01() {
        C0J8.A09(((Boolean) A04.get()).booleanValue(), "Check isSupported() before call get() or use getOrNull() instead");
        C92V c92v = A03;
        if (c92v == null) {
            ?? obj = new Object();
            A03 = obj;
            return obj;
        }
        return c92v;
    }

    public final boolean A03() {
        int i = -1;
        if (A01 != null) {
            try {
                ActivityThread currentActivityThread = ActivityThread.currentActivityThread();
                if (Build.VERSION.SDK_INT >= 29) {
                    i = A01.getInt(currentActivityThread);
                } else {
                    Field field = A00;
                    if (field != null) {
                        i = A01.getInt(field.get(currentActivityThread));
                    }
                }
            } catch (Throwable th) {
                C0f5 A012 = C220915k.A00().A01("RefActivityThread.readCurrentProcesState");
                A012.ERI(th);
                A012.report();
            }
        }
        int i2 = 2;
        if (A05) {
            if (i == 2) {
                return true;
            }
            i2 = 3;
        }
        if (i == i2) {
            return true;
        }
        return false;
    }

    public static final Activity A00() {
        ActivityThread currentActivityThread = ActivityThread.currentActivityThread();
        if (currentActivityThread != null) {
            try {
                Field declaredField = ActivityThread.class.getDeclaredField("mActivities");
                declaredField.setAccessible(true);
                Map map = (Map) declaredField.get(currentActivityThread);
                if (map != null && !map.isEmpty()) {
                    for (Object obj : map.values()) {
                        if (obj != null) {
                            C92W c92w = A02;
                            if (c92w == null) {
                                c92w = new C92W(obj);
                                A02 = c92w;
                            }
                            if (!c92w.A01.getBoolean(obj)) {
                                return (Activity) A02.A00.get(obj);
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                C0f5 A012 = C220915k.A00().A01("RefActivityThread.getCurrentActivity");
                A012.ERI(th);
                A012.report();
                return null;
            }
        }
        return null;
    }
}
