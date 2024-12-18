package X;

import androidx.fragment.app.FragmentActivity;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public abstract class FC7 {
    public static final void A00(UserSession userSession, String str, String str2) {
        C14360o3.A0B(userSession, 0);
        if (str2 != null && AbstractC25225BEi.A1Y(str2) && !str2.equals("clips_media_notes")) {
            return;
        }
        ArrayList A1E = AbstractC166987dD.A1E();
        if (str != null && AbstractC25225BEi.A1Y(str)) {
            A1E.addAll(AbstractC167007dF.A0m(str, InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, 0));
        }
        Object A00 = AbstractC54852fj.A00();
        AbstractC31171DnF.A1P(A00);
        C116875Qr c116875Qr = new C116875Qr(ClipsViewerSource.A0M, userSession);
        c116875Qr.A0t = str;
        AbstractC31173DnH.A1J((FragmentActivity) A00, c116875Qr, userSession);
    }
}
