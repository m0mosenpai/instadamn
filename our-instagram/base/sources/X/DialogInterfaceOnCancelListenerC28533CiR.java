package X;

import android.content.DialogInterface;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.CiR, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class DialogInterfaceOnCancelListenerC28533CiR implements DialogInterface.OnCancelListener {
    public final /* synthetic */ C692639m A00;
    public final /* synthetic */ User A01;

    public DialogInterfaceOnCancelListenerC28533CiR(C692639m c692639m, User user) {
        this.A00 = c692639m;
        this.A01 = user;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        C692639m c692639m = this.A00;
        UserSession userSession = c692639m.A02;
        InterfaceC60442pS interfaceC60442pS = c692639m.A04;
        User user = this.A01;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC60442pS, userSession), "unfollow_dialog_cancelled");
        AbstractC25236BEt.A0o(A0f, interfaceC60442pS, user);
        A0f.Cht();
    }
}
