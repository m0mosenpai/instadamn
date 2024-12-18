package X;

import android.os.Build;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: X.03X, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C03X {
    public static Map A00 = Collections.synchronizedMap(new WeakHashMap());

    public static float A00(VelocityTracker velocityTracker, int i) {
        if (Build.VERSION.SDK_INT >= 34) {
            return C03W.A00(velocityTracker, i);
        }
        C03Y c03y = (C03Y) A00.get(velocityTracker);
        if (c03y != null && i == 26) {
            return c03y.A00;
        }
        return 0.0f;
    }

    public static void A01(MotionEvent motionEvent, VelocityTracker velocityTracker) {
        velocityTracker.addMovement(motionEvent);
        if (Build.VERSION.SDK_INT < 34 && motionEvent.getSource() == 4194304) {
            Map map = A00;
            if (!map.containsKey(velocityTracker)) {
                map.put(velocityTracker, new C03Y());
            }
            C03Y c03y = (C03Y) map.get(velocityTracker);
            long eventTime = motionEvent.getEventTime();
            int i = c03y.A02;
            if (i != 0 && eventTime - c03y.A04[c03y.A01] > 40) {
                c03y.A02 = 0;
                i = 0;
                c03y.A00 = 0.0f;
            }
            int i2 = (c03y.A01 + 1) % 20;
            c03y.A01 = i2;
            if (i != 20) {
                c03y.A02 = i + 1;
            }
            c03y.A03[i2] = motionEvent.getAxisValue(26);
            c03y.A04[c03y.A01] = eventTime;
        }
    }
}
