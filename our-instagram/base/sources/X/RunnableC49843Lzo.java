package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Lzo, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC49843Lzo implements Runnable {
    public final /* synthetic */ C67884V0q A00;

    public RunnableC49843Lzo(C67884V0q c67884V0q) {
        this.A00 = c67884V0q;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC155756z4.A00().A00();
        C67884V0q c67884V0q = this.A00;
        UserSession A0M = AbstractC31180DnO.A0M(c67884V0q.A0F);
        C45467KBc c45467KBc = new C45467KBc();
        AbstractC25233BEq.A15(c45467KBc, "IgSessionManager.SESSION_TOKEN_KEY", A0M.token);
        C14240no c14240no = new C14240no(c67884V0q.getParentFragmentManager());
        AbstractC25226BEj.A1P(c67884V0q);
        c14240no.A0D(c45467KBc, c45467KBc.mTag, AbstractC43594JPz.A0E(c67884V0q.requireView()).getId());
        c14240no.A0I(null);
        c14240no.A00();
    }
}
