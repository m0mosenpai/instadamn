package X;

import android.app.Activity;
import java.util.List;
import java.util.WeakHashMap;

/* renamed from: X.2lC, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C57992lC {
    public static final void A02(Activity activity, InterfaceC59892oW interfaceC59892oW) {
        C14360o3.A0B(interfaceC59892oW, 1);
        C57982lB c57982lB = (C57982lB) C57982lB.A0C.get(activity);
        if (c57982lB != null) {
            c57982lB.A01.remove(interfaceC59892oW);
        }
    }

    public final void A04(Activity activity, InterfaceC59892oW interfaceC59892oW, boolean z) {
        List list;
        int i;
        C14360o3.A0B(activity, 0);
        C14360o3.A0B(interfaceC59892oW, 2);
        int i2 = C57982lB.A06;
        if (i2 != -1 && (i = C57982lB.A05) != -1) {
            interfaceC59892oW.Dnp(i2, i);
            if (z) {
                return;
            }
        }
        if (true != C57982lB.A09 && C57982lB.A06 != -1 && C57982lB.A05 != -1) {
            return;
        }
        WeakHashMap weakHashMap = C57982lB.A0C;
        C57982lB c57982lB = (C57982lB) weakHashMap.get(activity);
        if (c57982lB == null) {
            c57982lB = new C57982lB(activity);
            weakHashMap.put(activity, c57982lB);
            if (!C57982lB.A08) {
                C57982lB.A08 = true;
                activity.getApplication().registerActivityLifecycleCallbacks(C57982lB.A0A);
            }
        }
        if (z) {
            list = c57982lB.A02;
        } else {
            list = c57982lB.A01;
        }
        list.add(interfaceC59892oW);
    }

    public final void A05(Activity activity, final Runnable runnable) {
        Object obj;
        List list;
        C14360o3.A0B(activity, 0);
        if (C57982lB.A06 != -1 && C57982lB.A05 != -1) {
            runnable.run();
            return;
        }
        boolean z = true;
        if (true != C57982lB.A09) {
            z = false;
        }
        WeakHashMap weakHashMap = C57982lB.A0C;
        C57982lB c57982lB = (C57982lB) weakHashMap.get(activity);
        if (c57982lB == null) {
            c57982lB = new C57982lB(activity);
            weakHashMap.put(activity, c57982lB);
            if (!C57982lB.A08) {
                C57982lB.A08 = true;
                activity.getApplication().registerActivityLifecycleCallbacks(C57982lB.A0A);
            }
        }
        if (z) {
            obj = new C71108Wo5(runnable);
            list = c57982lB.A02;
        } else {
            obj = new InterfaceC59892oW() { // from class: X.3Dc
                @Override // X.InterfaceC59892oW
                public final void Dnp(int i, int i2) {
                    runnable.run();
                }
            };
            list = c57982lB.A01;
        }
        list.add(obj);
    }

    public static final int A00() {
        int i = C57982lB.A05;
        boolean z = false;
        if (i != -1) {
            z = true;
        }
        Object[] objArr = new Object[0];
        if (z) {
            return i;
        }
        throw new IllegalArgumentException(String.format("The stable navigation bar height has not been initialized, use startListeningForStableStatusAndNavigationBarHeight() to receive a callback once this value is available", objArr));
    }

    public static final int A01() {
        int i = C57982lB.A06;
        boolean z = false;
        if (i != -1) {
            z = true;
        }
        Object[] objArr = new Object[0];
        if (z) {
            return i;
        }
        throw new IllegalArgumentException(String.format("The stable status bar height has not been initialized, use startListeningForStableStatusAndNavigationBarHeight() to receive a callback once this value is available", objArr));
    }

    public static final boolean A03() {
        if (C57982lB.A06 != -1 && C57982lB.A05 != -1) {
            return true;
        }
        return false;
    }
}
