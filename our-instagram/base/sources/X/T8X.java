package X;

import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.Arrays;

/* loaded from: classes10.dex */
public final class T8X implements InterfaceC65518Tln {
    public final int A00;
    public final InterfaceC65429Tk0 A01;
    public final C63142Sdo A02;
    public final byte[] A03;

    public static T8X A00(RTE key) {
        ThreadLocal threadLocal = C63142Sdo.A04;
        byte[] A01 = key.A02.A00.A01();
        RTQ rtq = key.A00;
        C63142Sdo c63142Sdo = new C63142Sdo(A01, rtq.A02);
        EnumC61068Rei enumC61068Rei = T96.A04;
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("HMAC");
        T96 t96 = new T96(AbstractC166997dE.A0v(rtq.A04, A1C), AbstractC58318PtA.A16("HMAC", key.A03.A00.A01()));
        int i = rtq.A03;
        return new T8X(new C64305T8o(t96, i), c63142Sdo, key.A01.A01(), i);
    }

    @Override // X.InterfaceC65518Tln
    public final byte[] AOR(final byte[] ciphertext, final byte[] associatedData) {
        byte[] bArr = associatedData;
        int length = ciphertext.length;
        int i = this.A00;
        byte[] bArr2 = this.A03;
        int length2 = bArr2.length;
        if (length >= i + length2) {
            if (AbstractC58538Px6.A02(bArr2, ciphertext)) {
                int i2 = length - i;
                byte[] copyOfRange = Arrays.copyOfRange(ciphertext, length2, i2);
                byte[] copyOfRange2 = Arrays.copyOfRange(ciphertext, i2, length);
                if (associatedData == null) {
                    bArr = new byte[0];
                }
                ByteBuffer allocate = ByteBuffer.allocate(8);
                allocate.putLong(bArr.length * 8);
                if (MessageDigest.isEqual(((C64305T8o) this.A01).AIv(AbstractC63315ShN.A04(bArr, copyOfRange, Arrays.copyOf(allocate.array(), 8))), copyOfRange2)) {
                    C63142Sdo c63142Sdo = this.A02;
                    int length3 = copyOfRange.length;
                    int i3 = c63142Sdo.A00;
                    if (length3 >= i3) {
                        byte[] bArr3 = new byte[i3];
                        System.arraycopy(copyOfRange, 0, bArr3, 0, i3);
                        int i4 = length3 - i3;
                        byte[] bArr4 = new byte[i4];
                        C63142Sdo.A00(c63142Sdo, copyOfRange, bArr4, bArr3, i3, i4, 0, false);
                        return bArr4;
                    }
                    throw AbstractC58318PtA.A0x("ciphertext too short");
                }
                throw AbstractC58318PtA.A0x("invalid MAC");
            }
            throw AbstractC58318PtA.A0x("Decryption failed (OutputPrefix mismatch).");
        }
        throw AbstractC58318PtA.A0x("Decryption failed (ciphertext too short).");
    }

    @Override // X.InterfaceC65518Tln
    public final byte[] ASM(final byte[] plaintext, final byte[] associatedData) {
        C63142Sdo c63142Sdo = this.A02;
        int length = plaintext.length;
        int i = c63142Sdo.A00;
        int i2 = Integer.MAX_VALUE - i;
        if (length <= i2) {
            byte[] bArr = new byte[length + i];
            byte[] A00 = AbstractC58567Pxj.A00(i);
            System.arraycopy(A00, 0, bArr, 0, i);
            C63142Sdo.A00(c63142Sdo, plaintext, bArr, A00, 0, length, i, true);
            if (associatedData == null) {
                associatedData = new byte[0];
            }
            ByteBuffer allocate = ByteBuffer.allocate(8);
            allocate.putLong(associatedData.length * 8);
            return AbstractC63315ShN.A04(this.A03, bArr, this.A01.AIv(AbstractC63315ShN.A04(associatedData, bArr, Arrays.copyOf(allocate.array(), 8))));
        }
        throw AbstractC58320PtC.A1A("plaintext length can not exceed ", i2);
    }

    public T8X(InterfaceC65429Tk0 cipher, C63142Sdo mac, byte[] macLength, int outputPrefix) {
        this.A02 = mac;
        this.A01 = cipher;
        this.A00 = outputPrefix;
        this.A03 = macLength;
    }
}
