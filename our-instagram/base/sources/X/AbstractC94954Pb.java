package X;

import android.app.Activity;
import android.graphics.Rect;
import android.view.View;

/* renamed from: X.4Pb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC94954Pb {
    public static final float A00(View view, C4PX c4px) {
        C4PZ A00;
        C14360o3.A0B(view, 1);
        if (C4PY.A01(c4px) == C8A3.A04 && (A00 = C4PY.A00(c4px)) != null) {
            int[] iArr = new int[2];
            view.getLocationInWindow(iArr);
            int i = iArr[0];
            Rect rect = new Rect(i, iArr[1], view.getWidth() + i, iArr[1] + view.getHeight());
            Rect rect2 = new Rect(A00.Ahk());
            rect2.bottom = rect2.bottom;
            rect2.top = rect2.top;
            boolean intersect = rect2.intersect(rect);
            if ((rect2.width() != 0 || rect2.height() != 0) && intersect) {
                rect2.offset(-iArr[0], -iArr[1]);
                return rect2.top / view.getHeight();
            }
            return 1.0f;
        }
        return 1.0f;
    }

    public static final Integer A01(Activity activity) {
        C14360o3.A0B(activity, 0);
        Rect A00 = ((InterfaceC52852bR) C52822bO.A00.invoke(C52842bQ.A00)).AIr(activity).A00();
        float width = A00.width() / A00.height();
        if (0.0f <= width && width <= 0.75f) {
            return C05F.A0C;
        }
        if (1.33f <= width && width <= Float.MAX_VALUE) {
            return C05F.A00;
        }
        return C05F.A01;
    }
}
