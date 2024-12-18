package X;

import com.instagram.common.session.UserSession;
import com.instagram.wellbeing.timeinapp.instrumentation.IgTimeInAppActivityListener;

/* loaded from: classes9.dex */
public final class PP1 implements Runnable {
    public final /* synthetic */ UserSession A00;

    public PP1(UserSession userSession) {
        this.A00 = userSession;
    }

    @Override // java.lang.Runnable
    public final void run() {
        UserSession userSession = this.A00;
        try {
            C1VE c1ve = C1VE.A02;
            if (c1ve != null) {
                IgTimeInAppActivityListener.A00(c1ve.A00, userSession).A04.A01(EnumC49762Qj.BACKGROUND);
            }
        } catch (Throwable unused) {
            C0f5 AEp = C18950wb.A01.AEp("ScreenTime", 817892914);
            AEp.ABW("ScreenTimeInit", "Failed to insert background event");
            AEp.report();
        }
    }
}
