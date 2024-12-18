package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class KZ8 extends C4A7 {
    public C41027IEw A00;
    public final C55083Oaf A01;
    public final UserSession A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KZ8(UserSession userSession) {
        super("SpotifyRepository", C4A8.A01(612043831, 2));
        C14360o3.A0B(userSession, 1);
        this.A02 = userSession;
        this.A01 = new C55083Oaf(userSession);
    }
}
