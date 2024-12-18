package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.LhD, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48745LhD implements InterfaceC37208GaJ {
    public final C43655JSn A00;
    public final UserSession A03;
    public final C41761wQ A02 = AbstractC31173DnH.A0S();
    public final C41761wQ A01 = new C41761wQ(null);

    @Override // X.InterfaceC37208GaJ
    public final C42221xC ANf() {
        return this.A00.A01.A0K(C48414LbT.A00);
    }

    @Override // X.InterfaceC37208GaJ
    public final C42221xC ANg() {
        return this.A00.A01.A0K(C48415LbU.A00);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [X.MNN, java.lang.Object] */
    @Override // X.InterfaceC37208GaJ
    public final void ChV() {
        this.A00.A01(new Object());
    }

    @Override // X.InterfaceC37208GaJ
    public final void start() {
        this.A00.A00();
        UserSession userSession = this.A03;
        JQn.A00(C43601JQh.A00(C137766Ly.A00(C137746Lw.A00(userSession, "CutoverThreadListLoaderImpl").A01), MKF.A00, 2), this.A02, this, 27);
        if (C18U.A06(C06090Tz.A05, userSession, 36313042255546035L)) {
            Object A01 = userSession.A01(C47362KwB.class, C50207MFo.A00);
            JQn.A00(ANf(), this.A01, A01, 28);
        }
    }

    @Override // X.InterfaceC37208GaJ
    public final void stop() {
        this.A00.A03.A01();
        this.A02.A01();
        this.A01.A01();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, X.KiG] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, X.KiG] */
    public C48745LhD(UserSession userSession) {
        this.A03 = userSession;
        this.A00 = new C43655JSn(C42221xC.A09(new C45278K2g(null, null, false)), AbstractC142856cl.A00, AbstractC16960so.A1Q(new Object(), new Object()), AbstractC166987dD.A1J(new C45968KVw(C6JW.A00(userSession, "CutoverThreadListLoaderImpl"))));
    }
}
