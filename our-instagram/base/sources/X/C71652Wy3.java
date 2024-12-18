package X;

import java.util.Comparator;

/* renamed from: X.Wy3, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C71652Wy3 implements Comparator {
    public static final C71652Wy3 A00 = new Object();

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        W62 w62 = (W62) obj;
        W62 w622 = (W62) obj2;
        AbstractC167017dG.A1N(w62, w622);
        if (w62.equals(w622)) {
            return 0;
        }
        int i = w62.A04.A00;
        int i2 = w622.A04.A00;
        if (i == i2) {
            if (w62.A03 - w622.A03 <= 0) {
                return -1;
            }
            return 1;
        }
        return i - i2;
    }
}
