package X;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: classes10.dex */
public final class T8R implements InterfaceC65518Tln {
    public final RTU A00;
    public final byte[] A01;

    @Override // X.InterfaceC65518Tln
    public final byte[] ASM(final byte[] plaintext, final byte[] associatedData) {
        ByteBuffer allocate = ByteBuffer.allocate(plaintext.length + 24 + 16);
        byte[] A00 = AbstractC58567Pxj.A00(24);
        allocate.put(A00);
        this.A00.A01(allocate, A00, plaintext, associatedData);
        byte[] array = allocate.array();
        byte[] bArr = this.A01;
        if (bArr.length != 0) {
            return AbstractC63315ShN.A01(bArr, array);
        }
        return array;
    }

    @Override // X.InterfaceC65518Tln
    public final byte[] AOR(final byte[] ciphertext, final byte[] associatedData) {
        byte[] bArr = this.A01;
        int length = bArr.length;
        if (length != 0) {
            if (AbstractC58538Px6.A02(bArr, ciphertext)) {
                ciphertext = Arrays.copyOfRange(ciphertext, length, ciphertext.length);
            } else {
                throw AbstractC58318PtA.A0x("Decryption failed (OutputPrefix mismatch).");
            }
        }
        int length2 = ciphertext.length;
        if (length2 >= 40) {
            byte[] copyOf = Arrays.copyOf(ciphertext, 24);
            return this.A00.A02(ByteBuffer.wrap(ciphertext, 24, length2 - 24), copyOf, associatedData);
        }
        throw AbstractC58318PtA.A0x("ciphertext too short");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.RTU, X.Ser] */
    public T8R(final byte[] key, final byte[] outputPrefix) {
        this.A00 = new AbstractC63189Ser(key);
        this.A01 = outputPrefix;
    }
}
