package X;

import android.util.SparseArray;
import com.instagram.common.session.UserSession;
import com.instagram.creation.base.CreationSession;
import java.util.LinkedList;

/* loaded from: classes9.dex */
public final class O2N {
    public final SparseArray A00 = new SparseArray();

    public O2N(UserSession userSession, CreationSession creationSession) {
        LinkedList<C54629OBe> A00 = AbstractC53888NsK.A00(userSession);
        C56232Oxf c56232Oxf = new C56232Oxf(userSession, creationSession);
        for (C54629OBe c54629OBe : A00) {
            this.A00.append(c54629OBe.A00, new NHF(userSession, c54629OBe, c56232Oxf));
        }
    }
}
