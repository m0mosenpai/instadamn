package X;

import com.facebook.common.dextricks.StringTreeSet;
import java.io.ByteArrayOutputStream;
import java.net.InetAddress;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: X.0dr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC09420dr {
    public static final C11L A00 = new C11L("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
    public static final byte[] A01;

    public static final String A00(String str) {
        String lowerCase;
        int length;
        boolean z;
        InetAddress A012;
        C14360o3.A0B(str, 0);
        boolean z2 = false;
        if (AbstractC001900j.A0a(str, ":", false)) {
            if (str.startsWith("[") && str.endsWith("]")) {
                A012 = A01(str, 1, str.length() - 1);
            } else {
                A012 = A01(str, 0, str.length());
            }
            if (A012 != null) {
                byte[] address = A012.getAddress();
                int length2 = address.length;
                if (length2 == 16) {
                    int i = -1;
                    int i2 = 0;
                    int i3 = 0;
                    while (i2 < length2) {
                        int i4 = i2;
                        while (i4 < 16 && address[i4] == 0 && address[i4 + 1] == 0) {
                            i4 += 2;
                        }
                        int i5 = i4 - i2;
                        if (i5 > i3 && i5 >= 4) {
                            i = i2;
                            i3 = i5;
                        }
                        i2 = i4 + 2;
                    }
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    int i6 = 0;
                    while (i6 < length2) {
                        if (i6 == i) {
                            byteArrayOutputStream.write(58);
                            i6 += i3;
                            if (i6 == 16) {
                                byteArrayOutputStream.write(58);
                            }
                        } else {
                            if (i6 > 0) {
                                byteArrayOutputStream.write(58);
                            }
                            long j = ((address[i6] & 255) << 8) | (address[i6 + 1] & 255);
                            if (j == 0) {
                                byteArrayOutputStream.write(48);
                            }
                            long j2 = (j >>> 1) | j;
                            long j3 = j2 | (j2 >>> 2);
                            long j4 = j3 | (j3 >>> 4);
                            long j5 = j4 | (j4 >>> 8);
                            long j6 = j5 | (j5 >>> 16);
                            long j7 = j6 | (j6 >>> 32);
                            long j8 = j7 - ((j7 >>> 1) & 6148914691236517205L);
                            long j9 = ((j8 >>> 2) & 3689348814741910323L) + (j8 & 3689348814741910323L);
                            long j10 = ((j9 >>> 4) + j9) & 1085102592571150095L;
                            long j11 = j10 + (j10 >>> 8);
                            long j12 = j11 + (j11 >>> 16);
                            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                            for (int i7 = ((int) ((((j12 & 63) + ((j12 >>> 32) & 63)) + 3) / 4)) - 1; i7 >= 0; i7--) {
                                byteArrayOutputStream2.write(new byte[]{A01[(int) (j & 15)]});
                                j >>>= 4;
                            }
                            byte[] byteArray = byteArrayOutputStream2.toByteArray();
                            C14360o3.A0A(byteArray);
                            C14360o3.A0B(byteArray, 0);
                            int length3 = byteArray.length;
                            int i8 = 0;
                            if (length3 != 0) {
                                byte[] bArr = new byte[length3];
                                int i9 = length3 - 1;
                                if (i9 >= 0) {
                                    while (true) {
                                        bArr[i9 - i8] = byteArray[i8];
                                        if (i8 == i9) {
                                            break;
                                        }
                                        i8++;
                                    }
                                }
                                byteArray = bArr;
                            }
                            byteArrayOutputStream.write(byteArray);
                            i6 += 2;
                        }
                    }
                    byte[] byteArray2 = byteArrayOutputStream.toByteArray();
                    C14360o3.A07(byteArray2);
                    return new String(byteArray2, C15W.A05);
                }
                if (length2 == 4) {
                    return A012.getHostAddress();
                }
                throw new AssertionError(AnonymousClass001.A0S("Invalid IPv6 address: '", str, '\''));
            }
        } else {
            try {
                String ascii = java.net.IDN.toASCII(str);
                C14360o3.A07(ascii);
                Locale locale = Locale.US;
                C14360o3.A08(locale);
                lowerCase = ascii.toLowerCase(locale);
                C14360o3.A07(lowerCase);
                length = lowerCase.length();
                if (length == 0) {
                    z2 = true;
                }
            } catch (IllegalArgumentException unused) {
            }
            if (!z2) {
                for (int i10 = 0; i10 < length; i10++) {
                    char charAt = lowerCase.charAt(i10);
                    if (C14360o3.A00(charAt, 31) <= 0 || C14360o3.A00(charAt, StringTreeSet.MAX_SYMBOL_COUNT) >= 0 || AbstractC001900j.A04(" #%/:?@[\\]", charAt, 0) != -1) {
                        z = true;
                        break;
                    }
                }
                z = false;
                if (z) {
                    return null;
                }
                return lowerCase;
            }
        }
        return null;
    }

    public static final boolean A02(String str) {
        int i;
        char c;
        C14360o3.A0B(str, 0);
        int length = str.length();
        int i2 = 0;
        if (length >= 0) {
            if (length <= length) {
                long j = 0;
                while (i2 < length) {
                    char charAt = str.charAt(i2);
                    long j2 = 1;
                    if (charAt >= 128) {
                        if (charAt < 2048) {
                            i = 2;
                        } else if (charAt >= 55296 && charAt <= 57343) {
                            int i3 = i2 + 1;
                            if (i3 < length) {
                                c = str.charAt(i3);
                            } else {
                                c = 0;
                            }
                            if (charAt <= 56319 && c >= 56320 && c <= 57343) {
                                j += 4;
                                i2 += 2;
                            } else {
                                j++;
                                i2 = i3;
                            }
                        } else {
                            i = 3;
                        }
                        j2 = i;
                    }
                    j += j2;
                    i2++;
                }
                if (length != ((int) j)) {
                    return false;
                }
                return true;
            }
            throw new IllegalArgumentException(AnonymousClass001.A02(length, length, "endIndex > string.length: ", " > "));
        }
        throw new IllegalArgumentException(AnonymousClass001.A02(length, 0, "endIndex < beginIndex: ", " < "));
    }

    static {
        byte[] copyOf;
        int i;
        int i2;
        int i3;
        char charAt;
        int length = "0123456789abcdef".length();
        byte[] bArr = new byte[length * 4];
        int i4 = 0;
        while (true) {
            if (i4 < length) {
                char charAt2 = "0123456789abcdef".charAt(i4);
                if (C14360o3.A00(charAt2, 128) >= 0) {
                    int i5 = i4;
                    while (i4 < length) {
                        char charAt3 = "0123456789abcdef".charAt(i4);
                        if (C14360o3.A00(charAt3, 128) < 0) {
                            byte b = (byte) charAt3;
                            int i6 = i5 + 1;
                            bArr[i5] = b;
                            i4++;
                            while (true) {
                                i5 = i6;
                                if (i4 < length && C14360o3.A00("0123456789abcdef".charAt(i4), 128) < 0) {
                                    i6++;
                                    bArr[i5] = (byte) "0123456789abcdef".charAt(i4);
                                    i4++;
                                }
                            }
                        } else {
                            if (C14360o3.A00(charAt3, C3OO.FLAG_MOVED) < 0) {
                                i = i5 + 1;
                                bArr[i5] = (byte) ((charAt3 >> 6) | 192);
                            } else if (55296 <= charAt3 && charAt3 < 57344) {
                                if (C14360o3.A00(charAt3, 56319) <= 0 && length > (i3 = i4 + 1) && 56320 <= (charAt = "0123456789abcdef".charAt(i3)) && charAt < 57344) {
                                    int charAt4 = ((charAt3 << '\n') + "0123456789abcdef".charAt(i3)) - 56613888;
                                    int i7 = i5 + 1;
                                    bArr[i5] = (byte) ((charAt4 >> 18) | 240);
                                    int i8 = i7 + 1;
                                    bArr[i7] = (byte) (((charAt4 >> 12) & 63) | 128);
                                    int i9 = i8 + 1;
                                    bArr[i8] = (byte) (((charAt4 >> 6) & 63) | 128);
                                    byte b2 = (byte) ((charAt4 & 63) | 128);
                                    i2 = i9 + 1;
                                    bArr[i9] = b2;
                                    i4 += 2;
                                    i5 = i2;
                                } else {
                                    i2 = i5 + 1;
                                    bArr[i5] = 63;
                                    i4++;
                                    i5 = i2;
                                }
                            } else {
                                int i10 = i5 + 1;
                                bArr[i5] = (byte) ((charAt3 >> '\f') | 224);
                                i = i10 + 1;
                                bArr[i10] = (byte) (((charAt3 >> 6) & 63) | 128);
                            }
                            byte b3 = (byte) ((charAt3 & '?') | 128);
                            i2 = i + 1;
                            bArr[i] = b3;
                            i4++;
                            i5 = i2;
                        }
                    }
                    copyOf = Arrays.copyOf(bArr, i5);
                } else {
                    bArr[i4] = (byte) charAt2;
                    i4++;
                }
            } else {
                copyOf = Arrays.copyOf(bArr, length);
                break;
            }
        }
        C14360o3.A07(copyOf);
        A01 = copyOf;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.net.InetAddress A01(java.lang.String r15, int r16, int r17) {
        /*
            Method dump skipped, instructions count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC09420dr.A01(java.lang.String, int, int):java.net.InetAddress");
    }
}
