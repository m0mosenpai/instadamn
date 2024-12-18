package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.JVp, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43730JVp implements MQ0 {
    public final /* synthetic */ C43731JVq A00;

    @Override // X.MQ0
    public final boolean AT8(UserSession userSession, Object obj) {
        C14360o3.A0B(userSession, 1);
        if (AbstractC25231BEo.A1b(this.A00.A01) && C18U.A06(C06090Tz.A05, userSession, 36321872702351225L)) {
            return false;
        }
        return true;
    }

    @Override // X.MQ0
    public final String AUq(UserSession userSession) {
        return "user is in UFAC";
    }

    public C43730JVp(C43731JVq c43731JVq) {
        this.A00 = c43731JVq;
    }
}
