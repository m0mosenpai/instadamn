package X;

/* renamed from: X.6x0, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC154506x0 {
    public static final C154516x1 A00(Object obj, Object obj2, String str, boolean z, boolean z2) {
        Integer num;
        boolean z3;
        C14360o3.A0B(str, 0);
        if (obj2 instanceof C62a) {
            C62a c62a = (C62a) obj2;
            if (c62a.A04) {
                num = C05F.A0N;
            } else if (c62a.A02) {
                num = C05F.A0C;
            } else if (c62a.A03) {
                num = C05F.A01;
            } else {
                num = C05F.A00;
            }
        } else {
            num = C05F.A0Y;
        }
        if (obj instanceof AbstractC1337262d) {
            z3 = ((AbstractC1337262d) obj).A02();
        } else {
            z3 = false;
        }
        return new C154516x1(num, str, z3, z, z2);
    }
}
