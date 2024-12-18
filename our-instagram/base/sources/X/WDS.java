package X;

/* loaded from: classes11.dex */
public final class WDS {
    public int A00;
    public C70174WEw A04;
    public C70174WEw A05;
    public C70174WEw A06;
    public int A03 = -1;
    public int A01 = -1;
    public int A02 = 0;

    private String A00(C70174WEw c70174WEw, int i) {
        if (i < 0) {
            return "<snip>";
        }
        if (c70174WEw == null) {
            return "\n{x}";
        }
        String A0R = AnonymousClass001.A0R("\n", c70174WEw.toString());
        C70174WEw[] c70174WEwArr = c70174WEw.A09;
        int i2 = 0;
        do {
            A0R = AnonymousClass001.A0R(A0R, A00(c70174WEwArr[i2], i - 1).replace("\n", "\n-"));
            i2++;
        } while (i2 < 4);
        return A0R;
    }

    public static void A01(WDS wds, C70174WEw c70174WEw) {
        if (c70174WEw == wds.A04) {
            wds.A04 = c70174WEw.A07;
        }
        if (c70174WEw == wds.A05) {
            wds.A05 = c70174WEw.A06;
        }
        C70174WEw c70174WEw2 = c70174WEw.A07;
        if (c70174WEw2 != null) {
            c70174WEw2.A06 = c70174WEw.A06;
        }
        C70174WEw c70174WEw3 = c70174WEw.A06;
        if (c70174WEw3 != null) {
            c70174WEw3.A07 = c70174WEw2;
        }
        c70174WEw.A07 = null;
        c70174WEw.A06 = null;
    }

    public final String toString() {
        return AnonymousClass001.A0R(A00(this.A06, 10), "\n");
    }

    public WDS() {
        C70174WEw c70174WEw = new C70174WEw(-1, -1);
        this.A06 = c70174WEw;
        c70174WEw.A02 = 0;
        c70174WEw.A03 = 0;
        c70174WEw.A04 = 0;
        this.A04 = c70174WEw;
        this.A05 = c70174WEw;
        this.A00 = 0;
    }

    public final void A02() {
        boolean z;
        C70174WEw[] c70174WEwArr;
        long nanoTime = System.nanoTime();
        try {
            int i = this.A01;
            if (i != -1) {
                int i2 = i - this.A02;
                int i3 = this.A03;
                int i4 = 0;
                if (i3 != -1) {
                    i4 = 1 << (i3 << 1);
                }
                int i5 = i2 + i4;
                if (this.A00 > i5) {
                    for (C70174WEw c70174WEw = this.A04; this.A00 > i5 && c70174WEw != null; c70174WEw = c70174WEw.A07) {
                        if (c70174WEw.A02() != null && c70174WEw.A04 != this.A03 && c70174WEw.A0B == 0) {
                            synchronized (c70174WEw) {
                                if (c70174WEw.A05 != null) {
                                    C70174WEw.A01(c70174WEw);
                                }
                                c70174WEw.A05 = null;
                            }
                            this.A00--;
                        }
                    }
                    do {
                        z = false;
                        for (C70174WEw c70174WEw2 = this.A04; c70174WEw2 != null; c70174WEw2 = c70174WEw2.A07) {
                            for (int i6 = 0; i6 < 4; i6++) {
                                C70174WEw c70174WEw3 = c70174WEw2.A09[i6];
                                if (c70174WEw3 != null && c70174WEw3.A0B == 0 && c70174WEw3.A02() == null) {
                                    int i7 = 0;
                                    int i8 = 0;
                                    int i9 = -1;
                                    do {
                                        c70174WEwArr = c70174WEw3.A09;
                                        if (c70174WEwArr[i7] != null) {
                                            i8++;
                                            i9 = i7;
                                        }
                                        i7++;
                                    } while (i7 < 4);
                                    if (i8 == 1) {
                                        c70174WEw2.A09[i6] = c70174WEwArr[i9];
                                        A01(this, c70174WEw3);
                                        c70174WEw3.A03();
                                    } else if (i8 == 0) {
                                        c70174WEw2.A09[i6] = null;
                                        A01(this, c70174WEw3);
                                        c70174WEw3.A03();
                                    }
                                    z = true;
                                }
                            }
                        }
                    } while (z);
                }
            }
        } finally {
            C42961yO.A0W.A02(System.nanoTime() - nanoTime);
        }
    }

    public final void A03(C70174WEw c70174WEw) {
        int i;
        int i2;
        int i3;
        int i4;
        C70174WEw[] c70174WEwArr;
        int i5;
        if (c70174WEw.A02() != null) {
            this.A00++;
        }
        C70174WEw c70174WEw2 = this.A06;
        while (true) {
            i = c70174WEw.A02;
            i2 = c70174WEw.A03;
            i3 = c70174WEw.A04;
            int i6 = (i3 - c70174WEw2.A04) - 1;
            i4 = (((i >> i6) & 1) << 1) + ((i2 >> i6) & 1);
            c70174WEwArr = c70174WEw2.A09;
            C70174WEw c70174WEw3 = c70174WEwArr[i4];
            if (c70174WEw3 == null || i3 <= (i5 = c70174WEw3.A04)) {
                break;
            }
            int i7 = i3 - i5;
            if ((i >> i7) != c70174WEw3.A02 || (i2 >> i7) != c70174WEw3.A03) {
                break;
            } else {
                c70174WEw2 = c70174WEwArr[i4];
            }
        }
        C70174WEw c70174WEw4 = c70174WEwArr[i4];
        if (c70174WEw4 == null) {
            c70174WEwArr[i4] = c70174WEw;
        } else {
            int i8 = c70174WEw4.A04;
            if (i3 < i8) {
                c70174WEwArr[i4] = c70174WEw;
                C70174WEw[] c70174WEwArr2 = c70174WEw.A09;
                int i9 = c70174WEw4.A02;
                int i10 = c70174WEw4.A03;
                int i11 = (c70174WEw4.A04 - i3) - 1;
                c70174WEwArr2[(((i9 >> i11) & 1) << 1) + ((i10 >> i11) & 1)] = c70174WEw4;
            } else if (i8 == i3 && c70174WEw4.A02 == i && c70174WEw4.A03 == i2) {
                A01(this, c70174WEw4);
                System.arraycopy(c70174WEw4.A09, 0, c70174WEw.A09, 0, 4);
                c70174WEwArr[i4] = c70174WEw;
                if (c70174WEw4.A02() != null) {
                    this.A00--;
                }
                c70174WEw4.A03();
            } else {
                int i12 = i3 - i8;
                int i13 = i >> i12;
                int i14 = i2 >> i12;
                int i15 = c70174WEw4.A02;
                int i16 = c70174WEw4.A03;
                while (true) {
                    if (i13 == i15 && i14 == i16) {
                        break;
                    }
                    i13 >>= 1;
                    i14 >>= 1;
                    i15 >>= 1;
                    i16 >>= 1;
                    i8--;
                }
                C70174WEw c70174WEw5 = new C70174WEw(-1, -1);
                c70174WEw5.A02 = i13;
                c70174WEw5.A03 = i14;
                c70174WEw5.A04 = i8;
                c70174WEwArr[i4] = c70174WEw5;
                C70174WEw[] c70174WEwArr3 = c70174WEw5.A09;
                int i17 = c70174WEw4.A02;
                int i18 = c70174WEw4.A03;
                int i19 = (c70174WEw4.A04 - i8) - 1;
                c70174WEwArr3[(((i17 >> i19) & 1) << 1) + ((i18 >> i19) & 1)] = c70174WEw4;
                int i20 = c70174WEw.A02;
                int i21 = c70174WEw.A03;
                int i22 = (c70174WEw.A04 - i8) - 1;
                c70174WEwArr3[(((i20 >> i22) & 1) << 1) + ((i21 >> i22) & 1)] = c70174WEw;
                A01(this, c70174WEw5);
                C70174WEw c70174WEw6 = this.A05;
                c70174WEw6.A07 = c70174WEw5;
                c70174WEw5.A06 = c70174WEw6;
                this.A05 = c70174WEw5;
            }
        }
        A01(this, c70174WEw);
        C70174WEw c70174WEw7 = this.A05;
        c70174WEw7.A07 = c70174WEw;
        c70174WEw.A06 = c70174WEw7;
        this.A05 = c70174WEw;
        A02();
    }
}
