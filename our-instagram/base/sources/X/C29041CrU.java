package X;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* renamed from: X.CrU, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29041CrU implements C2YT {
    public final Drawable A00;
    public final ImageView.ScaleType A01;
    public final boolean A02;

    public C29041CrU(Drawable drawable, ImageView.ScaleType scaleType, boolean z) {
        C14360o3.A0B(scaleType, 2);
        this.A00 = drawable;
        this.A01 = scaleType;
        this.A02 = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0084, code lost:
    
        if (r13 > 0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0027, code lost:
    
        if (r3.getIntrinsicHeight() > 0) goto L13;
     */
    @Override // X.C2YT
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C2YU Cgz(X.C2YR r17, long r18) {
        /*
            r16 = this;
            r4 = 0
            r0 = r17
            X.C14360o3.A0B(r0, r4)
            X.3fb r10 = X.AbstractC78683fa.A01
            r14 = r18
            long r0 = X.AbstractC78873ft.A01(r14)
            r5 = r16
            android.graphics.drawable.Drawable r3 = r5.A00
            r2 = 0
            if (r3 == 0) goto L29
            long r7 = X.AbstractC78683fa.A00
            int r6 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            r7 = 0
            if (r6 != 0) goto L38
            r7 = 1
            int r6 = r3.getIntrinsicWidth()
            if (r6 <= 0) goto L29
            int r6 = r3.getIntrinsicHeight()
            if (r6 > 0) goto L38
        L29:
            long r0 = X.AbstractC25230BEn.A0G()
            X.CRD r3 = new X.CRD
            r3.<init>(r2, r4, r4)
        L32:
            X.2YU r2 = new X.2YU
            r2.<init>(r0, r3)
            return r2
        L38:
            int r12 = r3.getIntrinsicWidth()
            int r13 = r3.getIntrinsicHeight()
            if (r7 == 0) goto L52
            boolean r0 = X.C78613fT.A06(r14)
            if (r0 != 0) goto L93
            boolean r0 = X.C78613fT.A05(r14)
            if (r0 != 0) goto L93
            long r0 = X.AbstractC78673fZ.A00(r12, r13)
        L52:
            int r6 = X.AbstractC78683fa.A00(r0)
            int r7 = java.lang.Math.max(r4, r6)
            r10 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r10
            int r6 = (int) r0
            int r0 = java.lang.Math.max(r4, r6)
            long r0 = X.AbstractC78673fZ.A00(r7, r0)
            android.widget.ImageView$ScaleType r9 = r5.A01
            android.widget.ImageView$ScaleType r8 = android.widget.ImageView.ScaleType.FIT_XY
            if (r9 == r8) goto L86
            if (r12 <= 0) goto L80
            if (r13 <= 0) goto L80
            X.3ia r7 = X.C51332Xg.A01
            int r6 = X.AbstractC78683fa.A00(r0)
            long r4 = r0 & r10
            int r2 = (int) r4
            X.2Xg r2 = r7.A00(r3, r9, r6, r2)
        L80:
            if (r8 == r9) goto L86
            if (r12 <= 0) goto L86
            if (r13 > 0) goto L8d
        L86:
            int r12 = X.AbstractC78683fa.A00(r0)
            long r3 = r0 & r10
            int r13 = (int) r3
        L8d:
            X.CRD r3 = new X.CRD
            r3.<init>(r2, r12, r13)
            goto L32
        L93:
            float r11 = (float) r12
            float r0 = (float) r13
            float r11 = r11 / r0
            boolean r0 = r5.A02
            if (r0 == 0) goto L9f
            long r0 = X.AbstractC78873ft.A03(r10, r11, r12, r13, r14)
            goto L52
        L9f:
            long r0 = X.AbstractC78873ft.A00(r11, r14)
            goto L52
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C29041CrU.Cgz(X.2YR, long):X.2YU");
    }

    @Override // X.C2VB
    public final /* bridge */ /* synthetic */ boolean CTz(Object obj) {
        return AbstractC25235BEs.A1b(obj, this);
    }
}
