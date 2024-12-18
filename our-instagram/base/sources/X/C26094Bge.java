package X;

import java.util.Arrays;

/* renamed from: X.Bge, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26094Bge extends C0T6 implements InterfaceC30925Dic {
    public final float A00;
    public final float A01;
    public final float A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final C66248U5s A06;
    public final InterfaceC30789DgQ A07;
    public final float[] A08;
    public final InterfaceC30790DgR A09;

    public C26094Bge(C66248U5s c66248U5s, InterfaceC30789DgQ interfaceC30789DgQ, InterfaceC30790DgR interfaceC30790DgR, float[] fArr, float f, float f2, float f3, int i, int i2, int i3) {
        C14360o3.A0B(interfaceC30790DgR, 1);
        this.A09 = interfaceC30790DgR;
        this.A07 = interfaceC30789DgQ;
        this.A03 = i;
        this.A06 = c66248U5s;
        this.A01 = f;
        this.A04 = i2;
        this.A05 = i3;
        this.A02 = f2;
        this.A08 = fArr;
        this.A00 = f3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0075, code lost:
    
        if (r5 == r4) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0087, code lost:
    
        if (r5 == r4) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00d9, code lost:
    
        if (r4 == r1) goto L75;
     */
    @Override // X.InterfaceC30925Dic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void AQT(android.graphics.Canvas r9, X.C28225CcV r10) {
        /*
            Method dump skipped, instructions count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26094Bge.AQT(android.graphics.Canvas, X.CcV):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0067, code lost:
    
        if (java.util.Arrays.equals(r1, r0) != false) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r3 = 1
            if (r4 == r5) goto L78
            java.lang.Class r1 = r4.getClass()
            if (r5 == 0) goto L76
            java.lang.Class r0 = r5.getClass()
        Ld:
            boolean r0 = X.C14360o3.A0K(r1, r0)
            r2 = 0
            if (r0 == 0) goto L69
            java.lang.String r0 = "null cannot be cast to non-null type com.facebook.primitive.canvas.model.CanvasStroke"
            X.C14360o3.A0C(r5, r0)
            X.Bge r5 = (X.C26094Bge) r5
            X.DgR r1 = r4.A09
            X.DgR r0 = r5.A09
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L69
            X.DgQ r1 = r4.A07
            X.DgQ r0 = r5.A07
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L69
            int r1 = r4.A03
            int r0 = r5.A03
            if (r1 != r0) goto L69
            X.U5s r1 = r4.A06
            X.U5s r0 = r5.A06
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L69
            float r1 = r4.A01
            float r0 = r5.A01
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L69
            int r1 = r4.A04
            int r0 = r5.A04
            if (r1 != r0) goto L69
            int r1 = r4.A05
            int r0 = r5.A05
            if (r1 != r0) goto L69
            float r1 = r4.A02
            float r0 = r5.A02
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L69
            float[] r1 = r4.A08
            float[] r0 = r5.A08
            if (r1 == 0) goto L6a
            if (r0 == 0) goto L69
            boolean r0 = java.util.Arrays.equals(r1, r0)
            if (r0 != 0) goto L6d
        L69:
            return r2
        L6a:
            if (r0 == 0) goto L6d
            return r2
        L6d:
            float r1 = r4.A00
            float r0 = r5.A00
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L69
            return r3
        L76:
            r0 = 0
            goto Ld
        L78:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26094Bge.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i = 0;
        int A00 = AbstractC166997dE.A00((((AbstractC166997dE.A00((((AbstractC166997dE.A0J(this.A07, AbstractC166987dD.A0G(this.A09)) + this.A03) * 31) + AbstractC25235BEs.A06(this.A06)) * 31, this.A01) + this.A04) * 31) + this.A05) * 31, this.A02);
        float[] fArr = this.A08;
        if (fArr != null) {
            i = Arrays.hashCode(fArr);
        }
        return AbstractC25226BEj.A01((A00 + i) * 31, this.A00);
    }
}
