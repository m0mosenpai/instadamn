package X;

import android.content.Context;

/* renamed from: X.FeC, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC35110FeC {
    public static boolean A00;

    public static final void A00(Context context, int i, long j) {
        String str;
        if (context != null) {
            str = AbstractC167007dF.A0f(context, C23831Eq.A03(context, AbstractC166987dD.A0L(j)), i);
        } else {
            str = null;
        }
        C9GR.A09(context, str);
    }

    public static final void A01(Context context, long j) {
        if (!A00) {
            A00(context, 2131974075, j);
            A00 = true;
        } else {
            A00(context, 2131964822, j);
        }
    }

    public static final void A02(Context context, long j) {
        if (!A00) {
            A00(context, 2131974076, j);
            A00 = true;
        } else {
            A00(context, 2131964822, j);
        }
    }
}
