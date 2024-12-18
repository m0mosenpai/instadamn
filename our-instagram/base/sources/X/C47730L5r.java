package X;

import android.app.Activity;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.L5r, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47730L5r {
    public final boolean A00(Activity activity, View view, UserSession userSession, int i) {
        C23031Ai A00 = AbstractC23021Ah.A00(userSession);
        if (!(!AbstractC167017dG.A1b(A00, A00.A2S, C23031Ai.A8c, 290))) {
            return false;
        }
        view.postDelayed(new M78(activity, view, userSession, EnumC58132lV.A02, A00, C05F.A00, AbstractC166997dE.A0p(activity, i)), 100L);
        return true;
    }
}
