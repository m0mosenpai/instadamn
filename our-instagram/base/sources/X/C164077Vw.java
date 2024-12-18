package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.7Vw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C164077Vw extends AbstractC61132qb {
    public final UserSession A00;
    public final C98K A01;
    public final AnonymousClass988 A02;
    public final C7VV A03;
    public final C7VF A04;
    public final InterfaceC164017Vq A05;

    public C164077Vw(UserSession userSession, C98K c98k, AnonymousClass988 anonymousClass988, C7VV c7vv, C7VF c7vf, InterfaceC164017Vq interfaceC164017Vq) {
        C14360o3.A0B(c7vf, 2);
        C14360o3.A0B(anonymousClass988, 3);
        C14360o3.A0B(c98k, 6);
        this.A00 = userSession;
        this.A04 = c7vf;
        this.A02 = anonymousClass988;
        this.A03 = c7vv;
        this.A05 = interfaceC164017Vq;
        this.A01 = c98k;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        UserSession userSession = this.A00;
        C7VF c7vf = this.A04;
        return new C164087Vx(userSession, this.A01, this.A02, this.A03, c7vf, this.A05);
    }
}
