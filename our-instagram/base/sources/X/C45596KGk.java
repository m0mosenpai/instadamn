package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.KGk, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45596KGk extends AbstractC61132qb {
    public final UserSession A00;
    public final LLB A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public C45596KGk(UserSession userSession, LLB llb, String str, String str2, String str3) {
        AbstractC167007dF.A1G(userSession, 1, str3);
        this.A00 = userSession;
        this.A04 = str;
        this.A03 = str2;
        this.A01 = llb;
        this.A02 = str3;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        UserSession userSession = this.A00;
        C92904Eg A00 = AbstractC92894Ef.A00(userSession);
        return new Jn0(userSession, C4A5.A00(userSession), A00, this.A01, this.A04, this.A02, this.A03);
    }
}
