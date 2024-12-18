package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.2kn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C57742kn extends AbstractC57542kT {
    public final C25301Lk A00;
    public final String A01;

    /* JADX WARN: Type inference failed for: r2v0, types: [X.1Li, java.lang.Object] */
    public static C57742kn A00(UserSession userSession) {
        C57502kP A00 = AbstractC57492kO.A00(userSession);
        C57742kn c57742kn = (C57742kn) ((AbstractC57542kT) A00.A04.get(C57742kn.class));
        if (c57742kn == null) {
            C57742kn c57742kn2 = new C57742kn(new C25301Lk(AbstractC12290kX.A00, (InterfaceC25281Li) new Object(), 1861410123), userSession);
            A00.A03(c57742kn2, C57742kn.class);
            return c57742kn2;
        }
        return c57742kn;
    }

    public C57742kn(C25301Lk c25301Lk, UserSession userSession) {
        super(userSession);
        this.A01 = AnonymousClass001.A0R("pending_reel_countdown_follow_requests_", userSession.userId);
        this.A00 = c25301Lk;
    }
}
