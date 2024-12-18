package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public abstract class CYI {
    public static final void A01(Context context, String str, String str2) {
        C14360o3.A0B(str, 1);
        int i = 0;
        NineSixteenLayoutConfigImpl nineSixteenLayoutConfigImpl = new NineSixteenLayoutConfigImpl(context, false);
        int A00 = nineSixteenLayoutConfigImpl.A00();
        if (!nineSixteenLayoutConfigImpl.A0M) {
            i = (int) (AbstractC167007dF.A0K(context).density * 70.0f);
        }
        C146106i8 A0j = AbstractC25229BEm.A0j();
        A0j.A0H = "magicmod_error_snackbar";
        A0j.A0D = str;
        A0j.A0R = true;
        A0j.A02 = A00 + i;
        A0j.A0I = str2;
        AbstractC166997dE.A1O(C41451vu.A01, A0j.A00());
    }

    public static final C61 A00(UserSession userSession) {
        InterfaceC19630xq A0x = AbstractC166987dD.A0x(userSession);
        boolean A1Q = AbstractC167007dF.A1Q(A0x.getInt("magic_mod_edit_prompt_nux_seen_count", 0), 3);
        long currentTimeMillis = System.currentTimeMillis() - A0x.getLong("magic_mod_edit_prompt_nux_last_seen_time", 0L);
        TimeUnit timeUnit = TimeUnit.DAYS;
        boolean A1O = AbstractC167007dF.A1O((currentTimeMillis > timeUnit.toMillis(1L) ? 1 : (currentTimeMillis == timeUnit.toMillis(1L) ? 0 : -1)));
        if (A1Q && A1O) {
            return C61.A02;
        }
        boolean A1Q2 = AbstractC167007dF.A1Q(A0x.getInt("magic_mod_feedback_nux_seen_count", 0), 3);
        boolean A1O2 = AbstractC167007dF.A1O(((System.currentTimeMillis() - A0x.getLong("magic_mod_feedback_nux_last_seen_time", 0L)) > timeUnit.toMillis(1L) ? 1 : ((System.currentTimeMillis() - A0x.getLong("magic_mod_feedback_nux_last_seen_time", 0L)) == timeUnit.toMillis(1L) ? 0 : -1)));
        if (A1Q2 && A1O2) {
            return C61.A03;
        }
        return null;
    }
}
