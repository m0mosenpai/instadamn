package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;
import java.util.TimeZone;

/* loaded from: classes6.dex */
public final class EZB extends C2AG {
    public final /* synthetic */ C455127l A00;

    @Override // X.C11R
    public final int getRunnableId() {
        return 732786309;
    }

    public EZB(C455127l c455127l) {
        this.A00 = c455127l;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        C455127l c455127l = this.A00;
        UserSession userSession = c455127l.A02;
        List A06 = C455127l.A06(c455127l);
        long A0P = c455127l.A0P();
        AbstractC167017dG.A1N(userSession, A06);
        ArrayList A04 = C123815iv.A00.A04(userSession);
        Double d = null;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(null, userSession), "ig_time_spent_screen_time");
        AbstractC31171DnF.A1C(A0f, "ig_ts_screen_time_data_fetch_retry_upload");
        A0f.A8I("usage_seconds", Double.valueOf(C461529z.A00()));
        A0f.AAk("weekly_screen_time", A06);
        A0f.A8I("session_length", Double.valueOf(A0P));
        if (((Number) AbstractC001800i.A0O(A04, A04.size() - 1)) != null) {
            d = Double.valueOf(r0.longValue());
        }
        A0f.A8I("aggregated_screen_time_today", d);
        if (!A06.isEmpty()) {
            String id = TimeZone.getDefault().getID();
            C14360o3.A07(id);
            A0f.AAP("timezone", id);
        }
        A0f.Cht();
        return null;
    }
}
