package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Lzp, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC49844Lzp implements Runnable {
    public final /* synthetic */ KCH A00;

    public RunnableC49844Lzp(KCH kch) {
        this.A00 = kch;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC155756z4.A00().A00();
        KCH kch = this.A00;
        UserSession A0M = AbstractC31180DnO.A0M(kch.A0A);
        C45467KBc c45467KBc = new C45467KBc();
        AbstractC25233BEq.A15(c45467KBc, "IgSessionManager.SESSION_TOKEN_KEY", A0M.token);
        C14240no c14240no = new C14240no(kch.getParentFragmentManager());
        AbstractC25226BEj.A1P(kch);
        c14240no.A0D(c45467KBc, c45467KBc.mTag, AbstractC43594JPz.A0E(kch.requireView()).getId());
        c14240no.A0I(null);
        c14240no.A00();
    }
}
