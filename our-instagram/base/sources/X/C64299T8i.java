package X;

/* renamed from: X.T8i, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64299T8i implements InterfaceC65427Tjy {
    public final InterfaceC65427Tjy A00;
    public final byte[] A01;

    @Override // X.InterfaceC65427Tjy
    public final byte[] ASM(final byte[] plaintext, final byte[] contextInfo) {
        byte[] bArr = this.A01;
        if (bArr.length == 0) {
            return this.A00.ASM(plaintext, contextInfo);
        }
        return AbstractC63315ShN.A04(bArr, this.A00.ASM(plaintext, contextInfo));
    }

    public C64299T8i(InterfaceC65427Tjy rawHybridEncrypt, byte[] outputPrefix) {
        this.A00 = rawHybridEncrypt;
        this.A01 = outputPrefix;
    }
}
