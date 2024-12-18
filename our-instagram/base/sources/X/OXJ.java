package X;

import com.facebook.messenger.mcp.integration.MCPPluginsRegistryIntegration;
import com.facebook.rtc.logging.connectfunnel.logger.gen.ConnectFunnel;
import com.facebook.rtc.logging.connectfunnel.logger.gen.ConnectFunnelProxy;
import com.instagram.common.session.UserSession;
import java.util.Map;

/* loaded from: classes9.dex */
public final class OXJ {
    public String A00;
    public String A01;
    public final UserSession A02;
    public final ConnectFunnelProxy A03;

    public OXJ(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A02 = userSession;
        MCPPluginsRegistryIntegration.nativePreregisterMCPPluginsRegistry();
        AnonymousClass957.A00();
        this.A03 = new N0C(this);
    }

    public static final void A00(String str, int i) {
        C14360o3.A0B(str, 0);
        OXE.A00.A00("IGRTCProductFunnelLogger", AnonymousClass001.A05(i, "markPointWithLocalCallId(): ", " for call id ", str));
        ConnectFunnel.CProxy.markPoint(str, i, null);
    }

    public final void A04(String str) {
        C14360o3.A0B(str, 0);
        String str2 = this.A01;
        if (str2 != null) {
            OXE.A00.A00("IGRTCProductFunnelLogger", AnonymousClass001.A0R("setOriginAnnotation: ", str));
            ConnectFunnel.CProxy.annotateMultipleTyped(str2, AbstractC06930Yk.A07(AbstractC25230BEn.A1b(20, str)), null, null);
        }
    }

    public final void A05(String str, int i, Map map) {
        C14360o3.A0B(str, 0);
        boolean startWithProxy = ConnectFunnel.CProxy.startWithProxy(this.A03, str, i, null, map);
        if (startWithProxy) {
            this.A00 = str;
            AbstractC2056298m.A00(this.A02).A06(null, this.A00);
        }
        OXE oxe = OXE.A00;
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("start(): started=");
        A1C.append(startWithProxy);
        A1C.append(' ');
        A1C.append(str);
        A1C.append(" with point ");
        A1C.append(i);
        A1C.append(" sessionId=");
        oxe.A00("IGRTCProductFunnelLogger", AbstractC166997dE.A0x(this.A01, A1C));
    }

    public final void A01(int i) {
        OXE oxe = OXE.A00;
        oxe.A00("IGRTCProductFunnelLogger", AnonymousClass001.A0O("logProductFunnelStart(): start point=", i));
        String str = this.A01;
        if (str != null) {
            this.A00 = str;
            AbstractC2056298m.A00(this.A02).A06(this.A00, null);
            oxe.A00("IGRTCProductFunnelLogger", AnonymousClass001.A1A("logProductFunnelStart(): started=", " sessionId=", this.A01, ConnectFunnel.CProxy.startWithProxy(this.A03, str, i, null, null)));
            A02(2);
        }
    }

    public final void A02(int i) {
        OXE.A00.A00("IGRTCProductFunnelLogger", AnonymousClass001.A0O("markPoint(): ", i));
        String str = this.A01;
        if (str != null) {
            A00(str, i);
        }
        String str2 = this.A00;
        if (str2 != null) {
            A00(str2, i);
        }
    }

    public final void A03(Integer num) {
        String str;
        String str2;
        OXE oxe = OXE.A00;
        String str3 = this.A00;
        int intValue = num.intValue();
        switch (intValue) {
            case 0:
                str = "FULL_SCREEN_RING";
                break;
            case 1:
                str = "PUSH_NOTIFICATION";
                break;
            case 2:
                str = "JOIN_BUTTON_INBOX";
                break;
            case 3:
                str = "JOIN_BUTTON_XMA";
                break;
            default:
                str = "JOIN_BUTTON_THREAD_HEADER";
                break;
        }
        oxe.A00("IGRTCProductFunnelLogger", AnonymousClass001.A0u("accept call: ", str3, " with source ", str));
        String str4 = this.A00;
        if (str4 != null) {
            ConnectFunnel.CProxy.markPoint(str4, 12, null);
            String str5 = this.A00;
            switch (intValue) {
                case 0:
                    str2 = "FULL_SCREEN_RING";
                    break;
                case 1:
                    str2 = "PUSH_NOTIFICATION";
                    break;
                case 2:
                    str2 = "JOIN_BUTTON_INBOX";
                    break;
                case 3:
                    str2 = "JOIN_BUTTON_XMA";
                    break;
                default:
                    str2 = "JOIN_BUTTON_THREAD_HEADER";
                    break;
            }
            ConnectFunnel.CProxy.annotateMultipleTyped(str5, AbstractC06930Yk.A07(AbstractC25230BEn.A1b(29, str2)), null, null);
        }
    }
}
