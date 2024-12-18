package X;

import com.facebook.react.bridge.ReactSoftExceptionLogger;

/* renamed from: X.SRl, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62791SRl {
    public static final void A00(boolean z, String str) {
        C14360o3.A0B(str, 1);
        if (!z) {
            ReactSoftExceptionLogger.logSoftException("SoftAssertions", new RuntimeException(str));
        }
    }
}
