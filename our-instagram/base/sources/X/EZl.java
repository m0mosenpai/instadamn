package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.perf.constants.ThreadFetchReason;

/* loaded from: classes6.dex */
public final class EZl extends AbstractRunnableC14200nk {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ C164617Ya A01;
    public final /* synthetic */ String A02;

    @Override // java.lang.Runnable
    public final void run() {
        C11T.A05(AbstractC43591JPw.A00(30));
        C2EC A00 = LL3.A00(this.A00, ThreadFetchReason.FETCH_CHANNEL_MESSAGES, 20, this.A02, true);
        C164617Ya c164617Ya = this.A01;
        if (c164617Ya != null && A00 != null) {
            C11T.A02(new RunnableC36899GNu(c164617Ya, A00));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EZl(UserSession userSession, C164617Ya c164617Ya, String str) {
        super(952861280, 3, false, false);
        this.A00 = userSession;
        this.A02 = str;
        this.A01 = c164617Ya;
    }
}
