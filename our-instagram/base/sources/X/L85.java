package X;

import com.facebook.msys.mci.Execution;
import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final /* synthetic */ class L85 {
    public final /* synthetic */ C116155Nu A00;
    public final /* synthetic */ AbstractC12990ll A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ C1WZ A03;
    public final /* synthetic */ C1WE A04;
    public final /* synthetic */ Runnable A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;

    public /* synthetic */ L85(C116155Nu c116155Nu, AbstractC12990ll abstractC12990ll, UserSession userSession, C1WZ c1wz, C1WE c1we, Runnable runnable, String str, String str2) {
        this.A03 = c1wz;
        this.A06 = str;
        this.A00 = c116155Nu;
        this.A02 = userSession;
        this.A07 = str2;
        this.A04 = c1we;
        this.A01 = abstractC12990ll;
        this.A05 = runnable;
    }

    public final void A00(boolean z) {
        C1WZ c1wz = this.A03;
        String str = this.A06;
        C116155Nu c116155Nu = this.A00;
        UserSession userSession = this.A02;
        String str2 = this.A07;
        C1WE c1we = this.A04;
        AbstractC12990ll abstractC12990ll = this.A01;
        Runnable runnable = this.A05;
        boolean equals = str.equals("ig_watch_receipts");
        boolean A1Q = AbstractC25230BEn.A1Q(equals ? 1 : 0);
        if (z) {
            if (A1Q && !equals) {
                throw AbstractC166987dD.A12(String.format(AbstractC111324zv.A00(55), str));
            }
            boolean A09 = c1we.A09(c116155Nu, userSession, str2);
            MRU A00 = JQX.A00(c116155Nu.A0j);
            long longValue = c116155Nu.A0K.longValue();
            if (A09) {
                A00.Cn5("prepare_for_push_notification_start", longValue);
                KMX kmx = new KMX(c116155Nu, abstractC12990ll, userSession, c1wz, c1we, runnable, str, str2);
                if (Execution.getExecutionContext() != 0) {
                    C14120nc.A00().ATO(kmx);
                    return;
                } else {
                    kmx.run();
                    return;
                }
            }
            A00.Cn5("prepare_for_push_notification_skipped", longValue);
            C1WZ.A00(c116155Nu, abstractC12990ll, c1wz, c1we, runnable, str, str2);
            return;
        }
        if (A1Q) {
            if (!equals) {
                throw AbstractC166987dD.A12(String.format(AbstractC111324zv.A00(55), str));
            }
        } else {
            c1we.A04(c116155Nu, abstractC12990ll, str2);
        }
        AbstractC44086JeB.A02(c116155Nu, abstractC12990ll, "shouldSendNotification returned false", null, 3);
        runnable.run();
    }
}
