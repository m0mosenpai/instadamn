package X;

import android.content.Context;
import android.content.res.Resources;
import com.facebook.R;

/* renamed from: X.Drh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC31437Drh {
    public static final String A00(Context context, Integer num) {
        int intValue;
        C14360o3.A0B(context, 0);
        String A0u = AbstractC25227BEk.A0u(context, 2131958826);
        if (num != null && (intValue = num.intValue()) > 0) {
            return context.getResources().getQuantityString(R.plurals.channels_context_line, intValue, A0u, C84963qk.A04(AbstractC166997dE.A0M(context), Integer.valueOf(intValue), 10000, true, true));
        }
        return A0u;
    }

    public static final String A01(Resources resources, Integer num, boolean z) {
        int intValue;
        if (num != null && (intValue = num.intValue()) > 0) {
            Integer valueOf = Integer.valueOf(intValue);
            int i = 10000;
            if (z) {
                i = 1000;
            }
            return AbstractC31175DnJ.A0W(resources, C84963qk.A04(resources, valueOf, i, true, true), R.plurals.channels_context_line_without_type, intValue);
        }
        return null;
    }
}
