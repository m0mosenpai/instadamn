package X;

import java.util.Comparator;
import java.util.Map;

/* renamed from: X.Wy5, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C71654Wy5 implements Comparator {
    public static final C71654Wy5 A00 = new C71654Wy5();

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        int i;
        int i2;
        Map.Entry entry = (Map.Entry) obj;
        Map.Entry entry2 = (Map.Entry) obj2;
        int i3 = ((C69111Vi1) entry.getValue()).A01;
        int i4 = ((C69111Vi1) entry2.getValue()).A01;
        C69111Vi1 c69111Vi1 = (C69111Vi1) entry.getValue();
        if (i3 == i4) {
            i = c69111Vi1.A02;
            i2 = ((C69111Vi1) entry2.getValue()).A02;
        } else {
            i = c69111Vi1.A01;
            i2 = ((C69111Vi1) entry2.getValue()).A01;
        }
        return i - i2;
    }
}