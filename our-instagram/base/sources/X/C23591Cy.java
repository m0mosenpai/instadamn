package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.common.dextricks.Constants;
import com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsHelper;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.1Cy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C23591Cy extends C16J {
    public int A00;
    public int A01;
    public int A02;
    public boolean A03;
    public byte[] A04;
    public int[] A05;
    public C44T A06;
    public InputStream A07;
    public boolean A08;
    public final C16B A09;
    public static final int A0J = EnumC222315z.ALLOW_TRAILING_COMMA.A00;
    public static final int A0H = EnumC222315z.ALLOW_NUMERIC_LEADING_ZEROS.A00;
    public static final int A0I = EnumC222315z.ALLOW_NON_NUMERIC_NUMBERS.A00;
    public static final int A0G = EnumC222315z.ALLOW_MISSING_VALUES.A00;
    public static final int A0A = EnumC222315z.ALLOW_SINGLE_QUOTES.A00;
    public static final int A0B = EnumC222315z.ALLOW_UNQUOTED_FIELD_NAMES.A00;
    public static final int A0F = EnumC222315z.ALLOW_COMMENTS.A00;
    public static final int A0C = EnumC222315z.ALLOW_YAML_COMMENTS.A00;
    public static final int[] A0E = AnonymousClass167.A05;
    public static final int[] A0D = AnonymousClass167.A02;

    private final C16R A09() {
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

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0035, code lost:
    
        if (r6 != 46) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0037, code lost:
    
        r1 = r1 - 1;
        r9.A04 = r1;
        r9.A0N.A00 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0043, code lost:
    
        if (((X.C16Q) r9.A0B).A01 != 0) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0045, code lost:
    
        A0Q(r2[r1] & 255);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0053, code lost:
    
        if (r6 != 69) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0015, code lost:
    
        r9.A0E = r13;
        r9.A05 = r7;
        r9.A06 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001e, code lost:
    
        return X.C16R.A0I;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final X.C16R A0C(char[] r10, int r11, int r12, boolean r13) {
        /*
            r9 = this;
            r7 = r12
            r5 = r11
            r4 = r10
        L3:
            r3 = r9
            int r1 = r9.A04
            int r0 = r9.A03
            r8 = r13
            if (r1 < r0) goto L1f
            boolean r0 = r9.A2J()
            if (r0 != 0) goto L1f
            X.16O r0 = r9.A0N
            r0.A00 = r5
        L15:
            r9.A0E = r13
            r9.A05 = r7
            r0 = 0
            r9.A06 = r0
            X.16R r0 = X.C16R.A0I
            return r0
        L1f:
            byte[] r2 = r9.A04
            int r0 = r9.A04
            int r1 = r0 + 1
            r9.A04 = r1
            r0 = r2[r0]
            r6 = r0 & 255(0xff, float:3.57E-43)
            r0 = 57
            if (r6 > r0) goto L4d
            r0 = 48
            if (r6 >= r0) goto L5a
            r0 = 46
            if (r6 == r0) goto L55
        L37:
            int r1 = r1 + (-1)
            r9.A04 = r1
            X.16O r0 = r9.A0N
            r0.A00 = r5
            X.16P r0 = r9.A0B
            int r0 = r0.A01
            if (r0 != 0) goto L15
            r0 = r2[r1]
            r0 = r0 & 255(0xff, float:3.57E-43)
            r9.A0Q(r0)
            goto L15
        L4d:
            r0 = 101(0x65, float:1.42E-43)
            if (r6 == r0) goto L55
            r0 = 69
            if (r6 != r0) goto L37
        L55:
            X.16R r0 = r3.A0B(r4, r5, r6, r7, r8)
            return r0
        L5a:
            int r0 = r4.length
            if (r5 < r0) goto L64
            X.16O r0 = r9.A0N
            char[] r4 = r0.A0D()
            r5 = 0
        L64:
            int r1 = r5 + 1
            char r0 = (char) r6
            r4[r5] = r0
            int r7 = r7 + 1
            r5 = r1
            goto L3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23591Cy.A0C(char[], int, int, boolean):X.16R");
    }

    private final String A0E(int[] iArr, int i, int i2, int i3) {
        int length = iArr.length;
        if (i >= length) {
            iArr = Arrays.copyOf(iArr, length + length);
            this.A05 = iArr;
        }
        int i4 = i + 1;
        if (i3 != 4) {
            i2 |= (-1) << (i3 << 3);
        }
        iArr[i] = i2;
        String A07 = this.A09.A07(iArr, i4);
        if (A07 == null) {
            return A0D(iArr, i4, i3);
        }
        return A07;
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
        throw new UnsupportedOperationException("Method not decompiled: X.C23591Cy.A1E(int):int");
    }

    @Override // X.C16L
    public final String A1N() {
        C16R A20;
        C16R c16r;
        super.A06 = 0;
        C16R c16r2 = ((C16K) this).A00;
        C16R c16r3 = C16R.A0A;
        if (c16r2 == c16r3) {
            A09();
            return null;
        }
        if (this.A03) {
            A2D();
        }
        int A02 = A02();
        if (A02 < 0) {
            close();
            ((C16K) this).A00 = null;
            return null;
        }
        this.A0L = null;
        if (A02 == 93) {
            A0F();
            ((C16K) this).A00 = C16R.A08;
            return null;
        }
        if (A02 == 125) {
            A0J();
            ((C16K) this).A00 = C16R.A09;
            return null;
        }
        C16P c16p = this.A0B;
        int i = ((C16Q) c16p).A00 + 1;
        ((C16Q) c16p).A00 = i;
        if (((C16Q) c16p).A01 != 0 && i > 0) {
            if (A02 != 44) {
                A1Z(A02, AnonymousClass001.A0g("was expecting comma to separate ", c16p.A02(), " entries"));
                throw C00O.createAndThrow();
            }
            A02 = A01();
            if ((((C16L) this).A00 & A0J) != 0) {
                if (A02 != 93) {
                    if (A02 == 125) {
                        A0J();
                        c16r = C16R.A09;
                    }
                } else {
                    A0F();
                    c16r = C16R.A08;
                }
                ((C16K) this).A00 = c16r;
                return null;
            }
        }
        if (((C16Q) this.A0B).A01 == 2) {
            this.A02 = super.A01;
            int i2 = super.A04;
            this.A01 = i2;
            this.A00 = i2 - super.A02;
            String A25 = A25(A02);
            this.A0B.A08(A25);
            ((C16K) this).A00 = c16r3;
            int A00 = A00();
            A0P();
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
                                    A2B();
                                    A20 = C16R.A0K;
                                }
                            } else {
                                A2A();
                                A20 = C16R.A0G;
                            }
                        } else {
                            A29();
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
        A0P();
        A0A(A02);
        return null;
    }

    @Override // X.C16K
    public final int A1U(int i) {
        C16R c16r = ((C16K) this).A00;
        if (c16r != C16R.A0I && c16r != C16R.A0H) {
            return super.A1U(0);
        }
        int i2 = super.A06;
        if ((i2 & 1) == 0) {
            if (i2 == 0) {
                return A1i();
            }
            A1q();
        }
        return super.A07;
    }

    @Override // X.C16K
    public final String A1V(String str) {
        C16R c16r = ((C16K) this).A00;
        if (c16r == C16R.A0J) {
            if (this.A03) {
                this.A03 = false;
                return A24();
            }
            return this.A0N.A06();
        }
        if (c16r == C16R.A0A) {
            return A0q();
        }
        return super.A1V(null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005a, code lost:
    
        if (r10 != 69) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0065, code lost:
    
        r13.A04 = r2 - 1;
        r3.A00 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006e, code lost:
    
        if (((X.C16Q) r13.A0B).A01 != 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0070, code lost:
    
        A0Q(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0073, code lost:
    
        r13.A0E = true;
        r13.A05 = r11;
        r13.A06 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007c, code lost:
    
        return X.C16R.A0I;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0063, code lost:
    
        if (r10 != 46) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0086, code lost:
    
        if (r0 > 57) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C16R A20() {
        /*
            r13 = this;
            r7 = r13
            X.16O r3 = r13.A0N
            char[] r8 = r3.A0C()
            r1 = 45
            r0 = 0
            r8[r0] = r1
            int r1 = r13.A04
            int r0 = r13.A03
            if (r1 < r0) goto L15
            r13.A28()
        L15:
            byte[] r2 = r13.A04
            int r1 = r13.A04
            int r0 = r1 + 1
            r13.A04 = r0
            r0 = r2[r1]
            r0 = r0 & 255(0xff, float:3.57E-43)
            r6 = 57
            r5 = 48
            r12 = 1
            if (r0 > r5) goto L86
            if (r0 != r5) goto L88
            int r0 = r13.A03()
        L2e:
            r9 = 2
            char r0 = (char) r0
            r8[r12] = r0
            int r1 = r13.A03
            int r2 = r13.A04
            int r0 = r8.length
            int r0 = r0 + r2
            int r0 = r0 - r9
            int r4 = java.lang.Math.min(r1, r0)
            r11 = 1
        L3e:
            if (r2 < r4) goto L45
            X.16R r0 = r13.A0C(r8, r9, r11, r12)
            return r0
        L45:
            byte[] r1 = r13.A04
            r0 = r2
            int r2 = r2 + 1
            r13.A04 = r2
            r0 = r1[r0]
            r10 = r0 & 255(0xff, float:3.57E-43)
            if (r10 < r5) goto L61
            if (r10 <= r6) goto L7d
            r0 = 101(0x65, float:1.42E-43)
            if (r10 == r0) goto L5c
            r0 = 69
            if (r10 != r0) goto L65
        L5c:
            X.16R r0 = r7.A0B(r8, r9, r10, r11, r12)
            return r0
        L61:
            r0 = 46
            if (r10 == r0) goto L5c
        L65:
            int r2 = r2 - r12
            r13.A04 = r2
            r3.A00 = r9
            X.16P r0 = r13.A0B
            int r0 = r0.A01
            if (r0 != 0) goto L73
            r13.A0Q(r10)
        L73:
            r13.A0E = r12
            r13.A05 = r11
            r0 = 0
            r13.A06 = r0
            X.16R r0 = X.C16R.A0I
            return r0
        L7d:
            int r11 = r11 + 1
            int r1 = r9 + 1
            char r0 = (char) r10
            r8[r9] = r0
            r9 = r1
            goto L3e
        L86:
            if (r0 <= r6) goto L2e
        L88:
            X.16R r0 = r13.A23(r0, r12)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23591Cy.A20():X.16R");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003f, code lost:
    
        if (r10 != 69) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004a, code lost:
    
        r13.A04 = r3 - 1;
        r2.A00 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0053, code lost:
    
        if (((X.C16Q) r13.A0B).A01 != 0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0055, code lost:
    
        A0Q(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0058, code lost:
    
        r13.A0E = false;
        r13.A05 = r11;
        r13.A06 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0060, code lost:
    
        return X.C16R.A0I;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0048, code lost:
    
        if (r10 != 46) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C16R A22(int r14) {
        /*
            r13 = this;
            r7 = r13
            X.16O r2 = r13.A0N
            char[] r8 = r2.A0C()
            r4 = 48
            if (r14 != r4) goto Lf
            int r14 = r13.A03()
        Lf:
            char r0 = (char) r14
            r12 = 0
            r8[r12] = r0
            int r1 = r13.A03
            int r3 = r13.A04
            int r0 = r8.length
            int r0 = r0 + r3
            r6 = 1
            int r0 = r0 - r6
            int r5 = java.lang.Math.min(r1, r0)
            r9 = 1
            r11 = 1
        L21:
            if (r3 < r5) goto L28
            X.16R r0 = r13.A0C(r8, r9, r11, r12)
            return r0
        L28:
            byte[] r1 = r13.A04
            r0 = r3
            int r3 = r3 + 1
            r13.A04 = r3
            r0 = r1[r0]
            r10 = r0 & 255(0xff, float:3.57E-43)
            if (r10 < r4) goto L46
            r0 = 57
            if (r10 <= r0) goto L61
            r0 = 101(0x65, float:1.42E-43)
            if (r10 == r0) goto L41
            r0 = 69
            if (r10 != r0) goto L4a
        L41:
            X.16R r0 = r7.A0B(r8, r9, r10, r11, r12)
            return r0
        L46:
            r0 = 46
            if (r10 == r0) goto L41
        L4a:
            int r3 = r3 - r6
            r13.A04 = r3
            r2.A00 = r9
            X.16P r0 = r13.A0B
            int r0 = r0.A01
            if (r0 != 0) goto L58
            r13.A0Q(r10)
        L58:
            r13.A0E = r12
            r13.A05 = r11
            r13.A06 = r12
            X.16R r0 = X.C16R.A0I
            return r0
        L61:
            int r11 = r11 + 1
            int r1 = r9 + 1
            char r0 = (char) r10
            r8[r9] = r0
            r9 = r1
            goto L21
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23591Cy.A22(int):X.16R");
    }

    public final void A2D() {
        this.A03 = false;
        int[] iArr = A0E;
        byte[] bArr = this.A04;
        while (true) {
            int i = super.A04;
            int i2 = super.A03;
            if (i >= i2) {
                A28();
                i = super.A04;
                i2 = super.A03;
            }
            while (true) {
                if (i < i2) {
                    int i3 = i + 1;
                    int i4 = bArr[i] & 255;
                    int i5 = iArr[i4];
                    if (i5 != 0) {
                        super.A04 = i3;
                        if (i4 == 34) {
                            return;
                        }
                        if (i5 != 1) {
                            if (i5 != 2) {
                                if (i5 != 3) {
                                    if (i5 != 4) {
                                        if (i4 < 32) {
                                            A1w(i4, "string value");
                                        } else {
                                            A2E(i4);
                                            throw C00O.createAndThrow();
                                        }
                                    } else {
                                        A0O();
                                    }
                                } else {
                                    A0N();
                                }
                            } else {
                                A0M();
                            }
                        } else {
                            A1h();
                        }
                    } else {
                        i = i3;
                    }
                } else {
                    super.A04 = i;
                    break;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0038, code lost:
    
        if (r6 > 32) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0024, code lost:
    
        if (r6 == 58) goto L10;
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
            byte[] r7 = r10.A04
            r6 = r7[r9]
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
            r6 = r7[r9]
        L24:
            if (r6 != r0) goto L48
        L26:
            int r0 = r9 + 1
            r10.A04 = r0
            r6 = r7[r0]
            if (r6 > r2) goto L3a
            if (r6 == r2) goto L32
            if (r6 != r5) goto L43
        L32:
            int r0 = r0 + 1
            r10.A04 = r0
            r6 = r7[r0]
            if (r6 <= r2) goto L43
        L3a:
            if (r6 == r3) goto L43
            if (r6 == r4) goto L43
            int r0 = r0 + 1
            r10.A04 = r0
            return r6
        L43:
            int r6 = r10.A08(r1)
            return r6
        L48:
            int r6 = r10.A08(r8)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23591Cy.A00():int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a8, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0024, code lost:
    
        if (r3.A04 < r3.A03) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x002a, code lost:
    
        if (A2J() != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x003f, code lost:
    
        throw new X.C90173zy(r3, X.AnonymousClass001.A0g("Unexpected end-of-input within/between ", r3.A0B.A02(), " entries"));
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0040, code lost:
    
        r2 = r3.A04;
        r0 = r3.A04;
        r1 = r0 + 1;
        r3.A04 = r1;
        r2 = r2[r0] & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x004e, code lost:
    
        if (r2 <= 32) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0067, code lost:
    
        if (r2 == 32) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x006b, code lost:
    
        if (r2 != 10) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0078, code lost:
    
        if (r2 != 13) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0080, code lost:
    
        if (r2 == 9) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x007a, code lost:
    
        A2C();
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x006d, code lost:
    
        r3.A01++;
        r3.A02 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0052, code lost:
    
        if (r2 != 47) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x005a, code lost:
    
        if (r2 != 35) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0061, code lost:
    
        if ((((X.C16L) r3).A00 & X.C23591Cy.A0C) == 0) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0063, code lost:
    
        A0L();
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0054, code lost:
    
        A0K();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int A01() {
        /*
            r3 = this;
        L0:
            int r2 = r3.A04
            int r0 = r3.A03
            if (r2 >= r0) goto L20
            byte[] r0 = r3.A04
            int r1 = r2 + 1
            r3.A04 = r1
            r0 = r0[r2]
            r2 = r0 & 255(0xff, float:3.57E-43)
            r0 = 32
            if (r2 <= r0) goto L83
            r0 = 47
            if (r2 == r0) goto L1c
            r0 = 35
            if (r2 != r0) goto La8
        L1c:
            int r0 = r1 + (-1)
            r3.A04 = r0
        L20:
            int r1 = r3.A04
            int r0 = r3.A03
            if (r1 < r0) goto L40
            boolean r0 = r3.A2J()
            if (r0 != 0) goto L40
            java.lang.String r2 = "Unexpected end-of-input within/between "
            X.16P r0 = r3.A0B
            java.lang.String r1 = r0.A02()
            java.lang.String r0 = " entries"
            java.lang.String r1 = X.AnonymousClass001.A0g(r2, r1, r0)
            X.3zy r0 = new X.3zy
            r0.<init>(r3, r1)
            throw r0
        L40:
            byte[] r2 = r3.A04
            int r0 = r3.A04
            int r1 = r0 + 1
            r3.A04 = r1
            r0 = r2[r0]
            r2 = r0 & 255(0xff, float:3.57E-43)
            r0 = 32
            if (r2 <= r0) goto L67
            r0 = 47
            if (r2 != r0) goto L58
            r3.A0K()
            goto L20
        L58:
            r0 = 35
            if (r2 != r0) goto La8
            int r1 = r3.A00
            int r0 = X.C23591Cy.A0C
            r1 = r1 & r0
            if (r1 == 0) goto La8
            r3.A0L()
            goto L20
        L67:
            if (r2 == r0) goto L20
            r0 = 10
            if (r2 != r0) goto L76
            int r0 = r3.A01
            int r0 = r0 + 1
            r3.A01 = r0
            r3.A02 = r1
            goto L20
        L76:
            r0 = 13
            if (r2 != r0) goto L7e
            r3.A2C()
            goto L20
        L7e:
            r0 = 9
            if (r2 == r0) goto L20
            goto La0
        L83:
            if (r2 == r0) goto L0
            r0 = 10
            if (r2 != r0) goto L93
            int r0 = r3.A01
            int r0 = r0 + 1
            r3.A01 = r0
            r3.A02 = r1
            goto L0
        L93:
            r0 = 13
            if (r2 != r0) goto L9c
            r3.A2C()
            goto L0
        L9c:
            r0 = 9
            if (r2 == r0) goto L0
        La0:
            r3.A1Y(r2)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        La8:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23591Cy.A01():int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00a2, code lost:
    
        A1Y(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00a9, code lost:
    
        throw X.C00O.createAndThrow();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int A02() {
        /*
            r9 = this;
            int r1 = r9.A04
            int r0 = r9.A03
            if (r1 < r0) goto L11
            boolean r0 = r9.A2J()
            if (r0 != 0) goto L11
        Lc:
            r9.A1X()
            r2 = -1
        L10:
            return r2
        L11:
            byte[] r2 = r9.A04
            int r0 = r9.A04
            int r1 = r0 + 1
            r9.A04 = r1
            r0 = r2[r0]
            r2 = r0 & 255(0xff, float:3.57E-43)
            r8 = 35
            r7 = 47
            r6 = 32
            if (r2 > r6) goto L49
            r5 = 9
            r4 = 13
            r3 = 10
        L2b:
            if (r2 == r6) goto L37
            if (r2 != r3) goto L9a
            int r0 = r9.A01
            int r0 = r0 + 1
            r9.A01 = r0
            r9.A02 = r1
        L37:
            int r2 = r9.A04
            int r0 = r9.A03
            if (r2 >= r0) goto L51
            byte[] r0 = r9.A04
            int r1 = r2 + 1
            r9.A04 = r1
            r0 = r0[r2]
            r2 = r0 & 255(0xff, float:3.57E-43)
            if (r2 <= r6) goto L2b
        L49:
            if (r2 == r7) goto L4d
            if (r2 != r8) goto L10
        L4d:
            int r0 = r1 + (-1)
            r9.A04 = r0
        L51:
            int r1 = r9.A04
            int r0 = r9.A03
            if (r1 < r0) goto L5d
            boolean r0 = r9.A2J()
            if (r0 == 0) goto Lc
        L5d:
            byte[] r2 = r9.A04
            int r0 = r9.A04
            int r1 = r0 + 1
            r9.A04 = r1
            r0 = r2[r0]
            r2 = r0 & 255(0xff, float:3.57E-43)
            if (r2 <= r6) goto L7e
            if (r2 != r7) goto L71
            r9.A0K()
            goto L51
        L71:
            if (r2 != r8) goto L10
            int r1 = r9.A00
            int r0 = X.C23591Cy.A0C
            r1 = r1 & r0
            if (r1 == 0) goto L10
            r9.A0L()
            goto L51
        L7e:
            if (r2 == r6) goto L51
            r0 = 10
            if (r2 != r0) goto L8d
            int r0 = r9.A01
            int r0 = r0 + 1
            r9.A01 = r0
            r9.A02 = r1
            goto L51
        L8d:
            r0 = 13
            if (r2 != r0) goto L95
            r9.A2C()
            goto L51
        L95:
            r0 = 9
            if (r2 == r0) goto L51
            goto La2
        L9a:
            if (r2 != r4) goto La0
            r9.A2C()
            goto L37
        La0:
            if (r2 == r5) goto L37
        La2:
            r9.A1Y(r2)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23591Cy.A02():int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0038, code lost:
    
        if (r3 == 48) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003c, code lost:
    
        if (r1 < r6.A03) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0042, code lost:
    
        if (A2J() == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0044, code lost:
    
        r0 = r6.A04;
        r1 = r6.A04;
        r3 = r0[r1] & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004c, code lost:
    
        if (r3 < 48) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004e, code lost:
    
        if (r3 > 57) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0050, code lost:
    
        r1 = r1 + 1;
        r6.A04 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0054, code lost:
    
        if (r3 == 48) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0056, code lost:
    
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int A03() {
        /*
            r6 = this;
            int r1 = r6.A04
            int r0 = r6.A03
            r5 = 48
            if (r1 < r0) goto Lf
            boolean r0 = r6.A2J()
            if (r0 != 0) goto Lf
        Le:
            return r5
        Lf:
            byte[] r0 = r6.A04
            int r4 = r6.A04
            r0 = r0[r4]
            r3 = r0 & 255(0xff, float:3.57E-43)
            if (r3 < r5) goto Le
            r2 = 57
            if (r3 > r2) goto Le
            int r1 = r6.A00
            int r0 = X.C23591Cy.A0H
            r1 = r1 & r0
            if (r1 != 0) goto L34
            java.lang.String r1 = "Leading zeroes not allowed"
            java.lang.String r0 = "Invalid numeric value: "
            java.lang.String r0 = X.AnonymousClass001.A0R(r0, r1)
            r6.A1c(r0)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L34:
            int r1 = r4 + 1
            r6.A04 = r1
            if (r3 != r5) goto L56
        L3a:
            int r0 = r6.A03
            if (r1 < r0) goto L44
            boolean r0 = r6.A2J()
            if (r0 == 0) goto L56
        L44:
            byte[] r0 = r6.A04
            int r1 = r6.A04
            r0 = r0[r1]
            r3 = r0 & 255(0xff, float:3.57E-43)
            if (r3 < r5) goto Le
            if (r3 > r2) goto Le
            int r1 = r1 + 1
            r6.A04 = r1
            if (r3 == r5) goto L3a
        L56:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23591Cy.A03():int");
    }

    private final int A04(int i) {
        if (super.A04 >= super.A03) {
            A28();
        }
        byte[] bArr = this.A04;
        int i2 = super.A04;
        int i3 = i2 + 1;
        super.A04 = i3;
        byte b = bArr[i2];
        if ((b & 192) != 128) {
            A2G(b & 255, i3);
            throw C00O.createAndThrow();
        }
        return ((i & 31) << 6) | (b & 63);
    }

    private final int A05(int i) {
        if (super.A04 >= super.A03) {
            A28();
        }
        int i2 = i & 15;
        byte[] bArr = this.A04;
        int i3 = super.A04;
        int i4 = i3 + 1;
        super.A04 = i4;
        byte b = bArr[i3];
        if ((b & 192) != 128) {
            A2G(b & 255, i4);
        } else {
            int i5 = (i2 << 6) | (b & 63);
            if (i4 >= super.A03) {
                A28();
            }
            byte[] bArr2 = this.A04;
            int i6 = super.A04;
            int i7 = i6 + 1;
            super.A04 = i7;
            byte b2 = bArr2[i6];
            if ((b2 & 192) != 128) {
                A2G(b2 & 255, i7);
            } else {
                return (i5 << 6) | (b2 & 63);
            }
        }
        throw C00O.createAndThrow();
    }

    private final int A06(int i) {
        int i2 = i & 15;
        byte[] bArr = this.A04;
        int i3 = super.A04;
        int i4 = i3 + 1;
        super.A04 = i4;
        byte b = bArr[i3];
        if ((b & 192) != 128) {
            A2G(b & 255, i4);
        } else {
            int i5 = (i2 << 6) | (b & 63);
            int i6 = i4 + 1;
            super.A04 = i6;
            byte b2 = bArr[i4];
            if ((b2 & 192) != 128) {
                A2G(b2 & 255, i6);
            } else {
                return (i5 << 6) | (b2 & 63);
            }
        }
        throw C00O.createAndThrow();
    }

    private final int A07(int i) {
        if (super.A04 >= super.A03) {
            A28();
        }
        byte[] bArr = this.A04;
        int i2 = super.A04;
        int i3 = i2 + 1;
        super.A04 = i3;
        byte b = bArr[i2];
        if ((b & 192) == 128) {
            int i4 = ((i & 7) << 6) | (b & 63);
            if (i3 >= super.A03) {
                A28();
            }
            byte[] bArr2 = this.A04;
            int i5 = super.A04;
            i3 = i5 + 1;
            super.A04 = i3;
            b = bArr2[i5];
            if ((b & 192) == 128) {
                int i6 = (i4 << 6) | (b & 63);
                if (i3 >= super.A03) {
                    A28();
                }
                byte[] bArr3 = this.A04;
                int i7 = super.A04;
                int i8 = i7 + 1;
                super.A04 = i8;
                byte b2 = bArr3[i7];
                if ((b2 & 192) != 128) {
                    A2G(b2 & 255, i8);
                    throw C00O.createAndThrow();
                }
                return ((i6 << 6) | (b2 & 63)) - Constants.LOAD_RESULT_PGO_ATTEMPTED;
            }
        }
        A2G(b & 255, i3);
        throw C00O.createAndThrow();
    }

    private final int A08(boolean z) {
        while (true) {
            if (super.A04 >= super.A03 && !A2J()) {
                A1d(AnonymousClass001.A0g(" within/between ", this.A0B.A02(), " entries"));
                break;
            }
            byte[] bArr = this.A04;
            int i = super.A04;
            int i2 = i + 1;
            super.A04 = i2;
            int i3 = bArr[i] & 255;
            if (i3 > 32) {
                if (i3 == 47) {
                    A0K();
                } else if (i3 == 35 && (((C16L) this).A00 & A0C) != 0) {
                    A0L();
                } else {
                    if (z) {
                        return i3;
                    }
                    if (i3 != 58) {
                        A1Z(i3, "was expecting a colon to separate field name and value");
                        break;
                    }
                    z = true;
                }
            } else if (i3 == 32) {
                continue;
            } else if (i3 == 10) {
                super.A01++;
                super.A02 = i2;
            } else if (i3 == 13) {
                A2C();
            } else if (i3 != 9) {
                A1Y(i3);
                break;
            }
        }
        throw C00O.createAndThrow();
    }

    private final C16R A0A(int i) {
        C16R A20;
        if (i == 34) {
            this.A03 = true;
            A20 = C16R.A0J;
        } else if (i != 45) {
            if (i != 46) {
                if (i != 91) {
                    if (i != 102) {
                        if (i != 110) {
                            if (i != 116) {
                                if (i != 123) {
                                    switch (i) {
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
                                            A20 = A22(i);
                                            break;
                                        default:
                                            A20 = A21(i);
                                            break;
                                    }
                                } else {
                                    this.A0B = this.A0B.A06(super.A09, super.A08);
                                    A20 = C16R.A0D;
                                }
                            } else {
                                A2B();
                                A20 = C16R.A0K;
                            }
                        } else {
                            A2A();
                            A20 = C16R.A0G;
                        }
                    } else {
                        A29();
                        A20 = C16R.A0F;
                    }
                } else {
                    this.A0B = this.A0B.A05(super.A09, super.A08);
                    A20 = C16R.A0C;
                }
            } else {
                A20 = A1z();
            }
        } else {
            A20 = A20();
        }
        ((C16K) this).A00 = A20;
        return A20;
    }

    private final C16R A0B(char[] cArr, int i, int i2, int i3, boolean z) {
        boolean z2;
        String str;
        if (i2 == 46) {
            if (i >= cArr.length) {
                cArr = this.A0N.A0D();
                i = 0;
            }
            int i4 = i + 1;
            cArr[i] = '.';
            i = i4;
            int i5 = 0;
            while (true) {
                if (super.A04 >= super.A03 && !A2J()) {
                    z2 = true;
                    break;
                }
                byte[] bArr = this.A04;
                int i6 = super.A04;
                super.A04 = i6 + 1;
                i2 = bArr[i6] & 255;
                if (i2 < 48 || i2 > 57) {
                    break;
                }
                i5++;
                if (i4 >= cArr.length) {
                    cArr = this.A0N.A0D();
                    i = 0;
                }
                i4 = i + 1;
                cArr[i] = (char) i2;
                i = i4;
            }
            z2 = false;
            if (i5 == 0) {
                str = "Decimal point not followed by a digit";
                A1a(i2, str);
                throw C00O.createAndThrow();
            }
        } else {
            z2 = false;
        }
        if (i2 == 101 || i2 == 69) {
            if (i >= cArr.length) {
                cArr = this.A0N.A0D();
                i = 0;
            }
            int i7 = i + 1;
            cArr[i] = (char) i2;
            if (super.A04 >= super.A03) {
                A28();
            }
            byte[] bArr2 = this.A04;
            int i8 = super.A04;
            int i9 = i8 + 1;
            super.A04 = i9;
            i2 = bArr2[i8] & 255;
            if (i2 == 45 || i2 == 43) {
                if (i7 >= cArr.length) {
                    cArr = this.A0N.A0D();
                    i7 = 0;
                }
                int i10 = i7 + 1;
                cArr[i7] = (char) i2;
                if (i9 >= super.A03) {
                    A28();
                }
                byte[] bArr3 = this.A04;
                int i11 = super.A04;
                i9 = i11 + 1;
                super.A04 = i9;
                i2 = bArr3[i11] & 255;
                i7 = i10;
            }
            int i12 = 0;
            while (i2 >= 48 && i2 <= 57) {
                i12++;
                if (i7 >= cArr.length) {
                    cArr = this.A0N.A0D();
                    i7 = 0;
                }
                i = i7 + 1;
                cArr[i7] = (char) i2;
                if (i9 >= super.A03 && !A2J()) {
                    z2 = true;
                    break;
                }
                byte[] bArr4 = this.A04;
                int i13 = super.A04;
                i9 = i13 + 1;
                super.A04 = i9;
                i2 = bArr4[i13] & 255;
                i7 = i;
            }
            i = i7;
            if (i12 == 0) {
                str = "Exponent indicator not followed by a digit";
                A1a(i2, str);
                throw C00O.createAndThrow();
            }
        }
        if (!z2) {
            super.A04--;
            if (((C16Q) this.A0B).A01 == 0) {
                A0Q(i2);
            }
        }
        this.A0N.A00 = i;
        this.A0E = z;
        super.A05 = i3;
        super.A06 = 0;
        return C16R.A0H;
    }

    private final String A0D(int[] iArr, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6 = ((i << 2) - 4) + i2;
        if (i2 < 4) {
            int i7 = i - 1;
            i3 = iArr[i7];
            iArr[i7] = i3 << ((4 - i2) << 3);
        } else {
            i3 = 0;
        }
        C16O c16o = this.A0N;
        char[] A0C2 = c16o.A0C();
        int i8 = 0;
        int i9 = 0;
        while (i8 < i6) {
            int i10 = (iArr[i8 >> 2] >> ((3 - (i8 & 3)) << 3)) & 255;
            i8++;
            if (i10 > 127) {
                if ((i10 & 224) == 192) {
                    i4 = i10 & 31;
                    i5 = 1;
                } else if ((i10 & 240) == 224) {
                    i4 = i10 & 15;
                    i5 = 2;
                } else if ((i10 & 248) == 240) {
                    i4 = i10 & 7;
                    i5 = 3;
                } else {
                    A2E(i10);
                    throw C00O.createAndThrow();
                }
                if (i8 + i5 > i6) {
                    A1d(" in field name");
                } else {
                    int i11 = iArr[i8 >> 2] >> ((3 - (i8 & 3)) << 3);
                    i8++;
                    if ((i11 & 192) != 128) {
                        A2F(i11);
                    } else {
                        i10 = (i11 & 63) | (i4 << 6);
                        if (i5 > 1) {
                            int i12 = iArr[i8 >> 2] >> ((3 - (i8 & 3)) << 3);
                            i8++;
                            if ((i12 & 192) == 128) {
                                i10 = (i12 & 63) | (i10 << 6);
                                if (i5 > 2) {
                                    int i13 = iArr[i8 >> 2] >> ((3 - (i8 & 3)) << 3);
                                    i8++;
                                    if ((i13 & 192) != 128) {
                                        i12 = i13 & 255;
                                    } else {
                                        int i14 = ((i10 << 6) | (i13 & 63)) - Constants.LOAD_RESULT_PGO_ATTEMPTED;
                                        if (i9 >= A0C2.length) {
                                            char[] cArr = c16o.A07;
                                            int length = cArr.length;
                                            int i15 = (length >> 1) + length;
                                            if (i15 > 65536) {
                                                i15 = (length >> 2) + length;
                                            }
                                            A0C2 = Arrays.copyOf(cArr, i15);
                                            c16o.A07 = A0C2;
                                        }
                                        A0C2[i9] = (char) ((i14 >> 10) + 55296);
                                        i10 = (i14 & 1023) | 56320;
                                        i9++;
                                    }
                                }
                            }
                            A2F(i12);
                        }
                    }
                }
                throw C00O.createAndThrow();
            }
            if (i9 >= A0C2.length) {
                char[] cArr2 = c16o.A07;
                int length2 = cArr2.length;
                int i16 = (length2 >> 1) + length2;
                if (i16 > 65536) {
                    i16 = (length2 >> 2) + length2;
                }
                A0C2 = Arrays.copyOf(cArr2, i16);
                c16o.A07 = A0C2;
            }
            A0C2[i9] = (char) i10;
            i9++;
        }
        String str = new String(A0C2, 0, i9);
        if (i2 < 4) {
            iArr[i - 1] = i3;
        }
        return this.A09.A06(str, iArr, i);
    }

    private final void A0K() {
        if ((((C16L) this).A00 & A0F) == 0) {
            A1Z(47, "maybe a (non-standard) comment? (not recognized as one since Feature 'ALLOW_COMMENTS' not enabled for parser)");
        } else {
            if (super.A04 < super.A03 || A2J()) {
                byte[] bArr = this.A04;
                int i = super.A04;
                super.A04 = i + 1;
                int i2 = bArr[i] & 255;
                if (i2 == 47) {
                    A0L();
                    return;
                }
                if (i2 == 42) {
                    int[] iArr = AnonymousClass167.A03;
                    while (true) {
                        if (super.A04 >= super.A03 && !A2J()) {
                            break;
                        }
                        byte[] bArr2 = this.A04;
                        int i3 = super.A04;
                        int i4 = i3 + 1;
                        super.A04 = i4;
                        int i5 = bArr2[i3] & 255;
                        int i6 = iArr[i5];
                        if (i6 != 0) {
                            if (i6 != 2) {
                                if (i6 != 3) {
                                    if (i6 != 4) {
                                        if (i6 != 10) {
                                            if (i6 != 13) {
                                                if (i6 != 42) {
                                                    if (i5 < 32) {
                                                        A1Y(i5);
                                                    } else {
                                                        A2E(i5);
                                                    }
                                                } else {
                                                    if (i4 >= super.A03 && !A2J()) {
                                                        break;
                                                    }
                                                    byte[] bArr3 = this.A04;
                                                    int i7 = super.A04;
                                                    if (bArr3[i7] == 47) {
                                                        super.A04 = i7 + 1;
                                                        return;
                                                    }
                                                }
                                            } else {
                                                A2C();
                                            }
                                        } else {
                                            super.A01++;
                                            super.A02 = i4;
                                        }
                                    } else {
                                        A0O();
                                    }
                                } else {
                                    A0N();
                                }
                            } else {
                                A0M();
                            }
                        }
                    }
                } else {
                    A1Z(i2, "was expecting either '*' or '/' for a comment");
                }
            }
            A1d(" in a comment");
        }
        throw C00O.createAndThrow();
    }

    private final void A0L() {
        int[] iArr = AnonymousClass167.A03;
        while (true) {
            if (super.A04 < super.A03 || A2J()) {
                byte[] bArr = this.A04;
                int i = super.A04;
                int i2 = i + 1;
                super.A04 = i2;
                int i3 = bArr[i] & 255;
                int i4 = iArr[i3];
                if (i4 != 0) {
                    if (i4 != 2) {
                        if (i4 != 3) {
                            if (i4 != 4) {
                                if (i4 != 10) {
                                    if (i4 != 13) {
                                        if (i4 != 42 && i4 < 0) {
                                            if (i3 < 32) {
                                                A1Y(i3);
                                            } else {
                                                A2E(i3);
                                            }
                                            throw C00O.createAndThrow();
                                        }
                                    } else {
                                        A2C();
                                        return;
                                    }
                                } else {
                                    super.A01++;
                                    super.A02 = i2;
                                    return;
                                }
                            } else {
                                A0O();
                            }
                        } else {
                            A0N();
                        }
                    } else {
                        A0M();
                    }
                }
            } else {
                return;
            }
        }
    }

    private final void A0M() {
        if (super.A04 >= super.A03) {
            A28();
        }
        byte[] bArr = this.A04;
        int i = super.A04;
        int i2 = i + 1;
        super.A04 = i2;
        byte b = bArr[i];
        if ((b & 192) != 128) {
            A2G(b & 255, i2);
            throw C00O.createAndThrow();
        }
    }

    private final void A0N() {
        if (super.A04 >= super.A03) {
            A28();
        }
        byte[] bArr = this.A04;
        int i = super.A04;
        int i2 = i + 1;
        super.A04 = i2;
        byte b = bArr[i];
        if ((b & 192) == 128) {
            if (i2 >= super.A03) {
                A28();
            }
            byte[] bArr2 = this.A04;
            int i3 = super.A04;
            i2 = i3 + 1;
            super.A04 = i2;
            b = bArr2[i3];
            if ((b & 192) == 128) {
                return;
            }
        }
        A2G(b & 255, i2);
        throw C00O.createAndThrow();
    }

    private final void A0O() {
        if (super.A04 >= super.A03) {
            A28();
        }
        byte[] bArr = this.A04;
        int i = super.A04;
        int i2 = i + 1;
        super.A04 = i2;
        byte b = bArr[i];
        if ((b & 192) == 128) {
            if (i2 >= super.A03) {
                A28();
            }
            byte[] bArr2 = this.A04;
            int i3 = super.A04;
            i2 = i3 + 1;
            super.A04 = i2;
            b = bArr2[i3];
            if ((b & 192) == 128) {
                if (i2 >= super.A03) {
                    A28();
                }
                byte[] bArr3 = this.A04;
                int i4 = super.A04;
                i2 = i4 + 1;
                super.A04 = i2;
                b = bArr3[i4];
                if ((b & 192) == 128) {
                    return;
                }
            }
        }
        A2G(b & 255, i2);
        throw C00O.createAndThrow();
    }

    private final void A0P() {
        super.A09 = super.A01;
        int i = super.A04;
        this.A0G = this.A0F + i;
        super.A08 = i - super.A02;
    }

    private final void A0Q(int i) {
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
                A2C();
                return;
            }
            super.A01++;
            super.A02 = i2;
        }
    }

    private final void A0S(char[] cArr, int i) {
        int[] iArr = A0E;
        byte[] bArr = this.A04;
        while (true) {
            int i2 = super.A04;
            if (i2 >= super.A03) {
                A28();
                i2 = super.A04;
            }
            int i3 = 0;
            if (i >= cArr.length) {
                cArr = this.A0N.A0D();
                i = 0;
            }
            int i4 = super.A03;
            int length = cArr.length;
            int min = Math.min(i4, (length - i) + i2);
            while (true) {
                if (i2 < min) {
                    int i5 = i2 + 1;
                    int i6 = bArr[i2] & 255;
                    int i7 = iArr[i6];
                    if (i7 != 0) {
                        super.A04 = i5;
                        if (i6 == 34) {
                            this.A0N.A00 = i;
                            return;
                        }
                        if (i7 != 1) {
                            if (i7 != 2) {
                                if (i7 != 3) {
                                    if (i7 != 4) {
                                        if (i6 < 32) {
                                            A1w(i6, "string value");
                                        } else {
                                            A2E(i6);
                                            throw C00O.createAndThrow();
                                        }
                                    } else {
                                        int A07 = A07(i6);
                                        int i8 = i + 1;
                                        cArr[i] = (char) (55296 | (A07 >> 10));
                                        if (i8 >= length) {
                                            cArr = this.A0N.A0D();
                                            i = 0;
                                        } else {
                                            i = i8;
                                        }
                                        i6 = (A07 & 1023) | 56320;
                                    }
                                } else if (i4 - i5 >= 2) {
                                    i6 = A06(i6);
                                } else {
                                    i6 = A05(i6);
                                }
                            } else {
                                i6 = A04(i6);
                            }
                        } else {
                            i6 = A1h();
                        }
                        if (i >= cArr.length) {
                            cArr = this.A0N.A0D();
                        } else {
                            i3 = i;
                        }
                        i = i3 + 1;
                        cArr[i3] = (char) i6;
                    } else {
                        cArr[i] = (char) i6;
                        i2 = i5;
                        i++;
                    }
                } else {
                    super.A04 = i2;
                    break;
                }
            }
        }
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
                A27();
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
            r3.A27()
        L1b:
            X.16O r0 = r3.A0N
            int r0 = r0.A02
            if (r0 >= 0) goto L22
            r0 = 0
        L22:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23591Cy.A1C():int");
    }

    @Override // X.C16K, X.C16L
    public final int A1D() {
        C16R c16r = ((C16K) this).A00;
        if (c16r != C16R.A0I && c16r != C16R.A0H) {
            return super.A1U(0);
        }
        int i = super.A06;
        if ((i & 1) == 0) {
            if (i == 0) {
                return A1i();
            }
            A1q();
        }
        return super.A07;
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x015d, code lost:
    
        r19.A03 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x015f, code lost:
    
        if (r6 <= 0) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0161, code lost:
    
        r4 = r4 + r6;
        r21.write(r2, 0, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x016a, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x00e5, code lost:
    
        if (r20.A04 != false) goto L60;
     */
    @Override // X.C16L
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int A1F(X.C912044w r20, java.io.OutputStream r21) {
        /*
            Method dump skipped, instructions count: 379
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23591Cy.A1F(X.44w, java.io.OutputStream):int");
    }

    @Override // X.C16L
    public final int A1G(OutputStream outputStream) {
        int i = super.A03;
        int i2 = super.A04;
        int i3 = i - i2;
        if (i3 < 1) {
            return 0;
        }
        super.A04 = i2 + i3;
        outputStream.write(this.A04, i2, i3);
        return i3;
    }

    @Override // X.C16L
    public final TID A1H() {
        int i = super.A04;
        return new TID(A1m(), super.A01, (i - super.A02) + 1, this.A0F + i, -1L);
    }

    @Override // X.C16L
    public final TID A1I() {
        C16D A1m;
        long j;
        long j2;
        int i;
        int i2;
        if (((C16K) this).A00 == C16R.A0A) {
            j = this.A0F + (this.A01 - 1);
            A1m = A1m();
            j2 = -1;
            i = this.A02;
            i2 = this.A00;
        } else {
            A1m = A1m();
            j = this.A0G - 1;
            j2 = -1;
            i = super.A09;
            i2 = super.A08;
        }
        return new TID(A1m, i, i2, j, j2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0060, code lost:
    
        if (r3 == 125) goto L29;
     */
    @Override // X.C16L
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C16R A1J() {
        /*
            Method dump skipped, instructions count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23591Cy.A1J():X.16R");
    }

    @Override // X.C16L
    public final C44T A1K() {
        return this.A06;
    }

    @Override // X.C16L
    public final C16N A1L() {
        return C16J.A0P;
    }

    @Override // X.C16L
    public final Object A1M() {
        return this.A07;
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
                    return A24();
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
                return A24();
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
                return A24();
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
        this.A06 = c44t;
    }

    /* JADX WARN: Code restructure failed: missing block: B:79:0x00e3, code lost:
    
        if (r14.A04 == false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00e5, code lost:
    
        r13.A04 = r7 - 1;
        A1x(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:?, code lost:
    
        throw X.C00O.createAndThrow();
     */
    @Override // X.C16L
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final byte[] A1S(X.C912044w r14) {
        /*
            Method dump skipped, instructions count: 388
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23591Cy.A1S(X.44w):byte[]");
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
                    A27();
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
        if (super.A04 < super.A03 || A2J()) {
            byte[] bArr = this.A04;
            int i = super.A04;
            int i2 = i + 1;
            super.A04 = i2;
            int i3 = bArr[i];
            if (i3 != 34 && i3 != 47 && i3 != 92) {
                if (i3 != 98) {
                    if (i3 != 102) {
                        if (i3 != 110) {
                            if (i3 != 114) {
                                if (i3 != 116) {
                                    if (i3 != 117) {
                                        char A1y = (char) A1y(i3);
                                        A1s(A1y);
                                        return A1y;
                                    }
                                    int i4 = 0;
                                    i3 = 0;
                                    do {
                                        if (i2 < super.A03 || A2J()) {
                                            byte[] bArr2 = this.A04;
                                            int i5 = super.A04;
                                            i2 = i5 + 1;
                                            super.A04 = i2;
                                            int i6 = bArr2[i5] & 255;
                                            int i7 = AnonymousClass167.A01[i6];
                                            if (i7 < 0) {
                                                A1Z(i6, "expected a hex-digit for character escape sequence");
                                                throw C00O.createAndThrow();
                                            }
                                            i3 = (i3 << 4) | i7;
                                            i4++;
                                        }
                                    } while (i4 < 4);
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
            return (char) i3;
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
            java.io.InputStream r2 = r3.A07
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
            r3.A07 = r0
        L19:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23591Cy.A1r():void");
    }

    public final int A1y(int i) {
        int i2;
        char c;
        int i3 = i & 255;
        if (i3 > 127) {
            if ((i3 & 224) == 192) {
                i2 = i3 & 31;
                c = 1;
            } else if ((i3 & 240) == 224) {
                i2 = i3 & 15;
                c = 2;
            } else if ((i3 & 248) == 240) {
                i2 = i3 & 7;
                c = 3;
            } else {
                A2E(i3 & 255);
                throw C00O.createAndThrow();
            }
            if (super.A04 >= super.A03) {
                A28();
            }
            byte[] bArr = this.A04;
            int i4 = super.A04;
            int i5 = i4 + 1;
            super.A04 = i5;
            int i6 = bArr[i4] & 255;
            if ((i6 & 192) == 128) {
                int i7 = (i2 << 6) | (i6 & 63);
                if (c > 1) {
                    if (i5 >= super.A03) {
                        A28();
                    }
                    byte[] bArr2 = this.A04;
                    int i8 = super.A04;
                    int i9 = i8 + 1;
                    super.A04 = i9;
                    i6 = bArr2[i8] & 255;
                    if ((i6 & 192) == 128) {
                        int i10 = (i7 << 6) | (i6 & 63);
                        if (c > 2) {
                            if (i9 >= super.A03) {
                                A28();
                            }
                            byte[] bArr3 = this.A04;
                            int i11 = super.A04;
                            super.A04 = i11 + 1;
                            i6 = bArr3[i11] & 255;
                            if ((i6 & 192) == 128) {
                                return (i10 << 6) | (i6 & 63);
                            }
                        } else {
                            return i10;
                        }
                    }
                } else {
                    return i7;
                }
            }
            A2F(i6 & 255);
            throw C00O.createAndThrow();
        }
        return i3;
    }

    public final C16R A1z() {
        if ((((C16L) this).A00 & EnumC223479te.A03.A00.A00) != 0) {
            return A0B(this.A0N.A0C(), 0, 46, 0, false);
        }
        A21(46);
        throw C00O.createAndThrow();
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x001b, code lost:
    
        if (r15 != 44) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0052, code lost:
    
        if (((X.C16Q) r14.A0B).A01 == 0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0059, code lost:
    
        if ((((X.C16L) r14).A00 & X.C23591Cy.A0G) == 0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005b, code lost:
    
        r14.A04--;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0062, code lost:
    
        return X.C16R.A0G;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x004c, code lost:
    
        if (((X.C16Q) r14.A0B).A01 == 1) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C16R A21(int r15) {
        /*
            Method dump skipped, instructions count: 360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23591Cy.A21(int):X.16R");
    }

    public final C16R A23(int i, boolean z) {
        String str;
        double d;
        if (i == 73) {
            if (super.A04 >= super.A03 && !A2J()) {
                A1d(" in a Number value");
            } else {
                byte[] bArr = this.A04;
                int i2 = super.A04;
                super.A04 = i2 + 1;
                i = bArr[i2];
                if (i == 78) {
                    if (z) {
                        str = "-INF";
                    } else {
                        str = "+INF";
                    }
                } else if (i == 110) {
                    if (z) {
                        str = "-Infinity";
                    } else {
                        str = "+Infinity";
                    }
                }
                A2H(str, 3);
                if ((((C16L) this).A00 & A0I) != 0) {
                    if (z) {
                        d = Double.NEGATIVE_INFINITY;
                    } else {
                        d = Double.POSITIVE_INFINITY;
                    }
                    return A1l(str, d);
                }
                A1g("Non-standard token '%s': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow", str);
            }
            throw C00O.createAndThrow();
        }
        A1a(i, "expected digit (0-9) to follow minus sign, for valid numeric value");
        throw C00O.createAndThrow();
    }

    public final String A24() {
        String str;
        int i = super.A04;
        if (i >= super.A03) {
            A28();
            i = super.A04;
        }
        int i2 = 0;
        C16O c16o = this.A0N;
        char[] A0C2 = c16o.A0C();
        int[] iArr = A0E;
        int min = Math.min(super.A03, A0C2.length + i);
        byte[] bArr = this.A04;
        while (true) {
            if (i >= min) {
                break;
            }
            int i3 = bArr[i] & 255;
            if (iArr[i3] != 0) {
                if (i3 == 34) {
                    super.A04 = i + 1;
                    c16o.A00 = i2;
                    if (c16o.A03 <= 0) {
                        if (i2 == 0) {
                            str = "";
                        } else {
                            str = new String(c16o.A07, 0, i2);
                        }
                        c16o.A04 = str;
                        return str;
                    }
                }
            } else {
                i++;
                A0C2[i2] = (char) i3;
                i2++;
            }
        }
        super.A04 = i;
        A0S(A0C2, i2);
        return c16o.A06();
    }

    /* JADX WARN: Removed duplicated region for block: B:138:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:140:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String A25(int r22) {
        /*
            Method dump skipped, instructions count: 1084
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23591Cy.A25(int):java.lang.String");
    }

    public final String A26(int[] iArr, int i, int i2, int i3, int i4) {
        int i5;
        int[] iArr2 = A0D;
        while (true) {
            if (iArr2[i3] != 0) {
                if (i3 == 34) {
                    if (i4 > 0) {
                        int length = iArr.length;
                        if (i >= length) {
                            iArr = Arrays.copyOf(iArr, length + length);
                            this.A05 = iArr;
                        }
                        int i6 = i + 1;
                        if (i4 != 4) {
                            i2 |= (-1) << (i4 << 3);
                        }
                        iArr[i] = i2;
                        i = i6;
                    }
                    String A07 = this.A09.A07(iArr, i);
                    if (A07 == null) {
                        return A0D(iArr, i, i4);
                    }
                    return A07;
                }
                if (i3 != 92) {
                    A1w(i3, PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
                } else {
                    i3 = A1h();
                }
                if (i3 > 127) {
                    int i7 = 0;
                    if (i4 >= 4) {
                        if (i >= iArr.length) {
                            int length2 = iArr.length;
                            iArr = Arrays.copyOf(iArr, length2 + length2);
                            this.A05 = iArr;
                        }
                        iArr[i] = i2;
                        i++;
                        i2 = 0;
                        i4 = 0;
                    }
                    int i8 = i2 << 8;
                    if (i3 < 2048) {
                        i5 = (i3 >> 6) | 192;
                    } else {
                        int i9 = i8 | (i3 >> 12) | 224;
                        i4++;
                        if (i4 >= 4) {
                            int length3 = iArr.length;
                            if (i >= length3) {
                                iArr = Arrays.copyOf(iArr, length3 + length3);
                                this.A05 = iArr;
                            }
                            iArr[i] = i9;
                            i++;
                            i4 = 0;
                        } else {
                            i7 = i9;
                        }
                        i8 = i7 << 8;
                        i5 = ((i3 >> 6) & 63) | 128;
                    }
                    i2 = i8 | i5;
                    i4++;
                    i3 = (i3 & 63) | 128;
                }
            }
            if (i4 < 4) {
                i4++;
                i2 = (i2 << 8) | i3;
            } else {
                int length4 = iArr.length;
                if (i >= length4) {
                    iArr = Arrays.copyOf(iArr, length4 + length4);
                    this.A05 = iArr;
                }
                iArr[i] = i2;
                i2 = i3;
                i++;
                i4 = 1;
            }
            if (super.A04 >= super.A03 && !A2J()) {
                A1d(" in field name");
                throw C00O.createAndThrow();
            }
            byte[] bArr = this.A04;
            int i10 = super.A04;
            super.A04 = i10 + 1;
            i3 = bArr[i10] & 255;
        }
    }

    public final void A27() {
        int i = super.A04;
        if (i >= super.A03) {
            A28();
            i = super.A04;
        }
        int i2 = 0;
        C16O c16o = this.A0N;
        char[] A0C2 = c16o.A0C();
        int[] iArr = A0E;
        int min = Math.min(super.A03, A0C2.length + i);
        byte[] bArr = this.A04;
        while (true) {
            if (i >= min) {
                break;
            }
            int i3 = bArr[i] & 255;
            if (iArr[i3] != 0) {
                if (i3 == 34) {
                    super.A04 = i + 1;
                    c16o.A00 = i2;
                    return;
                }
            } else {
                i++;
                A0C2[i2] = (char) i3;
                i2++;
            }
        }
        super.A04 = i;
        A0S(A0C2, i2);
    }

    public final void A29() {
        int i;
        int i2 = super.A04;
        if (i2 + 4 < super.A03) {
            byte[] bArr = this.A04;
            int i3 = i2 + 1;
            if (bArr[i2] == 97) {
                int i4 = i3 + 1;
                if (bArr[i3] == 108) {
                    int i5 = i4 + 1;
                    if (bArr[i4] == 115) {
                        int i6 = i5 + 1;
                        if (bArr[i5] == 101 && ((i = bArr[i6] & 255) < 48 || i == 93 || i == 125)) {
                            super.A04 = i6;
                            return;
                        }
                    }
                }
            }
        }
        A0R("false", 1);
    }

    public final void A2A() {
        int i;
        int i2 = super.A04;
        if (i2 + 3 < super.A03) {
            byte[] bArr = this.A04;
            int i3 = i2 + 1;
            if (bArr[i2] == 117) {
                int i4 = i3 + 1;
                if (bArr[i3] == 108) {
                    int i5 = i4 + 1;
                    if (bArr[i4] == 108 && ((i = bArr[i5] & 255) < 48 || i == 93 || i == 125)) {
                        super.A04 = i5;
                        return;
                    }
                }
            }
        }
        A0R("null", 1);
    }

    public final void A2B() {
        int i;
        int i2 = super.A04;
        if (i2 + 3 < super.A03) {
            byte[] bArr = this.A04;
            int i3 = i2 + 1;
            if (bArr[i2] == 114) {
                int i4 = i3 + 1;
                if (bArr[i3] == 117) {
                    int i5 = i4 + 1;
                    if (bArr[i4] == 101 && ((i = bArr[i5] & 255) < 48 || i == 93 || i == 125)) {
                        super.A04 = i5;
                        return;
                    }
                }
            }
        }
        A0R("true", 1);
    }

    public final void A2C() {
        if (super.A04 < super.A03 || A2J()) {
            byte[] bArr = this.A04;
            int i = super.A04;
            if (bArr[i] == 10) {
                super.A04 = i + 1;
            }
        }
        super.A01++;
        super.A02 = super.A04;
    }

    public final void A2E(int i) {
        A1c(AnonymousClass001.A0R("Invalid UTF-8 start byte 0x", Integer.toHexString(i)));
        throw C00O.createAndThrow();
    }

    public final void A2F(int i) {
        A1c(AnonymousClass001.A0R("Invalid UTF-8 middle byte 0x", Integer.toHexString(i)));
        throw C00O.createAndThrow();
    }

    public final void A2G(int i, int i2) {
        super.A04 = i2;
        A2F(i);
        throw C00O.createAndThrow();
    }

    public final void A2I(String str, String str2) {
        StringBuilder sb = new StringBuilder(str);
        while (true) {
            if (super.A04 >= super.A03 && !A2J()) {
                break;
            }
            byte[] bArr = this.A04;
            int i = super.A04;
            super.A04 = i + 1;
            char A1y = (char) A1y(bArr[i]);
            if (!Character.isJavaIdentifierPart(A1y)) {
                break;
            }
            sb.append(A1y);
            if (sb.length() >= 256) {
                sb.append("...");
                break;
            }
        }
        throw new C90173zy(this, String.format("Unrecognized token '%s': was expecting %s", sb, str2));
    }

    public final boolean A2J() {
        byte[] bArr;
        int length;
        InputStream inputStream = this.A07;
        if (inputStream != null && (length = (bArr = this.A04).length) != 0) {
            int read = inputStream.read(bArr, 0, length);
            if (read > 0) {
                int i = super.A03;
                this.A0F += i;
                super.A02 -= i;
                this.A01 -= i;
                super.A04 = 0;
                super.A03 = read;
                return true;
            }
            A1r();
            if (read == 0) {
                throw new IOException(AnonymousClass001.A0c("InputStream.read() returned 0 characters when trying to read ", " bytes", this.A04.length));
            }
        }
        return false;
    }

    public C23591Cy(C44T c44t, C16H c16h, C16B c16b, InputStream inputStream, byte[] bArr, int i, int i2, int i3, int i4, boolean z) {
        super(c16h, i);
        this.A05 = new int[16];
        this.A07 = inputStream;
        this.A06 = c44t;
        this.A09 = c16b;
        this.A04 = bArr;
        super.A04 = i2;
        super.A03 = i3;
        super.A02 = i2 - i4;
        this.A0F = (-i2) + i4;
        this.A08 = z;
    }

    private final void A0F() {
        A0P();
        C16P c16p = this.A0B;
        if (((C16Q) c16p).A01 == 1) {
            c16p.A03 = null;
            this.A0B = c16p.A06;
        } else {
            A1u(93, '}');
            throw C00O.createAndThrow();
        }
    }

    private final void A0J() {
        A0P();
        C16P c16p = this.A0B;
        if (((C16Q) c16p).A01 == 2) {
            c16p.A03 = null;
            this.A0B = c16p.A06;
        } else {
            A1u(125, ']');
            throw C00O.createAndThrow();
        }
    }

    private final void A0R(String str, int i) {
        int i2;
        int length = str.length();
        while (true) {
            if ((super.A04 >= super.A03 && !A2J()) || this.A04[super.A04] != str.charAt(i)) {
                break;
            }
            int i3 = super.A04 + 1;
            super.A04 = i3;
            i++;
            if (i >= length) {
                if ((i3 >= super.A03 && !A2J()) || (i2 = this.A04[super.A04] & 255) < 48 || i2 == 93 || i2 == 125 || !Character.isJavaIdentifierPart((char) A1y(i2))) {
                    return;
                }
            }
        }
        A2I(str.substring(0, i), A1o());
        throw C00O.createAndThrow();
    }

    @Override // X.C16J
    public final void A1p() {
        byte[] bArr;
        byte[] bArr2;
        super.A1p();
        C16B c16b = this.A09;
        C16B c16b2 = c16b.A0B;
        if (c16b2 != null && (!c16b.A07)) {
            C16C c16c = new C16C(c16b);
            int i = c16c.A00;
            AtomicReference atomicReference = c16b2.A0C;
            C16C c16c2 = (C16C) atomicReference.get();
            if (i != c16c2.A00) {
                if (i > 6000) {
                    c16c = new C16C(new int[512], new String[128]);
                }
                C1EM.A00(c16c2, c16c, atomicReference);
            }
            c16b.A07 = true;
        }
        if (this.A08 && (bArr = this.A04) != null && bArr != (bArr2 = C16K.A09)) {
            this.A04 = bArr2;
            this.A0O.A02(bArr);
        }
    }

    public final void A28() {
        if (!A2J()) {
            A1W();
            throw C00O.createAndThrow();
        }
    }

    public final void A2H(String str, int i) {
        int length = str.length();
        int i2 = super.A04;
        if (i2 + length >= super.A03) {
            A0R(str, i);
            return;
        }
        while (true) {
            if (this.A04[i2] != str.charAt(i)) {
                break;
            }
            i2 = super.A04 + 1;
            super.A04 = i2;
            i++;
            if (i >= length) {
                int i3 = this.A04[i2] & 255;
                if (i3 < 48 || i3 == 93 || i3 == 125 || !Character.isJavaIdentifierPart((char) A1y(i3))) {
                    return;
                }
            }
        }
        A2I(str.substring(0, i), A1o());
        throw C00O.createAndThrow();
    }
}
