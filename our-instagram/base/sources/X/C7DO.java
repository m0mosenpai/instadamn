package X;

import com.instagram.common.session.UserSession;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.7DO, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7DO {
    public String A00;
    public final UserSession A01;
    public final C7DP A02;

    public C7DO(UserSession userSession) {
        C7DP c7dp = new C7DP(userSession);
        this.A01 = userSession;
        this.A02 = c7dp;
    }

    public final String A00() {
        UserSession userSession = this.A02.A00;
        C06090Tz c06090Tz = C06090Tz.A05;
        if (!C18U.A06(c06090Tz, userSession, 36320287859482933L) && !C18U.A06(c06090Tz, userSession, 36319549126417925L)) {
            return this.A00;
        }
        return AbstractC92804Dt.A01.A00(this.A00);
    }

    public final void A01(String str) {
        UserSession userSession = this.A02.A00;
        C06090Tz c06090Tz = C06090Tz.A05;
        if (!C18U.A06(c06090Tz, userSession, 36320287859417396L) && !C18U.A06(c06090Tz, userSession, 36319549126352388L)) {
            str = null;
        }
        this.A00 = str;
    }

    public /* synthetic */ C7DO(UserSession userSession, C7DP c7dp, DefaultConstructorMarker defaultConstructorMarker, int i) {
        C7DP c7dp2 = new C7DP(userSession);
        C14360o3.A0B(userSession, 1);
        this.A01 = userSession;
        this.A02 = c7dp2;
    }
}
