package X;

import android.app.Activity;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.G8s, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36520G8s implements InterfaceC58152PqH {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ InterfaceC11380iw A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ String A03;

    @Override // X.InterfaceC58152PqH
    public final void onDismiss() {
    }

    @Override // X.InterfaceC58152PqH
    public final void onShow() {
    }

    @Override // X.InterfaceC58152PqH
    public final /* synthetic */ void onTextClick(View view) {
    }

    public C36520G8s(Activity activity, InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str) {
        this.A02 = userSession;
        this.A03 = str;
        this.A00 = activity;
        this.A01 = interfaceC11380iw;
    }

    @Override // X.InterfaceC58152PqH
    public final void onButtonClick(View view) {
        UserSession userSession = this.A02;
        User A02 = AnonymousClass189.A00(userSession).A02(this.A03);
        if (A02 != null) {
            C36881nl A01 = C36881nl.A01(this.A00, this.A01, userSession, "direct_share_to_friends_story_production_confirmation_toast");
            AbstractC31179DnN.A1Q(A01, A02);
            A01.A06();
        }
    }
}
