package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Bbb, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25820Bbb extends AbstractC52922bZ {
    public final UserSession A00;
    public final C05A A01;
    public final C0UO A02;

    public C25820Bbb(UserSession userSession) {
        Integer num;
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        if (AbstractC75343a1.A07(userSession)) {
            num = C05F.A00;
        } else if (AbstractC75373a4.A06(userSession)) {
            num = C05F.A01;
        } else {
            num = C05F.A0C;
        }
        C008002u A1H = AbstractC25225BEi.A1H(new C51756Mtf(25, num));
        this.A01 = A1H;
        this.A02 = AbstractC208910l.A02(A1H);
    }
}
