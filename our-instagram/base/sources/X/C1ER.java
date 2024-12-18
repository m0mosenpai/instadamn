package X;

import com.instagram.common.session.UserSession;
import java.util.concurrent.TimeUnit;

/* renamed from: X.1ER, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C1ER {
    public static final C1ES A00(UserSession userSession, C1EN c1en, String str, String str2, boolean z) {
        Integer num;
        Long l;
        C14360o3.A0B(userSession, 3);
        long j = C1ES.A05;
        String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        if (str != null) {
            str3 = str;
        }
        String A0g = AnonymousClass001.A0g("offline_feed_", str2, str3);
        if (c1en != C1EN.A0E && c1en != C1EN.A0B) {
            if (c1en == C1EN.A06) {
                return new C1ES(C05F.A00, null, null, 0L);
            }
            boolean z2 = false;
            if (c1en != C1EN.A0H) {
                z2 = true;
                if (z) {
                    num = C05F.A01;
                    l = null;
                    j = 0;
                }
            }
            num = C05F.A0Y;
            long j2 = C1ES.A04;
            if (z2) {
                j2 *= 2;
            }
            l = Long.valueOf(j2);
        } else {
            num = C05F.A0N;
            l = null;
            j = TimeUnit.SECONDS.toMillis(C18U.A01(C06090Tz.A05, userSession, 36595350451849347L));
        }
        return new C1ES(num, l, A0g, j);
    }
}
