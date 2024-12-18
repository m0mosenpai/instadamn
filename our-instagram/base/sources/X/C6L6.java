package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.6L6, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6L6 {
    public static final C25766Ba5 A00(List list, long j, long j2) {
        return new C25766Ba5(list, null, 0, j, j2);
    }

    public static final C25766Ba5 A01(C09530e4[] c09530e4Arr, int i, long j, long j2) {
        int length = c09530e4Arr.length;
        ArrayList arrayList = new ArrayList(length);
        for (C09530e4 c09530e4 : c09530e4Arr) {
            arrayList.add(new C1132359l(((C1132359l) c09530e4.A01).A00));
        }
        ArrayList arrayList2 = new ArrayList(length);
        for (C09530e4 c09530e42 : c09530e4Arr) {
            arrayList2.add(Float.valueOf(((Number) c09530e42.A00).floatValue()));
        }
        return new C25766Ba5(arrayList, arrayList2, i, j, j2);
    }

    public static final C25765Ba4 A02(C09530e4[] c09530e4Arr) {
        int length = c09530e4Arr.length;
        ArrayList arrayList = new ArrayList(length);
        for (C09530e4 c09530e4 : c09530e4Arr) {
            arrayList.add(new C1132359l(((C1132359l) c09530e4.A01).A00));
        }
        ArrayList arrayList2 = new ArrayList(length);
        for (C09530e4 c09530e42 : c09530e4Arr) {
            arrayList2.add(Float.valueOf(((Number) c09530e42.A00).floatValue()));
        }
        return new C25765Ba4(arrayList, arrayList2);
    }
}
