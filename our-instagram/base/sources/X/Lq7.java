package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class Lq7 implements MQ0 {
    public final /* synthetic */ C47668L3b A00;

    @Override // X.MQ0
    public final /* bridge */ /* synthetic */ boolean AT8(UserSession userSession, Object obj) {
        C14360o3.A0B(userSession, 1);
        return !((C23031Ai) this.A00.A02.invoke(userSession)).A1m();
    }

    @Override // X.MQ0
    public final String AUq(UserSession userSession) {
        return "app setting - messages muted";
    }

    public Lq7(C47668L3b c47668L3b) {
        this.A00 = c47668L3b;
    }
}
