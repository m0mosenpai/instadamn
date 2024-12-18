package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;

/* renamed from: X.Kqn, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC47030Kqn {
    public static final void A00(Activity activity, EnumC46298KeU enumC46298KeU, UserSession userSession, String str, InterfaceC16610sE interfaceC16610sE, boolean z) {
        C14360o3.A0B(userSession, 1);
        C189448aO A0y = AbstractC25225BEi.A0y(userSession);
        A0y.A1I = true;
        C189478aR A00 = C49623LwG.A00(A0y, new MHN(interfaceC16610sE, 13), 21);
        KBG kbg = new KBG();
        kbg.A00 = interfaceC16610sE;
        AbstractC25227BEk.A1C(kbg, AbstractC167007dF.A1b("arg_current_hidden_place_name", str, AbstractC166987dD.A1L("arg_entrypoint", enumC46298KeU), AbstractC166987dD.A1L("arg_is_from_nux", Boolean.valueOf(z))));
        A00.A02(activity, kbg);
    }
}
