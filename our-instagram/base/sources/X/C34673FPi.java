package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.FPi, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34673FPi {
    public boolean A00;
    public final UserSession A01;

    public final void A00(Fragment fragment, FragmentActivity fragmentActivity, Map map, boolean z) {
        String str;
        if (!this.A00) {
            this.A00 = true;
            C08790ch A00 = AbstractC018607g.A00(fragment);
            if (z) {
                str = "com.instagram.insights.media.live_videos.bottom_sheet.push_action";
            } else {
                str = "com.instagram.insights.media.live_videos.bottom_sheet.action";
            }
            AbstractC192798gL A05 = C192108fB.A05(this.A01, str, map);
            C32393EOu.A00(A05, fragmentActivity, fragment, this, 18);
            C1GJ.A00(fragmentActivity, A00, A05);
        }
    }

    public C34673FPi(UserSession userSession) {
        this.A01 = userSession;
    }
}
