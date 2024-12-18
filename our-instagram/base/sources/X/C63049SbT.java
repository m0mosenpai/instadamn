package X;

import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: X.SbT, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63049SbT {
    public static final String A00(String str, String str2, String str3, long j) {
        try {
            StringBuilder A1C = AbstractC166987dD.A1C();
            String A0R = AnonymousClass001.A0R(str, str2);
            C14360o3.A0B(A0R, 0);
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            C14360o3.A07(messageDigest);
            Charset A0u = AbstractC58318PtA.A0u();
            C14360o3.A07(A0u);
            byte[] digest = messageDigest.digest(AbstractC58318PtA.A1a(A0R, A0u));
            C14360o3.A07(digest);
            A1C.append(A01(digest));
            A1C.append('-');
            A1C.append(0L);
            A1C.append('-');
            A1C.append(j);
            A1C.append('-');
            A1C.append(str3);
            A1C.append("");
            return A1C.toString();
        } catch (NoSuchAlgorithmException unused) {
            return "";
        }
    }

    public static final String A01(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer();
        for (byte b : bArr) {
            String hexString = Integer.toHexString((b & 255) | 256);
            C14360o3.A07(hexString);
            stringBuffer.append(AbstractC25227BEk.A0w(hexString, 1, 3));
        }
        return AbstractC166987dD.A19(stringBuffer);
    }
}
