package X;

import com.facebook.pando.PandoGraphQLRequest;
import com.instagram.attribution.ReportAttributionEventsMutationResponseImpl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* loaded from: classes11.dex */
public final class W4T {
    public final C68936Vea A00;
    public final C68937Veb A01;
    public final FP5 A02;
    public final ExecutorService A03;
    public final C70151W8r A04;

    public static final void A00(List list, W4T w4t, boolean z) {
        String A00;
        String str;
        if (z) {
            A00 = null;
        } else {
            A00 = w4t.A02.A00();
        }
        C68937Veb c68937Veb = w4t.A01;
        X1K x1k = new X1K(list, w4t);
        C14360o3.A0B(list, 0);
        ArrayList A0q = AbstractC167017dG.A0q(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            EnumC33361Eou enumC33361Eou = (EnumC33361Eou) it.next();
            C2JO c2jo = new C2JO();
            c2jo.A09(A00, "adid");
            int A05 = AbstractC25227BEk.A05(enumC33361Eou, 0);
            if (A05 != 0) {
                if (A05 != 1) {
                    if (A05 != 4) {
                        str = null;
                    } else {
                        str = MSV.A00(825);
                    }
                } else {
                    str = AbstractC111324zv.A00(3720);
                }
            } else {
                str = "LOGIN";
            }
            c2jo.A09(str, "event_name");
            c2jo.A08("no_advertisement_id", Boolean.valueOf(z));
            A0q.add(c2jo);
        }
        Be9 be9 = new Be9();
        be9.A05("events", A0q);
        be9.A07(AbstractC166997dE.A0n(), "client_mutation_id");
        be9.A07(c68937Veb.A00.userId, "actor_id");
        C2JM c2jm = new C2JM();
        C2JM c2jm2 = new C2JM();
        c2jm.A00(be9, "input");
        C2JQ c2jq = PandoGraphQLRequest.Companion;
        PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(AbstractC40511uK.A00(), "ReportAttributionEventsMutation", c2jm.getParamsCopy(), c2jm2.getParamsCopy(), ReportAttributionEventsMutationResponseImpl.class, true, null, 96, null, "report_attribution_events", new ArrayList());
        c68937Veb.A01.ATV(new C48147LSw(0, x1k, c68937Veb, list), new WW0(x1k, 2), pandoGraphQLRequest);
    }

    public W4T(C68936Vea c68936Vea, C68937Veb c68937Veb, FP5 fp5, ExecutorService executorService, C70151W8r c70151W8r) {
        this.A02 = fp5;
        this.A01 = c68937Veb;
        this.A00 = c68936Vea;
        this.A03 = executorService;
        this.A04 = c70151W8r;
    }

    public final void A01(EnumC33361Eou enumC33361Eou) {
        this.A03.execute(new RunnableC71528WvX(AbstractC16960so.A1M(enumC33361Eou), this));
    }
}
