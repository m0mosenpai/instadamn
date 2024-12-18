package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class KMX extends AbstractRunnableC14200nk {
    public final /* synthetic */ C116155Nu A00;
    public final /* synthetic */ AbstractC12990ll A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ C1WZ A03;
    public final /* synthetic */ C1WE A04;
    public final /* synthetic */ Runnable A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KMX(C116155Nu c116155Nu, AbstractC12990ll abstractC12990ll, UserSession userSession, C1WZ c1wz, C1WE c1we, Runnable runnable, String str, String str2) {
        super(166, 3, true, true);
        this.A03 = c1wz;
        this.A06 = str;
        this.A00 = c116155Nu;
        this.A02 = userSession;
        this.A07 = str2;
        this.A04 = c1we;
        this.A01 = abstractC12990ll;
        this.A05 = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = this.A06;
        if (!str.equals("ig_watch_receipts")) {
            C1WE c1we = this.A04;
            C116155Nu c116155Nu = this.A00;
            UserSession userSession = this.A02;
            String str2 = this.A07;
            c1we.A06(c116155Nu, userSession, str2);
            JQX.A00(c116155Nu.A0j).Cn5("prepare_for_push_notification_end", c116155Nu.A0K.longValue());
            C1WZ.A00(c116155Nu, this.A01, this.A03, c1we, this.A05, str, str2);
        }
    }
}
