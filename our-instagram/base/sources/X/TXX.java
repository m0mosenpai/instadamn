package X;

import com.facebook.react.bridge.ReactSoftExceptionLogger;

/* loaded from: classes10.dex */
public final class TXX extends RuntimeException {
    public static void A00(String str, String str2) {
        ReactSoftExceptionLogger.logSoftException(str2, new RuntimeException(str));
    }
}
