package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.BwA, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27030BwA extends AbstractC61132qb {
    public final UserSession A00;
    public final Integer A01;
    public final Integer A02;

    public C27030BwA(UserSession userSession, Integer num, Integer num2) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = num;
        this.A02 = num2;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        return new C26902Bu5(new C27260C1d(AbstractC40691uc.A01(this.A00)), this.A01, this.A02);
    }
}
