package X;

import android.content.Context;
import java.util.Map;

/* loaded from: classes10.dex */
public final class SXn {
    public static final SXn A01 = new SXn();
    public final Map A00 = AbstractC166987dD.A1G();

    public final int A00(Context context, String str) {
        C14360o3.A0B(context, 0);
        if (str == null || str.length() == 0) {
            return 0;
        }
        String A0d = AbstractC002300n.A0d(AbstractC167007dF.A0h(str), "-", "_", false);
        try {
            return Integer.parseInt(A0d);
        } catch (NumberFormatException unused) {
            synchronized (this) {
                Map map = this.A00;
                Integer num = (Integer) map.get(A0d);
                if (num != null) {
                    return num.intValue();
                }
                int identifier = context.getResources().getIdentifier(A0d, "drawable", context.getPackageName());
                AbstractC37301Gc2.A1T(A0d, map, identifier);
                return identifier;
            }
        }
    }
}
