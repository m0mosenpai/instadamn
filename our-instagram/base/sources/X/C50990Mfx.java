package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.Mfx, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50990Mfx extends AbstractC52922bZ {
    public final C2GT A00;
    public final C2GT A01;
    public final C2GT A02;
    public final C2GS A03;
    public final UserSession A04;
    public final C55622On7 A05;
    public final NNE A06;
    public final C05A A07;
    public final C0UO A08;
    public final C2GS A09;
    public final C2GS A0A;
    public final C56725PFt A0B;
    public final C23031Ai A0C;
    public final InterfaceC16820sZ A0D;

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0024, code lost:
    
        if (X.C196218mC.A00(r3.A04) == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C50990Mfx(com.instagram.common.session.UserSession r4, X.C55622On7 r5, X.NNE r6, X.C23031Ai r7, X.InterfaceC16820sZ r8) {
        /*
            r3 = this;
            r2 = 1
            X.AbstractC167027dH.A0a(r2, r4, r7, r6, r5)
            r0 = 5
            X.C14360o3.A0B(r8, r0)
            r3.<init>()
            r3.A04 = r4
            r3.A0C = r7
            r3.A06 = r6
            r3.A05 = r5
            r3.A0D = r8
            com.instagram.common.session.UserSession r0 = r5.A02
            boolean r0 = X.C180377zR.A07(r0)
            if (r0 == 0) goto L26
            com.instagram.common.session.UserSession r0 = r3.A04
            boolean r0 = X.C196218mC.A00(r0)
            r1 = 1
            if (r0 != 0) goto L27
        L26:
            r1 = 0
        L27:
            X.47Z r0 = r6.A02
            r0.A5T = r1
            X.PrA r0 = r6.A01
            r0.Edr(r1)
            r1 = 34
            X.PgZ r0 = new X.PgZ
            r0.<init>(r3, r1)
            r5.A00 = r0
            r1 = 2
            X.PFt r0 = new X.PFt
            r0.<init>(r3, r1)
            r3.A0B = r0
            X.2GS r0 = X.MSW.A0E()
            r3.A03 = r0
            r3.A02 = r0
            X.2GS r0 = X.MSW.A0E()
            r3.A09 = r0
            r3.A00 = r0
            X.2GS r0 = X.MSW.A0E()
            r3.A0A = r0
            r3.A01 = r0
            X.02u r0 = X.AbstractC25235BEs.A1A(r2)
            r3.A07 = r0
            r3.A08 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50990Mfx.<init>(com.instagram.common.session.UserSession, X.On7, X.NNE, X.1Ai, X.0sZ):void");
    }

    public final void A00() {
        NNE nne = this.A06;
        C47Z c47z = nne.A02;
        C55622On7 c55622On7 = this.A05;
        C56725PFt c56725PFt = this.A0B;
        AbstractC167007dF.A1K(c47z, c56725PFt);
        EnumC53382NjX.A05.A05(c55622On7.A01, c55622On7.A02, c47z, c56725PFt, null, null, false);
        boolean z = c47z.A5T;
        c47z.A5T = z;
        nne.A01.Edr(z);
    }

    public final void A01() {
        C2GS c2gs;
        int i;
        AbstractC54547O7z abstractC54547O7z;
        String str;
        int i2;
        UserSession userSession = this.A05.A02;
        if (C180377zR.A07(userSession)) {
            c2gs = this.A09;
            str = C196068lw.A00(userSession).A00(C55622On7.A03).A04;
            C196218mC.A00(this.A04);
            i2 = 35;
        } else {
            UserSession userSession2 = this.A04;
            if (AbstractC196078lx.A01(userSession2)) {
                User A10 = AbstractC166987dD.A10(userSession2);
                String Baz = A10.A03.Baz();
                boolean z = false;
                if (((Baz == null || Baz.length() == 0) && A10.A1u()) || A10.A1K()) {
                    z = true;
                }
                c2gs = this.A09;
                if (z) {
                    i = 36;
                } else {
                    str = C196068lw.A00(userSession).A00(C55622On7.A03).A04;
                    C196218mC.A00(userSession2);
                    i2 = 37;
                }
            } else {
                c2gs = this.A09;
                i = 38;
            }
            abstractC54547O7z = new AbstractC54547O7z(null, new C57561PgZ(this, i));
            c2gs.A0B(abstractC54547O7z);
        }
        C57561PgZ c57561PgZ = new C57561PgZ(this, i2);
        C14360o3.A0B(str, 1);
        abstractC54547O7z = new AbstractC54547O7z(str, c57561PgZ);
        c2gs.A0B(abstractC54547O7z);
    }
}
