package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.mainactivity.InstagramMainActivity;

/* renamed from: X.G8q, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36518G8q implements InterfaceC58152PqH {
    public final /* synthetic */ AbstractC10360h2 A00;
    public final /* synthetic */ C83753oK A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ InstagramMainActivity A03;

    @Override // X.InterfaceC58152PqH
    public final void onShow() {
    }

    @Override // X.InterfaceC58152PqH
    public final /* synthetic */ void onTextClick(View view) {
    }

    public C36518G8q(AbstractC10360h2 abstractC10360h2, C83753oK c83753oK, UserSession userSession, InstagramMainActivity instagramMainActivity) {
        this.A01 = c83753oK;
        this.A02 = userSession;
        this.A03 = instagramMainActivity;
        this.A00 = abstractC10360h2;
    }

    @Override // X.InterfaceC58152PqH
    public final void onButtonClick(View view) {
        UserSession userSession = this.A02;
        C83753oK.A01(userSession, "login_frictionless_login_toast_logout_pressed", "login_frictionless_login", "frictionless_login", "logged_in");
        InstagramMainActivity.A0J(this.A00, userSession, this.A03);
    }

    @Override // X.InterfaceC58152PqH
    public final void onDismiss() {
        C83753oK.A01(this.A02, "login_frictionless_login_toast_dismissed", "login_frictionless_login", "frictionless_login", "logged_in");
    }
}
