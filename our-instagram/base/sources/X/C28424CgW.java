package X;

/* renamed from: X.CgW, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28424CgW {
    public int A00;
    public int A01;
    public Object A02;
    public boolean A03;
    public static final Object A04 = new Object();
    public static final Object A08 = new Object();
    public static final Object A07 = new Object();
    public static final Object A05 = new Object();
    public static final Object A06 = new Object();

    public final void A01(C56082hw c56082hw, int i) {
        Integer num;
        Integer[] numArr;
        char c;
        int i2 = 2;
        boolean z = this.A03;
        if (i == 0) {
            if (z) {
                c56082hw.A14[0] = C05F.A0C;
                Object obj = this.A02;
                if (obj == A08) {
                    i2 = 1;
                } else if (obj != A06) {
                    i2 = 0;
                }
                c56082hw.A0E(1.0f, i2, this.A00, Integer.MAX_VALUE);
                return;
            }
            int i3 = this.A00;
            if (i3 > 0) {
                c56082hw.A0N = i3;
            }
            Object obj2 = this.A02;
            if (obj2 == A08) {
                num = C05F.A01;
            } else if (obj2 == A05) {
                num = C05F.A0N;
            } else {
                if (obj2 != null) {
                    return;
                }
                c56082hw.A14[0] = C05F.A00;
                c56082hw.A0I(this.A01);
                return;
            }
            numArr = c56082hw.A14;
            c = 0;
        } else {
            if (z) {
                c56082hw.A14[1] = C05F.A0C;
                Object obj3 = this.A02;
                if (obj3 == A08) {
                    i2 = 1;
                } else if (obj3 != A06) {
                    i2 = 0;
                }
                c56082hw.A0F(1.0f, i2, this.A00, Integer.MAX_VALUE);
                return;
            }
            int i4 = this.A00;
            if (i4 > 0) {
                c56082hw.A0M = i4;
            }
            Object obj4 = this.A02;
            if (obj4 == A08) {
                num = C05F.A01;
            } else if (obj4 == A05) {
                num = C05F.A0N;
            } else {
                if (obj4 != null) {
                    return;
                }
                c56082hw.A14[1] = C05F.A00;
                c56082hw.A0H(this.A01);
                return;
            }
            numArr = c56082hw.A14;
            c = 1;
        }
        numArr[c] = num;
    }

    public static C28424CgW A00(Object obj) {
        C28424CgW c28424CgW = new C28424CgW(A04);
        c28424CgW.A02 = obj;
        if (obj instanceof Integer) {
            c28424CgW.A01 = AbstractC166987dD.A0H(obj);
            c28424CgW.A02 = null;
        }
        return c28424CgW;
    }

    public C28424CgW(Object obj) {
        this.A00 = 0;
        this.A01 = 0;
        this.A03 = false;
        this.A02 = obj;
    }

    public C28424CgW() {
        this.A00 = 0;
        this.A01 = 0;
        this.A02 = A08;
        this.A03 = false;
    }
}
