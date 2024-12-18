package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.JfM, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44157JfM extends AbstractC61132qb {
    public final UserSession A00;

    public C44157JfM(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.98o, java.lang.Object] */
    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        UserSession userSession = this.A00;
        C164387Xb A00 = AbstractC164377Xa.A00(userSession);
        ?? obj = new Object();
        C03250Di c03250Di = C03250Di.A00;
        C14360o3.A07(c03250Di);
        return new C44158JfN(c03250Di, userSession, obj, A00);
    }
}
