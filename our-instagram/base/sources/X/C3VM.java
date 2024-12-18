package X;

import android.os.Build;
import com.instagram.common.session.UserSession;

/* renamed from: X.3VM, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3VM {
    public final UserSession A00;
    public final boolean A01;
    public final boolean A02;

    public C3VM(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        C06090Tz c06090Tz = C06090Tz.A05;
        this.A02 = C18U.A06(c06090Tz, userSession, 36311148169003455L);
        this.A01 = C18U.A06(c06090Tz, userSession, 36311148169068992L);
    }

    public final boolean A00() {
        if (Build.VERSION.SDK_INT >= 29) {
            return true;
        }
        return this.A02;
    }

    public final boolean A01() {
        if (Build.VERSION.SDK_INT >= 29) {
            return true;
        }
        return this.A01;
    }
}
