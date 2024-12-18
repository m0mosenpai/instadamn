package X;

import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import instagram.features.stories.fragment.ReelViewerFragment;
import java.util.HashMap;

/* renamed from: X.HyD, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40531HyD {
    public static final HashMap A00(C6FQ c6fq) {
        C142766cc c142766cc = (C142766cc) C6BQ.A0F(c6fq, C142766cc.class, R.id.story_bloks_sticker_controller);
        if (c142766cc != null) {
            C142206bd c142206bd = c142766cc.A00;
            C145826hf c145826hf = c142206bd.A01;
            C41551w4 c41551w4 = ((ReelViewerFragment) c142206bd.A02).A0a;
            if (c41551w4 == null) {
                return null;
            }
            UserSession userSession = c145826hf.A06;
            C41181vS A08 = c41551w4.A08(userSession);
            if (!A08.CY4()) {
                return null;
            }
            C82713mZ A02 = AbstractC37955Gmx.A02(userSession, C145826hf.A01(c41551w4.A0H, c145826hf), A08, "GetLogEventExtras_event");
            A02.A2F = AbstractC166997dE.A0a();
            User user = A08.A0i;
            if (user != null) {
                A02.A7V = user.getId();
                A02.A7I = user.getUsername();
            }
            C145826hf.A04(A02, (C37948Gmq) c145826hf.A0I.get(A08.CGe()), c145826hf);
            return AbstractC11490j8.A03(A02.A00().A06);
        }
        return AbstractC166987dD.A1G();
    }
}
