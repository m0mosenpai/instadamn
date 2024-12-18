package X;

import android.view.View;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class P3F implements InterfaceC58152PqH {
    public final /* synthetic */ C92N A00;

    @Override // X.InterfaceC58152PqH
    public final void onDismiss() {
    }

    @Override // X.InterfaceC58152PqH
    public final void onShow() {
    }

    @Override // X.InterfaceC58152PqH
    public final /* synthetic */ void onTextClick(View view) {
    }

    public P3F(C92N c92n) {
        this.A00 = c92n;
    }

    @Override // X.InterfaceC58152PqH
    public final void onButtonClick(View view) {
        C55079OaZ c55079OaZ = C55079OaZ.A00;
        C92N c92n = this.A00;
        UserSession userSession = c92n.A05;
        c55079OaZ.A01(c92n.A00, AbstractC12220kQ.A02(userSession), c92n.A09, "reminder_toast_tap");
        AbstractC54912OQj.A01(c92n.A02, userSession, "reminder_toast");
    }
}
