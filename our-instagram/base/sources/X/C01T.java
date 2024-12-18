package X;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* renamed from: X.01T, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C01T extends AbstractC009303h {
    public static final void A1C(List list) {
        C14360o3.A0B(list, 0);
        if (list.size() > 1) {
            Collections.sort(list);
        }
    }

    public static final void A1D(List list, Comparator comparator) {
        C14360o3.A0B(list, 0);
        C14360o3.A0B(comparator, 1);
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }
}
