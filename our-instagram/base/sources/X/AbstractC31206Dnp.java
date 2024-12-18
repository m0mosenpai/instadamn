package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.util.fragment.IgFragmentFactoryImpl;

/* renamed from: X.Dnp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC31206Dnp {
    public static void A00(Context context, UserSession userSession, InterfaceC37144GYf interfaceC37144GYf) {
        C3DN A01 = C3DN.A00.A01(context);
        if (A01 != null) {
            IgFragmentFactoryImpl.A00();
            C32361ENi c32361ENi = new C32361ENi();
            c32361ENi.setArguments(AbstractC31178DnM.A05(userSession));
            A01.A0R(new C33171EkI(2, interfaceC37144GYf, userSession));
            A01.A0J(c32361ENi);
        }
    }

    public static boolean A01(UserSession userSession) {
        C23031Ai A00 = AbstractC23021Ah.A00(userSession);
        if (C3FU.A02(userSession, "ig_select_video_nux") && C3FU.A01(userSession, A00)) {
            return true;
        }
        return false;
    }
}
