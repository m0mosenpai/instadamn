package X;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes6.dex */
public final class GO1 implements Runnable {
    public final /* synthetic */ C31662DvS A00;
    public final /* synthetic */ Map A01;

    public GO1(C31662DvS c31662DvS, Map map) {
        this.A01 = map;
        this.A00 = c31662DvS;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Map map = this.A01;
        C31662DvS c31662DvS = this.A00;
        Iterator A15 = AbstractC166997dE.A15(map);
        while (A15.hasNext()) {
            LIu.A01(c31662DvS.A01).A01(AbstractC31179DnN.A03((C3o9) AbstractC166987dD.A1K(A15).getKey()));
        }
    }
}
