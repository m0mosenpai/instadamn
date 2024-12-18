package X;

import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Collection;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;

/* renamed from: X.T8c, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64293T8c implements InterfaceC65519Tlo {
    public static final EnumC61068Rei A03 = EnumC61068Rei.A00;
    public static final Collection A04 = Arrays.asList(64);
    public static final byte[] A05 = new byte[16];
    public final T95 A00;
    public final byte[] A01;
    public final byte[] A02;

    @Override // X.InterfaceC65519Tlo
    public final byte[] AOS(final byte[] ciphertext, final byte[] associatedData) {
        int length = ciphertext.length;
        byte[] bArr = this.A02;
        int length2 = bArr.length;
        int i = length2 + 16;
        if (length >= i) {
            if (AbstractC58538Px6.A02(bArr, ciphertext)) {
                Cipher cipher = (Cipher) InterfaceC65621ToC.A00(C62890SVv.A01, "AES/CTR/NoPadding");
                byte[] copyOfRange = Arrays.copyOfRange(ciphertext, length2, i);
                byte[] bArr2 = (byte[]) copyOfRange.clone();
                bArr2[8] = (byte) (bArr2[8] & Byte.MAX_VALUE);
                bArr2[12] = (byte) (bArr2[12] & Byte.MAX_VALUE);
                cipher.init(2, AbstractC58318PtA.A16("AES", this.A01), new IvParameterSpec(bArr2));
                byte[] copyOfRange2 = Arrays.copyOfRange(ciphertext, i, length);
                byte[] doFinal = cipher.doFinal(copyOfRange2);
                if (copyOfRange2.length == 0 && doFinal == null && "The Android Project".equals(System.getProperty("java.vendor"))) {
                    doFinal = new byte[0];
                }
                if (MessageDigest.isEqual(copyOfRange, A00(associatedData, doFinal))) {
                    return doFinal;
                }
                throw new AEADBadTagException("Integrity check failed.");
            }
            throw AbstractC58318PtA.A0x("Decryption failed (OutputPrefix mismatch).");
        }
        throw AbstractC58318PtA.A0x("Ciphertext too short.");
    }

    @Override // X.InterfaceC65519Tlo
    public final byte[] ASN(final byte[] plaintext, final byte[] associatedData) {
        if (plaintext.length <= 2147483631) {
            Cipher cipher = (Cipher) InterfaceC65621ToC.A00(C62890SVv.A01, "AES/CTR/NoPadding");
            byte[] A00 = A00(associatedData, plaintext);
            byte[] bArr = (byte[]) A00.clone();
            bArr[8] = (byte) (bArr[8] & Byte.MAX_VALUE);
            bArr[12] = (byte) (bArr[12] & Byte.MAX_VALUE);
            cipher.init(1, AbstractC58318PtA.A16("AES", this.A01), new IvParameterSpec(bArr));
            return AbstractC63315ShN.A04(this.A02, A00, cipher.doFinal(plaintext));
        }
        throw AbstractC58318PtA.A0x("plaintext too long");
    }

    private byte[] A00(final byte[]... s) {
        byte[] A02;
        T95 t95 = this.A00;
        byte[] AIq = t95.AIq(A05, 16);
        byte[] bArr = s[0];
        if (bArr == null) {
            bArr = new byte[0];
        }
        byte[] A022 = AbstractC63315ShN.A02(S3R.A00(AIq), t95.AIq(bArr, 16));
        byte[] bArr2 = s[1];
        int length = bArr2.length;
        if (length >= 16) {
            int length2 = A022.length;
            if (length >= length2) {
                int i = length - length2;
                A02 = Arrays.copyOf(bArr2, length);
                for (int i2 = 0; i2 < length2; i2++) {
                    int i3 = i + i2;
                    A02[i3] = (byte) (A02[i3] ^ A022[i2]);
                }
            } else {
                throw AbstractC166987dD.A12("xorEnd requires a.length >= b.length");
            }
        } else {
            byte[] copyOf = Arrays.copyOf(bArr2, 16);
            copyOf[length] = Byte.MIN_VALUE;
            A02 = AbstractC63315ShN.A02(copyOf, S3R.A00(A022));
        }
        return t95.AIq(A02, 16);
    }

    public C64293T8c(final C58526Pwu key, byte[] outputPrefix) {
        if (A03.A00()) {
            Collection collection = A04;
            int length = outputPrefix.length;
            if (collection.contains(Integer.valueOf(length))) {
                int i = length / 2;
                byte[] copyOfRange = Arrays.copyOfRange(outputPrefix, 0, i);
                this.A01 = Arrays.copyOfRange(outputPrefix, i, length);
                this.A00 = new T95(copyOfRange);
                this.A02 = key.A01();
                return;
            }
            throw new InvalidKeyException(AnonymousClass001.A0c("invalid key size: ", " bytes; key must have 64 bytes", length));
        }
        throw AbstractC58318PtA.A0x("Can not use AES-SIV in FIPS-mode.");
    }
}
