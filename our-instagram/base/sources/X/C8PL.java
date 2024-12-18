package X;

import java.util.Comparator;

/* renamed from: X.8PL, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8PL implements Comparator {
    public static final C8PL A00 = new C8PL();

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        int i = ((C9LJ) ((BEd) obj)).A0e;
        int i2 = ((C9LJ) ((BEd) obj2)).A0e;
        if (i < i2) {
            return -1;
        }
        if (i != i2) {
            return 1;
        }
        return 0;
    }
}
