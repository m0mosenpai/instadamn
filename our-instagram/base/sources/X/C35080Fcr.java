package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.Fcr, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35080Fcr {
    public static final void A01(FragmentActivity fragmentActivity, UserSession userSession, String str, String str2) {
        C14360o3.A0B(userSession, 1);
        if (AbstractC167007dF.A1O(str.length())) {
            if (str2.length() > 0) {
                if (fragmentActivity != null) {
                    C140966Yy A0N = AbstractC31177DnL.A0N(fragmentActivity, userSession);
                    ENv eNv = new ENv();
                    Bundle A05 = AbstractC31178DnM.A05(userSession);
                    A05.putString(AbstractC31189DnY.A00(), str);
                    A05.putString(AbstractC31189DnY.A03(39, 17, 24), str2);
                    AbstractC31175DnJ.A0t(A05, eNv, A0N);
                    return;
                }
                throw AbstractC166997dE.A0g();
            }
            throw AbstractC166987dD.A14("Check failed.");
        }
        throw AbstractC166987dD.A14("Check failed.");
    }

    public static final synchronized FJR A00(UserSession userSession) {
        FJR fjr;
        synchronized (C35080Fcr.class) {
            C14360o3.A0B(userSession, 0);
            fjr = (FJR) userSession.A00(FJR.class);
        }
        return fjr;
    }
}
