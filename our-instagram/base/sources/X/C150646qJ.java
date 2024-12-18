package X;

import com.facebook.cameracore.logging.spars.xplatimpl.XplatRawEventLogger;
import com.facebook.cameracore.logging.spars.xplatimpl.XplatSparsLogger;

/* renamed from: X.6qJ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C150646qJ {
    public static final XplatSparsLogger A00(InterfaceC150636qH interfaceC150636qH) {
        C14360o3.A0B(interfaceC150636qH, 0);
        C150646qJ c150646qJ = XplatSparsLogger.Companion;
        return new XplatSparsLogger(new XplatRawEventLogger(interfaceC150636qH));
    }
}
