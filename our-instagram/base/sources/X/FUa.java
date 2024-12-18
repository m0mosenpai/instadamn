package X;

import android.app.Activity;
import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.modal.TransparentModalActivity;

/* loaded from: classes6.dex */
public abstract class FUa {
    /* JADX WARN: Removed duplicated region for block: B:17:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final android.os.Bundle A00(com.instagram.common.session.UserSession r27, X.C2EC r28, com.instagram.direct.prompts.DirectPromptTypes r29, java.lang.Integer r30, java.lang.String r31, java.lang.String r32, boolean r33) {
        /*
            Method dump skipped, instructions count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FUa.A00(com.instagram.common.session.UserSession, X.2EC, com.instagram.direct.prompts.DirectPromptTypes, java.lang.Integer, java.lang.String, java.lang.String, boolean):android.os.Bundle");
    }

    public static final void A01(Activity activity, Bundle bundle, UserSession userSession, Integer num) {
        AbstractC167017dG.A1N(userSession, bundle);
        C6XJ A02 = C6XJ.A02(activity, bundle, userSession, TransparentModalActivity.class, AbstractC111324zv.A00(4267));
        AbstractC31179DnN.A1S(A02);
        if (num != null) {
            A02.A0A(activity, num.intValue());
        } else {
            A02.A0C(activity);
        }
    }
}
