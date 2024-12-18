package X;

import com.facebook.quicklog.reliability.UserFlowLoggerImpl;

/* renamed from: X.Hjt, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC39723Hjt {
    /* JADX WARN: Type inference failed for: r0v3, types: [com.facebook.quicklog.reliability.UserFlowLoggerImpl, X.H8F] */
    public static final H8F A00() {
        if (H8F.A00 != null) {
            C006802i c006802i = C006802i.A0p;
            C14360o3.A07(c006802i);
            ?? userFlowLoggerImpl = new UserFlowLoggerImpl(c006802i);
            H8F.A00 = userFlowLoggerImpl;
            return userFlowLoggerImpl;
        }
        C14360o3.A0F("igUserFlowLoggerLoggedOut");
        throw C00O.createAndThrow();
    }
}
