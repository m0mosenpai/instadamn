package X;

import com.facebook.common.dextricks.Constants;
import com.facebook.common.dextricks.StringTreeSet;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Serializable;
import java.io.StringReader;
import java.io.Writer;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Map;

/* renamed from: X.15v, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C222015v extends AbstractC222115w implements Serializable {
    public static final AnonymousClass165 A08;
    public static final int A09;
    public static final int A0A;
    public static final int A0B;
    public int A00;
    public int A01;
    public int A02;
    public C44T A03;
    public AnonymousClass165 A04;
    public final char A05;
    public final transient C16B A06;
    public final transient AnonymousClass168 A07;

    public C16L A00(File file) {
        return A05(new C16H(new C16D(true, file), A0B(), true), new FileInputStream(file));
    }

    public C16L A01(InputStream inputStream) {
        return A05(new C16H(new C16D(true, inputStream), A0B(), false), inputStream);
    }

    public C16L A02(Reader reader) {
        C16H c16h = new C16H(new C16D(true, reader), A0B(), false);
        int i = C16I.A0E;
        return new C16I(this.A03, c16h, this.A07.A00(this.A00), reader, this.A02);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00dd, code lost:
    
        if ((r4 & (-65281)) == 0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b7, code lost:
    
        if ((r0 & 255) == 0) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public X.C16L A04(byte[] r26) {
        /*
            Method dump skipped, instructions count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C222015v.A04(byte[]):X.16L");
    }

    public final C17z A0A(Writer writer) {
        return A09(new C16H(new C16D(true, writer), A0B(), false), writer);
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ef, code lost:
    
        if ((r11 & (-65281)) == 0) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00c9, code lost:
    
        if ((r1 & 255) == 0) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C16J A05(X.C16H r22, java.io.InputStream r23) {
        /*
            Method dump skipped, instructions count: 310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C222015v.A05(X.16H, java.io.InputStream):X.16J");
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.5cS, X.180] */
    public final C120295cS A06(final C16H c16h, final OutputStream outputStream) {
        final int i = this.A01;
        final C44T c44t = this.A03;
        final char c = this.A05;
        ?? r2 = new AnonymousClass180(c44t, c16h, outputStream, c, i) { // from class: X.5cS
            public byte A00;
            public int A01;
            public byte[] A02;
            public char[] A03;
            public final int A04;
            public final int A05;
            public final int A06;
            public final OutputStream A07;
            public static final byte[] A09 = AnonymousClass167.A00();
            public static final byte[] A0A = {110, 117, 108, 108};
            public static final byte[] A0B = {116, 114, 117, 101};
            public static final byte[] A08 = {102, 97, 108, 115, 101};

            public static final int A02(InputStream inputStream, byte[] bArr, int i2, int i3, int i4) {
                int read;
                int i5 = 0;
                while (i2 < i3) {
                    bArr[i5] = bArr[i2];
                    i5++;
                    i2++;
                }
                int min = Math.min(i4, bArr.length);
                do {
                    int i6 = min - i5;
                    if (i6 == 0 || (read = inputStream.read(bArr, i5, i6)) < 0) {
                        break;
                    }
                    i5 += read;
                } while (i5 < 3);
                return i5;
            }

            private final void A06(String str, int i2, int i3) {
                int i4;
                int i5;
                int i6;
                int i7 = i3 + i2;
                int i8 = this.A01;
                byte[] bArr = this.A02;
                int[] iArr = ((AnonymousClass180) this).A03;
                while (i2 < i7) {
                    char charAt = str.charAt(i2);
                    if (charAt > 127 || iArr[charAt] != 0) {
                        break;
                    }
                    bArr[i8] = (byte) charAt;
                    i2++;
                    i8++;
                }
                this.A01 = i8;
                if (i2 < i7) {
                    int i9 = ((AnonymousClass180) this).A00;
                    int i10 = i8 + ((i7 - i2) * 6);
                    int i11 = this.A05;
                    if (i9 == 0) {
                        if (i10 > i11) {
                            A16();
                        }
                        i4 = this.A01;
                        byte[] bArr2 = this.A02;
                        int[] iArr2 = ((AnonymousClass180) this).A03;
                        while (i2 < i7) {
                            int i12 = i2 + 1;
                            char charAt2 = str.charAt(i2);
                            if (charAt2 <= 127) {
                                i6 = iArr2[charAt2];
                                if (i6 == 0) {
                                    bArr2[i4] = (byte) charAt2;
                                    i2 = i12;
                                    i4++;
                                } else if (i6 > 0) {
                                    i5 = i4 + 1;
                                    bArr2[i4] = 92;
                                    i4 = i5 + 1;
                                    bArr2[i5] = (byte) i6;
                                    i2 = i12;
                                } else {
                                    i4 = A00(charAt2, i4);
                                    i2 = i12;
                                }
                            } else if (charAt2 <= 2047) {
                                i5 = i4 + 1;
                                bArr2[i4] = (byte) ((charAt2 >> 6) | 192);
                                i4 = i5 + 1;
                                i6 = (charAt2 & '?') | 128;
                                bArr2[i5] = (byte) i6;
                                i2 = i12;
                            } else {
                                i4 = A01(charAt2, i4);
                                i2 = i12;
                            }
                        }
                    } else {
                        if (i10 > i11) {
                            A16();
                        }
                        i4 = this.A01;
                        byte[] bArr3 = this.A02;
                        int[] iArr3 = ((AnonymousClass180) this).A03;
                        while (i2 < i7) {
                            int i13 = i2 + 1;
                            char charAt3 = str.charAt(i2);
                            if (charAt3 <= 127) {
                                int i14 = iArr3[charAt3];
                                if (i14 == 0) {
                                    bArr3[i4] = (byte) charAt3;
                                    i2 = i13;
                                    i4++;
                                } else if (i14 > 0) {
                                    int i15 = i4 + 1;
                                    bArr3[i4] = 92;
                                    i4 = i15 + 1;
                                    bArr3[i15] = (byte) i14;
                                    i2 = i13;
                                }
                            }
                            i4 = A00(charAt3, i4);
                            i2 = i13;
                        }
                    }
                    this.A01 = i4;
                }
            }

            private final void A09(byte[] bArr) {
                int length = bArr.length;
                if (this.A01 + length > this.A05) {
                    A16();
                    if (length > 512) {
                        this.A07.write(bArr, 0, length);
                        return;
                    }
                }
                System.arraycopy(bArr, 0, this.A02, this.A01, length);
                this.A01 += length;
            }

            private final void A0A(char[] cArr, int i2, int i3) {
                int i4;
                int i5;
                int i6;
                int i7 = i3 + i2;
                int i8 = this.A01;
                byte[] bArr = this.A02;
                int[] iArr = ((AnonymousClass180) this).A03;
                while (i2 < i7) {
                    char c2 = cArr[i2];
                    if (c2 > 127 || iArr[c2] != 0) {
                        break;
                    }
                    bArr[i8] = (byte) c2;
                    i2++;
                    i8++;
                }
                this.A01 = i8;
                if (i2 < i7) {
                    int i9 = ((AnonymousClass180) this).A00;
                    int i10 = i8 + ((i7 - i2) * 6);
                    int i11 = this.A05;
                    if (i9 == 0) {
                        if (i10 > i11) {
                            A16();
                        }
                        i4 = this.A01;
                        byte[] bArr2 = this.A02;
                        int[] iArr2 = ((AnonymousClass180) this).A03;
                        while (i2 < i7) {
                            int i12 = i2 + 1;
                            char c3 = cArr[i2];
                            if (c3 <= 127) {
                                i6 = iArr2[c3];
                                if (i6 == 0) {
                                    bArr2[i4] = (byte) c3;
                                    i2 = i12;
                                    i4++;
                                } else if (i6 > 0) {
                                    i5 = i4 + 1;
                                    bArr2[i4] = 92;
                                    i4 = i5 + 1;
                                    bArr2[i5] = (byte) i6;
                                    i2 = i12;
                                } else {
                                    i4 = A00(c3, i4);
                                    i2 = i12;
                                }
                            } else if (c3 <= 2047) {
                                i5 = i4 + 1;
                                bArr2[i4] = (byte) ((c3 >> 6) | 192);
                                i4 = i5 + 1;
                                i6 = (c3 & '?') | 128;
                                bArr2[i5] = (byte) i6;
                                i2 = i12;
                            } else {
                                i4 = A01(c3, i4);
                                i2 = i12;
                            }
                        }
                    } else {
                        if (i10 > i11) {
                            A16();
                        }
                        i4 = this.A01;
                        byte[] bArr3 = this.A02;
                        int[] iArr3 = ((AnonymousClass180) this).A03;
                        while (i2 < i7) {
                            int i13 = i2 + 1;
                            char c4 = cArr[i2];
                            if (c4 <= 127) {
                                int i14 = iArr3[c4];
                                if (i14 == 0) {
                                    bArr3[i4] = (byte) c4;
                                    i2 = i13;
                                    i4++;
                                } else if (i14 > 0) {
                                    int i15 = i4 + 1;
                                    bArr3[i4] = 92;
                                    i4 = i15 + 1;
                                    bArr3[i15] = (byte) i14;
                                    i2 = i13;
                                }
                            }
                            i4 = A00(c4, i4);
                            i2 = i13;
                        }
                    }
                    this.A01 = i4;
                }
            }

            @Override // X.AnonymousClass182
            public final void A0z(char[] cArr, int i2, int i3) {
                int i4 = 0;
                int i5 = i3 + i3 + i3;
                int i6 = this.A01 + i5;
                int i7 = this.A05;
                if (i6 > i7) {
                    if (i7 < i5) {
                        int i8 = 0;
                        byte[] bArr = this.A02;
                        while (i8 < i3) {
                            do {
                                char c2 = cArr[i8];
                                int i9 = this.A01;
                                if (c2 >= 128) {
                                    if (i9 + 3 >= i7) {
                                        A16();
                                    }
                                    int i10 = i8 + 1;
                                    char c3 = cArr[i8];
                                    if (c3 < 2048) {
                                        int i11 = this.A01;
                                        int i12 = i11 + 1;
                                        bArr[i11] = (byte) ((c3 >> 6) | 192);
                                        this.A01 = i12 + 1;
                                        bArr[i12] = (byte) ((c3 & '?') | 128);
                                        i8 = i10;
                                    } else {
                                        i8 = A03(cArr, c3, i10, i3);
                                    }
                                } else {
                                    if (i9 >= i7) {
                                        A16();
                                    }
                                    int i13 = this.A01;
                                    this.A01 = i13 + 1;
                                    bArr[i13] = (byte) c2;
                                    i8++;
                                }
                            } while (i8 < i3);
                            return;
                        }
                        return;
                    }
                    A16();
                }
                while (i4 < i3) {
                    do {
                        char c4 = cArr[i4];
                        if (c4 > 127) {
                            i4++;
                            if (c4 < 2048) {
                                byte[] bArr2 = this.A02;
                                int i14 = this.A01;
                                int i15 = i14 + 1;
                                bArr2[i14] = (byte) ((c4 >> 6) | 192);
                                this.A01 = i15 + 1;
                                bArr2[i15] = (byte) ((c4 & '?') | 128);
                            } else {
                                i4 = A03(cArr, c4, i4, i3);
                            }
                        } else {
                            byte[] bArr3 = this.A02;
                            int i16 = this.A01;
                            this.A01 = i16 + 1;
                            bArr3[i16] = (byte) c4;
                            i4++;
                        }
                    } while (i4 < i3);
                    return;
                }
            }

            private int A00(int i2, int i3) {
                int i4;
                byte[] bArr = this.A02;
                int i5 = i3 + 1;
                bArr[i3] = 92;
                int i6 = i5 + 1;
                bArr[i5] = 117;
                if (i2 > 255) {
                    int i7 = 255 & (i2 >> 8);
                    int i8 = i6 + 1;
                    byte[] bArr2 = A09;
                    bArr[i6] = bArr2[i7 >> 4];
                    i4 = i8 + 1;
                    bArr[i8] = bArr2[i7 & 15];
                    i2 &= 255;
                } else {
                    int i9 = i6 + 1;
                    bArr[i6] = 48;
                    i4 = i9 + 1;
                    bArr[i9] = 48;
                }
                int i10 = i4 + 1;
                byte[] bArr3 = A09;
                bArr[i4] = bArr3[i2 >> 4];
                int i11 = i10 + 1;
                bArr[i10] = bArr3[i2 & 15];
                return i11;
            }

            private final int A01(int i2, int i3) {
                int i4;
                int i5;
                byte b;
                byte[] bArr = this.A02;
                if (i2 >= 55296 && i2 <= 57343) {
                    int i6 = i3 + 1;
                    bArr[i3] = 92;
                    int i7 = i6 + 1;
                    bArr[i6] = 117;
                    int i8 = i7 + 1;
                    byte[] bArr2 = A09;
                    bArr[i7] = bArr2[(i2 >> 12) & 15];
                    int i9 = i8 + 1;
                    bArr[i8] = bArr2[(i2 >> 8) & 15];
                    i4 = i9 + 1;
                    bArr[i9] = bArr2[(i2 >> 4) & 15];
                    i5 = i4 + 1;
                    b = bArr2[i2 & 15];
                } else {
                    int i10 = i3 + 1;
                    bArr[i3] = (byte) ((i2 >> 12) | 224);
                    i4 = i10 + 1;
                    bArr[i10] = (byte) (((i2 >> 6) & 63) | 128);
                    i5 = i4 + 1;
                    b = (byte) ((i2 & 63) | 128);
                }
                bArr[i4] = b;
                return i5;
            }

            private final void A04() {
                if (this.A01 + 4 >= this.A05) {
                    A16();
                }
                System.arraycopy(A0A, 0, this.A02, this.A01, 4);
                this.A01 += 4;
            }

            private final void A05(String str) {
                int i2 = this.A01;
                int i3 = this.A05;
                if (i2 >= i3) {
                    A16();
                }
                byte[] bArr = this.A02;
                int i4 = this.A01;
                this.A01 = i4 + 1;
                byte b = this.A00;
                bArr[i4] = b;
                A0t(str);
                if (this.A01 >= i3) {
                    A16();
                }
                byte[] bArr2 = this.A02;
                int i5 = this.A01;
                this.A01 = i5 + 1;
                bArr2[i5] = b;
            }

            private final void A07(String str, boolean z) {
                if (z) {
                    if (this.A01 >= this.A05) {
                        A16();
                    }
                    byte[] bArr = this.A02;
                    int i2 = this.A01;
                    this.A01 = i2 + 1;
                    bArr[i2] = this.A00;
                }
                int length = str.length();
                int i3 = 0;
                while (length > 0) {
                    int min = Math.min(this.A06, length);
                    if (this.A01 + min > this.A05) {
                        A16();
                    }
                    A06(str, i3, min);
                    i3 += min;
                    length -= min;
                }
                if (z) {
                    if (this.A01 >= this.A05) {
                        A16();
                    }
                    byte[] bArr2 = this.A02;
                    int i4 = this.A01;
                    this.A01 = i4 + 1;
                    bArr2[i4] = this.A00;
                }
            }

            /* JADX WARN: Code restructure failed: missing block: B:57:0x0135, code lost:
            
                if (r8 > 0) goto L54;
             */
            /* JADX WARN: Code restructure failed: missing block: B:72:0x0108, code lost:
            
                if (r8 > 0) goto L42;
             */
            @Override // X.AnonymousClass182
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final int A0Y(X.C912044w r22, java.io.InputStream r23, int r24) {
                /*
                    Method dump skipped, instructions count: 355
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C120295cS.A0Y(X.44w, java.io.InputStream, int):int");
            }

            @Override // X.AnonymousClass182
            public final void A0Z() {
                AnonymousClass184 anonymousClass184 = ((AnonymousClass181) this).A02;
                if (((C16Q) anonymousClass184).A01 == 1) {
                    AnonymousClass162 anonymousClass162 = ((AnonymousClass182) this).A00;
                    if (anonymousClass162 != null) {
                        anonymousClass162.FES(this, ((C16Q) anonymousClass184).A00 + 1);
                    } else {
                        if (this.A01 >= this.A05) {
                            A16();
                        }
                        byte[] bArr = this.A02;
                        int i2 = this.A01;
                        this.A01 = i2 + 1;
                        bArr[i2] = 93;
                    }
                    AnonymousClass184 anonymousClass1842 = ((AnonymousClass181) this).A02;
                    anonymousClass1842.A01 = null;
                    ((AnonymousClass181) this).A02 = anonymousClass1842.A05;
                    return;
                }
                A0L(AnonymousClass001.A0R("Current context not Array but ", anonymousClass184.A02()));
                throw C00O.createAndThrow();
            }

            @Override // X.AnonymousClass182
            public final void A0a() {
                AnonymousClass184 anonymousClass184 = ((AnonymousClass181) this).A02;
                if (((C16Q) anonymousClass184).A01 == 2) {
                    AnonymousClass162 anonymousClass162 = ((AnonymousClass182) this).A00;
                    if (anonymousClass162 != null) {
                        anonymousClass162.FET(this, ((C16Q) anonymousClass184).A00 + 1);
                    } else {
                        if (this.A01 >= this.A05) {
                            A16();
                        }
                        byte[] bArr = this.A02;
                        int i2 = this.A01;
                        this.A01 = i2 + 1;
                        bArr[i2] = 125;
                    }
                    AnonymousClass184 anonymousClass1842 = ((AnonymousClass181) this).A02;
                    anonymousClass1842.A01 = null;
                    ((AnonymousClass181) this).A02 = anonymousClass1842.A05;
                    return;
                }
                A0L(AnonymousClass001.A0R("Current context not Object but ", anonymousClass184.A02()));
                throw C00O.createAndThrow();
            }

            @Override // X.AnonymousClass182
            public final void A0b() {
                A13("write a null");
                A04();
            }

            @Override // X.AnonymousClass182
            public final void A0c() {
                A13("start an array");
                ((AnonymousClass181) this).A02 = ((AnonymousClass181) this).A02.A07();
                AnonymousClass162 anonymousClass162 = ((AnonymousClass182) this).A00;
                if (anonymousClass162 != null) {
                    anonymousClass162.FEk(this);
                    return;
                }
                if (this.A01 >= this.A05) {
                    A16();
                }
                byte[] bArr = this.A02;
                int i2 = this.A01;
                this.A01 = i2 + 1;
                bArr[i2] = 91;
            }

            @Override // X.AnonymousClass182
            public final void A0d() {
                A13("start an object");
                ((AnonymousClass181) this).A02 = ((AnonymousClass181) this).A02.A08();
                AnonymousClass162 anonymousClass162 = ((AnonymousClass182) this).A00;
                if (anonymousClass162 != null) {
                    anonymousClass162.FEl(this);
                    return;
                }
                if (this.A01 >= this.A05) {
                    A16();
                }
                byte[] bArr = this.A02;
                int i2 = this.A01;
                this.A01 = i2 + 1;
                bArr[i2] = 123;
            }

            @Override // X.AnonymousClass182
            public final void A0e(char c2) {
                if (this.A01 + 3 >= this.A05) {
                    A16();
                }
                byte[] bArr = this.A02;
                int i2 = this.A01;
                this.A01 = i2 + 1;
                bArr[i2] = (byte) c2;
            }

            /* JADX WARN: Code restructure failed: missing block: B:11:0x0019, code lost:
            
                if ((((X.AnonymousClass181) r2).A00 & X.AnonymousClass160.QUOTE_NON_NUMERIC_NUMBERS.A00) != 0) goto L10;
             */
            @Override // X.AnonymousClass182
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void A0f(double r3) {
                /*
                    r2 = this;
                    boolean r0 = r2.A03
                    if (r0 != 0) goto L1b
                    java.lang.String[] r0 = X.AnonymousClass188.A04
                    boolean r0 = java.lang.Double.isNaN(r3)
                    if (r0 != 0) goto L12
                    boolean r0 = java.lang.Double.isInfinite(r3)
                    if (r0 == 0) goto L23
                L12:
                    X.160 r0 = X.AnonymousClass160.QUOTE_NON_NUMERIC_NUMBERS
                    int r1 = r2.A00
                    int r0 = r0.A00
                    r1 = r1 & r0
                    if (r1 == 0) goto L23
                L1b:
                    java.lang.String r0 = java.lang.String.valueOf(r3)
                    r2.A0u(r0)
                    return
                L23:
                    java.lang.String r0 = "write a number"
                    r2.A13(r0)
                    java.lang.String r0 = java.lang.String.valueOf(r3)
                    r2.A0t(r0)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C120295cS.A0f(double):void");
            }

            /* JADX WARN: Code restructure failed: missing block: B:11:0x0019, code lost:
            
                if ((((X.AnonymousClass181) r2).A00 & X.AnonymousClass160.QUOTE_NON_NUMERIC_NUMBERS.A00) != 0) goto L10;
             */
            @Override // X.AnonymousClass182
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void A0g(float r3) {
                /*
                    r2 = this;
                    boolean r0 = r2.A03
                    if (r0 != 0) goto L1b
                    java.lang.String[] r0 = X.AnonymousClass188.A04
                    boolean r0 = java.lang.Float.isNaN(r3)
                    if (r0 != 0) goto L12
                    boolean r0 = java.lang.Float.isInfinite(r3)
                    if (r0 == 0) goto L23
                L12:
                    X.160 r0 = X.AnonymousClass160.QUOTE_NON_NUMERIC_NUMBERS
                    int r1 = r2.A00
                    int r0 = r0.A00
                    r1 = r1 & r0
                    if (r1 == 0) goto L23
                L1b:
                    java.lang.String r0 = java.lang.String.valueOf(r3)
                    r2.A0u(r0)
                    return
                L23:
                    java.lang.String r0 = "write a number"
                    r2.A13(r0)
                    java.lang.String r0 = java.lang.String.valueOf(r3)
                    r2.A0t(r0)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C120295cS.A0g(float):void");
            }

            @Override // X.AnonymousClass182
            public final void A0h(int i2) {
                A13("write a number");
                int i3 = this.A01 + 11;
                int i4 = this.A05;
                if (i3 >= i4) {
                    A16();
                }
                if (((AnonymousClass181) this).A03) {
                    if (this.A01 + 13 >= i4) {
                        A16();
                    }
                    byte[] bArr = this.A02;
                    int i5 = this.A01;
                    int i6 = i5 + 1;
                    this.A01 = i6;
                    byte b = this.A00;
                    bArr[i5] = b;
                    int A03 = AnonymousClass188.A03(bArr, i2, i6);
                    byte[] bArr2 = this.A02;
                    this.A01 = A03 + 1;
                    bArr2[A03] = b;
                    return;
                }
                this.A01 = AnonymousClass188.A03(this.A02, i2, this.A01);
            }

            @Override // X.AnonymousClass182
            public final void A0i(long j) {
                A13("write a number");
                if (((AnonymousClass181) this).A03) {
                    if (this.A01 + 23 >= this.A05) {
                        A16();
                    }
                    byte[] bArr = this.A02;
                    int i2 = this.A01;
                    int i3 = i2 + 1;
                    this.A01 = i3;
                    byte b = this.A00;
                    bArr[i2] = b;
                    int A06 = AnonymousClass188.A06(bArr, i3, j);
                    byte[] bArr2 = this.A02;
                    this.A01 = A06 + 1;
                    bArr2[A06] = b;
                    return;
                }
                if (this.A01 + 21 >= this.A05) {
                    A16();
                }
                this.A01 = AnonymousClass188.A06(this.A02, this.A01, j);
            }

            @Override // X.AnonymousClass182
            public final void A0j(C912044w c912044w, byte[] bArr, int i2, int i3) {
                A13("write a binary value");
                int i4 = this.A01;
                int i5 = this.A05;
                if (i4 >= i5) {
                    A16();
                }
                byte[] bArr2 = this.A02;
                int i6 = this.A01;
                int i7 = i6 + 1;
                this.A01 = i7;
                byte b = this.A00;
                bArr2[i6] = b;
                int i8 = i3 + i2;
                int i9 = i8 - 3;
                int i10 = i5 - 6;
                int i11 = c912044w.A01 >> 2;
                while (i2 <= i9) {
                    if (i7 > i10) {
                        A16();
                    }
                    int i12 = i2 + 1;
                    int i13 = i12 + 1;
                    int i14 = ((bArr[i2] << 8) | (bArr[i12] & 255)) << 8;
                    i2 = i13 + 1;
                    int i15 = i14 | (bArr[i13] & 255);
                    byte[] bArr3 = this.A02;
                    i7 = c912044w.A02(bArr3, i15, this.A01);
                    this.A01 = i7;
                    i11--;
                    if (i11 <= 0) {
                        int i16 = i7 + 1;
                        bArr3[i7] = 92;
                        i7 = i16 + 1;
                        this.A01 = i7;
                        bArr3[i16] = 110;
                        i11 = i11;
                    }
                }
                int i17 = i8 - i2;
                if (i17 > 0) {
                    if (i7 > i10) {
                        A16();
                    }
                    int i18 = i2 + 1;
                    int i19 = bArr[i2] << 16;
                    if (i17 == 2) {
                        i19 |= (bArr[i18] & 255) << 8;
                    }
                    i7 = c912044w.A03(this.A02, i19, i17, this.A01);
                    this.A01 = i7;
                }
                if (i7 >= i5) {
                    A16();
                }
                byte[] bArr4 = this.A02;
                int i20 = this.A01;
                this.A01 = i20 + 1;
                bArr4[i20] = b;
            }

            @Override // X.AnonymousClass181, X.AnonymousClass182
            public final void A0k(AnonymousClass165 anonymousClass165) {
                A13("write a raw (unencoded) value");
                byte[] bArr = this.A02;
                int i2 = this.A01;
                AnonymousClass164 anonymousClass164 = (AnonymousClass164) anonymousClass165;
                byte[] bArr2 = anonymousClass164.A01;
                if (bArr2 == null) {
                    bArr2 = AnonymousClass166.A01(anonymousClass164.A03);
                    anonymousClass164.A01 = bArr2;
                }
                int length = bArr2.length;
                if (i2 + length > bArr.length) {
                    A09(bArr2);
                } else {
                    System.arraycopy(bArr2, 0, bArr, i2, length);
                    this.A01 += length;
                }
            }

            @Override // X.AnonymousClass182
            public final void A0l(AnonymousClass165 anonymousClass165) {
                AnonymousClass162 anonymousClass162 = ((AnonymousClass182) this).A00;
                AnonymousClass184 anonymousClass184 = ((AnonymousClass181) this).A02;
                if (anonymousClass162 != null) {
                    AnonymousClass164 anonymousClass164 = (AnonymousClass164) anonymousClass165;
                    String str = anonymousClass164.A03;
                    int A06 = anonymousClass184.A06(str);
                    if (A06 != 4) {
                        AnonymousClass162 anonymousClass1622 = ((AnonymousClass182) this).A00;
                        if (A06 == 1) {
                            anonymousClass1622.FEc(this);
                        } else {
                            anonymousClass1622.ADJ(this);
                        }
                        boolean z = !((AnonymousClass180) this).A02;
                        if (z) {
                            if (this.A01 >= this.A05) {
                                A16();
                            }
                            byte[] bArr = this.A02;
                            int i2 = this.A01;
                            this.A01 = i2 + 1;
                            bArr[i2] = this.A00;
                        }
                        int ABl = anonymousClass165.ABl(this.A02, this.A01);
                        if (ABl < 0) {
                            byte[] bArr2 = anonymousClass164.A00;
                            if (bArr2 == null) {
                                bArr2 = AnonymousClass164.A04.A02(str);
                                anonymousClass164.A00 = bArr2;
                            }
                            A09(bArr2);
                        } else {
                            this.A01 += ABl;
                        }
                        if (z) {
                            if (this.A01 >= this.A05) {
                                A16();
                            }
                            byte[] bArr3 = this.A02;
                            int i3 = this.A01;
                            this.A01 = i3 + 1;
                            bArr3[i3] = this.A00;
                            return;
                        }
                        return;
                    }
                } else {
                    AnonymousClass164 anonymousClass1642 = (AnonymousClass164) anonymousClass165;
                    String str2 = anonymousClass1642.A03;
                    int A062 = anonymousClass184.A06(str2);
                    if (A062 != 4) {
                        if (A062 == 1) {
                            if (this.A01 >= this.A05) {
                                A16();
                            }
                            byte[] bArr4 = this.A02;
                            int i4 = this.A01;
                            this.A01 = i4 + 1;
                            bArr4[i4] = 44;
                        }
                        if (((AnonymousClass180) this).A02) {
                            int ABl2 = anonymousClass165.ABl(this.A02, this.A01);
                            if (ABl2 < 0) {
                                byte[] bArr5 = anonymousClass1642.A00;
                                if (bArr5 == null) {
                                    bArr5 = AnonymousClass164.A04.A02(str2);
                                    anonymousClass1642.A00 = bArr5;
                                }
                                A09(bArr5);
                                return;
                            }
                            this.A01 += ABl2;
                            return;
                        }
                        int i5 = this.A01;
                        int i6 = this.A05;
                        if (i5 >= i6) {
                            A16();
                        }
                        byte[] bArr6 = this.A02;
                        int i7 = this.A01;
                        int i8 = i7 + 1;
                        this.A01 = i8;
                        byte b = this.A00;
                        bArr6[i7] = b;
                        int ABl3 = anonymousClass165.ABl(bArr6, i8);
                        if (ABl3 < 0) {
                            byte[] bArr7 = anonymousClass1642.A00;
                            if (bArr7 == null) {
                                bArr7 = AnonymousClass164.A04.A02(str2);
                                anonymousClass1642.A00 = bArr7;
                            }
                            A09(bArr7);
                        } else {
                            this.A01 += ABl3;
                        }
                        if (this.A01 >= i6) {
                            A16();
                        }
                        byte[] bArr8 = this.A02;
                        int i9 = this.A01;
                        this.A01 = i9 + 1;
                        bArr8[i9] = b;
                        return;
                    }
                }
                A0L("Can not write a field name, expecting a value");
                throw C00O.createAndThrow();
            }

            @Override // X.AnonymousClass182
            public final void A0m(AnonymousClass165 anonymousClass165) {
                byte[] bArr = this.A02;
                int i2 = this.A01;
                AnonymousClass164 anonymousClass164 = (AnonymousClass164) anonymousClass165;
                byte[] bArr2 = anonymousClass164.A01;
                if (bArr2 == null) {
                    bArr2 = AnonymousClass166.A01(anonymousClass164.A03);
                    anonymousClass164.A01 = bArr2;
                }
                int length = bArr2.length;
                if (i2 + length > bArr.length) {
                    A09(bArr2);
                } else {
                    System.arraycopy(bArr2, 0, bArr, i2, length);
                    this.A01 += length;
                }
            }

            @Override // X.AnonymousClass182
            public final void A0n(AnonymousClass165 anonymousClass165) {
                A13("write a string");
                int i2 = this.A01;
                int i3 = this.A05;
                if (i2 >= i3) {
                    A16();
                }
                byte[] bArr = this.A02;
                int i4 = this.A01;
                int i5 = i4 + 1;
                this.A01 = i5;
                byte b = this.A00;
                bArr[i4] = b;
                int ABl = anonymousClass165.ABl(bArr, i5);
                if (ABl < 0) {
                    AnonymousClass164 anonymousClass164 = (AnonymousClass164) anonymousClass165;
                    byte[] bArr2 = anonymousClass164.A00;
                    if (bArr2 == null) {
                        bArr2 = AnonymousClass164.A04.A02(anonymousClass164.A03);
                        anonymousClass164.A00 = bArr2;
                    }
                    A09(bArr2);
                } else {
                    this.A01 += ABl;
                }
                if (this.A01 >= i3) {
                    A16();
                }
                byte[] bArr3 = this.A02;
                int i6 = this.A01;
                this.A01 = i6 + 1;
                bArr3[i6] = b;
            }

            @Override // X.AnonymousClass182
            public final void A0o(Object obj) {
                A13("start an array");
                ((AnonymousClass181) this).A02 = ((AnonymousClass181) this).A02.A09(obj);
                AnonymousClass162 anonymousClass162 = ((AnonymousClass182) this).A00;
                if (anonymousClass162 != null) {
                    anonymousClass162.FEk(this);
                    return;
                }
                if (this.A01 >= this.A05) {
                    A16();
                }
                byte[] bArr = this.A02;
                int i2 = this.A01;
                this.A01 = i2 + 1;
                bArr[i2] = 91;
            }

            @Override // X.AnonymousClass182
            public final void A0p(Object obj) {
                A13("start an object");
                ((AnonymousClass181) this).A02 = ((AnonymousClass181) this).A02.A0A(obj);
                AnonymousClass162 anonymousClass162 = ((AnonymousClass182) this).A00;
                if (anonymousClass162 != null) {
                    anonymousClass162.FEl(this);
                    return;
                }
                if (this.A01 >= this.A05) {
                    A16();
                }
                byte[] bArr = this.A02;
                int i2 = this.A01;
                this.A01 = i2 + 1;
                bArr[i2] = 123;
            }

            @Override // X.AnonymousClass182
            public final void A0q(Object obj, int i2) {
                A13("start an array");
                ((AnonymousClass181) this).A02 = ((AnonymousClass181) this).A02.A09(obj);
                AnonymousClass162 anonymousClass162 = ((AnonymousClass182) this).A00;
                if (anonymousClass162 != null) {
                    anonymousClass162.FEk(this);
                    return;
                }
                if (this.A01 >= this.A05) {
                    A16();
                }
                byte[] bArr = this.A02;
                int i3 = this.A01;
                this.A01 = i3 + 1;
                bArr[i3] = 91;
            }

            /* JADX WARN: Removed duplicated region for block: B:26:0x00c3  */
            @Override // X.AnonymousClass182
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void A0r(java.lang.String r9) {
                /*
                    Method dump skipped, instructions count: 244
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C120295cS.A0r(java.lang.String):void");
            }

            @Override // X.AnonymousClass182
            public final void A0s(String str) {
                A13("write a number");
                if (str == null) {
                    A04();
                } else if (((AnonymousClass181) this).A03) {
                    A05(str);
                } else {
                    A0t(str);
                }
            }

            @Override // X.AnonymousClass182
            public final void A0u(String str) {
                A13("write a string");
                if (str == null) {
                    A04();
                    return;
                }
                int length = str.length();
                if (length > this.A06) {
                    A07(str, true);
                    return;
                }
                int i2 = this.A01 + length;
                int i3 = this.A05;
                if (i2 >= i3) {
                    A16();
                }
                byte[] bArr = this.A02;
                int i4 = this.A01;
                this.A01 = i4 + 1;
                byte b = this.A00;
                bArr[i4] = b;
                A06(str, 0, length);
                if (this.A01 >= i3) {
                    A16();
                }
                byte[] bArr2 = this.A02;
                int i5 = this.A01;
                this.A01 = i5 + 1;
                bArr2[i5] = b;
            }

            @Override // X.AnonymousClass182
            public final void A0v(BigDecimal bigDecimal) {
                A13("write a number");
                if (bigDecimal == null) {
                    A04();
                    return;
                }
                boolean z = ((AnonymousClass181) this).A03;
                String A11 = A11(bigDecimal);
                if (z) {
                    A05(A11);
                } else {
                    A0t(A11);
                }
            }

            @Override // X.AnonymousClass182
            public final void A0w(BigInteger bigInteger) {
                A13("write a number");
                if (bigInteger == null) {
                    A04();
                    return;
                }
                boolean z = ((AnonymousClass181) this).A03;
                String obj = bigInteger.toString();
                if (z) {
                    A05(obj);
                } else {
                    A0t(obj);
                }
            }

            @Override // X.AnonymousClass182
            public final void A0x(short s) {
                A13("write a number");
                int i2 = this.A01 + 6;
                int i3 = this.A05;
                if (i2 >= i3) {
                    A16();
                }
                if (((AnonymousClass181) this).A03) {
                    if (this.A01 + 8 >= i3) {
                        A16();
                    }
                    byte[] bArr = this.A02;
                    int i4 = this.A01;
                    int i5 = i4 + 1;
                    this.A01 = i5;
                    byte b = this.A00;
                    bArr[i4] = b;
                    int A03 = AnonymousClass188.A03(bArr, s, i5);
                    byte[] bArr2 = this.A02;
                    this.A01 = A03 + 1;
                    bArr2[A03] = b;
                    return;
                }
                this.A01 = AnonymousClass188.A03(this.A02, s, this.A01);
            }

            @Override // X.AnonymousClass182
            public final void A0y(boolean z) {
                byte[] bArr;
                A13("write a boolean value");
                if (this.A01 + 5 >= this.A05) {
                    A16();
                }
                if (z) {
                    bArr = A0B;
                } else {
                    bArr = A08;
                }
                int length = bArr.length;
                System.arraycopy(bArr, 0, this.A02, this.A01, length);
                this.A01 += length;
            }

            /* JADX WARN: Removed duplicated region for block: B:12:0x002b  */
            @Override // X.AnonymousClass182
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void A10(char[] r6, int r7, int r8) {
                /*
                    r5 = this;
                    java.lang.String r0 = "write a string"
                    r5.A13(r0)
                    int r0 = r5.A01
                    int r4 = r5.A05
                    if (r0 < r4) goto Le
                    r5.A16()
                Le:
                    byte[] r2 = r5.A02
                    int r1 = r5.A01
                    int r0 = r1 + 1
                    r5.A01 = r0
                    byte r3 = r5.A00
                    r2[r1] = r3
                    int r2 = r5.A06
                    if (r8 > r2) goto L39
                    int r0 = r0 + r8
                    if (r0 <= r4) goto L24
                    r5.A16()
                L24:
                    r5.A0A(r6, r7, r8)
                L27:
                    int r0 = r5.A01
                    if (r0 < r4) goto L2e
                    r5.A16()
                L2e:
                    byte[] r2 = r5.A02
                    int r1 = r5.A01
                    int r0 = r1 + 1
                    r5.A01 = r0
                    r2[r1] = r3
                    return
                L39:
                    int r1 = java.lang.Math.min(r2, r8)
                    int r0 = r5.A01
                    int r0 = r0 + r1
                    if (r0 <= r4) goto L45
                    r5.A16()
                L45:
                    r5.A0A(r6, r7, r1)
                    int r7 = r7 + r1
                    int r8 = r8 - r1
                    if (r8 > 0) goto L39
                    goto L27
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C120295cS.A10(char[], int, int):void");
            }

            @Override // X.AnonymousClass181
            public final void A13(String str) {
                byte b;
                int A05 = ((AnonymousClass181) this).A02.A05();
                if (((AnonymousClass182) this).A00 != null) {
                    A15(str, A05);
                    return;
                }
                if (A05 != 1) {
                    if (A05 != 2) {
                        if (A05 != 3) {
                            if (A05 != 5) {
                                return;
                            }
                            A14(str);
                            throw C00O.createAndThrow();
                        }
                        AnonymousClass165 anonymousClass165 = ((AnonymousClass180) this).A01;
                        if (anonymousClass165 == null) {
                            return;
                        }
                        AnonymousClass164 anonymousClass164 = (AnonymousClass164) anonymousClass165;
                        byte[] bArr = anonymousClass164.A01;
                        if (bArr == null) {
                            bArr = AnonymousClass166.A01(anonymousClass164.A03);
                            anonymousClass164.A01 = bArr;
                        }
                        if (bArr.length <= 0) {
                            return;
                        }
                        A09(bArr);
                        return;
                    }
                    b = 58;
                } else {
                    b = 44;
                }
                if (this.A01 >= this.A05) {
                    A16();
                }
                byte[] bArr2 = this.A02;
                int i2 = this.A01;
                this.A01 = i2 + 1;
                bArr2[i2] = b;
            }

            public final void A16() {
                int i2 = this.A01;
                if (i2 > 0) {
                    this.A01 = 0;
                    this.A07.write(this.A02, 0, i2);
                }
            }

            @Override // X.AnonymousClass182, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                if (this.A02 != null && A0X(AnonymousClass160.AUTO_CLOSE_JSON_CONTENT)) {
                    while (true) {
                        int i2 = ((C16Q) ((AnonymousClass181) this).A02).A01;
                        if (i2 == 1) {
                            A0Z();
                        } else if (i2 != 2) {
                            break;
                        } else {
                            A0a();
                        }
                    }
                }
                A16();
                this.A01 = 0;
                OutputStream outputStream2 = this.A07;
                if (outputStream2 != null) {
                    if (!super.A04.A09 && !A0X(AnonymousClass160.AUTO_CLOSE_TARGET)) {
                        if (A0X(AnonymousClass160.FLUSH_PASSED_TO_STREAM)) {
                            outputStream2.flush();
                        }
                    } else {
                        outputStream2.close();
                    }
                }
                byte[] bArr = this.A02;
                if (bArr != null) {
                    this.A02 = null;
                    super.A04.A03(bArr);
                }
                char[] cArr = this.A03;
                if (cArr != null) {
                    this.A03 = null;
                    super.A04.A04(cArr);
                }
            }

            {
                this.A07 = outputStream;
                this.A00 = (byte) c;
                if (c != '\"') {
                    int[] iArr = AnonymousClass167.A07;
                    int[][] iArr2 = W1Z.A01.A00;
                    int[] iArr3 = iArr2[c];
                    if (iArr3 == null) {
                        iArr3 = Arrays.copyOf(AnonymousClass167.A07, 128);
                        if (iArr3[c] == 0) {
                            iArr3[c] = -1;
                        }
                        iArr2[c] = iArr3;
                    }
                    ((AnonymousClass180) this).A03 = iArr3;
                }
                C16H.A00(c16h.A02);
                C16G c16g = c16h.A08;
                byte[] A00 = c16g.A00(1);
                c16h.A02 = A00;
                this.A02 = A00;
                int length = A00.length;
                this.A05 = length;
                this.A06 = length >> 3;
                C16H.A00(c16h.A03);
                char[] A01 = c16g.A01(1, 0);
                c16h.A03 = A01;
                this.A03 = A01;
                this.A04 = A01.length;
                if (A0X(AnonymousClass160.ESCAPE_NON_ASCII)) {
                    ((AnonymousClass180) this).A00 = StringTreeSet.MAX_SYMBOL_COUNT;
                }
            }

            private final int A03(char[] cArr, int i2, int i3, int i4) {
                Object[] objArr;
                String str;
                if (i2 >= 55296 && i2 <= 57343) {
                    if (i3 < i4) {
                        char c2 = cArr[i3];
                        if (c2 >= 56320 && c2 <= 57343) {
                            int i5 = ((i2 - 55296) << 10) + Constants.LOAD_RESULT_PGO_ATTEMPTED + (c2 - 56320);
                            if (this.A01 + 4 > this.A05) {
                                A16();
                            }
                            byte[] bArr = this.A02;
                            int i6 = this.A01;
                            int i7 = i6 + 1;
                            bArr[i6] = (byte) ((i5 >> 18) | 240);
                            int i8 = i7 + 1;
                            bArr[i7] = (byte) (((i5 >> 12) & 63) | 128);
                            int i9 = i8 + 1;
                            bArr[i8] = (byte) (((i5 >> 6) & 63) | 128);
                            this.A01 = i9 + 1;
                            bArr[i9] = (byte) ((i5 & 63) | 128);
                            return i3 + 1;
                        }
                        objArr = new Object[]{Integer.valueOf(i2), Integer.valueOf(c2)};
                        str = "Incomplete surrogate pair: first char 0x%04X, second 0x%04X";
                    } else {
                        objArr = new Object[]{Integer.valueOf(i2)};
                        str = "Split surrogate on writeRaw() input (last character): first character 0x%4x";
                    }
                    A0L(String.format(str, objArr));
                    throw C00O.createAndThrow();
                }
                byte[] bArr2 = this.A02;
                int i10 = this.A01;
                int i11 = i10 + 1;
                bArr2[i10] = (byte) ((i2 >> 12) | 224);
                int i12 = i11 + 1;
                bArr2[i11] = (byte) (((i2 >> 6) & 63) | 128);
                this.A01 = i12 + 1;
                bArr2[i12] = (byte) ((i2 & 63) | 128);
                return i3;
            }

            @Override // X.AnonymousClass182
            public final void A0t(String str) {
                int i2;
                char c2;
                int length = str.length();
                char[] cArr = this.A03;
                int length2 = cArr.length;
                if (length <= length2) {
                    str.getChars(0, length, cArr, 0);
                    A0z(cArr, 0, length);
                    return;
                }
                int i3 = 0;
                int i4 = this.A05;
                int min = Math.min(length2, (i4 >> 2) + (i4 >> 4));
                int i5 = min * 3;
                do {
                    int min2 = Math.min(min, length);
                    str.getChars(i3, i3 + min2, cArr, 0);
                    if (this.A01 + i5 > i4) {
                        A16();
                    }
                    if (min2 > 1 && (c2 = cArr[min2 - 1]) >= 55296 && c2 <= 56319) {
                        min2 = i2;
                    }
                    int i6 = 0;
                    while (i6 < min2) {
                        do {
                            char c3 = cArr[i6];
                            if (c3 > 127) {
                                i6++;
                                if (c3 < 2048) {
                                    byte[] bArr = this.A02;
                                    int i7 = this.A01;
                                    int i8 = i7 + 1;
                                    bArr[i7] = (byte) ((c3 >> 6) | 192);
                                    this.A01 = i8 + 1;
                                    bArr[i8] = (byte) ((c3 & '?') | 128);
                                } else {
                                    i6 = A03(cArr, c3, i6, min2);
                                }
                            } else {
                                byte[] bArr2 = this.A02;
                                int i9 = this.A01;
                                this.A01 = i9 + 1;
                                bArr2[i9] = (byte) c3;
                                i6++;
                            }
                        } while (i6 < min2);
                    }
                    i3 += min2;
                    length -= min2;
                } while (length > 0);
            }

            @Override // X.AnonymousClass181, X.AnonymousClass182, java.io.Flushable
            public final void flush() {
                A16();
                OutputStream outputStream2 = this.A07;
                if (outputStream2 != null && A0X(AnonymousClass160.FLUSH_PASSED_TO_STREAM)) {
                    outputStream2.flush();
                }
            }
        };
        AnonymousClass165 anonymousClass165 = this.A04;
        if (anonymousClass165 != A08) {
            r2.A01 = anonymousClass165;
        }
        return r2;
    }

    public final C120295cS A07(File file, Integer num) {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        C16H c16h = new C16H(new C16D(true, fileOutputStream), A0B(), true);
        c16h.A00 = num;
        return A06(c16h, fileOutputStream);
    }

    public final C120295cS A08(OutputStream outputStream) {
        Integer num = C05F.A00;
        C16H c16h = new C16H(new C16D(true, outputStream), A0B(), false);
        c16h.A00 = num;
        return A06(c16h, outputStream);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.17z, X.180] */
    public final C17z A09(final C16H c16h, final Writer writer) {
        final int i = this.A01;
        final C44T c44t = this.A03;
        final char c = this.A05;
        ?? r2 = new AnonymousClass180(c44t, c16h, writer, c, i) { // from class: X.17z
            public static final char[] A07 = AnonymousClass167.A01();
            public char A00;
            public int A01;
            public int A02;
            public int A03;
            public char[] A04;
            public char[] A05;
            public final Writer A06;

            public static int A00(InputStream inputStream, byte[] bArr, int i2, int i3, int i4) {
                int read;
                int i5 = 0;
                while (i2 < i3) {
                    bArr[i5] = bArr[i2];
                    i5++;
                    i2++;
                }
                int min = Math.min(i4, bArr.length);
                do {
                    int i6 = min - i5;
                    if (i6 == 0 || (read = inputStream.read(bArr, i5, i6)) < 0) {
                        break;
                    }
                    i5 += read;
                } while (i5 < 3);
                return i5;
            }

            private void A04(int i2, char c2) {
                char[] cArr;
                int i3;
                int i4;
                char c3;
                if (i2 >= 0) {
                    int i5 = this.A03;
                    if (i5 >= 2) {
                        int i6 = i5 - 2;
                        this.A02 = i6;
                        cArr = this.A04;
                        i4 = i6 + 1;
                        cArr[i6] = '\\';
                        c3 = (char) i2;
                    } else {
                        char[] cArr2 = this.A05;
                        if (cArr2 == null) {
                            cArr2 = A07();
                        }
                        this.A02 = i5;
                        cArr2[1] = (char) i2;
                        this.A06.write(cArr2, 0, 2);
                        return;
                    }
                } else if (i2 != -2) {
                    int i7 = this.A03;
                    if (i7 >= 6) {
                        cArr = this.A04;
                        int i8 = i7 - 6;
                        this.A02 = i8;
                        cArr[i8] = '\\';
                        int i9 = i8 + 1;
                        cArr[i9] = 'u';
                        if (c2 > 255) {
                            int i10 = (c2 >> '\b') & 255;
                            int i11 = i9 + 1;
                            char[] cArr3 = A07;
                            cArr[i11] = cArr3[i10 >> 4];
                            i3 = i11 + 1;
                            cArr[i3] = cArr3[i10 & 15];
                            c2 = (char) (c2 & 255);
                        } else {
                            int i12 = i9 + 1;
                            cArr[i12] = '0';
                            i3 = i12 + 1;
                            cArr[i3] = '0';
                        }
                        int i13 = i3 + 1;
                        char[] cArr4 = A07;
                        cArr[i13] = cArr4[c2 >> 4];
                        i4 = i13 + 1;
                        c3 = cArr4[c2 & 15];
                    } else {
                        char[] cArr5 = this.A05;
                        if (cArr5 == null) {
                            cArr5 = A07();
                        }
                        this.A02 = i7;
                        if (c2 > 255) {
                            int i14 = (c2 >> '\b') & 255;
                            int i15 = c2 & 255;
                            char[] cArr6 = A07;
                            cArr5[10] = cArr6[i14 >> 4];
                            cArr5[11] = cArr6[i14 & 15];
                            cArr5[12] = cArr6[i15 >> 4];
                            cArr5[13] = cArr6[i15 & 15];
                            this.A06.write(cArr5, 8, 6);
                            return;
                        }
                        char[] cArr7 = A07;
                        cArr5[6] = cArr7[c2 >> 4];
                        cArr5[7] = cArr7[c2 & 15];
                        this.A06.write(cArr5, 2, 6);
                        return;
                    }
                } else {
                    throw new NullPointerException("getEscapeSequence");
                }
                cArr[i4] = c3;
            }

            @Override // X.AnonymousClass182
            public final void A0z(char[] cArr, int i2, int i3) {
                if (i3 < 32) {
                    if (i3 > this.A01 - this.A03) {
                        A16();
                    }
                    System.arraycopy(cArr, 0, this.A04, this.A03, i3);
                    this.A03 += i3;
                    return;
                }
                A16();
                this.A06.write(cArr, 0, i3);
            }

            private int A01(char[] cArr, char c2, int i2, int i3, int i4) {
                int i5;
                if (i4 >= 0) {
                    if (i2 > 1 && i2 < i3) {
                        int i6 = i2 - 2;
                        cArr[i6] = '\\';
                        cArr[i6 + 1] = (char) i4;
                        return i6;
                    }
                    char[] cArr2 = this.A05;
                    if (cArr2 == null) {
                        cArr2 = A07();
                    }
                    cArr2[1] = (char) i4;
                    this.A06.write(cArr2, 0, 2);
                    return i2;
                }
                if (i4 != -2) {
                    if (i2 > 5 && i2 < i3) {
                        int i7 = i2 - 6;
                        int i8 = i7 + 1;
                        cArr[i7] = '\\';
                        int i9 = i8 + 1;
                        cArr[i8] = 'u';
                        if (c2 > 255) {
                            int i10 = (c2 >> '\b') & 255;
                            int i11 = i9 + 1;
                            char[] cArr3 = A07;
                            cArr[i9] = cArr3[i10 >> 4];
                            i5 = i11 + 1;
                            cArr[i11] = cArr3[i10 & 15];
                            c2 = (char) (c2 & 255);
                        } else {
                            int i12 = i9 + 1;
                            cArr[i9] = '0';
                            i5 = i12 + 1;
                            cArr[i12] = '0';
                        }
                        int i13 = i5 + 1;
                        char[] cArr4 = A07;
                        cArr[i5] = cArr4[c2 >> 4];
                        cArr[i13] = cArr4[c2 & 15];
                        return i13 - 5;
                    }
                    char[] cArr5 = this.A05;
                    if (cArr5 == null) {
                        cArr5 = A07();
                    }
                    this.A02 = this.A03;
                    if (c2 > 255) {
                        int i14 = (c2 >> '\b') & 255;
                        int i15 = c2 & 255;
                        char[] cArr6 = A07;
                        cArr5[10] = cArr6[i14 >> 4];
                        cArr5[11] = cArr6[i14 & 15];
                        cArr5[12] = cArr6[i15 >> 4];
                        cArr5[13] = cArr6[i15 & 15];
                        this.A06.write(cArr5, 8, 6);
                        return i2;
                    }
                    char[] cArr7 = A07;
                    cArr5[6] = cArr7[c2 >> 4];
                    cArr5[7] = cArr7[c2 & 15];
                    this.A06.write(cArr5, 2, 6);
                    return i2;
                }
                throw new NullPointerException("getEscapeSequence");
            }

            private final void A02() {
                if (this.A03 + 4 >= this.A01) {
                    A16();
                }
                int i2 = this.A03;
                char[] cArr = this.A04;
                cArr[i2] = 'n';
                int i3 = i2 + 1;
                cArr[i3] = 'u';
                int i4 = i3 + 1;
                cArr[i4] = 'l';
                int i5 = i4 + 1;
                cArr[i5] = 'l';
                this.A03 = i5 + 1;
            }

            private void A03(int i2, char c2) {
                int i3;
                if (i2 >= 0) {
                    if (this.A03 + 2 > this.A01) {
                        A16();
                    }
                    char[] cArr = this.A04;
                    int i4 = this.A03;
                    int i5 = i4 + 1;
                    cArr[i4] = '\\';
                    this.A03 = i5 + 1;
                    cArr[i5] = (char) i2;
                    return;
                }
                if (i2 != -2) {
                    if (this.A03 + 5 >= this.A01) {
                        A16();
                    }
                    int i6 = this.A03;
                    char[] cArr2 = this.A04;
                    int i7 = i6 + 1;
                    cArr2[i6] = '\\';
                    int i8 = i7 + 1;
                    cArr2[i7] = 'u';
                    if (c2 > 255) {
                        int i9 = 255 & (c2 >> '\b');
                        int i10 = i8 + 1;
                        char[] cArr3 = A07;
                        cArr2[i8] = cArr3[i9 >> 4];
                        i3 = i10 + 1;
                        cArr2[i10] = cArr3[i9 & 15];
                        c2 = (char) (c2 & 255);
                    } else {
                        int i11 = i8 + 1;
                        cArr2[i8] = '0';
                        i3 = i11 + 1;
                        cArr2[i11] = '0';
                    }
                    int i12 = i3 + 1;
                    char[] cArr4 = A07;
                    cArr2[i3] = cArr4[c2 >> 4];
                    cArr2[i12] = cArr4[c2 & 15];
                    this.A03 = i12 + 1;
                    return;
                }
                throw new NullPointerException("getEscapeSequence");
            }

            private void A05(String str) {
                int i2 = this.A03;
                int i3 = this.A01;
                if (i2 >= i3) {
                    A16();
                }
                char[] cArr = this.A04;
                int i4 = this.A03;
                this.A03 = i4 + 1;
                char c2 = this.A00;
                cArr[i4] = c2;
                A0t(str);
                if (this.A03 >= i3) {
                    A16();
                }
                char[] cArr2 = this.A04;
                int i5 = this.A03;
                this.A03 = i5 + 1;
                cArr2[i5] = c2;
            }

            /* JADX WARN: Removed duplicated region for block: B:17:0x003c A[EDGE_INSN: B:17:0x003c->B:18:0x003c BREAK  A[LOOP:2: B:11:0x0032->B:31:?], SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:31:? A[LOOP:2: B:11:0x0032->B:31:?, LOOP_END, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:77:0x00ce  */
            /* JADX WARN: Removed duplicated region for block: B:80:0x00d3 A[SYNTHETIC] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            private void A06(java.lang.String r22) {
                /*
                    Method dump skipped, instructions count: 280
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C17z.A06(java.lang.String):void");
            }

            private char[] A07() {
                char[] cArr = {'\\', 0, '\\', 'u', '0', '0', 0, 0, '\\', 'u'};
                this.A05 = cArr;
                return cArr;
            }

            /* JADX WARN: Code restructure failed: missing block: B:57:0x0136, code lost:
            
                if (r8 > 0) goto L54;
             */
            /* JADX WARN: Code restructure failed: missing block: B:72:0x0109, code lost:
            
                if (r8 > 0) goto L42;
             */
            @Override // X.AnonymousClass182
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final int A0Y(X.C912044w r22, java.io.InputStream r23, int r24) {
                /*
                    Method dump skipped, instructions count: 356
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C17z.A0Y(X.44w, java.io.InputStream, int):int");
            }

            @Override // X.AnonymousClass182
            public final void A0Z() {
                AnonymousClass184 anonymousClass184 = ((AnonymousClass181) this).A02;
                if (((C16Q) anonymousClass184).A01 == 1) {
                    AnonymousClass162 anonymousClass162 = ((AnonymousClass182) this).A00;
                    if (anonymousClass162 != null) {
                        anonymousClass162.FES(this, ((C16Q) anonymousClass184).A00 + 1);
                    } else {
                        if (this.A03 >= this.A01) {
                            A16();
                        }
                        char[] cArr = this.A04;
                        int i2 = this.A03;
                        this.A03 = i2 + 1;
                        cArr[i2] = ']';
                    }
                    AnonymousClass184 anonymousClass1842 = ((AnonymousClass181) this).A02;
                    anonymousClass1842.A01 = null;
                    ((AnonymousClass181) this).A02 = anonymousClass1842.A05;
                    return;
                }
                A0L(AnonymousClass001.A0R("Current context not Array but ", anonymousClass184.A02()));
                throw C00O.createAndThrow();
            }

            @Override // X.AnonymousClass182
            public final void A0a() {
                AnonymousClass184 anonymousClass184 = ((AnonymousClass181) this).A02;
                if (((C16Q) anonymousClass184).A01 == 2) {
                    AnonymousClass162 anonymousClass162 = ((AnonymousClass182) this).A00;
                    if (anonymousClass162 != null) {
                        anonymousClass162.FET(this, ((C16Q) anonymousClass184).A00 + 1);
                    } else {
                        if (this.A03 >= this.A01) {
                            A16();
                        }
                        char[] cArr = this.A04;
                        int i2 = this.A03;
                        this.A03 = i2 + 1;
                        cArr[i2] = '}';
                    }
                    AnonymousClass184 anonymousClass1842 = ((AnonymousClass181) this).A02;
                    anonymousClass1842.A01 = null;
                    ((AnonymousClass181) this).A02 = anonymousClass1842.A05;
                    return;
                }
                A0L(AnonymousClass001.A0R("Current context not Object but ", anonymousClass184.A02()));
                throw C00O.createAndThrow();
            }

            @Override // X.AnonymousClass182
            public final void A0e(char c2) {
                if (this.A03 >= this.A01) {
                    A16();
                }
                char[] cArr = this.A04;
                int i2 = this.A03;
                this.A03 = i2 + 1;
                cArr[i2] = c2;
            }

            @Override // X.AnonymousClass182
            public final void A0f(double d) {
                if (!((AnonymousClass181) this).A03) {
                    String[] strArr = AnonymousClass188.A04;
                    if ((!Double.isNaN(d) && !Double.isInfinite(d)) || !A0X(AnonymousClass160.QUOTE_NON_NUMERIC_NUMBERS)) {
                        A13("write a number");
                        A0t(String.valueOf(d));
                        return;
                    }
                }
                A0u(String.valueOf(d));
            }

            @Override // X.AnonymousClass182
            public final void A0g(float f) {
                if (!((AnonymousClass181) this).A03) {
                    String[] strArr = AnonymousClass188.A04;
                    if ((!Float.isNaN(f) && !Float.isInfinite(f)) || !A0X(AnonymousClass160.QUOTE_NON_NUMERIC_NUMBERS)) {
                        A13("write a number");
                        A0t(String.valueOf(f));
                        return;
                    }
                }
                A0u(String.valueOf(f));
            }

            @Override // X.AnonymousClass182
            public final void A0l(AnonymousClass165 anonymousClass165) {
                int i2;
                char c2;
                int i3;
                char[] cArr;
                int i4;
                AnonymousClass184 anonymousClass184 = ((AnonymousClass181) this).A02;
                AnonymousClass164 anonymousClass164 = (AnonymousClass164) anonymousClass165;
                String str = anonymousClass164.A03;
                int A06 = anonymousClass184.A06(str);
                if (A06 == 4) {
                    A0L("Can not write a field name, expecting a value");
                    throw C00O.createAndThrow();
                }
                boolean z = true;
                if (A06 != 1) {
                    z = false;
                }
                AnonymousClass162 anonymousClass162 = ((AnonymousClass182) this).A00;
                if (anonymousClass162 != null) {
                    if (z) {
                        anonymousClass162.FEc(this);
                    } else {
                        anonymousClass162.ADJ(this);
                    }
                    cArr = anonymousClass164.A02;
                    if (cArr == null) {
                        cArr = AnonymousClass164.A04.A03(str);
                        anonymousClass164.A02 = cArr;
                    }
                    i4 = 0;
                    if (!((AnonymousClass180) this).A02) {
                        int i5 = this.A03;
                        i2 = this.A01;
                        if (i5 >= i2) {
                            A16();
                        }
                        char[] cArr2 = this.A04;
                        int i6 = this.A03;
                        this.A03 = i6 + 1;
                        c2 = this.A00;
                        cArr2[i6] = c2;
                        A0z(cArr, 0, cArr.length);
                        i3 = this.A03;
                    }
                    A0z(cArr, i4, cArr.length);
                    return;
                }
                int i7 = this.A03 + 1;
                i2 = this.A01;
                if (i7 >= i2) {
                    A16();
                }
                if (z) {
                    char[] cArr3 = this.A04;
                    int i8 = this.A03;
                    this.A03 = i8 + 1;
                    cArr3[i8] = ',';
                }
                if (((AnonymousClass180) this).A02) {
                    cArr = anonymousClass164.A02;
                    if (cArr == null) {
                        cArr = AnonymousClass164.A04.A03(str);
                        anonymousClass164.A02 = cArr;
                    }
                    i4 = 0;
                    A0z(cArr, i4, cArr.length);
                    return;
                }
                char[] cArr4 = this.A04;
                int i9 = this.A03;
                int i10 = i9 + 1;
                this.A03 = i10;
                c2 = this.A00;
                cArr4[i9] = c2;
                char[] cArr5 = anonymousClass164.A02;
                if (cArr5 == null) {
                    cArr5 = AnonymousClass164.A04.A03(str);
                    anonymousClass164.A02 = cArr5;
                }
                int length = cArr5.length;
                if (i10 + length > cArr4.length) {
                    A0z(cArr5, 0, length);
                    i3 = this.A03;
                } else {
                    System.arraycopy(cArr5, 0, cArr4, i10, length);
                    i3 = this.A03 + length;
                    this.A03 = i3;
                }
                if (i3 >= i2) {
                    A16();
                }
                char[] cArr6 = this.A04;
                int i11 = this.A03;
                this.A03 = i11 + 1;
                cArr6[i11] = c2;
            }

            @Override // X.AnonymousClass182
            public final void A0m(AnonymousClass165 anonymousClass165) {
                char[] cArr = this.A04;
                int i2 = this.A03;
                String str = ((AnonymousClass164) anonymousClass165).A03;
                int length = str.length();
                if (i2 + length <= cArr.length) {
                    str.getChars(0, length, cArr, i2);
                    if (length >= 0) {
                        this.A03 += length;
                        return;
                    }
                }
                A0t(str);
            }

            /* JADX WARN: Code restructure failed: missing block: B:32:0x006d, code lost:
            
                if (((X.AnonymousClass180) r5).A02 != false) goto L31;
             */
            @Override // X.AnonymousClass182
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void A0r(java.lang.String r6) {
                /*
                    r5 = this;
                    X.184 r0 = r5.A02
                    int r2 = r0.A06(r6)
                    r0 = 4
                    if (r2 != r0) goto L13
                    java.lang.String r0 = "Can not write a field name, expecting a value"
                    r5.A0L(r0)
                    X.00O r0 = X.C00O.createAndThrow()
                    throw r0
                L13:
                    r1 = 1
                    if (r2 == r1) goto L17
                    r1 = 0
                L17:
                    X.162 r0 = r5.A00
                    if (r0 == 0) goto L52
                    if (r1 == 0) goto L4e
                    r0.FEc(r5)
                L20:
                    boolean r0 = r5.A02
                    if (r0 != 0) goto L6f
                    int r0 = r5.A03
                    int r4 = r5.A01
                    if (r0 < r4) goto L2d
                    r5.A16()
                L2d:
                    char[] r2 = r5.A04
                    int r1 = r5.A03
                    int r0 = r1 + 1
                    r5.A03 = r0
                    char r3 = r5.A00
                    r2[r1] = r3
                    r5.A06(r6)
                    int r0 = r5.A03
                    if (r0 < r4) goto L43
                    r5.A16()
                L43:
                    char[] r2 = r5.A04
                    int r1 = r5.A03
                    int r0 = r1 + 1
                    r5.A03 = r0
                    r2[r1] = r3
                    return
                L4e:
                    r0.ADJ(r5)
                    goto L20
                L52:
                    int r0 = r5.A03
                    int r0 = r0 + 1
                    int r4 = r5.A01
                    if (r0 < r4) goto L5d
                    r5.A16()
                L5d:
                    if (r1 == 0) goto L6b
                    char[] r2 = r5.A04
                    int r1 = r5.A03
                    int r0 = r1 + 1
                    r5.A03 = r0
                    r0 = 44
                    r2[r1] = r0
                L6b:
                    boolean r0 = r5.A02
                    if (r0 == 0) goto L2d
                L6f:
                    r5.A06(r6)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C17z.A0r(java.lang.String):void");
            }

            @Override // X.AnonymousClass181
            public final void A13(String str) {
                char c2;
                int A05 = ((AnonymousClass181) this).A02.A05();
                if (((AnonymousClass182) this).A00 != null) {
                    A15(str, A05);
                    return;
                }
                if (A05 != 1) {
                    if (A05 != 2) {
                        if (A05 != 3) {
                            if (A05 != 5) {
                                return;
                            }
                            A14(str);
                            throw C00O.createAndThrow();
                        }
                        AnonymousClass165 anonymousClass165 = ((AnonymousClass180) this).A01;
                        if (anonymousClass165 == null) {
                            return;
                        }
                        A0t(((AnonymousClass164) anonymousClass165).A03);
                        return;
                    }
                    c2 = ':';
                } else {
                    c2 = ',';
                }
                if (this.A03 >= this.A01) {
                    A16();
                }
                char[] cArr = this.A04;
                int i2 = this.A03;
                this.A03 = i2 + 1;
                cArr[i2] = c2;
            }

            public final void A16() {
                int i2 = this.A03;
                int i3 = this.A02;
                int i4 = i2 - i3;
                if (i4 > 0) {
                    this.A02 = 0;
                    this.A03 = 0;
                    this.A06.write(this.A04, i3, i4);
                }
            }

            @Override // X.AnonymousClass182, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                if (this.A04 != null && A0X(AnonymousClass160.AUTO_CLOSE_JSON_CONTENT)) {
                    while (true) {
                        int i2 = ((C16Q) ((AnonymousClass181) this).A02).A01;
                        if (i2 == 1) {
                            A0Z();
                        } else if (i2 != 2) {
                            break;
                        } else {
                            A0a();
                        }
                    }
                }
                A16();
                this.A02 = 0;
                this.A03 = 0;
                Writer writer2 = this.A06;
                if (writer2 != null) {
                    if (!super.A04.A09 && !A0X(AnonymousClass160.AUTO_CLOSE_TARGET)) {
                        if (A0X(AnonymousClass160.FLUSH_PASSED_TO_STREAM)) {
                            writer2.flush();
                        }
                    } else {
                        writer2.close();
                    }
                }
                char[] cArr = this.A04;
                if (cArr != null) {
                    this.A04 = null;
                    super.A04.A04(cArr);
                }
            }

            {
                this.A06 = writer;
                C16H.A00(c16h.A03);
                char[] A01 = c16h.A08.A01(1, 0);
                c16h.A03 = A01;
                this.A04 = A01;
                this.A01 = A01.length;
                this.A00 = c;
                if (c != '\"') {
                    byte[] bArr = AnonymousClass167.A08;
                    int[][] iArr = W1Z.A01.A00;
                    int[] iArr2 = iArr[c];
                    if (iArr2 == null) {
                        iArr2 = Arrays.copyOf(AnonymousClass167.A07, 128);
                        if (iArr2[c] == 0) {
                            iArr2[c] = -1;
                        }
                        iArr[c] = iArr2;
                    }
                    ((AnonymousClass180) this).A03 = iArr2;
                }
            }

            @Override // X.AnonymousClass182
            public final void A0b() {
                A13("write a null");
                A02();
            }

            @Override // X.AnonymousClass182
            public final void A0c() {
                A13("start an array");
                ((AnonymousClass181) this).A02 = ((AnonymousClass181) this).A02.A07();
                AnonymousClass162 anonymousClass162 = ((AnonymousClass182) this).A00;
                if (anonymousClass162 != null) {
                    anonymousClass162.FEk(this);
                    return;
                }
                if (this.A03 >= this.A01) {
                    A16();
                }
                char[] cArr = this.A04;
                int i2 = this.A03;
                this.A03 = i2 + 1;
                cArr[i2] = '[';
            }

            @Override // X.AnonymousClass182
            public final void A0d() {
                A13("start an object");
                ((AnonymousClass181) this).A02 = ((AnonymousClass181) this).A02.A08();
                AnonymousClass162 anonymousClass162 = ((AnonymousClass182) this).A00;
                if (anonymousClass162 != null) {
                    anonymousClass162.FEl(this);
                    return;
                }
                if (this.A03 >= this.A01) {
                    A16();
                }
                char[] cArr = this.A04;
                int i2 = this.A03;
                this.A03 = i2 + 1;
                cArr[i2] = '{';
            }

            @Override // X.AnonymousClass182
            public final void A0h(int i2) {
                A13("write a number");
                if (((AnonymousClass181) this).A03) {
                    if (this.A03 + 13 >= this.A01) {
                        A16();
                    }
                    char[] cArr = this.A04;
                    int i3 = this.A03;
                    int i4 = i3 + 1;
                    this.A03 = i4;
                    char c2 = this.A00;
                    cArr[i3] = c2;
                    int A00 = AnonymousClass188.A00(i2, cArr, i4);
                    char[] cArr2 = this.A04;
                    this.A03 = A00 + 1;
                    cArr2[A00] = c2;
                    return;
                }
                if (this.A03 + 11 >= this.A01) {
                    A16();
                }
                this.A03 = AnonymousClass188.A00(i2, this.A04, this.A03);
            }

            @Override // X.AnonymousClass182
            public final void A0i(long j) {
                A13("write a number");
                if (((AnonymousClass181) this).A03) {
                    if (this.A03 + 23 >= this.A01) {
                        A16();
                    }
                    char[] cArr = this.A04;
                    int i2 = this.A03;
                    int i3 = i2 + 1;
                    this.A03 = i3;
                    char c2 = this.A00;
                    cArr[i2] = c2;
                    int A072 = AnonymousClass188.A07(cArr, i3, j);
                    char[] cArr2 = this.A04;
                    this.A03 = A072 + 1;
                    cArr2[A072] = c2;
                    return;
                }
                if (this.A03 + 21 >= this.A01) {
                    A16();
                }
                this.A03 = AnonymousClass188.A07(this.A04, this.A03, j);
            }

            @Override // X.AnonymousClass182
            public final void A0j(C912044w c912044w, byte[] bArr, int i2, int i3) {
                A13("write a binary value");
                int i4 = this.A03;
                int i5 = this.A01;
                if (i4 >= i5) {
                    A16();
                }
                char[] cArr = this.A04;
                int i6 = this.A03;
                int i7 = i6 + 1;
                this.A03 = i7;
                char c2 = this.A00;
                cArr[i6] = c2;
                int i8 = i3 + i2;
                int i9 = i8 - 3;
                int i10 = i5 - 6;
                int i11 = c912044w.A01 >> 2;
                while (i2 <= i9) {
                    if (i7 > i10) {
                        A16();
                    }
                    int i12 = i2 + 1;
                    int i13 = i12 + 1;
                    int i14 = ((bArr[i2] << 8) | (bArr[i12] & 255)) << 8;
                    i2 = i13 + 1;
                    int i15 = i14 | (bArr[i13] & 255);
                    char[] cArr2 = this.A04;
                    i7 = c912044w.A01(i15, cArr2, this.A03);
                    this.A03 = i7;
                    i11--;
                    if (i11 <= 0) {
                        int i16 = i7 + 1;
                        cArr2[i7] = '\\';
                        i7 = i16 + 1;
                        this.A03 = i7;
                        cArr2[i16] = 'n';
                        i11 = i11;
                    }
                }
                int i17 = i8 - i2;
                if (i17 > 0) {
                    if (i7 > i10) {
                        A16();
                    }
                    int i18 = i2 + 1;
                    int i19 = bArr[i2] << 16;
                    if (i17 == 2) {
                        i19 |= (bArr[i18] & 255) << 8;
                    }
                    i7 = c912044w.A04(this.A04, i19, i17, this.A03);
                    this.A03 = i7;
                }
                if (i7 >= i5) {
                    A16();
                }
                char[] cArr3 = this.A04;
                int i20 = this.A03;
                this.A03 = i20 + 1;
                cArr3[i20] = c2;
            }

            @Override // X.AnonymousClass182
            public final void A0n(AnonymousClass165 anonymousClass165) {
                int i2;
                A13("write a string");
                int i3 = this.A03;
                int i4 = this.A01;
                if (i3 >= i4) {
                    A16();
                }
                char[] cArr = this.A04;
                int i5 = this.A03;
                int i6 = i5 + 1;
                this.A03 = i6;
                char c2 = this.A00;
                cArr[i5] = c2;
                AnonymousClass164 anonymousClass164 = (AnonymousClass164) anonymousClass165;
                char[] cArr2 = anonymousClass164.A02;
                if (cArr2 == null) {
                    cArr2 = AnonymousClass164.A04.A03(anonymousClass164.A03);
                    anonymousClass164.A02 = cArr2;
                }
                int length = cArr2.length;
                if (i6 + length > cArr.length) {
                    if (length < 32) {
                        if (length > i4 - this.A03) {
                            A16();
                        }
                        System.arraycopy(cArr2, 0, this.A04, this.A03, length);
                        this.A03 += length;
                    } else {
                        A16();
                        this.A06.write(cArr2, 0, length);
                    }
                    i2 = this.A03;
                } else {
                    System.arraycopy(cArr2, 0, cArr, i6, length);
                    i2 = this.A03 + length;
                    this.A03 = i2;
                }
                if (i2 >= i4) {
                    A16();
                }
                char[] cArr3 = this.A04;
                int i7 = this.A03;
                this.A03 = i7 + 1;
                cArr3[i7] = c2;
            }

            @Override // X.AnonymousClass182
            public final void A0o(Object obj) {
                A13("start an array");
                ((AnonymousClass181) this).A02 = ((AnonymousClass181) this).A02.A09(obj);
                AnonymousClass162 anonymousClass162 = ((AnonymousClass182) this).A00;
                if (anonymousClass162 != null) {
                    anonymousClass162.FEk(this);
                    return;
                }
                if (this.A03 >= this.A01) {
                    A16();
                }
                char[] cArr = this.A04;
                int i2 = this.A03;
                this.A03 = i2 + 1;
                cArr[i2] = '[';
            }

            @Override // X.AnonymousClass182
            public final void A0p(Object obj) {
                A13("start an object");
                ((AnonymousClass181) this).A02 = ((AnonymousClass181) this).A02.A0A(obj);
                AnonymousClass162 anonymousClass162 = ((AnonymousClass182) this).A00;
                if (anonymousClass162 != null) {
                    anonymousClass162.FEl(this);
                    return;
                }
                if (this.A03 >= this.A01) {
                    A16();
                }
                char[] cArr = this.A04;
                int i2 = this.A03;
                this.A03 = i2 + 1;
                cArr[i2] = '{';
            }

            @Override // X.AnonymousClass182
            public final void A0q(Object obj, int i2) {
                A13("start an array");
                ((AnonymousClass181) this).A02 = ((AnonymousClass181) this).A02.A09(obj);
                AnonymousClass162 anonymousClass162 = ((AnonymousClass182) this).A00;
                if (anonymousClass162 != null) {
                    anonymousClass162.FEk(this);
                    return;
                }
                if (this.A03 >= this.A01) {
                    A16();
                }
                char[] cArr = this.A04;
                int i3 = this.A03;
                this.A03 = i3 + 1;
                cArr[i3] = '[';
            }

            @Override // X.AnonymousClass182
            public final void A0s(String str) {
                A13("write a number");
                if (str == null) {
                    A02();
                } else if (((AnonymousClass181) this).A03) {
                    A05(str);
                } else {
                    A0t(str);
                }
            }

            @Override // X.AnonymousClass182
            public final void A0t(String str) {
                int i2;
                int length = str.length();
                int i3 = this.A01;
                int i4 = this.A03;
                int i5 = i3 - i4;
                if (i5 == 0) {
                    A16();
                    i4 = this.A03;
                    i5 = i3 - i4;
                }
                if (i5 >= length) {
                    str.getChars(0, length, this.A04, i4);
                    i2 = this.A03 + length;
                } else {
                    str.getChars(0, i5, this.A04, i4);
                    this.A03 += i5;
                    A16();
                    i2 = length - i5;
                    while (i2 > i3) {
                        int i6 = i5 + i3;
                        str.getChars(i5, i6, this.A04, 0);
                        this.A02 = 0;
                        this.A03 = i3;
                        A16();
                        i2 -= i3;
                        i5 = i6;
                    }
                    str.getChars(i5, i5 + i2, this.A04, 0);
                    this.A02 = 0;
                }
                this.A03 = i2;
            }

            @Override // X.AnonymousClass182
            public final void A0u(String str) {
                A13("write a string");
                if (str == null) {
                    A02();
                    return;
                }
                int i2 = this.A03;
                int i3 = this.A01;
                if (i2 >= i3) {
                    A16();
                }
                char[] cArr = this.A04;
                int i4 = this.A03;
                this.A03 = i4 + 1;
                char c2 = this.A00;
                cArr[i4] = c2;
                A06(str);
                if (this.A03 >= i3) {
                    A16();
                }
                char[] cArr2 = this.A04;
                int i5 = this.A03;
                this.A03 = i5 + 1;
                cArr2[i5] = c2;
            }

            @Override // X.AnonymousClass182
            public final void A0v(BigDecimal bigDecimal) {
                A13("write a number");
                if (bigDecimal == null) {
                    A02();
                    return;
                }
                boolean z = ((AnonymousClass181) this).A03;
                String A11 = A11(bigDecimal);
                if (z) {
                    A05(A11);
                } else {
                    A0t(A11);
                }
            }

            @Override // X.AnonymousClass182
            public final void A0w(BigInteger bigInteger) {
                A13("write a number");
                if (bigInteger == null) {
                    A02();
                    return;
                }
                boolean z = ((AnonymousClass181) this).A03;
                String obj = bigInteger.toString();
                if (z) {
                    A05(obj);
                } else {
                    A0t(obj);
                }
            }

            @Override // X.AnonymousClass182
            public final void A0x(short s) {
                A13("write a number");
                if (((AnonymousClass181) this).A03) {
                    if (this.A03 + 8 >= this.A01) {
                        A16();
                    }
                    char[] cArr = this.A04;
                    int i2 = this.A03;
                    int i3 = i2 + 1;
                    this.A03 = i3;
                    char c2 = this.A00;
                    cArr[i2] = c2;
                    int A00 = AnonymousClass188.A00(s, cArr, i3);
                    char[] cArr2 = this.A04;
                    this.A03 = A00 + 1;
                    cArr2[A00] = c2;
                    return;
                }
                if (this.A03 + 6 >= this.A01) {
                    A16();
                }
                this.A03 = AnonymousClass188.A00(s, this.A04, this.A03);
            }

            @Override // X.AnonymousClass182
            public final void A0y(boolean z) {
                int i2;
                char c2;
                A13("write a boolean value");
                if (this.A03 + 5 >= this.A01) {
                    A16();
                }
                int i3 = this.A03;
                char[] cArr = this.A04;
                if (z) {
                    cArr[i3] = 't';
                    int i4 = i3 + 1;
                    cArr[i4] = 'r';
                    i2 = i4 + 1;
                    c2 = 'u';
                } else {
                    cArr[i3] = 'f';
                    int i5 = i3 + 1;
                    cArr[i5] = 'a';
                    int i6 = i5 + 1;
                    cArr[i6] = 'l';
                    i2 = i6 + 1;
                    c2 = 's';
                }
                cArr[i2] = c2;
                int i7 = i2 + 1;
                cArr[i7] = 'e';
                this.A03 = i7 + 1;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x0035 A[EDGE_INSN: B:15:0x0035->B:16:0x0035 BREAK  A[LOOP:1: B:9:0x002d->B:33:?], SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:33:? A[LOOP:1: B:9:0x002d->B:33:?, LOOP_END, SYNTHETIC] */
            @Override // X.AnonymousClass182
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void A10(char[] r12, int r13, int r14) {
                /*
                    r11 = this;
                    java.lang.String r0 = "write a string"
                    r11.A13(r0)
                    int r0 = r11.A03
                    int r5 = r11.A01
                    if (r0 < r5) goto Lf
                    r11.A16()
                Lf:
                    char[] r2 = r11.A04
                    int r1 = r11.A03
                    int r0 = r1 + 1
                    r11.A03 = r0
                    char r4 = r11.A00
                    r2[r1] = r4
                    int r9 = r11.A00
                    int r14 = r14 + r13
                    if (r9 == 0) goto L6b
                    int[] r8 = r11.A03
                    int r1 = r8.length
                    int r0 = r9 + 1
                    int r7 = java.lang.Math.min(r1, r0)
                    r6 = 0
                L2a:
                    if (r13 >= r14) goto Laf
                    r3 = r13
                L2d:
                    char r2 = r12[r3]
                    if (r2 >= r7) goto L62
                    r6 = r8[r2]
                    if (r6 == 0) goto L66
                L35:
                    int r1 = r3 - r13
                    r0 = 32
                    if (r1 >= r0) goto L59
                    int r0 = r11.A03
                    int r0 = r0 + r1
                    if (r0 <= r5) goto L43
                    r11.A16()
                L43:
                    if (r1 <= 0) goto L51
                    char[] r10 = r11.A04
                    int r0 = r11.A03
                    java.lang.System.arraycopy(r12, r13, r10, r0, r1)
                    int r0 = r11.A03
                    int r0 = r0 + r1
                    r11.A03 = r0
                L51:
                    if (r3 >= r14) goto Laf
                    int r13 = r3 + 1
                    r11.A03(r6, r2)
                    goto L2a
                L59:
                    r11.A16()
                    java.io.Writer r0 = r11.A06
                    r0.write(r12, r13, r1)
                    goto L51
                L62:
                    if (r2 <= r9) goto L66
                    r6 = -1
                    goto L35
                L66:
                    int r3 = r3 + 1
                    if (r3 < r14) goto L2d
                    goto L35
                L6b:
                    int[] r3 = r11.A03
                    int r2 = r3.length
                L6e:
                    if (r13 >= r14) goto Laf
                    r7 = r13
                L71:
                    char r0 = r12[r7]
                    if (r0 >= r2) goto Laa
                    r0 = r3[r0]
                    if (r0 == 0) goto Laa
                L79:
                    int r6 = r7 - r13
                    r0 = 32
                    if (r6 >= r0) goto La1
                    int r0 = r11.A03
                    int r0 = r0 + r6
                    if (r0 <= r5) goto L87
                    r11.A16()
                L87:
                    if (r6 <= 0) goto L95
                    char[] r1 = r11.A04
                    int r0 = r11.A03
                    java.lang.System.arraycopy(r12, r13, r1, r0, r6)
                    int r0 = r11.A03
                    int r0 = r0 + r6
                    r11.A03 = r0
                L95:
                    if (r7 >= r14) goto Laf
                    int r13 = r7 + 1
                    char r1 = r12[r7]
                    r0 = r3[r1]
                    r11.A03(r0, r1)
                    goto L6e
                La1:
                    r11.A16()
                    java.io.Writer r0 = r11.A06
                    r0.write(r12, r13, r6)
                    goto L95
                Laa:
                    int r7 = r7 + 1
                    if (r7 < r14) goto L71
                    goto L79
                Laf:
                    int r0 = r11.A03
                    if (r0 < r5) goto Lb6
                    r11.A16()
                Lb6:
                    char[] r2 = r11.A04
                    int r1 = r11.A03
                    int r0 = r1 + 1
                    r11.A03 = r0
                    r2[r1] = r4
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C17z.A10(char[], int, int):void");
            }

            @Override // X.AnonymousClass181, X.AnonymousClass182, java.io.Flushable
            public final void flush() {
                A16();
                Writer writer2 = this.A06;
                if (writer2 != null && A0X(AnonymousClass160.FLUSH_PASSED_TO_STREAM)) {
                    writer2.flush();
                }
            }
        };
        AnonymousClass165 anonymousClass165 = this.A04;
        if (anonymousClass165 != A08) {
            r2.A01 = anonymousClass165;
        }
        return r2;
    }

    public final C16G A0B() {
        C16G c16g;
        SoftReference softReference;
        if (C15x.USE_THREAD_LOCAL_FOR_BUFFER_RECYCLING.A00(this.A00)) {
            ThreadLocal threadLocal = C16E.A01;
            Reference reference = (Reference) threadLocal.get();
            if (reference == null || (c16g = (C16G) reference.get()) == null) {
                c16g = new C16G();
                C16F c16f = C16E.A00;
                if (c16f != null) {
                    ReferenceQueue referenceQueue = c16f.A00;
                    softReference = new SoftReference(c16g, referenceQueue);
                    Map map = c16f.A01;
                    map.put(softReference, true);
                    while (true) {
                        Reference poll = referenceQueue.poll();
                        if (poll == null) {
                            break;
                        }
                        map.remove(poll);
                    }
                } else {
                    softReference = new SoftReference(c16g);
                }
                threadLocal.set(softReference);
            }
            return c16g;
        }
        return new C16G();
    }

    static {
        int i = 0;
        for (C15x c15x : C15x.values()) {
            if (c15x.A00) {
                i |= 1 << c15x.ordinal();
            }
        }
        A09 = i;
        int i2 = 0;
        for (EnumC222315z enumC222315z : EnumC222315z.values()) {
            if (enumC222315z.A01) {
                i2 |= enumC222315z.A00;
            }
        }
        A0B = i2;
        int i3 = 0;
        for (AnonymousClass160 anonymousClass160 : AnonymousClass160.values()) {
            if (anonymousClass160.A01) {
                i3 |= anonymousClass160.A00;
            }
        }
        A0A = i3;
        A08 = AnonymousClass161.A07;
    }

    public C222015v(C44T c44t) {
        long currentTimeMillis = System.currentTimeMillis();
        this.A07 = new AnonymousClass168((((int) currentTimeMillis) + ((int) (currentTimeMillis >>> 32))) | 1);
        long currentTimeMillis2 = System.currentTimeMillis();
        this.A06 = new C16B((((int) currentTimeMillis2) + ((int) (currentTimeMillis2 >>> 32))) | 1);
        this.A00 = A09;
        this.A02 = A0B;
        this.A01 = A0A;
        this.A04 = A08;
        this.A03 = c44t;
        this.A05 = '\"';
    }

    public C16L A03(String str) {
        int length = str.length();
        if (length <= 32768) {
            C16H c16h = new C16H(new C16D(true, str), A0B(), true);
            C16H.A00(c16h.A05);
            char[] A01 = c16h.A08.A01(0, length);
            c16h.A05 = A01;
            str.getChars(0, length, A01, 0);
            int i = C16I.A0E;
            return new C16I(this.A03, c16h, this.A07.A00(this.A00), A01, this.A02, length);
        }
        return A02(new StringReader(str));
    }

    public C222015v() {
        this(null);
    }
}
