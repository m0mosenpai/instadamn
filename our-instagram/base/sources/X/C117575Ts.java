package X;

import java.util.ArrayList;

/* renamed from: X.5Ts, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C117575Ts {
    public int A00;
    public int A03;
    public C117465Tf A05;
    public boolean A06;
    public int A07;
    public final C117505Tk A09;
    public final C117525Tn A0A = new C117525Tn();
    public C117515Tm A04 = new C117515Tm();
    public int A08 = -1;
    public int A01 = -1;
    public int A02 = -1;

    public static final void A01(C117575Ts c117575Ts) {
        A03(c117575Ts, false);
        C117555Tq c117555Tq = c117575Ts.A09.A0B;
        if (c117555Tq.A08 > 0) {
            int i = c117555Tq.A05;
            C117525Tn c117525Tn = c117575Ts.A0A;
            int i2 = -2;
            int i3 = c117525Tn.A00;
            if (i3 > 0) {
                i2 = c117525Tn.A01[i3 - 1];
            }
            if (i2 != i) {
                if (!c117575Ts.A06) {
                    A03(c117575Ts, false);
                    c117575Ts.A05.A00.A02(C127245p2.A00);
                    c117575Ts.A06 = true;
                }
                if (i > 0) {
                    C117595Tu A02 = c117555Tq.A02(i);
                    c117525Tn.A00(i);
                    A03(c117575Ts, false);
                    C117485Th c117485Th = c117575Ts.A05.A00;
                    C5ZF c5zf = C5ZF.A00;
                    c117485Th.A02(c5zf);
                    AbstractC117665Ub.A01(c117485Th, A02, 0);
                    int i4 = c117485Th.A03;
                    int i5 = c5zf.A00;
                    int i6 = 0;
                    if (i5 != 0) {
                        i6 = (-1) >>> (32 - i5);
                    }
                    if (i4 == i6) {
                        int i7 = c117485Th.A04;
                        int i8 = c5zf.A01;
                        int i9 = 0;
                        if (i8 != 0) {
                            i9 = (-1) >>> (32 - i8);
                        }
                        if (i7 == i9) {
                            c117575Ts.A06 = true;
                            return;
                        }
                    }
                    StringBuilder sb = new StringBuilder();
                    int i10 = 0;
                    for (int i11 = 0; i11 < i5; i11++) {
                        if (((1 << i11) & c117485Th.A03) != 0) {
                            if (i10 > 0) {
                                sb.append(", ");
                            }
                            sb.append(c5zf.A00(i11));
                            i10++;
                        }
                    }
                    String obj = sb.toString();
                    C14360o3.A07(obj);
                    StringBuilder sb2 = new StringBuilder();
                    int i12 = c5zf.A01;
                    int i13 = 0;
                    for (int i14 = 0; i14 < i12; i14++) {
                        if (((1 << i14) & c117485Th.A04) != 0) {
                            if (i10 > 0) {
                                sb2.append(", ");
                            }
                            sb2.append(c5zf.A01(i14));
                            i13++;
                        }
                    }
                    String obj2 = sb2.toString();
                    C14360o3.A07(obj2);
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Error while pushing ");
                    sb3.append(c5zf);
                    sb3.append(". Not all arguments were provided. Missing ");
                    sb3.append(i10);
                    sb3.append(" int arguments (");
                    sb3.append(obj);
                    sb3.append(") and ");
                    sb3.append(i13);
                    sb3.append(" object arguments (");
                    sb3.append(obj2);
                    sb3.append(").");
                    SQP.A01(sb3.toString());
                    throw C00O.createAndThrow();
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0075, code lost:
    
        if (r2 == r1) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(X.C117575Ts r12) {
        /*
            Method dump skipped, instructions count: 343
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C117575Ts.A00(X.5Ts):void");
    }

    public static final void A02(C117575Ts c117575Ts) {
        C5Ti c5Ti;
        int i;
        int i2;
        String obj;
        StringBuilder sb;
        int i3;
        int i4 = c117575Ts.A00;
        if (i4 > 0) {
            int i5 = c117575Ts.A08;
            if (i5 >= 0) {
                A00(c117575Ts);
                C117485Th c117485Th = c117575Ts.A05.A00;
                c5Ti = C72074XMs.A00;
                c117485Th.A02(c5Ti);
                i = 0;
                AbstractC117665Ub.A00(c117485Th, 0, i5);
                AbstractC117665Ub.A00(c117485Th, 1, i4);
                int i6 = c117485Th.A03;
                int i7 = c5Ti.A00;
                int i8 = 0;
                if (i7 != 0) {
                    i8 = (-1) >>> (32 - i7);
                }
                if (i6 == i8) {
                    int i9 = c117485Th.A04;
                    int i10 = c5Ti.A01;
                    int i11 = 0;
                    if (i10 != 0) {
                        i11 = (-1) >>> (32 - i10);
                    }
                    if (i9 == i11) {
                        c117575Ts.A08 = -1;
                        c117575Ts.A00 = i;
                        return;
                    }
                }
                StringBuilder sb2 = new StringBuilder();
                i2 = 0;
                for (int i12 = 0; i12 < i7; i12++) {
                    if (((1 << i12) & c117485Th.A03) != 0) {
                        if (i2 > 0) {
                            sb2.append(", ");
                        }
                        sb2.append(c5Ti.A00(i12));
                        i2++;
                    }
                }
                obj = sb2.toString();
                C14360o3.A07(obj);
                sb = new StringBuilder();
                int i13 = c5Ti.A01;
                i3 = 0;
                while (i < i13) {
                    if (((1 << i) & c117485Th.A04) != 0) {
                        if (i2 > 0) {
                            sb.append(", ");
                        }
                        sb.append(c5Ti.A01(i));
                        i3++;
                    }
                    i++;
                }
                String obj2 = sb.toString();
                C14360o3.A07(obj2);
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Error while pushing ");
                sb3.append(c5Ti);
                sb3.append(". Not all arguments were provided. Missing ");
                sb3.append(i2);
                sb3.append(" int arguments (");
                sb3.append(obj);
                sb3.append(") and ");
                sb3.append(i3);
                sb3.append(" object arguments (");
                sb3.append(obj2);
                sb3.append(").");
                SQP.A01(sb3.toString());
                throw C00O.createAndThrow();
            }
            int i14 = c117575Ts.A02;
            int i15 = c117575Ts.A01;
            A00(c117575Ts);
            C117485Th c117485Th2 = c117575Ts.A05.A00;
            c5Ti = C72139XPn.A00;
            c117485Th2.A02(c5Ti);
            AbstractC117665Ub.A00(c117485Th2, 1, i14);
            i = 0;
            i2 = 0;
            AbstractC117665Ub.A00(c117485Th2, 0, i15);
            AbstractC117665Ub.A00(c117485Th2, 2, i4);
            int i16 = c117485Th2.A03;
            int i17 = c5Ti.A00;
            int i18 = 0;
            if (i17 != 0) {
                i18 = (-1) >>> (32 - i17);
            }
            if (i16 == i18) {
                int i19 = c117485Th2.A04;
                int i20 = c5Ti.A01;
                int i21 = 0;
                if (i20 != 0) {
                    i21 = (-1) >>> (32 - i20);
                }
                if (i19 == i21) {
                    c117575Ts.A01 = -1;
                    c117575Ts.A02 = -1;
                    c117575Ts.A00 = i;
                    return;
                }
            }
            StringBuilder sb4 = new StringBuilder();
            for (int i22 = 0; i22 < i17; i22++) {
                if (((1 << i22) & c117485Th2.A03) != 0) {
                    if (i2 > 0) {
                        sb4.append(", ");
                    }
                    sb4.append(c5Ti.A00(i22));
                    i2++;
                }
            }
            obj = sb4.toString();
            C14360o3.A07(obj);
            sb = new StringBuilder();
            int i23 = c5Ti.A01;
            i3 = 0;
            while (i < i23) {
                if (((1 << i) & c117485Th2.A04) != 0) {
                    if (i2 > 0) {
                        sb.append(", ");
                    }
                    sb.append(c5Ti.A01(i));
                    i3++;
                }
                i++;
            }
            String obj22 = sb.toString();
            C14360o3.A07(obj22);
            StringBuilder sb32 = new StringBuilder();
            sb32.append("Error while pushing ");
            sb32.append(c5Ti);
            sb32.append(". Not all arguments were provided. Missing ");
            sb32.append(i2);
            sb32.append(" int arguments (");
            sb32.append(obj);
            sb32.append(") and ");
            sb32.append(i3);
            sb32.append(" object arguments (");
            sb32.append(obj22);
            sb32.append(").");
            SQP.A01(sb32.toString());
            throw C00O.createAndThrow();
        }
    }

    public static final void A03(C117575Ts c117575Ts, boolean z) {
        int i;
        C117555Tq c117555Tq = c117575Ts.A09.A0B;
        if (z) {
            i = c117555Tq.A05;
        } else {
            i = c117555Tq.A01;
        }
        int i2 = i - c117575Ts.A03;
        if (i2 >= 0) {
            if (i2 > 0) {
                C117485Th c117485Th = c117575Ts.A05.A00;
                C5Z9 c5z9 = C5Z9.A00;
                c117485Th.A02(c5z9);
                AbstractC117665Ub.A00(c117485Th, 0, i2);
                int i3 = c117485Th.A03;
                int i4 = c5z9.A00;
                int i5 = 0;
                if (i4 != 0) {
                    i5 = (-1) >>> (32 - i4);
                }
                if (i3 == i5) {
                    int i6 = c117485Th.A04;
                    int i7 = c5z9.A01;
                    int i8 = 0;
                    if (i7 != 0) {
                        i8 = (-1) >>> (32 - i7);
                    }
                    if (i6 == i8) {
                        c117575Ts.A03 = i;
                        return;
                    }
                }
                StringBuilder sb = new StringBuilder();
                int i9 = 0;
                for (int i10 = 0; i10 < i4; i10++) {
                    if (((1 << i10) & c117485Th.A03) != 0) {
                        if (i9 > 0) {
                            sb.append(", ");
                        }
                        sb.append(c5z9.A00(i10));
                        i9++;
                    }
                }
                String obj = sb.toString();
                C14360o3.A07(obj);
                StringBuilder sb2 = new StringBuilder();
                int i11 = c5z9.A01;
                int i12 = 0;
                for (int i13 = 0; i13 < i11; i13++) {
                    if (((1 << i13) & c117485Th.A04) != 0) {
                        if (i9 > 0) {
                            sb2.append(", ");
                        }
                        sb2.append(c5z9.A01(i13));
                        i12++;
                    }
                }
                String obj2 = sb2.toString();
                C14360o3.A07(obj2);
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Error while pushing ");
                sb3.append(c5z9);
                sb3.append(". Not all arguments were provided. Missing ");
                sb3.append(i9);
                sb3.append(" int arguments (");
                sb3.append(obj);
                sb3.append(") and ");
                sb3.append(i12);
                sb3.append(" object arguments (");
                sb3.append(obj2);
                sb3.append(").");
                SQP.A01(sb3.toString());
            } else {
                return;
            }
        } else {
            C5UC.A03("Tried to seek backward");
        }
        throw C00O.createAndThrow();
    }

    public final void A05(int i, int i2) {
        if (i2 > 0) {
            if (i >= 0) {
                if (this.A08 == i) {
                    this.A00 += i2;
                    return;
                }
                A02(this);
                this.A08 = i;
                this.A00 = i2;
                return;
            }
            C5UC.A03(AnonymousClass001.A0O("Invalid remove index ", i));
            throw C00O.createAndThrow();
        }
    }

    public C117575Ts(C117505Tk c117505Tk, C117465Tf c117465Tf) {
        this.A09 = c117505Tk;
        this.A05 = c117465Tf;
    }

    public final void A04() {
        A02(this);
        ArrayList arrayList = this.A04.A00;
        if (!arrayList.isEmpty()) {
            arrayList.remove(arrayList.size() - 1);
        } else {
            this.A07++;
        }
    }
}
