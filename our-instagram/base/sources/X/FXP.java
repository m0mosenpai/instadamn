package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public abstract class FXP {
    public static final ELk A01(Bundle bundle) {
        C14360o3.A0B(bundle, 0);
        ELk eLk = new ELk();
        eLk.setArguments(bundle);
        return eLk;
    }

    public static final EI0 A00(UserSession userSession, String str) {
        AbstractC167017dG.A1N(userSession, str);
        EI0 ei0 = new EI0();
        Bundle A05 = AbstractC31178DnM.A05(userSession);
        A05.putString("AddAccountBottomSheetFragment.ARGUMENT_ENTRY_POINT", str);
        ei0.setArguments(A05);
        return ei0;
    }
}
