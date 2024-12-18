package X;

/* renamed from: X.AUt, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23308AUt implements InterfaceC25210BDi {
    public final long A00;
    public final String A04;
    public final C2GS A03 = new C2GS();
    public final C2GS A02 = new C2GS();
    public final C2GS A01 = new C2GS();

    @Override // X.InterfaceC25210BDi
    public final C2GS Aw7() {
        return this.A01;
    }

    @Override // X.InterfaceC25210BDi
    public final C2GS BHf() {
        return this.A02;
    }

    @Override // X.InterfaceC25210BDi
    public final long BZF() {
        return this.A00;
    }

    @Override // X.InterfaceC25210BDi
    public final C2GS CDn() {
        return this.A03;
    }

    @Override // X.InterfaceC25210BDi
    public final String getSessionId() {
        return this.A04;
    }

    public C23308AUt(String str, long j) {
        this.A04 = str;
        this.A00 = j;
    }
}
