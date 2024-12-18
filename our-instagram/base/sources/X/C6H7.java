package X;

import android.text.TextUtils;
import com.facebook.forker.Process;
import java.util.Locale;

/* renamed from: X.6H7, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6H7 {
    public static final C6H7 A02;
    public static final C6H7 A03;
    public static final InterfaceC78793fl A04;
    public static final String A05;
    public static final String A06;
    public final InterfaceC78793fl A00;
    public final boolean A01;

    static {
        InterfaceC78793fl interfaceC78793fl = AbstractC78763fi.A01;
        A04 = interfaceC78793fl;
        A05 = Character.toString((char) 8206);
        A06 = Character.toString((char) 8207);
        A02 = new C6H7(interfaceC78793fl, false);
        A03 = new C6H7(interfaceC78793fl, true);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:50:0x007a. Please report as an issue. */
    public static int A00(CharSequence charSequence) {
        byte directionality;
        byte directionality2;
        byte[] bArr = A3H.A00;
        int length = charSequence.length();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i < length) {
                if (i2 == 0) {
                    char charAt = charSequence.charAt(i);
                    if (Character.isHighSurrogate(charAt)) {
                        int codePointAt = Character.codePointAt(charSequence, i);
                        i += Character.charCount(codePointAt);
                        directionality2 = Character.getDirectionality(codePointAt);
                    } else {
                        i++;
                        if (charAt < 1792) {
                            directionality2 = A3H.A00[charAt];
                        } else {
                            directionality2 = Character.getDirectionality(charAt);
                        }
                    }
                    if (directionality2 != 0) {
                        if (directionality2 != 1 && directionality2 != 2) {
                            if (directionality2 != 9) {
                                switch (directionality2) {
                                    case 14:
                                    case Process.SIGTERM /* 15 */:
                                        i4++;
                                        i3 = -1;
                                        continue;
                                    case 16:
                                    case 17:
                                        i4++;
                                        i3 = 1;
                                        continue;
                                    case 18:
                                        i4--;
                                        i3 = 0;
                                        continue;
                                }
                            }
                        } else if (i4 == 0) {
                            return 1;
                        }
                    } else if (i4 == 0) {
                        return -1;
                    }
                    i2 = i4;
                }
            } else if (i2 == 0) {
                return 0;
            }
        }
        if (i3 != 0) {
            return i3;
        }
        while (i > 0) {
            int i5 = i - 1;
            char charAt2 = charSequence.charAt(i5);
            if (Character.isLowSurrogate(charAt2)) {
                int codePointBefore = Character.codePointBefore(charSequence, i);
                i -= Character.charCount(codePointBefore);
                directionality = Character.getDirectionality(codePointBefore);
            } else {
                i = i5;
                if (charAt2 < 1792) {
                    directionality = A3H.A00[charAt2];
                } else {
                    directionality = Character.getDirectionality(charAt2);
                }
            }
            switch (directionality) {
                case 14:
                case Process.SIGTERM /* 15 */:
                    if (i2 == i4) {
                        return -1;
                    }
                    i4--;
                case 16:
                case 17:
                    if (i2 == i4) {
                        return 1;
                    }
                    i4--;
                case 18:
                    i4++;
            }
        }
        return 0;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:14:0x002f. Please report as an issue. */
    public static int A01(CharSequence charSequence) {
        byte directionality;
        byte[] bArr = A3H.A00;
        int length = charSequence.length();
        int i = 0;
        int i2 = 0;
        while (length > 0) {
            char charAt = charSequence.charAt(length - 1);
            if (Character.isLowSurrogate(charAt)) {
                int codePointBefore = Character.codePointBefore(charSequence, length);
                length -= Character.charCount(codePointBefore);
                directionality = Character.getDirectionality(codePointBefore);
            } else {
                length--;
                if (charAt < 1792) {
                    directionality = A3H.A00[charAt];
                } else {
                    directionality = Character.getDirectionality(charAt);
                }
            }
            if (directionality != 0) {
                if (directionality != 1 && directionality != 2) {
                    if (directionality != 9) {
                        switch (directionality) {
                            case 14:
                            case Process.SIGTERM /* 15 */:
                                if (i2 == i) {
                                    return -1;
                                }
                                i--;
                                break;
                            case 16:
                            case 17:
                                if (i2 == i) {
                                    return 1;
                                }
                                i--;
                                break;
                            case 18:
                                i++;
                                break;
                        }
                    } else {
                        continue;
                    }
                } else if (i == 0) {
                    return 1;
                }
            } else if (i == 0) {
                return -1;
            }
            if (i2 == 0) {
                i2 = i;
            }
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.text.SpannableStringBuilder A03(X.InterfaceC78793fl r7, java.lang.CharSequence r8) {
        /*
            r6 = this;
            if (r8 != 0) goto L4
            r2 = 0
            return r2
        L4:
            r4 = 0
            int r0 = r8.length()
            boolean r5 = r7.CcD(r8, r4, r0)
            android.text.SpannableStringBuilder r2 = new android.text.SpannableStringBuilder
            r2.<init>()
            if (r5 == 0) goto L85
            X.3fl r1 = X.AbstractC78763fi.A05
        L16:
            int r0 = r8.length()
            boolean r0 = r1.CcD(r8, r4, r0)
            boolean r3 = r6.A01
            if (r3 != 0) goto L76
            if (r0 != 0) goto L2b
            int r1 = A00(r8)
            r0 = 1
            if (r1 != r0) goto L82
        L2b:
            java.lang.String r0 = X.C6H7.A05
        L2d:
            r2.append(r0)
            if (r5 == r3) goto L72
            r0 = 8234(0x202a, float:1.1538E-41)
            if (r5 == 0) goto L38
            r0 = 8235(0x202b, float:1.154E-41)
        L38:
            r2.append(r0)
            r2.append(r8)
            r0 = 8236(0x202c, float:1.1541E-41)
            r2.append(r0)
        L43:
            if (r5 == 0) goto L6f
            X.3fl r1 = X.AbstractC78763fi.A05
        L47:
            int r0 = r8.length()
            boolean r0 = r1.CcD(r8, r4, r0)
            if (r3 != 0) goto L60
            if (r0 != 0) goto L5a
            int r1 = A01(r8)
            r0 = 1
            if (r1 != r0) goto L6c
        L5a:
            java.lang.String r0 = X.C6H7.A05
        L5c:
            r2.append(r0)
            return r2
        L60:
            if (r0 == 0) goto L69
            int r1 = A01(r8)
            r0 = -1
            if (r1 != r0) goto L6c
        L69:
            java.lang.String r0 = X.C6H7.A06
            goto L5c
        L6c:
            java.lang.String r0 = ""
            goto L5c
        L6f:
            X.3fl r1 = X.AbstractC78763fi.A04
            goto L47
        L72:
            r2.append(r8)
            goto L43
        L76:
            if (r0 == 0) goto L7f
            int r1 = A00(r8)
            r0 = -1
            if (r1 != r0) goto L82
        L7f:
            java.lang.String r0 = X.C6H7.A06
            goto L2d
        L82:
            java.lang.String r0 = ""
            goto L2d
        L85:
            X.3fl r1 = X.AbstractC78763fi.A04
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6H7.A03(X.3fl, java.lang.CharSequence):android.text.SpannableStringBuilder");
    }

    public final boolean A04(String str) {
        return this.A00.CcD(str, 0, str.length());
    }

    public C6H7(InterfaceC78793fl interfaceC78793fl, boolean z) {
        this.A01 = z;
        this.A00 = interfaceC78793fl;
    }

    public static C6H7 A02() {
        if (TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1) {
            return A03;
        }
        return A02;
    }
}
