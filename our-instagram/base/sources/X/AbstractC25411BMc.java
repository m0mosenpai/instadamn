package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.BMc, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC25411BMc {
    public static final boolean A00(C120985dq c120985dq, UserSession userSession, Integer num) {
        C38321qM c38321qM;
        long j;
        long j2;
        AbstractC167017dG.A1N(userSession, c120985dq);
        EnumC129395t1 enumC129395t1 = c120985dq.A01;
        if (enumC129395t1 == EnumC129395t1.A02) {
            return AbstractC25470BOj.A00.A0K(c120985dq, userSession);
        }
        if (AbstractC37655Gho.A03(c120985dq) && num != null) {
            List list = c120985dq.A0R;
            if (list != null) {
                c38321qM = AbstractC25225BEi.A0x(list, num.intValue());
            } else {
                c38321qM = null;
            }
        } else {
            c38321qM = c120985dq.A02;
        }
        boolean A1X = AbstractC167007dF.A1X(enumC129395t1, EnumC129395t1.A0G);
        if (c38321qM != null) {
            j = (long) c38321qM.A0l();
        } else {
            j = 0;
        }
        boolean A03 = AbstractC37655Gho.A03(c120985dq);
        if (!A1X) {
            return false;
        }
        if (A03) {
            j2 = 10;
        } else {
            j2 = 15;
        }
        if (j < j2) {
            return false;
        }
        return true;
    }
}
