package X;

import java.util.Comparator;
import java.util.Map;

/* renamed from: X.3Qd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C73273Qd implements Comparator {
    public static final C73273Qd A00 = new C73273Qd();

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        int i;
        int i2;
        Map.Entry entry = (Map.Entry) obj;
        Map.Entry entry2 = (Map.Entry) obj2;
        C14360o3.A0A(entry);
        C4HV c4hv = (C4HV) entry.getValue();
        C14360o3.A0A(entry2);
        C4HV c4hv2 = (C4HV) entry2.getValue();
        int i3 = c4hv.A02 - c4hv2.A02;
        if (i3 == 0) {
            if (AbstractC13620mo.A02(AbstractC12290kX.A00)) {
                i = c4hv2.A01;
                i2 = c4hv.A01;
            } else {
                i = c4hv.A01;
                i2 = c4hv2.A01;
            }
            return i - i2;
        }
        return i3;
    }
}
