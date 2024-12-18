package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.keyword.Keyword;

/* loaded from: classes11.dex */
public final class U11 implements InterfaceC13050lr {
    public static final XED A01 = new MZ6(1);
    public static final XDR A02 = new C65904TwA(2);
    public final C65739TtE A00;

    public final synchronized void A00(Keyword keyword) {
        C14360o3.A0B(keyword, 0);
        this.A00.A04(keyword);
    }

    @Override // X.InterfaceC13050lr
    public final void onUserSessionWillEnd(boolean z) {
        if (z) {
            synchronized (this) {
                this.A00.A03();
            }
        }
    }

    public U11(UserSession userSession) {
        this.A00 = new C65739TtE(userSession, A01, A02, 100);
    }
}
