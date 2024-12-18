package X;

import java.security.NoSuchAlgorithmException;

/* renamed from: X.Nvu, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54096Nvu {
    public static final String A00(String str) {
        C14360o3.A0B(str, 0);
        try {
            C54508O6l A01 = new C55191Odx(AbstractC166987dD.A11(str), "").A01("MD5", 256);
            if (A01 != null) {
                return C63049SbT.A01(A01.A01);
            }
            return null;
        } catch (NoSuchAlgorithmException e) {
            C0K8.A0F("MediaPDQReporter", "Failed to generate hash for file", e);
            return null;
        }
    }
}
