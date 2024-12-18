package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.perf.constants.ThreadFetchReason;
import com.instagram.direct.request.DirectThreadApi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.L8d, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47778L8d {
    public final UserSession A00;
    public final LHz A01;

    public C47778L8d(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = new LHz(userSession);
    }

    public final void A00(ThreadFetchReason threadFetchReason, MQ3 mq3, long j) {
        C47621L1g c47621L1g;
        Long BTC = C17060sy.A01.A01(this.A00).BTC();
        if (BTC != null) {
            LHz lHz = this.A01;
            List A1Q = AbstractC16960so.A1Q(Long.valueOf(j), BTC);
            UserSession userSession = lHz.A00;
            C2DS A00 = C2JD.A00(userSession);
            if (!((C2DU) A00).A0H.A0F) {
                A00.CoS("GetThreadByRecipientIds");
            }
            C81663kb B3V = A00.B3V(AbstractC166987dD.A0N(AbstractC001800i.A0I(A1Q)));
            if (B3V != null && AbstractC31283Dp5.A00(B3V)) {
                c47621L1g = new C47621L1g(B3V, C16930sl.A00, 0);
            } else {
                List A0Z = AbstractC001800i.A0Z(A1Q);
                ArrayList A0q = AbstractC167017dG.A0q(A0Z);
                Iterator it = A0Z.iterator();
                while (it.hasNext()) {
                    A0q.add(String.valueOf(AbstractC166987dD.A0N(it.next())));
                }
                Map map = lHz.A02;
                List A12 = AbstractC43592JPx.A12(A0q, map);
                if (A12 != null) {
                    A12.add(mq3);
                    mq3.DGo(true);
                    return;
                } else {
                    map.put(A0q, AbstractC16960so.A1N(mq3));
                    LL3.A04(userSession, threadFetchReason, new C49326LrK(lHz, A0q), A0q, true, true);
                    return;
                }
            }
        } else {
            c47621L1g = new C47621L1g(null, C16930sl.A00, 23);
        }
        mq3.DGm(c47621L1g);
    }

    public final void A01(ThreadFetchReason threadFetchReason, MQ3 mq3, long j) {
        LHz lHz = this.A01;
        UserSession userSession = lHz.A00;
        C2DS A00 = C2JD.A00(userSession);
        if (!((C2DU) A00).A0H.A0F) {
            A00.CoS("GetThreadByThreadJid");
        }
        C81663kb B3V = A00.B3V(j);
        if (B3V != null && AbstractC31283Dp5.A00(B3V)) {
            mq3.DGm(new C47621L1g(B3V, C16930sl.A00, 0));
            return;
        }
        Map map = lHz.A01;
        Long valueOf = Long.valueOf(j);
        List A12 = AbstractC43592JPx.A12(valueOf, map);
        if (A12 != null) {
            A12.add(mq3);
            mq3.DGo(true);
            return;
        }
        map.put(valueOf, AbstractC16960so.A1N(mq3));
        C49327LrL c49327LrL = new C49327LrL(lHz, j);
        C09530e4 A02 = LL3.A02(userSession, threadFetchReason, null, "threadJid", AbstractC167017dG.A0j(), true);
        C4KV c4kv = (C4KV) A02.A00;
        AnonymousClass776 anonymousClass776 = (AnonymousClass776) A02.A01;
        C1ON A04 = DirectThreadApi.A04(userSession, valueOf, AbstractC43593JPy.A0w(), null, C16930sl.A00, false, true);
        A04.A00 = new C45390K8d(userSession, anonymousClass776, c4kv, c49327LrL, j);
        C1GJ.A03(A04);
    }
}
