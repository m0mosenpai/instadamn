package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.2CE, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2CE {
    public final C2CR A00;
    public final C2CF A01;

    public C2CE(Context context, UserSession userSession) {
        C2CG c2cg = C2CF.A0D;
        if (context != null) {
            if (userSession != null) {
                this.A01 = c2cg.A02(context, userSession);
                this.A00 = new C2CR(userSession, null);
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }
}
