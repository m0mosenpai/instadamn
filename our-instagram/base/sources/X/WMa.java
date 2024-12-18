package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* loaded from: classes11.dex */
public final class WMa implements View.OnClickListener {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ String A02;

    public WMa(FragmentActivity fragmentActivity, UserSession userSession, String str) {
        this.A01 = userSession;
        this.A00 = fragmentActivity;
        this.A02 = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(550957263);
        C08730cb c08730cb = C17060sy.A01;
        UserSession userSession = this.A01;
        User A01 = c08730cb.A01(userSession);
        C71603Jf c71603Jf = new C71603Jf(userSession);
        C71164Woz c71164Woz = new C71164Woz(userSession, A01, c71603Jf, this.A02);
        boolean A08 = AbstractC206099Aq.A08(userSession);
        FragmentActivity fragmentActivity = this.A00;
        C57312k6 A00 = C07Y.A00(fragmentActivity);
        AbstractC23641Du.A05(AnonymousClass191.A00, new C50528MSh(c71603Jf, c71164Woz, userSession, fragmentActivity, null, 5, A08), A00);
        C0f9.A0C(847183168, A05);
    }
}
