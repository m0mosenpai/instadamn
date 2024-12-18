package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public abstract class F2F {
    public static final EI6 A00(UserSession userSession, int i) {
        Bundle A0C = AbstractC31177DnL.A0C(userSession);
        A0C.putInt("FeaturedChannelsDisclaimerFragment.ARGUMENT_SUBTITLE_VARIANT", i);
        AbstractC03240Dh.A00(A0C, userSession);
        EI6 ei6 = new EI6();
        ei6.setArguments(A0C);
        return ei6;
    }
}
