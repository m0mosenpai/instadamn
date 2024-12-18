package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public abstract class F1Z {
    public static final SpannableStringBuilder A00(Context context, FragmentActivity fragmentActivity, UserSession userSession, C2Fb c2Fb) {
        C14360o3.A0B(userSession, 0);
        String A0p = AbstractC166997dE.A0p(fragmentActivity, 2131952572);
        int i = 2131952573;
        if (!AbstractC166997dE.A0c(C06090Tz.A05, userSession, 36329272931139816L).booleanValue()) {
            i = 2131952571;
        }
        String A0f = AbstractC167007dF.A0f(fragmentActivity, A0p, i);
        C14360o3.A0A(A0f);
        SpannableStringBuilder A0H = AbstractC25225BEi.A0H(A0f);
        int A02 = AbstractC31174DnI.A02(fragmentActivity);
        AnonymousClass773.A03(A0H, new EPP(context, new C012804r(16, A0p), userSession, c2Fb, C05F.A01, A0p, A02), A0p);
        return A0H;
    }
}
