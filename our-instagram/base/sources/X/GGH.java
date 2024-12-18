package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class GGH implements GYK {
    @Override // X.GYK
    public final void Crs(Context context, FragmentActivity fragmentActivity, UserSession userSession) {
        C140966Yy A0P;
        Fragment A00;
        AbstractC167027dH.A12(context, userSession, fragmentActivity);
        if (F7A.A00(userSession) && AbstractC166987dD.A0x(userSession).getInt("hidden_word_settings_info_nux_shown_count", 0) < 3) {
            InterfaceC19630xq A0x = AbstractC166987dD.A0x(userSession);
            AbstractC167017dG.A1L(A0x.ARD(), A0x, "hidden_word_settings_info_nux_shown_count", 0);
            A0P = AbstractC31173DnH.A0P(fragmentActivity, userSession);
            F78.A00();
            A00 = new C32303EKq();
        } else {
            A0P = AbstractC31173DnH.A0P(fragmentActivity, userSession);
            A00 = F78.A00().A00.A00(context, userSession, C05F.A1I);
        }
        A0P.A0D(A00);
        A0P.A04();
    }
}
