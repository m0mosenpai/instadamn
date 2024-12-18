package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* loaded from: classes5.dex */
public abstract class BO8 {
    public static final boolean A01(Context context, UserSession userSession) {
        C14360o3.A0B(context, 0);
        C14360o3.A0B(userSession, 1);
        if (AbstractC31415DrK.A00(context) > 1.0f && C18U.A06(C06090Tz.A05, userSession, 36324763215344061L)) {
            return true;
        }
        return false;
    }

    public static final long A00(Context context) {
        int floatToRawIntBits;
        if (AbstractC13880nE.A03(context, 12.0f) >= 56.0f) {
            floatToRawIntBits = Float.floatToRawIntBits(AbstractC13880nE.A02(context, 56.0f));
        } else {
            floatToRawIntBits = Float.floatToRawIntBits(12.0f);
        }
        return floatToRawIntBits | 9221683186994511872L;
    }
}
