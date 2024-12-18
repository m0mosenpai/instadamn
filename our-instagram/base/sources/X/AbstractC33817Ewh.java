package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Ewh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33817Ewh {
    public static Object A00(C6FQ c6fq, C6FW c6fw) {
        List list = (List) c6fw.A01();
        boolean A01 = C6DZ.A01(c6fw.A03(1));
        UserSession A012 = AbstractC03270Dk.A01(C6BQ.A0B(c6fq));
        if (A012 != null) {
            AbstractC166997dE.A0Y(A012).A03.EVc(true);
            ArrayList A1E = AbstractC166987dD.A1E();
            if (A01 && !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    AbstractC25651Mw.A00(A012).E4s(new C1563870i(AbstractC166987dD.A1B(it), Collections.unmodifiableList(A1E)));
                }
                return null;
            }
            return null;
        }
        return null;
    }
}
