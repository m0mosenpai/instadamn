package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.JVn, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43728JVn implements MQ0 {
    public final /* synthetic */ C43731JVq A00;

    @Override // X.MQ0
    public final String AUq(UserSession userSession) {
        return "thread is not one to one";
    }

    public C43728JVn(C43731JVq c43731JVq) {
        this.A00 = c43731JVq;
    }

    @Override // X.MQ0
    public final /* bridge */ /* synthetic */ boolean AT8(UserSession userSession, Object obj) {
        String str;
        C43732JVr c43732JVr = (C43732JVr) obj;
        boolean A1a = AbstractC167017dG.A1a(c43732JVr, userSession);
        C06090Tz c06090Tz = C06090Tz.A05;
        if (!C18U.A06(c06090Tz, userSession, 36320326514844022L) && !C18U.A06(c06090Tz, userSession, 36320326514975096L) && c43732JVr.A03 != C05F.A01) {
            C2ED c2ed = c43732JVr.A01;
            if (c2ed != null || ((str = c43732JVr.A06) != null && (c2ed = (C2ED) this.A00.A02.invoke(userSession, str)) != null)) {
                return c2ed.CZe();
            }
            return A1a;
        }
        return A1a;
    }
}
