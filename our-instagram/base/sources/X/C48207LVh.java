package X;

import android.util.Base64;
import com.facebook.ohai.ohaiconfigprovider.base.OHAIConfig;
import com.facebook.pando.PandoGraphQLRequest;
import com.google.common.collect.ImmutableList;
import com.instagram.direct.receiverfetch.graphql.IGDReceiverFetchACSOnlyResponseImpl;
import com.instagram.direct.receiverfetch.graphql.IGDReceiverFetchDeidentifiedResponseImpl;

/* renamed from: X.LVh, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48207LVh implements MPT {
    public final /* synthetic */ AbstractC47917LEl A00;
    public final /* synthetic */ OHAIConfig A01;
    public final /* synthetic */ L83 A02;
    public final /* synthetic */ C47582Kzs A03;

    @Override // X.MPT
    public final void Dpn(C46506Ki5 c46506Ki5) {
        C1Dk ohaiConfig;
        C40701ud c40701ud;
        C64021Sxs c64021Sxs;
        C48140LSp c48140LSp;
        boolean contains;
        C47582Kzs c47582Kzs = this.A03;
        c47582Kzs.A01.markerEnd(20120872, c47582Kzs.A00, (short) 2);
        L83 l83 = this.A02;
        OHAIConfig oHAIConfig = this.A01;
        L35 l35 = new L35(oHAIConfig.A03, oHAIConfig.A06, oHAIConfig.A02, oHAIConfig.A01, oHAIConfig.A00);
        String str = c46506Ki5.A01;
        C14360o3.A07(str);
        String str2 = c46506Ki5.A02;
        C14360o3.A07(str2);
        String str3 = c46506Ki5.A00;
        C14360o3.A07(str3);
        String encodeToString = Base64.encodeToString(c46506Ki5.A04, 2);
        C14360o3.A07(encodeToString);
        String encodeToString2 = Base64.encodeToString(c46506Ki5.A05, 2);
        C14360o3.A07(encodeToString2);
        String encodeToString3 = Base64.encodeToString(c46506Ki5.A06, 2);
        C14360o3.A07(encodeToString3);
        C47680L3n c47680L3n = new C47680L3n(str, str2, str3, encodeToString, encodeToString2, encodeToString3);
        L94 l94 = l83.A05;
        if (l94 != null) {
            l94.A01.markerPoint(20132336, l94.A00, "deidentified_request_params_fetch_success");
        }
        int i = l83.A00;
        C47914LEi c47914LEi = l83.A04;
        ImmutableList immutableList = l83.A01;
        C14360o3.A0A(immutableList);
        String str4 = l83.A06;
        String str5 = l83.A07;
        if (i == 1) {
            ImmutableList immutableList2 = l83.A02;
            C14360o3.A0A(immutableList2);
            C1346766r c1346766r = l83.A03;
            C14360o3.A0A(c1346766r);
            C2JM A0b = AbstractC25225BEi.A0b();
            ohaiConfig = new PandoGraphQLRequest(AbstractC40511uK.A00(), "IGDReceiverFetchACSOnly", A0b.getParamsCopy(), JQ1.A07(A0b, str4, str5, immutableList).getParamsCopy(), IGDReceiverFetchACSOnlyResponseImpl.class, false, null, 128, null, "igd_receiver_fetch_deidentified", AbstractC166987dD.A1E()).setAcsToken(c47680L3n);
            c40701ud = c47914LEi.A02;
            c64021Sxs = new C64021Sxs(1, l94, c47914LEi, immutableList2, c1346766r);
            c48140LSp = new C48140LSp(1, l94, c47914LEi, immutableList2, c1346766r);
        } else {
            ImmutableList immutableList3 = l83.A02;
            C14360o3.A0A(immutableList3);
            C1346766r c1346766r2 = l83.A03;
            C14360o3.A0A(c1346766r2);
            C2JM A0b2 = AbstractC25225BEi.A0b();
            ohaiConfig = new PandoGraphQLRequest(AbstractC40511uK.A00(), "IGDReceiverFetchDeidentified", A0b2.getParamsCopy(), JQ1.A07(A0b2, str4, str5, immutableList).getParamsCopy(), IGDReceiverFetchDeidentifiedResponseImpl.class, false, null, 384, null, "igd_receiver_fetch_deidentified", AbstractC166987dD.A1E()).setAcsToken(c47680L3n).setOhaiConfig(l35);
            c40701ud = c47914LEi.A02;
            c64021Sxs = new C64021Sxs(3, l94, c47914LEi, immutableList3, c1346766r2);
            c48140LSp = new C48140LSp(3, l94, c47914LEi, immutableList3, c1346766r2);
        }
        c40701ud.ATW(c48140LSp, c64021Sxs, ohaiConfig, c47914LEi.A03);
        AbstractC47917LEl abstractC47917LEl = this.A00;
        synchronized (AbstractC47917LEl.A04) {
            contains = abstractC47917LEl.A03.contains("LS_IgdReceiverFetch");
        }
        if (!contains) {
            abstractC47917LEl.A02.get("LS_IgdReceiverFetch");
        }
    }

    @Override // X.MPT
    public final void onFailure(Throwable th) {
        C14360o3.A0B(th, 0);
        C47582Kzs c47582Kzs = this.A03;
        C006802i c006802i = c47582Kzs.A01;
        int i = c47582Kzs.A00;
        c006802i.markerAnnotate(20120872, i, "acs_token_fetch_failure", true);
        c006802i.markerEnd(20120872, i, (short) 3);
        this.A02.A00(th);
    }

    public C48207LVh(AbstractC47917LEl abstractC47917LEl, OHAIConfig oHAIConfig, L83 l83, C47582Kzs c47582Kzs) {
        this.A03 = c47582Kzs;
        this.A02 = l83;
        this.A01 = oHAIConfig;
        this.A00 = abstractC47917LEl;
    }
}
