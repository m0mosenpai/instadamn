package X;

import android.content.Context;

/* renamed from: X.2bN, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC52812bN {
    public static boolean A00;

    public static final boolean A02(Integer num) {
        C14360o3.A0B(num, 0);
        if (num.intValue() != 0) {
            return true;
        }
        return false;
    }

    public static final Integer A00(Context context) {
        return AbstractC52892bV.A00((int) (((InterfaceC52852bR) C52822bO.A00.invoke(C52842bQ.A00)).AIs(context).A00().width() / context.getResources().getDisplayMetrics().density));
    }

    public static final boolean A01(int i) {
        return A02(AbstractC52892bV.A00(i));
    }
}
