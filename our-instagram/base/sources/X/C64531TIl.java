package X;

import java.io.Serializable;
import java.util.Arrays;

/* renamed from: X.TIl, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public class C64531TIl implements Comparable, Serializable {
    public transient int A00;
    public transient String A01;
    public final byte[] data;
    public static final char[] A03 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static final C64531TIl A02 = A03(new byte[0]);

    public boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof C64531TIl) {
                C64531TIl c64531TIl = (C64531TIl) obj;
                int A05 = c64531TIl.A05();
                byte[] bArr = this.data;
                int length = bArr.length;
                if (A05 != length || !c64531TIl.A0C(bArr, 0, 0, length)) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    public static int A00(char c) {
        char c2;
        if (c >= '0') {
            if (c <= '9') {
                return c - '0';
            }
            char c3 = 'a';
            if (c >= 'a') {
                c2 = 'f';
            } else {
                c3 = 'A';
                if (c >= 'A') {
                    c2 = 'F';
                }
            }
            if (c <= c2) {
                return (c - c3) + 10;
            }
        }
        throw AbstractC166987dD.A12(AnonymousClass001.A0C("Unexpected hex digit: ", c));
    }

    public static C64531TIl A02(String str) {
        if (str != null) {
            C64531TIl c64531TIl = new C64531TIl(str.getBytes(SUN.A00));
            c64531TIl.A01 = str;
            return c64531TIl;
        }
        throw AbstractC166987dD.A12("s == null");
    }

    public static C64531TIl A03(byte... bArr) {
        if (bArr != null) {
            return new C64531TIl((byte[]) bArr.clone());
        }
        throw AbstractC166987dD.A12("data == null");
    }

    public final byte A04(int i) {
        byte[] bArr;
        int i2;
        if (this instanceof C65169Tei) {
            C65169Tei c65169Tei = (C65169Tei) this;
            int[] iArr = c65169Tei.A00;
            byte[][] bArr2 = c65169Tei.A01;
            int length = bArr2.length;
            SUN.A00(iArr[length - 1], i, 1L);
            int binarySearch = Arrays.binarySearch(iArr, 0, length, i + 1);
            if (binarySearch < 0) {
                binarySearch ^= -1;
            }
            if (binarySearch == 0) {
                i2 = 0;
            } else {
                i2 = iArr[binarySearch - 1];
            }
            int i3 = iArr[length + binarySearch];
            bArr = bArr2[binarySearch];
            i = (i - i2) + i3;
        } else {
            bArr = this.data;
        }
        return bArr[i];
    }

    public final int A05() {
        if (this instanceof C65169Tei) {
            return ((C65169Tei) this).A00[r0.A01.length - 1];
        }
        return this.data.length;
    }

    public final String A06() {
        if (this instanceof C65169Tei) {
            return new C64531TIl(A0D()).A06();
        }
        byte[] bArr = this.data;
        char[] cArr = new char[bArr.length * 2];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            char[] cArr2 = A03;
            AbstractC58318PtA.A1Z(cArr2, cArr, b >> 4, i);
            i = i2 + 1;
            AbstractC58318PtA.A1Z(cArr2, cArr, b, i2);
        }
        return new String(cArr);
    }

    public final String A07() {
        if (this instanceof C65169Tei) {
            return AbstractC58318PtA.A0m(SUN.A00, A0D());
        }
        String str = this.A01;
        if (str != null) {
            return str;
        }
        String A0m = AbstractC58318PtA.A0m(SUN.A00, this.data);
        this.A01 = A0m;
        return A0m;
    }

    public final C64531TIl A08() {
        if (this instanceof C65169Tei) {
            return new C64531TIl(A0D()).A08();
        }
        byte[] bArr = this.data;
        int length = bArr.length;
        if (64 <= length) {
            if (64 == length) {
                return this;
            }
            byte[] bArr2 = new byte[64];
            System.arraycopy(bArr, 0, bArr2, 0, 64);
            return new C64531TIl(bArr2);
        }
        throw AbstractC166987dD.A12(AnonymousClass001.A0c("endIndex > length(", ")", length));
    }

    public final C64531TIl A09() {
        if (this instanceof C65169Tei) {
            return new C64531TIl(A0D()).A09();
        }
        int i = 0;
        while (true) {
            byte[] bArr = this.data;
            if (i < bArr.length) {
                byte b = bArr[i];
                if (b >= 65 && b <= 90) {
                    byte[] bArr2 = (byte[]) bArr.clone();
                    bArr2[i] = (byte) (b + 32);
                    for (int i2 = i + 1; i2 < bArr2.length; i2++) {
                        byte b2 = bArr2[i2];
                        if (b2 >= 65 && b2 <= 90) {
                            bArr2[i2] = (byte) (b2 + 32);
                        }
                    }
                    return new C64531TIl(bArr2);
                }
                i++;
            } else {
                return this;
            }
        }
    }

    public final void A0A(TWX twx) {
        if (this instanceof C65169Tei) {
            C65169Tei c65169Tei = (C65169Tei) this;
            byte[][] bArr = c65169Tei.A01;
            int length = bArr.length;
            int i = 0;
            int i2 = 0;
            while (i < length) {
                int[] iArr = c65169Tei.A00;
                int i3 = iArr[length + i];
                int i4 = iArr[i];
                C63304ShA c63304ShA = new C63304ShA(bArr[i], i3, (i3 + i4) - i2, true, false);
                C63304ShA c63304ShA2 = twx.A01;
                if (c63304ShA2 == null) {
                    c63304ShA.A03 = c63304ShA;
                    c63304ShA.A02 = c63304ShA;
                    twx.A01 = c63304ShA;
                } else {
                    c63304ShA2.A03.A05(c63304ShA);
                }
                i++;
                i2 = i4;
            }
            twx.A00 += i2;
            return;
        }
        byte[] bArr2 = this.data;
        twx.A0J(bArr2, bArr2.length);
    }

    public final boolean A0B(C64531TIl c64531TIl, int i) {
        int i2;
        if (this instanceof C65169Tei) {
            C65169Tei c65169Tei = (C65169Tei) this;
            int i3 = 0;
            int i4 = 0;
            if (0 > c65169Tei.A05() - i) {
                return false;
            }
            int[] iArr = c65169Tei.A00;
            byte[][] bArr = c65169Tei.A01;
            int length = bArr.length;
            int binarySearch = Arrays.binarySearch(iArr, 0, length, 1);
            if (binarySearch < 0) {
                binarySearch ^= -1;
            }
            while (i > 0) {
                if (binarySearch == 0) {
                    i2 = 0;
                } else {
                    i2 = iArr[binarySearch - 1];
                }
                int min = Math.min(i, ((iArr[binarySearch] - i2) + i2) - i3);
                if (!c64531TIl.A0C(bArr[binarySearch], i4, (i3 - i2) + iArr[length + binarySearch], min)) {
                    return false;
                }
                i3 += min;
                i4 += min;
                i -= min;
                binarySearch++;
            }
            return true;
        }
        return c64531TIl.A0C(this.data, 0, 0, i);
    }

    public final boolean A0C(byte[] bArr, int i, int i2, int i3) {
        int i4;
        if (this instanceof C65169Tei) {
            C65169Tei c65169Tei = (C65169Tei) this;
            if (i < 0 || i > c65169Tei.A05() - i3 || i2 < 0 || i2 > bArr.length - i3) {
                return false;
            }
            int[] iArr = c65169Tei.A00;
            byte[][] bArr2 = c65169Tei.A01;
            int length = bArr2.length;
            int binarySearch = Arrays.binarySearch(iArr, 0, length, i + 1);
            if (binarySearch < 0) {
                binarySearch ^= -1;
            }
            while (i3 > 0) {
                if (binarySearch == 0) {
                    i4 = 0;
                } else {
                    i4 = iArr[binarySearch - 1];
                }
                int min = Math.min(i3, ((iArr[binarySearch] - i4) + i4) - i);
                int i5 = (i - i4) + iArr[length + binarySearch];
                byte[] bArr3 = bArr2[binarySearch];
                for (int i6 = 0; i6 < min; i6++) {
                    if (bArr3[i6 + i5] != bArr[i6 + i2]) {
                        return false;
                    }
                }
                i += min;
                i2 += min;
                i3 -= min;
                binarySearch++;
            }
            return true;
        }
        if (i >= 0) {
            byte[] bArr4 = this.data;
            if (i <= bArr4.length - i3 && i2 >= 0 && i2 <= bArr.length - i3) {
                for (int i7 = 0; i7 < i3; i7++) {
                    if (bArr4[i7 + i] == bArr[i7 + i2]) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final byte[] A0D() {
        if (this instanceof C65169Tei) {
            C65169Tei c65169Tei = (C65169Tei) this;
            int[] iArr = c65169Tei.A00;
            byte[][] bArr = c65169Tei.A01;
            int length = bArr.length;
            byte[] bArr2 = new byte[iArr[length - 1]];
            int i = 0;
            int i2 = 0;
            while (i < length) {
                int i3 = iArr[length + i];
                int i4 = iArr[i];
                System.arraycopy(bArr[i], i3, bArr2, i2, i4 - i2);
                i++;
                i2 = i4;
            }
            return bArr2;
        }
        return (byte[]) this.data.clone();
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        C64531TIl c64531TIl = (C64531TIl) obj;
        int A05 = A05();
        int A052 = c64531TIl.A05();
        int min = Math.min(A05, A052);
        for (int i = 0; i < min; i++) {
            int A04 = A04(i) & 255;
            int A042 = c64531TIl.A04(i) & 255;
            if (A04 != A042) {
                if (A04 < A042) {
                    return -1;
                }
                return 1;
            }
        }
        if (A05 == A052) {
            return 0;
        }
        if (A05 < A052) {
            return -1;
        }
        return 1;
    }

    public int hashCode() {
        int i = this.A00;
        if (i == 0) {
            int hashCode = Arrays.hashCode(this.data);
            this.A00 = hashCode;
            return hashCode;
        }
        return i;
    }

    public String toString() {
        String replace;
        StringBuilder A1C;
        if (this.data.length == 0) {
            return "[size=0]";
        }
        String A07 = A07();
        int length = A07.length();
        int i = 0;
        int i2 = 0;
        while (i < length) {
            if (i2 == 64) {
                break;
            }
            int codePointAt = A07.codePointAt(i);
            if (Character.isISOControl(codePointAt)) {
                if (codePointAt != 10 && codePointAt != 13) {
                    length = -1;
                    break;
                }
                i2++;
                i += Character.charCount(codePointAt);
            } else if (codePointAt != 65533) {
                i2++;
                i += Character.charCount(codePointAt);
            } else {
                length = -1;
                break;
            }
        }
        i = length;
        if (i == -1) {
            int length2 = this.data.length;
            if (length2 <= 64) {
                A1C = AbstractC166987dD.A1C();
                A1C.append("[hex=");
                replace = A06();
                A1C.append(replace);
                A1C.append("]");
            } else {
                A1C = AbstractC166997dE.A11("[size=");
                A1C.append(length2);
                A1C.append(" hex=");
                replace = A08().A06();
                A1C.append(replace);
                A1C.append("…]");
            }
        } else {
            replace = A07.substring(0, i).replace("\\", "\\\\").replace("\n", "\\n").replace("\r", "\\r");
            if (i < length) {
                A1C = AbstractC166997dE.A11("[size=");
                A1C.append(this.data.length);
                A1C.append(" text=");
                A1C.append(replace);
                A1C.append("…]");
            } else {
                A1C = AbstractC166987dD.A1C();
                A1C.append("[text=");
                A1C.append(replace);
                A1C.append("]");
            }
        }
        return A1C.toString();
    }

    public C64531TIl(byte[] bArr) {
        this.data = bArr;
    }

    public static C64531TIl A01(String str) {
        int length = str.length();
        if (length % 2 == 0) {
            int i = length / 2;
            byte[] bArr = new byte[i];
            for (int i2 = 0; i2 < i; i2++) {
                int i3 = i2 * 2;
                bArr[i2] = (byte) ((A00(str.charAt(i3)) << 4) + A00(str.charAt(i3 + 1)));
            }
            return A03(bArr);
        }
        throw AbstractC167007dF.A0c("Unexpected hex string: ", str);
    }
}
