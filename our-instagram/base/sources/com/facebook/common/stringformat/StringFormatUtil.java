package com.facebook.common.stringformat;

import X.AnonymousClass001;
import java.util.Formatter;
import java.util.MissingFormatArgumentException;
import java.util.UnknownFormatConversionException;

/* loaded from: classes.dex */
public class StringFormatUtil {
    public static final Object[] A00 = {null};

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0031, code lost:
    
        return -3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0061, code lost:
    
        return A03(r12, r13, r3, r2, r6);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int A00(java.lang.Object r8, java.lang.Object r9, java.lang.Object r10, java.lang.Object r11, java.lang.String r12, java.lang.StringBuilder r13, int r14) {
        /*
            r6 = 0
            if (r13 != 0) goto L4
            r6 = 1
        L4:
            r7 = -1
            r5 = 0
            if (r14 != 0) goto L9
            r5 = -1
        L9:
            r4 = r5
            r3 = 0
            r2 = 0
        Lc:
            if (r4 >= r14) goto L5d
            if (r4 == r7) goto L50
            r1 = 1
            if (r4 == 0) goto L4b
            if (r4 == r1) goto L46
            r0 = 2
            if (r4 == r0) goto L41
            r0 = 3
            if (r4 != r0) goto L57
            int r0 = A01(r11, r12, r13, r3, r1)
        L1f:
            if (r0 == r7) goto L32
            if (r6 == 0) goto L24
            int r2 = r2 + r0
        L24:
            int r3 = A02(r12, r3)
            r0 = -200(0xffffffffffffff38, float:NaN)
            if (r4 != r5) goto L33
            if (r3 != r0) goto L33
            r7 = -2
            if (r6 != 0) goto L32
        L31:
            r7 = -3
        L32:
            return r7
        L33:
            if (r3 >= 0) goto L3e
            if (r3 == r0) goto L3b
            r0 = -201(0xffffffffffffff37, float:NaN)
            if (r3 != r0) goto L5d
        L3b:
            if (r6 == 0) goto L31
            return r2
        L3e:
            int r4 = r4 + 1
            goto Lc
        L41:
            int r0 = A01(r10, r12, r13, r3, r1)
            goto L1f
        L46:
            int r0 = A01(r9, r12, r13, r3, r1)
            goto L1f
        L4b:
            int r0 = A01(r8, r12, r13, r3, r1)
            goto L1f
        L50:
            r1 = 0
            r0 = 0
            int r0 = A01(r1, r12, r13, r3, r0)
            goto L1f
        L57:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L5d:
            int r7 = A03(r12, r13, r3, r2, r6)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.stringformat.StringFormatUtil.A00(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.String, java.lang.StringBuilder, int):int");
    }

    public static int A04(String str, StringBuilder sb, Object... objArr) {
        boolean z;
        boolean z2 = true;
        int i = 0;
        boolean z3 = false;
        if (sb == null) {
            z3 = true;
        }
        if (objArr != null && objArr.length != 0) {
            z = false;
        } else {
            objArr = A00;
            z = true;
        }
        int length = objArr.length;
        int i2 = 0;
        int i3 = 0;
        boolean z4 = false;
        while (i < length) {
            int A01 = A01(objArr[i], str, sb, i2, !z);
            if (A01 == -1) {
                return -1;
            }
            if (z3) {
                i3 += A01;
            }
            i2 = A02(str, i2);
            if (i2 == -200) {
                break;
            }
            if (i2 == -201) {
                break;
            }
            i++;
            z4 = true;
        }
        z2 = z4;
        if (z3 && !z2) {
            return -2;
        }
        if (i2 != -200 && i2 != -201) {
            return A03(str, sb, i2, i3, z3);
        }
        if (z3) {
            return i3;
        }
        return -3;
    }

    public static String A05(Object obj, Object obj2, Object obj3, Object obj4, String str, Object[] objArr, int i) {
        int A002;
        Object[] objArr2 = objArr;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            A002 = A04(str, null, objArr);
                        } else {
                            A002 = A00(obj, obj2, obj3, obj4, str, null, 4);
                        }
                    } else {
                        A002 = A00(obj, obj2, obj3, null, str, null, 3);
                    }
                } else {
                    A002 = A00(obj, obj2, null, null, str, null, 2);
                }
            } else {
                A002 = A00(obj, null, null, null, str, null, 1);
            }
        } else {
            A002 = A00(null, null, null, null, str, null, 0);
        }
        if (A002 == -1) {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i == 4) {
                                objArr2 = new Object[]{obj, obj2, obj3, obj4};
                            }
                        } else {
                            objArr2 = new Object[]{obj, obj2, obj3};
                        }
                    } else {
                        objArr2 = new Object[]{obj, obj2};
                    }
                } else {
                    objArr2 = new Object[]{obj};
                }
            } else {
                objArr2 = new Object[0];
            }
            try {
                return String.format(null, str, objArr2);
            } catch (MissingFormatArgumentException | UnknownFormatConversionException e) {
                throw new RuntimeException(AnonymousClass001.A0g(e.getMessage(), ": ", str));
            }
        }
        if (A002 == -2) {
            return str;
        }
        StringBuilder sb = new StringBuilder(A002);
        if (i == -1) {
            A04(str, sb, objArr2);
        } else {
            A00(obj, obj2, obj3, obj4, str, sb, i);
        }
        return sb.toString();
    }

    public static void appendFormatStrLocaleSafe(StringBuilder sb, String str, Object... objArr) {
        int A04 = A04(str, null, objArr);
        if (A04 == -1) {
            new Formatter(sb).format(null, str, objArr);
        } else if (A04 == -2) {
            sb.append(str);
        } else {
            sb.ensureCapacity(A04);
            A04(str, sb, objArr);
        }
    }

    public static String formatStrLocaleSafe(String str) {
        return A05(null, null, null, null, str, null, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x008c, code lost:
    
        if (r0 == null) goto L60;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x009a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int A01(java.lang.Object r7, java.lang.String r8, java.lang.StringBuilder r9, int r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.stringformat.StringFormatUtil.A01(java.lang.Object, java.lang.String, java.lang.StringBuilder, int, boolean):int");
    }

    public static int A02(String str, int i) {
        int i2;
        char charAt;
        int length = str.length();
        boolean z = false;
        while (i < length) {
            if (str.charAt(i) == '%' && length > (i2 = i + 1) && ((charAt = str.charAt(i2)) == 's' || charAt == 'd' || charAt == '%')) {
                int i3 = i + 1;
                if (str.charAt(i3) == '%') {
                    i = i3;
                    z = true;
                } else {
                    return i + 2;
                }
            }
            i++;
        }
        if (!z) {
            return -200;
        }
        return -201;
    }

    public static int A03(String str, StringBuilder sb, int i, int i2, boolean z) {
        int length = str.length();
        int i3 = 0;
        while (i < length) {
            char charAt = str.charAt(i);
            if (charAt != '%' || (length > (i = i + 1) && str.charAt(i) == '%')) {
                if (sb == null) {
                    i3++;
                } else {
                    sb.append(charAt);
                }
                i++;
            } else {
                if (z) {
                    return -1;
                }
                throw new AssertionError();
            }
        }
        if (!z) {
            return -3;
        }
        return i2 + i3;
    }

    public static String formatStrLocaleSafe(String str, Object obj, Object obj2) {
        return A05(obj, obj2, null, null, str, null, 2);
    }

    public static String formatStrLocaleSafe(String str, Object obj, Object obj2, Object obj3, Object obj4) {
        return A05(obj, obj2, obj3, obj4, str, null, 4);
    }

    public static String formatStrLocaleSafe(String str, Object obj, Object obj2, Object obj3) {
        return A05(obj, obj2, obj3, null, str, null, 3);
    }

    public static String formatStrLocaleSafe(String str, Object obj) {
        return A05(obj, null, null, null, str, null, 1);
    }

    public static String formatStrLocaleSafe(String str, Object... objArr) {
        return A05(null, null, null, null, str, objArr, -1);
    }
}
