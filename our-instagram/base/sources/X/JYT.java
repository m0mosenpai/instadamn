package X;

import com.instagram.user.model.User;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes8.dex */
public final class JYT implements InterfaceC41501vz {
    public final /* synthetic */ MSJ A00;

    public JYT(MSJ msj) {
        this.A00 = msj;
    }

    @Override // X.InterfaceC41501vz
    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A03 = C0f9.A03(-1413486959);
        JYS jys = (JYS) obj;
        int A0N = AbstractC167017dG.A0N(jys, -1216875136);
        HashSet A1H = AbstractC166987dD.A1H();
        Iterator it = jys.A00.iterator();
        while (it.hasNext()) {
            A1H.add(((User) it.next()).getId());
        }
        this.A00.FD2(A1H);
        C0f9.A0A(-1393884729, A0N);
        C0f9.A0A(561716260, A03);
    }
}
