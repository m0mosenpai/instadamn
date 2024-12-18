package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Lq9, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49253Lq9 implements MQ0 {
    public final /* synthetic */ C47668L3b A00;

    @Override // X.MQ0
    public final boolean AT8(UserSession userSession, Object obj) {
        long j;
        C14360o3.A0B(userSession, 1);
        C47668L3b c47668L3b = this.A00;
        long currentTimeMillis = System.currentTimeMillis();
        C23031Ai c23031Ai = (C23031Ai) c47668L3b.A02.invoke(userSession);
        if (C18U.A06(C06090Tz.A06, userSession, 36315980007214946L)) {
            j = c23031Ai.A01.getLong("quiet_mode_next_end_timestamp", -1L) * 1000;
        } else {
            j = -1;
        }
        if (currentTimeMillis < j) {
            return false;
        }
        return true;
    }

    @Override // X.MQ0
    public final String AUq(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        if (AbstractC455527p.A01(userSession)) {
            return "app setting - sleep mode on";
        }
        return "app setting - quiet mode on";
    }

    public C49253Lq9(C47668L3b c47668L3b) {
        this.A00 = c47668L3b;
    }
}
