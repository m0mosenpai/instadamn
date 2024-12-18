package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.7Bq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C159047Bq extends AbstractC161727Mh implements InterfaceC159057Br {
    public final UserSession A00;
    public final C7BO A01;
    public final AnonymousClass988 A02;
    public final C7IM A03;
    public final C18A A04;

    @Override // X.InterfaceC162347Ow
    public final /* synthetic */ void AI4() {
        AbstractC43676JTk.A04(this);
    }

    @Override // X.InterfaceC162347Ow
    public final /* synthetic */ C74843Xy BLT() {
        return AbstractC43676JTk.A00(this);
    }

    @Override // X.InterfaceC162347Ow
    public final /* synthetic */ C74843Xy C0D() {
        return AbstractC43676JTk.A01(this);
    }

    @Override // X.InterfaceC162347Ow
    public final /* synthetic */ void Ctd(float f) {
        AbstractC43676JTk.A06(this, f);
    }

    @Override // X.InterfaceC162347Ow
    public final /* synthetic */ void EJl() {
        AbstractC43676JTk.A05(this);
    }

    @Override // X.InterfaceC162347Ow
    public final /* synthetic */ void Ec3(C74843Xy c74843Xy) {
        AbstractC43676JTk.A02(c74843Xy, this);
    }

    @Override // X.InterfaceC162347Ow
    public final /* synthetic */ void FCi(C74843Xy c74843Xy, float f) {
        AbstractC43676JTk.A03(c74843Xy, this, f);
    }

    @Override // X.InterfaceC159057Br
    public final C162247Oj BMM() {
        C7QD c7qd = ((C7SP) ((AbstractC161677Mc) this).A00).A0M;
        C14360o3.A0C(c7qd, "null cannot be cast to non-null type com.instagram.direct.messagethread.text.TextContentViewHolder<*>");
        return (C162247Oj) C162247Oj.A06.get(((C7BF) c7qd).A03.getBackground());
    }

    public C159047Bq(UserSession userSession, C98K c98k, C7SP c7sp, C7ZX c7zx, AnonymousClass988 anonymousClass988, C159037Bp c159037Bp, C7IM c7im) {
        super(c7sp, c159037Bp, c7zx);
        this.A03 = c7im;
        this.A00 = userSession;
        this.A02 = anonymousClass988;
        this.A04 = AnonymousClass189.A00(userSession);
        this.A01 = new C7BO(c98k);
    }
}
