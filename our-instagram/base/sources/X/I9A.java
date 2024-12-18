package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes7.dex */
public abstract class I9A {
    public static final String A00(UserSession userSession, IN1 in1) {
        C38321qM c38321qM;
        Integer num = in1.A02;
        if (num == C05F.A01) {
            c38321qM = ((C39350HZp) in1).A00;
        } else if (num == C05F.A0Y) {
            c38321qM = ((C39349HZo) in1).A00;
        } else {
            if (num != C05F.A0j) {
                return null;
            }
            c38321qM = ((C39352HZr) in1).A00;
        }
        return AbstractC37302Gc3.A0a(userSession, c38321qM);
    }
}
