package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.3IO, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C3IO {
    public static final Integer A00(Context context, UserSession userSession) {
        if (C0BQ.A00(userSession).CLL() && C0BQ.A00(userSession).BWy(C17060sy.A01.A01(userSession)) != null) {
            boolean A01 = AbstractC56862jK.A01(context, true);
            boolean A00 = AbstractC56862jK.A00(context);
            if (!A01 || !A00) {
                return C05F.A00;
            }
        }
        return C05F.A01;
    }
}
