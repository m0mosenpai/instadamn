package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.Iux, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42702Iux implements InterfaceC58152PqH {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ InterfaceC11380iw A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ User A03;
    public final /* synthetic */ OLM A04;
    public final /* synthetic */ C37061o4 A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;

    @Override // X.InterfaceC58152PqH
    public final void onDismiss() {
    }

    @Override // X.InterfaceC58152PqH
    public final /* synthetic */ void onTextClick(View view) {
    }

    public C42702Iux(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, User user, OLM olm, C37061o4 c37061o4, String str, String str2) {
        this.A04 = olm;
        this.A06 = str;
        this.A05 = c37061o4;
        this.A02 = userSession;
        this.A00 = context;
        this.A01 = interfaceC11380iw;
        this.A03 = user;
        this.A07 = str2;
    }

    @Override // X.InterfaceC58152PqH
    public final void onButtonClick(View view) {
        this.A04.A02("upsell_snackbar", this.A06, "comment_deletion_block", MSV.A00(420));
        C37061o4 c37061o4 = this.A05;
        C37061o4.A00(this.A00, this.A01, this.A02, this.A03, c37061o4, "comment_deletion_toast_upsell", this.A07);
    }

    @Override // X.InterfaceC58152PqH
    public final void onShow() {
        this.A04.A01("upsell_snackbar", this.A06, "comment_deletion_block");
        C37061o4.A01(this.A02, C05F.A01, "toast");
    }
}
