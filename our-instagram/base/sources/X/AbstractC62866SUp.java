package X;

import android.util.Base64;
import java.security.GeneralSecurityException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: X.SUp, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC62866SUp {
    public static final SecretKeySpec A00;
    public static final byte[] A01;

    static {
        byte[] A1a = AbstractC58318PtA.A1a("iN4$aGr0m", C15W.A05);
        A01 = A1a;
        A00 = AbstractC58318PtA.A16("HmacSHA256", A1a);
    }

    public static final String A00(long j, int i, int i2) {
        String str;
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append(i);
        A1C.append(" ");
        A1C.append(j);
        A1C.append(" ");
        A1C.append(i2);
        A1C.append(" ");
        A1C.append(System.currentTimeMillis());
        String A19 = AbstractC166987dD.A19(A1C);
        try {
            Mac mac = Mac.getInstance("HmacSHA256");
            mac.init(A00);
            str = Base64.encodeToString(mac.doFinal(MSY.A1a(A19)), 0);
        } catch (GeneralSecurityException unused) {
            str = null;
        }
        if (str == null) {
            return null;
        }
        return AnonymousClass001.A0R(str, Base64.encodeToString(MSY.A1a(A19), 0));
    }
}
