package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.LqB, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49255LqB implements MQ0 {
    public final MQ0 A00;

    @Override // X.MQ0
    public final boolean AT8(UserSession userSession, Object obj) {
        C14360o3.A0B(userSession, 1);
        return !this.A00.AT8(userSession, obj);
    }

    @Override // X.MQ0
    public final String AUq(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        return AbstractC25235BEs.A0r("Not (", this.A00.AUq(userSession));
    }

    public C49255LqB(MQ0 mq0) {
        this.A00 = mq0;
    }
}
