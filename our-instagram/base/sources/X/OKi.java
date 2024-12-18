package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.rtc.activity.RtcCallActivity;

/* loaded from: classes9.dex */
public final class OKi {
    public final Context A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;

    public final void A00(String str, Long l) {
        C14360o3.A0B(str, 0);
        UserSession userSession = this.A02;
        C55772hI.A00(userSession).A0C(this.A01, str, 0);
        RtcCallActivity.A0C.A00(this.A00, userSession, l);
    }

    public final boolean A01(String str) {
        C14360o3.A0B(str, 0);
        C56139Ovz A01 = MWJ.A01(this.A02);
        if (A01 == null) {
            return false;
        }
        if (!A01.A09() && ((C51881MwP) A01.A09.A0K.A00.A00).A01 != C05F.A01) {
            return false;
        }
        A00(str, null);
        return true;
    }

    public OKi(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        this.A00 = context;
        this.A02 = userSession;
        this.A01 = interfaceC11380iw;
    }
}
