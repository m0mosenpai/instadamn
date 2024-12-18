package X;

import com.instagram.common.session.UserSession;
import java.util.Collections;

/* renamed from: X.Nra, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC53846Nra {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        UserSession userSession;
        Collections.unmodifiableList(c6fw.A00);
        boolean A01 = C6DZ.A01(c6fw.A01());
        C6FG A09 = C6BQ.A09(c6fq);
        AbstractC12990ll A0A = C6BQ.A0A(A09);
        if ((A0A instanceof UserSession) && (userSession = (UserSession) A0A) != null) {
            C200108tF.A01.A0B(C6BQ.A07(A09), userSession, "BLOKS", null, A01, true);
            return null;
        }
        throw AbstractC166987dD.A12("User session must not be null");
    }
}
