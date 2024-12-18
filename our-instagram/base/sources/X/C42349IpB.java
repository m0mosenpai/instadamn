package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.LinkedHashMap;
import java.util.concurrent.TimeUnit;

/* renamed from: X.IpB, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42349IpB implements InterfaceC13050lr {
    public C1ON A00;
    public final Context A01;
    public final UserSession A02;
    public final C1CM A03;

    public final void A00(String str) {
        if (this.A00 == null) {
            LinkedHashMap A07 = AbstractC06930Yk.A07(AbstractC166987dD.A1L("pagination_source", "text_post_feed_threads"));
            if (str != null) {
                A07.put(AbstractC111324zv.A00(2538), str);
            }
            UserSession userSession = this.A02;
            String str2 = userSession.userId;
            C1EU c1eu = new C1EU(null, null, C1EN.A06, new C1ES(C05F.A00, null, null, TimeUnit.HOURS.toMillis(12L)), null, str2, null, null, null, AbstractC167017dG.A0j(), null, AbstractC06930Yk.A0E(), A07, C1EU.A0G.incrementAndGet(), false, false);
            C25621Ms A0c = AbstractC167017dG.A0c(userSession);
            A0c.A0B("feed/text_post_app_timeline/");
            A0c.A0Q(N3Q.A04);
            A0c.A0G(AbstractC43591JPw.A00(31), AbstractC43591JPw.A00(60));
            AbstractC23771Ej.A01(this.A01, A0c, userSession, c1eu, this.A03);
            C1ON A0N = A0c.A0N();
            this.A00 = A0N;
            synchronized (C41575IaO.A03) {
                C41575IaO.A02 = true;
                C41575IaO.A01 = null;
            }
            C39030HGg.A00(A0N, this, 0);
            C1GJ.A06(A0N, 1285440136, 1, true, true);
        }
    }

    @Override // X.InterfaceC13050lr
    public final void onUserSessionWillEnd(boolean z) {
        C1ON c1on = this.A00;
        if (c1on != null) {
            c1on.A02 = true;
            c1on.A00 = null;
            this.A00 = null;
        }
    }

    public C42349IpB(UserSession userSession, Context context) {
        this.A02 = userSession;
        this.A01 = context;
        this.A03 = new C1CM(AbstractC166987dD.A0O(context));
    }
}
