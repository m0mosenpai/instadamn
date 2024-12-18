package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.KSp, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45886KSp extends AbstractC162927Rd {
    public final UserSession A00;

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C45220K0a.class;
    }

    public C45886KSp(UserSession userSession, C7RX c7rx, C1579277b c1579277b) {
        super(c7rx, c1579277b);
        this.A00 = userSession;
    }

    @Override // X.AbstractC162927Rd, X.AbstractC66422zJ
    /* renamed from: A03, reason: merged with bridge method [inline-methods] */
    public final void bind(C7SP c7sp, C45220K0a c45220K0a) {
        AbstractC167017dG.A1N(c45220K0a, c7sp);
        UserSession userSession = this.A00;
        C14360o3.A0B(userSession, 0);
        if (!((C7TW) userSession.A01(C163417Te.class, C163407Td.A00)).A02(c45220K0a.A00.A0L.A02)) {
            ((C1579477e) c7sp.A0M).A0A.setVisibility(8);
        } else {
            super.bind(c45220K0a, c7sp);
        }
    }
}
