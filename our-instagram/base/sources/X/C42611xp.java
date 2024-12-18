package X;

import com.facebook.react.modules.intent.IntentModule;
import com.instagram.common.session.UserSession;

/* renamed from: X.1xp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C42611xp {
    public final UserSession A00;

    public C42611xp(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
    }

    public final C3AW A01(String str) {
        UserSession userSession;
        C06090Tz c06090Tz;
        String A04;
        long j;
        C3AT c3at;
        String A042;
        C14360o3.A0B(str, 0);
        if (str.equals("feed_timeline")) {
            userSession = this.A00;
            c06090Tz = C06090Tz.A05;
            A04 = C18U.A04(c06090Tz, userSession, 36878448927047859L);
            j = 36878448926982322L;
        } else {
            if (C4SO.A00(str)) {
                UserSession userSession2 = this.A00;
                C06090Tz c06090Tz2 = C06090Tz.A05;
                String A043 = C18U.A04(c06090Tz2, userSession2, 36878448927834292L);
                try {
                    C14360o3.A0A(A043);
                    c3at = C3AS.A00(A043);
                } catch (Exception unused) {
                    C0f5 AEp = C18950wb.A00.AEp("Invalid grid config", 817901863);
                    AEp.ABW(IntentModule.EXTRA_MAP_KEY_FOR_VALUE, A043);
                    AEp.report();
                    c3at = new C3AT(BAH.A00, BAI.A00, BAJ.A00, BAK.A00);
                }
                A042 = C18U.A04(c06090Tz2, userSession2, 36878448926851248L);
                return new C3AW(c3at, C3AU.A00(A042));
            }
            if (str.startsWith("clips_viewer_")) {
                userSession = this.A00;
                c06090Tz = C06090Tz.A05;
                if (C18U.A06(c06090Tz, userSession, 36315498974874978L)) {
                    A04 = C18U.A04(c06090Tz, userSession, 36878448928227510L);
                    j = 36878448928161973L;
                }
            }
            return A00();
        }
        A042 = C18U.A04(c06090Tz, userSession, j);
        c3at = C3AS.A01(A04);
        return new C3AW(c3at, C3AU.A00(A042));
    }

    private final C3AW A00() {
        UserSession userSession = this.A00;
        C06090Tz c06090Tz = C06090Tz.A05;
        return new C3AW(new C3AT(new C206789Dj((int) C18U.A01(c06090Tz, userSession, 36596973949160145L), 5), BAE.A00, BAF.A00, BAG.A00), new C3AV(new C206789Dj((int) C18U.A01(c06090Tz, userSession, 36596973949094608L), 6)));
    }
}
