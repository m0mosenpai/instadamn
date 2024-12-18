package X;

import java.util.Map;

/* renamed from: X.3JS, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3JS {
    public static int A00 = -1;
    public static boolean A01;
    public static boolean A02;
    public static final C3JT A03 = new Object();
    public static final Map A04 = AbstractC16850sd.A0M(new C09530e4(EnumC23071Am.A0e, 1));

    public C3JS(AbstractC12990ll abstractC12990ll) {
        C14360o3.A0B(abstractC12990ll, 1);
        C06090Tz c06090Tz = C06090Tz.A05;
        A01 = C18U.A06(c06090Tz, abstractC12990ll, 36315069475326956L);
        A02 = C18U.A06(c06090Tz, abstractC12990ll, 36315069475589104L);
    }

    public final synchronized boolean A00(EnumC23071Am enumC23071Am) {
        Integer num = (Integer) A04.get(enumC23071Am);
        boolean z = false;
        if (enumC23071Am == EnumC23071Am.A0e && A02) {
            return false;
        }
        int i = A00;
        if (i != 0 && num != null) {
            if (num.intValue() >= i) {
                z = true;
            }
        }
        return z;
    }
}
