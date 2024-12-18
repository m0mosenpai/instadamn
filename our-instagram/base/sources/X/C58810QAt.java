package X;

import java.io.EOFException;

/* renamed from: X.QAt, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58810QAt extends THX {
    public int A00 = 0;
    public int A01;
    public long A02;
    public String A03;
    public final TWX A04;
    public final InterfaceC65701TsN A05;
    public static final C64531TIl A07 = C64531TIl.A02("'\\");
    public static final C64531TIl A06 = C64531TIl.A02("\"\\");
    public static final C64531TIl A08 = C64531TIl.A02("{}[]:, \n\t\r\f/\\;#=");
    public static final C64531TIl A0A = C64531TIl.A02("\n\r");
    public static final C64531TIl A09 = C64531TIl.A02("*/");

    private int A02(boolean z) {
        int i = 0;
        while (true) {
            InterfaceC65701TsN interfaceC65701TsN = this.A05;
            int i2 = i + 1;
            if (interfaceC65701TsN.EIz(i2)) {
                TWX twx = this.A04;
                byte A00 = twx.A00(i);
                if (A00 != 10 && A00 != 32 && A00 != 13 && A00 != 9) {
                    twx.Em6(i2 - 1);
                    if (A00 != 47 ? A00 != 35 : !interfaceC65701TsN.EIz(2L)) {
                        return A00;
                    }
                    A0P("Use JsonReader.setLenient(true) to accept malformed JSON");
                    throw C00O.createAndThrow();
                }
                i = i2;
            } else {
                if (!z) {
                    return -1;
                }
                throw new EOFException("End of input");
            }
        }
    }

    public static String A04(C58810QAt c58810QAt, C64531TIl c64531TIl) {
        StringBuilder sb = null;
        while (true) {
            long CNO = c58810QAt.A05.CNO(c64531TIl);
            if (CNO != -1) {
                TWX twx = c58810QAt.A04;
                if (twx.A00(CNO) == 92) {
                    if (sb == null) {
                        sb = AbstractC166987dD.A1C();
                    }
                    sb.append(twx.A07(SUN.A00, CNO));
                    twx.readByte();
                    sb.append(c58810QAt.A00());
                } else {
                    String A072 = twx.A07(SUN.A00, CNO);
                    if (sb == null) {
                        twx.readByte();
                        return A072;
                    }
                    sb.append(A072);
                    twx.readByte();
                    return sb.toString();
                }
            } else {
                c58810QAt.A0P("Unterminated string");
                throw C00O.createAndThrow();
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.A00 = 0;
        super.A02[0] = 8;
        super.A00 = 1;
        this.A04.A0A();
        this.A05.close();
    }

    private char A00() {
        String str;
        StringBuilder A1C;
        int i;
        int i2;
        InterfaceC65701TsN interfaceC65701TsN = this.A05;
        if (interfaceC65701TsN.EIz(1L)) {
            TWX twx = this.A04;
            byte readByte = twx.readByte();
            if (readByte != 10 && readByte != 34 && readByte != 39 && readByte != 47 && readByte != 92) {
                if (readByte != 98) {
                    if (readByte != 102) {
                        if (readByte == 110) {
                            return '\n';
                        }
                        if (readByte != 114) {
                            if (readByte != 116) {
                                if (readByte != 117) {
                                    A1C = AbstractC166987dD.A1C();
                                    A1C.append("Invalid escape sequence: \\");
                                    A1C.append((char) readByte);
                                } else {
                                    if (interfaceC65701TsN.EIz(4L)) {
                                        int i3 = 0;
                                        char c = 0;
                                        do {
                                            byte A00 = twx.A00(i3);
                                            char c2 = (char) (c << 4);
                                            if (A00 >= 48) {
                                                if (A00 <= 57) {
                                                    i2 = A00 - 48;
                                                } else if (A00 >= 97) {
                                                    if (A00 <= 102) {
                                                        i = A00 - 97;
                                                        i2 = i + 10;
                                                    }
                                                } else if (A00 >= 65 && A00 <= 70) {
                                                    i = A00 - 65;
                                                    i2 = i + 10;
                                                }
                                                c = (char) (c2 + i2);
                                                i3++;
                                            }
                                            A1C = AbstractC166987dD.A1C();
                                            A1C.append("\\u");
                                            A1C.append(twx.A07(SUN.A00, 4L));
                                        } while (i3 < 4);
                                        twx.Em6(4L);
                                        return c;
                                    }
                                    throw new EOFException(AnonymousClass001.A0R("Unterminated escape sequence at path ", A0H()));
                                }
                                str = A1C.toString();
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
                return (char) readByte;
            }
        } else {
            str = "Unterminated escape sequence";
        }
        A0P(str);
        throw C00O.createAndThrow();
    }

    /* JADX WARN: Code restructure failed: missing block: B:81:0x0129, code lost:
    
        if (r21.A06(r10) != false) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x012b, code lost:
    
        if (r12 != 2) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x012d, code lost:
    
        if (r20 == false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0133, code lost:
    
        if (r0 != Long.MIN_VALUE) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0135, code lost:
    
        if (r19 == false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0139, code lost:
    
        if (r0 != 0) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x013b, code lost:
    
        if (r19 != false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x013d, code lost:
    
        r0 = -r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x013e, code lost:
    
        r21.A02 = r0;
        r4.Em6(r13);
        r11 = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0146, code lost:
    
        r21.A00 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0148, code lost:
    
        return r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0149, code lost:
    
        if (r19 == false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0152, code lost:
    
        r21.A01 = r13;
        r11 = 17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x014c, code lost:
    
        if (r12 == 4) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0150, code lost:
    
        if (r12 != 7) goto L113;
     */
    /* JADX WARN: Removed duplicated region for block: B:116:0x012b A[EDGE_INSN: B:116:0x012b->B:82:0x012b BREAK  A[LOOP:0: B:28:0x0087->B:58:0x00dd], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0161  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int A01(X.C58810QAt r21) {
        /*
            Method dump skipped, instructions count: 573
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58810QAt.A01(X.QAt):int");
    }

    public static String A03(C58810QAt c58810QAt) {
        long CNO = c58810QAt.A05.CNO(A08);
        if (CNO != -1) {
            return c58810QAt.A04.A07(SUN.A00, CNO);
        }
        return c58810QAt.A04.A05();
    }

    public static void A05(C58810QAt c58810QAt, C64531TIl c64531TIl) {
        while (true) {
            long CNO = c58810QAt.A05.CNO(c64531TIl);
            if (CNO != -1) {
                TWX twx = c58810QAt.A04;
                byte A00 = twx.A00(CNO);
                long j = CNO + 1;
                if (A00 == 92) {
                    twx.Em6(j);
                    c58810QAt.A00();
                } else {
                    twx.Em6(j);
                    return;
                }
            } else {
                c58810QAt.A0P("Unterminated string");
                throw C00O.createAndThrow();
            }
        }
    }

    private boolean A06(int i) {
        if (i != 9 && i != 10 && i != 12 && i != 13 && i != 32) {
            if (i != 35) {
                if (i != 44) {
                    if (i != 47 && i != 61) {
                        if (i != 123 && i != 125 && i != 58) {
                            if (i != 59) {
                                switch (i) {
                                    case 91:
                                    case 93:
                                        return false;
                                    case 92:
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
            A0P("Use JsonReader.setLenient(true) to accept malformed JSON");
            throw C00O.createAndThrow();
        }
        return false;
    }

    public C58810QAt(InterfaceC65701TsN interfaceC65701TsN) {
        this.A05 = interfaceC65701TsN;
        this.A04 = interfaceC65701TsN.AEK();
        A0O(6);
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("JsonReader(");
        return AbstractC58323PtF.A0q(this.A05, A1C);
    }
}
