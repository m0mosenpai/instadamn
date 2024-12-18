package X;

/* renamed from: X.CyQ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29450CyQ implements InterfaceC43457JHv {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C120985dq A01;
    public final /* synthetic */ C27909CRu A02;

    @Override // X.InterfaceC43457JHv
    public final /* bridge */ /* synthetic */ InterfaceC82443m8 B3o() {
        return null;
    }

    @Override // X.InterfaceC43457JHv
    public final /* bridge */ /* synthetic */ InterfaceC82443m8 B3p() {
        return null;
    }

    @Override // X.InterfaceC43457JHv
    public final /* bridge */ /* synthetic */ InterfaceC82443m8 BrL() {
        return null;
    }

    public C29450CyQ(C120985dq c120985dq, C27909CRu c27909CRu, int i) {
        this.A01 = c120985dq;
        this.A02 = c27909CRu;
        this.A00 = i;
    }

    @Override // X.InterfaceC43457JHv
    public final /* bridge */ /* synthetic */ InterfaceC82443m8 B3n() {
        C120985dq c120985dq = this.A01;
        C38321qM A0y = AbstractC25226BEj.A0y(c120985dq);
        InterfaceC60442pS interfaceC60442pS = this.A02.A00;
        C82713mZ c82713mZ = new C82713mZ(interfaceC60442pS, "IMPRESSION");
        int i = this.A00;
        c82713mZ.A4c = AbstractC25233BEq.A0o(A0y);
        c82713mZ.A0N(A0y.BRp());
        c82713mZ.A1f = Boolean.valueOf(!A0y.CdW());
        c82713mZ.A61 = AbstractC25226BEj.A0y(c120985dq).getId();
        c82713mZ.A09(i);
        c82713mZ.A4y = interfaceC60442pS.getModuleName();
        c82713mZ.A7Q = c120985dq.A06().A0j;
        return new C82753md(c82713mZ);
    }
}
