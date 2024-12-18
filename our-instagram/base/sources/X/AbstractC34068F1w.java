package X;

import android.app.Activity;
import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.F1w, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34068F1w {
    public static final boolean A00(Activity activity, UserSession userSession, C3o9 c3o9) {
        C81663kb A03;
        boolean A1R = AbstractC167007dF.A1R(0, userSession, activity);
        if (c3o9 != null) {
            if (JRE.A0A(c3o9)) {
                C2DS A00 = AbstractC28761aE.A00(userSession);
                DirectThreadKey A02 = JRE.A02(c3o9);
                if (A02 != null && (A03 = C2DU.A03((C2DU) A00, A02)) != null) {
                    if (A03.C7g() == 29 && !A03.CPZ()) {
                        String C7I = A03.C7I();
                        String C7q = A03.C7q();
                        int AdZ = A03.AdZ();
                        C32785Ebp c32785Ebp = new C32785Ebp();
                        Bundle A0b = AbstractC166987dD.A0b();
                        A0b.putString(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, C7I);
                        A0b.putString("thread_v2_id", C7q);
                        A0b.putInt("audience_type", AdZ);
                        c32785Ebp.setArguments(A0b);
                        Bundle A0B = AbstractC31177DnL.A0B(c32785Ebp);
                        AbstractC31173DnH.A1C(A0B, userSession);
                        C189448aO A0W = AbstractC31174DnI.A0W(A0B, c32785Ebp, userSession);
                        A0W.A1G = A1R;
                        A0W.A03 = 0.75f;
                        A0W.A1O = A1R;
                        A0W.A17 = A1R;
                        AbstractC31173DnH.A0w(activity, c32785Ebp, A0W);
                    }
                }
            }
            return A1R;
        }
        return false;
    }
}
