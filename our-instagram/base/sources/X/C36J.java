package X;

/* renamed from: X.36J, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C36J implements Comparable {
    public static final long A01 = (4611686018427387903L << 1) + 1;
    public static final long A02 = ((-4611686018427387903L) << 1) + 1;
    public final long A00;

    public static final long A03(long j) {
        if ((((int) j) & 1) == 1 && (!A09(j))) {
            return j >> 1;
        }
        return A06(C36G.A06, j);
    }

    public static final long A04(long j, long j2) {
        return A05(j, ((-(j2 >> 1)) << 1) + (((int) j2) & 1));
    }

    public static final double A00(C36G c36g, long j) {
        C36G c36g2;
        if (j == A01) {
            return Double.POSITIVE_INFINITY;
        }
        if (j == A02) {
            return Double.NEGATIVE_INFINITY;
        }
        double d = j >> 1;
        if ((((int) j) & 1) == 0) {
            c36g2 = C36G.A08;
        } else {
            c36g2 = C36G.A06;
        }
        return C36I.A00(c36g2, c36g, d);
    }

    public static int A02(long j, long j2) {
        long j3 = j ^ j2;
        if (j3 >= 0 && (((int) j3) & 1) != 0) {
            int i = (((int) j) & 1) - (((int) j2) & 1);
            if (j < 0) {
                return -i;
            }
            return i;
        }
        return C14360o3.A01(j, j2);
    }

    public static final long A06(C36G c36g, long j) {
        C36G c36g2;
        if (j == A01) {
            return Long.MAX_VALUE;
        }
        if (j == A02) {
            return Long.MIN_VALUE;
        }
        long j2 = j >> 1;
        if ((((int) j) & 1) == 0) {
            c36g2 = C36G.A08;
        } else {
            c36g2 = C36G.A06;
        }
        return c36g.A00.convert(j2, c36g2.A00);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0068, code lost:
    
        if (r4 != 0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x007e, code lost:
    
        if (r5 == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0096, code lost:
    
        if (r10 == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00aa, code lost:
    
        r2 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00ac, code lost:
    
        if (r0 <= 0) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00ae, code lost:
    
        r14.append(' ');
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00b1, code lost:
    
        if (r15 != 0) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00b3, code lost:
    
        if (r10 != false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00b5, code lost:
    
        if (r7 != false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00b7, code lost:
    
        if (r6 != false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00bc, code lost:
    
        if (r4 < 1000000) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00be, code lost:
    
        r15 = r4 / com.facebook.common.dextricks.DexStore.MS_IN_NS;
        r4 = r4 % com.facebook.common.dextricks.DexStore.MS_IN_NS;
        r17 = 6;
        r18 = false;
        r13 = "ms";
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00c7, code lost:
    
        A08(r13, r14, r15, r4, r17, r18);
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00cc, code lost:
    
        r0 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00e5, code lost:
    
        if (r4 < 1000) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00e7, code lost:
    
        r15 = r4 / 1000;
        r4 = r4 % 1000;
        r17 = 3;
        r18 = false;
        r13 = "us";
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00f2, code lost:
    
        r14.append(r4);
        r14.append("ns");
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00fb, code lost:
    
        r17 = 9;
        r13 = "s";
        r18 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00a8, code lost:
    
        if (r5 == false) goto L75;
     */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String A07(long r17) {
        /*
            Method dump skipped, instructions count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C36J.A07(long):java.lang.String");
    }

    public static final boolean A09(long j) {
        if (j != A01 && j != A02) {
            return false;
        }
        return true;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return A02(this.A00, ((C36J) obj).A00);
    }

    public final boolean equals(Object obj) {
        long j = this.A00;
        if (!(obj instanceof C36J) || j != ((C36J) obj).A00) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j = this.A00;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        return A07(this.A00);
    }

    public /* synthetic */ C36J(long j) {
        this.A00 = j;
    }

    public static final int A01(long j) {
        long j2;
        if (A09(j)) {
            return 0;
        }
        boolean z = true;
        if ((((int) j) & 1) != 1) {
            z = false;
        }
        long j3 = j >> 1;
        if (z) {
            j2 = (j3 % 1000) * 1000000;
        } else {
            j2 = j3 % 1000000000;
        }
        return (int) j2;
    }

    public static final long A05(long j, long j2) {
        long j3;
        long j4;
        long A06;
        if (A09(j)) {
            if (!(!A09(j2)) && (j2 ^ j) < 0) {
                throw new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
            }
            return j;
        }
        if (A09(j2)) {
            return j2;
        }
        int i = ((int) j) & 1;
        if (i == (((int) j2) & 1)) {
            long j5 = (j >> 1) + (j2 >> 1);
            if (i == 0) {
                if (-4611686018426999999L <= j5 && j5 < 4611686018427000000L) {
                    return j5 << 1;
                }
                A06 = j5 / 1000000;
            } else {
                return C36H.A00(j5);
            }
        } else {
            if (i == 1) {
                j3 = j >> 1;
                j4 = j2 >> 1;
            } else {
                j3 = j2 >> 1;
                j4 = j >> 1;
            }
            long j6 = j4 / 1000000;
            long j7 = j3 + j6;
            if (-4611686018426L <= j7 && j7 < 4611686018427L) {
                return ((j7 * 1000000) + (j4 - (j6 * 1000000))) << 1;
            }
            A06 = C17s.A06(j7, -4611686018427387903L, 4611686018427387903L);
        }
        return (A06 << 1) + 1;
    }

    public static final void A08(String str, StringBuilder sb, int i, int i2, int i3, boolean z) {
        sb.append(i);
        if (i2 != 0) {
            sb.append('.');
            String A0H = AbstractC001900j.A0H(String.valueOf(i2), i3);
            int i4 = -1;
            int length = A0H.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i5 = length - 1;
                    if (A0H.charAt(length) != '0') {
                        i4 = length;
                        break;
                    } else if (i5 < 0) {
                        break;
                    } else {
                        length = i5;
                    }
                }
            }
            int i6 = i4 + 1;
            if (z || i6 >= 3) {
                i6 = ((i6 + 2) / 3) * 3;
            }
            sb.append((CharSequence) A0H, 0, i6);
        }
        sb.append(str);
    }
}
