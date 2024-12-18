package X;

import com.google.gson.Gson;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;

/* renamed from: X.Nzd, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54319Nzd {
    public static final void A00(UserSession userSession, String str) {
        ArrayList A0Z = AbstractC50523MSb.A0Z(AbstractC23021Ah.A00(userSession).A0H());
        A0Z.add(str);
        InterfaceC19610xo A0e = AbstractC31176DnK.A0e(userSession);
        A0e.E7K("share_to_whatsapp_reel_id_cache", new Gson().A0B(A0Z));
        A0e.apply();
    }
}
