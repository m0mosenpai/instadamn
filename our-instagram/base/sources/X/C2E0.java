package X;

import java.util.Comparator;

/* renamed from: X.2E0, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C2E0 {
    public final Object A00;
    public final Object A01;
    public final Comparator A02;

    public C2E0(Object obj, Object obj2, final Comparator comparator) {
        this.A01 = obj;
        this.A00 = obj2;
        this.A02 = new Comparator() { // from class: X.2E3
            @Override // java.util.Comparator
            public final int compare(Object obj3, Object obj4) {
                if (AbstractC50102Ry.A00(obj3, obj4)) {
                    return 0;
                }
                C2E0 c2e0 = C2E0.this;
                Object obj5 = c2e0.A01;
                if (!obj5.equals(obj3)) {
                    Object obj6 = c2e0.A00;
                    if (!obj6.equals(obj4)) {
                        if (!obj6.equals(obj3) && !obj5.equals(obj4)) {
                            return comparator.compare(obj3, obj4);
                        }
                        return 1;
                    }
                    return -1;
                }
                return -1;
            }
        };
    }
}
