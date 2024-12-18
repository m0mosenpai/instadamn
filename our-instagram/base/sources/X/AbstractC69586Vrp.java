package X;

import com.facebook.ohai.ohaiconfigprovider.base.OHAIConfig;
import com.facebook.pando.PandoGraphQLRequest;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;

/* renamed from: X.Vrp, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC69586Vrp {
    public final C1UM A00;
    public final InterfaceC40711ue A01;
    public final ExecutorService A02;
    public final Object A03 = new Object();

    public final void A00(XC3 xc3) {
        C1UM c1um;
        String string;
        Object obj = this.A03;
        synchronized (obj) {
            c1um = this.A00;
            string = c1um.getString("ohai_config", "");
        }
        try {
            if (!C14360o3.A0K(string, "")) {
                OHAIConfig oHAIConfig = (OHAIConfig) AbstractC73763Sg.A03.A00(string, C71735X0a.A00);
                if (oHAIConfig != null && System.currentTimeMillis() < oHAIConfig.A04 * 1000) {
                    xc3.Dpm(oHAIConfig, false);
                    return;
                }
            }
        } catch (AnonymousClass403 e) {
            C0K8.A0F("OHAIConfigFetcherBase", "Failed to parse OHAI Config from local storage", e);
        }
        synchronized (obj) {
            C1ZT AR9 = c1um.AR9();
            AR9.A06("ohai_config");
            if (!AR9.A0B()) {
                C0K8.A0C("OHAIConfigFetcherBase", "Failed to remove OHAI Config from local storage");
            }
        }
        C2JM c2jm = new C2JM();
        C2JM c2jm2 = new C2JM();
        C2JQ c2jq = PandoGraphQLRequest.Companion;
        PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(AbstractC40511uK.A00(), "IGDirectOHAIConfigsQuery", c2jm.getParamsCopy(), c2jm2.getParamsCopy(), C66963Udy.class, false, null, 0, null, "xfb_ohai_configurations", new ArrayList());
        this.A01.ATW(new C70434WVm(xc3, 0), new WW3(0, this, xc3), pandoGraphQLRequest, this.A02);
    }

    public AbstractC69586Vrp(C1UM c1um, InterfaceC40711ue interfaceC40711ue, ExecutorService executorService) {
        this.A01 = interfaceC40711ue;
        this.A02 = executorService;
        this.A00 = c1um;
    }
}
