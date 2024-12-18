package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes6.dex */
public final class G00 implements InterfaceC13050lr {
    public final Map A00 = AbstractC166987dD.A1I();

    @Override // X.InterfaceC13050lr
    public final synchronized void onUserSessionWillEnd(boolean z) {
        Map map = this.A00;
        Iterator A16 = AbstractC166997dE.A16(map);
        while (A16.hasNext()) {
            Collection values = ((Map) A16.next()).values();
            ArrayList A1E = AbstractC166987dD.A1E();
            for (Object obj : values) {
                if (obj instanceof InterfaceC13050lr) {
                    A1E.add(obj);
                }
            }
            Iterator it = A1E.iterator();
            while (it.hasNext()) {
                ((InterfaceC13050lr) it.next()).onUserSessionWillEnd(z);
            }
        }
        map.clear();
    }
}
