package X;

import android.app.Activity;
import com.instagram.api.schemas.MediaVCRTappableData;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.commentreply.model.ReelsVisualRepliesModel;
import com.instagram.user.model.User;

/* loaded from: classes4.dex */
public final class AKE {
    public static final AKE A00 = new Object();

    public static final ReelsVisualRepliesModel A00(User user, String str, String str2) {
        String A0E = AbstractC13950nL.A0E(-1);
        return new ReelsVisualRepliesModel(new MediaVCRTappableData(user, Float.valueOf(Float.MAX_VALUE), Float.valueOf(0.0f), A0E, str, str2, null, "0", AbstractC13950nL.A0E(-1), null, false), false);
    }

    public final void A01(Activity activity, C22P c22p, AbstractC59962oe abstractC59962oe, C167607eG c167607eG, UserSession userSession) {
        String str;
        C14360o3.A0B(userSession, 2);
        AbstractC23021Ah.A00(userSession).A0M();
        INH A0C = AbstractC86593tX.A0C(c22p);
        String str2 = null;
        if (c167607eG != null) {
            str2 = c167607eG.A02;
        }
        if (str2 != null) {
            if (c167607eG != null && (str = c167607eG.A03) != null) {
                A0C.A05 = A00(c167607eG.A00, str2, str);
                AbstractC41671Ic3.A00(activity, A0C.A00(), abstractC59962oe, c22p, userSession);
                return;
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }
}
