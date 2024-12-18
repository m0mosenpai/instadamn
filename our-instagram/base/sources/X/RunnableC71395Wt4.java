package X;

import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.instagram.attribution.ReportAdvertiserIDMutationResponseImpl;
import java.util.ArrayList;

/* renamed from: X.Wt4, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71395Wt4 implements Runnable {
    public final /* synthetic */ W4T A00;

    public RunnableC71395Wt4(W4T w4t) {
        this.A00 = w4t;
    }

    @Override // java.lang.Runnable
    public final void run() {
        W4T w4t = this.A00;
        C70151W8r.A01(C70151W8r.A00("flush", "server_side", null, null), "info", w4t.A04);
        C68937Veb c68937Veb = w4t.A01;
        String A00 = w4t.A02.A00();
        X1J x1j = new X1J(w4t);
        C2JM c2jm = new C2JM();
        C2JM c2jm2 = new C2JM();
        C0CA A0T = AbstractC25227BEk.A0T(GraphQlCallInput.A02, A00, "adid");
        C0CA.A00(A0T, AbstractC166997dE.A0n(), "client_mutation_id");
        C0CA.A00(A0T, c68937Veb.A00.userId, "actor_id");
        PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(AbstractC25233BEq.A0H(A0T, c2jm, "input"), "ReportAdvertiserIDMutation", c2jm.getParamsCopy(), c2jm2.getParamsCopy(), ReportAdvertiserIDMutationResponseImpl.class, true, null, 96, null, "report_advertiser_id", new ArrayList());
        c68937Veb.A01.ATV(new C48138LSn(0, x1j, c68937Veb), new WW0(x1j, 1), pandoGraphQLRequest);
    }
}
