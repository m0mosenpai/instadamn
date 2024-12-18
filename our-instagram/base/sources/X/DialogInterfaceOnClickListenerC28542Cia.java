package X;

import android.content.DialogInterface;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.Cia, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class DialogInterfaceOnClickListenerC28542Cia implements DialogInterface.OnClickListener {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ C692639m A01;
    public final /* synthetic */ C38321qM A02;
    public final /* synthetic */ C75113Zb A03;
    public final /* synthetic */ User A04;

    public DialogInterfaceOnClickListenerC28542Cia(FragmentActivity fragmentActivity, C692639m c692639m, C38321qM c38321qM, C75113Zb c75113Zb, User user) {
        this.A01 = c692639m;
        this.A04 = user;
        this.A02 = c38321qM;
        this.A03 = c75113Zb;
        this.A00 = fragmentActivity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        C692639m c692639m = this.A01;
        UserSession userSession = c692639m.A02;
        InterfaceC60442pS interfaceC60442pS = c692639m.A04;
        User user = this.A04;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC60442pS, userSession), "unfollow_dialog_confirmed");
        AbstractC25236BEt.A0o(A0f, interfaceC60442pS, user);
        A0f.Cht();
        C692639m.A00(this.A00, c692639m, this.A02, this.A03);
    }
}
