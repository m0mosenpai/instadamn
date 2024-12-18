package X;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes9.dex */
public abstract class O17 {
    public static final Map A00;
    public static final Map A01;
    public static final Map A02;

    static {
        HashMap A1G = AbstractC166987dD.A1G();
        A00 = A1G;
        HashMap A1G2 = AbstractC166987dD.A1G();
        A01 = A1G2;
        Integer A0o = AbstractC25227BEk.A0o();
        A1G.put(A0o, "Too many sessions are running for current app, existing sessions must be resolved first.");
        A1G.put(-2, "A requested module is not available (to this user/device, for the installed apk).");
        A1G.put(-3, "Request is otherwise invalid.");
        A1G.put(-4, "Requested session is not found.");
        A1G.put(-5, "Split Install API is not available.");
        A1G.put(-6, "Network error: unable to obtain split details.");
        A1G.put(-7, "Download not permitted under current device circumstances (e.g. in background).");
        A1G.put(-8, "Requested session contains modules from an existing active session and also new modules.");
        A1G.put(-9, "Service handling split install has died.");
        A1G.put(-10, "Install failed due to insufficient storage.");
        A1G.put(-11, "Signature verification error when invoking SplitCompat.");
        A1G.put(-12, "Error in SplitCompat emulation.");
        A1G.put(-13, "Error in copying files for SplitCompat.");
        A1G.put(-14, "The Play Store app is either not installed or not the official version.");
        A1G.put(-15, "The app is not owned by any user on this device. An app is \"owned\" if it has been acquired from Play.");
        A1G.put(-16, "The download is too large to start over the current connection.");
        A1G.put(-100, "Unknown error processing split install.");
        A1G2.put(A0o, "ACTIVE_SESSIONS_LIMIT_EXCEEDED");
        A1G2.put(-2, "MODULE_UNAVAILABLE");
        A1G2.put(-3, "INVALID_REQUEST");
        A1G2.put(-4, "DOWNLOAD_NOT_FOUND");
        A1G2.put(-5, "API_NOT_AVAILABLE");
        A1G2.put(-6, "NETWORK_ERROR");
        A1G2.put(-7, "ACCESS_DENIED");
        A1G2.put(-8, "INCOMPATIBLE_WITH_EXISTING_SESSION");
        A1G2.put(-9, "SERVICE_DIED");
        A1G2.put(-10, "INSUFFICIENT_STORAGE");
        A1G2.put(-11, "SPLITCOMPAT_VERIFICATION_ERROR");
        A1G2.put(-12, "SPLITCOMPAT_EMULATION_ERROR");
        A1G2.put(-13, "SPLITCOMPAT_COPY_ERROR");
        A1G2.put(-14, "PLAY_STORE_NOT_FOUND");
        A1G2.put(-15, "APP_NOT_OWNED");
        A1G2.put(-16, "DOWNLOAD_TOO_LARGE");
        A1G2.put(-100, "INTERNAL_ERROR");
        A02 = AbstractC166987dD.A1G();
        Iterator A14 = AbstractC166997dE.A14(A1G2);
        while (A14.hasNext()) {
            Map.Entry A1K = AbstractC166987dD.A1K(A14);
            A02.put(A1K.getValue(), A1K.getKey());
        }
    }
}
