package X;

import com.instagram.common.session.UserSession;
import java.util.LinkedHashSet;

/* renamed from: X.2qV, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C61072qV {
    public final java.util.Set A00;
    public final UserSession A01;

    public C61072qV(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = new LinkedHashSet();
    }

    public final long A00(String str) {
        C14360o3.A0B(str, 0);
        if (this.A00.contains(str)) {
            UserSession userSession = this.A01;
            C06090Tz c06090Tz = C06090Tz.A05;
            if (C18U.A06(c06090Tz, userSession, 36330063205188244L)) {
                return C18U.A01(c06090Tz, userSession, 36611538182150432L);
            }
            return 5000000L;
        }
        return 5000000L;
    }
}
