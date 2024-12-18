package X;

import java.io.File;

/* renamed from: X.One, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55653One implements XE6 {
    public final /* synthetic */ N0Z A00;
    public final /* synthetic */ C6FQ A01;
    public final /* synthetic */ InterfaceC103384lE A02;
    public final /* synthetic */ InterfaceC103384lE A03;
    public final /* synthetic */ InterfaceC103384lE A04;
    public final /* synthetic */ File A05;

    @Override // X.XE6
    public final void D6h(W63 w63) {
        C14360o3.A0B(w63, 0);
        N0Z n0z = this.A00;
        C19L c19l = n0z.A04;
        if (c19l == null) {
            C14360o3.A0F("uiScope");
            throw C00O.createAndThrow();
        }
        AbstractC166987dD.A1Z(new MC0(n0z, w63, this.A04, this.A01, this.A03, this.A05, null, 0), c19l);
    }

    @Override // X.XE6
    public final void DFz(VIA via) {
        C14360o3.A0B(via, 0);
        N0Z n0z = this.A00;
        C19L c19l = n0z.A04;
        if (c19l == null) {
            C14360o3.A0F("uiScope");
            throw C00O.createAndThrow();
        }
        AbstractC166987dD.A1Z(new C50124MBy(n0z, via, this.A03, this.A01, this.A05, null, 0), c19l);
    }

    @Override // X.XE6
    public final void Dbk(float f) {
    }

    @Override // X.XE6
    public final void onStart() {
    }

    public C55653One(N0Z n0z, C6FQ c6fq, InterfaceC103384lE interfaceC103384lE, InterfaceC103384lE interfaceC103384lE2, InterfaceC103384lE interfaceC103384lE3, File file) {
        this.A00 = n0z;
        this.A03 = interfaceC103384lE;
        this.A01 = c6fq;
        this.A05 = file;
        this.A02 = interfaceC103384lE2;
        this.A04 = interfaceC103384lE3;
    }

    @Override // X.XE6
    public final void D1z() {
        N0Z n0z = this.A00;
        C19L c19l = n0z.A04;
        if (c19l == null) {
            C14360o3.A0F("uiScope");
            throw C00O.createAndThrow();
        }
        AbstractC166987dD.A1Z(new PZ3(this.A02, n0z, this.A01, this.A05, (InterfaceC23621Ds) null, 4), c19l);
    }
}
