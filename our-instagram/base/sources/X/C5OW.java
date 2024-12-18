package X;

/* renamed from: X.5OW, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5OW {
    public final C49G A00;
    public final String A01;

    public C5OW(C49G c49g, String str) {
        C14360o3.A0B(c49g, 2);
        this.A01 = str;
        this.A00 = c49g;
    }

    public final int A00(Integer num) {
        C49G c49g;
        Integer num2;
        C14360o3.A0B(num, 0);
        int intValue = num.intValue();
        if (intValue != 0) {
            if (intValue != 1) {
                if (intValue != 2) {
                    if (intValue == 3) {
                        c49g = this.A00;
                        num2 = C05F.A0N;
                    } else {
                        throw new RuntimeException();
                    }
                } else {
                    c49g = this.A00;
                    num2 = C05F.A0C;
                }
            } else {
                c49g = this.A00;
                num2 = C05F.A01;
            }
        } else {
            c49g = this.A00;
            num2 = C05F.A00;
        }
        return c49g.A03(num2, this.A01);
    }

    public final long A01(Integer num) {
        C49G c49g;
        Integer num2;
        Integer num3;
        C14360o3.A0B(num, 0);
        int intValue = num.intValue();
        if (intValue != 0) {
            if (intValue != 1) {
                if (intValue != 2) {
                    if (intValue == 3) {
                        c49g = this.A00;
                        num2 = C05F.A0N;
                    } else {
                        throw new RuntimeException();
                    }
                } else {
                    c49g = this.A00;
                    num2 = C05F.A0C;
                }
            } else {
                c49g = this.A00;
                num2 = C05F.A01;
            }
        } else {
            c49g = this.A00;
            num2 = C05F.A00;
        }
        String str = this.A01;
        int intValue2 = num2.intValue();
        if (intValue2 != 0) {
            if (intValue2 != 1) {
                if (intValue2 != 2) {
                    num3 = C05F.A1I;
                } else {
                    num3 = C05F.A15;
                }
            } else {
                num3 = C05F.A0j;
            }
        } else {
            num3 = C05F.A0N;
        }
        return c49g.A00.getLong(C49G.A00(c49g, num3, str), 0L);
    }
}
