package X;

import java.math.BigDecimal;
import java.util.Arrays;

/* renamed from: X.SdY, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63128SdY {
    public final char[] A00;

    private BigDecimal A00(int i, int i2, int i3, int i4) {
        if (i2 > i4) {
            int i5 = i2 / 2;
            return A00(i, i5, (i3 + i2) - i5, i4).add(A00(i + i5, i2 - i5, i3, i4));
        }
        if (i2 == 0) {
            return BigDecimal.ZERO;
        }
        return new BigDecimal(this.A00, i, i2).movePointRight(i3);
    }

    public static BigDecimal A01(char[] cArr) {
        String A06;
        int i;
        int i2;
        BigDecimal A00;
        int length = cArr.length;
        try {
            if (length < 500) {
                return new BigDecimal(cArr);
            }
            C63128SdY c63128SdY = new C63128SdY(cArr);
            int i3 = length / 10;
            char[] cArr2 = c63128SdY.A00;
            int length2 = cArr2.length;
            int i4 = -1;
            int i5 = 0;
            int i6 = -1;
            boolean z = false;
            boolean z2 = false;
            int i7 = 0;
            boolean z3 = false;
            for (int i8 = 0; i8 < length2; i8++) {
                char c = cArr2[i8];
                if (c == '+') {
                    if (i4 >= 0) {
                        if (z2) {
                            throw new NumberFormatException("Multiple signs in exponent");
                        }
                        z2 = true;
                    } else if (!z) {
                        i7 = i8 + 1;
                        z = true;
                    } else {
                        throw new NumberFormatException("Multiple signs in number");
                    }
                } else if (c != 'E' && c != 'e') {
                    if (c != '-') {
                        if (c != '.') {
                            if (i6 >= 0 && i4 == -1) {
                                i5++;
                            }
                        } else if (i6 < 0) {
                            i6 = i8;
                        } else {
                            throw new NumberFormatException("Multiple decimal points");
                        }
                    } else if (i4 >= 0) {
                        if (z2) {
                            throw new NumberFormatException("Multiple signs in exponent");
                        }
                        z2 = true;
                    } else if (!z) {
                        i7 = i8 + 1;
                        z = true;
                        z3 = true;
                    } else {
                        throw new NumberFormatException("Multiple signs in number");
                    }
                } else if (i4 < 0) {
                    i4 = i8;
                } else {
                    throw new NumberFormatException("Multiple exponent markers");
                }
            }
            if (i4 >= 0) {
                i = 1;
                i2 = Integer.parseInt(new String(cArr2, i4 + 1, (length2 - i4) - 1));
                long j = i2;
                long j2 = i5 - j;
                if (j2 <= 2147483647L && j2 >= -2147483648L) {
                    i5 = (int) j2;
                    length2 = i4;
                } else {
                    StringBuilder A1C = AbstractC166987dD.A1C();
                    A1C.append("Scale out of range: ");
                    A1C.append(j2);
                    A1C.append(" while adjusting scale ");
                    A1C.append(i5);
                    throw new NumberFormatException(AbstractC58320PtC.A13(" to exponent ", A1C, j));
                }
            } else {
                i = 1;
                i2 = 0;
            }
            if (i6 >= 0) {
                int i9 = (length2 - i6) - i;
                A00 = c63128SdY.A00(i7, i6 - i7, i2, i3).add(c63128SdY.A00(i6 + 1, i9, i2 - i9, i3));
            } else {
                A00 = c63128SdY.A00(i7, length2 - i7, i2, i3);
            }
            if (i5 != 0) {
                A00 = A00.setScale(i5);
            }
            if (z3) {
                return A00.negate();
            }
            return A00;
        } catch (NumberFormatException e) {
            String message = e.getMessage();
            if (message == null) {
                message = "Not a valid number representation";
            }
            if (length <= 1000) {
                A06 = new String(cArr);
            } else {
                A06 = AnonymousClass001.A06(length, new String(Arrays.copyOfRange(cArr, 0, 1000)), "(truncated, full length is ", " chars)");
            }
            throw new NumberFormatException(AnonymousClass001.A0u("Value \"", A06, "\" can not be represented as `java.math.BigDecimal`, reason: ", message));
        }
    }

    public C63128SdY(char[] cArr) {
        this.A00 = cArr;
    }
}
