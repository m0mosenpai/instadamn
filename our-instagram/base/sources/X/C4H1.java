package X;

import java.util.Comparator;

/* renamed from: X.4H1, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4H1 implements Comparator {
    public static final C4H1 A00 = new C4H1();

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        long j;
        long j2;
        C83403nh c83403nh = (C83403nh) obj;
        C83403nh c83403nh2 = (C83403nh) obj2;
        Long l = c83403nh.A1P;
        long C8i = c83403nh.C8i();
        Long l2 = c83403nh2.A1P;
        long C8i2 = c83403nh2.C8i();
        if (l != null) {
            j = l.longValue();
        } else {
            j = C8i;
            C8i = 0;
        }
        if (l2 != null) {
            j2 = l2.longValue();
        } else {
            j2 = C8i2;
            C8i2 = 0;
        }
        if (j >= j2) {
            if (j <= j2) {
                if (C8i >= C8i2) {
                    if (C8i <= C8i2) {
                        return 0;
                    }
                } else {
                    return -1;
                }
            }
            return 1;
        }
        return -1;
    }
}
