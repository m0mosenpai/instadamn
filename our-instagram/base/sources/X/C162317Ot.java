package X;

import android.view.Window;
import android.view.WindowManager;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

/* renamed from: X.7Ot, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C162317Ot {
    public static final C162327Ou A02 = new Object();
    public static volatile C162317Ot A03;
    public final WeakHashMap A01 = new WeakHashMap();
    public final WeakHashMap A00 = new WeakHashMap();

    public final void A00(Window window) {
        boolean z = false;
        WindowManager.LayoutParams attributes = window.getAttributes();
        if (attributes != null && (attributes.flags & 8192) != 0) {
            z = true;
        }
        boolean z2 = true;
        boolean z3 = !z;
        Number number = (Number) this.A01.get(window);
        if (number != null && number.intValue() != 0) {
            z2 = false;
        }
        if (z3 != z2) {
            C0K8.A02(getClass(), AnonymousClass001.A1C("Inconsistency in window FLAG_SECURE state detected! window state: ", ", internal state: ", z3, z2));
            Iterable iterable = (Iterable) this.A00.get(window);
            if (iterable != null) {
                AbstractC001800i.A0P(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, "", "", iterable, null);
            }
            WindowManager.LayoutParams attributes2 = window.getAttributes();
            if (z2) {
                if (attributes2 != null && (attributes2.flags & 8192) != 0) {
                    return;
                }
                window.setFlags(8192, 8192);
                return;
            }
            if (attributes2 == null || (attributes2.flags & 8192) == 0) {
                return;
            }
            window.clearFlags(8192);
        }
    }

    public final synchronized void A01(Window window, String str) {
        int i;
        if (window != null) {
            A00(window);
            WindowManager.LayoutParams attributes = window.getAttributes();
            if (attributes == null || (attributes.flags & 8192) == 0) {
                window.setFlags(8192, 8192);
            }
            WeakHashMap weakHashMap = this.A01;
            Integer num = (Integer) weakHashMap.get(window);
            if (num != null) {
                i = num.intValue();
            } else {
                i = 0;
            }
            weakHashMap.put(window, Integer.valueOf(i + 1));
            WeakHashMap weakHashMap2 = this.A00;
            Object obj = weakHashMap2.get(window);
            if (obj == null) {
                obj = new ArrayList();
                weakHashMap2.put(window, obj);
            }
            ((List) obj).add(str);
        }
    }

    public final synchronized void A02(Window window, String str) {
        if (window != null) {
            A00(window);
            WeakHashMap weakHashMap = this.A01;
            Integer num = (Integer) weakHashMap.get(window);
            if (num != null) {
                int intValue = num.intValue();
                if (intValue <= 1) {
                    WindowManager.LayoutParams attributes = window.getAttributes();
                    if (attributes != null && (attributes.flags & 8192) != 0) {
                        window.clearFlags(8192);
                    }
                    weakHashMap.remove(window);
                    this.A00.remove(window);
                } else {
                    weakHashMap.put(window, Integer.valueOf(intValue - 1));
                    List list = (List) this.A00.get(window);
                    if (list != null) {
                        list.remove(str);
                    }
                }
            }
        }
    }
}
