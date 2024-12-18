package X;

import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.InvalidParameterException;
import javax.crypto.Mac;
import javax.crypto.SecretKey;

/* renamed from: X.SgS, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC63268SgS {
    public static final byte[] A00;
    public static final byte[] A01;
    public static final byte[] A02;
    public static final byte[] A03;
    public static final byte[] A04;

    public static byte[] A00(int i) {
        int i2 = 2;
        if (i <= Math.pow(256.0d, 2.0d)) {
            byte[] bArr = new byte[2];
            while (true) {
                i2--;
                if (i2 >= 0) {
                    AbstractC58318PtA.A19(i, bArr, i2);
                    i >>= 8;
                } else {
                    return bArr;
                }
            }
        } else {
            throw new InvalidParameterException("xlen bytes is not enough to represent x");
        }
    }

    public static byte[] A02(byte[]... bArr) {
        int i = 0;
        for (byte[] bArr2 : bArr) {
            i += bArr2.length;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i);
        for (byte[] bArr3 : bArr) {
            byteArrayOutputStream.write(bArr3);
        }
        return byteArrayOutputStream.toByteArray();
    }

    static {
        Charset charset = StandardCharsets.UTF_8;
        A03 = "KEM".getBytes(charset);
        A01 = "HPKE".getBytes(charset);
        A02 = "HPKE-v1".getBytes(charset);
        A00 = "eae_prk".getBytes(charset);
        A04 = "shared_secret".getBytes(charset);
    }

    public static byte[] A01(SecretKey secretKey, byte[] bArr, byte[] bArr2, byte[] bArr3, int i) {
        byte[] A022 = A02(A00(i), A02, bArr3, bArr, bArr2);
        C02R.A01(i, 0, "outLenBytes", 8160);
        Mac mac = Mac.getInstance("HmacSHA256");
        mac.init(secretKey);
        byte[] bArr4 = new byte[0];
        int ceil = (int) Math.ceil(i / 32.0d);
        ByteBuffer allocate = ByteBuffer.allocate(i);
        int i2 = 0;
        while (i2 < ceil) {
            mac.update(bArr4);
            mac.update(A022);
            i2++;
            mac.update((byte) i2);
            bArr4 = mac.doFinal();
            int min = Math.min(i, bArr4.length);
            allocate.put(bArr4, 0, min);
            i -= min;
        }
        return allocate.array();
    }
}
