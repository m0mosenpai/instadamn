package X;

/* renamed from: X.WdT, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70591WdT implements InterfaceC38401qU {
    public final int A00;
    public final String A01;
    public final String A02;
    public final String A03;

    @Override // X.InterfaceC38401qU
    public final /* bridge */ /* synthetic */ InterfaceC109094vY BRN() {
        C69728VuN c69728VuN = new C69728VuN(new C109084vX(null, null, null, null, null, null, null, null, null, null, null, null, null, null));
        String str = this.A01;
        if (str == null) {
            str = "";
        }
        c69728VuN.A08 = str;
        c69728VuN.A01 = new C109874xF(Integer.valueOf(this.A00), null, null, null);
        c69728VuN.A0C = this.A02;
        return c69728VuN.A00();
    }

    @Override // X.InterfaceC38401qU
    public final void AHs() {
        throw new IllegalStateException("clearMediaCover is an unsupported operation");
    }

    @Override // X.InterfaceC38401qU
    public final String BU6() {
        return this.A03;
    }

    @Override // X.InterfaceC38401qU
    public final String Biv() {
        throw new IllegalStateException("getProviderAuthorId is an unsupported operation");
    }

    @Override // X.InterfaceC38401qU
    public final String Biw() {
        throw new IllegalStateException("getProviderId is an unsupported operation");
    }

    public C70591WdT(String str, String str2, int i, String str3) {
        this.A02 = str;
        this.A01 = str2;
        this.A00 = i;
        this.A03 = str3;
    }
}
