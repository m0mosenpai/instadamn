package X;

import com.instagram.common.session.UserSession;
import java.util.Calendar;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes8.dex */
public abstract class LHq {
    public static Future A00;
    public static final ScheduledExecutorService A01;

    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        long j;
        Calendar calendar;
        long timeInMillis;
        Object A012 = c6fw.A01();
        C14360o3.A0C(A012, "null cannot be cast to non-null type kotlin.Number");
        ((Number) A012).longValue();
        List list = c6fw.A00;
        InterfaceC103384lE A0t = AbstractC25228BEl.A0t(list, 1);
        C14360o3.A0C(A0t, "null cannot be cast to non-null type com.instagram.common.lispy.lang.Expression");
        InterfaceC103384lE A0t2 = AbstractC25228BEl.A0t(list, 2);
        C14360o3.A0C(A0t2, "null cannot be cast to non-null type com.instagram.common.lispy.lang.Expression");
        String A0e = AbstractC31177DnL.A0e(c6fw, 4);
        Object A03 = c6fw.A03(5);
        String A002 = AbstractC111324zv.A00(11);
        C14360o3.A0C(A03, A002);
        boolean A1a = AbstractC166987dD.A1a(A03);
        Object A032 = c6fw.A03(6);
        C14360o3.A0C(A032, "null cannot be cast to non-null type kotlin.Number");
        long A0N = AbstractC166987dD.A0N(A032);
        Object A033 = c6fw.A03(7);
        C14360o3.A0C(A033, A002);
        if (AbstractC166987dD.A1a(A033)) {
            Future future = A00;
            if (future != null) {
                future.cancel(true);
            }
            A00 = null;
            return null;
        }
        if (A0e.equals("Until I change it")) {
            timeInMillis = 120000;
        } else if (A0e.equals("For 1 hour")) {
            timeInMillis = 3600000;
        } else if (A0e.equals("For 4 hours")) {
            timeInMillis = 14400000;
        } else {
            if (A0e.equals("Until 8:00 AM")) {
                calendar = Calendar.getInstance();
                Calendar calendar2 = Calendar.getInstance();
                int i = calendar.get(11);
                int i2 = calendar.get(5);
                if (i >= 8) {
                    i2++;
                }
                calendar2.set(5, i2);
                calendar2.set(11, 8);
                calendar2.set(12, 0);
                calendar2.set(13, 0);
                calendar2.set(14, 0);
                j = calendar2.getTimeInMillis();
            } else {
                j = A0N * 1000;
                calendar = Calendar.getInstance();
            }
            timeInMillis = j - calendar.getTimeInMillis();
        }
        A00 = A01.schedule(new M69(c6fq, A0t, A0t2, A1a), timeInMillis, TimeUnit.MILLISECONDS);
        return null;
    }

    static {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = C14250np.A00().A00;
        C14360o3.A07(scheduledThreadPoolExecutor);
        A01 = scheduledThreadPoolExecutor;
    }

    public static final void A01(C6FQ c6fq, InterfaceC103384lE interfaceC103384lE, InterfaceC103384lE interfaceC103384lE2, UserSession userSession, String str) {
        AbstractC35237FgW.A03(C1LZ.A00().A00, AbstractC018607g.A00(C6BQ.A04(c6fq)), userSession, new C49595Lvo(c6fq, interfaceC103384lE, interfaceC103384lE2, userSession, 2), str, true);
    }
}
