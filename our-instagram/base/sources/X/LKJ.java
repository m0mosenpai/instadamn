package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.Shape;
import java.util.WeakHashMap;

/* loaded from: classes8.dex */
public final class LKJ {
    public static final C47731L5s A0C = new Object();
    public static final WeakHashMap A0D = new WeakHashMap();
    public float A00;
    public ValueAnimator A01;
    public boolean A02;
    public final Context A06;
    public final ShapeDrawable A07;
    public final ShapeDrawable A08;
    public final ShapeDrawable A09;
    public final Drawable A0A;
    public final Drawable A0B;
    public Integer A05 = C05F.A0C;
    public ValueAnimator A03 = new ValueAnimator();
    public ValueAnimator A04 = new ValueAnimator();

    public LKJ(Context context, Drawable drawable, Drawable drawable2, ShapeDrawable shapeDrawable, ShapeDrawable shapeDrawable2, ShapeDrawable shapeDrawable3) {
        this.A06 = context;
        this.A07 = shapeDrawable;
        this.A08 = shapeDrawable2;
        this.A09 = shapeDrawable3;
        this.A0B = drawable;
        this.A0A = drawable2;
        ValueAnimator valueAnimator = new ValueAnimator();
        this.A01 = valueAnimator;
        valueAnimator.setDuration(15L);
        LMA.A01(this.A01, this, 22);
        this.A03.setDuration(100L);
        LMA.A01(this.A03, this, 23);
        this.A04.setRepeatCount(-1);
        this.A04.setRepeatMode(1);
        this.A04.setDuration(1000L);
        this.A04.setFloatValues(0.0f, 360.0f);
        LMA.A01(this.A04, this, 24);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A00() {
        /*
            r3 = this;
            java.lang.Integer r1 = r3.A05
            java.lang.Integer r0 = X.C05F.A0C
            if (r1 != r0) goto L40
            float r1 = r3.A00
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 == 0) goto L13
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L40
        L13:
            android.content.Context r1 = r3.A06
            r0 = 2130971414(0x7f040b16, float:1.7551566E38)
        L18:
            int r2 = X.AbstractC53242c7.A0F(r1, r0)
            android.graphics.drawable.ShapeDrawable r0 = r3.A08
            android.graphics.Paint r0 = r0.getPaint()
            int r0 = r0.getColor()
            if (r2 == r0) goto L3f
            android.animation.ValueAnimator r1 = r3.A03
            r1.cancel()
            int[] r0 = new int[]{r0, r2}
            r1.setIntValues(r0)
            android.animation.ArgbEvaluator r0 = new android.animation.ArgbEvaluator
            r0.<init>()
            r1.setEvaluator(r0)
            r1.start()
        L3f:
            return
        L40:
            android.content.Context r1 = r3.A06
            r0 = 2130971419(0x7f040b1b, float:1.7551576E38)
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LKJ.A00():void");
    }

    public static final void A01(LKJ lkj, float f) {
        ShapeDrawable shapeDrawable = lkj.A07;
        Shape shape = shapeDrawable.getShape();
        C14360o3.A0C(shape, "null cannot be cast to non-null type com.facebook.common.messagingui.roundedcornergradientdrawable.shape.MutableArcShape");
        C44377JjG c44377JjG = (C44377JjG) shape;
        c44377JjG.A00 = f;
        shapeDrawable.setShape(c44377JjG);
        lkj.A00 = f;
        if (f != 0.0f && f != 1.0f) {
            shapeDrawable.mutate().setAlpha(255);
        } else {
            shapeDrawable.mutate().setAlpha(0);
        }
    }

    public final void A02() {
        Integer num = this.A05;
        Integer num2 = C05F.A01;
        if (num != num2) {
            this.A09.setAlpha(255);
            this.A05 = num2;
            this.A04.start();
        }
        A00();
    }

    public final void A03() {
        Integer num = this.A05;
        Integer num2 = C05F.A0C;
        if (num != num2) {
            this.A0B.mutate().setAlpha(255);
            this.A0A.mutate().setAlpha(0);
            this.A09.setAlpha(0);
            this.A05 = num2;
            this.A04.cancel();
        }
        A00();
    }

    public final void A04() {
        Integer num = this.A05;
        Integer num2 = C05F.A00;
        if (num != num2) {
            this.A0B.mutate().setAlpha(0);
            this.A0A.mutate().setAlpha(255);
            this.A09.setAlpha(0);
            this.A05 = num2;
            this.A04.cancel();
        }
        A00();
    }
}
