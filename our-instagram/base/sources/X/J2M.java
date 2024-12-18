package X;

import java.util.Map;

/* loaded from: classes7.dex */
public final class J2M implements InterfaceC43457JHv {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C41125IIq A01;
    public final /* synthetic */ C38321qM A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;

    public J2M(C41125IIq c41125IIq, C38321qM c38321qM, String str, String str2, int i) {
        this.A01 = c41125IIq;
        this.A03 = str;
        this.A02 = c38321qM;
        this.A04 = str2;
        this.A00 = i;
    }

    @Override // X.InterfaceC43457JHv
    public final /* bridge */ /* synthetic */ InterfaceC82443m8 B3n() {
        InterfaceC60442pS interfaceC60442pS = this.A01.A01;
        C82713mZ c82713mZ = new C82713mZ(interfaceC60442pS, "IMPRESSION");
        String str = this.A03;
        C38321qM c38321qM = this.A02;
        String str2 = this.A04;
        int i = this.A00;
        c82713mZ.A4T = str;
        AbstractC37303Gc4.A1F(c82713mZ, c38321qM, AbstractC25233BEq.A0o(c38321qM));
        c82713mZ.A4y = interfaceC60442pS.getModuleName();
        c82713mZ.A7Q = str2;
        c82713mZ.A09(i);
        return new C82753md(c82713mZ);
    }

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
        String str;
        boolean z;
        C38321qM c38321qM = this.A02;
        Integer num = null;
        if (!c38321qM.CdW()) {
            return null;
        }
        JMJ BVD = c38321qM.A0C.BVD();
        if (BVD == null || !AbstractC41071vF.A0O(this.A01.A00, c38321qM)) {
            BVD = null;
        }
        Map A0n = AbstractC167007dF.A0n("qe_universe", "ig4a_views_impression_metric_merlin_lac");
        String str2 = this.A04;
        if (BVD != null) {
            str = BVD.BVL();
            z = true;
            num = Integer.valueOf(BVD.BVI());
        } else {
            str = null;
            z = false;
        }
        return new J2P(num, str2, "explore", str, A0n, z);
    }
}
