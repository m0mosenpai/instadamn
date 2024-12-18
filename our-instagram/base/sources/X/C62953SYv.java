package X;

import android.os.SystemClock;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebookpay.logging.FBPayLoggerData;
import com.instagram.common.session.UserSession;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/* renamed from: X.SYv, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62953SYv {
    public static final long A04 = TimeUnit.DAYS.toMillis(30);
    public long A00 = 0;
    public UserSession A01;
    public final C2GC A02;
    public final C40701ud A03;

    public final C60622REh A00(FBPayLoggerData fBPayLoggerData, Integer num, String str) {
        String str2;
        String str3;
        boolean A1X = AbstractC167007dF.A1X(num, C05F.A0C);
        this.A00 = SystemClock.elapsedRealtime();
        if (A1X) {
            str2 = "fetch_auth_flows_cached_content_init";
        } else {
            str2 = "fetch_auth_flows_content_init";
        }
        HashMap A1G = AbstractC166987dD.A1G();
        A1G.put("logger_data", fBPayLoggerData);
        A1G.put("product", str);
        this.A02.Chz(str2, A1G);
        C2JM A0b = AbstractC25225BEi.A0b();
        C2JM A0b2 = AbstractC25225BEi.A0b();
        C0CA A0T = AbstractC25227BEk.A0T(GraphQlCallInput.A02, "fixed_client_mutation_id", "client_mutation_id");
        UserSession userSession = this.A01;
        if (userSession != null) {
            str3 = userSession.userId;
        } else {
            str3 = "";
        }
        C0CA.A00(A0T, str3, "actor_id");
        C0CA.A00(A0T, str, "payment_type");
        PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(AbstractC25233BEq.A0H(A0T, A0b, "input"), "IGFBPayAuthFlowsContentQuery", A0b.getParamsCopy(), A0b2.getParamsCopy(), Qh5.class, false, null, 12, "input", null, AbstractC166987dD.A1E());
        if (A1X) {
            long j = A04;
            pandoGraphQLRequest.setMaxToleratedCacheAgeMs(j);
            pandoGraphQLRequest.setFreshCacheAgeMs(j);
        } else {
            pandoGraphQLRequest.setFreshCacheAgeMs(0L).setMaxToleratedCacheAgeMs(0L);
        }
        C60622REh A00 = C60622REh.A00(null, this.A03, pandoGraphQLRequest, new C64285T7u(this, 6));
        A00.A9a(new C64201T3k(fBPayLoggerData, this, str, A1X));
        return A00;
    }

    public C62953SYv(C2GC c2gc, AbstractC12990ll abstractC12990ll) {
        C40701ud A00;
        if (abstractC12990ll instanceof UserSession) {
            UserSession userSession = (UserSession) abstractC12990ll;
            this.A01 = userSession;
            if (userSession != null) {
                A00 = AbstractC40691uc.A01(userSession);
                this.A03 = A00;
                this.A02 = c2gc;
            }
        }
        A00 = AbstractC40691uc.A00((C07270a1) abstractC12990ll);
        this.A03 = A00;
        this.A02 = c2gc;
    }
}
