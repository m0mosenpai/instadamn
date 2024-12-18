package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.LqQ, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49270LqQ implements MQ3 {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C9A2 A01;
    public final /* synthetic */ C15370ps A02;

    @Override // X.MQ3
    public final /* synthetic */ void DGo(boolean z) {
    }

    public C49270LqQ(C9A2 c9a2, C15370ps c15370ps, long j) {
        this.A01 = c9a2;
        this.A02 = c15370ps;
        this.A00 = j;
    }

    @Override // X.MQ3
    public final void DGm(C47621L1g c47621L1g) {
        C2ED c2ed = (C2ED) c47621L1g.A01;
        if (c2ed != null) {
            C9A2 c9a2 = this.A01;
            UserSession userSession = c9a2.A00;
            LAB A00 = AbstractC47001KqK.A00(userSession);
            C15370ps c15370ps = this.A02;
            A00.A01.A03(AbstractC167027dH.A0Q(c15370ps.A00), "thread_fetch_end");
            C83403nh BSg = C2JD.A00(userSession).BSg(c2ed.BKb(), (String) c15370ps.A00);
            if (BSg != null) {
                ((C47976LIn) c9a2.A01.getValue()).A03(BSg, c2ed, null);
            } else {
                C0K8.A0C("ArmadilloExpressMissingThreadTracker", AnonymousClass001.A0R("Not able to find message id in thread store ", (String) c15370ps.A00));
            }
            c9a2.A00(this.A00);
            return;
        }
        LAB A002 = AbstractC47001KqK.A00(this.A01.A00);
        String str = (String) this.A02.A00;
        int i = c47621L1g.A00;
        List list = c47621L1g.A02;
        C14360o3.A0B(str, 0);
        A002.A02.A00(str);
        LJA lja = A002.A01;
        lja.A04(str, "thread_fetch_failure_error_code", i);
        lja.A08(str, (Integer[]) list.toArray(new Integer[0]));
        lja.A07(str, (short) 3);
        C0K8.A0C("ArmadilloExpressMissingThreadTracker", AnonymousClass001.A0Q("Fetch thread by threadJid failed ", this.A00));
    }
}
