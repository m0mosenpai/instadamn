package X;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes11.dex */
public abstract class VN6 {
    public static final String A00(String str) {
        C14360o3.A0B(str, 0);
        try {
            byte[] digest = MessageDigest.getInstance("MD5").digest(MSY.A1a(str));
            C14360o3.A0A(digest);
            str = AbstractC1126356r.A05(digest);
        } catch (NoSuchAlgorithmException unused) {
        }
        int length = str.length();
        if (length > 12) {
            length = 12;
        }
        return AbstractC25227BEk.A0w(str, 0, length);
    }
}
