package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.BwR, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27047BwR extends AbstractC61132qb {
    public final UserSession A00;
    public final C38321qM A01;
    public final List A02;
    public final List A03;
    public final List A04;

    public C27047BwR(UserSession userSession, C38321qM c38321qM, List list, List list2, List list3) {
        AbstractC167007dF.A1G(userSession, 1, c38321qM);
        this.A00 = userSession;
        this.A02 = list;
        this.A03 = list2;
        this.A04 = list3;
        this.A01 = c38321qM;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        String str;
        UserSession userSession = this.A00;
        C52678NSa A00 = CK4.A00(userSession);
        C38321qM c38321qM = this.A01;
        C3x9 A0u = AbstractC25226BEj.A0u(c38321qM);
        if (A0u != null) {
            str = A0u.getMusicCanonicalId();
        } else {
            str = null;
        }
        return new C25844Bbz(userSession, c38321qM, A00, new CR5(userSession, str), this.A02, this.A03, this.A04);
    }
}
