package com.facebook.fxcrop;

import X.AbstractC166987dD;
import X.AbstractC61774RtU;
import X.AbstractC61775RtV;
import X.AbstractC63326Sha;
import X.C05F;
import X.C0fK;
import X.C63181Seg;
import X.C63992SxP;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import com.facebook.common.dextricks.StringTreeSet;

/* loaded from: classes10.dex */
public class SimpleCropView extends ImageView implements View.OnTouchListener {
    public float A00;
    public float A01;
    public int A02;
    public int A03;
    public int A04;
    public Paint A05;
    public Paint A06;
    public Paint A07;
    public Uri A08;
    public Integer A09;
    public Bitmap A0A;
    public final RectF A0B;
    public static final float A0E = AbstractC61775RtV.A00(1);
    public static final float A0D = AbstractC61775RtV.A00(3);
    public static final float A0C = AbstractC61775RtV.A00(24);

    public void setImageUri(Uri uri) {
        this.A08 = uri;
        C63181Seg.A06.A01(getContext(), uri, new C63992SxP(this), "LOAD_SMALL_BITMAP_FOR_EDITING_PREVIEW", false, false);
    }

    private void setBitmapToView(Bitmap bitmap) {
        if (bitmap != null && bitmap.getWidth() != 0 && bitmap.getHeight() != 0 && this.A04 != 0 && this.A03 != 0) {
            this.A0A = bitmap;
            setImageBitmap(bitmap);
            getLayoutParams().height = (this.A04 * bitmap.getHeight()) / bitmap.getWidth();
            requestLayout();
        }
    }

    public final void A02() {
        this.A02 = (this.A02 + 90) % 360;
        float f = this.A04 / this.A03;
        RectF rectF = this.A0B;
        float f2 = (r2 - 1) - (rectF.top * f);
        float f3 = rectF.left * f;
        rectF.set((f2 - (rectF.width() * f)) + 1.0f, f3, f2, ((rectF.height() * f) + f3) - 1.0f);
        Bitmap bitmap = this.A0A;
        if (bitmap != null) {
            setBitmapToView(AbstractC61774RtU.A00(bitmap, 90));
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Path A0T = AbstractC166987dD.A0T();
        A0T.setFillType(Path.FillType.WINDING);
        A0T.addRect(0.0f, 0.0f, this.A04, this.A03, Path.Direction.CW);
        RectF rectF = this.A0B;
        A0T.addRect(rectF, Path.Direction.CCW);
        canvas.drawPath(A0T, this.A07);
        float width = rectF.width() * 0.333f;
        float height = rectF.height() * 0.333f;
        float f = rectF.left;
        float f2 = rectF.top;
        int i = 0;
        do {
            f += width;
            f2 += height;
            canvas.drawLine(f, rectF.top, f, rectF.bottom, this.A06);
            canvas.drawLine(rectF.left, f2, rectF.right, f2, this.A06);
            i++;
        } while (i < 2);
        canvas.drawRect(rectF, this.A06);
        float f3 = rectF.left;
        float f4 = rectF.top;
        float f5 = A0C;
        canvas.drawLine(f3, f4, f3, f4 + f5, this.A05);
        float f6 = rectF.left;
        float f7 = rectF.top;
        canvas.drawLine(f6, f7, f6 + f5, f7, this.A05);
        float f8 = rectF.right;
        float f9 = rectF.top;
        canvas.drawLine(f8, f9, f8, f9 + f5, this.A05);
        float f10 = rectF.right;
        float f11 = rectF.top;
        canvas.drawLine(f10, f11, f10 - f5, f11, this.A05);
        float f12 = rectF.left;
        float f13 = rectF.bottom;
        canvas.drawLine(f12, f13, f12, f13 - f5, this.A05);
        float f14 = rectF.left;
        float f15 = rectF.bottom;
        canvas.drawLine(f14, f15, f14 + f5, f15, this.A05);
        float f16 = rectF.right;
        float f17 = rectF.bottom;
        canvas.drawLine(f16, f17, f16, f17 - f5, this.A05);
        float f18 = rectF.right;
        float f19 = rectF.bottom;
        canvas.drawLine(f18, f19, f18 - f5, f19, this.A05);
    }

    public SimpleCropView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A0A = null;
        this.A04 = 0;
        this.A03 = 0;
        this.A0B = AbstractC166987dD.A0X();
        this.A09 = C05F.A00;
        this.A00 = 0.0f;
        this.A01 = 0.0f;
        this.A08 = null;
        this.A02 = 0;
        A00();
    }

    private void A00() {
        setOnTouchListener(this);
        Paint paint = new Paint(1);
        this.A07 = paint;
        AbstractC166987dD.A1R(paint);
        this.A07.setColor(-16777216);
        this.A07.setAlpha(StringTreeSet.MAX_SYMBOL_COUNT);
        Paint paint2 = new Paint(1);
        this.A06 = paint2;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        this.A06.setStrokeCap(Paint.Cap.SQUARE);
        this.A06.setColor(-1);
        this.A06.setAlpha(StringTreeSet.MAX_SYMBOL_COUNT);
        this.A06.setStrokeWidth(A0E);
        Paint paint3 = new Paint(1);
        this.A05 = paint3;
        paint3.setStyle(style);
        this.A05.setStrokeCap(Paint.Cap.ROUND);
        this.A05.setColor(-1);
        this.A05.setStrokeWidth(A0D);
    }

    public static void A01(Bitmap bitmap, SimpleCropView simpleCropView) {
        int width;
        int width2 = bitmap.getWidth();
        int i = simpleCropView.A04;
        if (width2 > i && (width = (bitmap.getWidth() * i) / bitmap.getHeight()) > 0 && i > 0) {
            Bitmap A00 = C0fK.A00(bitmap, width, i, false);
            bitmap.recycle();
            bitmap = A00;
        }
        int i2 = AbstractC63326Sha.A00;
        simpleCropView.A02 = i2;
        if (i2 > 0) {
            bitmap = AbstractC61774RtU.A00(bitmap, i2);
        }
        RectF rectF = AbstractC63326Sha.A01;
        if (rectF != null) {
            simpleCropView.A0B.set(rectF);
        } else {
            int height = (simpleCropView.A04 * bitmap.getHeight()) / bitmap.getWidth();
            if (bitmap.getHeight() >= bitmap.getWidth()) {
                simpleCropView.A0B.set(0.0f, (height - r6) / 2, simpleCropView.A04, (height + r6) / 2);
            } else {
                RectF rectF2 = simpleCropView.A0B;
                int i3 = simpleCropView.A04;
                rectF2.set((i3 - height) / 2, 0.0f, (i3 + height) / 2, height);
            }
        }
        simpleCropView.setBitmapToView(bitmap);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i2) {
        this.A04 = View.MeasureSpec.getSize(i);
        int size = View.MeasureSpec.getSize(i2);
        this.A03 = size;
        setMeasuredDimension(this.A04, size);
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x019f, code lost:
    
        if (r13 <= ((r1 + com.facebook.fxcrop.SimpleCropView.A0C) + 50.0f)) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01bd, code lost:
    
        r0 = X.C05F.A0Y;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x01bb, code lost:
    
        if (r13 <= (r1 + 50.0f)) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x01d4, code lost:
    
        if (r13 <= (r1 + 50.0f)) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x01ed, code lost:
    
        r0 = X.C05F.A0j;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x01eb, code lost:
    
        if (r13 <= (r1 + 50.0f)) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x021e, code lost:
    
        if (r13 <= (r1 + 50.0f)) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0165, code lost:
    
        if (r13 <= ((r1 + com.facebook.fxcrop.SimpleCropView.A0C) + 50.0f)) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0180, code lost:
    
        r0 = X.C05F.A0N;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x017e, code lost:
    
        if (r13 <= (r1 + 50.0f)) goto L96;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouch(android.view.View r19, android.view.MotionEvent r20) {
        /*
            Method dump skipped, instructions count: 552
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.fxcrop.SimpleCropView.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public SimpleCropView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A0A = null;
        this.A04 = 0;
        this.A03 = 0;
        this.A0B = AbstractC166987dD.A0X();
        this.A09 = C05F.A00;
        this.A00 = 0.0f;
        this.A01 = 0.0f;
        this.A08 = null;
        this.A02 = 0;
        A00();
    }

    public SimpleCropView(Context context) {
        super(context);
        this.A0A = null;
        this.A04 = 0;
        this.A03 = 0;
        this.A0B = AbstractC166987dD.A0X();
        this.A09 = C05F.A00;
        this.A00 = 0.0f;
        this.A01 = 0.0f;
        this.A08 = null;
        this.A02 = 0;
        A00();
    }
}
