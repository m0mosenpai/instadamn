package X;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes9.dex */
public final class OHO {
    public final OI6 A00;

    public OHO(OI6 oi6) {
        C14360o3.A0B(oi6, 1);
        this.A00 = oi6;
    }

    public final void A00(String str, ArrayList arrayList, boolean z) {
        C0x9 c0x9 = new C0x9();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            c0x9.A04(AbstractC166987dD.A1B(it));
        }
        this.A00.A00(new PA5(c0x9, str, z));
    }
}
