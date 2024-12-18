package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.O0z, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54367O0z {
    public static final Map A00;
    public static final Map A01;

    static {
        HashMap A1G = AbstractC166987dD.A1G();
        A00 = A1G;
        HashMap A1G2 = AbstractC166987dD.A1G();
        A01 = A1G2;
        Integer A0o = AbstractC25227BEk.A0o();
        A1G.put(A0o, "The Play Store app is either not installed or not the official version.");
        A1G.put(-2, "Call first requestReviewFlow to get the ReviewInfo.");
        A1G.put(-100, "Retry with an exponential backoff. Consider filing a bug if fails consistently.");
        A1G2.put(A0o, "PLAY_STORE_NOT_FOUND");
        A1G2.put(-2, "INVALID_REQUEST");
        A1G2.put(-100, "INTERNAL_ERROR");
    }
}
