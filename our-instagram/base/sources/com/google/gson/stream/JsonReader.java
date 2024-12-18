package com.google.gson.stream;

import X.AbstractC47832Hr;
import X.AnonymousClass001;
import X.C00O;
import X.C05F;
import X.SSW;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.react.modules.base.IgReactQEModule;
import java.io.Closeable;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;

/* loaded from: classes.dex */
public class JsonReader implements Closeable {
    public int A04;
    public long A06;
    public String A09;
    public int[] A0A;
    public int[] A0B;
    public String[] A0C;
    public final Reader A0E;
    public boolean A07 = false;
    public final char[] A0D = new char[1024];
    public int A05 = 0;
    public int A00 = 0;
    public int A01 = 0;
    public int A02 = 0;
    public int A03 = 0;
    public int A08 = 1;

    /* JADX WARN: Code restructure failed: missing block: B:58:0x0059, code lost:
    
        A05();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:54:0x0044. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String A02() {
        /*
            r6 = this;
            r2 = 0
            r1 = 0
        L2:
            r4 = 0
        L3:
            int r5 = r6.A05
            int r3 = r5 + r4
            int r0 = r6.A00
            if (r3 >= r0) goto L4a
            char[] r3 = r6.A0D
            int r5 = r5 + r4
            char r5 = r3[r5]
            r0 = 9
            if (r5 == r0) goto L5c
            r0 = 10
            if (r5 == r0) goto L5c
            r0 = 12
            if (r5 == r0) goto L5c
            r0 = 13
            if (r5 == r0) goto L5c
            r0 = 32
            if (r5 == r0) goto L5c
            r0 = 35
            if (r5 == r0) goto L59
            r0 = 44
            if (r5 == r0) goto L5c
            r0 = 47
            if (r5 == r0) goto L59
            r0 = 61
            if (r5 == r0) goto L59
            r0 = 123(0x7b, float:1.72E-43)
            if (r5 == r0) goto L5c
            r0 = 125(0x7d, float:1.75E-43)
            if (r5 == r0) goto L5c
            r0 = 58
            if (r5 == r0) goto L5c
            r0 = 59
            if (r5 == r0) goto L59
            switch(r5) {
                case 91: goto L5c;
                case 92: goto L59;
                case 93: goto L5c;
                default: goto L47;
            }
        L47:
            int r4 = r4 + 1
            goto L3
        L4a:
            char[] r3 = r6.A0D
            r0 = 1024(0x400, float:1.435E-42)
            if (r4 >= r0) goto L67
            int r0 = r4 + 1
            boolean r0 = r6.A0B(r0)
            if (r0 == 0) goto L5c
            goto L3
        L59:
            r6.A05()
        L5c:
            r2 = r4
            if (r1 != 0) goto L83
            int r0 = r6.A05
            java.lang.String r1 = new java.lang.String
            r1.<init>(r3, r0, r4)
            goto L8c
        L67:
            if (r1 != 0) goto L74
            r0 = 16
            int r0 = java.lang.Math.max(r4, r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
        L74:
            r1.append(r3, r5, r4)
            int r0 = r6.A05
            int r0 = r0 + r4
            r6.A05 = r0
            r0 = 1
            boolean r0 = r6.A0B(r0)
            if (r0 != 0) goto L2
        L83:
            int r0 = r6.A05
            r1.append(r3, r0, r2)
            java.lang.String r1 = r1.toString()
        L8c:
            int r0 = r6.A05
            int r0 = r0 + r2
            r6.A05 = r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.stream.JsonReader.A02():java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0053, code lost:
    
        A05();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:30:0x0043. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A06() {
        /*
            r4 = this;
        L0:
            r3 = 0
        L1:
            int r2 = r4.A05
            int r1 = r2 + r3
            int r0 = r4.A00
            if (r1 >= r0) goto L49
            char[] r1 = r4.A0D
            int r0 = r2 + r3
            char r1 = r1[r0]
            r0 = 9
            if (r1 == r0) goto L56
            r0 = 10
            if (r1 == r0) goto L56
            r0 = 12
            if (r1 == r0) goto L56
            r0 = 13
            if (r1 == r0) goto L56
            r0 = 32
            if (r1 == r0) goto L56
            r0 = 35
            if (r1 == r0) goto L53
            r0 = 44
            if (r1 == r0) goto L56
            r0 = 47
            if (r1 == r0) goto L53
            r0 = 61
            if (r1 == r0) goto L53
            r0 = 123(0x7b, float:1.72E-43)
            if (r1 == r0) goto L56
            r0 = 125(0x7d, float:1.75E-43)
            if (r1 == r0) goto L56
            r0 = 58
            if (r1 == r0) goto L56
            r0 = 59
            if (r1 == r0) goto L53
            switch(r1) {
                case 91: goto L56;
                case 92: goto L53;
                case 93: goto L56;
                default: goto L46;
            }
        L46:
            int r3 = r3 + 1
            goto L1
        L49:
            r4.A05 = r1
            r0 = 1
            boolean r0 = r4.A0B(r0)
            if (r0 != 0) goto L0
            return
        L53:
            r4.A05()
        L56:
            int r2 = r2 + r3
            r4.A05 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.stream.JsonReader.A06():void");
    }

    public String A0H() {
        return A04(false);
    }

    public String A0I() {
        return A04(true);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0011. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void A0R() {
        /*
            r7 = this;
            r5 = 0
            r6 = 0
        L2:
            int r4 = r7.A03
            if (r4 != 0) goto La
            int r4 = r7.A0E()
        La:
            r1 = 34
            r0 = 39
            java.lang.String r2 = "<skipped>"
            r3 = 1
            switch(r4) {
                case 1: goto L63;
                case 2: goto L51;
                case 3: goto L4d;
                case 4: goto L5b;
                case 5: goto L14;
                case 6: goto L14;
                case 7: goto L14;
                case 8: goto L49;
                case 9: goto L45;
                case 10: goto L41;
                case 11: goto L14;
                case 12: goto L34;
                case 13: goto L30;
                case 14: goto L2c;
                case 15: goto L14;
                case 16: goto L24;
                case 17: goto L23;
                default: goto L14;
            }
        L14:
            r7.A03 = r5
            if (r6 > 0) goto L2
            int[] r2 = r7.A0A
            int r1 = r7.A08
            int r1 = r1 - r3
            r0 = r2[r1]
            int r0 = r0 + 1
            r2[r1] = r0
        L23:
            return
        L24:
            int r1 = r7.A05
            int r0 = r7.A04
            int r1 = r1 + r0
            r7.A05 = r1
            goto L14
        L2c:
            r7.A06()
            goto L37
        L30:
            r7.A07(r1)
            goto L37
        L34:
            r7.A07(r0)
        L37:
            if (r6 != 0) goto L14
            java.lang.String[] r1 = r7.A0C
            int r0 = r7.A08
            int r0 = r0 - r3
            r1[r0] = r2
            goto L14
        L41:
            r7.A06()
            goto L14
        L45:
            r7.A07(r1)
            goto L14
        L49:
            r7.A07(r0)
            goto L14
        L4d:
            r7.A08(r3)
            goto L67
        L51:
            if (r6 != 0) goto L5b
            java.lang.String[] r2 = r7.A0C
            int r1 = r7.A08
            int r1 = r1 - r3
            r0 = 0
            r2[r1] = r0
        L5b:
            int r0 = r7.A08
            int r0 = r0 - r3
            r7.A08 = r0
            int r6 = r6 + (-1)
            goto L14
        L63:
            r0 = 3
            r7.A08(r0)
        L67:
            int r6 = r6 + 1
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.stream.JsonReader.A0R():void");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.A03 = 0;
        this.A0B[0] = 8;
        this.A08 = 1;
        this.A0E.close();
    }

    private char A00() {
        int i;
        int i2;
        if (this.A05 != this.A00 || A0B(1)) {
            char[] cArr = this.A0D;
            int i3 = this.A05;
            int i4 = i3 + 1;
            this.A05 = i4;
            char c = cArr[i3];
            if (c != '\n') {
                if (c != '\"' && c != '\'' && c != '/' && c != '\\') {
                    if (c != 'b') {
                        if (c != 'f') {
                            if (c == 'n') {
                                return '\n';
                            }
                            if (c != 'r') {
                                if (c != 't') {
                                    if (c == 'u') {
                                        if (i4 + 4 <= this.A00 || A0B(4)) {
                                            char c2 = 0;
                                            int i5 = this.A05;
                                            int i6 = i5 + 4;
                                            while (i5 < i6) {
                                                char c3 = cArr[i5];
                                                char c4 = (char) (c2 << 4);
                                                if (c3 >= '0') {
                                                    if (c3 <= '9') {
                                                        i2 = c3 - '0';
                                                    } else if (c3 >= 'a') {
                                                        if (c3 <= 'f') {
                                                            i = c3 - 'a';
                                                            i2 = i + 10;
                                                        }
                                                    } else if (c3 >= 'A' && c3 <= 'F') {
                                                        i = c3 - 'A';
                                                        i2 = i + 10;
                                                    }
                                                    c2 = (char) (c4 + i2);
                                                    i5++;
                                                }
                                                throw new NumberFormatException(AnonymousClass001.A0R("\\u", new String(cArr, i5, 4)));
                                            }
                                            this.A05 = i6;
                                            return c2;
                                        }
                                    } else {
                                        A09("Invalid escape sequence");
                                        throw C00O.createAndThrow();
                                    }
                                } else {
                                    return '\t';
                                }
                            } else {
                                return '\r';
                            }
                        } else {
                            return '\f';
                        }
                    } else {
                        return '\b';
                    }
                } else {
                    return c;
                }
            } else {
                this.A01++;
                this.A02 = i4;
                return c;
            }
        }
        A09("Unterminated escape sequence");
        throw C00O.createAndThrow();
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0039, code lost:
    
        if (r5 != '/') goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x003b, code lost:
    
        r7.A05 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x003e, code lost:
    
        if (r4 != r6) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0040, code lost:
    
        r7.A05 = r4 - 1;
        r1 = A0B(2);
        r4 = r7.A05 + 1;
        r7.A05 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x004e, code lost:
    
        if (r1 != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0050, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0051, code lost:
    
        A05();
        r1 = r3[r4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0058, code lost:
    
        if (r1 == '*') goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0061, code lost:
    
        r1 = r4 + 1;
        r7.A05 = r1;
        r4 = "*\/".length();
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x006b, code lost:
    
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x006f, code lost:
    
        if ((r1 + r4) <= r7.A00) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0075, code lost:
    
        if (A0B(r4) != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0077, code lost:
    
        A09("Unterminated comment");
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0080, code lost:
    
        throw X.C00O.createAndThrow();
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0081, code lost:
    
        r2 = r7.A05;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0087, code lost:
    
        if (r3[r2] != '\n') goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0089, code lost:
    
        r7.A01++;
        r7.A02 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0093, code lost:
    
        r1 = r7.A05 + 1;
        r7.A05 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x009a, code lost:
    
        r0 = r7.A05;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x009c, code lost:
    
        if (r6 >= r4) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00a5, code lost:
    
        if (r3[r0 + r6] != "*\/".charAt(r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00a7, code lost:
    
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x005a, code lost:
    
        if (r1 != '/') goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x005c, code lost:
    
        r7.A05 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:?, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00ae, code lost:
    
        r7.A05 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00b2, code lost:
    
        if (r5 != '#') goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x00b4, code lost:
    
        A05();
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:?, code lost:
    
        return r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int A01(boolean r8) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.stream.JsonReader.A01(boolean):int");
    }

    private String A03(char c) {
        char[] cArr = this.A0D;
        StringBuilder sb = null;
        while (true) {
            int i = this.A05;
            int i2 = this.A00;
            while (true) {
                if (i < i2) {
                    int i3 = i + 1;
                    char c2 = cArr[i];
                    if (c2 == c) {
                        this.A05 = i3;
                        int i4 = (i3 - i) - 1;
                        if (sb == null) {
                            return new String(cArr, i, i4);
                        }
                        sb.append(cArr, i, i4);
                        return sb.toString();
                    }
                    if (c2 == '\\') {
                        this.A05 = i3;
                        int i5 = (i3 - i) - 1;
                        if (sb == null) {
                            sb = new StringBuilder(Math.max((i5 + 1) * 2, 16));
                        }
                        sb.append(cArr, i, i5);
                        sb.append(A00());
                    } else {
                        if (c2 == '\n') {
                            this.A01++;
                            this.A02 = i3;
                        }
                        i = i3;
                    }
                } else {
                    if (sb == null) {
                        sb = new StringBuilder(Math.max((i - i) * 2, 16));
                    }
                    sb.append(cArr, i, i - i);
                    this.A05 = i;
                    if (!A0B(1)) {
                        A09("Unterminated string");
                        throw C00O.createAndThrow();
                    }
                }
            }
        }
    }

    private String A04(boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append('$');
        int i = 0;
        while (true) {
            int i2 = this.A08;
            if (i < i2) {
                int i3 = this.A0B[i];
                if (i3 != 1 && i3 != 2) {
                    if (i3 == 3 || i3 == 4 || i3 == 5) {
                        sb.append('.');
                        String str = this.A0C[i];
                        if (str != null) {
                            sb.append(str);
                        }
                    }
                } else {
                    int i4 = this.A0A[i];
                    if (z && i4 > 0 && i == i2 - 1) {
                        i4--;
                    }
                    sb.append('[');
                    sb.append(i4);
                    sb.append(']');
                }
                i++;
            } else {
                return sb.toString();
            }
        }
    }

    private void A05() {
        if (this.A07) {
            return;
        }
        A09("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw C00O.createAndThrow();
    }

    private void A07(char c) {
        char[] cArr = this.A0D;
        while (true) {
            int i = this.A05;
            int i2 = this.A00;
            while (true) {
                if (i < i2) {
                    int i3 = i + 1;
                    char c2 = cArr[i];
                    if (c2 == c) {
                        this.A05 = i3;
                        return;
                    }
                    if (c2 == '\\') {
                        this.A05 = i3;
                        A00();
                        break;
                    } else {
                        if (c2 == '\n') {
                            this.A01++;
                            this.A02 = i3;
                        }
                        i = i3;
                    }
                } else {
                    this.A05 = i;
                    if (!A0B(1)) {
                        A09("Unterminated string");
                        throw C00O.createAndThrow();
                    }
                }
            }
        }
    }

    private void A08(int i) {
        int i2 = this.A08;
        int[] iArr = this.A0B;
        if (i2 == iArr.length) {
            int i3 = i2 * 2;
            this.A0B = Arrays.copyOf(iArr, i3);
            this.A0A = Arrays.copyOf(this.A0A, i3);
            this.A0C = (String[]) Arrays.copyOf(this.A0C, i3);
        }
        int[] iArr2 = this.A0B;
        int i4 = this.A08;
        this.A08 = i4 + 1;
        iArr2[i4] = i;
    }

    private boolean A0A(char c) {
        if (c != '\t' && c != '\n' && c != '\f' && c != '\r' && c != ' ') {
            if (c != '#') {
                if (c != ',') {
                    if (c != '/' && c != '=') {
                        if (c != '{' && c != '}' && c != ':') {
                            if (c != ';') {
                                switch (c) {
                                    case '[':
                                    case ']':
                                        return false;
                                    case '\\':
                                        break;
                                    default:
                                        return true;
                                }
                            }
                        } else {
                            return false;
                        }
                    }
                } else {
                    return false;
                }
            }
            A05();
            return false;
        }
        return false;
    }

    private boolean A0B(int i) {
        int i2;
        char[] cArr = this.A0D;
        int i3 = this.A02;
        int i4 = this.A05;
        this.A02 = i3 - i4;
        int i5 = this.A00;
        if (i5 != i4) {
            int i6 = i5 - i4;
            this.A00 = i6;
            System.arraycopy(cArr, i4, cArr, 0, i6);
        } else {
            this.A00 = 0;
        }
        this.A05 = 0;
        do {
            Reader reader = this.A0E;
            int i7 = this.A00;
            int read = reader.read(cArr, i7, 1024 - i7);
            if (read == -1) {
                return false;
            }
            i2 = this.A00 + read;
            this.A00 = i2;
            if (this.A01 == 0 && this.A02 == 0 && i2 > 0 && cArr[0] == 65279) {
                this.A05++;
                this.A02 = 1;
                i++;
            }
        } while (i2 < i);
        return true;
    }

    public double A0C() {
        char c;
        String str;
        int i = this.A03;
        if (i == 0) {
            i = A0E();
        }
        if (i == 15) {
            this.A03 = 0;
            int[] iArr = this.A0A;
            int i2 = this.A08 - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.A06;
        }
        if (i == 16) {
            this.A09 = new String(this.A0D, this.A05, this.A04);
            this.A05 += this.A04;
        } else {
            if (i != 8) {
                if (i == 9) {
                    c = '\"';
                } else if (i == 10) {
                    str = A02();
                    this.A09 = str;
                } else if (i != 11) {
                    throw new IllegalStateException(AnonymousClass001.A0g("Expected a double but was ", SSW.A00(A0G()), A0L()));
                }
            } else {
                c = '\'';
            }
            str = A03(c);
            this.A09 = str;
        }
        this.A03 = 11;
        double parseDouble = Double.parseDouble(this.A09);
        if (this.A07 || (!Double.isNaN(parseDouble) && !Double.isInfinite(parseDouble))) {
            this.A09 = null;
            this.A03 = 0;
            int[] iArr2 = this.A0A;
            int i3 = this.A08 - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return parseDouble;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("JSON forbids NaN and infinities: ");
        sb.append(parseDouble);
        sb.append(A0L());
        throw new IOException(sb.toString());
    }

    public int A0D() {
        char c;
        String A03;
        int i;
        int i2 = this.A03;
        if (i2 == 0) {
            i2 = A0E();
        }
        if (i2 == 15) {
            long j = this.A06;
            i = (int) j;
            if (j != i) {
                throw new NumberFormatException(AnonymousClass001.A0e("Expected an int but was ", A0L(), j));
            }
        } else {
            if (i2 == 16) {
                A03 = new String(this.A0D, this.A05, this.A04);
                this.A09 = A03;
                this.A05 += this.A04;
            } else {
                try {
                    if (i2 != 8) {
                        if (i2 != 9) {
                            if (i2 == 10) {
                                A03 = A02();
                                this.A09 = A03;
                                int parseInt = Integer.parseInt(A03);
                                this.A03 = 0;
                                int[] iArr = this.A0A;
                                int i3 = this.A08 - 1;
                                iArr[i3] = iArr[i3] + 1;
                                return parseInt;
                            }
                            throw new IllegalStateException(AnonymousClass001.A0g("Expected an int but was ", SSW.A00(A0G()), A0L()));
                        }
                        c = '\"';
                    } else {
                        c = '\'';
                    }
                    int parseInt2 = Integer.parseInt(A03);
                    this.A03 = 0;
                    int[] iArr2 = this.A0A;
                    int i32 = this.A08 - 1;
                    iArr2[i32] = iArr2[i32] + 1;
                    return parseInt2;
                } catch (NumberFormatException unused) {
                }
                A03 = A03(c);
                this.A09 = A03;
            }
            this.A03 = 11;
            double parseDouble = Double.parseDouble(A03);
            i = (int) parseDouble;
            if (i == parseDouble) {
                this.A09 = null;
            } else {
                throw new NumberFormatException(AnonymousClass001.A0g("Expected an int but was ", A03, A0L()));
            }
        }
        this.A03 = 0;
        int[] iArr3 = this.A0A;
        int i4 = this.A08 - 1;
        iArr3[i4] = iArr3[i4] + 1;
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x0146, code lost:
    
        if (A0A(r0) != false) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x01b3, code lost:
    
        if (r12 == 1) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x022e, code lost:
    
        if (r12 != 5) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0148, code lost:
    
        if (r11 != 2) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x014a, code lost:
    
        if (r20 == false) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0150, code lost:
    
        if (r2 != Long.MIN_VALUE) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0152, code lost:
    
        if (r19 == false) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0158, code lost:
    
        if (r2 != 0) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x015a, code lost:
    
        if (r19 != false) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x015c, code lost:
    
        r2 = -r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x015d, code lost:
    
        r21.A06 = r2;
        r21.A05 += r12;
        r2 = 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0166, code lost:
    
        r21.A03 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0168, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0169, code lost:
    
        if (r19 == false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0170, code lost:
    
        r21.A04 = r12;
        r2 = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x016c, code lost:
    
        if (r11 == 4) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x016e, code lost:
    
        if (r11 != 7) goto L121;
     */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0175 A[EDGE_INSN: B:122:0x0175->B:52:0x0175 BREAK  A[LOOP:0: B:27:0x0081->B:89:0x00e1], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x009e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int A0E() {
        /*
            Method dump skipped, instructions count: 712
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.stream.JsonReader.A0E():int");
    }

    public long A0F() {
        char c;
        String A03;
        int i = this.A03;
        if (i == 0) {
            i = A0E();
        }
        if (i == 15) {
            this.A03 = 0;
            int[] iArr = this.A0A;
            int i2 = this.A08 - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.A06;
        }
        if (i == 16) {
            A03 = new String(this.A0D, this.A05, this.A04);
            this.A09 = A03;
            this.A05 += this.A04;
        } else {
            try {
                if (i != 8) {
                    if (i != 9) {
                        if (i == 10) {
                            A03 = A02();
                            this.A09 = A03;
                            long parseLong = Long.parseLong(A03);
                            this.A03 = 0;
                            int[] iArr2 = this.A0A;
                            int i3 = this.A08 - 1;
                            iArr2[i3] = iArr2[i3] + 1;
                            return parseLong;
                        }
                        throw new IllegalStateException(AnonymousClass001.A0g("Expected a long but was ", SSW.A00(A0G()), A0L()));
                    }
                    c = '\"';
                } else {
                    c = '\'';
                }
                long parseLong2 = Long.parseLong(A03);
                this.A03 = 0;
                int[] iArr22 = this.A0A;
                int i32 = this.A08 - 1;
                iArr22[i32] = iArr22[i32] + 1;
                return parseLong2;
            } catch (NumberFormatException unused) {
            }
            A03 = A03(c);
            this.A09 = A03;
        }
        this.A03 = 11;
        double parseDouble = Double.parseDouble(A03);
        long j = (long) parseDouble;
        if (j == parseDouble) {
            this.A09 = null;
            this.A03 = 0;
            int[] iArr3 = this.A0A;
            int i4 = this.A08 - 1;
            iArr3[i4] = iArr3[i4] + 1;
            return j;
        }
        throw new NumberFormatException(AnonymousClass001.A0g("Expected a long but was ", A03, A0L()));
    }

    public Integer A0G() {
        int i = this.A03;
        if (i == 0) {
            i = A0E();
        }
        switch (i) {
            case 1:
                return C05F.A0C;
            case 2:
                return C05F.A0N;
            case 3:
                return C05F.A00;
            case 4:
                return C05F.A01;
            case 5:
            case 6:
                return C05F.A15;
            case 7:
                return C05F.A1F;
            case 8:
            case 9:
            case 10:
            case 11:
            default:
                return C05F.A0j;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
            case 14:
                return C05F.A0Y;
            case Process.SIGTERM /* 15 */:
            case 16:
                return C05F.A0u;
            case 17:
                return C05F.A1I;
        }
    }

    public String A0J() {
        char c;
        String A03;
        int i = this.A03;
        if (i == 0) {
            i = A0E();
        }
        if (i == 14) {
            A03 = A02();
        } else {
            if (i == 12) {
                c = '\'';
            } else if (i == 13) {
                c = '\"';
            } else {
                throw new IllegalStateException(AnonymousClass001.A0g("Expected a name but was ", SSW.A00(A0G()), A0L()));
            }
            A03 = A03(c);
        }
        this.A03 = 0;
        this.A0C[this.A08 - 1] = A03;
        return A03;
    }

    public String A0K() {
        String str;
        int i = this.A03;
        if (i == 0) {
            i = A0E();
        }
        if (i == 10) {
            str = A02();
        } else if (i == 8) {
            str = A03('\'');
        } else if (i == 9) {
            str = A03('\"');
        } else if (i == 11) {
            str = this.A09;
            this.A09 = null;
        } else if (i == 15) {
            str = Long.toString(this.A06);
        } else if (i == 16) {
            str = new String(this.A0D, this.A05, this.A04);
            this.A05 += this.A04;
        } else {
            throw new IllegalStateException(AnonymousClass001.A0g("Expected a string but was ", SSW.A00(A0G()), A0L()));
        }
        this.A03 = 0;
        int[] iArr = this.A0A;
        int i2 = this.A08 - 1;
        iArr[i2] = iArr[i2] + 1;
        return str;
    }

    public final String A0L() {
        return AnonymousClass001.A0x(" at line ", " column ", " path ", A0H(), this.A01 + 1, (this.A05 - this.A02) + 1);
    }

    public void A0M() {
        int i = this.A03;
        if (i == 0) {
            i = A0E();
        }
        if (i == 3) {
            A08(1);
            this.A0A[this.A08 - 1] = 0;
            this.A03 = 0;
            return;
        }
        throw new IllegalStateException(AnonymousClass001.A0g("Expected BEGIN_ARRAY but was ", SSW.A00(A0G()), A0L()));
    }

    public void A0N() {
        int i = this.A03;
        if (i == 0) {
            i = A0E();
        }
        if (i == 1) {
            A08(3);
            this.A03 = 0;
            return;
        }
        throw new IllegalStateException(AnonymousClass001.A0g("Expected BEGIN_OBJECT but was ", SSW.A00(A0G()), A0L()));
    }

    public void A0O() {
        int i = this.A03;
        if (i == 0) {
            i = A0E();
        }
        if (i == 4) {
            int i2 = this.A08 - 1;
            this.A08 = i2;
            int[] iArr = this.A0A;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
            this.A03 = 0;
            return;
        }
        throw new IllegalStateException(AnonymousClass001.A0g("Expected END_ARRAY but was ", SSW.A00(A0G()), A0L()));
    }

    public void A0P() {
        int i = this.A03;
        if (i == 0) {
            i = A0E();
        }
        if (i == 2) {
            int i2 = this.A08 - 1;
            this.A08 = i2;
            this.A0C[i2] = null;
            int[] iArr = this.A0A;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
            this.A03 = 0;
            return;
        }
        throw new IllegalStateException(AnonymousClass001.A0g("Expected END_OBJECT but was ", SSW.A00(A0G()), A0L()));
    }

    public void A0Q() {
        int i = this.A03;
        if (i == 0) {
            i = A0E();
        }
        if (i == 7) {
            this.A03 = 0;
            int[] iArr = this.A0A;
            int i2 = this.A08 - 1;
            iArr[i2] = iArr[i2] + 1;
            return;
        }
        throw new IllegalStateException(AnonymousClass001.A0g("Expected null but was ", SSW.A00(A0G()), A0L()));
    }

    public boolean A0S() {
        int i = this.A03;
        if (i == 0) {
            i = A0E();
        }
        if (i != 2 && i != 4 && i != 17) {
            return true;
        }
        return false;
    }

    public boolean A0T() {
        int i = this.A03;
        if (i == 0) {
            i = A0E();
        }
        if (i == 5) {
            this.A03 = 0;
            int[] iArr = this.A0A;
            int i2 = this.A08 - 1;
            iArr[i2] = iArr[i2] + 1;
            return true;
        }
        if (i == 6) {
            this.A03 = 0;
            int[] iArr2 = this.A0A;
            int i3 = this.A08 - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return false;
        }
        throw new IllegalStateException(AnonymousClass001.A0g("Expected a boolean but was ", SSW.A00(A0G()), A0L()));
    }

    public JsonReader(Reader reader) {
        int[] iArr = new int[32];
        this.A0B = iArr;
        iArr[0] = 6;
        this.A0C = new String[32];
        this.A0A = new int[32];
        AbstractC47832Hr.A00(reader, "in == null");
        this.A0E = reader;
    }

    private void A09(String str) {
        throw new IOException(AnonymousClass001.A0R(str, A0L()));
    }

    public String toString() {
        return AnonymousClass001.A0R(getClass().getSimpleName(), A0L());
    }
}
