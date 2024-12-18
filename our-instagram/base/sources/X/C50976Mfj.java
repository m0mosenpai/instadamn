package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.Mfj, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50976Mfj extends AbstractC52922bZ {
    public C52679NSc A00;
    public boolean A01;
    public final UserSession A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final InterfaceC09390do A06;
    public final C05A A07;
    public final C0UO A08;

    public final void A00() {
        C05A c05a = this.A07;
        c05a.Egh(P6w.A00);
        UserSession userSession = this.A02;
        User A02 = AnonymousClass189.A00(userSession).A02(this.A05);
        if (A02 != null) {
            this.A00 = new C52679NSc(userSession, A02, this.A04, this.A03);
            c05a.Egh(new C56499P6u(A02));
        } else {
            AbstractC166987dD.A1Z(new PYs(this, null, 2), AbstractC141776au.A00(this));
        }
    }

    public C50976Mfj(UserSession userSession, MV3 mv3, String str, String str2, String str3) {
        this.A02 = userSession;
        this.A05 = str;
        this.A04 = str2;
        this.A03 = str3;
        this.A06 = AbstractC09440dt.A01(new C57257Pbf(14, mv3, new C8CY(mv3.A00)));
        C008002u A00 = C10E.A00(P6w.A00);
        this.A07 = A00;
        this.A08 = A00;
        AbstractC31176DnK.A1Z(this, AbstractC141776au.A00(this), 27);
    }
}
