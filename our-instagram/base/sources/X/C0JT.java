package X;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: X.0JT, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C0JT {
    public static final byte[] A00 = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};

    public static String A01(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length);
        for (byte b : bArr) {
            int i = b & 255;
            byte[] bArr2 = A00;
            sb.append((char) bArr2[i >>> 4]);
            sb.append((char) bArr2[i & 15]);
        }
        return sb.toString();
    }

    public static String A00(String str) {
        try {
            byte[] bytes = str.getBytes("utf-8");
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                messageDigest.update(bytes, 0, bytes.length);
                return A01(messageDigest.digest());
            } catch (UnsupportedEncodingException e) {
                throw new RuntimeException(e);
            } catch (NoSuchAlgorithmException e2) {
                throw new RuntimeException(e2);
            }
        } catch (UnsupportedEncodingException e3) {
            throw new RuntimeException(e3);
        }
    }
}
