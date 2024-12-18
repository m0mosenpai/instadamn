package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.FfT, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC35176FfT {
    public static final C3KD A00(Context context, UserSession userSession, String str, String str2) {
        C14360o3.A0B(userSession, 1);
        if (str != null) {
            C35158Ff0.A00(new C26069Bfx(str, str2, "feature_blocking", null, 14), userSession, "feature_block", "", null, "feature_unavailable");
        }
        C146106i8 A0K = AbstractC31171DnF.A0K();
        AbstractC25226BEj.A1N(context, A0K, 2131969542);
        AbstractC31171DnF.A11(context, A0K, 2131969543);
        A0K.A05();
        A0K.A0H = "permissions_feature_unavailable_error";
        return new C3KD(A0K.A00());
    }

    public static final void A03(C3KD c3kd) {
        C14360o3.A0B(c3kd, 0);
        C41451vu.A01.E4s(c3kd);
    }

    public static final C3KD A01(Context context, String str) {
        C146106i8 A0X = AbstractC31173DnH.A0X(AbstractC166997dE.A0p(context, 2131974293));
        A0X.A05();
        A0X.A0H = str;
        return new C3KD(A0X.A00());
    }

    public static final void A02(Context context, UserSession userSession, String str) {
        AbstractC167017dG.A1N(context, userSession);
        A03(A00(context, userSession, str, null));
    }
}
