package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.direct.burner.BurnerSendThreadDetailsFragment;
import com.instagram.model.direct.DirectThreadKey;
import java.util.Iterator;

/* loaded from: classes6.dex */
public abstract class FU8 {
    public static final boolean A01(UserSession userSession, C2EC c2ec, C2DS c2ds, String str) {
        C14360o3.A0B(c2ds, 3);
        if (c2ec == null) {
            return false;
        }
        DirectThreadKey BKb = c2ec.BKb();
        String C7I = c2ec.C7I();
        if (C7I == null || AbstractC166987dD.A0x(userSession).getBoolean(AbstractC111324zv.A00(767), false) || !C98Q.A00(userSession).A00(AbstractC31171DnF.A0N(C7I), 22)) {
            return false;
        }
        if (str != null && str.equals(AbstractC111324zv.A00(2533))) {
            return false;
        }
        C81543kP A0g = AbstractC31172DnG.A0g(c2ec);
        if (A0g == null || !A0g.A0H) {
            Iterator it = c2ds.Ab7(BKb, false).iterator();
            while (it.hasNext()) {
                Object next = it.next();
                C83403nh c83403nh = (C83403nh) next;
                if (c83403nh.A10 != C2EY.A0G && AbstractC31171DnF.A1W(userSession, c83403nh.A1u)) {
                    if (next == null) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public static final EKR A00(UserSession userSession, EnumC33364Eox enumC33364Eox, GXS gxs, Integer num, String str, String str2, boolean z) {
        EKR ekr = new EKR();
        Bundle A0b = AbstractC166987dD.A0b();
        AbstractC60492pY.A04(A0b, userSession);
        A0b.putBoolean("arg_is_creator", z);
        A0b.putString(BurnerSendThreadDetailsFragment.ARGUMENT_DIRECT_THREAD_KEY, str);
        A0b.putString("direct_thread_key_v2", str2);
        A0b.putInt("direct_thread_audience_type", AbstractC167017dG.A0K(num));
        if (enumC33364Eox != null) {
            A0b.putSerializable("prompts_entry_point", enumC33364Eox);
        }
        ekr.setArguments(A0b);
        ekr.A00 = gxs;
        return ekr;
    }
}
