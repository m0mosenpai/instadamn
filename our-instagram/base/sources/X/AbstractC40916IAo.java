package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.common.session.UserSession;

/* renamed from: X.IAo, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40916IAo {
    public static final void A00(FragmentActivity fragmentActivity, UserSession userSession, String str) {
        C116875Qr c116875Qr = new C116875Qr(ClipsViewerSource.A0d, userSession);
        c116875Qr.A1D = str;
        c116875Qr.A1b = true;
        AbstractC31173DnH.A1J(fragmentActivity, c116875Qr, userSession);
    }
}
