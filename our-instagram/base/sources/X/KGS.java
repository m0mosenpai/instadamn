package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class KGS extends AbstractC61132qb {
    public final UserSession A00;
    public final LLR A01;
    public final boolean A02;

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        UserSession userSession = this.A00;
        boolean z = this.A02;
        return new C45995KXj(userSession, this.A01, AbstractC92954Eo.A00(userSession), z);
    }

    public KGS(UserSession userSession, LLR llr, boolean z) {
        AbstractC167017dG.A1Q(userSession, llr);
        this.A00 = userSession;
        this.A02 = z;
        this.A01 = llr;
    }
}
