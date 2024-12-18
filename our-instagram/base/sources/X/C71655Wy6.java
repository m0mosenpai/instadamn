package X;

import java.util.Comparator;
import java.util.Map;

/* renamed from: X.Wy6, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C71655Wy6 implements Comparator {
    public static final C71655Wy6 A00 = new C71655Wy6();

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        int i;
        int i2;
        Map.Entry entry = (Map.Entry) obj;
        Map.Entry entry2 = (Map.Entry) obj2;
        int i3 = ((C69112Vi2) entry.getValue()).A01;
        int i4 = ((C69112Vi2) entry2.getValue()).A01;
        C69112Vi2 c69112Vi2 = (C69112Vi2) entry.getValue();
        if (i3 == i4) {
            i = c69112Vi2.A02;
            i2 = ((C69112Vi2) entry2.getValue()).A02;
        } else {
            i = c69112Vi2.A01;
            i2 = ((C69112Vi2) entry2.getValue()).A01;
        }
        return i - i2;
    }
}
