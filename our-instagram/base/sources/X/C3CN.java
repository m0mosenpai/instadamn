package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.3CN, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3CN extends C3CO {
    public final C65192xH A00;

    public C3CN(UserSession userSession, final C65192xH c65192xH) {
        super(userSession, new C3CQ(c65192xH) { // from class: X.3CP
            public final C65192xH A00;

            @Override // X.C3CQ
            public final boolean AJk(C38321qM c38321qM) {
                C14360o3.A0B(c38321qM, 0);
                return ((C65322xU) ((AbstractC65202xI) this.A00).A00).A0F(c38321qM);
            }

            @Override // X.C3CQ
            public final void DSP(C38321qM c38321qM) {
                this.A00.A0A(-1);
            }

            {
                this.A00 = c65192xH;
            }
        }, true, false);
        this.A00 = c65192xH;
    }
}
