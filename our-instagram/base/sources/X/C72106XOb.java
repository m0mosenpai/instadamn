package X;

import java.util.Comparator;

/* renamed from: X.XOb, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C72106XOb implements Comparator {
    public static final C72106XOb A00 = new Object();

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj2;
        AbstractC167017dG.A1N(obj, comparable);
        return comparable.compareTo(obj);
    }

    @Override // java.util.Comparator
    public final Comparator reversed() {
        return C73551YIz.A00;
    }
}
