package X;

import java.util.Arrays;
import java.util.BitSet;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.168, reason: invalid class name */
/* loaded from: classes.dex */
public final class AnonymousClass168 {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public BitSet A04;
    public boolean A05;
    public boolean A06;
    public AnonymousClass169[] A07;
    public String[] A08;
    public final int A09;
    public final int A0A;
    public final AnonymousClass168 A0B;
    public final AtomicReference A0C;

    public final String A01(char[] cArr, int i, int i2, int i3) {
        int i4;
        int max;
        if (i2 < 1) {
            return "";
        }
        if (!this.A05) {
            return new String(cArr, i, i2);
        }
        int i5 = i3 + (i3 >>> 15);
        int i6 = i5 ^ (i5 << 7);
        int i7 = (i6 + (i6 >>> 3)) & this.A00;
        String str = this.A08[i7];
        if (str != null) {
            if (str.length() == i2) {
                int i8 = 0;
                while (str.charAt(i8) == cArr[i + i8]) {
                    i8++;
                    if (i8 == i2) {
                        return str;
                    }
                }
            }
            AnonymousClass169 anonymousClass169 = this.A07[i7 >> 1];
            if (anonymousClass169 != null) {
                String str2 = anonymousClass169.A02;
                if (str2.length() == i2) {
                    int i9 = 0;
                    while (str2.charAt(i9) == cArr[i + i9]) {
                        i9++;
                        if (i9 >= i2) {
                            return str2;
                        }
                    }
                }
                while (true) {
                    anonymousClass169 = anonymousClass169.A01;
                    if (anonymousClass169 == null) {
                        break;
                    }
                    String str3 = anonymousClass169.A02;
                    if (str3.length() == i2) {
                        int i10 = 0;
                        while (str3.charAt(i10) == cArr[i + i10]) {
                            i10++;
                            if (i10 >= i2) {
                                return str3;
                            }
                        }
                    }
                }
            }
        }
        if (this.A06) {
            String[] strArr = this.A08;
            this.A08 = (String[]) Arrays.copyOf(strArr, strArr.length);
            AnonymousClass169[] anonymousClass169Arr = this.A07;
            this.A07 = (AnonymousClass169[]) Arrays.copyOf(anonymousClass169Arr, anonymousClass169Arr.length);
            this.A06 = false;
        } else if (this.A02 >= this.A03) {
            String[] strArr2 = this.A08;
            int length = strArr2.length;
            int i11 = length + length;
            if (i11 > 65536) {
                this.A02 = 0;
                this.A05 = false;
                this.A08 = new String[64];
                this.A07 = new AnonymousClass169[32];
                this.A00 = 63;
                i4 = 63;
                this.A06 = false;
            } else {
                AnonymousClass169[] anonymousClass169Arr2 = this.A07;
                this.A08 = new String[i11];
                this.A07 = new AnonymousClass169[i11 >> 1];
                i4 = i11 - 1;
                this.A00 = i4;
                this.A03 = i11 - (i11 >> 2);
                int i12 = 0;
                int i13 = 0;
                for (String str4 : strArr2) {
                    if (str4 != null) {
                        i12++;
                        int length2 = str4.length();
                        int i14 = this.A0A;
                        for (int i15 = 0; i15 < length2; i15++) {
                            i14 = (i14 * 33) + str4.charAt(i15);
                        }
                        if (i14 == 0) {
                            i14 = 1;
                        }
                        int i16 = i14 + (i14 >>> 15);
                        int i17 = i16 ^ (i16 << 7);
                        i4 = this.A00;
                        int i18 = (i17 + (i17 >>> 3)) & i4;
                        String[] strArr3 = this.A08;
                        if (strArr3[i18] == null) {
                            strArr3[i18] = str4;
                        } else {
                            int i19 = i18 >> 1;
                            AnonymousClass169[] anonymousClass169Arr3 = this.A07;
                            AnonymousClass169 anonymousClass1692 = new AnonymousClass169(anonymousClass169Arr3[i19], str4);
                            anonymousClass169Arr3[i19] = anonymousClass1692;
                            i13 = Math.max(i13, anonymousClass1692.A00);
                        }
                    }
                }
                int i20 = length >> 1;
                for (int i21 = 0; i21 < i20; i21++) {
                    for (AnonymousClass169 anonymousClass1693 = anonymousClass169Arr2[i21]; anonymousClass1693 != null; anonymousClass1693 = anonymousClass1693.A01) {
                        i12++;
                        String str5 = anonymousClass1693.A02;
                        int length3 = str5.length();
                        int i22 = this.A0A;
                        for (int i23 = 0; i23 < length3; i23++) {
                            i22 = (i22 * 33) + str5.charAt(i23);
                        }
                        if (i22 == 0) {
                            i22 = 1;
                        }
                        int i24 = i22 + (i22 >>> 15);
                        int i25 = i24 ^ (i24 << 7);
                        i4 = this.A00;
                        int i26 = (i25 + (i25 >>> 3)) & i4;
                        String[] strArr4 = this.A08;
                        if (strArr4[i26] == null) {
                            strArr4[i26] = str5;
                        } else {
                            int i27 = i26 >> 1;
                            AnonymousClass169[] anonymousClass169Arr4 = this.A07;
                            AnonymousClass169 anonymousClass1694 = new AnonymousClass169(anonymousClass169Arr4[i27], str5);
                            anonymousClass169Arr4[i27] = anonymousClass1694;
                            i13 = Math.max(i13, anonymousClass1694.A00);
                        }
                    }
                }
                this.A01 = i13;
                this.A04 = null;
                int i28 = this.A02;
                if (i12 != i28) {
                    throw new IllegalStateException(String.format("Internal error on SymbolTable.rehash(): had %d entries; now have %d", Integer.valueOf(i28), Integer.valueOf(i12)));
                }
            }
            int i29 = this.A0A;
            int i30 = i2 + i;
            for (int i31 = i; i31 < i30; i31++) {
                i29 = (i29 * 33) + cArr[i31];
            }
            if (i29 == 0) {
                i29 = 1;
            }
            int i32 = i29 + (i29 >>> 15);
            int i33 = i32 ^ (i32 << 7);
            i7 = (i33 + (i33 >>> 3)) & i4;
        }
        String str6 = new String(cArr, i, i2);
        C15x c15x = C15x.INTERN_FIELD_NAMES;
        int i34 = this.A09;
        if (c15x.A00(i34)) {
            str6 = C16U.A01.A00(str6);
        }
        int i35 = this.A02 + 1;
        this.A02 = i35;
        String[] strArr5 = this.A08;
        if (strArr5[i7] == null) {
            strArr5[i7] = str6;
            return str6;
        }
        int i36 = i7 >> 1;
        AnonymousClass169[] anonymousClass169Arr5 = this.A07;
        AnonymousClass169 anonymousClass1695 = new AnonymousClass169(anonymousClass169Arr5[i36], str6);
        int i37 = anonymousClass1695.A00;
        if (i37 > 150) {
            BitSet bitSet = this.A04;
            if (bitSet == null) {
                bitSet = new BitSet();
                this.A04 = bitSet;
            } else if (bitSet.get(i36)) {
                if (C15x.FAIL_ON_SYMBOL_HASH_OVERFLOW.A00(i34)) {
                    throw new IllegalStateException(AnonymousClass001.A0n("Longest collision chain in symbol table (of size ", ") now exceeds maximum, ", " -- suspect a DoS attack based on hash collisions", i35, 150));
                }
                this.A05 = false;
                this.A08[i7] = anonymousClass1695.A02;
                this.A07[i36] = null;
                this.A02 -= i37;
                max = -1;
            }
            bitSet.set(i36);
            this.A08[i7] = anonymousClass1695.A02;
            this.A07[i36] = null;
            this.A02 -= i37;
            max = -1;
        } else {
            anonymousClass169Arr5[i36] = anonymousClass1695;
            max = Math.max(i37, this.A01);
        }
        this.A01 = max;
        return str6;
    }

    public final AnonymousClass168 A00(int i) {
        return new AnonymousClass168((C16A) this.A0C.get(), this, i, this.A0A);
    }

    public AnonymousClass168(int i) {
        this.A0B = null;
        this.A0A = i;
        this.A05 = true;
        this.A09 = -1;
        this.A06 = false;
        this.A01 = 0;
        this.A0C = new AtomicReference(new C16A(new AnonymousClass169[32], new String[64]));
    }

    public AnonymousClass168(C16A c16a, AnonymousClass168 anonymousClass168, int i, int i2) {
        this.A0B = anonymousClass168;
        this.A0A = i2;
        this.A0C = null;
        this.A09 = i;
        this.A05 = C15x.CANONICALIZE_FIELD_NAMES.A00(i);
        String[] strArr = c16a.A03;
        this.A08 = strArr;
        this.A07 = c16a.A02;
        this.A02 = c16a.A01;
        this.A01 = c16a.A00;
        int length = strArr.length;
        this.A03 = length - (length >> 2);
        this.A00 = length - 1;
        this.A06 = true;
    }
}
