package X;

import java.util.Collections;
import java.util.List;

/* renamed from: X.0eM, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C0eM {
    public static final List A1H(Iterable iterable) {
        C14360o3.A0B(iterable, 0);
        List A0b = AbstractC001800i.A0b(iterable);
        Collections.shuffle(A0b);
        return A0b;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.04D, X.01L] */
    public static final C01L A1I() {
        ?? c04d = new C04D();
        c04d.A02 = new Object[10];
        return c04d;
    }

    public static final C01L A1J(List list) {
        C01L c01l = (C01L) list;
        C01L.A06(c01l);
        c01l.A01 = true;
        if (c01l.A00 <= 0) {
            return C01L.A03;
        }
        return c01l;
    }
}
