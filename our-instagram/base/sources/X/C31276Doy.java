package X;

import com.instagram.common.session.UserSession;
import java.util.Random;

/* renamed from: X.Doy, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31276Doy {
    public static final C31276Doy A01 = new C31276Doy(new Random());
    public final Random A00;

    public static final boolean A00(UserSession userSession, C31276Doy c31276Doy, Class cls) {
        C06090Tz c06090Tz;
        long j;
        if (!AbstractC29011ae.class.isAssignableFrom(cls) && !C29091am.class.isAssignableFrom(cls) && !C31391ei.class.isAssignableFrom(cls)) {
            if (C31601f3.class.isAssignableFrom(cls) || C31701fD.class.isAssignableFrom(cls) || C31741fH.class.isAssignableFrom(cls)) {
                c06090Tz = C06090Tz.A05;
                j = 37154791415087106L;
            } else {
                return false;
            }
        } else {
            c06090Tz = C06090Tz.A05;
            j = 37154791415152643L;
        }
        double A00 = C18U.A00(c06090Tz, userSession, j);
        if (A00 != 0.0d && c31276Doy.A00.nextInt(10000) < ((int) (A00 * 10000.0d))) {
            return true;
        }
        return false;
    }

    public C31276Doy(Random random) {
        this.A00 = random;
    }

    public C31276Doy() {
    }
}
