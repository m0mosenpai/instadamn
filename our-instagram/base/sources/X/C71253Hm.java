package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import java.util.Collections;
import java.util.List;

/* renamed from: X.3Hm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C71253Hm {
    public static final C71253Hm A00 = new Object();

    public final List A00(View view, UserSession userSession) {
        C14360o3.A0B(view, 0);
        C14360o3.A0B(userSession, 1);
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, userSession, 36330668795511767L) && C18U.A06(c06090Tz, userSession, 2342173678009140182L)) {
            long A01 = C18U.A01(c06090Tz, userSession, 36612143772735850L);
            if (Long.valueOf(A01) != null && A01 == 2) {
                return AbstractC16960so.A1Q(new AbstractC48561Ldy(view, userSession), new KXQ(view, userSession));
            }
            List singletonList = Collections.singletonList(new KXQ(view, userSession));
            C14360o3.A07(singletonList);
            return singletonList;
        }
        return C16930sl.A00;
    }
}
