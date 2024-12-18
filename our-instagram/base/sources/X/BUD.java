package X;

import java.util.List;

/* loaded from: classes5.dex */
public abstract class BUD {
    public final C27817COg A00;
    public final BUI A01;

    public void A00(C135266Ab c135266Ab) {
        List list;
        C14360o3.A0B(c135266Ab, 0);
        this.A00.A00 = c135266Ab;
        boolean z = this instanceof BUE;
        Object obj = c135266Ab.A02;
        if (z) {
            C6AZ c6az = (C6AZ) obj;
            if (c6az != null) {
                list = c6az.A00.A02;
            } else {
                return;
            }
        } else {
            CQA cqa = (CQA) obj;
            if (cqa != null) {
                list = cqa.A01;
            } else {
                return;
            }
        }
        if (list != null && !list.isEmpty()) {
            BUI bui = this.A01;
            synchronized (bui) {
                bui.A00.removeAll(list);
            }
        }
    }

    public BUD(C27817COg c27817COg, BUI bui) {
        this.A01 = bui;
        this.A00 = c27817COg;
    }
}
