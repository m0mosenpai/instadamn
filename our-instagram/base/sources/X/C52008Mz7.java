package X;

import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.connectfunnel.gen.ConnectFunnelProxy;
import com.facebook.rtc.logging.connectfunnel.logger.gen.ConnectFunnel;
import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.Mz7, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52008Mz7 extends ConnectFunnelProxy {
    public final UserSession A00;

    public C52008Mz7(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
    }

    @Override // com.facebook.rsys.connectfunnel.gen.ConnectFunnelProxy
    public final void markPoint(String str, int i) {
        C14360o3.A0B(str, 0);
        AbstractC54148Nwk.A00(this.A00);
        OXJ.A00(str, i);
    }

    @Override // com.facebook.rsys.connectfunnel.gen.ConnectFunnelProxy
    public final void upload(String str, McfReference mcfReference) {
        C14360o3.A0B(str, 0);
        AbstractC54148Nwk.A00(this.A00);
        OXE.A00.A00("IGRTCProductFunnelLogger", AnonymousClass001.A0R("succeed ", str));
        ConnectFunnel.CProxy.succeed(str, mcfReference);
    }

    @Override // com.facebook.rsys.connectfunnel.gen.ConnectFunnelProxy
    public final void annotateMultiple(String str, Map map, Map map2, Map map3, Map map4) {
        AbstractC167017dG.A1N(str, map);
        AbstractC54148Nwk.A00(this.A00);
        ConnectFunnel.CProxy.annotateMultiple(str, map);
    }

    @Override // com.facebook.rsys.connectfunnel.gen.ConnectFunnelProxy
    public final void associateCallIds(String str, String str2, boolean z) {
        AbstractC167017dG.A1N(str, str2);
        OXJ A00 = AbstractC54148Nwk.A00(this.A00);
        OXE.A00.A00("IGRTCProductFunnelLogger", AnonymousClass001.A0u("associateCallIds(): sharedCallId=", str, " localCallId=", str2));
        A00.A00 = str2;
        ConnectFunnel.CProxy.associateCallIds(str, str2, z);
        AbstractC2056298m.A00(A00.A02).A06(str2, str);
    }

    @Override // com.facebook.rsys.connectfunnel.gen.ConnectFunnelProxy
    public final void start(String str, int i, Map map) {
        AbstractC167017dG.A1O(str, map);
        AbstractC54148Nwk.A00(this.A00).A05(str, i, map);
    }
}
