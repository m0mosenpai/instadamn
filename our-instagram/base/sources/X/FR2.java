package X;

import android.app.Activity;
import android.content.Context;
import com.instagram.common.session.UserSession;
import java.lang.ref.WeakReference;

/* loaded from: classes6.dex */
public final class FR2 {
    public final WeakReference A00;
    public final UserSession A01;
    public final FP6 A02;

    public FR2(Activity activity, UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = AbstractC25225BEi.A16(activity);
        this.A02 = new FP6(userSession);
    }

    public final void A00(InterfaceC11380iw interfaceC11380iw, GXI gxi, String str) {
        C14360o3.A0B(str, 1);
        this.A02.A00(new C36328G0x(interfaceC11380iw, gxi, this), str);
    }

    public final void A01(String str, InterfaceC11380iw interfaceC11380iw) {
        Object obj = this.A00.get();
        if (str == null) {
            Context context = (Context) obj;
            if (context != null) {
                C9GR.A0F(context, "network_error", 2131963183);
                return;
            }
            return;
        }
        Activity activity = (Activity) obj;
        if (activity == null) {
            return;
        }
        C36881nl A01 = C36881nl.A01(activity, interfaceC11380iw, this.A01, "creator_agent_sandbox_profile");
        AbstractC31179DnN.A1R(A01, str);
        A01.A0H = 1013;
        A01.A0s = true;
        A01.A06();
    }
}
