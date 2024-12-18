package X;

import java.util.Comparator;

/* renamed from: X.6OW, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6OW implements Comparator {
    public static final C6OW A00 = new Object();

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        C114205Dh c114205Dh = (C114205Dh) ((C09530e4) obj).A00;
        float f = c114205Dh.A03;
        C114205Dh c114205Dh2 = (C114205Dh) ((C09530e4) obj2).A00;
        int compare = Float.compare(f, c114205Dh2.A03);
        if (compare == 0) {
            return Float.compare(c114205Dh.A00, c114205Dh2.A00);
        }
        return compare;
    }
}
