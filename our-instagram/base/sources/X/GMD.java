package X;

import com.instagram.quickpromotion.intf.QPTooltipAnchor;
import com.instagram.quickpromotion.intf.Trigger;
import java.util.HashSet;

/* loaded from: classes6.dex */
public final class GMD implements Runnable {
    public final /* synthetic */ C31702Dw7 A00;

    public GMD(C31702Dw7 c31702Dw7) {
        this.A00 = c31702Dw7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashSet A1H = AbstractC166987dD.A1H();
        A1H.add(Trigger.A0O);
        C31721DwQ c31721DwQ = (C31721DwQ) this.A00.A01;
        C64742wY c64742wY = c31721DwQ.A0q;
        C64842wi c64842wi = c31721DwQ.A0p;
        c64742wY.A00(c31721DwQ.A04, QPTooltipAnchor.A0v, c64842wi);
        c31721DwQ.A0p.AVr(A1H);
    }
}
