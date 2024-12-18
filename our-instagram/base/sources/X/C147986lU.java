package X;

import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;

/* renamed from: X.6lU, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C147986lU extends C3Vd {
    public float A00;
    public float A01;
    public int A02;
    public int A03;
    public final float A04;

    /* JADX WARN: Removed duplicated region for block: B:23:0x0083  */
    @Override // X.C3Vd, X.InterfaceC74243Ve
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void E4r(android.view.View r11, com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager r12, float r13, int r14) {
        /*
            r10 = this;
            r0 = 0
            X.C14360o3.A0B(r12, r0)
            r0 = 1
            X.C14360o3.A0B(r11, r0)
            double r0 = (double) r13
            r2 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            r4 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r6 = -4587338432941916160(0xc056800000000000, double:-90.0)
            r8 = 4636033603912859648(0x4056800000000000, double:90.0)
            double r0 = X.AbstractC70163Da.A04(r0, r2, r4, r6, r8)
            float r4 = (float) r0
            float r0 = r11.getCameraDistance()
            float r1 = r10.A04
            r5 = 1
            r2 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L2b
            r11.setCameraDistance(r1)
        L2b:
            int r0 = r10.A03
            if (r0 == 0) goto L33
            int r0 = r10.A02
            if (r0 != 0) goto L49
        L33:
            int r0 = r12.getWidth()
            r10.A03 = r0
            float r0 = (float) r0
            r1 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 / r1
            r10.A01 = r0
            int r0 = r12.getHeight()
            r10.A02 = r0
            float r0 = (float) r0
            float r0 = r0 / r1
            r10.A00 = r0
        L49:
            float r0 = java.lang.Math.abs(r13)
            r3 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 >= 0) goto Lbc
            int r0 = r10.A03
            float r0 = (float) r0
            float r0 = r0 * r13
            r11.setTranslationX(r0)
        L5a:
            r1 = 0
            int r0 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r0 <= 0) goto L88
            int r0 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r0 >= 0) goto L88
            r11.setRotationY(r4)
            r11.setPivotX(r1)
        L69:
            float r0 = r11.getPivotY()
            float r1 = r10.A00
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L76
            r11.setPivotY(r1)
        L76:
            r1 = 2
            int r0 = r11.getLayerType()
            if (r0 == r1) goto L81
            r0 = 0
            r11.setLayerType(r1, r0)
        L81:
            if (r5 != 0) goto L84
            r2 = 4
        L84:
            r11.setVisibility(r2)
            return
        L88:
            int r0 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r0 >= 0) goto L9c
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r0 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r0 <= 0) goto L9c
            r11.setRotationY(r4)
            int r0 = r10.A03
            float r0 = (float) r0
            r11.setPivotX(r0)
            goto L69
        L9c:
            r11.setRotationY(r1)
            float r0 = r10.A01
            r11.setPivotX(r0)
            float r0 = r11.getPivotY()
            float r1 = r10.A00
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto Lb1
            r11.setPivotY(r1)
        Lb1:
            int r0 = r11.getLayerType()
            if (r0 == r2) goto L81
            r0 = 0
            r11.setLayerType(r2, r0)
            goto L81
        Lbc:
            r5 = 0
            goto L5a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C147986lU.E4r(android.view.View, com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager, float, int):void");
    }

    @Override // X.C3Vd, X.InterfaceC74243Ve
    public final boolean F83(ReboundViewPager reboundViewPager, float f, float f2) {
        return true;
    }

    public C147986lU(float f) {
        this.A04 = f;
    }
}
