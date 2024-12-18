package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Bp6, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26609Bp6 extends AbstractC77583di {
    public final int A00;
    public final int A01;
    public final C169277h1 A02;
    public final UserSession A03;
    public final C51722Yv A04;

    public C26609Bp6(C51722Yv c51722Yv, C169277h1 c169277h1, UserSession userSession, int i, int i2) {
        C14360o3.A0B(userSession, 1);
        this.A03 = userSession;
        this.A02 = c169277h1;
        this.A01 = i;
        this.A00 = i2;
        this.A04 = c51722Yv;
    }

    @Override // X.AbstractC77583di
    public final C78053eX A0Y(C77993eR c77993eR) {
        C14360o3.A0B(c77993eR, 0);
        C169277h1 c169277h1 = this.A02;
        Object A00 = AbstractC77183d4.A00(c77993eR, new J7Q(this, 1), new Object[]{c169277h1});
        UserSession userSession = this.A03;
        int i = this.A01;
        Object A002 = AbstractC77183d4.A00(c77993eR, new ME5(4, A00, this, c77993eR), new Object[]{userSession, A00, c169277h1, Integer.valueOf(i)});
        return AbstractC25225BEi.A0g(this.A04, new C29038CrR(c169277h1, i), AbstractC25229BEm.A0c(c77993eR, AbstractC25227BEk.A0d(C28981CqW.A00, 3, true), C29738DAi.A00, new C50369MLw(38, this, A002)));
    }
}
