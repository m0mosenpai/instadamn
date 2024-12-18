package X;

import com.google.common.base.Strings;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.Arrays;

/* loaded from: classes10.dex */
public abstract class SPT {
    public static final SPT A00;
    public static final SPT A01;
    public static final SPT A02;
    public static final SPT A03;
    public static final SPT A04;

    public final SPT A00() {
        C63018Sai c63018Sai;
        RSX rsx = (RSX) this;
        SPT spt = rsx.A02;
        if (spt == null) {
            C63018Sai c63018Sai2 = rsx.A00;
            char[] cArr = c63018Sai2.A07;
            int length = cArr.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    char c = cArr[i];
                    if (c >= 'A' && c <= 'Z') {
                        boolean z = false;
                        int i2 = 0;
                        while (true) {
                            if (i2 >= length) {
                                break;
                            }
                            char c2 = cArr[i2];
                            if (c2 >= 'a' && c2 <= 'z') {
                                z = true;
                                break;
                            }
                            i2++;
                        }
                        C18C.A0H(!z, "Cannot call lowerCase() on a mixed-case alphabet");
                        char[] cArr2 = new char[length];
                        for (int i3 = 0; i3 < length; i3++) {
                            char c3 = cArr[i3];
                            if (c3 >= 'A' && c3 <= 'Z') {
                                c3 = (char) (c3 ^ ' ');
                            }
                            cArr2[i3] = c3;
                        }
                        c63018Sai = new C63018Sai(AnonymousClass001.A0R(c63018Sai2.A04, ".lowerCase()"), cArr2);
                        if (c63018Sai2.A05 && !c63018Sai.A05) {
                            byte[] bArr = c63018Sai.A06;
                            byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                            int i4 = 65;
                            while (true) {
                                boolean z2 = true;
                                if (i4 <= 90) {
                                    int i5 = i4 | 32;
                                    byte b = bArr[i4];
                                    byte b2 = bArr[i5];
                                    if (b == -1) {
                                        copyOf[i4] = b2;
                                    } else {
                                        if (b2 != -1) {
                                            z2 = false;
                                        }
                                        char c4 = (char) i4;
                                        char c5 = (char) i5;
                                        if (z2) {
                                            copyOf[i5] = b;
                                        } else {
                                            throw AbstractC166987dD.A14(Strings.A00("Can't ignoreCase() since '%s' and '%s' encode different values", Character.valueOf(c4), Character.valueOf(c5)));
                                        }
                                    }
                                    i4++;
                                } else {
                                    c63018Sai = new C63018Sai(AnonymousClass001.A0R(c63018Sai.A04, ".ignoreCase()"), copyOf, c63018Sai.A07, true);
                                    break;
                                }
                            }
                        }
                    } else {
                        i++;
                    }
                } else {
                    c63018Sai = c63018Sai2;
                    break;
                }
            }
            if (c63018Sai == c63018Sai2) {
                spt = rsx;
            } else {
                Character ch = rsx.A01;
                if (rsx instanceof RSW) {
                    spt = new RSW(c63018Sai);
                } else if (rsx instanceof RSV) {
                    spt = new RSX(c63018Sai, ch);
                    C18C.A0E(AbstractC167007dF.A1P(c63018Sai.A07.length, 64));
                } else {
                    spt = new RSX(c63018Sai, ch);
                }
            }
            rsx.A02 = spt;
        }
        return spt;
    }

    public final CharSequence A01(CharSequence chars) {
        chars.getClass();
        Character ch = ((RSX) this).A01;
        if (ch != null) {
            char charValue = ch.charValue();
            int length = chars.length();
            do {
                length--;
                if (length < 0) {
                    break;
                }
            } while (chars.charAt(length) == charValue);
            return chars.subSequence(0, length + 1);
        }
        return chars;
    }

    public final String A02(byte[] bytes) {
        int length = bytes.length;
        C18C.A03(0, length, length);
        RSX rsx = (RSX) this;
        C63018Sai c63018Sai = rsx.A00;
        int i = c63018Sai.A02;
        int i2 = c63018Sai.A01;
        StringBuilder A0q = AbstractC58318PtA.A0q(i * AbstractC63123SdR.A01(RoundingMode.CEILING, length, i2));
        try {
            if (rsx instanceof RSW) {
                RSW rsw = (RSW) rsx;
                C18C.A03(0, length, length);
                for (byte b : bytes) {
                    int i3 = b & 255;
                    char[] cArr = rsw.A00;
                    A0q.append(cArr[i3]);
                    A0q.append(cArr[i3 | 256]);
                }
            } else if (rsx instanceof RSV) {
                int i4 = 0;
                C18C.A03(0, length, length);
                for (int i5 = length; i5 >= 3; i5 -= 3) {
                    int i6 = i4 + 1;
                    int i7 = i6 + 1;
                    int i8 = ((bytes[i4] & 255) << 16) | ((bytes[i6] & 255) << 8);
                    i4 = i7 + 1;
                    int i9 = i8 | (bytes[i7] & 255);
                    char[] cArr2 = c63018Sai.A07;
                    A0q.append(cArr2[i9 >>> 18]);
                    A0q.append(cArr2[(i9 >>> 12) & 63]);
                    A0q.append(cArr2[(i9 >>> 6) & 63]);
                    A0q.append(cArr2[i9 & 63]);
                }
                if (i4 < length) {
                    rsx.A04(A0q, bytes, i4, length - i4);
                }
            } else {
                C18C.A03(0, length, length);
                for (int i10 = 0; i10 < length; i10 += i2) {
                    rsx.A04(A0q, bytes, i10, Math.min(i2, length - i10));
                }
            }
            return A0q.toString();
        } catch (IOException e) {
            throw AbstractC58318PtA.A0W(e);
        }
    }

    static {
        C63018Sai c63018Sai = new C63018Sai("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".toCharArray());
        RSX rsx = new RSX(c63018Sai, '=');
        C18C.A0E(AbstractC167007dF.A1P(c63018Sai.A07.length, 64));
        A01 = rsx;
        C63018Sai c63018Sai2 = new C63018Sai("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_".toCharArray());
        RSX rsx2 = new RSX(c63018Sai2, '=');
        C18C.A0E(AbstractC167007dF.A1P(c63018Sai2.A07.length, 64));
        A02 = rsx2;
        A03 = new RSX(new C63018Sai("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567".toCharArray()), '=');
        A04 = new RSX(new C63018Sai("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV".toCharArray()), '=');
        A00 = new RSW(new C63018Sai("base16()", "0123456789ABCDEF".toCharArray()));
    }

    public final byte[] A03(CharSequence chars) {
        int i;
        try {
            CharSequence A012 = A01(chars);
            int length = A012.length();
            RSX rsx = (RSX) this;
            C63018Sai c63018Sai = rsx.A00;
            int i2 = c63018Sai.A00;
            int i3 = (int) (((i2 * length) + 7) / 8);
            byte[] bArr = new byte[i3];
            if (rsx instanceof RSV) {
                CharSequence A013 = rsx.A01(A012);
                if (c63018Sai.A08[A013.length() % c63018Sai.A02]) {
                    int i4 = 0;
                    i = 0;
                    while (i4 < A013.length()) {
                        int i5 = i4 + 1;
                        int i6 = i5 + 1;
                        int A002 = (c63018Sai.A00(A013.charAt(i4)) << 18) | (c63018Sai.A00(A013.charAt(i5)) << 12);
                        int i7 = i + 1;
                        bArr[i] = (byte) (A002 >>> 16);
                        if (i6 < A013.length()) {
                            i4 = i6 + 1;
                            int A003 = A002 | (c63018Sai.A00(A013.charAt(i6)) << 6);
                            i = i7 + 1;
                            AbstractC58318PtA.A19(A003 >>> 8, bArr, i7);
                            if (i4 < A013.length()) {
                                i6 = i4 + 1;
                                i7 = i + 1;
                                AbstractC58318PtA.A19(A003 | c63018Sai.A00(A013.charAt(i4)), bArr, i);
                            }
                        }
                        i = i7;
                        i4 = i6;
                    }
                } else {
                    throw new IOException(AnonymousClass001.A0O("Invalid input length ", A013.length()));
                }
            } else if (rsx instanceof RSW) {
                if (A012.length() % 2 != 1) {
                    int i8 = 0;
                    i = 0;
                    while (i8 < A012.length()) {
                        bArr[i] = (byte) ((c63018Sai.A00(A012.charAt(i8)) << 4) | c63018Sai.A00(A012.charAt(i8 + 1)));
                        i8 += 2;
                        i++;
                    }
                } else {
                    throw new IOException(AnonymousClass001.A0O("Invalid input length ", A012.length()));
                }
            } else {
                CharSequence A014 = rsx.A01(A012);
                int length2 = A014.length();
                boolean[] zArr = c63018Sai.A08;
                int i9 = c63018Sai.A02;
                if (zArr[length2 % i9]) {
                    i = 0;
                    for (int i10 = 0; i10 < A014.length(); i10 += i9) {
                        long j = 0;
                        int i11 = 0;
                        for (int i12 = 0; i12 < i9; i12++) {
                            j <<= i2;
                            if (i10 + i12 < A014.length()) {
                                j |= c63018Sai.A00(A014.charAt(i11 + i10));
                                i11++;
                            }
                        }
                        int i13 = c63018Sai.A01;
                        int i14 = (i13 * 8) - (i11 * i2);
                        int i15 = (i13 - 1) * 8;
                        while (i15 >= i14) {
                            bArr[i] = (byte) ((j >>> i15) & 255);
                            i15 -= 8;
                            i++;
                        }
                    }
                } else {
                    throw new IOException(AnonymousClass001.A0O("Invalid input length ", A014.length()));
                }
            }
            if (i != i3) {
                byte[] bArr2 = new byte[i];
                System.arraycopy(bArr, 0, bArr2, 0, i);
                return bArr2;
            }
            return bArr;
        } catch (C61018Rdm e) {
            throw new IllegalArgumentException(e);
        }
    }
}
