package X;

import com.instagram.user.model.User;

/* renamed from: X.NZd, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52820NZd extends AbstractC52821NZe implements GZU {
    public AnonymousClass195 A00;
    public final FR7 A01;
    public final C52864NaL A02;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C52820NZd(android.view.View r11, X.AbstractC59962oe r12, com.instagram.common.session.UserSession r13, boolean r14) {
        /*
            r10 = this;
            r0 = 2
            r7 = r13
            X.C14360o3.A0B(r13, r0)
            r0 = 24
            X.D8O r5 = new X.D8O
            r6 = r12
            r5.<init>(r0, r12, r13, r14)
            r0 = 8
            X.PgL r2 = new X.PgL
            r2.<init>(r12, r0)
            X.0dv r1 = X.EnumC09460dv.A02
            r0 = 9
            X.0do r4 = X.C57547PgL.A01(r2, r1, r0)
            java.lang.Class<X.NaL> r0 = X.C52864NaL.class
            X.0YZ r3 = X.AbstractC25225BEi.A1D(r0)
            r0 = 10
            X.PgL r2 = new X.PgL
            r2.<init>(r4, r0)
            r1 = 0
            r0 = 27
            X.Pg6 r0 = X.C57532Pg6.A00(r1, r4, r0)
            java.lang.Object r9 = X.MSY.A0c(r2, r5, r0, r3)
            X.NaL r9 = (X.C52864NaL) r9
            r0 = 4
            X.C14360o3.A0B(r9, r0)
            X.6cg r8 = X.EnumC142806cg.A03
            r4 = r10
            r5 = r11
            r4.<init>(r5, r6, r7, r8, r9)
            r10.A02 = r9
            X.FR7 r0 = new X.FR7
            r0.<init>(r12, r13)
            r10.A01 = r0
            r10.A06()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52820NZd.<init>(android.view.View, X.2oe, com.instagram.common.session.UserSession, boolean):void");
    }

    @Override // X.GZU
    public final void Ddb(User user, boolean z) {
    }

    @Override // X.PJ0, X.InterfaceC58172Pqc
    public final void CvU() {
        C52864NaL c52864NaL = this.A02;
        PZE.A02(c52864NaL, AbstractC141776au.A00(c52864NaL), 43);
    }

    @Override // X.PJ0, X.InterfaceC58172Pqc
    public final void DYi(C56803PIu c56803PIu) {
        String str;
        C52864NaL c52864NaL = this.A02;
        C51709Mse A0U = MSX.A0U(((AbstractC51025MgY) c52864NaL).A07);
        if (A0U != null && (str = A0U.A08) != null) {
            AbstractC166987dD.A1Z(new PZQ(c56803PIu, c52864NaL, str, null, 22), AbstractC141776au.A00(c52864NaL));
        }
    }

    @Override // X.GZU
    public final void Dda() {
        this.A07.A01();
    }

    @Override // X.AbstractC52821NZe
    public final void A07() {
        super.A07();
        this.A00 = MSY.A0r(this.A00);
    }

    @Override // X.AbstractC52821NZe
    public final void A08() {
        super.A08();
        if (this.A00 == null) {
            this.A00 = AbstractC18560vj.A03(AbstractC25235BEs.A0S(((PJ0) this).A04), C57167PZl.A02(this, this.A02.A04, 11));
        }
    }
}
