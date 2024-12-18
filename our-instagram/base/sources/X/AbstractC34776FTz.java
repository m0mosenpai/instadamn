package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.FTz, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34776FTz {
    public static final Bundle A00(EnumC33344Eod enumC33344Eod, InterfaceC83733oI interfaceC83733oI, String str, String str2, int i) {
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putSerializable("channel_education_type", enumC33344Eod);
        if (interfaceC83733oI != null) {
            AbstractC35077Fco.A02(A0b, interfaceC83733oI, "channel_education_thread_id");
        }
        if (str != null) {
            A0b.putString("channel_education_thread_v2_id", str);
        }
        A0b.putInt("channel_education_audience_type", i);
        if (str2 != null) {
            A0b.putString("channel_education_entrypoint", str2);
        }
        return A0b;
    }

    public static final void A01(FragmentActivity fragmentActivity, UserSession userSession, EnumC33344Eod enumC33344Eod, InterfaceC83733oI interfaceC83733oI, String str, String str2, String str3, int i) {
        boolean A1a = AbstractC167017dG.A1a(userSession, fragmentActivity);
        C3DO c3do = C3DN.A00;
        C3DN A00 = c3do.A00(fragmentActivity);
        if (A00 != null && ((C3DP) A00).A0h == A1a) {
            AbstractC167017dG.A0y(fragmentActivity, c3do);
        }
        AbstractC167007dF.A0J().postDelayed(new GR5(fragmentActivity, userSession, enumC33344Eod, interfaceC83733oI, str, str2, str3, i), 500L);
    }
}
