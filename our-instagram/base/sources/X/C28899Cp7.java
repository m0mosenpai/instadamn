package X;

import com.meta.foa.session.FoaUserSession;

/* renamed from: X.Cp7, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28899Cp7 implements BDZ {
    public final /* synthetic */ C23432Aa5 A00;
    public final /* synthetic */ C76223bS A01;
    public final /* synthetic */ C51762Yz A02;
    public final /* synthetic */ C26493BnE A03;

    @Override // X.BDZ
    public final void D1X(String str, String str2) {
    }

    @Override // X.BDZ
    public final void D1b() {
    }

    public C28899Cp7(C23432Aa5 c23432Aa5, C76223bS c76223bS, C51762Yz c51762Yz, C26493BnE c26493BnE) {
        this.A02 = c51762Yz;
        this.A03 = c26493BnE;
        this.A01 = c76223bS;
        this.A00 = c23432Aa5;
    }

    @Override // X.BDZ
    public final void D1S(Exception exc) {
        this.A03.A02.invoke(new C4F(C29500CzE.A00));
    }

    @Override // X.BDZ
    public final void D1W() {
        this.A02.A03(C30146DQc.A00);
        C26493BnE c26493BnE = this.A03;
        c26493BnE.A02.invoke(new C4F(C29496CzA.A00));
        this.A01.A05.A0C.getApplicationContext();
        FoaUserSession foaUserSession = c26493BnE.A00;
        C23432Aa5 c23432Aa5 = this.A00;
        C19L c19l = c26493BnE.A03;
        C28421CgT c28421CgT = c26493BnE.A01;
        C30182DRn A01 = C30182DRn.A01(c26493BnE, 47);
        AbstractC167017dG.A1P(foaUserSession, c23432Aa5);
        AbstractC167007dF.A1F(c19l, 3, c28421CgT);
        AbstractC23641Du.A05(C12L.A00.AOT(1033850869, 3), new B5a(c28421CgT, c23432Aa5, foaUserSession, A01, null, 3), c19l);
    }
}
