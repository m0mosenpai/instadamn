package X;

import android.content.DialogInterface;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.Fio, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class DialogInterfaceOnClickListenerC35373Fio implements DialogInterface.OnClickListener {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ InterfaceC11380iw A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ C4F7 A03;
    public final /* synthetic */ User A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;

    public DialogInterfaceOnClickListenerC35373Fio(FragmentActivity fragmentActivity, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C4F7 c4f7, User user, String str, String str2) {
        this.A00 = fragmentActivity;
        this.A02 = userSession;
        this.A04 = user;
        this.A01 = interfaceC11380iw;
        this.A06 = str;
        this.A05 = str2;
        this.A03 = c4f7;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        EV0 A00 = EV0.A00(this.A03, 12);
        FragmentActivity fragmentActivity = this.A00;
        UserSession userSession = this.A02;
        User user = this.A04;
        C1ON A002 = FCH.A00(userSession, user.getId(), this.A01.getModuleName(), this.A06, this.A05, true);
        A002.A00 = new HGR(2, fragmentActivity, A00, user, true);
        C1GJ.A03(A002);
    }
}
