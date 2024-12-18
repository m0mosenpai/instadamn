package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.Fnp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ViewOnClickListenerC35598Fnp implements View.OnClickListener {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ InterfaceC11380iw A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ User A03;

    public ViewOnClickListenerC35598Fnp(FragmentActivity fragmentActivity, InterfaceC11380iw interfaceC11380iw, UserSession userSession, User user) {
        this.A00 = fragmentActivity;
        this.A02 = userSession;
        this.A01 = interfaceC11380iw;
        this.A03 = user;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(-1149240966);
        FragmentActivity fragmentActivity = this.A00;
        if (fragmentActivity != null) {
            AbstractC35068Fcf.A02(fragmentActivity, this.A01, this.A02, this.A03, null, false);
        }
        C0f9.A0C(-1968068565, A05);
    }
}
