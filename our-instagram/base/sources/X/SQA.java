package X;

/* loaded from: classes10.dex */
public final class SQA {
    public final C913945y A00;
    public final SQA A01;
    public final Object A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0010, code lost:
    
        if (r0 == null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.SQA A00() {
        /*
            r4 = this;
            X.SQA r0 = r4.A01
            if (r0 != 0) goto L5
            return r4
        L5:
            X.SQA r3 = r0.A00()
            X.45y r1 = r4.A00
            r2 = 0
            X.45y r0 = r3.A00
            if (r1 == 0) goto L17
            if (r0 != 0) goto L22
        L12:
            X.SQA r3 = r4.A05(r2)
        L16:
            return r3
        L17:
            if (r0 != 0) goto L16
            boolean r1 = r4.A05
            boolean r0 = r3.A05
            if (r1 == r0) goto L22
            if (r1 == 0) goto L16
            goto L12
        L22:
            X.SQA r3 = r4.A05(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SQA.A00():X.SQA");
    }

    public final SQA A01() {
        SQA A01;
        boolean z = this.A03;
        SQA sqa = this.A01;
        if (z) {
            if (sqa == null) {
                return null;
            }
            return sqa.A01();
        }
        if (sqa != null && (A01 = sqa.A01()) != sqa) {
            return A05(A01);
        }
        return this;
    }

    public final SQA A02() {
        if (this.A01 == null) {
            return this;
        }
        return new SQA(this.A00, null, this.A02, this.A04, this.A05, this.A03);
    }

    public final SQA A03() {
        SQA A03;
        SQA sqa = this.A01;
        if (sqa == null) {
            A03 = null;
        } else {
            A03 = sqa.A03();
        }
        if (this.A05) {
            return A05(A03);
        }
        return A03;
    }

    public final SQA A04(SQA sqa) {
        SQA sqa2 = this.A01;
        if (sqa2 != null) {
            sqa = sqa2.A04(sqa);
        }
        return A05(sqa);
    }

    public final SQA A05(SQA sqa) {
        if (sqa == this.A01) {
            return this;
        }
        return new SQA(this.A00, sqa, this.A02, this.A04, this.A05, this.A03);
    }

    public final String toString() {
        String format = String.format("%s[visible=%b,ignore=%b,explicitName=%b]", this.A02.toString(), Boolean.valueOf(this.A05), Boolean.valueOf(this.A03), Boolean.valueOf(this.A04));
        SQA sqa = this.A01;
        if (sqa != null) {
            return AnonymousClass001.A0g(format, ", ", sqa.toString());
        }
        return format;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000e, code lost:
    
        if (r3.A02() != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public SQA(X.C913945y r3, X.SQA r4, java.lang.Object r5, boolean r6, boolean r7, boolean r8) {
        /*
            r2 = this;
            r2.<init>()
            r2.A02 = r5
            r2.A01 = r4
            if (r3 == 0) goto L10
            boolean r1 = r3.A02()
            r0 = r3
            if (r1 == 0) goto L11
        L10:
            r0 = 0
        L11:
            r2.A00 = r0
            if (r6 == 0) goto L22
            if (r0 == 0) goto L29
            java.lang.String r0 = r3.A02
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 != 0) goto L22
            r6 = 0
        L22:
            r2.A04 = r6
            r2.A05 = r7
            r2.A03 = r8
            return
        L29:
            java.lang.String r0 = "Cannot pass true for 'explName' if name is null/empty"
            java.lang.IllegalArgumentException r0 = X.AbstractC166987dD.A12(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SQA.<init>(X.45y, X.SQA, java.lang.Object, boolean, boolean, boolean):void");
    }
}
