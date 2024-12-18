package X;

import com.facebook.proxygen.TraceFieldType;
import com.facebook.rsys.networktraffic.gen.HttpStats;
import com.facebook.rsys.networktraffic.gen.NetworkTrafficApi;
import com.facebook.rsys.networktraffic.gen.NetworkTrafficProxy;
import com.facebook.tigon.TigonError;
import com.facebook.tigon.iface.FacebookLoggingRequestInfo;
import com.facebook.tigon.iface.TigonRequest;
import com.facebook.tigon.tigonobserver.TigonRequestAdded;
import com.facebook.tigon.tigonobserver.TigonRequestErrored;
import com.facebook.tigon.tigonobserver.TigonRequestResponse;
import com.facebook.tigon.tigonobserver.TigonRequestStarted;
import com.facebook.tigon.tigonobserver.TigonRequestSucceeded;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.Mzj, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52023Mzj extends NetworkTrafficProxy implements C1G7 {
    public NetworkTrafficApi A00;
    public final AtomicBoolean A01 = AbstractC166997dE.A17();

    @Override // X.C1G7
    public final void Cvo(TigonRequestAdded tigonRequestAdded) {
    }

    @Override // X.C1G7
    public final void E23(TigonRequestErrored tigonRequestErrored) {
    }

    private final void A00(TigonError tigonError, TigonRequestSucceeded tigonRequestSucceeded) {
        InterfaceC74743Xi summary;
        C74703Xe c74703Xe;
        TigonRequest submittedRequest;
        long j;
        long j2;
        long j3;
        long j4;
        String str;
        int i;
        String str2;
        Long A0j;
        Long A0j2;
        Long A0j3;
        Long A0j4;
        if (this.A01.get() && (summary = tigonRequestSucceeded.summary()) != null && (c74703Xe = (C74703Xe) summary.BMN(AbstractC74763Xk.A04)) != null) {
            Map map = c74703Xe.A01;
            if (!map.isEmpty() && (submittedRequest = tigonRequestSucceeded.submittedRequest()) != null) {
                C26861Rw c26861Rw = (C26861Rw) submittedRequest.getLayerInformation(C1S2.A05);
                String A1A = AbstractC166987dD.A1A(TraceFieldType.ReqHeaderCompSize, map);
                if (A1A != null && (A0j4 = AbstractC166997dE.A0j(A1A)) != null) {
                    j = A0j4.longValue();
                } else {
                    j = 0;
                }
                String A1A2 = AbstractC166987dD.A1A(AbstractC58317Pt9.A00(948), map);
                if (A1A2 != null && (A0j3 = AbstractC166997dE.A0j(A1A2)) != null) {
                    j2 = A0j3.longValue();
                } else {
                    j2 = 0;
                }
                String A1A3 = AbstractC166987dD.A1A(TraceFieldType.RspHeaderCompSize, map);
                if (A1A3 != null && (A0j2 = AbstractC166997dE.A0j(A1A3)) != null) {
                    j3 = A0j2.longValue();
                } else {
                    j3 = 0;
                }
                String A1A4 = AbstractC166987dD.A1A(TraceFieldType.RspBodyCompSize, map);
                if (A1A4 != null && (A0j = AbstractC166997dE.A0j(A1A4)) != null) {
                    j4 = A0j.longValue();
                } else {
                    j4 = 0;
                }
                String A1I = AbstractC25226BEj.A1I(AbstractC167007dF.A0m(submittedRequest.url(), "?", 0), 0);
                String A1A5 = AbstractC166987dD.A1A("request_friendly_name", map);
                if (A1A5 == null) {
                    A1A5 = "";
                }
                FacebookLoggingRequestInfo facebookLoggingRequestInfo = (FacebookLoggingRequestInfo) submittedRequest.getLayerInformation(C1S2.A01);
                if (facebookLoggingRequestInfo == null) {
                    str = "";
                } else {
                    str = facebookLoggingRequestInfo.mCallerClass;
                    C14360o3.A07(str);
                }
                int i2 = submittedRequest.requestCategory().A00;
                C9BO response = tigonRequestSucceeded.response();
                if (response != null) {
                    i = response.A00;
                } else {
                    i = -1;
                }
                String method = submittedRequest.method();
                String str3 = null;
                if (tigonError != null) {
                    str2 = tigonError.analyticsDetail;
                } else {
                    str2 = null;
                }
                if (c26861Rw != null) {
                    Map unmodifiableMap = Collections.unmodifiableMap(c26861Rw.A00);
                    C14360o3.A07(unmodifiableMap);
                    str3 = AbstractC166987dD.A1A("surface", unmodifiableMap);
                }
                HttpStats httpStats = new HttpStats(j, j2, j3, j4, A1I, A1A5, str, i2, i, method, str2, "", str3);
                NetworkTrafficApi networkTrafficApi = this.A00;
                if (networkTrafficApi != null) {
                    networkTrafficApi.onHttpEventComplete(tigonRequestSucceeded.requestId(), httpStats);
                }
            }
        }
    }

    @Override // X.C1G7
    public final void DCj(TigonRequestSucceeded tigonRequestSucceeded) {
        if (tigonRequestSucceeded != null) {
            A00(null, tigonRequestSucceeded);
        }
    }

    @Override // X.C1G7
    public final void DEC(TigonRequestErrored tigonRequestErrored) {
        if (tigonRequestErrored != null) {
            A00(tigonRequestErrored.error(), tigonRequestErrored);
        }
    }

    @Override // X.C1G7
    public final void Dgf(TigonRequestResponse tigonRequestResponse) {
        NetworkTrafficApi networkTrafficApi;
        if (tigonRequestResponse != null && (networkTrafficApi = this.A00) != null) {
            networkTrafficApi.onHttpEventResponse(tigonRequestResponse.requestId());
        }
    }

    @Override // X.C1G7
    public final void DoJ(TigonRequestStarted tigonRequestStarted) {
        NetworkTrafficApi networkTrafficApi;
        if (tigonRequestStarted != null && (networkTrafficApi = this.A00) != null) {
            networkTrafficApi.onHttpEventStart(tigonRequestStarted.requestId());
        }
    }

    @Override // com.facebook.rsys.networktraffic.gen.NetworkTrafficProxy
    public final void onCallEnd() {
        this.A01.set(false);
    }

    @Override // com.facebook.rsys.networktraffic.gen.NetworkTrafficProxy
    public final void onCallStart() {
        this.A01.set(true);
        if (this.A00 != null) {
            C1GD.A01.add(this);
        }
    }
}
