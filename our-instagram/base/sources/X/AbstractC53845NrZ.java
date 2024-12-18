package X;

import com.instagram.common.session.UserSession;
import java.util.Collections;

/* renamed from: X.NrZ, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC53845NrZ {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        UserSession userSession;
        Collections.unmodifiableList(c6fw.A00);
        boolean A01 = C6DZ.A01(c6fw.A01());
        AbstractC12990ll A0A = C6BQ.A0A(C6BQ.A09(c6fq));
        if ((A0A instanceof UserSession) && (userSession = (UserSession) A0A) != null) {
            C200108tF.A01.A0C(userSession, "BLOKS", A01, true);
            return null;
        }
        throw AbstractC166987dD.A12("User session must not be null");
    }
}
