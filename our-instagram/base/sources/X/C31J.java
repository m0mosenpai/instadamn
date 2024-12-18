package X;

import com.instagram.common.session.UserSession;
import kotlin.Deprecated;

@Deprecated(message = "Keep in sync with AB Tested Kotlin Conversion SponsoredContentLoggerFactoryKt")
/* renamed from: X.31J, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C31J {
    public static C31E A00(UserSession userSession, C31A c31a, C31B c31b, C31E c31e, String str) {
        if (C1P9.A00(userSession).booleanValue() && C18U.A06(C06090Tz.A05, userSession, 36323715244699156L)) {
            return new C42965IzH(userSession, C31L.A00.A00(userSession), c31a, c31b, c31e, new C42967IzJ(), (C451225r) userSession.A01(C451225r.class, C451125q.A00), str);
        }
        return new C31K(userSession, C31L.A00.A00(userSession), c31a, c31b, c31e, new C31P() { // from class: X.31O
        }, (C451225r) userSession.A01(C451225r.class, C451125q.A00), str);
    }
}
