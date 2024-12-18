package X;

/* renamed from: X.7bG, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C165887bG implements InterfaceC164017Vq {
    public final C98N A00;
    public final C2055097z A01;
    public final InterfaceC42241xE A02;

    @Override // X.InterfaceC164017Vq
    public final void AUm() {
        this.A02.accept(false);
    }

    @Override // X.InterfaceC164017Vq
    public final void Eml(String str) {
        C69613Av c69613Av = this.A00.A08;
        if (c69613Av != null) {
            c69613Av.A08(str);
        }
        this.A01.A07.A01(str);
    }

    @Override // X.InterfaceC164017Vq
    public final void EpH(String str) {
        C69613Av c69613Av = this.A00.A08;
        if (c69613Av != null) {
            c69613Av.A05();
        }
        this.A01.A07.A02(str);
        this.A02.accept(true);
    }

    public C165887bG(C98N c98n, C2055097z c2055097z, InterfaceC42241xE interfaceC42241xE) {
        this.A00 = c98n;
        this.A01 = c2055097z;
        this.A02 = interfaceC42241xE;
    }
}
