package X;

/* renamed from: X.BFc, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25243BFc implements InterfaceC30898DiB {
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final float A04;
    public final float A05;

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00de, code lost:
    
        if (r2 != r1) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0088 A[LOOP:0: B:16:0x0086->B:17:0x0088, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C25243BFc(float r28, float r29, float r30, float r31) {
        /*
            Method dump skipped, instructions count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25243BFc.<init>(float, float, float, float):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x007b, code lost:
    
        if (r2 < (-8.34465E-7f)) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x007d, code lost:
    
        r18 = Float.NaN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00c8, code lost:
    
        if (r2 <= 1.0000008f) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00e5, code lost:
    
        if (r13 < (-8.34465E-7f)) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00e7, code lost:
    
        r13 = Float.NaN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00fb, code lost:
    
        if (r13 > 1.0000008f) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0151, code lost:
    
        if (r13 < (-8.34465E-7f)) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0153, code lost:
    
        r13 = Float.NaN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0171, code lost:
    
        if (r13 < (-8.34465E-7f)) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0173, code lost:
    
        r13 = Float.NaN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0193, code lost:
    
        if (r13 > 1.0000008f) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x019e, code lost:
    
        if (r13 > 1.0000008f) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01a3, code lost:
    
        if (r0 > 1.0d) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01ba, code lost:
    
        if (r13 < (-8.34465E-7f)) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01bc, code lost:
    
        r13 = Float.NaN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01d0, code lost:
    
        if (r13 > 1.0000008f) goto L87;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00c2  */
    @Override // X.InterfaceC30898DiB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float F8E(float r29) {
        /*
            Method dump skipped, instructions count: 524
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25243BFc.F8E(float):float");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C25243BFc) {
            C25243BFc c25243BFc = (C25243BFc) obj;
            if (this.A00 == c25243BFc.A00 && this.A01 == c25243BFc.A01 && this.A02 == c25243BFc.A02 && this.A03 == c25243BFc.A03) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC25226BEj.A01(AbstractC166997dE.A00(AbstractC166997dE.A00(AbstractC25235BEs.A02(this.A00), this.A01), this.A02), this.A03);
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("CubicBezierEasing(a=");
        A1C.append(this.A00);
        A1C.append(", b=");
        A1C.append(this.A01);
        A1C.append(", c=");
        A1C.append(this.A02);
        A1C.append(", d=");
        A1C.append(this.A03);
        return AbstractC167017dG.A0p(A1C);
    }
}
