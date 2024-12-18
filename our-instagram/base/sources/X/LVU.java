package X;

import com.facebook.ohai.ohaiconfigprovider.base.OHAIConfig;
import com.facebook.pando.PandoGraphQLRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;

/* loaded from: classes8.dex */
public final class LVU implements XC3 {
    public final /* synthetic */ AbstractC47917LEl A00;
    public final /* synthetic */ L83 A01;
    public final /* synthetic */ C47582Kzs A02;

    @Override // X.XC3
    public final void Dpm(OHAIConfig oHAIConfig, boolean z) {
        ArrayList A1E;
        C47582Kzs c47582Kzs = this.A02;
        c47582Kzs.A01.markerAnnotate(20120872, c47582Kzs.A00, "ohai_config_network_fetch_needed", z);
        AbstractC47917LEl abstractC47917LEl = this.A00;
        Object obj = abstractC47917LEl.A01.get("LS_IgdReceiverFetch");
        if (obj != null) {
            L2G l2g = (L2G) obj;
            byte[] bArr = AbstractC47917LEl.A05;
            C48207LVh c48207LVh = new C48207LVh(abstractC47917LEl, oHAIConfig, this.A01, c47582Kzs);
            L38 l38 = l2g.A00;
            L75 l75 = new L75(l38, new C48206LVg(c48207LVh, l2g), bArr);
            LKm lKm = l38.A02;
            synchronized (lKm) {
                try {
                    A1E = AbstractC166987dD.A1F(LKm.A00(lKm).values());
                } catch (JSONException unused) {
                    A1E = AbstractC166987dD.A1E();
                }
            }
            Iterator it = A1E.iterator();
            C46507Ki6 c46507Ki6 = null;
            while (it.hasNext()) {
                C46507Ki6 c46507Ki62 = (C46507Ki6) it.next();
                if (System.currentTimeMillis() > c46507Ki62.A03) {
                    String str = c46507Ki62.A05;
                    synchronized (lKm) {
                        C14360o3.A0B(str, 0);
                        try {
                            HashMap A00 = LKm.A00(lKm);
                            A00.remove(str);
                            LKm.A02(lKm, A00);
                        } catch (JSONException unused2) {
                            lKm.A04();
                        }
                    }
                } else if (c46507Ki6 == null) {
                    c46507Ki6 = c46507Ki62;
                }
            }
            if (c46507Ki6 == null) {
                System.currentTimeMillis();
                C47233Ku6 c47233Ku6 = l38.A01;
                String str2 = l38.A04;
                C47499KyS c47499KyS = new C47499KyS(l75, l38);
                KzM kzM = c47233Ku6.A00.A02;
                C14360o3.A0B(str2, 0);
                C2JM A0b = AbstractC25225BEi.A0b();
                C2JM A0b2 = AbstractC25225BEi.A0b();
                A0b.A04("projectName", str2);
                PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(AbstractC25225BEi.A0c(), "IGDirectACSConfigQuery", A0b.getParamsCopy(), A0b2.getParamsCopy(), C59396Qdt.class, false, null, 0, null, "acs_config", AbstractC166987dD.A1E());
                kzM.A00.ATW(new C48146LSv(c47499KyS, 7), new LTC(6, kzM, c47499KyS), pandoGraphQLRequest, kzM.A01);
                return;
            }
            l75.A00(c46507Ki6);
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.XC3
    public final void onFailure(Throwable th) {
        C14360o3.A0B(th, 0);
        C47582Kzs c47582Kzs = this.A02;
        C006802i c006802i = c47582Kzs.A01;
        int i = c47582Kzs.A00;
        c006802i.markerAnnotate(20120872, i, "ohai_config_fetch_failure", true);
        c006802i.markerEnd(20120872, i, (short) 3);
        this.A01.A00(th);
    }

    public LVU(AbstractC47917LEl abstractC47917LEl, L83 l83, C47582Kzs c47582Kzs) {
        this.A02 = c47582Kzs;
        this.A00 = abstractC47917LEl;
        this.A01 = l83;
    }
}
