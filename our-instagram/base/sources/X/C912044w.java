package X;

import java.io.Serializable;
import java.util.Arrays;

/* renamed from: X.44w, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C912044w implements Serializable {
    public final char A00;
    public final int A01;
    public final Integer A02;
    public final String A03;
    public final boolean A04;
    public final transient byte[] A05;
    public final transient char[] A06;
    public final transient int[] A07;

    public C912044w(C912044w c912044w, String str, int i) {
        Integer num = c912044w.A02;
        int[] iArr = new int[128];
        this.A07 = iArr;
        char[] cArr = new char[64];
        this.A06 = cArr;
        byte[] bArr = new byte[64];
        this.A05 = bArr;
        this.A03 = str;
        System.arraycopy(c912044w.A05, 0, bArr, 0, 64);
        System.arraycopy(c912044w.A06, 0, cArr, 0, 64);
        System.arraycopy(c912044w.A07, 0, iArr, 0, 128);
        this.A04 = true;
        this.A00 = '=';
        this.A01 = i;
        this.A02 = num;
    }

    public final String A05(byte[] bArr) {
        char c;
        char c2;
        int length = bArr.length;
        StringBuilder sb = new StringBuilder((length >> 2) + length + (length >> 3));
        int i = this.A01 >> 2;
        int i2 = 0;
        int i3 = length - 3;
        while (i2 <= i3) {
            int i4 = i2 + 1;
            int i5 = i4 + 1;
            int i6 = ((bArr[i2] << 8) | (bArr[i4] & 255)) << 8;
            i2 = i5 + 1;
            int i7 = i6 | (bArr[i5] & 255);
            char[] cArr = this.A06;
            sb.append(cArr[(i7 >> 18) & 63]);
            sb.append(cArr[(i7 >> 12) & 63]);
            sb.append(cArr[(i7 >> 6) & 63]);
            sb.append(cArr[i7 & 63]);
            i--;
            if (i <= 0) {
                sb.append('\\');
                sb.append('n');
                i = i;
            }
        }
        int i8 = length - i2;
        if (i8 > 0) {
            int i9 = i2 + 1;
            int i10 = bArr[i2] << 16;
            if (i8 == 2) {
                i10 |= (bArr[i9] & 255) << 8;
            }
            char[] cArr2 = this.A06;
            sb.append(cArr2[(i10 >> 18) & 63]);
            sb.append(cArr2[(i10 >> 12) & 63]);
            if (this.A04) {
                if (i8 == 2) {
                    c2 = cArr2[(i10 >> 6) & 63];
                } else {
                    c2 = this.A00;
                }
                sb.append(c2);
                c = this.A00;
            } else if (i8 == 2) {
                c = cArr2[(i10 >> 6) & 63];
            }
            sb.append(c);
        }
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj == null || obj.getClass() != getClass()) {
                return false;
            }
            C912044w c912044w = (C912044w) obj;
            if (c912044w.A00 != this.A00 || c912044w.A01 != this.A01 || c912044w.A04 != this.A04 || c912044w.A02 != this.A02 || !this.A03.equals(c912044w.A03)) {
                return false;
            }
        }
        return true;
    }

    public final int A00(char c) {
        if (c <= 127) {
            return this.A07[c];
        }
        return -1;
    }

    public final int A01(int i, char[] cArr, int i2) {
        int i3 = i2 + 1;
        char[] cArr2 = this.A06;
        cArr[i2] = cArr2[(i >> 18) & 63];
        int i4 = i3 + 1;
        cArr[i3] = cArr2[(i >> 12) & 63];
        int i5 = i4 + 1;
        cArr[i4] = cArr2[(i >> 6) & 63];
        int i6 = i5 + 1;
        cArr[i5] = cArr2[i & 63];
        return i6;
    }

    public final int A02(byte[] bArr, int i, int i2) {
        int i3 = i2 + 1;
        byte[] bArr2 = this.A05;
        bArr[i2] = bArr2[(i >> 18) & 63];
        int i4 = i3 + 1;
        bArr[i3] = bArr2[(i >> 12) & 63];
        int i5 = i4 + 1;
        bArr[i4] = bArr2[(i >> 6) & 63];
        int i6 = i5 + 1;
        bArr[i5] = bArr2[i & 63];
        return i6;
    }

    public final int A03(byte[] bArr, int i, int i2, int i3) {
        byte b;
        int i4 = i3 + 1;
        byte[] bArr2 = this.A05;
        bArr[i3] = bArr2[(i >> 18) & 63];
        int i5 = i4 + 1;
        bArr[i4] = bArr2[(i >> 12) & 63];
        if (this.A04) {
            byte b2 = (byte) this.A00;
            int i6 = i5 + 1;
            if (i2 == 2) {
                b = bArr2[(i >> 6) & 63];
            } else {
                b = b2;
            }
            bArr[i5] = b;
            int i7 = i6 + 1;
            bArr[i6] = b2;
            return i7;
        }
        if (i2 != 2) {
            return i5;
        }
        int i8 = i5 + 1;
        bArr[i5] = bArr2[(i >> 6) & 63];
        return i8;
    }

    public final int A04(char[] cArr, int i, int i2, int i3) {
        char c;
        int i4 = i3 + 1;
        char[] cArr2 = this.A06;
        cArr[i3] = cArr2[(i >> 18) & 63];
        int i5 = i4 + 1;
        cArr[i4] = cArr2[(i >> 12) & 63];
        if (this.A04) {
            int i6 = i5 + 1;
            if (i2 == 2) {
                c = cArr2[(i >> 6) & 63];
            } else {
                c = this.A00;
            }
            cArr[i5] = c;
            int i7 = i6 + 1;
            cArr[i6] = this.A00;
            return i7;
        }
        if (i2 != 2) {
            return i5;
        }
        int i8 = i5 + 1;
        cArr[i5] = cArr2[(i >> 6) & 63];
        return i8;
    }

    public final void A07(String str, char c, int i) {
        String str2;
        StringBuilder sb;
        String str3;
        if (c <= ' ') {
            sb = new StringBuilder();
            sb.append("Illegal white space character (code 0x");
            sb.append(Integer.toHexString(c));
            sb.append(") as character #");
            sb.append(i + 1);
            str2 = " of 4-char base64 unit: can only used between units";
        } else {
            char c2 = this.A00;
            if (c == c2) {
                sb = new StringBuilder();
                sb.append("Unexpected padding character ('");
                sb.append(c2);
                sb.append("') as character #");
                sb.append(i + 1);
                str2 = " of 4-char base64 unit: padding only legal as 3rd or 4th character";
            } else {
                str2 = ") in base64 content";
                if (Character.isDefined(c) && !Character.isISOControl(c)) {
                    sb = new StringBuilder();
                    sb.append("Illegal character '");
                    sb.append(c);
                    str3 = "' (code 0x";
                } else {
                    sb = new StringBuilder();
                    str3 = "Illegal character (code 0x";
                }
                sb.append(str3);
                sb.append(Integer.toHexString(c));
            }
        }
        sb.append(str2);
        String obj = sb.toString();
        if (str != null) {
            obj = AnonymousClass001.A0g(obj, ": ", str);
        }
        throw new IllegalArgumentException(obj);
    }

    public final int hashCode() {
        return this.A03.hashCode();
    }

    public final String toString() {
        return this.A03;
    }

    public final void A06(C61052ReQ c61052ReQ, String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            int i2 = i + 1;
            char charAt = str.charAt(i);
            if (charAt > ' ') {
                int A00 = A00(charAt);
                if (A00 < 0) {
                    A07(null, charAt, 0);
                } else {
                    if (i2 < length) {
                        int i3 = i2 + 1;
                        char charAt2 = str.charAt(i2);
                        int A002 = A00(charAt2);
                        if (A002 < 0) {
                            A07(null, charAt2, 1);
                        } else {
                            int i4 = (A00 << 6) | A002;
                            if (i3 >= length) {
                                if (this.A02 != C05F.A01) {
                                    c61052ReQ.A02(i4 >> 4);
                                    return;
                                }
                            } else {
                                int i5 = i3 + 1;
                                char charAt3 = str.charAt(i3);
                                int A003 = A00(charAt3);
                                if (A003 < 0) {
                                    if (A003 != -2) {
                                        A07(null, charAt3, 2);
                                    } else if (this.A02 != C05F.A00) {
                                        if (i5 < length) {
                                            i = i5 + 1;
                                            char charAt4 = str.charAt(i5);
                                            char c = this.A00;
                                            if (charAt4 == c) {
                                                c61052ReQ.A02(i4 >> 4);
                                            } else {
                                                A07(AnonymousClass001.A0T("expected padding character '", "'", c), charAt4, 3);
                                            }
                                        }
                                    } else {
                                        throw new IllegalArgumentException(String.format("Unexpected end of base64-encoded String: base64 variant '%s' expects no padding at the end while decoding. This Base64Variant might have been incorrectly configured", this.A03));
                                    }
                                } else {
                                    int i6 = (i4 << 6) | A003;
                                    if (i5 >= length) {
                                        if (this.A02 != C05F.A01) {
                                            c61052ReQ.A04(i6 >> 2);
                                            return;
                                        }
                                    } else {
                                        i2 = i5 + 1;
                                        char charAt5 = str.charAt(i5);
                                        int A004 = A00(charAt5);
                                        if (A004 < 0) {
                                            if (A004 != -2) {
                                                A07(null, charAt5, 3);
                                            } else if (this.A02 != C05F.A00) {
                                                c61052ReQ.A04(i6 >> 2);
                                            } else {
                                                throw new IllegalArgumentException(String.format("Unexpected end of base64-encoded String: base64 variant '%s' expects no padding at the end while decoding. This Base64Variant might have been incorrectly configured", this.A03));
                                            }
                                        } else {
                                            c61052ReQ.A03((i6 << 6) | A004);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    throw new IllegalArgumentException(String.format("Unexpected end of base64-encoded String: base64 variant '%s' expects padding (one or more '%c' characters) at the end. This Base64Variant might have been incorrectly configured", this.A03, Character.valueOf(this.A00)));
                }
                throw C00O.createAndThrow();
            }
            i = i2;
        }
    }

    public C912044w(String str, String str2, char c, int i, boolean z) {
        int[] iArr;
        Integer num;
        int[] iArr2 = new int[128];
        this.A07 = iArr2;
        char[] cArr = new char[64];
        this.A06 = cArr;
        this.A05 = new byte[64];
        this.A03 = str;
        this.A04 = z;
        this.A00 = c;
        this.A01 = i;
        int length = str2.length();
        if (length == 64) {
            int i2 = 0;
            str2.getChars(0, length, cArr, 0);
            Arrays.fill(iArr2, -1);
            do {
                char c2 = this.A06[i2];
                this.A05[i2] = (byte) c2;
                iArr = this.A07;
                iArr[c2] = i2;
                i2++;
            } while (i2 < length);
            if (z) {
                iArr[c] = -2;
                num = C05F.A01;
            } else {
                num = C05F.A00;
            }
            this.A02 = num;
            return;
        }
        throw new IllegalArgumentException(AnonymousClass001.A0c("Base64Alphabet length must be exactly 64 (was ", ")", length));
    }
}
