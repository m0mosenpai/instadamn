package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.HHd, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39053HHd extends AbstractC61132qb {
    public final UserSession A00;
    public final ILP A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public C39053HHd(UserSession userSession, ILP ilp, String str, String str2, String str3, String str4) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = ilp;
        this.A04 = str;
        this.A05 = str2;
        this.A02 = str3;
        this.A03 = str4;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        return new C38322GtH(this.A00, this.A01, this.A04, this.A05, this.A02, this.A03);
    }
}
