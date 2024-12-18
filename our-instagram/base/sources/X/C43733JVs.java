package X;

import com.instagram.common.session.UserSession;
import java.util.concurrent.TimeUnit;

/* renamed from: X.JVs, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43733JVs implements MQ0 {
    public final /* synthetic */ C43731JVq A00;

    @Override // X.MQ0
    public final String AUq(UserSession userSession) {
        return "message sent time before thread read time";
    }

    public C43733JVs(C43731JVq c43731JVq) {
        this.A00 = c43731JVq;
    }

    @Override // X.MQ0
    public final /* bridge */ /* synthetic */ boolean AT8(UserSession userSession, Object obj) {
        C80993jT Av3;
        String str;
        C43732JVr c43732JVr = (C43732JVr) obj;
        AbstractC167017dG.A1N(c43732JVr, userSession);
        long j = c43732JVr.A00;
        long j2 = 0;
        if (j == 0) {
            return true;
        }
        C2ED c2ed = c43732JVr.A01;
        if ((c2ed != null || ((str = c43732JVr.A06) != null && (c2ed = (C2ED) this.A00.A02.invoke(userSession, str)) != null)) && (Av3 = c2ed.Av3(userSession.userId)) != null) {
            j2 = TimeUnit.MICROSECONDS.toMillis(((AbstractC81003jU) Av3).A00);
        }
        if (j > j2) {
            return true;
        }
        return false;
    }
}
