package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;

/* loaded from: classes7.dex */
public final class ILL {
    public final UserSession A00;
    public final String A01;

    public final void A00(Activity activity, String str, String str2) {
        C14360o3.A0B(activity, 0);
        UserSession userSession = this.A00;
        C31368DqX A01 = AbstractC31402Dr6.A01(userSession, str, str2, this.A01);
        A01.A0O = "profile_clips";
        AbstractC25228BEl.A1G(activity, AbstractC37303Gc4.A02(userSession, A01), userSession, ModalActivity.class, "profile");
    }

    public ILL(UserSession userSession, String str) {
        AbstractC167017dG.A1P(userSession, str);
        this.A00 = userSession;
        this.A01 = str;
    }
}
