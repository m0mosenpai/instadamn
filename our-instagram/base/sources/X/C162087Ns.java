package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.7Ns, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C162087Ns implements C7C2 {
    public static final C162087Ns A00 = new Object();

    @Override // X.C7C2
    public final boolean CWe(UserSession userSession, AbstractC159137Bz abstractC159137Bz, String str) {
        C14360o3.A0B(userSession, 2);
        if (str.length() == 0) {
            return false;
        }
        if (str.equalsIgnoreCase(AnonymousClass001.A0C("ai", ' '))) {
            return !C18U.A06(C06090Tz.A05, userSession, 36328267908988311L);
        }
        String obj = AbstractC001900j.A0B(str).toString();
        if (obj != null && obj.equalsIgnoreCase("meta ai")) {
            return true;
        }
        if (!str.equalsIgnoreCase("ai")) {
            return false;
        }
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, userSession, 36328267908988311L) || C18U.A06(c06090Tz, userSession, 36328267908922774L)) {
            return false;
        }
        return true;
    }
}
