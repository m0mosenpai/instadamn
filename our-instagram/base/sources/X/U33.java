package X;

import java.util.List;

/* loaded from: classes11.dex */
public abstract class U33 {
    public static final void A00(List list, int i) {
        C14360o3.A0B(list, 0);
        if (i >= 0 && i < list.size()) {
            list.subList(i, list.size()).clear();
        }
    }
}
