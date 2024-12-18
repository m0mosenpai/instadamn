package X;

import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import com.facebook.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.9S3, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9S3 extends Drawable {
    public int A00;
    public final float A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final AA1 A0A;
    public final List A0B;
    public final InterfaceC09390do A0C;
    public final Context A0D;
    public final Paint A0E;
    public final float[] A0F;

    public C9S3(Context context, int i, int i2) {
        this.A0D = context;
        this.A08 = i;
        this.A00 = i2;
        this.A09 = AbstractC167017dG.A09(context);
        this.A05 = AbstractC167017dG.A06(context);
        this.A04 = AbstractC167017dG.A04(context);
        this.A07 = AbstractC167017dG.A03(context);
        this.A06 = AbstractC167017dG.A07(context);
        float A05 = AbstractC167017dG.A05(context);
        this.A01 = A05;
        List nCopies = Collections.nCopies(8, Float.valueOf(A05));
        C14360o3.A07(nCopies);
        this.A0F = AbstractC001800i.A0w(nCopies);
        this.A02 = AbstractC166997dE.A03(context);
        this.A03 = context.getColor(R.color.igds_error_or_destructive);
        Paint A0Q = AbstractC166997dE.A0Q();
        AbstractC166987dD.A1N(context, A0Q, R.color.black_60_transparent);
        Paint.Style style = Paint.Style.FILL;
        A0Q.setStyle(style);
        this.A0E = A0Q;
        this.A0C = AbstractC09440dt.A01(C25034B6h.A00);
        ArrayList A1E = AbstractC166987dD.A1E();
        for (int i3 = 0; i3 < i; i3++) {
            ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(this.A0F, null, null));
            shapeDrawable.getPaint().setColor(this.A02);
            shapeDrawable.getPaint().setStyle(style);
            shapeDrawable.getPaint().setAntiAlias(true);
            shapeDrawable.getPaint().setFlags(1);
            A1E.add(shapeDrawable);
        }
        this.A0B = A1E;
        Iterator it = A1E.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i5 = i4 + 1;
            if (i4 < 0) {
                AbstractC16960so.A1U();
                throw C00O.createAndThrow();
            }
            ((ShapeDrawable) next).getPaint().setColor(this.A02);
            i4 = i5;
        }
        Rect A0W = AbstractC166987dD.A0W(this);
        int i6 = A0W.top;
        int i7 = this.A05;
        int i8 = this.A06;
        int i9 = i6 + i7 + i8;
        int i10 = this.A04;
        int i11 = i10 + i9;
        int i12 = A0W.left + i7;
        int i13 = i10 + i12;
        Iterator it2 = this.A0B.iterator();
        while (it2.hasNext()) {
            AbstractC166987dD.A0Z(it2).setBounds(i12, i9, i13, i11);
            i9 = (i8 * 2) + i11;
            i11 = i10 + i9;
        }
        this.A0A = new AA1(this, this.A00);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x007a, code lost:
    
        X.AbstractC16960so.A1U();
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0081, code lost:
    
        throw X.C00O.createAndThrow();
     */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void draw(android.graphics.Canvas r9) {
        /*
            r8 = this;
            r0 = 0
            X.C14360o3.A0B(r9, r0)
            java.util.List r4 = r8.A0B
            java.util.Iterator r5 = r4.iterator()
            r1 = 0
        Lb:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L3b
            java.lang.Object r0 = r5.next()
            int r3 = r1 + 1
            if (r1 < 0) goto L7a
            android.graphics.drawable.ShapeDrawable r0 = (android.graphics.drawable.ShapeDrawable) r0
            android.graphics.Paint r2 = r0.getPaint()
            X.AA1 r0 = r8.A0A
            java.util.List r0 = r0.A04
            java.lang.Object r0 = r0.get(r1)
            android.animation.ValueAnimator r0 = (android.animation.ValueAnimator) r0
            java.lang.Object r1 = r0.getAnimatedValue()
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Int"
            X.C14360o3.A0C(r1, r0)
            int r0 = X.AbstractC166987dD.A0H(r1)
            r2.setColor(r0)
            r1 = r3
            goto Lb
        L3b:
            java.util.Iterator r7 = r4.iterator()
            r1 = 0
        L40:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L82
            java.lang.Object r6 = r7.next()
            int r5 = r1 + 1
            if (r1 < 0) goto L7a
            android.graphics.drawable.Drawable r6 = (android.graphics.drawable.Drawable) r6
            X.AA1 r0 = r8.A0A
            java.util.List r0 = r0.A03
            java.lang.Object r0 = r0.get(r1)
            android.animation.ValueAnimator r0 = (android.animation.ValueAnimator) r0
            java.lang.Object r1 = r0.getAnimatedValue()
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Int"
            X.C14360o3.A0C(r1, r0)
            int r3 = X.AbstractC166987dD.A0H(r1)
            int r2 = X.AbstractC166987dD.A0E(r6)
            android.graphics.Rect r0 = r6.getBounds()
            int r1 = r0.top
            int r0 = X.AbstractC166987dD.A0D(r6)
            r6.setBounds(r2, r1, r3, r0)
            r1 = r5
            goto L40
        L7a:
            X.AbstractC16960so.A1U()
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L82:
            r9.save()
            X.0do r0 = r8.A0C
            java.lang.Object r1 = r0.getValue()
            android.graphics.Path r1 = (android.graphics.Path) r1
            android.graphics.Paint r0 = r8.A0E
            r9.drawPath(r1, r0)
            java.util.Iterator r1 = r4.iterator()
        L96:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto La4
            android.graphics.drawable.Drawable r0 = X.AbstractC166987dD.A0Z(r1)
            r0.draw(r9)
            goto L96
        La4:
            r9.restore()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9S3.draw(android.graphics.Canvas):void");
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        C14360o3.A0B(rect, 0);
        super.onBoundsChange(rect);
        Path path = (Path) this.A0C.getValue();
        path.reset();
        float f = rect.left;
        float f2 = rect.top;
        RectF rectF = new RectF(f, f2, f + this.A09, AbstractC166987dD.A06(this) + f2);
        List nCopies = Collections.nCopies(8, Float.valueOf(this.A01));
        C14360o3.A07(nCopies);
        path.addRoundRect(rectF, AbstractC001800i.A0w(nCopies), Path.Direction.CW);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (this.A05 * 2) + (this.A08 * ((this.A06 * 2) + this.A04));
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.A09;
    }
}
