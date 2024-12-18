package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.7ul, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C177517ul {
    public static C178597wX A00;

    public static synchronized C178597wX A00(UserSession userSession) {
        C178597wX c178597wX;
        synchronized (C177517ul.class) {
            c178597wX = A00;
            if (c178597wX == null) {
                c178597wX = new C178597wX(new C178317w5(userSession));
                A00 = c178597wX;
            }
        }
        return c178597wX;
    }
}
