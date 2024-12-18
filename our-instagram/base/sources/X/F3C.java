package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.direct.messagethread.nullstate.threaddata.theme.ThemeViewModelDelegate;

/* loaded from: classes6.dex */
public abstract class F3C {
    public static final void A00(Context context, FragmentActivity fragmentActivity, UserSession userSession, C7XS c7xs, ThemeViewModelDelegate themeViewModelDelegate, C3o9 c3o9, String str, int i, int i2, boolean z, boolean z2, boolean z3) {
        boolean A1R = AbstractC167007dF.A1R(0, userSession, context);
        if (i2 != 6 && i2 != 8) {
            KDM A04 = C28531Zo.A04.A02.A04(userSession, themeViewModelDelegate, c3o9, str, i, 0, z, z2, z3);
            C14360o3.A0C(A04, AbstractC111324zv.A00(4978));
            C189448aO A0y = AbstractC25225BEi.A0y(userSession);
            A0y.A0T = A04;
            AbstractC25225BEi.A1Q(A0y, A1R);
            A0y.A1C = false;
            A0y.A0A = AbstractC53242c7.A02(context);
            float f = 0.5f;
            if (C18U.A06(C06090Tz.A05, userSession, 36324157624954809L)) {
                f = 0.75f;
            }
            A0y.A03 = f;
            C189478aR A00 = GH5.A00(A0y, c7xs, 8);
            A04.A05 = new G2Y(A00);
            A00.A02(fragmentActivity, A04);
            c7xs.D0E();
        }
    }
}
