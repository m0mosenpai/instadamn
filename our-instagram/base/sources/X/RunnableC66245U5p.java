package X;

import android.view.View;
import java.util.List;

/* renamed from: X.U5p, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC66245U5p implements Runnable {
    public final /* synthetic */ C6FG A00;
    public final /* synthetic */ C102884kP A01;
    public final /* synthetic */ List A02;

    public RunnableC66245U5p(C6FG c6fg, C102884kP c102884kP, List list) {
        this.A02 = list;
        this.A01 = c102884kP;
        this.A00 = c6fg;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String obj;
        int i = -1;
        for (Object obj2 : this.A02) {
            C102884kP c102884kP = this.A01;
            if (obj2 == null) {
                obj = null;
            } else if (obj2 instanceof String) {
                obj = (String) obj2;
            } else {
                obj = obj2.toString();
            }
            C102884kP A00 = U5O.A00(c102884kP, new U5I(obj));
            if (A00 == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Component with server id: ");
                sb.append(obj2);
                AbstractC25241Le.A00(this.A00, "AccessibilityUtils", AbstractC166997dE.A0x(" not found in hierarchy.", sb), null);
            } else {
                View A05 = A00.A05(this.A00);
                if (A05 != null) {
                    A05.setFocusable(true);
                    if (A05.getId() == -1) {
                        A05.setId(View.generateViewId());
                    }
                    if (i != -1) {
                        A05.setAccessibilityTraversalAfter(i);
                    }
                    i = A05.getId();
                }
            }
        }
    }
}
