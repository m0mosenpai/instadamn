package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class KRP extends AbstractC161727Mh {
    public final UserSession A00;
    public final C48993Llh A01;
    public final AnonymousClass988 A02;
    public final C7IM A03;
    public final C18A A04;

    @Override // X.AbstractC161727Mh
    public final /* bridge */ /* synthetic */ InterfaceC66482zP A05(C160787Im c160787Im) {
        C48993Llh c48993Llh = this.A01;
        Context A05 = AbstractC31172DnG.A05(this);
        UserSession userSession = this.A00;
        C18A c18a = this.A04;
        return c48993Llh.AWm(A05, userSession, this.A02, c160787Im, this.A03, c18a, false);
    }

    public KRP(UserSession userSession, C7SP c7sp, C7ZX c7zx, AnonymousClass988 anonymousClass988, C45883KSm c45883KSm, C7IM c7im) {
        super(c7sp, c45883KSm, c7zx);
        this.A00 = userSession;
        this.A04 = AnonymousClass189.A00(userSession);
        this.A03 = c7im;
        this.A02 = anonymousClass988;
        this.A01 = new C48993Llh(AbstractC09440dt.A01(new M8Y(c7im, 2)));
    }
}
