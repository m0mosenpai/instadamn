package X;

import java.nio.charset.Charset;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: X.SaA, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62986SaA {
    public final String A00;

    public static byte[] A00(C62986SaA c62986SaA, byte[] bArr, byte[] bArr2, int i) {
        C62890SVv c62890SVv = C62890SVv.A05;
        String str = c62986SaA.A00;
        Mac mac = (Mac) InterfaceC65621ToC.A00(c62890SVv, str);
        if (i <= mac.getMacLength() * 255) {
            byte[] bArr3 = new byte[i];
            mac.init(AbstractC58318PtA.A16(str, bArr));
            byte[] bArr4 = new byte[0];
            int i2 = 1;
            int i3 = 0;
            while (true) {
                mac.update(bArr4);
                mac.update(bArr2);
                mac.update((byte) i2);
                bArr4 = mac.doFinal();
                int length = bArr4.length;
                if (length + i3 < i) {
                    System.arraycopy(bArr4, 0, bArr3, i3, length);
                    i3 += length;
                    i2++;
                } else {
                    System.arraycopy(bArr4, 0, bArr3, i3, i - i3);
                    return bArr3;
                }
            }
        } else {
            throw AbstractC58318PtA.A0x("size too large");
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    public final byte[] A01() {
        String str = this.A00;
        switch (str.hashCode()) {
            case 984523022:
                if (str.equals("HmacSha256")) {
                    return AbstractC63126SdU.A06;
                }
                throw AbstractC58318PtA.A0x("Could not determine HPKE KDF ID");
            case 984524074:
                if (str.equals("HmacSha384")) {
                    return AbstractC63126SdU.A07;
                }
                throw AbstractC58318PtA.A0x("Could not determine HPKE KDF ID");
            case 984525777:
                if (str.equals("HmacSha512")) {
                    return AbstractC63126SdU.A08;
                }
                throw AbstractC58318PtA.A0x("Could not determine HPKE KDF ID");
            default:
                throw AbstractC58318PtA.A0x("Could not determine HPKE KDF ID");
        }
    }

    public final byte[] A02(String salt, byte[] ikm, byte[] ikmLabel, byte[] suiteId) {
        SecretKeySpec A16;
        byte[] A04 = AbstractC63315ShN.A04(AbstractC63126SdU.A0A, suiteId, salt.getBytes(AbstractC58538Px6.A00), ikmLabel);
        C62890SVv c62890SVv = C62890SVv.A05;
        String str = this.A00;
        Mac mac = (Mac) InterfaceC65621ToC.A00(c62890SVv, str);
        if (ikm.length == 0) {
            A16 = AbstractC58318PtA.A16(str, new byte[mac.getMacLength()]);
        } else {
            A16 = AbstractC58318PtA.A16(str, ikm);
        }
        mac.init(A16);
        return mac.doFinal(A04);
    }

    public final byte[] A03(byte[] bArr, byte[] bArr2, byte[] bArr3, int i) {
        byte[] bArr4 = AbstractC63126SdU.A0A;
        Charset charset = AbstractC58538Px6.A00;
        byte[] A04 = AbstractC63315ShN.A04(bArr4, bArr3, "eae_prk".getBytes(charset), bArr);
        C62890SVv c62890SVv = C62890SVv.A05;
        String str = this.A00;
        Mac mac = (Mac) InterfaceC65621ToC.A00(c62890SVv, str);
        mac.init(AbstractC58318PtA.A16(str, new byte[mac.getMacLength()]));
        return A00(this, mac.doFinal(A04), AbstractC63315ShN.A04(AbstractC63126SdU.A01(2, i), bArr4, bArr3, "shared_secret".getBytes(charset), bArr2), i);
    }

    public C62986SaA(String macAlgorithm) {
        this.A00 = macAlgorithm;
    }
}
