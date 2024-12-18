package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.G8p, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36517G8p implements InterfaceC58152PqH {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ AbstractC59962oe A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ InterfaceC83713oG A03;

    @Override // X.InterfaceC58152PqH
    public final void onDismiss() {
    }

    @Override // X.InterfaceC58152PqH
    public final void onShow() {
    }

    @Override // X.InterfaceC58152PqH
    public final /* synthetic */ void onTextClick(View view) {
    }

    public C36517G8p(FragmentActivity fragmentActivity, AbstractC59962oe abstractC59962oe, UserSession userSession, InterfaceC83713oG interfaceC83713oG) {
        this.A00 = fragmentActivity;
        this.A02 = userSession;
        this.A01 = abstractC59962oe;
        this.A03 = interfaceC83713oG;
    }

    @Override // X.InterfaceC58152PqH
    public final void onButtonClick(View view) {
        C36881nl A01 = C36881nl.A01(this.A00, this.A01, this.A02, "follow_button_toast_view");
        A01.A0B = this.A03;
        A01.A06();
    }
}
