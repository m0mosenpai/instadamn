package X;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import java.util.List;

/* renamed from: X.Tui, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC65825Tui {
    public static final void A00(C6FG c6fg, C102884kP c102884kP, List list) {
        String obj;
        View A05;
        C14360o3.A0B(list, 2);
        if (!list.isEmpty()) {
            for (Object obj2 : list) {
                if (obj2 == null) {
                    obj = null;
                } else if (obj2 instanceof String) {
                    obj = (String) obj2;
                } else {
                    obj = obj2.toString();
                }
                C102884kP A00 = U5O.A00(c102884kP, new U5I(obj));
                if (A00 != null && (A05 = A00.A05(c6fg)) != null) {
                    A05.setAccessibilityTraversalAfter(-1);
                } else {
                    return;
                }
            }
        }
    }

    public static final void A01(C6FG c6fg, C102884kP c102884kP, List list) {
        C14360o3.A0B(list, 2);
        if (!list.isEmpty()) {
            Looper myLooper = Looper.myLooper();
            if (myLooper != null) {
                new Handler(myLooper).post(new RunnableC66245U5p(c6fg, c102884kP, list));
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }
}
