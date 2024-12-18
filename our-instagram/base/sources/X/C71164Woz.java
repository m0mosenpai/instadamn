package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.Woz, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C71164Woz implements InterfaceC58092PpH {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ User A01;
    public final /* synthetic */ C71603Jf A02;
    public final /* synthetic */ String A03;

    public C71164Woz(UserSession userSession, User user, C71603Jf c71603Jf, String str) {
        this.A00 = userSession;
        this.A01 = user;
        this.A02 = c71603Jf;
        this.A03 = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, X.1vN] */
    @Override // X.InterfaceC58092PpH
    public final void DEO(Long l, Long l2, long j, long j2, boolean z) {
        AbstractC25651Mw.A00(this.A00).E4s(new Object());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.1vN] */
    @Override // X.InterfaceC58092PpH
    public final void DqU(Long l, Long l2, long j, long j2, boolean z) {
        UserSession userSession = this.A00;
        AbstractC25651Mw.A00(userSession).E4s(new Object());
        User user = this.A01;
        user.A1A(false);
        AbstractC206099Aq.A07(userSession, user, null, j, j2);
        user.A0u(C16930sl.A00);
        AbstractC206099Aq.A06(userSession);
        C19270xB c19270xB = new C19270xB("quiet_mode");
        AbstractC167017dG.A1N(userSession, c19270xB);
        new C65761Ttc(c19270xB, userSession).A03(this.A02.A03(0L), null, null, null, null, this.A03, false, true);
    }
}
