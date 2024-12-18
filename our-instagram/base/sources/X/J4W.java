package X;

import android.app.Activity;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;
import com.instagram.user.model.User;

/* loaded from: classes7.dex */
public final class J4W implements Runnable {
    public final /* synthetic */ C140366Wq A00;
    public final /* synthetic */ AnonymousClass308 A01;

    public J4W(C140366Wq c140366Wq, AnonymousClass308 anonymousClass308) {
        this.A01 = anonymousClass308;
        this.A00 = c140366Wq;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AnonymousClass308 anonymousClass308 = this.A01;
        UserSession userSession = anonymousClass308.A0T;
        C32U.A0Q(userSession, anonymousClass308.A07(), anonymousClass308, null, Integer.valueOf(anonymousClass308.A01), Integer.valueOf(this.A00.A0G.A0N.getCurrentScans().get()), "profile_button", anonymousClass308.A00);
        C38321qM A07 = anonymousClass308.A07();
        C5SE c5se = new C5SE(userSession, anonymousClass308.A07());
        c5se.A00 = anonymousClass308.A00;
        User A2E = anonymousClass308.A07().A2E(userSession);
        if (A2E != null) {
            boolean A2N = A2E.A2N();
            C32U.A0K(userSession, c5se, C65.BRAND, A07, anonymousClass308, anonymousClass308.A0a, Integer.valueOf(anonymousClass308.A00), "peek", A2N);
            C28431Ze A02 = AbstractC31364DqT.A02();
            User A2E2 = anonymousClass308.A07().A2E(userSession);
            if (A2E2 != null) {
                Fragment A00 = C31368DqX.A00(userSession, A02, AbstractC37304Gc5.A0J(anonymousClass308.A0X, userSession, A2E2.getId(), "peek"));
                if (anonymousClass308.A0G) {
                    Bundle bundle = A00.mArguments;
                    Activity activity = anonymousClass308.A0O;
                    C6XJ A0L = AbstractC31171DnF.A0L(activity, bundle, userSession, ModalActivity.class, "profile");
                    A0L.A05 = anonymousClass308.getModuleName();
                    A0L.A0C(activity);
                } else {
                    C140966Yy A0C = AbstractC31175DnJ.A0C(anonymousClass308.A0R, userSession);
                    A0C.A0B(null, A00);
                    A0C.A0B = anonymousClass308.getModuleName();
                    A0C.A04();
                }
                anonymousClass308.A0G = false;
                return;
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }
}
