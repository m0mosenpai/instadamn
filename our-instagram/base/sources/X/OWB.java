package X;

import android.content.Context;
import com.facebook.R;

/* loaded from: classes9.dex */
public final class OWB {
    public final int A01(Context context, long j, long j2) {
        int i;
        C14360o3.A0B(context, 0);
        int intValue = A00(j, j2).intValue();
        if (intValue != 0) {
            i = R.attr.igds_color_gradient_yellow;
            if (intValue != 1) {
                i = R.attr.igds_color_error_or_destructive;
            }
        } else {
            i = R.attr.igds_color_success;
        }
        return AbstractC53242c7.A0H(context, i);
    }

    public final String A02(Context context, long j, long j2) {
        int i;
        C14360o3.A0B(context, 0);
        int intValue = A00(j, j2).intValue();
        if (intValue != 0) {
            i = 2131957824;
            if (intValue != 1) {
                i = 2131957823;
            }
        } else {
            i = 2131957822;
        }
        return AbstractC31177DnL.A0b(context, Integer.valueOf((int) ((j2 - j) / 86400000)), i);
    }

    public static final Integer A00(long j, long j2) {
        long j3 = j2 - 86400000;
        long j4 = j2 - 259200000;
        if (j >= j3) {
            return C05F.A00;
        }
        if (j >= j4) {
            return C05F.A01;
        }
        return C05F.A0C;
    }
}
