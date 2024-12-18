package X;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes10.dex */
public abstract class SLL {
    public boolean A01 = false;
    public List A00 = AbstractC166987dD.A1E();

    public final void A00(boolean z) {
        if (z != this.A01) {
            this.A01 = z;
            Iterator it = this.A00.iterator();
            while (it.hasNext()) {
                ((SLy) it.next()).A00();
            }
        }
    }
}
