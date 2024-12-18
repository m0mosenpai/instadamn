package X;

import com.instagram.model.direct.DirectThreadKey;
import java.util.List;
import java.util.Locale;

/* renamed from: X.XqP, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC72890XqP {
    public static final String A00(List list) {
        C14360o3.A0B(list, 0);
        if (list.size() == 1) {
            DirectThreadKey directThreadKey = (DirectThreadKey) list.get(0);
            C14360o3.A0B(directThreadKey, 0);
            String str = directThreadKey.A00;
            if (str != null) {
                return AbstractC65702TsY.A0h("media-thread-%s", Locale.US, new Object[]{str}, 1);
            }
            return "global";
        }
        return "global";
    }

    public static final String A01(List list) {
        C14360o3.A0B(list, 0);
        if (list.size() == 1) {
            DirectThreadKey directThreadKey = (DirectThreadKey) list.get(0);
            C14360o3.A0B(directThreadKey, 0);
            String str = directThreadKey.A00;
            if (str != null) {
                return AbstractC65702TsY.A0h("thread-%s", Locale.US, new Object[]{str}, 1);
            }
            return "global";
        }
        return "global";
    }
}
