package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class KLY extends AbstractRunnableC14200nk {
    public final /* synthetic */ UserSession A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KLY(UserSession userSession) {
        super(54546400, 3, false, false);
        this.A00 = userSession;
    }

    @Override // java.lang.Runnable
    public final void run() {
        LCL.A00(this.A00).A02(System.currentTimeMillis());
    }
}
