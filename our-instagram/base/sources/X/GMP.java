package X;

import com.instagram.common.session.UserSession;
import com.instagram.reels.store.ReelStore;

/* loaded from: classes6.dex */
public final class GMP implements Runnable {
    public final /* synthetic */ UserSession A00;

    public GMP(UserSession userSession) {
        this.A00 = userSession;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ReelStore.A03(this.A00).A0c("election:rollcall_v2");
    }
}
