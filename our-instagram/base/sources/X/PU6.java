package X;

import com.instagram.common.session.UserSession;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class PU6 implements Runnable, C11R {
    public final C55903Orr A00;

    @Override // X.C11R
    public final void onCancel() {
    }

    @Override // X.C11R
    public final void onFinish() {
        C55903Orr c55903Orr = this.A00;
        if (c55903Orr.A08) {
            C1GJ.A05(this, 1635172738, 3, (int) TimeUnit.SECONDS.toMillis(C18U.A01(C06090Tz.A05, c55903Orr.A03.A00, 36605619716953402L)), false, true);
        }
    }

    @Override // X.C11R
    public final void onStart() {
    }

    @Override // X.C11R
    public final String getName() {
        return "IgdsVariableSampling";
    }

    @Override // java.lang.Runnable, X.C11R
    public final void run() {
        long j;
        Integer num;
        C55903Orr c55903Orr = this.A00;
        if (c55903Orr.A08) {
            Map map = c55903Orr.A05;
            if (!MSW.A1b(map) && !AbstractC001900j.A0T("") && ((num = c55903Orr.A00) == null || 0 != num.intValue())) {
                try {
                    map.clear();
                    JSONObject jSONObject = new JSONObject("");
                    Iterator<String> keys = jSONObject.keys();
                    C14360o3.A07(keys);
                    while (keys.hasNext()) {
                        String A1B = AbstractC166987dD.A1B(keys);
                        AbstractC37301Gc2.A1T(A1B, map, jSONObject.getInt(A1B));
                    }
                    c55903Orr.A00 = 0;
                } catch (JSONException unused) {
                }
            }
            UserSession userSession = c55903Orr.A03.A00;
            boolean A00 = C1C0.A00(userSession);
            C06090Tz c06090Tz = C06090Tz.A05;
            if (A00) {
                j = 36605619717150013L;
            } else {
                j = 36605619716756792L;
            }
            int A07 = AbstractC25225BEi.A07(c06090Tz, userSession, j);
            if (c55903Orr.A06.A05(A07) == 0) {
                C25531Mh A0A = AbstractC31171DnF.A0A(AbstractC166987dD.A0f(c55903Orr.A02, "mobile_uitracker_events"), 344);
                if (AbstractC25226BEj.A1Z(A0A)) {
                    c55903Orr.A01.post(new D29(A0A, this, A07));
                }
            }
        }
    }

    public PU6(C55903Orr c55903Orr) {
        this.A00 = c55903Orr;
    }

    @Override // X.C11R
    public final int getRunnableId() {
        return 1635172738;
    }
}
