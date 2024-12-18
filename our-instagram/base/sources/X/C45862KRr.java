package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.KRr, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45862KRr extends AbstractC161727Mh implements InterfaceC159057Br {
    public final UserSession A00;
    public final C48979LlT A01;
    public final AnonymousClass988 A02;
    public final C7IM A03;
    public final C18A A04;

    @Override // X.AbstractC161727Mh
    public final /* bridge */ /* synthetic */ InterfaceC66482zP A05(C160787Im c160787Im) {
        C14360o3.A0B(c160787Im, 0);
        C48979LlT c48979LlT = this.A01;
        Context A03 = AbstractC37301Gc2.A03(this);
        UserSession userSession = this.A00;
        C18A c18a = this.A04;
        return c48979LlT.AWm(A03, userSession, this.A02, c160787Im, this.A03, c18a, false);
    }

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
        return AbstractC43593JPy.A0G(((C1585179m) ((C7SP) ((AbstractC161677Mc) this).A00).A0M).A03.getBackground());
    }

    public C45862KRr(UserSession userSession, C98K c98k, C7SP c7sp, C7ZX c7zx, AnonymousClass988 anonymousClass988, C45874KSd c45874KSd, C7IM c7im) {
        super(c7sp, c45874KSd, c7zx);
        this.A03 = c7im;
        this.A00 = userSession;
        this.A02 = anonymousClass988;
        this.A04 = AnonymousClass189.A00(userSession);
        this.A01 = new C48979LlT(c98k);
    }
}
