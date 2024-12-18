package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.perf.constants.ThreadFetchReason;

/* renamed from: X.EZm, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32662EZm extends AbstractRunnableC14200nk {
    public final /* synthetic */ C163827Uw A00;
    public final /* synthetic */ ThreadFetchReason A01;
    public final /* synthetic */ String A02;

    @Override // java.lang.Runnable
    public final void run() {
        C11T.A05(AbstractC43591JPw.A00(30));
        UserSession userSession = this.A00.A0G;
        String str = this.A02;
        LL3.A00(userSession, this.A01, AbstractC25227BEk.A0p(), str, true);
        C23031Ai A00 = AbstractC23021Ah.A00(userSession);
        long currentTimeMillis = System.currentTimeMillis();
        InterfaceC19610xo A0w = AbstractC166987dD.A0w(A00);
        A0w.E7G(AnonymousClass001.A0R(AbstractC111324zv.A00(5396), str), currentTimeMillis);
        A0w.apply();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32662EZm(C163827Uw c163827Uw, ThreadFetchReason threadFetchReason, String str) {
        super(1111126718, 4, true, false);
        this.A00 = c163827Uw;
        this.A02 = str;
        this.A01 = threadFetchReason;
    }
}
