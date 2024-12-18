package X;

import com.facebook.msys.mci.PrivacyContext;
import com.facebook.msys.mci.PrivacyContextCoding;
import com.facebook.msys.mci.TransportAgnosticLogging;

/* renamed from: X.LCf, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47859LCf {
    public static final void A00(long j, String str) {
        PrivacyContext newPrivacyContextWithTransportKeyNative = PrivacyContextCoding.newPrivacyContextWithTransportKeyNative(null, "FBLegacyBroker");
        C14360o3.A07(newPrivacyContextWithTransportKeyNative);
        Long A0d = AbstractC167007dF.A0d();
        TransportAgnosticLogging.logTalEventToPipe(newPrivacyContextWithTransportKeyNative, 0, false, 2, new Object[]{3, A0d, (byte) 0, str, 0, A0d, (byte) 1, Long.valueOf(j)}, AbstractC47141Ksa.A00);
    }
}
