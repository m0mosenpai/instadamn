package X;

import android.os.Handler;
import android.os.Looper;
import com.instagram.common.session.UserSession;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
public final class EVH extends AbstractC60592pi {
    public UserSession A00;
    public ENJ A01;
    public List A02;
    public final C1GL A04;
    public final Deque A05 = new ArrayDeque(3);
    public final Map A06 = Collections.synchronizedMap(AbstractC166987dD.A1I());
    public final Handler A03 = new HandlerC31740Dwt(Looper.getMainLooper(), this, 3);

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onDestroy() {
        this.A03.removeCallbacksAndMessages(null);
        this.A01 = null;
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onDestroyView() {
        this.A05.clear();
        Iterator A16 = AbstractC166997dE.A16(this.A06);
        while (A16.hasNext()) {
            Iterator A1J = AbstractC25226BEj.A1J(A16.next());
            while (A1J.hasNext()) {
                ((C1ON) A1J.next()).cancel();
            }
        }
    }

    public EVH(UserSession userSession, C1GL c1gl, List list) {
        this.A00 = userSession;
        this.A04 = c1gl;
        this.A02 = list;
    }
}
