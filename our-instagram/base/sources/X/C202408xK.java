package X;

import android.graphics.Canvas;
import com.instagram.shopping.model.share.ShopShareInfo;

/* renamed from: X.8xK, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C202408xK extends AbstractC202418xL implements InterfaceC202428xM {
    public final int A00;
    public final ShopShareInfo A01;
    public final C6RB A02;
    public final String A03;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C202408xK(android.content.Context r12, com.instagram.shopping.model.share.ShopShareInfo r13, float r14, int r15, int r16) {
        /*
            r11 = this;
            r0 = 1
            java.lang.String r6 = r13.A04
            com.instagram.common.typedurl.ImageUrl r5 = r13.A00
            java.util.List r7 = r13.A07
            if (r7 == 0) goto L65
            r3 = r11
            r4 = r12
            r8 = r14
            r9 = r15
            r10 = r16
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            r11.A01 = r13
            float r0 = X.AbstractC13880nE.A04(r12, r0)
            int r0 = java.lang.Math.round(r0)
            r11.A00 = r0
            java.lang.String r0 = "storefront_reshare_sticker"
            r11.A03 = r0
            float r1 = r11.A06
            int r0 = r11.A03
            int r0 = r0 * 2
            float r0 = (float) r0
            float r1 = r1 - r0
            float r0 = r11.A01
            float r1 = r1 - r0
            int r0 = r11.A0A
            float r0 = (float) r0
            float r1 = r1 - r0
            int r0 = (int) r1
            X.6RB r2 = new X.6RB
            r2.<init>(r12, r0)
            r11.A02 = r2
            com.instagram.shopping.model.share.ShopShareInfo r0 = r11.A01
            java.lang.String r0 = r0.A02
            int r0 = r0.length()
            if (r0 == 0) goto L64
            r0 = 14
            float r0 = X.AbstractC13880nE.A04(r12, r0)
            r2.A0A(r0)
            android.graphics.Typeface r1 = android.graphics.Typeface.SANS_SERIF
            r0 = 0
            r2.A0J(r1, r0)
            int r0 = r11.A0S
            r2.A0F(r0)
            android.text.Layout$Alignment r0 = android.text.Layout.Alignment.ALIGN_NORMAL
            r2.A0K(r0)
            r0 = 1
            r2.A0O = r0
            java.lang.String r0 = r13.A02
            r2.A0M(r0)
        L64:
            return
        L65:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C202408xK.<init>(android.content.Context, com.instagram.shopping.model.share.ShopShareInfo, float, int, int):void");
    }

    @Override // X.AbstractC202418xL
    public final void A00(Canvas canvas) {
        int i;
        float f;
        float f2;
        if (this.A01.A02.length() == 0) {
            super.A00(canvas);
            return;
        }
        float f3 = this.A00;
        float f4 = -f3;
        boolean z = this.A0L;
        if (z) {
            i = this.A0A;
            f = (-i) - this.A0W.A0A;
        } else {
            float f5 = this.A07;
            i = this.A0A;
            f = f5 + i;
        }
        canvas.translate(f, f4);
        this.A0W.draw(canvas);
        canvas.restore();
        float f6 = this.A07;
        C6RB c6rb = this.A02;
        float f7 = (f3 + f6) - c6rb.A06;
        if (z) {
            f2 = (-i) - c6rb.A0A;
        } else {
            f2 = f6 + i;
        }
        canvas.translate(f2, f7);
        c6rb.draw(canvas);
        canvas.restore();
    }

    @Override // X.InterfaceC133125ze
    public final String C5K() {
        return this.A03;
    }
}
