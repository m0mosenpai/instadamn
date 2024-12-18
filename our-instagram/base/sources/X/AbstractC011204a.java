package X;

/* renamed from: X.04a, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC011204a {
    public C02I[] A00;
    public final C011504d A01;

    public abstract C011504d A00();

    public void A02(C02I c02i) {
    }

    public void A03(C02I c02i) {
    }

    public void A04(C02I c02i) {
    }

    public abstract void A05(C02I c02i);

    public abstract void A06(C02I c02i);

    public final void A01() {
        C02I[] c02iArr = this.A00;
        if (c02iArr != null) {
            C02I c02i = c02iArr[0];
            C02I c02i2 = c02iArr[1];
            if (c02i2 == null) {
                c02i2 = this.A01.A00.A05(2);
            }
            if (c02i == null) {
                c02i = this.A01.A00.A05(1);
            }
            A06(C02I.A02(c02i, c02i2));
            C02I c02i3 = this.A00[4];
            if (c02i3 != null) {
                A03(c02i3);
            }
            C02I c02i4 = this.A00[5];
            if (c02i4 != null) {
                A02(c02i4);
            }
            C02I c02i5 = this.A00[6];
            if (c02i5 != null) {
                A04(c02i5);
            }
        }
    }

    public void A07(C02I c02i, int i) {
        char c;
        C02I[] c02iArr = this.A00;
        if (c02iArr == null) {
            c02iArr = new C02I[9];
            this.A00 = c02iArr;
        }
        int i2 = 1;
        do {
            if ((i & i2) != 0) {
                char c2 = 1;
                if (i2 != 1) {
                    c = 2;
                    if (i2 != 2) {
                        c2 = 4;
                        if (i2 != 4) {
                            c = '\b';
                            if (i2 != 8) {
                                if (i2 != 16) {
                                    if (i2 != 32) {
                                        if (i2 != 64) {
                                            if (i2 != 128) {
                                                if (i2 != 256) {
                                                    throw new IllegalArgumentException(AnonymousClass001.A0O("type needs to be >= FIRST and <= LAST, type=", i2));
                                                }
                                            } else {
                                                c2 = 7;
                                            }
                                        } else {
                                            c2 = 6;
                                        }
                                    } else {
                                        c2 = 5;
                                    }
                                }
                            } else {
                                c2 = 3;
                            }
                        }
                        c02iArr[c] = c02i;
                    }
                } else {
                    c2 = 0;
                }
                c = c2;
                c02iArr[c] = c02i;
            }
            i2 <<= 1;
        } while (i2 <= 256);
    }

    public AbstractC011204a(C011504d c011504d) {
        this.A01 = c011504d;
    }

    public AbstractC011204a() {
        this(new C011504d());
    }
}
