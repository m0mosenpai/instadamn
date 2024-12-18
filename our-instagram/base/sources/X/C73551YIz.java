package X;

import java.util.Comparator;

/* renamed from: X.YIz, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C73551YIz implements Comparator {
    public static final C73551YIz A00 = new Object();

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        AbstractC167017dG.A1N(comparable, obj2);
        return comparable.compareTo(obj2);
    }

    @Override // java.util.Comparator
    public final Comparator reversed() {
        return C72106XOb.A00;
    }
}
