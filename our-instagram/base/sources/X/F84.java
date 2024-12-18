package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public abstract class F84 {
    public static final EOS A00(UserSession userSession, InterfaceC37173GZk interfaceC37173GZk, String str, String str2, boolean z) {
        Bundle A0b = AbstractC166987dD.A0b();
        AbstractC60492pY.A04(A0b, userSession);
        A0b.putString("hall_pass_id", str);
        A0b.putBoolean("is_from_share_cut", z);
        A0b.putString("tapped_entity", str2);
        EOS eos = new EOS();
        eos.setArguments(A0b);
        eos.A04 = interfaceC37173GZk;
        eos.A09 = AbstractC167007dF.A1W(interfaceC37173GZk);
        return eos;
    }
}
