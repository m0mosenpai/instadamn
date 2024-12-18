package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class KRE extends AbstractC161727Mh {
    public final UserSession A00;
    public final AnonymousClass988 A01;
    public final C7IM A02;
    public final C18A A03;

    @Override // X.AbstractC161727Mh
    public final /* bridge */ /* synthetic */ InterfaceC66482zP A05(C160787Im c160787Im) {
        C14360o3.A0B(c160787Im, 0);
        Context A03 = AbstractC37301Gc2.A03(this);
        UserSession userSession = this.A00;
        C18A c18a = this.A03;
        return C48995Llj.A00(A03, userSession, this.A01, c160787Im, this.A02, c18a, false);
    }

    public KRE(UserSession userSession, C7SP c7sp, C7ZX c7zx, AnonymousClass988 anonymousClass988, KSK ksk, C7IM c7im) {
        super(c7sp, ksk, c7zx);
        this.A02 = c7im;
        this.A00 = userSession;
        this.A01 = anonymousClass988;
        this.A03 = AnonymousClass189.A00(userSession);
    }
}
