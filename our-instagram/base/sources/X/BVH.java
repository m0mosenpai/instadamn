package X;

import android.graphics.drawable.Drawable;

/* loaded from: classes5.dex */
public final class BVH extends C0YY implements InterfaceC16660sJ {
    public final /* synthetic */ float A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ Drawable A02;
    public final /* synthetic */ C2XI A03;
    public final /* synthetic */ C77123cy A04;
    public final /* synthetic */ C51762Yz A05;
    public final /* synthetic */ BVJ A06;
    public final /* synthetic */ boolean A07;
    public final /* synthetic */ boolean A08;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BVH(Drawable drawable, C2XI c2xi, C77123cy c77123cy, C51762Yz c51762Yz, BVJ bvj, float f, int i, boolean z, boolean z2) {
        super(1);
        this.A06 = bvj;
        this.A03 = c2xi;
        this.A01 = i;
        this.A00 = f;
        this.A05 = c51762Yz;
        this.A07 = z;
        this.A08 = z2;
        this.A04 = c77123cy;
        this.A02 = drawable;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0022, code lost:
    
        if (r9.A07 == false) goto L12;
     */
    @Override // X.InterfaceC16660sJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r10) {
        /*
            r9 = this;
            X.BVJ r2 = r9.A06
            android.view.animation.OvershootInterpolator r0 = X.BVJ.A0w
            boolean r0 = r2.A0A
            if (r0 == 0) goto L4b
            X.2XI r1 = r9.A03
            int r4 = r9.A01
            float r3 = r9.A00
            boolean r0 = r2.A0I
            r8 = 1
            if (r0 == 0) goto L24
            X.BVO r0 = r2.A04
            if (r0 == 0) goto L24
            X.2Yz r0 = r9.A05
            boolean r0 = X.AbstractC25229BEm.A1W(r0)
            if (r0 == 0) goto L24
            boolean r0 = r9.A07
            r7 = 1
            if (r0 != 0) goto L25
        L24:
            r7 = 0
        L25:
            boolean r0 = r9.A08
            if (r0 != 0) goto L3d
            boolean r0 = r2.A0G
            if (r0 == 0) goto L49
            X.BVO r0 = r2.A04
            if (r0 == 0) goto L49
            X.2Yz r0 = r9.A05
            boolean r0 = X.AbstractC25229BEm.A1W(r0)
            if (r0 == 0) goto L49
            boolean r0 = r9.A07
            if (r0 == 0) goto L49
        L3d:
            r5 = 0
            r6 = r5
            android.graphics.drawable.LayerDrawable r0 = X.BVJ.A03(r3, r4, r5, r6, r7, r8)
        L43:
            r1.A00(r0)
            X.0eB r0 = X.C0eB.A00
            return r0
        L49:
            r8 = 0
            goto L3d
        L4b:
            X.3cy r0 = r9.A04
            X.AbstractC25233BEq.A1C(r0)
            X.2XI r1 = r9.A03
            android.graphics.drawable.Drawable r0 = r9.A02
            goto L43
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BVH.invoke(java.lang.Object):java.lang.Object");
    }
}
