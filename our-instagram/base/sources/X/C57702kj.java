package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.2kj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C57702kj extends AbstractC57542kT {
    public final C25301Lk A00;
    public final String A01;

    /* JADX WARN: Type inference failed for: r2v0, types: [X.1Li, java.lang.Object] */
    public static C57702kj A00(UserSession userSession) {
        C57502kP A00 = AbstractC57492kO.A00(userSession);
        C57702kj c57702kj = (C57702kj) ((AbstractC57542kT) A00.A04.get(C57702kj.class));
        if (c57702kj == null) {
            C57702kj c57702kj2 = new C57702kj(new C25301Lk(AbstractC12290kX.A00, (InterfaceC25281Li) new Object(), 607242469), userSession);
            A00.A03(c57702kj2, C57702kj.class);
            return c57702kj2;
        }
        return c57702kj;
    }

    public static String A01(C41159IJy c41159IJy) {
        StringBuilder sb = new StringBuilder();
        sb.append(c41159IJy.A03);
        sb.append("_");
        sb.append(c41159IJy.A04);
        sb.append("_");
        sb.append(c41159IJy.A01);
        return sb.toString();
    }

    public C57702kj(C25301Lk c25301Lk, UserSession userSession) {
        super(userSession);
        this.A01 = AnonymousClass001.A0R("pending_reel_quiz_responses_", userSession.userId);
        this.A00 = c25301Lk;
    }
}
