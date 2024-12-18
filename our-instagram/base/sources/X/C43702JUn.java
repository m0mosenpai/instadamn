package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;

/* renamed from: X.JUn, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43702JUn extends AbstractC161727Mh implements InterfaceC159057Br {
    public static final C43700JUl A05 = new Object();
    public final UserSession A00;
    public final C43701JUm A01;
    public final AnonymousClass988 A02;
    public final C7IM A03;
    public final C18A A04;

    @Override // X.AbstractC161727Mh
    public final /* bridge */ /* synthetic */ InterfaceC66482zP A05(C160787Im c160787Im) {
        C14360o3.A0B(c160787Im, 0);
        C43701JUm c43701JUm = this.A01;
        Context A03 = AbstractC37301Gc2.A03(this);
        UserSession userSession = this.A00;
        C18A c18a = this.A04;
        return c43701JUm.AWm(A03, userSession, this.A02, c160787Im, this.A03, c18a, false);
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
        AnonymousClass791 anonymousClass791;
        C7QD c7qd = ((C7SP) ((AbstractC161677Mc) this).A00).A0M;
        C14360o3.A0C(c7qd, "null cannot be cast to non-null type com.instagram.direct.messagethread.media.MediaContentViewHolder<*>");
        InterfaceC59152nG interfaceC59152nG = ((JUG) c7qd).A09.getIgImageView().A0I;
        if (!(interfaceC59152nG instanceof AnonymousClass791) || (anonymousClass791 = (AnonymousClass791) interfaceC59152nG) == null) {
            return null;
        }
        return anonymousClass791.A04;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.JUm, java.lang.Object] */
    public C43702JUn(LayoutInflater layoutInflater, ViewGroup viewGroup, UserSession userSession, C7ZX c7zx, AnonymousClass988 anonymousClass988, C7A5 c7a5, C7IM c7im) {
        super(AbstractC43594JPz.A0X(layoutInflater, viewGroup, c7a5), c7a5, c7zx);
        this.A00 = userSession;
        this.A03 = c7im;
        this.A02 = anonymousClass988;
        this.A04 = AnonymousClass189.A00(userSession);
        this.A01 = new Object();
    }
}
