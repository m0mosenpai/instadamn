package X;

import android.content.Context;
import com.facebook.R;

/* renamed from: X.74c, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC1572274c {
    public static C6RL A00(Context context, C74Q c74q) {
        C14360o3.A0B(context, 1);
        return A01(context, c74q, C05F.A0N, C05F.A01);
    }

    public static C6RL A01(Context context, C74Q c74q, Integer num, Integer num2) {
        int i;
        C14360o3.A0B(num, 2);
        C14360o3.A0B(num2, 3);
        C6RK c6rk = new C6RK(context, c74q.getCurrent(), context.getResources().getDimensionPixelSize(R.dimen.challenge_sticker_v2_1_winner_submission_width));
        int intValue = num.intValue();
        if (intValue != 0) {
            if (intValue != 1) {
                i = 2131974749;
                if (intValue != 2) {
                    i = 2131974761;
                }
            } else {
                i = 2131974730;
            }
        } else {
            i = 2131974745;
        }
        c6rk.A01(i);
        c6rk.A02(R.dimen.account_discovery_bottom_gap);
        c6rk.A08 = true;
        c6rk.A06 = num2;
        return c6rk.A00();
    }

    public static void A02(C74Q c74q) {
        c74q.C5E().A00();
    }
}
