package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.LinkedList;

/* loaded from: classes8.dex */
public final class L7M {
    public final UserSession A00;
    public final LinkedList A01;
    public final java.util.Set A02;

    public /* synthetic */ L7M(UserSession userSession) {
        LinkedList linkedList = new LinkedList();
        LinkedHashSet A0l = AbstractC31171DnF.A0l();
        this.A01 = linkedList;
        this.A02 = A0l;
        this.A00 = userSession;
    }

    public final void A00(Collection collection) {
        ArrayList A1E = AbstractC166987dD.A1E();
        for (Object obj : collection) {
            AbstractC25228BEl.A1Q(obj, A1E, this.A02.contains(obj) ? 1 : 0);
        }
        if (AbstractC166987dD.A1b(A1E)) {
            this.A02.addAll(A1E);
            this.A01.addAll(0, A1E);
        }
    }
}
