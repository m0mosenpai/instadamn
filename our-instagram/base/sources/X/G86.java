package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;

/* loaded from: classes6.dex */
public final class G86 implements InterfaceC199918sv {
    public final /* synthetic */ FNS A00;
    public final /* synthetic */ String A01;

    public G86(FNS fns, String str) {
        this.A00 = fns;
        this.A01 = str;
    }

    @Override // X.InterfaceC199918sv
    public final void onClick() {
        FNS fns = this.A00;
        C34922Fa8.A00(fns.A02, "direct_inbox_options_message_settings_click");
        C08730cb c08730cb = C17060sy.A01;
        UserSession userSession = fns.A01;
        boolean A1X = AbstractC167007dF.A1X(AbstractC31174DnI.A0l(userSession, c08730cb), EnumC222416a.A05);
        C35245Fge c35245Fge = fns.A04;
        if (A1X) {
            UserSession userSession2 = c35245Fge.A02;
            JUI A00 = JUJ.A00(userSession2);
            if (!A00.A02) {
                A00.A05();
            }
            F3H.A00(c35245Fge.A01, userSession2).A00();
            C66277U6x A01 = C66277U6x.A01("com.bloks.www.business_messaging.ig.responsive_guide", AbstractC166987dD.A1G());
            IgBloksScreenConfig A0C = AbstractC31171DnF.A0C(userSession);
            A0C.A0U = this.A01;
            Bundle A002 = W6d.A00(A0C, A01);
            FragmentActivity fragmentActivity = fns.A00;
            C6XJ A03 = C6XJ.A03(fragmentActivity, A002, userSession, ModalActivity.class, "bloks");
            A03.A07();
            A03.A0C(fragmentActivity);
            return;
        }
        c35245Fge.A05();
    }
}
