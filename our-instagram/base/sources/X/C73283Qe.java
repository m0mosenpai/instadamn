package X;

import java.util.Comparator;
import java.util.Map;

/* renamed from: X.3Qe, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C73283Qe implements Comparator {
    public static final C73283Qe A00 = new C73283Qe();

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Map.Entry entry = (Map.Entry) obj;
        Map.Entry entry2 = (Map.Entry) obj2;
        int i = -Float.compare(((C4HV) entry.getValue()).A00, ((C4HV) entry2.getValue()).A00);
        if (i == 0) {
            return AbstractC73263Qc.A00.compare(entry, entry2);
        }
        return i;
    }
}
