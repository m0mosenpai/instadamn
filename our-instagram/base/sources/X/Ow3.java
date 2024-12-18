package X;

import com.instagram.common.session.UserSession;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes9.dex */
public final class Ow3 implements InterfaceC13000lm {
    public boolean A00;
    public final java.util.Set A04 = Collections.newSetFromMap(new WeakHashMap());
    public final Map A02 = AbstractC166987dD.A1G();
    public final Map A03 = AbstractC166987dD.A1G();
    public final List A01 = AbstractC166987dD.A1E();

    public static Ow3 A00(UserSession userSession) {
        return (Ow3) userSession.A01(Ow3.class, new B2Q(0));
    }

    public final void A01(String str, Integer num) {
        Iterator it = this.A04.iterator();
        while (it.hasNext()) {
            ((InterfaceC58108PpX) it.next()).DH6(str, num);
        }
        this.A02.remove(str);
        this.A00 = false;
    }

    public final void A02(String str, Integer num) {
        Iterator it = this.A04.iterator();
        while (it.hasNext()) {
            ((InterfaceC58108PpX) it.next()).DaM(str, num);
        }
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        this.A03.clear();
    }
}
