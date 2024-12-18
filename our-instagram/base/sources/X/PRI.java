package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.rtc.activity.RtcCallIntentHandlerActivity;

/* loaded from: classes9.dex */
public final class PRI implements Runnable {
    public final /* synthetic */ InterfaceC58177Pqh A00;
    public final /* synthetic */ RtcCallIntentHandlerActivity A01;

    public PRI(InterfaceC58177Pqh interfaceC58177Pqh, RtcCallIntentHandlerActivity rtcCallIntentHandlerActivity) {
        this.A01 = rtcCallIntentHandlerActivity;
        this.A00 = interfaceC58177Pqh;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        C56139Ovz A00;
        C09Y c09y = C023409i.A0A;
        RtcCallIntentHandlerActivity rtcCallIntentHandlerActivity = this.A01;
        Bundle A0A = AbstractC31173DnH.A0A(rtcCallIntentHandlerActivity);
        if (A0A != null) {
            UserSession A07 = c09y.A07(A0A);
            if (A07 != null && (A00 = MWJ.A00(AbstractC166987dD.A0O(rtcCallIntentHandlerActivity), A07)) != null) {
                obj = A00.A09.A0K.A00.A00;
            } else {
                obj = null;
            }
            StringBuilder A1C = AbstractC166987dD.A1C();
            A1C.append("RtcCallIntentHandlerActivity: Intent handler activity timed out. Operation: ");
            A1C.append(this.A00);
            C0w9.A03("RtcCallIntentHandlerActivity", AbstractC167017dG.A0n(obj, " Current call state: ", A1C));
            rtcCallIntentHandlerActivity.finish();
            return;
        }
        throw AbstractC166997dE.A0g();
    }
}
