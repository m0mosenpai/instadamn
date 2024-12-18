package X;

import com.facebook.pando.PandoGraphQLRequest;
import com.instagram.attribution.FetchAttributionEventComplianceActionResponseImpl;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.WvX, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71528WvX implements Runnable {
    public final /* synthetic */ List A00;
    public final /* synthetic */ W4T A01;

    public RunnableC71528WvX(List list, W4T w4t) {
        this.A01 = w4t;
        this.A00 = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        W4T w4t = this.A01;
        List list = this.A00;
        C70151W8r c70151W8r = w4t.A04;
        C14360o3.A0B(list, 1);
        C70151W8r.A01(C70151W8r.A00("report_events_compliant", null, null, list), "info", c70151W8r);
        C68936Vea c68936Vea = w4t.A00;
        VgY vgY = new VgY(list, w4t);
        C2JM c2jm = new C2JM();
        C2JM c2jm2 = new C2JM();
        C2JQ c2jq = PandoGraphQLRequest.Companion;
        C1Dk freshCacheAgeMs = new PandoGraphQLRequest(AbstractC40511uK.A00(), "FetchAttributionEventComplianceAction", c2jm.getParamsCopy(), c2jm2.getParamsCopy(), FetchAttributionEventComplianceActionResponseImpl.class, false, null, 0, null, "fetch_attribution_event_compliance_action", new ArrayList()).setMaxToleratedCacheAgeMs(0L).setFreshCacheAgeMs(0L);
        C40701ud c40701ud = c68936Vea.A00;
        WW3 ww3 = new WW3(1, c68936Vea, vgY);
        C70435WVn c70435WVn = new C70435WVn(1, vgY, c68936Vea);
        X2A x2a = X2A.A00;
        C14360o3.A07(x2a);
        c40701ud.ATW(c70435WVn, ww3, freshCacheAgeMs, x2a);
    }
}
