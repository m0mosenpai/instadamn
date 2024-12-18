package X;

import java.util.Arrays;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;

/* renamed from: X.3T7, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C3T7 implements C3T8, Decoder {
    @Override // kotlinx.serialization.encoding.Decoder
    public byte ANt() {
        C3T3 c3t3 = ((C3T6) this).A04;
        long A07 = c3t3.A07();
        byte b = (byte) A07;
        if (A07 == b) {
            return b;
        }
        c3t3.A0F(AnonymousClass001.A0K("Failed to parse byte for input '", '\'', A07), "", c3t3.A00);
        throw C00O.createAndThrow();
    }

    @Override // X.C3T8
    public final Decoder AO7(SerialDescriptor serialDescriptor, int i) {
        C14360o3.A0B(serialDescriptor, 0);
        return AO6(serialDescriptor.B0r(i));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public int AO8() {
        C3T3 c3t3 = ((C3T6) this).A04;
        long A07 = c3t3.A07();
        int i = (int) A07;
        if (A07 == i) {
            return i;
        }
        c3t3.A0F(AnonymousClass001.A0K("Failed to parse int for input '", '\'', A07), "", c3t3.A00);
        throw C00O.createAndThrow();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public long AOB() {
        return ((C3T6) this).A04.A07();
    }

    @Override // X.C3T8
    public final Object AOE(Object obj, C3RB c3rb, SerialDescriptor serialDescriptor, int i) {
        C14360o3.A0B(c3rb, 2);
        if (!c3rb.getDescriptor().CZW() && !AOD()) {
            return null;
        }
        return AOG(c3rb);
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public short AOH() {
        C3T3 c3t3 = ((C3T6) this).A04;
        long A07 = c3t3.A07();
        short s = (short) A07;
        if (A07 == s) {
            return s;
        }
        c3t3.A0F(AnonymousClass001.A0K("Failed to parse short for input '", '\'', A07), "", c3t3.A00);
        throw C00O.createAndThrow();
    }

    public final void A00() {
        StringBuilder sb = new StringBuilder();
        sb.append(new C0YZ(getClass()));
        sb.append(" can't retrieve untyped values");
        throw new IllegalArgumentException(sb.toString());
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final C3T8 ADQ(SerialDescriptor serialDescriptor) {
        if (this instanceof C3T6) {
            C3T6 c3t6 = (C3T6) this;
            C14360o3.A0B(serialDescriptor, 0);
            AbstractC73763Sg abstractC73763Sg = c3t6.A02;
            C3T5 A01 = C3TC.A01(serialDescriptor, abstractC73763Sg);
            C3T3 c3t3 = c3t6.A04;
            C3T4 c3t4 = c3t3.A03;
            int i = c3t4.A00 + 1;
            c3t4.A00 = i;
            Object[] objArr = c3t4.A02;
            if (i == objArr.length) {
                int i2 = i * 2;
                Object[] copyOf = Arrays.copyOf(objArr, i2);
                C14360o3.A07(copyOf);
                c3t4.A02 = copyOf;
                int[] copyOf2 = Arrays.copyOf(c3t4.A01, i2);
                C14360o3.A07(copyOf2);
                c3t4.A01 = copyOf2;
            }
            c3t4.A02[i] = serialDescriptor;
            c3t3.A0E(A01.A00);
            if (c3t3.A04() != 4) {
                int ordinal = A01.ordinal();
                if (ordinal != 1 && ordinal != 2 && ordinal != 3 && c3t6.A06 == A01 && abstractC73763Sg.A00.A0A) {
                    return c3t6;
                }
                return new C3T6(serialDescriptor, abstractC73763Sg, c3t3, c3t6.A01, A01);
            }
            c3t3.A0F(AbstractC111324zv.A00(161), "", c3t3.A00);
            throw C00O.createAndThrow();
        }
        return this;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final boolean ANr() {
        String str;
        boolean z;
        if (this instanceof C3T6) {
            C3T3 c3t3 = ((C3T6) this).A04;
            int A06 = c3t3.A06();
            String str2 = ((C3T2) c3t3).A00;
            int length = str2.length();
            if (A06 != length) {
                boolean z2 = false;
                if (str2.charAt(A06) == '\"') {
                    A06++;
                    z2 = true;
                }
                if (A06 >= length) {
                    A06 = -1;
                }
                if (A06 < length && A06 != -1) {
                    int i = A06 + 1;
                    int charAt = str2.charAt(A06) | ' ';
                    if (charAt != 102) {
                        if (charAt == 116) {
                            C3T3.A02("rue", c3t3, i);
                            z = true;
                        } else {
                            str = AnonymousClass001.A0S("Expected valid boolean literal prefix, but had '", c3t3.A0A(), '\'');
                            c3t3.A0F(str, "", c3t3.A00);
                        }
                    } else {
                        C3T3.A02("alse", c3t3, i);
                        z = false;
                    }
                    if (z2) {
                        int i2 = c3t3.A00;
                        if (i2 != length) {
                            if (str2.charAt(i2) == '\"') {
                                c3t3.A00++;
                            } else {
                                str = "Expected closing quotation mark";
                                c3t3.A0F(str, "", c3t3.A00);
                            }
                        }
                    }
                    return z;
                }
            }
            str = "EOF";
            c3t3.A0F(str, "", c3t3.A00);
        } else {
            A00();
        }
        throw C00O.createAndThrow();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final char ANv() {
        if (this instanceof C3T6) {
            C3T3 c3t3 = ((C3T6) this).A04;
            String A0A = c3t3.A0A();
            if (A0A.length() == 1) {
                return A0A.charAt(0);
            }
            c3t3.A0F(AnonymousClass001.A0S("Expected single char, but got '", A0A, '\''), "", c3t3.A00);
        } else {
            A00();
        }
        throw C00O.createAndThrow();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final double ANx() {
        if (this instanceof C3T6) {
            C3T6 c3t6 = (C3T6) this;
            C3T3 c3t3 = c3t6.A04;
            String A0A = c3t3.A0A();
            try {
                double parseDouble = Double.parseDouble(A0A);
                if (c3t6.A02.A00.A04 || (!Double.isInfinite(parseDouble) && !Double.isNaN(parseDouble))) {
                    return parseDouble;
                }
                WG2.A05(Double.valueOf(parseDouble), c3t3);
            } catch (IllegalArgumentException unused) {
                c3t3.A0F(AnonymousClass001.A0v(AbstractC111324zv.A00(1629), "double", "' for input '", A0A, '\''), "", c3t3.A00);
                throw C00O.createAndThrow();
            }
        } else {
            A00();
        }
        throw C00O.createAndThrow();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final int AO0(SerialDescriptor serialDescriptor) {
        if (this instanceof C3T6) {
            C3T6 c3t6 = (C3T6) this;
            C14360o3.A0B(serialDescriptor, 0);
            return C3TL.A00(c3t6.AOJ(), AnonymousClass001.A0R(" at path ", c3t6.A04.A03.A00()), serialDescriptor, c3t6.A02);
        }
        A00();
        throw C00O.createAndThrow();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final float AO1() {
        if (this instanceof C3T6) {
            C3T6 c3t6 = (C3T6) this;
            C3T3 c3t3 = c3t6.A04;
            String A0A = c3t3.A0A();
            try {
                float parseFloat = Float.parseFloat(A0A);
                if (c3t6.A02.A00.A04 || (!Float.isInfinite(parseFloat) && !Float.isNaN(parseFloat))) {
                    return parseFloat;
                }
                WG2.A05(Float.valueOf(parseFloat), c3t3);
            } catch (IllegalArgumentException unused) {
                c3t3.A0F(AnonymousClass001.A0v(AbstractC111324zv.A00(1629), "float", "' for input '", A0A, '\''), "", c3t3.A00);
                throw C00O.createAndThrow();
            }
        } else {
            A00();
        }
        throw C00O.createAndThrow();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final Decoder AO6(SerialDescriptor serialDescriptor) {
        if (this instanceof C3T6) {
            C3T6 c3t6 = (C3T6) this;
            C14360o3.A0B(serialDescriptor, 0);
            java.util.Set set = AbstractC22806A3z.A00;
            if (serialDescriptor.isInline() && AbstractC22806A3z.A00.contains(serialDescriptor)) {
                return new X6N(c3t6.A02, c3t6.A04);
            }
            return c3t6;
        }
        return this;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final boolean AOD() {
        C3T6 c3t6;
        C5d6 c5d6;
        if ((this instanceof C3T6) && (((c5d6 = (c3t6 = (C3T6) this).A05) != null && c5d6.A00) || c3t6.A04.A0I(true))) {
            return false;
        }
        return true;
    }

    @Override // X.C3T8
    public final Object AOF(Object obj, C3RB c3rb, SerialDescriptor serialDescriptor, int i) {
        boolean z;
        if (this instanceof C3T6) {
            C3T6 c3t6 = (C3T6) this;
            C14360o3.A0B(serialDescriptor, 0);
            C14360o3.A0B(c3rb, 2);
            if (c3t6.A06 == C3T5.A05 && (i & 1) == 0) {
                z = true;
                C3T4 c3t4 = c3t6.A04.A03;
                int[] iArr = c3t4.A01;
                int i2 = c3t4.A00;
                if (iArr[i2] == -2) {
                    c3t4.A02[i2] = C3TP.A00;
                }
            } else {
                z = false;
            }
            Object AOG = c3t6.AOG(c3rb);
            if (z) {
                C3T4 c3t42 = c3t6.A04.A03;
                int[] iArr2 = c3t42.A01;
                int i3 = c3t42.A00;
                if (iArr2[i3] != -2) {
                    int i4 = i3 + 1;
                    c3t42.A00 = i4;
                    Object[] objArr = c3t42.A02;
                    if (i4 == objArr.length) {
                        int i5 = i4 * 2;
                        Object[] copyOf = Arrays.copyOf(objArr, i5);
                        C14360o3.A07(copyOf);
                        c3t42.A02 = copyOf;
                        iArr2 = Arrays.copyOf(c3t42.A01, i5);
                        C14360o3.A07(iArr2);
                        c3t42.A01 = iArr2;
                    }
                }
                Object[] objArr2 = c3t42.A02;
                int i6 = c3t42.A00;
                objArr2[i6] = AOG;
                iArr2[i6] = -2;
            }
            return AOG;
        }
        C14360o3.A0B(c3rb, 2);
        return AOG(c3rb);
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0160  */
    /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, X.5d5] */
    @Override // kotlinx.serialization.encoding.Decoder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object AOG(X.C3RB r17) {
        /*
            Method dump skipped, instructions count: 383
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3T7.AOG(X.3RB):java.lang.Object");
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final String AOJ() {
        if (this instanceof C3T6) {
            C3T6 c3t6 = (C3T6) this;
            boolean z = c3t6.A03.A0C;
            C3T3 c3t3 = c3t6.A04;
            if (z) {
                return c3t3.A0B();
            }
            return c3t3.A09();
        }
        A00();
        throw C00O.createAndThrow();
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0017, code lost:
    
        if (r7.B10() == 0) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
    
        if (r3.ANz(r7) != (-1)) goto L23;
     */
    @Override // X.C3T8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ASc(kotlinx.serialization.descriptors.SerialDescriptor r7) {
        /*
            r6 = this;
            boolean r0 = r6 instanceof X.C3T6
            if (r0 == 0) goto L55
            r3 = r6
            X.3T6 r3 = (X.C3T6) r3
            r0 = 0
            X.C14360o3.A0B(r7, r0)
            X.3Sg r0 = r3.A02
            X.3Si r2 = r0.A00
            boolean r0 = r2.A0B
            if (r0 == 0) goto L20
            int r0 = r7.B10()
            if (r0 != 0) goto L20
        L19:
            int r1 = r3.ANz(r7)
            r0 = -1
            if (r1 != r0) goto L19
        L20:
            X.3T3 r1 = r3.A04
            boolean r0 = r1.A0H()
            if (r0 == 0) goto L36
            boolean r0 = r2.A06
            if (r0 != 0) goto L36
            java.lang.String r0 = ""
            X.WG2.A06(r0, r1)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L36:
            X.3T5 r0 = r3.A06
            char r0 = r0.A01
            r1.A0E(r0)
            X.3T4 r5 = r1.A03
            int r4 = r5.A00
            int[] r3 = r5.A01
            r2 = r3[r4]
            r1 = -1
            r0 = -2
            if (r2 != r0) goto L4f
            r3[r4] = r1
            int r4 = r4 + (-1)
            r5.A00 = r4
        L4f:
            if (r4 == r1) goto L55
            int r0 = r4 + (-1)
            r5.A00 = r0
        L55:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3T7.ASc(kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    @Override // X.C3T8
    public final boolean ANs(SerialDescriptor serialDescriptor, int i) {
        return ANr();
    }

    @Override // X.C3T8
    public final byte ANu(SerialDescriptor serialDescriptor, int i) {
        return ANt();
    }

    @Override // X.C3T8
    public final char ANw(SerialDescriptor serialDescriptor, int i) {
        return ANv();
    }

    @Override // X.C3T8
    public final double ANy(SerialDescriptor serialDescriptor, int i) {
        return ANx();
    }

    @Override // X.C3T8
    public final float AO2(SerialDescriptor serialDescriptor, int i) {
        return AO1();
    }

    @Override // X.C3T8
    public final int AO9(SerialDescriptor serialDescriptor, int i) {
        return AO8();
    }

    @Override // X.C3T8
    public final long AOC(SerialDescriptor serialDescriptor, int i) {
        return AOB();
    }

    @Override // X.C3T8
    public final short AOI(SerialDescriptor serialDescriptor, int i) {
        return AOH();
    }

    @Override // X.C3T8
    public final String AOK(SerialDescriptor serialDescriptor, int i) {
        return AOJ();
    }
}
