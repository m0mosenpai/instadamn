package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Mfp, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50982Mfp extends AbstractC52922bZ {
    public AbstractC53540Nm7 A00;
    public final float A01;
    public final int A02;
    public final int A03;
    public final C2GT A04;
    public final C2GT A05;
    public final C2GT A06;
    public final C2GT A07;
    public final C2GT A08;
    public final C2GT A09;
    public final C2GS A0A;
    public final C2GS A0B;
    public final C2GS A0C;
    public final InterfaceC58179Pqj A0D;
    public final OEB A0E;
    public final InterfaceC24731Iq A0F;
    public final InterfaceC19390xP A0G;
    public final C05A A0H;
    public final C05A A0I;
    public final C2GS A0J;
    public final C2GS A0K;
    public final UserSession A0L;

    /* JADX WARN: Type inference failed for: r0v10, types: [X.2GT, X.2GS] */
    /* JADX WARN: Type inference failed for: r0v8, types: [X.2GT, X.2GS] */
    /* JADX WARN: Type inference failed for: r0v9, types: [X.2GT, X.2GS] */
    public C50982Mfp(UserSession userSession, InterfaceC58179Pqj interfaceC58179Pqj, OEB oeb, float f, int i, int i2) {
        AbstractC167017dG.A1T(oeb, userSession);
        this.A0D = interfaceC58179Pqj;
        this.A01 = f;
        this.A03 = i;
        this.A02 = i2;
        this.A0E = oeb;
        this.A0L = userSession;
        C24721Ip A0q = MSX.A0q();
        this.A0F = A0q;
        this.A0G = AbstractC07080Za.A03(A0q);
        NXY nxy = NXY.A00;
        C008002u A00 = C10E.A00(nxy);
        this.A0H = A00;
        this.A00 = nxy;
        C008002u A1H = AbstractC25225BEi.A1H(false);
        this.A0I = A1H;
        C15150pV A03 = C10Q.A03(new C57178Pa3(this, null, 2), A00, A1H);
        this.A09 = AbstractC31172DnG.A0E(AbstractC208910l.A01(new C51758Mth((AbstractC53540Nm7) nxy, true), AbstractC141776au.A00(this), A03, C10I.A00));
        C2GS A0E = MSW.A0E();
        this.A0B = A0E;
        this.A07 = A0E;
        ?? c2gt = new C2GT(0);
        this.A0J = c2gt;
        this.A05 = c2gt;
        ?? c2gt2 = new C2GT(0);
        this.A0K = c2gt2;
        this.A06 = c2gt2;
        ?? c2gt3 = new C2GT(false);
        this.A0C = c2gt3;
        this.A08 = c2gt3;
        C2GS A0E2 = MSW.A0E();
        this.A0A = A0E2;
        this.A04 = A0E2;
    }

    public final void A00(int i, boolean z) {
        MSX.A19(this.A0K, i);
        int i2 = this.A03;
        int i3 = i2 + (((this.A02 - i2) * i) / 100);
        MSX.A19(this.A0J, i3);
        this.A0I.Egh(false);
        this.A0C.A0B(false);
        if (!z) {
            NXZ nxz = NXZ.A00;
            C05A c05a = this.A0H;
            this.A00 = (AbstractC53540Nm7) c05a.getValue();
            c05a.Egh(nxz);
        }
        C57155PYz.A00(this, AbstractC141776au.A00(this), i3, 32);
    }
}
