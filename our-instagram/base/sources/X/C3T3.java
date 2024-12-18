package X;

/* renamed from: X.3T3, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C3T3 {
    public int A00;
    public String A01;
    public final C3T4 A03 = new C3T4();
    public StringBuilder A02 = new StringBuilder();

    public static final void A02(String str, C3T3 c3t3, int i) {
        String str2;
        String str3 = ((C3T2) c3t3).A00;
        int length = str3.length() - i;
        int length2 = str.length();
        if (length >= length2) {
            for (int i2 = 0; i2 < length2; i2++) {
                if (str.charAt(i2) != (str3.charAt(i + i2) | ' ')) {
                    str2 = AnonymousClass001.A0S("Expected valid boolean literal prefix, but had '", c3t3.A0A(), '\'');
                }
            }
            c3t3.A00 = i + length2;
            return;
        }
        str2 = "Unexpected end of boolean literal";
        c3t3.A0F(str2, "", c3t3.A00);
        throw C00O.createAndThrow();
    }

    public final byte A03() {
        char charAt;
        C3T2 c3t2 = (C3T2) this;
        if (c3t2 instanceof C3TJ) {
            String str = c3t2.A00;
            int A06 = c3t2.A06();
            if (A06 < str.length() && A06 != -1) {
                ((C3T3) c3t2).A00 = A06 + 1;
                charAt = str.charAt(A06);
            } else {
                return (byte) 10;
            }
        } else {
            String str2 = c3t2.A00;
            int i = ((C3T3) c3t2).A00;
            while (i != -1 && i < str2.length()) {
                int i2 = i + 1;
                charAt = str2.charAt(i);
                if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                    ((C3T3) c3t2).A00 = i2;
                } else {
                    i = i2;
                }
            }
            ((C3T3) c3t2).A00 = str2.length();
            return (byte) 10;
        }
        if (charAt < '~') {
            return C3TK.A00[charAt];
        }
        return (byte) 0;
    }

    public final int A06() {
        char charAt;
        int i;
        C3T2 c3t2 = (C3T2) this;
        boolean z = c3t2 instanceof C3TJ;
        int i2 = ((C3T3) c3t2).A00;
        if (z) {
            if (i2 != -1) {
                String str = c3t2.A00;
                while (true) {
                    int length = str.length();
                    if (i2 >= length) {
                        break;
                    }
                    char charAt2 = str.charAt(i2);
                    if (charAt2 != ' ' && charAt2 != '\n' && charAt2 != '\r' && charAt2 != '\t') {
                        if (charAt2 != '/' || (i = i2 + 1) >= length) {
                            break;
                        }
                        char charAt3 = str.charAt(i);
                        if (charAt3 == '/') {
                            i2 = AbstractC001900j.A04(str, '\n', i2 + 2);
                            if (i2 == -1) {
                                i2 = length;
                            }
                        } else {
                            if (charAt3 != '*') {
                                break;
                            }
                            int A08 = AbstractC001900j.A08(str, "*/", i2 + 2, false);
                            if (A08 != -1) {
                                i2 = A08 + 2;
                            } else {
                                ((C3T3) c3t2).A00 = length;
                                c3t2.A0F("Expected end of the block comment: \"*/\", but had EOF instead", "", length);
                                throw C00O.createAndThrow();
                            }
                        }
                    }
                    i2++;
                }
                ((C3T3) c3t2).A00 = i2;
            }
            return i2;
        }
        if (i2 != -1) {
            String str2 = c3t2.A00;
            while (i2 < str2.length() && ((charAt = str2.charAt(i2)) == ' ' || charAt == '\n' || charAt == '\r' || charAt == '\t')) {
                i2++;
            }
            ((C3T3) c3t2).A00 = i2;
        }
        return i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0075 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String A08() {
        /*
            r11 = this;
            r3 = r11
            X.3T2 r3 = (X.C3T2) r3
            r9 = 34
            r3.A0E(r9)
            int r2 = r3.A00
            java.lang.String r7 = r3.A00
            r6 = 0
            int r1 = X.AbstractC001900j.A04(r7, r9, r2)
            r5 = -1
            if (r1 == r5) goto La8
            r4 = r2
        L15:
            if (r4 >= r1) goto L9c
            char r0 = r7.charAt(r4)
            r8 = 92
            if (r0 != r8) goto L6f
            int r2 = r3.A00
            char r1 = r7.charAt(r4)
            r0 = 0
        L26:
            if (r1 == r9) goto L7d
            if (r1 != r8) goto L5e
            java.lang.StringBuilder r10 = r3.A02
            r10.append(r7, r2, r4)
            int r0 = r4 + 1
            int r1 = r7.length()
            if (r0 >= r1) goto L72
            if (r0 == r5) goto L72
            int r2 = r0 + 1
            char r4 = r7.charAt(r0)
            r0 = 117(0x75, float:1.64E-43)
            if (r4 != r0) goto L52
            int r2 = A01(r7, r3, r2)
        L47:
            if (r2 >= r1) goto L75
        L49:
            if (r2 == r5) goto L75
            r4 = r2
            r0 = 1
        L4d:
            char r1 = r7.charAt(r4)
            goto L26
        L52:
            if (r4 >= r0) goto Lb0
            char[] r0 = X.C3TK.A01
            char r0 = r0[r4]
            if (r0 == 0) goto Lb0
            r10.append(r0)
            goto L47
        L5e:
            int r4 = r4 + 1
            int r1 = r7.length()
            if (r4 < r1) goto L4d
            java.lang.StringBuilder r0 = r3.A02
            r0.append(r7, r2, r4)
            r2 = r4
            if (r4 >= r1) goto L75
            goto L49
        L6f:
            int r4 = r4 + 1
            goto L15
        L72:
            java.lang.String r2 = "Expected escape sequence to continue, got EOF"
            goto Lc6
        L75:
            java.lang.String r1 = "Unexpected EOF"
            java.lang.String r0 = ""
            r3.A0F(r1, r0, r5)
            goto Lcd
        L7d:
            if (r0 != 0) goto L8c
            java.lang.CharSequence r0 = r7.subSequence(r2, r4)
            java.lang.String r1 = r0.toString()
        L87:
            int r0 = r4 + 1
            r3.A00 = r0
            return r1
        L8c:
            java.lang.StringBuilder r0 = r3.A02
            r0.append(r7, r2, r4)
            java.lang.String r1 = r0.toString()
            X.C14360o3.A07(r1)
            r0.setLength(r6)
            goto L87
        L9c:
            int r0 = r1 + 1
            r3.A00 = r0
            java.lang.String r1 = r7.substring(r2, r1)
            X.C14360o3.A07(r1)
            return r1
        La8:
            r3.A0A()
            r0 = 1
            r3.A0D(r0, r6)
            goto Lcd
        Lb0:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Invalid escaped char '"
            r1.append(r0)
            r1.append(r4)
            r0 = 39
            r1.append(r0)
            java.lang.String r2 = r1.toString()
        Lc6:
            int r1 = r3.A00
            java.lang.String r0 = ""
            r3.A0F(r2, r0, r1)
        Lcd:
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3T3.A08():java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0021 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0E(char r8) {
        /*
            r7 = this;
            r3 = r7
            X.3T2 r3 = (X.C3T2) r3
            boolean r0 = r3 instanceof X.C3TJ
            if (r0 == 0) goto L22
            java.lang.String r1 = r3.A00
            int r2 = r3.A06()
            int r0 = r1.length()
            r6 = -1
            if (r2 >= r0) goto L47
            if (r2 == r6) goto L47
            char r1 = r1.charAt(r2)
            int r2 = r2 + 1
        L1c:
            r3.A00 = r2
            r5 = r2
            if (r1 != r8) goto L4a
            return
        L22:
            int r5 = r3.A00
            r6 = -1
            if (r5 == r6) goto L4a
            java.lang.String r4 = r3.A00
        L29:
            int r0 = r4.length()
            if (r5 >= r0) goto L47
            int r2 = r5 + 1
            char r1 = r4.charAt(r5)
            r0 = 32
            if (r1 == r0) goto L45
            r0 = 10
            if (r1 == r0) goto L45
            r0 = 13
            if (r1 == r0) goto L45
            r0 = 9
            if (r1 != r0) goto L1c
        L45:
            r5 = r2
            goto L29
        L47:
            r3.A00 = r6
            r5 = r6
        L4a:
            if (r5 <= 0) goto L5d
            r0 = 34
            if (r8 != r0) goto L5d
            int r0 = r5 + (-1)
            r3.A00 = r0     // Catch: java.lang.Throwable -> L59
            java.lang.String r1 = r3.A0A()     // Catch: java.lang.Throwable -> L59
            goto L66
        L59:
            r0 = move-exception
            r3.A00 = r5
            throw r0
        L5d:
            byte[] r0 = X.C3TK.A00
            r1 = r0[r8]
            r0 = 1
            r3.A0D(r1, r0)
            goto L7b
        L66:
            r3.A00 = r5
            java.lang.String r0 = "null"
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L5d
            int r0 = r3.A00
            int r2 = r0 + (-1)
            java.lang.String r1 = "Expected string literal but 'null' literal was found"
            java.lang.String r0 = "Use 'coerceInputValues = true' in 'Json {}' builder to coerce nulls if property has a default value."
            r3.A0F(r1, r0, r2)
        L7b:
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3T3.A0E(char):void");
    }

    public final void A0F(String str, String str2, int i) {
        String A0D;
        C14360o3.A0B(str, 0);
        if (str2.length() == 0) {
            A0D = "";
        } else {
            A0D = AnonymousClass001.A0D(str2, '\n');
        }
        throw WG2.A01(((C3T2) this).A00, AnonymousClass001.A0u(str, " at path: ", this.A03.A00(), A0D), i);
    }

    public final boolean A0G() {
        char charAt;
        C3T2 c3t2 = (C3T2) this;
        if (c3t2 instanceof C3TJ) {
            int A06 = c3t2.A06();
            String str = c3t2.A00;
            if (A06 < str.length() && A06 != -1 && (charAt = str.charAt(A06)) != '}' && charAt != ']' && charAt != ':' && charAt != ',') {
                return true;
            }
            return false;
        }
        int i = ((C3T3) c3t2).A00;
        if (i == -1) {
            return false;
        }
        String str2 = c3t2.A00;
        while (i < str2.length()) {
            char charAt2 = str2.charAt(i);
            if (charAt2 != ' ' && charAt2 != '\n' && charAt2 != '\r' && charAt2 != '\t') {
                ((C3T3) c3t2).A00 = i;
                if (charAt2 == '}' || charAt2 == ']' || charAt2 == ':' || charAt2 == ',') {
                    return false;
                }
                return true;
            }
            i++;
        }
        ((C3T3) c3t2).A00 = i;
        return false;
    }

    public static final int A01(CharSequence charSequence, C3T3 c3t3, int i) {
        int i2 = i + 4;
        if (i2 >= charSequence.length()) {
            c3t3.A00 = i;
            if (i2 < charSequence.length()) {
                return A01(charSequence, c3t3, c3t3.A00);
            }
            c3t3.A0F("Unexpected EOF during unicode escape", "", c3t3.A00);
            throw C00O.createAndThrow();
        }
        c3t3.A02.append((char) ((c3t3.A00(charSequence, i) << 12) + (c3t3.A00(charSequence, i + 1) << 8) + (c3t3.A00(charSequence, i + 2) << 4) + c3t3.A00(charSequence, i + 3)));
        return i2;
    }

    public final byte A04() {
        char charAt;
        if (this instanceof C3TJ) {
            C3T2 c3t2 = (C3T2) this;
            String str = c3t2.A00;
            int A06 = c3t2.A06();
            if (A06 < str.length() && A06 != -1) {
                ((C3T3) c3t2).A00 = A06;
                charAt = str.charAt(A06);
            } else {
                return (byte) 10;
            }
        } else {
            String str2 = ((C3T2) this).A00;
            int i = this.A00;
            while (true) {
                if (i >= str2.length()) {
                    i = -1;
                }
                if (i != -1) {
                    charAt = str2.charAt(i);
                    if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                        this.A00 = i;
                        break;
                    }
                    i++;
                } else {
                    this.A00 = i;
                    return (byte) 10;
                }
            }
        }
        if (charAt < '~') {
            return C3TK.A00[charAt];
        }
        return (byte) 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x00a0, code lost:
    
        r2 = "Unexpected symbol '-' in numeric literal";
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x008f, code lost:
    
        r1 = new java.lang.StringBuilder();
        r1.append("Unexpected symbol '");
        r1.append(r12);
        r0 = "' in numeric literal";
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0121, code lost:
    
        r1.append(r0);
        r2 = r1.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00a4, code lost:
    
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00a5, code lost:
    
        if (r2 == r4) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00a7, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00a8, code lost:
    
        if (r4 == r2) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00aa, code lost:
    
        if (r14 == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00ae, code lost:
    
        if (r4 == (r2 - 1)) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00b0, code lost:
    
        if (r18 == false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00b2, code lost:
    
        if (r1 == false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00ba, code lost:
    
        if (r3.charAt(r2) != '\"') goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00bc, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0109, code lost:
    
        r2 = "Expected closing quotation mark";
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00be, code lost:
    
        r19.A00 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00c0, code lost:
    
        if (r15 == false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00c2, code lost:
    
        r3 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00c5, code lost:
    
        if (r13 != false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00c7, code lost:
    
        r0 = -r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00c9, code lost:
    
        r3 = r3 * java.lang.Math.pow(10.0d, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00d2, code lost:
    
        if (r3 > 9.223372036854776E18d) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00d8, code lost:
    
        if (r3 < (-9.223372036854776E18d)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00e0, code lost:
    
        if (java.lang.Math.floor(r3) != r3) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x00e2, code lost:
    
        r6 = (long) r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x00ef, code lost:
    
        r1 = new java.lang.StringBuilder();
        r1.append("Can't convert ");
        r1.append(r3);
        r1.append(" to Long");
        r2 = r1.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x00ed, code lost:
    
        r0 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x00e3, code lost:
    
        if (r14 != false) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x00e9, code lost:
    
        if (r6 == Long.MIN_VALUE) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x00ec, code lost:
    
        return -r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:?, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x010c, code lost:
    
        r2 = "Expected numeric literal";
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0060, code lost:
    
        if (r12 < '~') goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a4 A[EDGE_INSN: B:57:0x00a4->B:58:0x00a4 BREAK  A[LOOP:0: B:13:0x002e->B:107:0x0045, LOOP_LABEL: LOOP:0: B:13:0x002e->B:107:0x0045], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long A07() {
        /*
            Method dump skipped, instructions count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3T3.A07():long");
    }

    public final String A09() {
        String str = this.A01;
        if (str != null) {
            C14360o3.A0A(str);
            this.A01 = null;
            return str;
        }
        return A08();
    }

    public final String A0A() {
        String obj;
        String str = this.A01;
        if (str != null) {
            C14360o3.A0A(str);
            this.A01 = null;
            return str;
        }
        int A06 = A06();
        String str2 = ((C3T2) this).A00;
        int length = str2.length();
        if (A06 < length && A06 != -1) {
            char charAt = str2.charAt(A06);
            if (charAt < '~') {
                byte b = C3TK.A00[charAt];
                if (b == 1) {
                    return A09();
                }
                if (b != 0) {
                    A0F(AnonymousClass001.A0C("Expected beginning of the string, but got ", str2.charAt(A06)), "", this.A00);
                }
            }
            boolean z = false;
            while (true) {
                char charAt2 = str2.charAt(A06);
                if (charAt2 < '~' && C3TK.A00[charAt2] != 0) {
                    int i = this.A00;
                    if (!z) {
                        obj = str2.subSequence(i, A06).toString();
                    } else {
                        StringBuilder sb = this.A02;
                        sb.append((CharSequence) str2, i, A06);
                        obj = sb.toString();
                        C14360o3.A07(obj);
                        sb.setLength(0);
                    }
                    this.A00 = A06;
                    return obj;
                }
                A06++;
                if (A06 >= length) {
                    this.A02.append((CharSequence) str2, this.A00, A06);
                    if (A06 >= length || A06 == -1) {
                        break;
                    }
                    z = true;
                }
            }
            this.A00 = A06;
            StringBuilder sb2 = this.A02;
            sb2.append((CharSequence) str2, 0, 0);
            String obj2 = sb2.toString();
            C14360o3.A07(obj2);
            sb2.setLength(0);
            return obj2;
        }
        A0F("EOF", "", A06);
        throw C00O.createAndThrow();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("JsonReader(source='");
        sb.append((Object) ((C3T2) this).A00);
        sb.append("', currentPosition=");
        sb.append(this.A00);
        sb.append(')');
        return sb.toString();
    }

    private final int A00(CharSequence charSequence, int i) {
        char c;
        char charAt = charSequence.charAt(i);
        if ('0' <= charAt) {
            if (charAt < ':') {
                return charAt - '0';
            }
            char c2 = 'a';
            if ('a' <= charAt) {
                c = 'g';
            } else {
                c2 = 'A';
                if ('A' <= charAt) {
                    c = 'G';
                }
            }
            if (charAt < c) {
                return (charAt - c2) + 10;
            }
        }
        A0F(AnonymousClass001.A0T("Invalid toHexChar char '", "' in unicode escape", charAt), "", this.A00);
        throw C00O.createAndThrow();
    }

    public final byte A05(byte b) {
        byte A03 = A03();
        if (A03 == b) {
            return A03;
        }
        A0D(b, true);
        throw C00O.createAndThrow();
    }

    public final String A0B() {
        String A0A = A0A();
        if (C14360o3.A0K(A0A, "null") && ((C3T2) this).A00.charAt(this.A00 - 1) != '\"') {
            A0F("Unexpected 'null' value instead of string literal", "", this.A00);
            throw C00O.createAndThrow();
        }
        return A0A;
    }

    public final String A0C(boolean z) {
        String A09;
        byte A04 = A04();
        if (z) {
            if (A04 == 1 || A04 == 0) {
                A09 = A0A();
                this.A01 = A09;
                return A09;
            }
            return null;
        }
        if (A04 == 1) {
            A09 = A09();
            this.A01 = A09;
            return A09;
        }
        return null;
    }

    public final void A0D(byte b, boolean z) {
        String str;
        String A00 = AbstractC68614VXp.A00(b);
        int i = this.A00;
        if (z) {
            i--;
        }
        String str2 = ((C3T2) this).A00;
        if (i != str2.length() && i >= 0) {
            str = String.valueOf(str2.charAt(i));
        } else {
            str = "EOF";
        }
        A0F(AnonymousClass001.A11("Expected ", A00, ", but had '", str, "' instead"), "", i);
        throw C00O.createAndThrow();
    }

    public final boolean A0H() {
        int A06 = A06();
        String str = ((C3T2) this).A00;
        if (A06 >= str.length() || A06 == -1 || str.charAt(A06) != ',') {
            return false;
        }
        this.A00++;
        return true;
    }

    public final boolean A0I(boolean z) {
        char charAt;
        int A06 = A06();
        String str = ((C3T2) this).A00;
        int length = str.length();
        if (A06 >= length) {
            A06 = -1;
        }
        int i = length - A06;
        if (i >= 4 && A06 != -1) {
            int i2 = 0;
            while (true) {
                if ("null".charAt(i2) != str.charAt(A06 + i2)) {
                    break;
                }
                i2++;
                if (i2 >= 4) {
                    if (i <= 4 || ((charAt = str.charAt(A06 + 4)) < '~' && C3TK.A00[charAt] != 0)) {
                        if (z) {
                            this.A00 = A06 + 4;
                            return true;
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
