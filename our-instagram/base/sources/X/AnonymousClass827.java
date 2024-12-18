package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;

/* renamed from: X.827, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract class AnonymousClass827 {
    public static final AnonymousClass826 A00(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, userSession, 36320846205232059L)) {
            return AnonymousClass826.A08;
        }
        if (C18U.A06(c06090Tz, userSession, 36320846205166522L)) {
            return AnonymousClass826.A06;
        }
        return AnonymousClass826.A0A;
    }

    public static final ArrayList A01(UserSession userSession) {
        ArrayList A1N = AbstractC16960so.A1N(AnonymousClass826.A05, AnonymousClass826.A07, AnonymousClass826.A09, AnonymousClass826.A0A);
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, userSession, 36320846205166522L)) {
            A1N.add(AnonymousClass826.A06);
        }
        if (C18U.A06(c06090Tz, userSession, 36320846205232059L)) {
            A1N.add(AnonymousClass826.A08);
        }
        return A1N;
    }
}
