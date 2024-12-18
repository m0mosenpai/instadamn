package X;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* renamed from: X.3ef, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C78133ef extends AbstractC77583di {
    public final int A00;
    public final int A01;
    public final Drawable A02;
    public final ImageView.ScaleType A03;
    public final C2XI A04;
    public final C51722Yv A05;

    public C78133ef(Drawable drawable, ImageView.ScaleType scaleType, C2XI c2xi, C51722Yv c51722Yv, int i, int i2) {
        C14360o3.A0B(drawable, 1);
        this.A02 = drawable;
        this.A01 = i;
        this.A00 = i2;
        this.A03 = scaleType;
        this.A04 = c2xi;
        this.A05 = c51722Yv;
    }

    @Override // X.AbstractC77583di
    public final C78053eX A0Y(C77993eR c77993eR) {
        C14360o3.A0B(c77993eR, 0);
        final Drawable drawable = this.A02;
        return new C78053eX(this.A05, new C2YT(drawable) { // from class: X.3eg
            public final Drawable A00;

            {
                C14360o3.A0B(drawable, 1);
                this.A00 = drawable;
            }

            @Override // X.C2VB
            public final /* bridge */ /* synthetic */ boolean CTz(Object obj) {
                C14360o3.A0B(obj, 1);
                return AbstractC78713fd.A03(this, obj);
            }

            /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
            @Override // X.C2YT
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final X.C2YU Cgz(X.C2YR r5, long r6) {
                /*
                    r4 = this;
                    android.graphics.drawable.Drawable r0 = r4.A00
                    int r3 = r0.getIntrinsicWidth()
                    int r2 = r0.getIntrinsicHeight()
                    boolean r0 = X.C78613fT.A08(r6)
                    r1 = -1
                    if (r0 != 0) goto L5b
                    boolean r0 = X.C78613fT.A06(r6)
                    if (r0 == 0) goto L51
                    if (r3 == r1) goto L5b
                    int r0 = X.C78613fT.A01(r6)
                    int r3 = java.lang.Math.min(r0, r3)
                L21:
                    boolean r0 = X.C78613fT.A07(r6)
                    if (r0 != 0) goto L4c
                    boolean r0 = X.C78613fT.A05(r6)
                    if (r0 == 0) goto L42
                    if (r2 == r1) goto L4c
                    int r0 = X.C78613fT.A00(r6)
                    int r2 = java.lang.Math.min(r0, r2)
                L37:
                    long r2 = X.AbstractC78673fZ.A00(r3, r2)
                    r1 = 0
                    X.2YU r0 = new X.2YU
                    r0.<init>(r2, r1)
                    return r0
                L42:
                    if (r2 != r1) goto L37
                    java.lang.String r1 = "Drawable must either have an intrinsic height or be measured with bounded constraints"
                    java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                    r0.<init>(r1)
                    throw r0
                L4c:
                    int r2 = X.C78613fT.A00(r6)
                    goto L37
                L51:
                    if (r3 != r1) goto L21
                    java.lang.String r1 = "Drawable must either have an intrinsic width or be measured with bounded constraints"
                    java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                    r0.<init>(r1)
                    throw r0
                L5b:
                    int r3 = X.C78613fT.A01(r6)
                    goto L21
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C78143eg.Cgz(X.2YR, long):X.2YU");
            }
        }, new C2YP(new C51532Yb(C77603dk.A00, C78163ei.A00, 5, true), C78153eh.A00, new C207179Ew(37, c77993eR, this), c77993eR.A01()));
    }
}
