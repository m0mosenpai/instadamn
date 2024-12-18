package X;

import android.view.View;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;
import com.instagram.mainactivity.InstagramMainActivity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes6.dex */
public abstract class FVF {
    public static final List A00(UserSession userSession, String str) {
        AbstractC167007dF.A1K(userSession, str);
        InterfaceC53722dB A00 = AbstractC54852fj.A00();
        if (A00 != null && str.equals("feed_contextual_chain") && C18U.A06(C06090Tz.A05, userSession, 36317405937996943L)) {
            ArrayList A1E = AbstractC166987dD.A1E();
            View view = ((C57922l5) ((InstagramMainActivity) A00).A0k.getValue()).A02;
            if (view != null) {
                A1E.add(view);
            }
            ViewGroup C4t = A00.C4t();
            A1E.add(C4t);
            View[] A11 = AbstractC13880nE.A11(C4t);
            A1E.addAll(AbstractC16960so.A1Q(Arrays.copyOf(A11, A11.length)));
            if (AbstractC25226BEj.A1b(A1E)) {
                A01(userSession, str, false);
            }
            return A1E;
        }
        return C16930sl.A00;
    }

    public static final void A01(UserSession userSession, String str, boolean z) {
        InterfaceC53722dB A00;
        AbstractC167017dG.A1P(userSession, str);
        if (str.equals("feed_contextual_chain") && C18U.A06(C06090Tz.A05, userSession, 36317405937996943L) && (A00 = AbstractC54852fj.A00()) != null) {
            A00.EkV(z);
        }
    }
}
