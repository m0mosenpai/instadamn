package X;

import com.facebook.common.dextricks.Constants;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: X.16O, reason: invalid class name */
/* loaded from: classes.dex */
public final class C16O {
    public static final char[] A0B = new char[0];
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public String A04;
    public ArrayList A05;
    public boolean A06;
    public char[] A07;
    public char[] A08;
    public char[] A09;
    public final C16G A0A;

    public C16O(char[] cArr) {
        this.A0A = null;
        this.A07 = cArr;
        this.A00 = cArr.length;
        this.A02 = -1;
    }

    public static void A00(C16O c16o) {
        c16o.A06 = false;
        c16o.A05.clear();
        c16o.A03 = 0;
        c16o.A00 = 0;
    }

    public final void A07() {
        char[] cArr;
        this.A02 = -1;
        this.A00 = 0;
        this.A01 = 0;
        this.A08 = null;
        this.A09 = null;
        if (this.A06) {
            A00(this);
        }
        C16G c16g = this.A0A;
        if (c16g != null && (cArr = this.A07) != null) {
            this.A07 = null;
            c16g.A01.set(2, cArr);
        }
    }

    public final void A0A(char[] cArr, int i, int i2) {
        this.A04 = null;
        this.A09 = null;
        this.A08 = cArr;
        this.A02 = i;
        this.A01 = i2;
        if (this.A06) {
            A00(this);
        }
    }

    public final char[] A0C() {
        this.A02 = -1;
        this.A00 = 0;
        this.A01 = 0;
        this.A08 = null;
        this.A04 = null;
        this.A09 = null;
        if (this.A06) {
            A00(this);
        }
        char[] cArr = this.A07;
        if (cArr == null) {
            char[] A03 = A03(this, 0);
            this.A07 = A03;
            return A03;
        }
        return cArr;
    }

    public static void A01(C16O c16o) {
        ArrayList arrayList = c16o.A05;
        if (arrayList == null) {
            arrayList = new ArrayList();
            c16o.A05 = arrayList;
        }
        char[] cArr = c16o.A07;
        c16o.A06 = true;
        arrayList.add(cArr);
        int i = c16o.A03;
        int length = cArr.length;
        c16o.A03 = i + length;
        c16o.A00 = 0;
        int i2 = length + (length >> 1);
        if (i2 < 500) {
            i2 = 500;
        } else if (i2 > 65536) {
            i2 = Constants.LOAD_RESULT_PGO_ATTEMPTED;
        }
        c16o.A07 = new char[i2];
    }

    public static void A02(C16O c16o, int i) {
        int i2 = c16o.A01;
        c16o.A01 = 0;
        char[] cArr = c16o.A08;
        c16o.A08 = null;
        int i3 = c16o.A02;
        c16o.A02 = -1;
        int i4 = i + i2;
        char[] cArr2 = c16o.A07;
        if (cArr2 == null || i4 > cArr2.length) {
            cArr2 = A03(c16o, i4);
            c16o.A07 = cArr2;
        }
        if (i2 > 0) {
            System.arraycopy(cArr, i3, cArr2, 0, i2);
        }
        c16o.A03 = 0;
        c16o.A00 = i2;
    }

    public static char[] A03(C16O c16o, int i) {
        C16G c16g = c16o.A0A;
        if (c16g != null) {
            return c16g.A01(2, i);
        }
        return new char[Math.max(i, 500)];
    }

    public final int A04() {
        if (this.A02 >= 0) {
            return this.A01;
        }
        char[] cArr = this.A09;
        if (cArr != null) {
            return cArr.length;
        }
        String str = this.A04;
        if (str != null) {
            return str.length();
        }
        return this.A03 + this.A00;
    }

    public final int A05(boolean z) {
        char[] cArr;
        int i;
        int A03;
        int i2 = this.A02;
        if (i2 >= 0 && (cArr = this.A08) != null) {
            if (z) {
                A03 = C16Y.A03(cArr, i2 + 1, this.A01 - 1);
                return -A03;
            }
            i = this.A01;
            return C16Y.A03(cArr, i2, i);
        }
        cArr = this.A07;
        if (z) {
            A03 = C16Y.A03(cArr, 1, this.A00 - 1);
            return -A03;
        }
        i2 = 0;
        i = this.A00;
        return C16Y.A03(cArr, i2, i);
    }

    public final String A06() {
        String str = this.A04;
        if (str == null) {
            char[] cArr = this.A09;
            if (cArr != null) {
                str = new String(cArr);
            } else {
                int i = this.A02;
                str = "";
                if (i >= 0) {
                    int i2 = this.A01;
                    if (i2 >= 1) {
                        str = new String(this.A08, i, i2);
                    }
                } else {
                    int i3 = this.A03;
                    int i4 = this.A00;
                    if (i3 == 0) {
                        if (i4 != 0) {
                            str = new String(this.A07, 0, i4);
                        }
                    } else {
                        StringBuilder sb = new StringBuilder(i3 + i4);
                        ArrayList arrayList = this.A05;
                        if (arrayList != null) {
                            int size = arrayList.size();
                            for (int i5 = 0; i5 < size; i5++) {
                                char[] cArr2 = (char[]) this.A05.get(i5);
                                sb.append(cArr2, 0, cArr2.length);
                            }
                        }
                        sb.append(this.A07, 0, this.A00);
                        str = sb.toString();
                    }
                }
            }
            this.A04 = str;
        }
        return str;
    }

    public final void A08(String str, int i, int i2) {
        if (this.A02 >= 0) {
            A02(this, i2);
        }
        this.A04 = null;
        this.A09 = null;
        char[] cArr = this.A07;
        int length = cArr.length;
        int i3 = this.A00;
        int i4 = length - i3;
        if (i4 >= i2) {
            str.getChars(i, i + i2, cArr, i3);
            this.A00 += i2;
            return;
        }
        if (i4 > 0) {
            int i5 = i + i4;
            str.getChars(i, i5, cArr, i3);
            i2 -= i4;
            i = i5;
        }
        while (true) {
            A01(this);
            char[] cArr2 = this.A07;
            int min = Math.min(cArr2.length, i2);
            int i6 = i + min;
            str.getChars(i, i6, cArr2, 0);
            this.A00 += min;
            i2 -= min;
            if (i2 <= 0) {
                return;
            } else {
                i = i6;
            }
        }
    }

    public final void A09(char[] cArr, int i, int i2) {
        if (this.A02 >= 0) {
            A02(this, i2);
        }
        this.A04 = null;
        this.A09 = null;
        char[] cArr2 = this.A07;
        int length = cArr2.length;
        int i3 = this.A00;
        int i4 = length - i3;
        if (i4 >= i2) {
            System.arraycopy(cArr, i, cArr2, i3, i2);
            this.A00 += i2;
            return;
        }
        if (i4 > 0) {
            System.arraycopy(cArr, i, cArr2, i3, i4);
            i += i4;
            i2 -= i4;
        }
        do {
            A01(this);
            char[] cArr3 = this.A07;
            int min = Math.min(cArr3.length, i2);
            System.arraycopy(cArr, i, cArr3, 0, min);
            this.A00 += min;
            i += min;
            i2 -= min;
        } while (i2 > 0);
    }

    public final char[] A0B() {
        int i;
        char[] cArr = this.A09;
        if (cArr == null) {
            String str = this.A04;
            if (str != null) {
                cArr = str.toCharArray();
            } else {
                int i2 = this.A02;
                if (i2 >= 0) {
                    int i3 = this.A01;
                    if (i3 >= 1) {
                        char[] cArr2 = this.A08;
                        if (i2 == 0) {
                            cArr = Arrays.copyOf(cArr2, i3);
                        } else {
                            cArr = Arrays.copyOfRange(cArr2, i2, i3 + i2);
                        }
                    }
                    cArr = A0B;
                } else {
                    int A04 = A04();
                    if (A04 >= 1) {
                        cArr = new char[A04];
                        ArrayList arrayList = this.A05;
                        if (arrayList != null) {
                            int size = arrayList.size();
                            i = 0;
                            for (int i4 = 0; i4 < size; i4++) {
                                char[] cArr3 = (char[]) this.A05.get(i4);
                                int length = cArr3.length;
                                System.arraycopy(cArr3, 0, cArr, i, length);
                                i += length;
                            }
                        } else {
                            i = 0;
                        }
                        System.arraycopy(this.A07, 0, cArr, i, this.A00);
                    }
                    cArr = A0B;
                }
            }
            this.A09 = cArr;
        }
        return cArr;
    }

    public final char[] A0D() {
        ArrayList arrayList = this.A05;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.A05 = arrayList;
        }
        this.A06 = true;
        char[] cArr = this.A07;
        arrayList.add(cArr);
        int length = cArr.length;
        this.A03 += length;
        this.A00 = 0;
        int i = length + (length >> 1);
        if (i < 500) {
            i = 500;
        } else if (i > 65536) {
            i = Constants.LOAD_RESULT_PGO_ATTEMPTED;
        }
        char[] cArr2 = new char[i];
        this.A07 = cArr2;
        return cArr2;
    }

    public final char[] A0E() {
        if (this.A02 >= 0) {
            A02(this, 1);
        } else {
            char[] cArr = this.A07;
            if (cArr == null) {
                this.A07 = A03(this, 0);
            } else if (this.A00 >= cArr.length) {
                A01(this);
            }
        }
        return this.A07;
    }

    public final char[] A0F() {
        if (this.A02 >= 0) {
            return this.A08;
        }
        char[] cArr = this.A09;
        if (cArr != null) {
            return cArr;
        }
        String str = this.A04;
        if (str != null) {
            char[] charArray = str.toCharArray();
            this.A09 = charArray;
            return charArray;
        }
        if (!this.A06) {
            char[] cArr2 = this.A07;
            if (cArr2 != null) {
                return cArr2;
            }
            return A0B;
        }
        return A0B();
    }

    public final String toString() {
        return A06();
    }

    public C16O(C16G c16g) {
        this.A0A = c16g;
    }
}
