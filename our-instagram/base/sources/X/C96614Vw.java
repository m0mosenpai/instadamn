package X;

import java.util.Collections;
import java.util.List;

/* renamed from: X.4Vw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C96614Vw {
    public android.net.Uri A00;
    public C96624Vx A01;
    public C96634Vy A02;
    public C96644Vz A03;
    public C4W6 A04;
    public Object A05;
    public String A06;
    public String A07;
    public String A08;
    public List A09;
    public List A0A;

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0009, code lost:
    
        if (r2.A03 != null) goto L6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [X.4W4, X.4W3] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C4W2 A00() {
        /*
            r10 = this;
            X.4Vy r2 = r10.A02
            android.net.Uri r0 = r2.A00
            if (r0 == 0) goto Lb
            java.util.UUID r1 = r2.A03
            r0 = 0
            if (r1 == 0) goto Lc
        Lb:
            r0 = 1
        Lc:
            X.C4B8.A04(r0)
            android.net.Uri r3 = r10.A00
            r4 = 0
            if (r3 == 0) goto L4f
            java.lang.String r6 = r10.A08
            java.util.UUID r0 = r2.A03
            if (r0 == 0) goto L1f
            X.5hx r4 = new X.5hx
            r4.<init>(r2)
        L1f:
            java.util.List r8 = r10.A09
            java.lang.String r7 = r10.A06
            java.util.List r9 = r10.A0A
            java.lang.Object r5 = r10.A05
            X.4W0 r2 = new X.4W0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
        L2c:
            X.4W2 r0 = X.C4W2.A07
            java.lang.String r8 = r10.A07
            if (r8 != 0) goto L34
            java.lang.String r8 = ""
        L34:
            X.4Vx r0 = r10.A01
            X.4W3 r4 = new X.4W3
            r4.<init>(r0)
            X.4Vz r0 = r10.A03
            X.4W5 r5 = new X.4W5
            r5.<init>(r0)
            X.4W6 r7 = r10.A04
            if (r7 != 0) goto L48
            X.4W6 r7 = X.C4W6.A0V
        L48:
            X.4W2 r3 = new X.4W2
            r6 = r2
            r3.<init>(r4, r5, r6, r7, r8)
            return r3
        L4f:
            r2 = r4
            goto L2c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C96614Vw.A00():X.4W2");
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, X.4Vy] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, X.4Vx] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, X.4Vz] */
    public C96614Vw(C4W2 c4w2) {
        this();
        C96634Vy c96634Vy;
        C4W4 c4w4 = c4w2.A00;
        ?? obj = new Object();
        obj.A01 = c4w4.A01;
        obj.A00 = c4w4.A00;
        obj.A03 = c4w4.A03;
        obj.A02 = c4w4.A02;
        obj.A04 = c4w4.A04;
        this.A01 = obj;
        this.A07 = c4w2.A06;
        this.A04 = c4w2.A05;
        C4W5 c4w5 = c4w2.A02;
        ?? obj2 = new Object();
        obj2.A04 = c4w5.A04;
        obj2.A03 = c4w5.A03;
        obj2.A02 = c4w5.A02;
        obj2.A01 = c4w5.A01;
        obj2.A00 = c4w5.A00;
        this.A03 = obj2;
        C4W1 c4w1 = c4w2.A03;
        if (c4w1 != null) {
            this.A06 = c4w1.A03;
            this.A08 = c4w1.A04;
            this.A00 = c4w1.A00;
            this.A09 = c4w1.A05;
            this.A0A = c4w1.A06;
            this.A05 = c4w1.A02;
            C123225hx c123225hx = c4w1.A01;
            if (c123225hx != null) {
                ?? obj3 = new Object();
                obj3.A03 = c123225hx.A05;
                obj3.A00 = c123225hx.A00;
                obj3.A02 = c123225hx.A03;
                obj3.A05 = c123225hx.A08;
                obj3.A06 = c123225hx.A09;
                obj3.A04 = c123225hx.A07;
                obj3.A01 = c123225hx.A01;
                obj3.A07 = c123225hx.A0A;
                c96634Vy = obj3;
            } else {
                c96634Vy = new C96634Vy();
            }
            this.A02 = c96634Vy;
        }
    }

    public C96614Vw() {
        this.A01 = new C96624Vx();
        this.A02 = new C96634Vy();
        this.A09 = Collections.emptyList();
        this.A0A = Collections.emptyList();
        this.A03 = new C96644Vz();
    }
}
