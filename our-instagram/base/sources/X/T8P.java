package X;

import java.util.Arrays;

/* loaded from: classes10.dex */
public final class T8P implements InterfaceC65518Tln {
    public final InterfaceC65518Tln A00;
    public final byte[] A01;

    @Override // X.InterfaceC65518Tln
    public final byte[] AOR(byte[] ciphertext, byte[] associatedData) {
        InterfaceC65518Tln interfaceC65518Tln;
        byte[] bArr = this.A01;
        if (bArr.length == 0) {
            interfaceC65518Tln = this.A00;
        } else if (AbstractC58538Px6.A02(bArr, ciphertext)) {
            interfaceC65518Tln = this.A00;
            ciphertext = Arrays.copyOfRange(ciphertext, 5, ciphertext.length);
        } else {
            throw AbstractC58318PtA.A0x("wrong prefix");
        }
        return interfaceC65518Tln.AOR(ciphertext, associatedData);
    }

    @Override // X.InterfaceC65518Tln
    public final byte[] ASM(byte[] plaintext, byte[] associatedData) {
        byte[] bArr = this.A01;
        if (bArr.length == 0) {
            return this.A00.ASM(plaintext, associatedData);
        }
        return AbstractC63315ShN.A04(bArr, this.A00.ASM(plaintext, associatedData));
    }

    public T8P(InterfaceC65518Tln rawAead, byte[] identifier) {
        this.A00 = rawAead;
        int length = identifier.length;
        if (length != 0 && length != 5) {
            throw AbstractC166987dD.A12("identifier has an invalid length");
        }
        this.A01 = identifier;
    }
}
