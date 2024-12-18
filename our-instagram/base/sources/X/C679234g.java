package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.34g, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C679234g extends AnonymousClass346 {
    public final InterfaceC60442pS A00;
    public final C678734b A01;
    public final C678834c A02;
    public final C34Q A03;
    public final C34U A04;
    public final C34Z A05;
    public final UserSession A06;
    public final C679134f A07;

    @Override // X.AnonymousClass346, X.AnonymousClass347
    public final void Cu2(C59072n8 c59072n8, C38321qM c38321qM, C75113Zb c75113Zb) {
        InterfaceC43071ya interfaceC43071ya;
        C14360o3.A0B(c59072n8, 0);
        C14360o3.A0B(c38321qM, 1);
        C14360o3.A0B(c75113Zb, 2);
        InterfaceC60442pS interfaceC60442pS = this.A00;
        if (AbstractC75423a9.A02(c38321qM, interfaceC60442pS)) {
            C34Q c34q = this.A03;
            c59072n8.A00(c34q.A03);
            c59072n8.A00(this.A04.A01);
            if (C18U.A06(C06090Tz.A05, this.A06, 36316843295707840L) && C14360o3.A0K(interfaceC60442pS.getModuleName(), "feed_timeline")) {
                c59072n8.A00(c34q.A04);
            }
            if (c75113Zb.A0o == AnonymousClass341.A0H) {
                interfaceC43071ya = this.A07.A00;
            } else {
                return;
            }
        } else {
            if (!AbstractC75423a9.A01(c38321qM, interfaceC60442pS)) {
                return;
            }
            c59072n8.A00(this.A03.A01);
            interfaceC43071ya = this.A04.A01;
        }
        c59072n8.A00(interfaceC43071ya);
    }

    public C679234g(UserSession userSession, InterfaceC60442pS interfaceC60442pS, C679134f c679134f, C678734b c678734b, C678834c c678834c, C34Q c34q, C34U c34u, C34Z c34z) {
        this.A03 = c34q;
        this.A04 = c34u;
        this.A05 = c34z;
        this.A01 = c678734b;
        this.A02 = c678834c;
        this.A07 = c679134f;
        this.A00 = interfaceC60442pS;
        this.A06 = userSession;
    }
}
