package X;

import android.view.View;
import java.util.Arrays;

/* loaded from: classes11.dex */
public final class U6B implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ C6FG A01;
    public final /* synthetic */ Object A02;

    public U6B(View view, C6FG c6fg, Object obj) {
        this.A02 = obj;
        this.A01 = c6fg;
        this.A00 = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String obj;
        String str;
        String format;
        C102884kP A00;
        Object obj2 = this.A02;
        if (obj2 instanceof String) {
            obj = (String) obj2;
        } else {
            obj = obj2.toString();
        }
        C6FG c6fg = this.A01;
        C102884kP A06 = AnonymousClass634.A02(c6fg).A06();
        if (A06 != null && (A00 = U5O.A00(A06, new U5I(obj))) != null) {
            View A05 = A00.A05(c6fg);
            if (A05 == null) {
                str = "AccessibilityUtils";
                format = AnonymousClass001.A0R("No View found for component with id: ", obj);
            } else {
                int id = A05.getId();
                if (id == -1) {
                    id = View.generateViewId();
                    A05.setId(id);
                }
                this.A00.setLabelFor(id);
                return;
            }
        } else {
            str = "AccessibilityUtils";
            format = String.format("Component does not exist in the hierarchy for id: %s. Is the component with this ID not yet rendered? If so, this will not work.", Arrays.copyOf(new Object[]{obj}, 1));
            C14360o3.A07(format);
        }
        AbstractC25241Le.A00(c6fg, str, format, null);
    }
}
