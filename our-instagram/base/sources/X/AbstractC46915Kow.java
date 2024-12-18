package X;

/* renamed from: X.Kow, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46915Kow {
    public static final C45108Jxc A00(C45091JxL c45091JxL) {
        long currentTimeMillis;
        C14360o3.A0B(c45091JxL, 0);
        String str = c45091JxL.A08;
        Long l = c45091JxL.A06;
        if (l != null) {
            currentTimeMillis = l.longValue();
        } else {
            currentTimeMillis = System.currentTimeMillis();
        }
        int i = c45091JxL.A00;
        int i2 = c45091JxL.A01;
        int i3 = c45091JxL.A02;
        String str2 = c45091JxL.A09;
        String str3 = c45091JxL.A0A;
        String str4 = c45091JxL.A0B;
        return new C45108Jxc(c45091JxL.A03, c45091JxL.A04, c45091JxL.A07, c45091JxL.A05, str, str2, str3, str4, i, i2, i3, currentTimeMillis, c45091JxL.A0D);
    }
}
