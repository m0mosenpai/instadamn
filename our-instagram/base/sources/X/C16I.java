package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.common.dextricks.JITProfilePQR;
import com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsHelper;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.16I, reason: invalid class name */
/* loaded from: classes.dex */
public final class C16I extends C16J {
    public int A00;
    public int A01;
    public long A02;
    public boolean A03;
    public char[] A04;
    public C44T A05;
    public Reader A06;
    public boolean A07;
    public final int A08;
    public final AnonymousClass168 A09;
    public static final int A0I = EnumC222315z.ALLOW_TRAILING_COMMA.A00;
    public static final int A0C = EnumC222315z.ALLOW_NUMERIC_LEADING_ZEROS.A00;
    public static final int A0H = EnumC222315z.ALLOW_NON_NUMERIC_NUMBERS.A00;
    public static final int A0A = EnumC222315z.ALLOW_MISSING_VALUES.A00;
    public static final int A0F = EnumC222315z.ALLOW_SINGLE_QUOTES.A00;
    public static final int A0G = EnumC222315z.ALLOW_UNQUOTED_FIELD_NAMES.A00;
    public static final int A0E = EnumC222315z.ALLOW_COMMENTS.A00;
    public static final int A0B = EnumC222315z.ALLOW_YAML_COMMENTS.A00;
    public static final int[] A0D = AnonymousClass167.A02;

    public C16I(C44T c44t, C16H c16h, AnonymousClass168 anonymousClass168, char[] cArr, int i, int i2) {
        super(c16h, i);
        this.A06 = null;
        this.A05 = c44t;
        this.A04 = cArr;
        super.A04 = 0;
        super.A03 = i2;
        super.A02 = 0;
        this.A0F = 0L;
        this.A09 = anonymousClass168;
        this.A08 = anonymousClass168.A0A;
        this.A07 = true;
    }

    private final C16R A04() {
        C16P A06;
        this.A0K = false;
        C16R c16r = this.A0H;
        this.A0H = null;
        if (c16r == C16R.A0C) {
            A06 = this.A0B.A05(super.A09, super.A08);
        } else {
            if (c16r == C16R.A0D) {
                A06 = this.A0B.A06(super.A09, super.A08);
            }
            ((C16K) this).A00 = c16r;
            return c16r;
        }
        this.A0B = A06;
        ((C16K) this).A00 = c16r;
        return c16r;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x003b, code lost:
    
        if (A1J() == X.C16R.A0I) goto L16;
     */
    @Override // X.C16L
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int A1E(int r5) {
        /*
            r4 = this;
            r3 = -1
            X.16R r1 = r4.A00
            X.16R r0 = X.C16R.A0A
            if (r1 != r0) goto L35
            r0 = 0
            r4.A0K = r0
            X.16R r1 = r4.A0H
            r0 = 0
            r4.A0H = r0
            r4.A00 = r1
            X.16R r0 = X.C16R.A0I
            if (r1 == r0) goto L3d
            X.16R r0 = X.C16R.A0C
            if (r1 != r0) goto L26
            X.16P r2 = r4.A0B
            int r1 = r4.A09
            int r0 = r4.A08
            X.16P r0 = r2.A05(r1, r0)
        L23:
            r4.A0B = r0
        L25:
            return r3
        L26:
            X.16R r0 = X.C16R.A0D
            if (r1 != r0) goto L25
            X.16P r2 = r4.A0B
            int r1 = r4.A09
            int r0 = r4.A08
            X.16P r0 = r2.A06(r1, r0)
            goto L23
        L35:
            X.16R r1 = r4.A1J()
            X.16R r0 = X.C16R.A0I
            if (r1 != r0) goto L25
        L3d:
            int r3 = r4.A0i()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16I.A1E(int):int");
    }

    @Override // X.C16L
    public final String A1N() {
        C16R c16r;
        String A25;
        C16R A20;
        super.A06 = 0;
        C16R c16r2 = ((C16K) this).A00;
        C16R c16r3 = C16R.A0A;
        if (c16r2 == c16r3) {
            A04();
            return null;
        }
        if (this.A03) {
            A29();
        }
        int A01 = A01();
        if (A01 < 0) {
            close();
            ((C16K) this).A00 = null;
            return null;
        }
        this.A0L = null;
        if (A01 != 93 && A01 != 125) {
            C16P c16p = this.A0B;
            int i = ((C16Q) c16p).A00 + 1;
            ((C16Q) c16p).A00 = i;
            if (((C16Q) c16p).A01 != 0 && i > 0) {
                A01 = A02(A01);
                if ((((C16L) this).A00 & A0I) != 0 && (A01 == 93 || A01 == 125)) {
                    A0E(A01);
                    return null;
                }
            }
            C16P c16p2 = this.A0B;
            int i2 = ((C16Q) c16p2).A01;
            if (i2 == 2) {
                int i3 = super.A04;
                this.A02 = i3;
                this.A01 = super.A01;
                this.A00 = i3 - super.A02;
                if (A01 == 34) {
                    A25 = A24();
                } else {
                    A25 = A25(A01);
                }
                this.A0B.A08(A25);
                ((C16K) this).A00 = c16r3;
                int A00 = A00();
                A0D();
                if (A00 == 34) {
                    this.A03 = true;
                    this.A0H = C16R.A0J;
                    return A25;
                }
                if (A00 != 45) {
                    if (A00 != 46) {
                        if (A00 != 91) {
                            if (A00 != 102) {
                                if (A00 != 110) {
                                    if (A00 != 116) {
                                        if (A00 != 123) {
                                            switch (A00) {
                                                case 48:
                                                case 49:
                                                case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /* 50 */:
                                                case 51:
                                                case 52:
                                                case 53:
                                                case 54:
                                                case 55:
                                                case 56:
                                                case 57:
                                                    A20 = A22(A00);
                                                    break;
                                                default:
                                                    A20 = A21(A00);
                                                    break;
                                            }
                                        } else {
                                            A20 = C16R.A0D;
                                        }
                                    } else {
                                        A0C();
                                        A20 = C16R.A0K;
                                    }
                                } else {
                                    A0B();
                                    A20 = C16R.A0G;
                                }
                            } else {
                                A0A();
                                A20 = C16R.A0F;
                            }
                        } else {
                            A20 = C16R.A0C;
                        }
                    } else {
                        A20 = A1z();
                    }
                } else {
                    A20 = A20();
                }
                this.A0H = A20;
                return A25;
            }
            A0D();
            if (A01 == 34) {
                this.A03 = true;
                c16r = C16R.A0J;
            } else if (A01 != 91) {
                if (A01 != 102) {
                    if (A01 != 110) {
                        if (A01 != 116) {
                            if (A01 != 123) {
                                switch (A01) {
                                    case 44:
                                        if (i2 != 0 && (((C16L) this).A00 & A0A) != 0) {
                                            super.A04--;
                                            c16r = C16R.A0G;
                                            break;
                                        }
                                        c16r = A21(A01);
                                        break;
                                    case 45:
                                        c16r = A20();
                                        break;
                                    case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                                        c16r = A1z();
                                        break;
                                    default:
                                        switch (A01) {
                                            case 48:
                                            case 49:
                                            case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /* 50 */:
                                            case 51:
                                            case 52:
                                            case 53:
                                            case 54:
                                            case 55:
                                            case 56:
                                            case 57:
                                                c16r = A22(A01);
                                                break;
                                            default:
                                                c16r = A21(A01);
                                                break;
                                        }
                                }
                            } else {
                                this.A0B = c16p2.A06(super.A09, super.A08);
                                c16r = C16R.A0D;
                            }
                        } else {
                            A2A("true", 1);
                            c16r = C16R.A0K;
                        }
                    } else {
                        A2A("null", 1);
                        c16r = C16R.A0G;
                    }
                } else {
                    A2A("false", 1);
                    c16r = C16R.A0F;
                }
            } else {
                this.A0B = c16p2.A05(super.A09, super.A08);
                c16r = C16R.A0C;
            }
            ((C16K) this).A00 = c16r;
            return null;
        }
        A0E(A01);
        return null;
    }

    @Override // X.C16K
    public final String A1V(String str) {
        C16R c16r = ((C16K) this).A00;
        if (c16r == C16R.A0J) {
            if (this.A03) {
                this.A03 = false;
                A26();
            }
            return this.A0N.A06();
        }
        if (c16r == C16R.A0A) {
            return A0q();
        }
        return super.A1V(null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x002b, code lost:
    
        if (r7 != 'E') goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003c, code lost:
    
        r2 = r9 - 1;
        r12.A04 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0044, code lost:
    
        if (((X.C16Q) r12.A0B).A01 != 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0046, code lost:
    
        A0F(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0049, code lost:
    
        r12.A0N.A0A(r12.A04, r8, r2 - r8);
        r12.A0E = true;
        r12.A05 = r10;
        r12.A06 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005a, code lost:
    
        return X.C16R.A0I;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x003a, code lost:
    
        if (r7 != '.') goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C16R A20() {
        /*
            r12 = this;
            r6 = r12
            int r0 = r12.A04
            int r8 = r0 + (-1)
            int r5 = r12.A03
            r11 = 1
            if (r0 >= r5) goto L62
            char[] r4 = r12.A04
            int r3 = r0 + 1
            char r2 = r4[r0]
            r1 = 57
            if (r2 > r1) goto L5b
            r0 = 48
            if (r2 < r0) goto L5b
            if (r2 == r0) goto L62
            r10 = 1
        L1b:
            if (r3 >= r5) goto L62
            int r9 = r3 + 1
            char r7 = r4[r3]
            if (r7 < r0) goto L38
            if (r7 <= r1) goto L34
            r0 = 101(0x65, float:1.42E-43)
            if (r7 == r0) goto L2d
            r0 = 69
            if (r7 != r0) goto L3c
        L2d:
            r12.A04 = r9
            X.16R r0 = r6.A05(r7, r8, r9, r10, r11)
            return r0
        L34:
            int r10 = r10 + 1
            r3 = r9
            goto L1b
        L38:
            r0 = 46
            if (r7 == r0) goto L2d
        L3c:
            int r2 = r9 + (-1)
            r12.A04 = r2
            X.16P r0 = r12.A0B
            int r0 = r0.A01
            if (r0 != 0) goto L49
            r12.A0F(r7)
        L49:
            int r2 = r2 - r8
            X.16O r1 = r12.A0N
            char[] r0 = r12.A04
            r1.A0A(r0, r8, r2)
            r12.A0E = r11
            r12.A05 = r10
            r0 = 0
            r12.A06 = r0
            X.16R r0 = X.C16R.A0I
            return r0
        L5b:
            r12.A04 = r3
            X.16R r0 = r12.A23(r2, r11)
            return r0
        L62:
            X.16R r0 = r12.A06(r8, r11)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16I.A20():X.16R");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0028, code lost:
    
        if (r5 != 'E') goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0035, code lost:
    
        r2 = r7 - 1;
        r10.A04 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003d, code lost:
    
        if (((X.C16Q) r10.A0B).A01 != 0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003f, code lost:
    
        A0F(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0042, code lost:
    
        r10.A0N.A0A(r10.A04, r6, r2 - r6);
        r10.A0E = false;
        r10.A05 = r8;
        r10.A06 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0052, code lost:
    
        return X.C16R.A0I;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0033, code lost:
    
        if (r5 != '.') goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C16R A22(int r11) {
        /*
            r10 = this;
            r4 = r10
            int r3 = r10.A04
            int r6 = r3 + (-1)
            int r2 = r10.A03
            r1 = 48
            r9 = 0
            if (r11 == r1) goto L11
            r8 = 1
        Ld:
            if (r3 < r2) goto L16
            r10.A04 = r6
        L11:
            X.16R r0 = r10.A06(r6, r9)
            return r0
        L16:
            char[] r0 = r10.A04
            int r7 = r3 + 1
            char r5 = r0[r3]
            if (r5 < r1) goto L31
            r0 = 57
            if (r5 <= r0) goto L53
            r0 = 101(0x65, float:1.42E-43)
            if (r5 == r0) goto L2a
            r0 = 69
            if (r5 != r0) goto L35
        L2a:
            r10.A04 = r7
            X.16R r0 = r4.A05(r5, r6, r7, r8, r9)
            return r0
        L31:
            r0 = 46
            if (r5 == r0) goto L2a
        L35:
            int r2 = r7 + (-1)
            r10.A04 = r2
            X.16P r0 = r10.A0B
            int r0 = r0.A01
            if (r0 != 0) goto L42
            r10.A0F(r5)
        L42:
            int r2 = r2 - r6
            X.16O r1 = r10.A0N
            char[] r0 = r10.A04
            r1.A0A(r0, r6, r2)
            r10.A0E = r9
            r10.A05 = r8
            r10.A06 = r9
            X.16R r0 = X.C16R.A0I
            return r0
        L53:
            int r8 = r8 + 1
            r3 = r7
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16I.A22(int):X.16R");
    }

    public final void A29() {
        this.A03 = false;
        int i = super.A04;
        int i2 = super.A03;
        char[] cArr = this.A04;
        while (true) {
            if (i >= i2) {
                super.A04 = i;
                if (!A2C()) {
                    A1d(": was expecting closing quote for a string value");
                    throw C00O.createAndThrow();
                }
                i = super.A04;
                i2 = super.A03;
            }
            int i3 = i + 1;
            char c = cArr[i];
            if (c <= '\\') {
                if (c == '\\') {
                    super.A04 = i3;
                    A1h();
                    i = super.A04;
                    i2 = super.A03;
                } else if (c <= '\"') {
                    if (c == '\"') {
                        super.A04 = i3;
                        return;
                    } else if (c < ' ') {
                        super.A04 = i3;
                        A1w(c, "string value");
                    }
                }
            }
            i = i3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0038, code lost:
    
        if (r6 > ' ') goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0024, code lost:
    
        if (r6 == ':') goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int A00() {
        /*
            r10 = this;
            int r9 = r10.A04
            int r1 = r9 + 4
            int r0 = r10.A03
            r8 = 0
            if (r1 >= r0) goto L48
            char[] r7 = r10.A04
            char r6 = r7[r9]
            r0 = 58
            r5 = 9
            r4 = 35
            r3 = 47
            r2 = 32
            r1 = 1
            if (r6 == r0) goto L26
            if (r6 == r2) goto L1e
            if (r6 != r5) goto L24
        L1e:
            int r9 = r9 + 1
            r10.A04 = r9
            char r6 = r7[r9]
        L24:
            if (r6 != r0) goto L48
        L26:
            int r0 = r9 + 1
            r10.A04 = r0
            char r6 = r7[r0]
            if (r6 > r2) goto L3a
            if (r6 == r2) goto L32
            if (r6 != r5) goto L43
        L32:
            int r0 = r0 + 1
            r10.A04 = r0
            char r6 = r7[r0]
            if (r6 <= r2) goto L43
        L3a:
            if (r6 == r3) goto L43
            if (r6 == r4) goto L43
            int r0 = r0 + 1
            r10.A04 = r0
            return r6
        L43:
            int r6 = r10.A03(r1)
            return r6
        L48:
            int r6 = r10.A03(r8)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16I.A00():int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x009d, code lost:
    
        A1Y(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00a4, code lost:
    
        throw X.C00O.createAndThrow();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int A01() {
        /*
            r9 = this;
            int r1 = r9.A04
            int r0 = r9.A03
            if (r1 < r0) goto L11
            boolean r0 = r9.A2C()
            if (r0 != 0) goto L11
        Lc:
            r9.A1X()
            r2 = -1
        L10:
            return r2
        L11:
            char[] r2 = r9.A04
            int r0 = r9.A04
            int r1 = r0 + 1
            r9.A04 = r1
            char r2 = r2[r0]
            r8 = 35
            r7 = 47
            r6 = 32
            if (r2 > r6) goto L45
            r5 = 9
            r4 = 13
            r3 = 10
        L29:
            if (r2 == r6) goto L35
            if (r2 != r3) goto L95
            int r0 = r9.A01
            int r0 = r0 + 1
            r9.A01 = r0
            r9.A02 = r1
        L35:
            int r2 = r9.A04
            int r0 = r9.A03
            if (r2 >= r0) goto L4d
            char[] r0 = r9.A04
            int r1 = r2 + 1
            r9.A04 = r1
            char r2 = r0[r2]
            if (r2 <= r6) goto L29
        L45:
            if (r2 == r7) goto L49
            if (r2 != r8) goto L10
        L49:
            int r0 = r1 + (-1)
            r9.A04 = r0
        L4d:
            int r1 = r9.A04
            int r0 = r9.A03
            if (r1 < r0) goto L5a
            boolean r0 = r9.A2C()
            if (r0 != 0) goto L5a
            goto Lc
        L5a:
            char[] r2 = r9.A04
            int r0 = r9.A04
            int r1 = r0 + 1
            r9.A04 = r1
            char r2 = r2[r0]
            if (r2 <= r6) goto L79
            if (r2 != r7) goto L6c
            r9.A08()
            goto L4d
        L6c:
            if (r2 != r8) goto L10
            int r1 = r9.A00
            int r0 = X.C16I.A0B
            r1 = r1 & r0
            if (r1 == 0) goto L10
            r9.A09()
            goto L4d
        L79:
            if (r2 == r6) goto L4d
            r0 = 10
            if (r2 != r0) goto L88
            int r0 = r9.A01
            int r0 = r0 + 1
            r9.A01 = r0
            r9.A02 = r1
            goto L4d
        L88:
            r0 = 13
            if (r2 != r0) goto L90
            r9.A28()
            goto L4d
        L90:
            r0 = 9
            if (r2 == r0) goto L4d
            goto L9d
        L95:
            if (r2 != r4) goto L9b
            r9.A28()
            goto L35
        L9b:
            if (r2 == r5) goto L35
        L9d:
            r9.A1Y(r2)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16I.A01():int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00b7, code lost:
    
        A1Y(r2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int A02(int r4) {
        /*
            r3 = this;
            r0 = 44
            if (r4 == r0) goto L1b
            java.lang.String r2 = "was expecting comma to separate "
            X.16P r0 = r3.A0B
            java.lang.String r1 = r0.A02()
            java.lang.String r0 = " entries"
            java.lang.String r0 = X.AnonymousClass001.A0g(r2, r1, r0)
            r3.A1Z(r4, r0)
        L16:
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L1b:
            int r2 = r3.A04
            int r0 = r3.A03
            if (r2 >= r0) goto L39
            char[] r0 = r3.A04
            int r1 = r2 + 1
            r3.A04 = r1
            char r2 = r0[r2]
            r0 = 32
            if (r2 <= r0) goto L9a
            r0 = 47
            if (r2 == r0) goto L35
            r0 = 35
            if (r2 != r0) goto Lbc
        L35:
            int r0 = r1 + (-1)
            r3.A04 = r0
        L39:
            int r1 = r3.A04
            int r0 = r3.A03
            if (r1 < r0) goto L59
            boolean r0 = r3.A2C()
            if (r0 != 0) goto L59
            java.lang.String r2 = "Unexpected end-of-input within/between "
            X.16P r0 = r3.A0B
            java.lang.String r1 = r0.A02()
            java.lang.String r0 = " entries"
            java.lang.String r1 = X.AnonymousClass001.A0g(r2, r1, r0)
            X.3zy r0 = new X.3zy
            r0.<init>(r3, r1)
            throw r0
        L59:
            char[] r2 = r3.A04
            int r0 = r3.A04
            int r1 = r0 + 1
            r3.A04 = r1
            char r2 = r2[r0]
            r0 = 32
            if (r2 <= r0) goto L7e
            r0 = 47
            if (r2 != r0) goto L6f
            r3.A08()
            goto L39
        L6f:
            r0 = 35
            if (r2 != r0) goto Lbc
            int r1 = r3.A00
            int r0 = X.C16I.A0B
            r1 = r1 & r0
            if (r1 == 0) goto Lbc
            r3.A09()
            goto L39
        L7e:
            if (r2 >= r0) goto L39
            r0 = 10
            if (r2 != r0) goto L8d
            int r0 = r3.A01
            int r0 = r0 + 1
            r3.A01 = r0
            r3.A02 = r1
            goto L39
        L8d:
            r0 = 13
            if (r2 != r0) goto L95
            r3.A28()
            goto L39
        L95:
            r0 = 9
            if (r2 == r0) goto L39
            goto Lb7
        L9a:
            if (r2 >= r0) goto L1b
            r0 = 10
            if (r2 != r0) goto Laa
            int r0 = r3.A01
            int r0 = r0 + 1
            r3.A01 = r0
            r3.A02 = r1
            goto L1b
        Laa:
            r0 = 13
            if (r2 != r0) goto Lb3
            r3.A28()
            goto L1b
        Lb3:
            r0 = 9
            if (r2 == r0) goto L1b
        Lb7:
            r3.A1Y(r2)
            goto L16
        Lbc:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16I.A02(int):int");
    }

    private final int A03(boolean z) {
        while (true) {
            if (super.A04 >= super.A03 && !A2C()) {
                A1d(AnonymousClass001.A0g(" within/between ", this.A0B.A02(), " entries"));
                break;
            }
            char[] cArr = this.A04;
            int i = super.A04;
            int i2 = i + 1;
            super.A04 = i2;
            char c = cArr[i];
            if (c > ' ') {
                if (c == '/') {
                    A08();
                } else if (c == '#' && (((C16L) this).A00 & A0B) != 0) {
                    A09();
                } else {
                    if (z) {
                        return c;
                    }
                    if (c != ':') {
                        A1Z(c, "was expecting a colon to separate field name and value");
                        break;
                    }
                    z = true;
                }
            } else if (c >= ' ') {
                continue;
            } else if (c == '\n') {
                super.A01++;
                super.A02 = i2;
            } else if (c == '\r') {
                A28();
            } else if (c != '\t') {
                A1Y(c);
                break;
            }
        }
        throw C00O.createAndThrow();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [int, char], vars: [r9v0 ??, r9v1 ??, r9v9 ??, r9v8 ??, r9v5 ??, r9v4 ??, r9v3 ??, r9v2 ??, r9v6 ??, r9v7 ??]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:107)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:83)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:57)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:45)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    private final X.C16R A05(
    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [int, char], vars: [r9v0 ??, r9v1 ??, r9v9 ??, r9v8 ??, r9v5 ??, r9v4 ??, r9v3 ??, r9v2 ??, r9v6 ??, r9v7 ??]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:107)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:83)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:57)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:45)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r9v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:237)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:223)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:168)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:401)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        */

    /* JADX WARN: Code restructure failed: missing block: B:17:0x003d, code lost:
    
        if (r1 <= '9') goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x017c, code lost:
    
        if (r12 == '0') goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0180, code lost:
    
        if (r1 < r17.A03) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0186, code lost:
    
        if (A2C() == false) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0188, code lost:
    
        r1 = r17.A04;
        r0 = r17.A04;
        r12 = r1[r0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x018e, code lost:
    
        if (r12 < '0') goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0190, code lost:
    
        if (r12 > '9') goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0192, code lost:
    
        r1 = r0 + 1;
        r17.A04 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0196, code lost:
    
        if (r12 == '0') goto L137;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final X.C16R A06(int r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 463
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16I.A06(int, boolean):X.16R");
    }

    private String A07(int i, int i2, int i3) {
        C16O c16o = this.A0N;
        c16o.A0A(this.A04, i, super.A04 - i);
        char[] A0E2 = c16o.A0E();
        int i4 = c16o.A00;
        while (true) {
            int i5 = i4;
            while (true) {
                if (super.A04 >= super.A03 && !A2C()) {
                    A1d(" in field name");
                    throw C00O.createAndThrow();
                }
                char[] cArr = this.A04;
                int i6 = super.A04;
                super.A04 = i6 + 1;
                char c = cArr[i6];
                if (c <= '\\') {
                    if (c == '\\') {
                        c = A1h();
                    } else if (c <= i3) {
                        if (c == i3) {
                            c16o.A00 = i5;
                            char[] A0F2 = c16o.A0F();
                            int i7 = c16o.A02;
                            if (i7 < 0) {
                                i7 = 0;
                            }
                            return this.A09.A01(A0F2, i7, c16o.A04(), i2);
                        }
                        if (c < ' ') {
                            A1w(c, PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
                        }
                    }
                }
                i2 = (i2 * 33) + c;
                i4 = i5 + 1;
                A0E2[i5] = c;
                if (i4 >= A0E2.length) {
                    A0E2 = c16o.A0D();
                    i5 = 0;
                }
            }
        }
    }

    private void A08() {
        if ((((C16L) this).A00 & A0E) == 0) {
            A1Z(47, "maybe a (non-standard) comment? (not recognized as one since Feature 'ALLOW_COMMENTS' not enabled for parser)");
        } else {
            if (super.A04 < super.A03 || A2C()) {
                char[] cArr = this.A04;
                int i = super.A04;
                super.A04 = i + 1;
                char c = cArr[i];
                if (c == '/') {
                    A09();
                    return;
                }
                if (c == '*') {
                    while (true) {
                        if (super.A04 >= super.A03 && !A2C()) {
                            break;
                        }
                        char[] cArr2 = this.A04;
                        int i2 = super.A04;
                        int i3 = i2 + 1;
                        super.A04 = i3;
                        char c2 = cArr2[i2];
                        if (c2 <= '*') {
                            if (c2 == '*') {
                                if (i3 >= super.A03 && !A2C()) {
                                    break;
                                }
                                char[] cArr3 = this.A04;
                                int i4 = super.A04;
                                if (cArr3[i4] == '/') {
                                    super.A04 = i4 + 1;
                                    return;
                                }
                            } else if (c2 >= ' ') {
                                continue;
                            } else if (c2 == '\n') {
                                super.A01++;
                                super.A02 = i3;
                            } else if (c2 == '\r') {
                                A28();
                            } else if (c2 != '\t') {
                                A1Y(c2);
                                break;
                            }
                        }
                    }
                } else {
                    A1Z(c, "was expecting either '*' or '/' for a comment");
                }
            }
            A1d(" in a comment");
        }
        throw C00O.createAndThrow();
    }

    private void A09() {
        while (true) {
            if (super.A04 < super.A03 || A2C()) {
                char[] cArr = this.A04;
                int i = super.A04;
                int i2 = i + 1;
                super.A04 = i2;
                char c = cArr[i];
                if (c < ' ') {
                    if (c == '\n') {
                        super.A01++;
                        super.A02 = i2;
                        return;
                    } else if (c == '\r') {
                        A28();
                        return;
                    } else if (c != '\t') {
                        A1Y(c);
                        throw C00O.createAndThrow();
                    }
                }
            } else {
                return;
            }
        }
    }

    private final void A0A() {
        int i;
        char c;
        int i2 = super.A04;
        if (i2 + 4 < super.A03) {
            char[] cArr = this.A04;
            if (cArr[i2] == 'a') {
                int i3 = i2 + 1;
                if (cArr[i3] == 'l') {
                    int i4 = i3 + 1;
                    if (cArr[i4] == 's') {
                        int i5 = i4 + 1;
                        if (cArr[i5] == 'e' && ((c = cArr[(i = i5 + 1)]) < '0' || c == ']' || c == '}')) {
                            super.A04 = i;
                            return;
                        }
                    }
                }
            }
        }
        A2A("false", 1);
    }

    private final void A0B() {
        int i;
        char c;
        int i2 = super.A04;
        if (i2 + 3 < super.A03) {
            char[] cArr = this.A04;
            if (cArr[i2] == 'u') {
                int i3 = i2 + 1;
                if (cArr[i3] == 'l') {
                    int i4 = i3 + 1;
                    if (cArr[i4] == 'l' && ((c = cArr[(i = i4 + 1)]) < '0' || c == ']' || c == '}')) {
                        super.A04 = i;
                        return;
                    }
                }
            }
        }
        A2A("null", 1);
    }

    private final void A0C() {
        int i;
        char c;
        int i2 = super.A04;
        if (i2 + 3 < super.A03) {
            char[] cArr = this.A04;
            if (cArr[i2] == 'r') {
                int i3 = i2 + 1;
                if (cArr[i3] == 'u') {
                    int i4 = i3 + 1;
                    if (cArr[i4] == 'e' && ((c = cArr[(i = i4 + 1)]) < '0' || c == ']' || c == '}')) {
                        super.A04 = i;
                        return;
                    }
                }
            }
        }
        A2A("true", 1);
    }

    private final void A0D() {
        int i = super.A04;
        this.A0G = this.A0F + i;
        super.A09 = super.A01;
        super.A08 = i - super.A02;
    }

    private void A0E(int i) {
        C16R c16r;
        if (i == 93) {
            A0D();
            C16P c16p = this.A0B;
            if (((C16Q) c16p).A01 == 1) {
                c16p.A03 = null;
                this.A0B = c16p.A06;
                c16r = C16R.A08;
                ((C16K) this).A00 = c16r;
                return;
            }
            A1u(i, '}');
            throw C00O.createAndThrow();
        }
        if (i != 125) {
            return;
        }
        A0D();
        C16P c16p2 = this.A0B;
        if (((C16Q) c16p2).A01 == 2) {
            c16p2.A03 = null;
            this.A0B = c16p2.A06;
            c16r = C16R.A09;
            ((C16K) this).A00 = c16r;
            return;
        }
        A1u(i, ']');
        throw C00O.createAndThrow();
    }

    private final void A0F(int i) {
        int i2 = super.A04 + 1;
        super.A04 = i2;
        if (i != 9) {
            if (i != 10) {
                if (i != 13) {
                    if (i != 32) {
                        A1Z(i, "Expected space separating root-level values");
                        throw C00O.createAndThrow();
                    }
                    return;
                }
                A28();
                return;
            }
            super.A01++;
            super.A02 = i2;
        }
    }

    @Override // X.C16L
    public final int A0f(Writer writer) {
        int i = super.A03;
        int i2 = super.A04;
        int i3 = i - i2;
        if (i3 < 1) {
            return 0;
        }
        super.A04 = i2 + i3;
        writer.write(this.A04, i2, i3);
        return i3;
    }

    @Override // X.C16L
    public final int A1B() {
        C16R c16r = ((C16K) this).A00;
        if (c16r == null) {
            return 0;
        }
        int i = c16r.A00;
        if (i != 5) {
            if (i != 6) {
                if (i != 7 && i != 8) {
                    return c16r.A06.length;
                }
            } else if (this.A03) {
                this.A03 = false;
                A26();
            }
            return this.A0N.A04();
        }
        return this.A0B.A04.length();
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x000f, code lost:
    
        if (r1 != 8) goto L10;
     */
    @Override // X.C16L
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int A1C() {
        /*
            r3 = this;
            X.16R r0 = r3.A00
            r2 = 0
            if (r0 == 0) goto L11
            int r1 = r0.A00
            r0 = 6
            if (r1 == r0) goto L12
            r0 = 7
            if (r1 == r0) goto L1b
            r0 = 8
            if (r1 == r0) goto L1b
        L11:
            return r2
        L12:
            boolean r0 = r3.A03
            if (r0 == 0) goto L1b
            r3.A03 = r2
            r3.A26()
        L1b:
            X.16O r0 = r3.A0N
            int r0 = r0.A02
            if (r0 >= 0) goto L22
            r0 = 0
        L22:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16I.A1C():int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x0143, code lost:
    
        r18.A03 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0145, code lost:
    
        if (r11 <= 0) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0147, code lost:
    
        r6 = r6 + r11;
        r20.write(r4, 0, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x014e, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00cd, code lost:
    
        r18.A04 = r2 - 1;
        A1x(r19);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:?, code lost:
    
        throw X.C00O.createAndThrow();
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x00cb, code lost:
    
        if (r19.A04 != false) goto L46;
     */
    @Override // X.C16L
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int A1F(X.C912044w r19, java.io.OutputStream r20) {
        /*
            Method dump skipped, instructions count: 349
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16I.A1F(X.44w, java.io.OutputStream):int");
    }

    @Override // X.C16L
    public final TID A1H() {
        int i = super.A04;
        return new TID(A1m(), super.A01, (i - super.A02) + 1, -1L, i + this.A0F);
    }

    @Override // X.C16L
    public final TID A1I() {
        C16D A1m;
        long j;
        long j2;
        int i;
        int i2;
        if (((C16K) this).A00 == C16R.A0A) {
            j2 = this.A0F + (this.A02 - 1);
            A1m = A1m();
            j = -1;
            i = this.A01;
            i2 = this.A00;
        } else {
            A1m = A1m();
            j = -1;
            j2 = this.A0G - 1;
            i = super.A09;
            i2 = super.A08;
        }
        return new TID(A1m, i, i2, j, j2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0047, code lost:
    
        if (r4 == 125) goto L25;
     */
    @Override // X.C16L
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C16R A1J() {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16I.A1J():X.16R");
    }

    @Override // X.C16L
    public final C44T A1K() {
        return this.A05;
    }

    @Override // X.C16L
    public final C16N A1L() {
        return C16J.A0P;
    }

    @Override // X.C16L
    public final Object A1M() {
        return this.A06;
    }

    @Override // X.C16L
    public final String A1O() {
        if (((C16K) this).A00 == C16R.A0A) {
            this.A0K = false;
            C16R c16r = this.A0H;
            this.A0H = null;
            ((C16K) this).A00 = c16r;
            if (c16r == C16R.A0J) {
                if (this.A03) {
                    this.A03 = false;
                    A26();
                }
                return this.A0N.A06();
            }
            if (c16r == C16R.A0C) {
                this.A0B = this.A0B.A05(super.A09, super.A08);
                return null;
            }
            if (c16r != C16R.A0D) {
                return null;
            }
            this.A0B = this.A0B.A06(super.A09, super.A08);
            return null;
        }
        if (A1J() != C16R.A0J) {
            return null;
        }
        return A1P();
    }

    @Override // X.C16L
    public final String A1P() {
        C16R c16r = ((C16K) this).A00;
        if (c16r == C16R.A0J) {
            if (this.A03) {
                this.A03 = false;
                A26();
            }
        } else {
            if (c16r == null) {
                return null;
            }
            int i = c16r.A00;
            if (i != 5) {
                if (i != 6 && i != 7 && i != 8) {
                    return c16r.A01;
                }
            } else {
                return this.A0B.A04;
            }
        }
        return this.A0N.A06();
    }

    @Override // X.C16K, X.C16L
    public final String A1Q() {
        C16R c16r = ((C16K) this).A00;
        if (c16r == C16R.A0J) {
            if (this.A03) {
                this.A03 = false;
                A26();
            }
            return this.A0N.A06();
        }
        if (c16r == C16R.A0A) {
            return A0q();
        }
        return super.A1V(null);
    }

    @Override // X.C16L
    public final void A1R(C44T c44t) {
        this.A05 = c44t;
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x00e3, code lost:
    
        if (r12.A04 == false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00e5, code lost:
    
        r11.A04 = r8 - 1;
        A1x(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:?, code lost:
    
        throw X.C00O.createAndThrow();
     */
    @Override // X.C16L
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final byte[] A1S(X.C912044w r12) {
        /*
            Method dump skipped, instructions count: 363
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16I.A1S(X.44w):byte[]");
    }

    @Override // X.C16L
    public final char[] A1T() {
        C16R c16r = ((C16K) this).A00;
        if (c16r != null) {
            int i = c16r.A00;
            if (i != 5) {
                if (i != 6) {
                    if (i != 7 && i != 8) {
                        return c16r.A06;
                    }
                } else if (this.A03) {
                    this.A03 = false;
                    A26();
                }
                return this.A0N.A0F();
            }
            if (!this.A0K) {
                String str = this.A0B.A04;
                int length = str.length();
                char[] cArr = this.A0M;
                if (cArr == null) {
                    C16H c16h = this.A0O;
                    C16H.A00(c16h.A04);
                    cArr = c16h.A08.A01(3, length);
                    c16h.A04 = cArr;
                } else {
                    if (cArr.length < length) {
                        cArr = new char[length];
                    }
                    str.getChars(0, length, cArr, 0);
                    this.A0K = true;
                }
                this.A0M = cArr;
                str.getChars(0, length, cArr, 0);
                this.A0K = true;
            }
            return this.A0M;
        }
        return null;
    }

    @Override // X.C16J
    public final char A1h() {
        if (super.A04 < super.A03 || A2C()) {
            char[] cArr = this.A04;
            int i = super.A04;
            int i2 = i + 1;
            super.A04 = i2;
            char c = cArr[i];
            if (c != '\"' && c != '/' && c != '\\') {
                if (c != 'b') {
                    if (c != 'f') {
                        if (c != 'n') {
                            if (c != 'r') {
                                if (c != 't') {
                                    if (c != 'u') {
                                        A1s(c);
                                    } else {
                                        int i3 = 0;
                                        int i4 = 0;
                                        do {
                                            if (i2 < super.A03 || A2C()) {
                                                char[] cArr2 = this.A04;
                                                int i5 = super.A04;
                                                i2 = i5 + 1;
                                                super.A04 = i2;
                                                char c2 = cArr2[i5];
                                                int i6 = AnonymousClass167.A01[c2 & 255];
                                                if (i6 < 0) {
                                                    A1Z(c2, "expected a hex-digit for character escape sequence");
                                                    throw C00O.createAndThrow();
                                                }
                                                i4 = (i4 << 4) | i6;
                                                i3++;
                                            }
                                        } while (i3 < 4);
                                        return (char) i4;
                                    }
                                } else {
                                    return '\t';
                                }
                            } else {
                                return '\r';
                            }
                        } else {
                            return '\n';
                        }
                    } else {
                        return '\f';
                    }
                } else {
                    return '\b';
                }
            }
            return c;
        }
        A1d(" in character escape sequence");
        throw C00O.createAndThrow();
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0011, code lost:
    
        if ((((X.C16L) r3).A00 & X.EnumC222315z.AUTO_CLOSE_SOURCE.A00) != 0) goto L8;
     */
    @Override // X.C16J
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A1r() {
        /*
            r3 = this;
            java.io.Reader r2 = r3.A06
            if (r2 == 0) goto L19
            X.16H r0 = r3.A0O
            boolean r0 = r0.A09
            if (r0 != 0) goto L13
            X.15z r0 = X.EnumC222315z.AUTO_CLOSE_SOURCE
            int r1 = r3.A00
            int r0 = r0.A00
            r1 = r1 & r0
            if (r1 == 0) goto L16
        L13:
            r2.close()
        L16:
            r0 = 0
            r3.A06 = r0
        L19:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16I.A1r():void");
    }

    public final char A1y(String str) {
        if (super.A04 >= super.A03 && !A2C()) {
            A1d(str);
            throw C00O.createAndThrow();
        }
        char[] cArr = this.A04;
        int i = super.A04;
        super.A04 = i + 1;
        return cArr[i];
    }

    public final C16R A1z() {
        if ((((C16L) this).A00 & EnumC223479te.A03.A00.A00) != 0) {
            int i = super.A04;
            return A05(46, i - 1, i, 0, false);
        }
        A21(46);
        throw C00O.createAndThrow();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0017, code lost:
    
        if (r9 != 44) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005a, code lost:
    
        if (((X.C16Q) r8.A0B).A01 == 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0061, code lost:
    
        if ((((X.C16L) r8).A00 & X.C16I.A0A) == 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0063, code lost:
    
        r8.A04--;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006a, code lost:
    
        return X.C16R.A0G;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0054, code lost:
    
        if (((X.C16Q) r8.A0B).A01 == 1) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C16R A21(int r9) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16I.A21(int):X.16R");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [int, char], vars: [r8v0 ??, r8v1 ??, r8v2 ??]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:107)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:83)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:57)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:45)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public final X.C16R A23(
    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [int, char], vars: [r8v0 ??, r8v1 ??, r8v2 ??]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:107)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:83)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:57)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:45)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r8v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:237)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:223)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:168)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:401)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        */

    public final String A24() {
        int i = super.A04;
        int i2 = this.A08;
        int[] iArr = A0D;
        while (true) {
            if (i >= super.A03) {
                break;
            }
            char[] cArr = this.A04;
            char c = cArr[i];
            if (c < 256 && iArr[c] != 0) {
                if (c == '\"') {
                    super.A04 = i + 1;
                    return this.A09.A01(cArr, i, i - i, i2);
                }
            } else {
                i2 = (i2 * 33) + c;
                i++;
            }
        }
        super.A04 = i;
        return A07(i, i2, 34);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0062, code lost:
    
        if (r3 < r6) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0064, code lost:
    
        r5 = r10.A04;
        r1 = r5[r3];
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0068, code lost:
    
        if (r1 >= 256) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x006c, code lost:
    
        if (r8[r1] == 0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0091, code lost:
    
        r4 = (r4 * 33) + r1;
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0096, code lost:
    
        if (r3 < r6) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x006e, code lost:
    
        r1 = r10.A04 - 1;
        r10.A04 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x007a, code lost:
    
        return r10.A09.A01(r5, r1, r3 - r1, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0080, code lost:
    
        if (java.lang.Character.isJavaIdentifierPart(r1) != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0082, code lost:
    
        r2 = r10.A04 - 1;
        r10.A04 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0090, code lost:
    
        return r10.A09.A01(r10.A04, r2, r3 - r2, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0098, code lost:
    
        r1 = r10.A04 - 1;
        r10.A04 = r3;
        r5 = r10.A0N;
        r5.A0A(r10.A04, r1, r3 - r1);
        r3 = r5.A0E();
        r7 = r5.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00ab, code lost:
    
        r6 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00b0, code lost:
    
        if (r10.A04 < r10.A03) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00b6, code lost:
    
        if (A2C() != false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00b8, code lost:
    
        r5.A00 = r6;
        r3 = r5.A0F();
        r2 = r5.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00c0, code lost:
    
        if (r2 >= 0) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00c2, code lost:
    
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00cd, code lost:
    
        return r10.A09.A01(r3, r2, r5.A04(), r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00ce, code lost:
    
        r1 = r10.A04[r10.A04];
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00d4, code lost:
    
        if (r1 >= 256) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00d8, code lost:
    
        if (r8[r1] == 0) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00e2, code lost:
    
        r10.A04++;
        r4 = (r4 * 33) + r1;
        r7 = r6 + 1;
        r3[r6] = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00f0, code lost:
    
        if (r7 < r3.length) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00f2, code lost:
    
        r3 = r5.A0D();
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00df, code lost:
    
        if (java.lang.Character.isJavaIdentifierPart(r1) != false) goto L63;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String A25(int r11) {
        /*
            Method dump skipped, instructions count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16I.A25(int):java.lang.String");
    }

    public final void A26() {
        int i = super.A04;
        int i2 = super.A03;
        if (i < i2) {
            int[] iArr = A0D;
            while (true) {
                char[] cArr = this.A04;
                char c = cArr[i];
                if (c < 256 && iArr[c] != 0) {
                    if (c == '\"') {
                        this.A0N.A0A(cArr, i, i - i);
                        super.A04 = i + 1;
                        return;
                    }
                } else {
                    i++;
                    if (i >= i2) {
                        break;
                    }
                }
            }
        }
        C16O c16o = this.A0N;
        char[] cArr2 = this.A04;
        int i3 = i - i;
        c16o.A08 = null;
        c16o.A02 = -1;
        c16o.A01 = 0;
        c16o.A04 = null;
        c16o.A09 = null;
        if (c16o.A06) {
            C16O.A00(c16o);
        } else if (c16o.A07 == null) {
            c16o.A07 = C16O.A03(c16o, i3);
        }
        c16o.A03 = 0;
        c16o.A00 = 0;
        c16o.A09(cArr2, i, i3);
        super.A04 = i;
        char[] A0E2 = c16o.A0E();
        int i4 = c16o.A00;
        int i5 = i4;
        int[] iArr2 = A0D;
        while (true) {
            if (super.A04 >= super.A03 && !A2C()) {
                A1d(": was expecting closing quote for a string value");
                throw C00O.createAndThrow();
            }
            char[] cArr3 = this.A04;
            int i6 = super.A04;
            super.A04 = i6 + 1;
            char c2 = cArr3[i6];
            if (c2 < 256 && iArr2[c2] != 0) {
                if (c2 == '\"') {
                    c16o.A00 = i4;
                    return;
                } else if (c2 == '\\') {
                    c2 = A1h();
                } else if (c2 < ' ') {
                    A1w(c2, "string value");
                }
            }
            if (i4 >= A0E2.length) {
                A0E2 = c16o.A0D();
                i5 = 0;
            }
            i4 = i5 + 1;
            A0E2[i5] = c2;
            i5 = i4;
        }
    }

    public final void A28() {
        if (super.A04 < super.A03 || A2C()) {
            char[] cArr = this.A04;
            int i = super.A04;
            if (cArr[i] == '\n') {
                super.A04 = i + 1;
            }
        }
        super.A01++;
        super.A02 = super.A04;
    }

    public final void A2B(String str, String str2) {
        StringBuilder sb = new StringBuilder(str);
        while (true) {
            if (super.A04 >= super.A03 && !A2C()) {
                break;
            }
            char c = this.A04[super.A04];
            if (!Character.isJavaIdentifierPart(c)) {
                break;
            }
            super.A04++;
            sb.append(c);
            if (sb.length() >= 256) {
                sb.append("...");
                break;
            }
        }
        throw new C90173zy(this, String.format("Unrecognized token '%s': was expecting %s", sb, str2));
    }

    public final boolean A2C() {
        Reader reader = this.A06;
        if (reader != null) {
            char[] cArr = this.A04;
            int read = reader.read(cArr, 0, cArr.length);
            if (read > 0) {
                int i = super.A03;
                long j = i;
                this.A0F += j;
                super.A02 -= i;
                this.A02 -= j;
                super.A04 = 0;
                super.A03 = read;
                return true;
            }
            A1r();
            if (read == 0) {
                throw new IOException(AnonymousClass001.A0O("Reader returned 0 characters when trying to read ", super.A03));
            }
        }
        return false;
    }

    @Override // X.C16J
    public final void A1p() {
        char[] cArr;
        AnonymousClass168 anonymousClass168;
        super.A1p();
        AnonymousClass168 anonymousClass1682 = this.A09;
        if ((!anonymousClass1682.A06) && (anonymousClass168 = anonymousClass1682.A0B) != null && anonymousClass1682.A05) {
            C16A c16a = new C16A(anonymousClass1682);
            int i = c16a.A01;
            AtomicReference atomicReference = anonymousClass168.A0C;
            C16A c16a2 = (C16A) atomicReference.get();
            if (i != c16a2.A01) {
                if (i > 12000) {
                    c16a = new C16A(new AnonymousClass169[32], new String[64]);
                }
                C1EM.A00(c16a2, c16a, atomicReference);
            }
            anonymousClass1682.A06 = true;
        }
        if (this.A07 && (cArr = this.A04) != null) {
            this.A04 = null;
            C16H c16h = this.A0O;
            char[] cArr2 = c16h.A05;
            if (cArr != cArr2 && cArr.length < cArr2.length) {
                throw new IllegalArgumentException("Trying to release buffer smaller than original");
            }
            c16h.A05 = null;
            c16h.A08.A01.set(0, cArr);
        }
    }

    public final void A27() {
        if (!A2C()) {
            A1W();
            throw C00O.createAndThrow();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0021, code lost:
    
        if (r5.A04[r5.A04] != r6.charAt(r7)) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0023, code lost:
    
        r4 = r5.A04 + 1;
        r5.A04 = r4;
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002b, code lost:
    
        if (r7 < r2) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002f, code lost:
    
        if (r4 < r5.A03) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0035, code lost:
    
        if (A2C() != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0037, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0051, code lost:
    
        r1 = r5.A04[r5.A04];
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0059, code lost:
    
        if (r1 < '0') goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005d, code lost:
    
        if (r1 == ']') goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0061, code lost:
    
        if (r1 == '}') goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0068, code lost:
    
        if (java.lang.Character.isJavaIdentifierPart(r1) == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2:0x000b, code lost:
    
        if ((r4 + r2) >= r5.A03) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0040, code lost:
    
        if (r5.A04[r1] != r6.charAt(r7)) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0042, code lost:
    
        r1 = r5.A04 + 1;
        r5.A04 = r1;
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x004a, code lost:
    
        if (r7 < r2) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x004c, code lost:
    
        r1 = r5.A04[r1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000f, code lost:
    
        if (r4 < r5.A03) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0015, code lost:
    
        if (A2C() == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x006a, code lost:
    
        A2B(r6.substring(0, r7), A1o());
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x007a, code lost:
    
        throw X.C00O.createAndThrow();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A2A(java.lang.String r6, int r7) {
        /*
            r5 = this;
            int r2 = r6.length()
            int r4 = r5.A04
            r1 = r4
            int r3 = r4 + r2
            int r0 = r5.A03
            if (r3 < r0) goto L38
        Ld:
            int r0 = r5.A03
            if (r4 < r0) goto L17
            boolean r0 = r5.A2C()
            if (r0 == 0) goto L6a
        L17:
            char[] r1 = r5.A04
            int r0 = r5.A04
            char r1 = r1[r0]
            char r0 = r6.charAt(r7)
            if (r1 != r0) goto L6a
            int r0 = r5.A04
            int r4 = r0 + 1
            r5.A04 = r4
            int r7 = r7 + 1
            if (r7 < r2) goto Ld
            int r0 = r5.A03
            if (r4 < r0) goto L51
            boolean r0 = r5.A2C()
            if (r0 != 0) goto L51
        L37:
            return
        L38:
            char[] r0 = r5.A04
            char r1 = r0[r1]
            char r0 = r6.charAt(r7)
            if (r1 != r0) goto L6a
            int r0 = r5.A04
            int r1 = r0 + 1
            r5.A04 = r1
            int r7 = r7 + 1
            if (r7 < r2) goto L38
            char[] r0 = r5.A04
            char r1 = r0[r1]
            goto L57
        L51:
            char[] r1 = r5.A04
            int r0 = r5.A04
            char r1 = r1[r0]
        L57:
            r0 = 48
            if (r1 < r0) goto L37
            r0 = 93
            if (r1 == r0) goto L37
            r0 = 125(0x7d, float:1.75E-43)
            if (r1 == r0) goto L37
            char r0 = (char) r1
            boolean r0 = java.lang.Character.isJavaIdentifierPart(r0)
            if (r0 == 0) goto L37
        L6a:
            r0 = 0
            java.lang.String r1 = r6.substring(r0, r7)
            java.lang.String r0 = r5.A1o()
            r5.A2B(r1, r0)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16I.A2A(java.lang.String, int):void");
    }

    public C16I(C44T c44t, C16H c16h, AnonymousClass168 anonymousClass168, Reader reader, int i) {
        super(c16h, i);
        this.A06 = reader;
        C16H.A00(c16h.A05);
        char[] A01 = c16h.A08.A01(0, 0);
        c16h.A05 = A01;
        this.A04 = A01;
        super.A04 = 0;
        super.A03 = 0;
        this.A05 = c44t;
        this.A09 = anonymousClass168;
        this.A08 = anonymousClass168.A0A;
        this.A07 = true;
    }
}
