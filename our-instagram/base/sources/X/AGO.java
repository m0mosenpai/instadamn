package X;

import android.content.Context;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.direct.capabilities.Capabilities;
import com.instagram.user.model.User;

/* loaded from: classes4.dex */
public final class AGO {
    public ViewGroup A00;
    public final int A01;
    public final FragmentActivity A02;
    public final InterfaceC59992oh A03;
    public final UserSession A04;
    public final Capabilities A05;
    public final LIW A06;
    public final InterfaceC163977Vl A07;
    public final InterfaceC09390do A08;

    public static final void A00(C2EE c2ee, AGO ago, Integer num, boolean z) {
        String str;
        ago.A07.D9g(c2ee.BKb(), num, AbstractC31224Do7.A03(c2ee.BSH(), c2ee.CVQ()), z);
        if (C1VN.A00 != null) {
            C1VN A00 = AbstractC31282Dp4.A00();
            FragmentActivity fragmentActivity = ago.A02;
            UserSession userSession = ago.A04;
            User BT1 = c2ee.BT1();
            if (BT1 != null) {
                str = BT1.getId();
            } else {
                str = "";
            }
            A00.A00(fragmentActivity, userSession, AbstractC43591JPw.A00(522), AbstractC47112Ks7.A00(str));
        }
    }

    public AGO(FragmentActivity fragmentActivity, InterfaceC59992oh interfaceC59992oh, UserSession userSession, Capabilities capabilities, InterfaceC163977Vl interfaceC163977Vl) {
        this.A04 = userSession;
        this.A02 = fragmentActivity;
        this.A03 = interfaceC59992oh;
        this.A07 = interfaceC163977Vl;
        this.A05 = capabilities;
        Context applicationContext = fragmentActivity.getApplicationContext();
        this.A06 = AbstractC47008KqR.A00(applicationContext);
        this.A01 = applicationContext.getColor(AbstractC53242c7.A03(applicationContext));
        this.A08 = C1XM.A00(B76.A00);
    }
}
