package X;

import com.instagram.react.modules.base.IgReactQEModule;
import java.io.InputStream;
import java.math.BigDecimal;
import java.math.BigInteger;

/* renamed from: X.46b, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C914146b extends AnonymousClass182 {
    public static final int A0E;
    public int A00;
    public C44T A01;
    public C63216SfM A03;
    public C63216SfM A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public C16Q A09;
    public Object A0A;
    public Object A0B;
    public boolean A0C;
    public boolean A0D = false;
    public int A08 = A0E;
    public AnonymousClass184 A02 = new AnonymousClass184(null, null, 0);

    @Override // X.AnonymousClass182
    public final boolean A0U() {
        return true;
    }

    @Override // X.AnonymousClass182, java.io.Flushable
    public final void flush() {
    }

    private void A01(C16L c16l, C16R c16r) {
        C16R c16r2;
        if (this.A07) {
            A00(c16l);
        }
        switch (c16r.ordinal()) {
            case 6:
                A0J(c16l.A0V());
                return;
            case 7:
                if (c16l.A0u()) {
                    A10(c16l.A1T(), c16l.A1C(), c16l.A1B());
                    return;
                } else {
                    A0u(c16l.A1P());
                    return;
                }
            case 8:
                int intValue = c16l.A0n().intValue();
                if (intValue != 0) {
                    if (intValue != 2) {
                        A0i(c16l.A0j());
                        return;
                    } else {
                        A0w(c16l.A0s());
                        return;
                    }
                }
                A0h(c16l.A0i());
                return;
            case 9:
                if (this.A0C) {
                    A0v(c16l.A0r());
                    return;
                } else {
                    A17(C16R.A0H, c16l.A0o());
                    return;
                }
            case 10:
                c16r2 = C16R.A0K;
                break;
            case 11:
                c16r2 = C16R.A0F;
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                A0b();
                return;
            default:
                StringBuilder sb = new StringBuilder();
                sb.append("Internal error: unexpected token: ");
                sb.append(c16r);
                throw new RuntimeException(sb.toString());
        }
        A16(c16r2);
    }

    @Override // X.AnonymousClass182
    public final C44T A0D() {
        return this.A01;
    }

    @Override // X.AnonymousClass182
    public final /* bridge */ /* synthetic */ AnonymousClass184 A0E() {
        return this.A02;
    }

    @Override // X.AnonymousClass182
    public final void A0G(Object obj) {
        A17(C16R.A0E, obj);
    }

    @Override // X.AnonymousClass182
    public final void A0H(Object obj) {
        this.A0A = obj;
        this.A0D = true;
    }

    @Override // X.AnonymousClass182
    public final void A0I(Object obj) {
        this.A0B = obj;
        this.A0D = true;
    }

    @Override // X.AnonymousClass182
    public final void A0J(Object obj) {
        C44T c44t;
        if (obj == null) {
            A0b();
        } else if (obj.getClass() != byte[].class && !(obj instanceof C64172T2b) && (c44t = this.A01) != null) {
            c44t.A06(this, obj);
        } else {
            A17(C16R.A0E, obj);
        }
    }

    @Override // X.AnonymousClass182
    public final void A0K(Object obj, int i) {
        this.A02.A05();
        A15(C16R.A0D);
        this.A02 = this.A02.A0A(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [X.T2b, java.lang.Object] */
    @Override // X.AnonymousClass182
    public final void A0N(String str) {
        C16R c16r = C16R.A0E;
        ?? obj = new Object();
        obj.A00 = str;
        A17(c16r, obj);
    }

    @Override // X.AnonymousClass182
    public final boolean A0V() {
        return this.A05;
    }

    @Override // X.AnonymousClass182
    public final boolean A0W() {
        return this.A06;
    }

    @Override // X.AnonymousClass182
    public final boolean A0X(AnonymousClass160 anonymousClass160) {
        if ((anonymousClass160.A00 & this.A08) == 0) {
            return false;
        }
        return true;
    }

    @Override // X.AnonymousClass182
    public final int A0Y(C912044w c912044w, InputStream inputStream, int i) {
        throw new UnsupportedOperationException();
    }

    @Override // X.AnonymousClass182
    public final void A0Z() {
        C16R c16r = C16R.A08;
        C63216SfM c63216SfM = this.A04;
        int i = this.A00;
        C63216SfM A01 = c63216SfM.A01(c16r, i);
        int i2 = 1;
        if (A01 == null) {
            i2 = i + 1;
        } else {
            this.A04 = A01;
        }
        this.A00 = i2;
        AnonymousClass184 anonymousClass184 = this.A02.A05;
        if (anonymousClass184 != null) {
            this.A02 = anonymousClass184;
        }
    }

    @Override // X.AnonymousClass182
    public final void A0a() {
        C16R c16r = C16R.A09;
        C63216SfM c63216SfM = this.A04;
        int i = this.A00;
        C63216SfM A01 = c63216SfM.A01(c16r, i);
        int i2 = 1;
        if (A01 == null) {
            i2 = i + 1;
        } else {
            this.A04 = A01;
        }
        this.A00 = i2;
        AnonymousClass184 anonymousClass184 = this.A02.A05;
        if (anonymousClass184 != null) {
            this.A02 = anonymousClass184;
        }
    }

    @Override // X.AnonymousClass182
    public final void A0b() {
        A16(C16R.A0G);
    }

    @Override // X.AnonymousClass182
    public final void A0c() {
        this.A02.A05();
        A15(C16R.A0C);
        this.A02 = this.A02.A07();
    }

    @Override // X.AnonymousClass182
    public final void A0d() {
        this.A02.A05();
        A15(C16R.A0D);
        this.A02 = this.A02.A08();
    }

    @Override // X.AnonymousClass182
    public final void A0e(char c) {
        throw new UnsupportedOperationException("Called operation not supported for TokenBuffer");
    }

    @Override // X.AnonymousClass182
    public final void A0f(double d) {
        A17(C16R.A0H, Double.valueOf(d));
    }

    @Override // X.AnonymousClass182
    public final void A0g(float f) {
        A17(C16R.A0H, Float.valueOf(f));
    }

    @Override // X.AnonymousClass182
    public final void A0h(int i) {
        A17(C16R.A0I, Integer.valueOf(i));
    }

    @Override // X.AnonymousClass182
    public final void A0i(long j) {
        A17(C16R.A0I, Long.valueOf(j));
    }

    @Override // X.AnonymousClass182
    public final void A0j(C912044w c912044w, byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        A0J(bArr2);
    }

    @Override // X.AnonymousClass182
    public final void A0l(AnonymousClass165 anonymousClass165) {
        this.A02.A06(((AnonymousClass164) anonymousClass165).A03);
        A19(anonymousClass165);
    }

    @Override // X.AnonymousClass182
    public final void A0m(AnonymousClass165 anonymousClass165) {
        throw new UnsupportedOperationException("Called operation not supported for TokenBuffer");
    }

    @Override // X.AnonymousClass182
    public final void A0n(AnonymousClass165 anonymousClass165) {
        if (anonymousClass165 == null) {
            A0b();
        } else {
            A17(C16R.A0J, anonymousClass165);
        }
    }

    @Override // X.AnonymousClass182
    public final void A0o(Object obj) {
        this.A02.A05();
        A15(C16R.A0C);
        this.A02 = this.A02.A09(obj);
    }

    @Override // X.AnonymousClass182
    public final void A0p(Object obj) {
        this.A02.A05();
        A15(C16R.A0D);
        this.A02 = this.A02.A0A(obj);
    }

    @Override // X.AnonymousClass182
    public final void A0q(Object obj, int i) {
        this.A02.A05();
        A15(C16R.A0C);
        this.A02 = this.A02.A09(obj);
    }

    @Override // X.AnonymousClass182
    public final void A0r(String str) {
        this.A02.A06(str);
        A19(str);
    }

    @Override // X.AnonymousClass182
    public final void A0s(String str) {
        A17(C16R.A0H, str);
    }

    @Override // X.AnonymousClass182
    public final void A0t(String str) {
        throw new UnsupportedOperationException("Called operation not supported for TokenBuffer");
    }

    @Override // X.AnonymousClass182
    public final void A0u(String str) {
        if (str == null) {
            A0b();
        } else {
            A17(C16R.A0J, str);
        }
    }

    @Override // X.AnonymousClass182
    public final void A0v(BigDecimal bigDecimal) {
        if (bigDecimal == null) {
            A0b();
        } else {
            A17(C16R.A0H, bigDecimal);
        }
    }

    @Override // X.AnonymousClass182
    public final void A0w(BigInteger bigInteger) {
        if (bigInteger == null) {
            A0b();
        } else {
            A17(C16R.A0I, bigInteger);
        }
    }

    @Override // X.AnonymousClass182
    public final void A0x(short s) {
        A17(C16R.A0I, Short.valueOf(s));
    }

    @Override // X.AnonymousClass182
    public final void A0y(boolean z) {
        C16R c16r;
        if (z) {
            c16r = C16R.A0K;
        } else {
            c16r = C16R.A0F;
        }
        A16(c16r);
    }

    @Override // X.AnonymousClass182
    public final void A0z(char[] cArr, int i, int i2) {
        throw new UnsupportedOperationException("Called operation not supported for TokenBuffer");
    }

    @Override // X.AnonymousClass182
    public final void A10(char[] cArr, int i, int i2) {
        A0u(new String(cArr, i, i2));
    }

    public final C60570R8k A11(C16L c16l) {
        BigDecimal bigDecimal = C16K.A01;
        C63216SfM c63216SfM = this.A03;
        C60570R8k c60570R8k = new C60570R8k(this.A09, c16l.A1K(), c63216SfM, this.A06, this.A05);
        c60570R8k.A01 = c16l.A1I();
        return c60570R8k;
    }

    public final C60570R8k A12(C44T c44t) {
        return new C60570R8k(this.A09, c44t, this.A03, this.A06, this.A05);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001e, code lost:
    
        if (r2.A02 == null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000b, code lost:
    
        if (r2.A02 == null) goto L6;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:35:0x0060. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A13(X.AnonymousClass182 r10) {
        /*
            Method dump skipped, instructions count: 408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C914146b.A13(X.182):void");
    }

    public final void A15(C16R c16r) {
        C63216SfM A01;
        boolean z = this.A0D;
        C63216SfM c63216SfM = this.A04;
        int i = this.A00;
        if (z) {
            A01 = c63216SfM.A03(c16r, this.A0A, this.A0B, i);
        } else {
            A01 = c63216SfM.A01(c16r, i);
        }
        int i2 = 1;
        if (A01 == null) {
            i2 = this.A00 + 1;
        } else {
            this.A04 = A01;
        }
        this.A00 = i2;
    }

    public final void A16(C16R c16r) {
        C63216SfM A01;
        this.A02.A05();
        boolean z = this.A0D;
        C63216SfM c63216SfM = this.A04;
        int i = this.A00;
        if (z) {
            A01 = c63216SfM.A03(c16r, this.A0A, this.A0B, i);
        } else {
            A01 = c63216SfM.A01(c16r, i);
        }
        int i2 = 1;
        if (A01 == null) {
            i2 = this.A00 + 1;
        } else {
            this.A04 = A01;
        }
        this.A00 = i2;
    }

    public final void A17(C16R c16r, Object obj) {
        C63216SfM A02;
        this.A02.A05();
        boolean z = this.A0D;
        C63216SfM c63216SfM = this.A04;
        if (z) {
            A02 = c63216SfM.A04(c16r, obj, this.A0A, this.A0B, this.A00);
        } else {
            A02 = c63216SfM.A02(c16r, obj, this.A00);
        }
        int i = 1;
        if (A02 == null) {
            i = this.A00 + 1;
        } else {
            this.A04 = A02;
        }
        this.A00 = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0013, code lost:
    
        if (r1 != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A18(X.C914146b r3) {
        /*
            r2 = this;
            boolean r0 = r2.A06
            if (r0 != 0) goto L8
            boolean r0 = r3.A06
            r2.A06 = r0
        L8:
            boolean r1 = r2.A05
            if (r1 != 0) goto L10
            boolean r1 = r3.A05
            r2.A05 = r1
        L10:
            if (r0 != 0) goto L15
            r0 = 0
            if (r1 == 0) goto L16
        L15:
            r0 = 1
        L16:
            r2.A07 = r0
            X.44T r0 = r3.A01
            X.R8k r1 = r3.A12(r0)
        L1e:
            X.16R r0 = r1.A1J()
            if (r0 == 0) goto L28
            r2.A14(r1)
            goto L1e
        L28:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C914146b.A18(X.46b):void");
    }

    public final void A19(Object obj) {
        C63216SfM A02;
        if (this.A0D) {
            A02 = this.A04.A04(C16R.A0A, obj, this.A0A, this.A0B, this.A00);
        } else {
            A02 = this.A04.A02(C16R.A0A, obj, this.A00);
        }
        int i = 1;
        if (A02 == null) {
            i = this.A00 + 1;
        } else {
            this.A04 = A02;
        }
        this.A00 = i;
    }

    @Override // X.AnonymousClass182, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0018, code lost:
    
        if (r9.A05 != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            r9 = this;
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "[TokenBuffer: "
            r2.append(r0)
            X.44T r0 = r9.A01
            X.R8k r8 = r9.A12(r0)
            boolean r0 = r9.A06
            r3 = 0
            if (r0 != 0) goto L1a
            boolean r0 = r9.A05
            r7 = 0
            if (r0 == 0) goto L1b
        L1a:
            r7 = 1
        L1b:
            X.16R r4 = r8.A1J()     // Catch: java.io.IOException -> Lb8
            r5 = 100
            if (r4 != 0) goto L24
            goto L9e
        L24:
            if (r7 == 0) goto L75
            X.SfM r1 = r9.A04     // Catch: java.io.IOException -> Lb8
            int r0 = r9.A00     // Catch: java.io.IOException -> Lb8
            int r0 = r0 + (-1)
            java.util.TreeMap r1 = r1.A02     // Catch: java.io.IOException -> Lb8
            if (r1 != 0) goto L31
            goto L3d
        L31:
            int r0 = r0 + r0
            int r0 = r0 + 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.io.IOException -> Lb8
            java.lang.Object r1 = r1.get(r0)     // Catch: java.io.IOException -> Lb8
            goto L3e
        L3d:
            r1 = 0
        L3e:
            r6 = 93
            if (r1 == 0) goto L51
            java.lang.String r0 = "[objectId="
            r2.append(r0)     // Catch: java.io.IOException -> Lb8
            java.lang.String r0 = java.lang.String.valueOf(r1)     // Catch: java.io.IOException -> Lb8
            r2.append(r0)     // Catch: java.io.IOException -> Lb8
            r2.append(r6)     // Catch: java.io.IOException -> Lb8
        L51:
            X.SfM r1 = r9.A04     // Catch: java.io.IOException -> Lb8
            int r0 = r9.A00     // Catch: java.io.IOException -> Lb8
            int r0 = r0 + (-1)
            java.util.TreeMap r1 = r1.A02     // Catch: java.io.IOException -> Lb8
            if (r1 == 0) goto L75
            int r0 = r0 + r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.io.IOException -> Lb8
            java.lang.Object r1 = r1.get(r0)     // Catch: java.io.IOException -> Lb8
            if (r1 == 0) goto L75
            java.lang.String r0 = "[typeId="
            r2.append(r0)     // Catch: java.io.IOException -> Lb8
            java.lang.String r0 = java.lang.String.valueOf(r1)     // Catch: java.io.IOException -> Lb8
            r2.append(r0)     // Catch: java.io.IOException -> Lb8
            r2.append(r6)     // Catch: java.io.IOException -> Lb8
        L75:
            if (r3 >= r5) goto L9a
            if (r3 <= 0) goto L7e
            java.lang.String r0 = ", "
            r2.append(r0)     // Catch: java.io.IOException -> Lb8
        L7e:
            java.lang.String r0 = r4.toString()     // Catch: java.io.IOException -> Lb8
            r2.append(r0)     // Catch: java.io.IOException -> Lb8
            X.16R r0 = X.C16R.A0A     // Catch: java.io.IOException -> Lb8
            if (r4 != r0) goto L9a
            r0 = 40
            r2.append(r0)     // Catch: java.io.IOException -> Lb8
            java.lang.String r0 = r8.A0Y()     // Catch: java.io.IOException -> Lb8
            r2.append(r0)     // Catch: java.io.IOException -> Lb8
            r0 = 41
            r2.append(r0)     // Catch: java.io.IOException -> Lb8
        L9a:
            int r3 = r3 + 1
            goto L1b
        L9e:
            if (r3 < r5) goto Lae
            java.lang.String r0 = " ... (truncated "
            r2.append(r0)
            int r3 = r3 - r5
            r2.append(r3)
            java.lang.String r0 = " entries)"
            r2.append(r0)
        Lae:
            r0 = 93
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            return r0
        Lb8:
            r1 = move-exception
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C914146b.toString():java.lang.String");
    }

    static {
        int i = 0;
        for (AnonymousClass160 anonymousClass160 : AnonymousClass160.values()) {
            if (anonymousClass160.A01) {
                i |= anonymousClass160.A00;
            }
        }
        A0E = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0038, code lost:
    
        if (r1 != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C914146b(X.C16L r4, X.AnonymousClass469 r5) {
        /*
            r3 = this;
            r3.<init>()
            r2 = 0
            r3.A0D = r2
            X.44T r0 = r4.A1K()
            r3.A01 = r0
            X.16Q r0 = r4.A0m()
            r3.A09 = r0
            int r0 = X.C914146b.A0E
            r3.A08 = r0
            r1 = 0
            X.184 r0 = new X.184
            r0.<init>(r1, r1, r2)
            r3.A02 = r0
            X.SfM r0 = new X.SfM
            r0.<init>()
            r3.A04 = r0
            r3.A03 = r0
            r3.A00 = r2
            boolean r0 = r4.A0b()
            r3.A06 = r0
            boolean r1 = r4.A0a()
            r3.A05 = r1
            if (r0 != 0) goto L3a
            r0 = 0
            if (r1 == 0) goto L3b
        L3a:
            r0 = 1
        L3b:
            r3.A07 = r0
            if (r5 == 0) goto L45
            X.45i r0 = X.EnumC912945i.A0O
            boolean r2 = r5.A0j(r0)
        L45:
            r3.A0C = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C914146b.<init>(X.16L, X.469):void");
    }

    private final void A00(C16L c16l) {
        Object A0X = c16l.A0X();
        this.A0B = A0X;
        if (A0X != null) {
            this.A0D = true;
        }
        Object A0W = c16l.A0W();
        this.A0A = A0W;
        if (A0W != null) {
            this.A0D = true;
        }
    }

    @Override // X.AnonymousClass182
    public final AnonymousClass182 A0C(AnonymousClass160 anonymousClass160) {
        throw C00O.createAndThrow();
    }

    public final void A14(C16L c16l) {
        C16R A10 = c16l.A10();
        if (A10 == C16R.A0A) {
            if (this.A07) {
                A00(c16l);
            }
            A0r(c16l.A0Y());
            A10 = c16l.A1J();
        } else if (A10 == null) {
            throw new IllegalStateException("No token available from argument `JsonParser`");
        }
        int ordinal = A10.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        A01(c16l, A10);
                        return;
                    } else {
                        A0Z();
                        return;
                    }
                }
                if (this.A07) {
                    A00(c16l);
                }
                A0c();
            } else {
                A0a();
                return;
            }
        } else {
            if (this.A07) {
                A00(c16l);
            }
            A0d();
        }
        int i = 1;
        while (true) {
            C16R A1J = c16l.A1J();
            if (A1J == null) {
                return;
            }
            int ordinal2 = A1J.ordinal();
            if (ordinal2 != 1) {
                if (ordinal2 != 2) {
                    if (ordinal2 != 3) {
                        if (ordinal2 != 4) {
                            if (ordinal2 != 5) {
                                A01(c16l, A1J);
                            } else {
                                if (this.A07) {
                                    A00(c16l);
                                }
                                A0r(c16l.A0Y());
                            }
                        } else {
                            A0Z();
                        }
                    } else {
                        if (this.A07) {
                            A00(c16l);
                        }
                        A0c();
                    }
                } else {
                    A0a();
                }
                i--;
                if (i == 0) {
                    return;
                }
            } else {
                if (this.A07) {
                    A00(c16l);
                }
                A0d();
            }
            i++;
        }
    }
}
