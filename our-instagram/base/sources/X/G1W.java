package X;

import java.util.Collections;
import java.util.List;

/* loaded from: classes6.dex */
public final class G1W implements GWW {
    public C2EC A00;

    public final List A00() {
        FG7 fg7;
        List list;
        C2EC c2ec = this.A00;
        if (c2ec == null) {
            C14360o3.A0F("thread");
            throw C00O.createAndThrow();
        }
        C83403nh BLX = c2ec.BLX();
        if (BLX == null || (fg7 = BLX.A0K) == null || (list = fg7.A00) == null) {
            return null;
        }
        return Collections.unmodifiableList(list);
    }
}
