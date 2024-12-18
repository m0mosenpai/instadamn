package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.Calendar;
import java.util.Date;

/* loaded from: classes11.dex */
public abstract class VQO {
    /* JADX WARN: Type inference failed for: r19v1, types: [X.0pQ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.0ps, java.lang.Object] */
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        C6FG c6fg = c6fq.A03;
        if (c6fg != null) {
            FragmentActivity A03 = C6BQ.A03(c6fg);
            AbstractC12990ll A0A = C6BQ.A0A(C6BQ.A09(c6fq));
            C14360o3.A0C(A0A, "null cannot be cast to non-null type com.instagram.common.session.UserSession");
            Object A032 = c6fw.A03(1);
            C14360o3.A0C(A032, "null cannot be cast to non-null type com.instagram.common.bloks.component.base.BloksModel");
            C102884kP c102884kP = (C102884kP) A032;
            ?? obj = new Object();
            InterfaceC103384lE A0A2 = c102884kP.A0A();
            ?? obj2 = new Object();
            obj2.A00 = new OWa(A03, (UserSession) A0A, new C70878Wij(c6fq, c102884kP, A0A2, obj, obj2), AbstractC166997dE.A0p(A03, 2131970933), A03.getString(2131970932), false, true, false, false);
            Calendar calendar = Calendar.getInstance();
            Date time = calendar.getTime();
            calendar.add(6, 60);
            ((OWa) obj2.A00).A02(true, A03.getString(2131970933), new Date(c102884kP.A03(36, 0) * 1000), time, calendar.getTime(), true);
        }
        return null;
    }
}
