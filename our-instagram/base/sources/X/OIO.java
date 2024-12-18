package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;
import java.util.Calendar;
import java.util.Date;

/* loaded from: classes9.dex */
public final class OIO {
    public OWa A00;
    public final Activity A01;
    public final UserSession A02;

    public final void A00(Date date, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16660sJ interfaceC16660sJ, boolean z) {
        C189478aR c189478aR;
        Date date2 = date;
        OWa oWa = this.A00;
        if (oWa != null && (c189478aR = oWa.A00) != null && c189478aR.A0S()) {
            return;
        }
        Activity activity = this.A01;
        this.A00 = new OWa(activity, this.A02, new C56321Ozi(this, interfaceC16820sZ, interfaceC16660sJ), AbstractC166997dE.A0p(activity, 2131956759), activity.getString(2131956758), false, true, z, false);
        Calendar calendar = Calendar.getInstance();
        calendar.add(12, (5 - (calendar.get(12) % 5)) + 20);
        Date time = calendar.getTime();
        C14360o3.A07(time);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.add(5, 29);
        Date time2 = calendar2.getTime();
        C14360o3.A07(time2);
        OWa oWa2 = this.A00;
        if (oWa2 == null) {
            return;
        }
        if (date == null) {
            date2 = time;
        }
        oWa2.A02(null, null, date2, time, time2, true);
    }

    public OIO(Activity activity, UserSession userSession) {
        this.A02 = userSession;
        this.A01 = activity;
    }
}
