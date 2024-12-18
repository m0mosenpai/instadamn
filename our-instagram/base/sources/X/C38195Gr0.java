package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Gr0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38195Gr0 implements InterfaceC153186um {
    public final /* synthetic */ C38P A00;

    public C38195Gr0(C38P c38p) {
        this.A00 = c38p;
    }

    @Override // X.InterfaceC153186um
    public final int Bkn() {
        C38P c38p = this.A00;
        UserSession session = c38p.getSession();
        C14360o3.A0B(session, 0);
        C38217GrM c38217GrM = (C38217GrM) session.A01(C38217GrM.class, new J8V(session, 21));
        if (c38p.A00 == null) {
            C14360o3.A0F("navigationPerfLogger");
            throw C00O.createAndThrow();
        }
        return c38217GrM.A00.BOC(!((AbstractC69603Au) r0).A01);
    }
}
