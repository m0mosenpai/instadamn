package X;

import com.facebook.R;
import com.instagram.casper.IgSignalsCasper;
import com.instagram.jobscheduler.bgfetch.IgBgFetchJob;
import com.instagram.jobscheduler.bgfetch.IgBgFetchJobRun;
import com.instagram.jobscheduler.bgfetch.IgBgFetchMetadata;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
public final class LG1 {
    public final IgSignalsCasper A00;
    public final List A01;
    public final L9P A02;
    public final List A03;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.AbstractCollection, java.util.ArrayList] */
    public static final void A00(LG1 lg1, InterfaceC16660sJ interfaceC16660sJ) {
        Object obj;
        L9P l9p = lg1.A02;
        if (l9p != null) {
            List A0a = AbstractC001800i.A0a(l9p.A02());
            obj = AbstractC167017dG.A0q(A0a);
            Iterator it = A0a.iterator();
            while (it.hasNext()) {
                AbstractC166997dE.A1X(obj, AbstractC166987dD.A0N(it.next()) * 1000);
            }
        } else {
            obj = C16930sl.A00;
        }
        interfaceC16660sJ.invoke(obj);
    }

    public final void A01(IgBgFetchMetadata igBgFetchMetadata, AbstractC46475KhZ abstractC46475KhZ, InterfaceC16660sJ interfaceC16660sJ) {
        C30177DRh c30177DRh = new C30177DRh(11, this, interfaceC16660sJ, igBgFetchMetadata, abstractC46475KhZ);
        long currentTimeMillis = System.currentTimeMillis();
        List list = this.A01;
        long j = 900000;
        if (!list.isEmpty()) {
            if (abstractC46475KhZ instanceof KYV) {
                Number number = (Number) AbstractC001800i.A0O(list, 0);
                if (number != null) {
                    j = number.longValue();
                }
            } else if (abstractC46475KhZ instanceof KYU) {
                IgBgFetchJobRun igBgFetchJobRun = ((KYU) abstractC46475KhZ).A00;
                long A0N = AbstractC166987dD.A0N(list.get(Math.max(0, Math.min(AbstractC25226BEj.A05(list), igBgFetchMetadata.A01.size() + 1))));
                j = Math.min(A0N, Math.max(900000L, (2 * A0N) - (igBgFetchJobRun.A01 - igBgFetchJobRun.A03)));
            } else {
                throw B4Z.A00();
            }
        }
        IgBgFetchJob igBgFetchJob = new IgBgFetchJob(R.id.ig_bg_fetch_id, currentTimeMillis + j);
        C14360o3.A07(Collections.singletonList(igBgFetchJob));
        c30177DRh.invoke(AbstractC166987dD.A1J(igBgFetchJob));
    }

    public LG1(L9P l9p, IgSignalsCasper igSignalsCasper, List list) {
        this.A01 = list;
        this.A03 = list;
        this.A02 = l9p;
        this.A00 = igSignalsCasper;
    }
}
