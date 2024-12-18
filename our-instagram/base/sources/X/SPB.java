package X;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes10.dex */
public abstract class SPB {
    public int A00;
    public Map.Entry A01;
    public Map.Entry A02;
    public final C64770TTe A03;
    public final Iterator A04;

    public final void A00() {
        Map.Entry entry;
        this.A01 = this.A02;
        Iterator it = this.A04;
        if (it.hasNext()) {
            entry = AbstractC166987dD.A1K(it);
        } else {
            entry = null;
        }
        this.A02 = entry;
    }

    public final boolean hasNext() {
        return AbstractC167007dF.A1W(this.A02);
    }

    public final void remove() {
        C64770TTe c64770TTe = this.A03;
        if (c64770TTe.A00().A00 == this.A00) {
            Map.Entry entry = this.A01;
            if (entry != null) {
                c64770TTe.remove(entry.getKey());
                this.A01 = null;
                this.A00 = c64770TTe.A00().A00;
                return;
            }
            throw AbstractC58318PtA.A0Z();
        }
        throw AbstractC58318PtA.A0z();
    }

    public SPB(C64770TTe c64770TTe, Iterator it) {
        this.A03 = c64770TTe;
        this.A04 = it;
        this.A00 = c64770TTe.A00().A00;
        A00();
    }
}
