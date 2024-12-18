package X;

import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.Ex3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33839Ex3 {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        C102884kP c102884kP;
        String str;
        View view;
        UserSession userSession;
        C38321qM c38321qM;
        Object A01 = c6fw.A01();
        if (A01 instanceof C102884kP) {
            c102884kP = (C102884kP) A01;
        } else {
            c102884kP = null;
        }
        Object A02 = c6fw.A02();
        if (A02 instanceof String) {
            str = (String) A02;
        } else {
            str = null;
        }
        if (c102884kP != null) {
            view = c102884kP.A05(c6fq.A03);
        } else {
            view = null;
        }
        AbstractC12990ll A0B = C6BQ.A0B(c6fq);
        if ((A0B instanceof UserSession) && (userSession = (UserSession) A0B) != null) {
            C06090Tz c06090Tz = C06090Tz.A05;
            if (C18U.A06(c06090Tz, userSession, 36321898472220545L)) {
                if (str != null) {
                    if (C18U.A06(c06090Tz, userSession, 36321898472220545L) && AbstractC25225BEi.A1Y(str)) {
                        c38321qM = AbstractC25229BEm.A0h(userSession, str);
                    } else {
                        c38321qM = null;
                    }
                } else {
                    c38321qM = null;
                }
                if (view != null && c38321qM != null) {
                    AbstractC99834e5.A00(view, AbstractC31171DnF.A0D(""), userSession, c38321qM);
                }
            }
        }
        return null;
    }
}
