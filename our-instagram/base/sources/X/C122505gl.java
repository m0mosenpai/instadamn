package X;

/* renamed from: X.5gl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C122505gl {
    public int A00;
    public int A01;
    public int A02;
    public CUK A05;
    public InterfaceC122825hI A06;
    public InterfaceC122595gu A07;
    public C118125Vw A08;
    public C5DD A09;
    public InterfaceC1128957x A0A;
    public AnonymousClass583 A0B;
    public String A0C;
    public boolean A0D;
    public boolean A0E;
    public long A0H = AbstractC122515gm.A00;
    public long A03 = 0 << 32;
    public long A04 = C5AU.A05(0, 0, 0, 0);
    public int A0G = -1;
    public int A0F = -1;

    public static final void A02(C122505gl c122505gl) {
        c122505gl.A06 = null;
        c122505gl.A07 = null;
        c122505gl.A0B = null;
        c122505gl.A0G = -1;
        c122505gl.A0F = -1;
        c122505gl.A04 = C5AU.A05(0, 0, 0, 0);
        c122505gl.A03 = 0 << 32;
        c122505gl.A0D = false;
    }

    public static final InterfaceC122595gu A01(C122505gl c122505gl, AnonymousClass583 anonymousClass583) {
        InterfaceC122595gu interfaceC122595gu = c122505gl.A07;
        if (interfaceC122595gu == null || anonymousClass583 != c122505gl.A0B || interfaceC122595gu.BCg()) {
            c122505gl.A0B = anonymousClass583;
            String str = c122505gl.A0C;
            C118125Vw A00 = AbstractC122525gn.A00(c122505gl.A08, anonymousClass583);
            InterfaceC1128957x interfaceC1128957x = c122505gl.A0A;
            C14360o3.A0A(interfaceC1128957x);
            C5DD c5dd = c122505gl.A09;
            C16930sl c16930sl = C16930sl.A00;
            interfaceC122595gu = new C122585gt(A00, c5dd, interfaceC1128957x, str, c16930sl, c16930sl);
        }
        c122505gl.A07 = interfaceC122595gu;
        return interfaceC122595gu;
    }

    public final int A03(AnonymousClass583 anonymousClass583, int i) {
        int i2 = this.A0G;
        int i3 = this.A0F;
        if (i == i2 && i2 != -1) {
            return i3;
        }
        int A00 = AbstractC122805hG.A00(A00(this, anonymousClass583, C5AU.A04(0, i, 0, Integer.MAX_VALUE)).BDQ());
        this.A0G = i;
        this.A0F = A00;
        return A00;
    }

    public final void A04(InterfaceC1128957x interfaceC1128957x) {
        long j;
        InterfaceC1128957x interfaceC1128957x2 = this.A0A;
        if (interfaceC1128957x != null) {
            long j2 = AbstractC122515gm.A00;
            float Awk = interfaceC1128957x.Awk();
            float B7e = interfaceC1128957x.B7e();
            j = (Float.floatToRawIntBits(B7e) & 4294967295L) | (Float.floatToRawIntBits(Awk) << 32);
        } else {
            j = AbstractC122515gm.A00;
        }
        if (interfaceC1128957x2 == null) {
            this.A0A = interfaceC1128957x;
            this.A0H = j;
        } else {
            if (interfaceC1128957x != null && this.A0H == j) {
                return;
            }
            this.A0A = interfaceC1128957x;
            this.A0H = j;
            A02(this);
        }
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("ParagraphLayoutCache(paragraph=");
        if (this.A06 != null) {
            str = "<paragraph>";
        } else {
            str = "null";
        }
        sb.append(str);
        sb.append(", lastDensity=");
        long j = this.A0H;
        long j2 = AbstractC122515gm.A00;
        sb.append((Object) AnonymousClass001.A0U("InlineDensity(density=", ", fontScale=", ')', Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L))));
        sb.append(')');
        return sb.toString();
    }

    public C122505gl(C118125Vw c118125Vw, C5DD c5dd, String str, int i, int i2, int i3, boolean z) {
        this.A0C = str;
        this.A08 = c118125Vw;
        this.A09 = c5dd;
        this.A02 = i;
        this.A0E = z;
        this.A00 = i2;
        this.A01 = i3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002b, code lost:
    
        if (r2 == 2) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C122815hH A00(X.C122505gl r4, X.AnonymousClass583 r5, long r6) {
        /*
            X.5gu r3 = A01(r4, r5)
            boolean r2 = r4.A0E
            int r1 = r4.A02
            float r0 = r3.BPq()
            long r5 = X.AbstractC122795hF.A00(r0, r1, r6, r2)
            boolean r0 = r4.A0E
            int r2 = r4.A02
            int r1 = r4.A00
            r4 = 1
            if (r0 != 0) goto L25
            r0 = 2
            if (r2 != r0) goto L25
        L1c:
            r7 = 1
        L1d:
            X.5gt r3 = (X.C122585gt) r3
            X.5hH r2 = new X.5hH
            r2.<init>(r3, r4, r5, r7)
            return r2
        L25:
            if (r1 >= r4) goto L28
            r1 = 1
        L28:
            r4 = r1
            r0 = 2
            r7 = 0
            if (r2 != r0) goto L1d
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C122505gl.A00(X.5gl, X.583, long):X.5hH");
    }
}
