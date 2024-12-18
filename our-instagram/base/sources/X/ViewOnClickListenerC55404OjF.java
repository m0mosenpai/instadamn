package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.OjF, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class ViewOnClickListenerC55404OjF implements View.OnClickListener {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ String A02;

    public ViewOnClickListenerC55404OjF(FragmentActivity fragmentActivity, UserSession userSession, String str) {
        this.A01 = userSession;
        this.A00 = fragmentActivity;
        this.A02 = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(1766263555);
        C08730cb c08730cb = C17060sy.A01;
        UserSession userSession = this.A01;
        c08730cb.A01(userSession);
        C71603Jf c71603Jf = new C71603Jf(userSession);
        C71163Woy c71163Woy = new C71163Woy(userSession, c71603Jf, this.A02);
        FragmentActivity fragmentActivity = this.A00;
        AbstractC166987dD.A1Z(new C57169PZn(c71603Jf, c71163Woy, fragmentActivity, userSession, null, 47), C07Y.A00(fragmentActivity));
        C0f9.A0C(-1782336985, A05);
    }
}
