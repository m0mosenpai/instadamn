package X;

import com.facebook.proxygen.TraceFieldType;
import com.instagram.api.schemas.UpcomingEventIDType;
import java.io.IOException;

/* loaded from: classes7.dex */
public final class IRL {
    public static C38897HAt parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C38897HAt c38897HAt = new C38897HAt();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                if (AbstractC37301Gc2.A1V(c16l, A0q)) {
                    c38897HAt.A08 = AbstractC167017dG.A0m(c16l);
                } else if ("upcoming_event_id_type".equals(A0q)) {
                    UpcomingEventIDType upcomingEventIDType = (UpcomingEventIDType) UpcomingEventIDType.A01.get(AbstractC167017dG.A0m(c16l));
                    if (upcomingEventIDType == null) {
                        upcomingEventIDType = UpcomingEventIDType.A05;
                    }
                    c38897HAt.A01 = upcomingEventIDType;
                } else if (AbstractC31171DnF.A1a(A0q)) {
                    c38897HAt.A09 = AbstractC167017dG.A0m(c16l);
                } else if (TraceFieldType.StartTime.equals(A0q)) {
                    c38897HAt.A07 = AbstractC31173DnH.A0h(c16l);
                } else if ("last_notification_time".equals(A0q)) {
                    c38897HAt.A06 = AbstractC31173DnH.A0h(c16l);
                } else if ("end_time".equals(A0q)) {
                    c38897HAt.A05 = AbstractC31173DnH.A0h(c16l);
                } else if ("reminder_enabled".equals(A0q)) {
                    c38897HAt.A0A = c16l.A0d();
                } else if ("live_metadata".equals(A0q)) {
                    c38897HAt.A03 = IAI.parseFromJson(c16l);
                } else if ("event_page_metadata".equals(A0q)) {
                    c38897HAt.A00 = Hn0.parseFromJson(c16l);
                } else if (AbstractC37300Gc1.A1F(A0q)) {
                    c38897HAt.A02 = IRM.parseFromJson(c16l);
                } else if ("owner".equals(A0q)) {
                    c38897HAt.A04 = AbstractC31171DnF.A0S(c16l, false);
                } else {
                    C55702hA.A01(c16l, c38897HAt, A0q);
                }
                c16l.A0z();
            }
            return c38897HAt;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
