package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class KRZ extends AbstractC161727Mh {
    public final UserSession A00;
    public final C48994Lli A01;
    public final AnonymousClass988 A02;
    public final C7IM A03;
    public final C18A A04;

    @Override // X.AbstractC161727Mh
    public final /* bridge */ /* synthetic */ InterfaceC66482zP A05(C160787Im c160787Im) {
        C48994Lli c48994Lli = this.A01;
        Context A05 = AbstractC31172DnG.A05(this);
        UserSession userSession = this.A00;
        C18A c18a = this.A04;
        return c48994Lli.AWm(A05, userSession, this.A02, c160787Im, this.A03, c18a, false);
    }

    public KRZ(UserSession userSession, C98K c98k, C7SP c7sp, C7ZX c7zx, AnonymousClass988 anonymousClass988, KSY ksy, C7IM c7im) {
        super(c7sp, ksy, c7zx);
        this.A00 = userSession;
        this.A04 = AnonymousClass189.A00(userSession);
        this.A03 = c7im;
        this.A02 = anonymousClass988;
        this.A01 = new C48994Lli(c98k);
    }
}
