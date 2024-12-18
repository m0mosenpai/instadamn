package X;

import com.google.protobuf.UnsafeUtil;
import java.nio.ByteBuffer;

/* renamed from: X.SbB, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC63036SbB {
    public int A00;
    public C63401SjW A01;

    public static RWK A06(byte[] bArr, int i, int i2) {
        RWK rwk = new RWK(bArr, i, i2);
        try {
            rwk.A0H(i2);
            return rwk;
        } catch (C4L5 e) {
            throw new IllegalArgumentException(e);
        }
    }

    public final double A07() {
        long A0X;
        if (this instanceof RWL) {
            A0X = ((RWL) this).A0X();
        } else if (this instanceof RWM) {
            A0X = ((RWM) this).A0X();
        } else {
            A0X = ((RWK) this).A0X();
        }
        return Double.longBitsToDouble(A0X);
    }

    public final float A08() {
        int A0V;
        if (this instanceof RWL) {
            A0V = ((RWL) this).A0V();
        } else if (this instanceof RWM) {
            A0V = ((RWM) this).A0V();
        } else {
            A0V = ((RWK) this).A0V();
        }
        return Float.intBitsToFloat(A0V);
    }

    public final int A09() {
        if (this instanceof RWL) {
            RWL rwl = (RWL) this;
            return (int) (rwl.A03 - rwl.A04);
        }
        if (this instanceof RWM) {
            RWM rwm = (RWM) this;
            return rwm.A04 + rwm.A03;
        }
        RWK rwk = (RWK) this;
        return rwk.A03 - rwk.A04;
    }

    public final int A0A() {
        if (this instanceof RWL) {
            return ((RWL) this).A0W();
        }
        if (this instanceof RWM) {
            return ((RWM) this).A0W();
        }
        return ((RWK) this).A0W();
    }

    public final int A0B() {
        if (this instanceof RWL) {
            return ((RWL) this).A0V();
        }
        if (this instanceof RWM) {
            return ((RWM) this).A0V();
        }
        return ((RWK) this).A0V();
    }

    public final int A0C() {
        if (this instanceof RWL) {
            return ((RWL) this).A0W();
        }
        if (this instanceof RWM) {
            return ((RWM) this).A0W();
        }
        return ((RWK) this).A0W();
    }

    public final int A0D() {
        if (this instanceof RWL) {
            return ((RWL) this).A0V();
        }
        if (this instanceof RWM) {
            return ((RWM) this).A0V();
        }
        return ((RWK) this).A0V();
    }

    public final int A0E() {
        if (this instanceof RWL) {
            return AbstractC58319PtB.A01(((RWL) this).A0W());
        }
        if (this instanceof RWM) {
            return AbstractC58319PtB.A01(((RWM) this).A0W());
        }
        return AbstractC58319PtB.A01(((RWK) this).A0W());
    }

    public final int A0F() {
        if (this instanceof RWL) {
            RWL rwl = (RWL) this;
            if (rwl.A0S()) {
                rwl.A01 = 0;
                return 0;
            }
            int A0W = rwl.A0W();
            rwl.A01 = A0W;
            if ((A0W >>> 3) != 0) {
                return A0W;
            }
            throw AbstractC58320PtC.A0e("Protocol message contained an invalid tag (zero).");
        }
        if (this instanceof RWM) {
            RWM rwm = (RWM) this;
            if (rwm.A0S()) {
                rwm.A02 = 0;
                return 0;
            }
            int A0W2 = rwm.A0W();
            rwm.A02 = A0W2;
            if ((A0W2 >>> 3) != 0) {
                return A0W2;
            }
            throw AbstractC58320PtC.A0e("Protocol message contained an invalid tag (zero).");
        }
        RWK rwk = (RWK) this;
        if (rwk.A0S()) {
            rwk.A01 = 0;
            return 0;
        }
        int A0W3 = rwk.A0W();
        rwk.A01 = A0W3;
        if ((A0W3 >>> 3) != 0) {
            return A0W3;
        }
        throw AbstractC58320PtC.A0e("Protocol message contained an invalid tag (zero).");
    }

    public final int A0G() {
        if (this instanceof RWL) {
            return ((RWL) this).A0W();
        }
        if (this instanceof RWM) {
            return ((RWM) this).A0W();
        }
        return ((RWK) this).A0W();
    }

    public final int A0H(int i) {
        if (this instanceof RWK) {
            RWK rwk = (RWK) this;
            if (i >= 0) {
                int i2 = i + (rwk.A03 - rwk.A04);
                if (i2 >= 0) {
                    int i3 = rwk.A00;
                    if (i2 <= i3) {
                        rwk.A00 = i2;
                        RWK.A00(rwk);
                        return i3;
                    }
                    throw C4L5.A02();
                }
                throw AbstractC58320PtC.A0e("Failed to parse the message.");
            }
            throw C4L5.A01();
        }
        if (this instanceof RWL) {
            RWL rwl = (RWL) this;
            if (i >= 0) {
                int i4 = i + ((int) (rwl.A03 - rwl.A04));
                int i5 = rwl.A00;
                if (i4 <= i5) {
                    rwl.A00 = i4;
                    RWL.A00(rwl);
                    return i5;
                }
                throw C4L5.A02();
            }
            throw C4L5.A01();
        }
        RWM rwm = (RWM) this;
        if (i >= 0) {
            int i6 = i + rwm.A04 + rwm.A03;
            int i7 = rwm.A01;
            if (i6 <= i7) {
                rwm.A01 = i6;
                RWM.A01(rwm);
                return i7;
            }
            throw C4L5.A02();
        }
        throw C4L5.A01();
    }

    public final long A0I() {
        if (this instanceof RWL) {
            return ((RWL) this).A0X();
        }
        if (this instanceof RWM) {
            return ((RWM) this).A0X();
        }
        return ((RWK) this).A0X();
    }

    public final long A0J() {
        if (this instanceof RWL) {
            return ((RWL) this).A0Y();
        }
        if (this instanceof RWM) {
            return ((RWM) this).A0Y();
        }
        return ((RWK) this).A0Y();
    }

    public final long A0K() {
        if (this instanceof RWL) {
            return ((RWL) this).A0X();
        }
        if (this instanceof RWM) {
            return ((RWM) this).A0X();
        }
        return ((RWK) this).A0X();
    }

    public final long A0L() {
        if (this instanceof RWL) {
            return AbstractC58320PtC.A07(((RWL) this).A0Y());
        }
        if (this instanceof RWM) {
            return AbstractC58320PtC.A07(((RWM) this).A0Y());
        }
        return AbstractC58320PtC.A07(((RWK) this).A0Y());
    }

    public final long A0M() {
        if (this instanceof RWL) {
            return ((RWL) this).A0Y();
        }
        if (this instanceof RWM) {
            return ((RWM) this).A0Y();
        }
        return ((RWK) this).A0Y();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.AbstractC64538TIu A0N() {
        /*
            r14 = this;
            boolean r0 = r14 instanceof X.RWL
            if (r0 == 0) goto L2a
            r4 = r14
            X.RWL r4 = (X.RWL) r4
            int r3 = r4.A0W()
            if (r3 <= 0) goto La6
            long r1 = r4.A02
            long r8 = r4.A03
            long r1 = r1 - r8
            int r0 = (int) r1
            if (r3 > r0) goto La1
            byte[] r7 = new byte[r3]
            long r12 = (long) r3
            r10 = 0
            X.Sb9 r6 = com.google.protobuf.UnsafeUtil.A02
            r6.A0I(r7, r8, r10, r12)
            long r0 = r4.A03
            long r0 = r0 + r12
            r4.A03 = r0
        L24:
            X.RWI r1 = new X.RWI
            r1.<init>(r7)
            return r1
        L2a:
            boolean r0 = r14 instanceof X.RWM
            if (r0 == 0) goto L85
            r6 = r14
            X.RWM r6 = (X.RWM) r6
            int r5 = r6.A0W()
            int r0 = r6.A00
            int r1 = r6.A03
            int r0 = r0 - r1
            if (r5 > r0) goto L4a
            if (r5 <= 0) goto L4a
            byte[] r0 = r6.A07
            X.RWI r1 = X.AbstractC64538TIu.A01(r0, r1, r5)
            int r0 = r6.A03
            int r0 = r0 + r5
            r6.A03 = r0
            return r1
        L4a:
            if (r5 == 0) goto Lad
            byte[] r2 = X.RWM.A05(r6, r5)
            if (r2 == 0) goto L59
            int r1 = r2.length
            r0 = 0
            X.RWI r1 = X.AbstractC64538TIu.A01(r2, r0, r1)
            return r1
        L59:
            int r4 = r6.A03
            int r1 = r6.A00
            int r3 = r1 - r4
            int r0 = r6.A04
            int r0 = r0 + r1
            r6.A04 = r0
            r2 = 0
            r6.A03 = r2
            r6.A00 = r2
            int r0 = r5 - r3
            java.util.ArrayList r1 = X.RWM.A00(r6, r0)
            byte[] r7 = new byte[r5]
            byte[] r0 = r6.A07
            java.lang.System.arraycopy(r0, r4, r7, r2, r3)
            java.util.Iterator r1 = r1.iterator()
        L7a:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L24
            int r3 = X.AbstractC58320PtC.A00(r7, r1, r3)
            goto L7a
        L85:
            r2 = r14
            X.RWK r2 = (X.RWK) r2
            int r3 = r2.A0W()
            if (r3 <= 0) goto La6
            int r0 = r2.A02
            int r1 = r2.A03
            int r0 = r0 - r1
            if (r3 > r0) goto La1
            byte[] r0 = r2.A06
            X.RWI r1 = X.AbstractC64538TIu.A01(r0, r1, r3)
            int r0 = r2.A03
            int r0 = r0 + r3
            r2.A03 = r0
            return r1
        La1:
            X.4L5 r0 = X.C4L5.A02()
            throw r0
        La6:
            if (r3 == 0) goto Lad
            X.4L5 r0 = X.C4L5.A01()
            throw r0
        Lad:
            X.TIu r1 = X.AbstractC64538TIu.A01
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC63036SbB.A0N():X.TIu");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0074 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String A0O() {
        /*
            r12 = this;
            boolean r0 = r12 instanceof X.RWL
            if (r0 == 0) goto L2b
            r3 = r12
            X.RWL r3 = (X.RWL) r3
            int r4 = r3.A0W()
            if (r4 <= 0) goto L6b
            long r1 = r3.A02
            long r6 = r3.A03
            long r1 = r1 - r6
            int r0 = (int) r1
            if (r4 > r0) goto L89
            byte[] r5 = new byte[r4]
            long r10 = (long) r4
            r8 = 0
            X.Sb9 r4 = com.google.protobuf.UnsafeUtil.A02
            r4.A0I(r5, r6, r8, r10)
            java.nio.charset.Charset r0 = X.SVB.A04
            java.lang.String r2 = X.AbstractC58318PtA.A0m(r0, r5)
            long r0 = r3.A03
            long r0 = r0 + r10
            r3.A03 = r0
            return r2
        L2b:
            boolean r0 = r12 instanceof X.RWM
            if (r0 == 0) goto L4d
            r4 = r12
            X.RWM r4 = (X.RWM) r4
            int r3 = r4.A0W()
            if (r3 <= 0) goto L72
            int r0 = r4.A00
            int r2 = r4.A03
            int r0 = r0 - r2
            if (r3 > r0) goto L77
            byte[] r1 = r4.A07
            java.nio.charset.Charset r0 = X.SVB.A04
            java.lang.String r2 = X.AbstractC58318PtA.A0n(r0, r1, r2, r3)
        L47:
            int r0 = r4.A03
            int r0 = r0 + r3
            r4.A03 = r0
            return r2
        L4d:
            r3 = r12
            X.RWK r3 = (X.RWK) r3
            int r4 = r3.A0W()
            if (r4 <= 0) goto L6b
            int r0 = r3.A02
            int r2 = r3.A03
            int r0 = r0 - r2
            if (r4 > r0) goto L89
            byte[] r1 = r3.A06
            java.nio.charset.Charset r0 = X.SVB.A04
            java.lang.String r2 = X.AbstractC58318PtA.A0n(r0, r1, r2, r4)
            int r0 = r3.A03
            int r0 = r0 + r4
            r3.A03 = r0
            return r2
        L6b:
            if (r4 == 0) goto L74
            X.4L5 r0 = X.C4L5.A01()
            throw r0
        L72:
            if (r3 != 0) goto L77
        L74:
            java.lang.String r2 = ""
            return r2
        L77:
            int r0 = r4.A00
            if (r3 > r0) goto L8e
            X.RWM.A02(r4, r3)
            byte[] r2 = r4.A07
            int r1 = r4.A03
            java.nio.charset.Charset r0 = X.SVB.A04
            java.lang.String r2 = X.AbstractC58318PtA.A0n(r0, r2, r1, r3)
            goto L47
        L89:
            X.4L5 r0 = X.C4L5.A02()
            throw r0
        L8e:
            byte[] r1 = X.RWM.A04(r4, r3)
            java.nio.charset.Charset r0 = X.SVB.A04
            java.lang.String r2 = X.AbstractC58318PtA.A0m(r0, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC63036SbB.A0O():java.lang.String");
    }

    public final String A0P() {
        byte[] A04;
        String A01;
        byte A012;
        byte A013;
        if (this instanceof RWL) {
            RWL rwl = (RWL) this;
            int A0W = rwl.A0W();
            if (A0W > 0) {
                long j = rwl.A02;
                long j2 = rwl.A03;
                if (A0W <= ((int) (j - j2))) {
                    int i = (int) (j2 - rwl.A06);
                    ByteBuffer byteBuffer = rwl.A07;
                    SOG sog = SU7.A00;
                    if (byteBuffer.hasArray()) {
                        A01 = sog.A04(byteBuffer.array(), byteBuffer.arrayOffset() + i, A0W);
                    } else {
                        if (byteBuffer.isDirect() && (sog instanceof RYw)) {
                            if ((i | A0W | ((byteBuffer.limit() - i) - A0W)) >= 0) {
                                AbstractC63034Sb9 abstractC63034Sb9 = UnsafeUtil.A02;
                                long A07 = abstractC63034Sb9.A07(byteBuffer, UnsafeUtil.A00) + i;
                                long j3 = A0W + A07;
                                char[] cArr = new char[A0W];
                                int i2 = 0;
                                while (A07 < j3 && (A013 = abstractC63034Sb9.A01(A07)) >= 0) {
                                    A07++;
                                    cArr[i2] = (char) A013;
                                    i2++;
                                }
                                loop1: while (true) {
                                    int i3 = i2;
                                    while (A07 < j3) {
                                        long j4 = A07 + 1;
                                        byte A014 = abstractC63034Sb9.A01(A07);
                                        if (A014 >= 0) {
                                            i2++;
                                            cArr[i3] = (char) A014;
                                            while (j4 < j3 && (A012 = abstractC63034Sb9.A01(j4)) >= 0) {
                                                j4++;
                                                cArr[i2] = (char) A012;
                                                i2++;
                                            }
                                            i3 = i2;
                                            A07 = j4;
                                        } else if (A014 < -32) {
                                            if (j4 >= j3) {
                                                break;
                                            }
                                            A07 = j4 + 1;
                                            i2++;
                                            AbstractC63076Sby.A02(cArr, A014, abstractC63034Sb9.A01(j4), i3);
                                        } else if (A014 < -16) {
                                            if (j4 >= j3 - 1) {
                                                break;
                                            }
                                            long j5 = j4 + 1;
                                            A07 = j5 + 1;
                                            i2++;
                                            AbstractC63076Sby.A01(cArr, A014, abstractC63034Sb9.A01(j4), abstractC63034Sb9.A01(j5), i3);
                                        } else {
                                            if (j4 >= j3 - 2) {
                                                break;
                                            }
                                            long j6 = j4 + 1;
                                            byte A015 = abstractC63034Sb9.A01(j4);
                                            long j7 = j6 + 1;
                                            byte A016 = abstractC63034Sb9.A01(j6);
                                            A07 = j7 + 1;
                                            AbstractC63076Sby.A00(cArr, A014, A015, A016, abstractC63034Sb9.A01(j7), i2);
                                            i2 = i2 + 1 + 1;
                                        }
                                    }
                                    A01 = new String(cArr, 0, i2);
                                    break loop1;
                                }
                                throw AbstractC58320PtC.A0e("Protocol message had invalid UTF-8.");
                            }
                            throw AbstractC58319PtB.A0f("buffer limit=%d, index=%d, limit=%d", AbstractC58320PtC.A1a(Integer.valueOf(byteBuffer.limit()), i, A0W));
                        }
                        A01 = SOG.A01(byteBuffer, i, A0W);
                    }
                    rwl.A03 += A0W;
                    return A01;
                }
                throw C4L5.A02();
            }
            if (A0W == 0) {
                return "";
            }
            throw C4L5.A01();
        }
        if (this instanceof RWM) {
            RWM rwm = (RWM) this;
            int A0W2 = rwm.A0W();
            int i4 = rwm.A03;
            int i5 = rwm.A00;
            if (A0W2 <= i5 - i4 && A0W2 > 0) {
                A04 = rwm.A07;
                rwm.A03 = i4 + A0W2;
            } else if (A0W2 != 0) {
                if (A0W2 <= i5) {
                    RWM.A02(rwm, A0W2);
                    A04 = rwm.A07;
                    rwm.A03 = A0W2;
                } else {
                    A04 = RWM.A04(rwm, A0W2);
                }
                i4 = 0;
            } else {
                return "";
            }
            return SU7.A00.A04(A04, i4, A0W2);
        }
        RWK rwk = (RWK) this;
        int A0W3 = rwk.A0W();
        if (A0W3 > 0) {
            int i6 = rwk.A02;
            int i7 = rwk.A03;
            if (A0W3 <= i6 - i7) {
                String A042 = SU7.A00.A04(rwk.A06, i7, A0W3);
                rwk.A03 += A0W3;
                return A042;
            }
            throw C4L5.A02();
        }
        if (A0W3 == 0) {
            return "";
        }
        throw C4L5.A01();
    }

    public final void A0Q(int i) {
        if (this instanceof RWL) {
            if (((RWL) this).A01 != i) {
                throw AbstractC58320PtC.A0e("Protocol message end-group tag did not match expected tag.");
            }
        } else if (this instanceof RWM) {
            if (((RWM) this).A02 != i) {
                throw AbstractC58320PtC.A0e("Protocol message end-group tag did not match expected tag.");
            }
        } else if (((RWK) this).A01 != i) {
            throw AbstractC58320PtC.A0e("Protocol message end-group tag did not match expected tag.");
        }
    }

    public final void A0R(int i) {
        if (this instanceof RWL) {
            RWL rwl = (RWL) this;
            rwl.A00 = i;
            RWL.A00(rwl);
        } else if (this instanceof RWM) {
            RWM rwm = (RWM) this;
            rwm.A01 = i;
            RWM.A01(rwm);
        } else {
            RWK rwk = (RWK) this;
            rwk.A00 = i;
            RWK.A00(rwk);
        }
    }

    public final boolean A0S() {
        if (this instanceof RWL) {
            RWL rwl = (RWL) this;
            return AbstractC167007dF.A1N((rwl.A03 > rwl.A02 ? 1 : (rwl.A03 == rwl.A02 ? 0 : -1)));
        }
        if (this instanceof RWM) {
            RWM rwm = (RWM) this;
            if (rwm.A03 == rwm.A00 && !RWM.A03(rwm, 1)) {
                return true;
            }
            return false;
        }
        RWK rwk = (RWK) this;
        return AbstractC167007dF.A1P(rwk.A03, rwk.A02);
    }

    public final boolean A0T() {
        if (this instanceof RWL) {
            return AbstractC167007dF.A1M((((RWL) this).A0Y() > 0L ? 1 : (((RWL) this).A0Y() == 0L ? 0 : -1)));
        }
        if (this instanceof RWM) {
            return AbstractC167007dF.A1M((((RWM) this).A0Y() > 0L ? 1 : (((RWM) this).A0Y() == 0L ? 0 : -1)));
        }
        return AbstractC167007dF.A1M((((RWK) this).A0Y() > 0L ? 1 : (((RWK) this).A0Y() == 0L ? 0 : -1)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x00bd, code lost:
    
        r1 = r5.A07;
        r0 = r5.A03;
        r2 = r0 + 1;
        r5.A03 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x00c7, code lost:
    
        if (r1[r0] >= 0) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x00c9, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x00cb, code lost:
    
        if (r3 < 10) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x00d3, code lost:
    
        throw X.AbstractC58320PtC.A0e("CodedInputStream encountered a malformed varint.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x00e8, code lost:
    
        if (r1 == 5) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0018, code lost:
    
        if (r2 == 5) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x00f9, code lost:
    
        if (r2 >= 0) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0109, code lost:
    
        if ((r5 - r2) >= 10) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x010b, code lost:
    
        r2 = r6.A06;
        r0 = r1;
        r1 = r1 + 1;
        r6.A03 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0114, code lost:
    
        if (r2[r0] >= 0) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0116, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0118, code lost:
    
        if (r3 < 10) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0120, code lost:
    
        throw X.AbstractC58320PtC.A0e("CodedInputStream encountered a malformed varint.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0121, code lost:
    
        r1 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0122, code lost:
    
        if (r2 == r5) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0124, code lost:
    
        r0 = r6.A06;
        r2 = r2 + 1;
        r6.A03 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x012c, code lost:
    
        if (r0[r1] >= 0) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x012e, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0130, code lost:
    
        if (r3 < 10) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0138, code lost:
    
        throw X.AbstractC58320PtC.A0e("CodedInputStream encountered a malformed varint.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x016b, code lost:
    
        throw X.C4L5.A00();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x002b, code lost:
    
        if (r1 >= 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0188, code lost:
    
        throw X.C4L5.A01();
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x003a, code lost:
    
        if (((int) (r5.A02 - r5.A03)) >= 10) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x003c, code lost:
    
        r2 = r5.A03;
        r5.A03 = 1 + r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0049, code lost:
    
        if (com.google.protobuf.UnsafeUtil.A02.A01(r2) >= 0) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x004b, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x004d, code lost:
    
        if (r4 < 10) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0055, code lost:
    
        throw X.AbstractC58320PtC.A0e("CodedInputStream encountered a malformed varint.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0056, code lost:
    
        r2 = r5.A03;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x005c, code lost:
    
        if (r2 == r5.A02) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x005e, code lost:
    
        r5.A03 = 1 + r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0069, code lost:
    
        if (com.google.protobuf.UnsafeUtil.A02.A01(r2) >= 0) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x006b, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x006d, code lost:
    
        if (r4 < 10) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0075, code lost:
    
        throw X.AbstractC58320PtC.A0e("CodedInputStream encountered a malformed varint.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x009e, code lost:
    
        if ((r0 - r2) >= 10) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x00a0, code lost:
    
        r2 = r5.A07;
        r0 = r1;
        r1 = r1 + 1;
        r5.A03 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x00a9, code lost:
    
        if (r2[r0] >= 0) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x00ab, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x00ad, code lost:
    
        if (r3 < 10) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x00b5, code lost:
    
        throw X.AbstractC58320PtC.A0e("CodedInputStream encountered a malformed varint.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x00b8, code lost:
    
        if (r2 != r5.A00) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x00ba, code lost:
    
        X.RWM.A02(r5, 1);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [X.SbB, X.RWM] */
    /* JADX WARN: Type inference failed for: r5v3, types: [X.SbB] */
    /* JADX WARN: Type inference failed for: r5v5, types: [X.SbB, X.RWL] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A0U(int r11) {
        /*
            Method dump skipped, instructions count: 398
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC63036SbB.A0U(int):boolean");
    }
}
