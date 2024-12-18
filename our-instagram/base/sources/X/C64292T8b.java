package X;

import java.util.Arrays;

/* renamed from: X.T8b, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64292T8b implements InterfaceC65519Tlo {
    public final InterfaceC65519Tlo A00;
    public final PxH A01;
    public final byte[] A02;

    @Override // X.InterfaceC65519Tlo
    public final byte[] AOS(final byte[] ciphertext, final byte[] associatedData) {
        InterfaceC65519Tlo interfaceC65519Tlo;
        if (this.A01 == PxH.RAW) {
            interfaceC65519Tlo = this.A00;
        } else if (AbstractC58538Px6.A02(this.A02, ciphertext)) {
            interfaceC65519Tlo = this.A00;
            ciphertext = Arrays.copyOfRange(ciphertext, 5, ciphertext.length);
        } else {
            throw AbstractC58318PtA.A0x("wrong prefix");
        }
        return interfaceC65519Tlo.AOS(ciphertext, associatedData);
    }

    @Override // X.InterfaceC65519Tlo
    public final byte[] ASN(final byte[] plaintext, final byte[] associatedData) {
        if (this.A01 == PxH.RAW) {
            return this.A00.ASN(plaintext, associatedData);
        }
        return AbstractC63315ShN.A04(this.A02, this.A00.ASN(plaintext, associatedData));
    }

    public C64292T8b(InterfaceC65519Tlo rawDaead, PxH outputPrefixType, byte[] identifier) {
        this.A00 = rawDaead;
        this.A01 = outputPrefixType;
        this.A02 = identifier;
    }
}
