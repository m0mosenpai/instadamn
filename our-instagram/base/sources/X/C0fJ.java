package X;

import android.app.Dialog;
import java.util.Map;

/* renamed from: X.0fJ, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C0fJ {
    public static void A00(Dialog dialog) {
        int i;
        boolean z;
        C2RI c2ri = C2RI.A04;
        if (c2ri != null) {
            String canonicalName = dialog.getClass().getCanonicalName();
            java.util.Set set = c2ri.A03;
            if (!set.contains(canonicalName)) {
                Map map = c2ri.A02;
                synchronized (map) {
                    Integer num = (Integer) map.get(canonicalName);
                    if (num == null) {
                        num = 0;
                    }
                    int intValue = num.intValue() + 1;
                    map.put(canonicalName, Integer.valueOf(intValue));
                    i = c2ri.A01;
                    if (intValue >= i) {
                        set.add(canonicalName);
                        z = true;
                    } else {
                        z = false;
                    }
                }
                if (z) {
                    C0K8.A0Q("DialogTracker", "Passed %d instances of dialog %s on endpoint %s", Integer.valueOf(i), canonicalName, c2ri.A00);
                }
            }
        }
        dialog.show();
    }
}
