package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Afo, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23777Afo implements AnonymousClass866, C86B {
    public final UserSession A01;
    public final AnonymousClass866 A03;
    public final C86D A04 = new C86D("live_broadcast");
    public final InterfaceC09390do A02 = B8T.A02(this, 6);
    public final C86G A00 = C86G.A00;

    @Override // X.C86B
    public final InterfaceC19390xP ARK(C1810281e c1810281e) {
        C14360o3.A0B(c1810281e, 0);
        return new C50540MSt(AbstractC184118Fa.A00(c1810281e), 18);
    }

    @Override // X.AnonymousClass866
    public final boolean Akz() {
        return this.A03.Akz();
    }

    @Override // X.AnonymousClass866
    public final Integer B0k() {
        return this.A03.B0k();
    }

    @Override // X.AnonymousClass866
    public final boolean Bv5() {
        return this.A03.Bv5();
    }

    @Override // X.AnonymousClass866
    public final boolean Bv8() {
        return this.A03.Bv8();
    }

    @Override // X.AnonymousClass866
    public final boolean Bvf() {
        return this.A03.Bvf();
    }

    @Override // X.AnonymousClass866
    public final boolean Bvp() {
        return this.A03.Bvp();
    }

    @Override // X.C86B
    public final C86I AM7() {
        return new C173767oU((C1824487j) this.A02.getValue(), this.A00, null, EnumC190378bv.A04, this.A01);
    }

    @Override // X.C86B
    public final boolean Aky() {
        return false;
    }

    @Override // X.C86B
    public final EnumC190378bv B0f() {
        return EnumC190378bv.A04;
    }

    @Override // X.C86B
    public final C86D CAr() {
        return this.A04;
    }

    @Override // X.C86B
    public final boolean CSx() {
        return true;
    }

    public C23777Afo(UserSession userSession, AnonymousClass866 anonymousClass866) {
        this.A01 = userSession;
        this.A03 = anonymousClass866;
    }

    @Override // X.AnonymousClass866
    public final AbstractC191288dX ANN(C9CB c9cb, C85D c85d) {
        AbstractC167017dG.A1N(c85d, c9cb);
        return this.A03.ANN(c9cb, c85d);
    }
}
