package X;

import java.util.Comparator;

/* renamed from: X.4Gx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C93444Gx {
    public final C2n2 A00;
    public final C2E0 A01;
    public final Comparator A02;

    public C93444Gx(final C2n2 c2n2, final C2E0 c2e0) {
        this.A01 = c2e0;
        this.A00 = c2n2;
        this.A02 = new Comparator() { // from class: X.4Gy
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                Comparator comparator = c2e0.A02;
                C2n2 c2n22 = c2n2;
                return comparator.compare(c2n22.apply(obj), c2n22.apply(obj2));
            }
        };
    }
}
