package X;

import android.app.Activity;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.CwB, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29316CwB implements InterfaceC58152PqH {
    public final InterfaceC11380iw A00;
    public final UserSession A01;
    public final User A02;

    public C29316CwB(InterfaceC11380iw interfaceC11380iw, UserSession userSession, User user) {
        C14360o3.A0B(userSession, 2);
        this.A02 = user;
        this.A01 = userSession;
        this.A00 = interfaceC11380iw;
    }

    @Override // X.InterfaceC58152PqH
    public final void onButtonClick(View view) {
        C14360o3.A0B(view, 0);
        Activity A01 = AbstractC13330mJ.A01(AbstractC166997dE.A0L(view));
        if (A01 != null) {
            LKo.A00.A04(A01, this.A00, this.A01, this.A02.getId(), true);
        }
    }

    @Override // X.InterfaceC58152PqH
    public final void onDismiss() {
    }

    @Override // X.InterfaceC58152PqH
    public final void onShow() {
    }

    @Override // X.InterfaceC58152PqH
    public final /* synthetic */ void onTextClick(View view) {
    }
}
