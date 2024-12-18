package X;

import com.instagram.common.session.UserSession;
import com.meta.foa.instagram.performancelogging.lss.IGFOAMessagingLocalSendSpeedLogger;
import java.util.List;

/* renamed from: X.7K6, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7K6 {
    public int A00;
    public boolean A01;
    public final UserSession A02;
    public final C7V0 A03;
    public final C7V2 A04;
    public final C1GL A05;

    public C7K6(UserSession userSession, C7V0 c7v0, C7V2 c7v2) {
        C14360o3.A0B(userSession, 1);
        this.A02 = userSession;
        this.A04 = c7v2;
        this.A03 = c7v0;
        this.A05 = C1GJ.A01();
    }

    public final void A00(C7TT c7tt, Integer num, List list, List list2, List list3) {
        C83403nh c83403nh;
        int i;
        C14360o3.A0B(c7tt, 0);
        if (list != null && (c83403nh = (C83403nh) AbstractC001800i.A0J(list)) != null && c83403nh.A0g() != null && list.size() == 1) {
            String A0g = c83403nh.A0g();
            if (A0g != null) {
                i = A0g.hashCode();
            } else {
                i = 0;
            }
            IGFOAMessagingLocalSendSpeedLogger A00 = C7R5.A00(this.A02, Integer.valueOf(i));
            if (A00 != null) {
                A00.onLogScheduleThreadRowUpdateTaskStart();
                A00.annotateNumPendingThreadRowUpdateTasks(this.A00 + 1);
            }
        }
        JTT jtt = new JTT(this, c7tt, num, list, list2, list3);
        UserSession userSession = this.A02;
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, userSession, 36323968646786799L)) {
            this.A05.schedule(jtt, 303, 2, false, false);
        } else if (C18U.A06(c06090Tz, userSession, 36323968646852336L)) {
            this.A05.schedule(jtt, 303, 1, false, false);
        } else {
            this.A05.schedule(jtt);
        }
        this.A00++;
    }
}
