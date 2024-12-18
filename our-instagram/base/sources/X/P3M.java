package X;

import android.view.View;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class P3M implements InterfaceC58152PqH {
    public final /* synthetic */ C25814BbV A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C84923qg A02;
    public final /* synthetic */ Runnable A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;

    @Override // X.InterfaceC58152PqH
    public final /* synthetic */ void onTextClick(View view) {
    }

    public P3M(C25814BbV c25814BbV, UserSession userSession, C84923qg c84923qg, Runnable runnable, String str, String str2) {
        this.A01 = userSession;
        this.A02 = c84923qg;
        this.A03 = runnable;
        this.A00 = c25814BbV;
        this.A04 = str;
        this.A05 = str2;
    }

    @Override // X.InterfaceC58152PqH
    public final void onButtonClick(View view) {
        OOJ.A00(this.A01, this.A02, "undo_hide");
        AbstractC54339Nzx.A00.removeCallbacks(this.A03);
        C25814BbV c25814BbV = this.A00;
        c25814BbV.A0A.A0O(this.A04, this.A05);
    }

    @Override // X.InterfaceC58152PqH
    public final void onDismiss() {
        OOJ.A01(this.A01, this.A02, "undo_toast_presented");
    }

    @Override // X.InterfaceC58152PqH
    public final void onShow() {
        OOJ.A01(this.A01, this.A02, "show_undo_toast");
    }
}
