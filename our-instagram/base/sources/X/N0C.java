package X;

import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rtc.logging.connectfunnel.logger.gen.ConnectFunnelProxy;

/* loaded from: classes9.dex */
public final class N0C extends ConnectFunnelProxy {
    public final /* synthetic */ OXJ A00;

    @Override // com.facebook.rtc.logging.connectfunnel.logger.gen.ConnectFunnelProxy
    public final McfReference createStructuredLoggerPointer() {
        return null;
    }

    public N0C(OXJ oxj) {
        this.A00 = oxj;
    }

    @Override // com.facebook.rtc.logging.connectfunnel.logger.gen.ConnectFunnelProxy
    public final String diskCachingCreateDirectory() {
        return AnonymousClass001.A0R("file://", AbstractC23881Ey.A00().AXd(null, 2027409170).getPath());
    }

    @Override // com.facebook.rtc.logging.connectfunnel.logger.gen.ConnectFunnelProxy
    public final boolean diskCachingIsEnabled() {
        return C18U.A06(C06090Tz.A05, this.A00.A02, 2342166612788194713L);
    }
}
