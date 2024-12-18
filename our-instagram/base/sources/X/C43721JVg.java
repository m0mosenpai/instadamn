package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.JVg, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43721JVg implements MQ0 {
    public final /* synthetic */ C43731JVq A00;

    @Override // X.MQ0
    public final String AUq(UserSession userSession) {
        return "message sent silently";
    }

    public C43721JVg(C43731JVq c43731JVq) {
        this.A00 = c43731JVq;
    }

    @Override // X.MQ0
    public final /* bridge */ /* synthetic */ boolean AT8(UserSession userSession, Object obj) {
        C43732JVr c43732JVr = (C43732JVr) obj;
        C14360o3.A0B(c43732JVr, 0);
        Boolean bool = c43732JVr.A02;
        if (bool != null && !bool.equals(false)) {
            return false;
        }
        return true;
    }
}
