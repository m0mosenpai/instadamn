package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.7FM, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7FM {
    public final Map A00 = new LinkedHashMap();
    public final C7FL A01;

    public final void A00(C7GY c7gy, C7GX c7gx, boolean z) {
        C14360o3.A0B(c7gx, 0);
        if (z) {
            Map map = this.A00;
            if (!map.containsKey(c7gx)) {
                C159737El c159737El = this.A01.A00;
                if (c7gx == C7GX.A0C) {
                    C159737El.A0g(c159737El, 1);
                } else if (c7gx == C7GX.A0B) {
                    c159737El.A0J.A0E(AbstractC31271Dot.A00(c159737El.A1Z), C159737El.A0H(c159737El), false, true, c159737El.A1V());
                }
            }
            map.put(c7gx, c7gy);
            return;
        }
        Map map2 = this.A00;
        map2.containsKey(c7gx);
        map2.remove(c7gx);
    }

    public C7FM(C7FL c7fl) {
        this.A01 = c7fl;
    }
}
