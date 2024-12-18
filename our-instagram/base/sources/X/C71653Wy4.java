package X;

import java.util.Comparator;

/* renamed from: X.Wy4, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C71653Wy4 implements Comparator {
    public static final Comparator A00 = new Object();

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        C69788VvT c69788VvT = (C69788VvT) obj;
        C69788VvT c69788VvT2 = (C69788VvT) obj2;
        AbstractC167017dG.A1N(c69788VvT, c69788VvT2);
        if (c69788VvT.equals(c69788VvT2)) {
            return 0;
        }
        int i = c69788VvT.A04.A00;
        int i2 = c69788VvT2.A04.A00;
        if (i == i2) {
            i = c69788VvT.A00;
            i2 = c69788VvT2.A00;
        }
        return i - i2;
    }
}
