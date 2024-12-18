package X;

import java.io.File;

/* renamed from: X.AAz, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C22975AAz {
    public final /* synthetic */ C214899fR A00;

    public C22975AAz(C214899fR c214899fR) {
        this.A00 = c214899fR;
    }

    public final void A00() {
        C214899fR c214899fR = this.A00;
        File A00 = AbstractC53913Nsm.A00(AbstractC166987dD.A0r(c214899fR.A0M), ((AbstractC179917yh) C23432Aa5.A00(c214899fR.A01().A03.A09)).A00);
        AAB A01 = c214899fR.A01();
        AKN akn = A01.A03;
        C22973AAr c22973AAr = A01.A01;
        C14360o3.A0B(c22973AAr, 1);
        if (akn.A00 == 0) {
            c22973AAr.A00(AbstractC166987dD.A1D("Video recording is only supported in AR mode."));
        }
        akn.A09.A07(new C23320AVf(c22973AAr, akn), A00);
        C23656Adr.A00(EnumC223239t9.A0l, c214899fR.A02());
    }
}
