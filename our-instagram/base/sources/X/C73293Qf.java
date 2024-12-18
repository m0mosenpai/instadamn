package X;

import java.util.Comparator;
import java.util.Map;

/* renamed from: X.3Qf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C73293Qf implements Comparator {
    public static final C73293Qf A00 = new C73293Qf();

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        int i;
        Map.Entry entry = (Map.Entry) obj;
        Map.Entry entry2 = (Map.Entry) obj2;
        if (((C4HV) entry.getValue()).A07 && (i = -Float.compare(((C4HV) entry.getValue()).A00, ((C4HV) entry2.getValue()).A00)) != 0) {
            return i;
        }
        return AbstractC73263Qc.A00.compare(entry, entry2);
    }
}
