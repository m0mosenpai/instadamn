package X;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes9.dex */
public final class MTG implements InterfaceC13000lm {
    public final Map A00 = AbstractC166987dD.A1G();

    @Override // X.InterfaceC13000lm
    public final synchronized void onSessionWillEnd() {
        Map map = this.A00;
        Iterator A15 = AbstractC166997dE.A15(map);
        while (A15.hasNext()) {
            Map.Entry A1K = AbstractC166987dD.A1K(A15);
            ((MTF) A1K.getValue()).A00();
            ((MTF) A1K.getValue()).A01(false);
        }
        map.clear();
    }
}
