package com.instagram.common.ui.widget.imageview;

import X.AT0;
import X.AbstractC55922hc;
import X.C0f9;
import X.C14360o3;
import X.C149496o0;
import X.C1NC;
import X.C3OB;
import X.C9Rz;
import X.MN2;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.RectF;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.instagram.common.ui.widget.imageview.RoundedCornerImageView;

/* loaded from: classes2.dex */
public class RoundedCornerImageView extends IgImageView {
    public float A00;
    public int A01;
    public View.OnLayoutChangeListener A02;
    public C3OB A03;
    public MN2 A04;
    public boolean A05;
    public int A06;
    public int A07;
    public int A08;
    public C149496o0 A09;
    public boolean A0A;
    public boolean A0B;
    public final Paint A0C;
    public final RectF A0D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoundedCornerImageView(Context context) {
        super(context);
        C14360o3.A0B(context, 1);
        this.A0C = new Paint(1);
        this.A0D = new RectF();
        this.A0B = true;
        this.A03 = C3OB.A03;
        this.A00 = 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setDrawable(Bitmap bitmap) {
        Matrix matrix;
        this.A0A = false;
        float f = this.A00;
        if (this.A03 == C3OB.A02) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int width2 = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int i = this.A01;
            boolean z = this.A05;
            boolean z2 = C1NC.A02;
            matrix = new Matrix();
            C1NC.A0J(matrix, width, height, width2, height2, i, z);
        } else {
            matrix = null;
        }
        super.setImageDrawable(new C9Rz(bitmap, matrix, f, this.A06));
    }

    @Override // com.instagram.common.ui.widget.imageview.IgImageView, android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        super.onDraw(canvas);
        if (this.A0A) {
            RectF rectF = this.A0D;
            float f = this.A00;
            canvas.drawRoundRect(rectF, f, f, this.A0C);
        }
        C149496o0 c149496o0 = this.A09;
        if (this.A0B && c149496o0 != null) {
            c149496o0.draw(canvas);
        }
    }

    public final void setBitmapShaderScaleType(C3OB c3ob) {
        C14360o3.A0B(c3ob, 0);
        this.A03 = c3ob;
    }

    @Override // com.instagram.common.ui.widget.imageview.IgImageView
    public void setPlaceHolderColor(int i) {
        this.A0A = true;
        this.A0C.setColor(i);
        invalidate();
    }

    private final void A00() {
        this.A09 = new C149496o0(this.A00, this.A08, this.A07, this.A06);
        setOutlineProvider(new ViewOutlineProvider() { // from class: X.6o1
            @Override // android.view.ViewOutlineProvider
            public final void getOutline(View view, Outline outline) {
                C14360o3.A0B(view, 0);
                C14360o3.A0B(outline, 1);
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), RoundedCornerImageView.this.A00);
            }
        });
        setClipToOutline(true);
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        throw new UnsupportedOperationException();
    }

    public final void setRadius(float f) {
        this.A00 = f;
        if (this.A09 != null) {
            A00();
        }
    }

    public final void setStrokeColor(int i) {
        this.A07 = i;
        C149496o0 c149496o0 = this.A09;
        if (c149496o0 != null) {
            Paint paint = c149496o0.A01;
            if (paint.getColor() != i) {
                paint.setColor(i);
                c149496o0.invalidateSelf();
            }
        }
    }

    public final void setStrokeEnabled(boolean z) {
        if (this.A0B != z) {
            this.A0B = z;
            invalidate();
        }
    }

    public final void setStrokeWidth(int i) {
        this.A08 = i;
        C149496o0 c149496o0 = this.A09;
        if (c149496o0 != null) {
            float f = i;
            Paint paint = c149496o0.A01;
            if (Float.compare(f, paint.getStrokeWidth()) != 0) {
                paint.setStrokeWidth(f);
                c149496o0.invalidateSelf();
                return;
            }
            return;
        }
        if (i <= 0) {
            return;
        }
        this.A09 = new C149496o0(this.A00, i, this.A07, this.A06);
    }

    private final void A04(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC55922hc.A0q);
        C14360o3.A07(obtainStyledAttributes);
        this.A00 = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.A06 = obtainStyledAttributes.getInt(2, 15);
        this.A08 = obtainStyledAttributes.getDimensionPixelOffset(4, 0);
        this.A07 = obtainStyledAttributes.getColor(3, 0);
        if (this.A08 > 0) {
            A00();
        }
        int color = obtainStyledAttributes.getColor(0, 0);
        if (color != 0) {
            setPlaceHolderColor(color);
        }
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        int A06 = C0f9.A06(897815248);
        super.onSizeChanged(i, i2, i3, i4);
        RectF rectF = this.A0D;
        rectF.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
        C149496o0 c149496o0 = this.A09;
        if (c149496o0 != null) {
            c149496o0.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        }
        C0f9.A0D(-1417323995, A06);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int A05 = C0f9.A05(1654531403);
        C14360o3.A0B(motionEvent, 0);
        boolean z = false;
        if (super.onTouchEvent(motionEvent)) {
            z = true;
        }
        C0f9.A0C(-251955689, A05);
        return z;
    }

    @Override // com.instagram.common.ui.widget.imageview.IgImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        A09();
        View.OnLayoutChangeListener onLayoutChangeListener = this.A02;
        if (onLayoutChangeListener != null) {
            removeOnLayoutChangeListener(onLayoutChangeListener);
            this.A02 = null;
        }
        if (this.A03 != C3OB.A03 && getWidth() == 0 && getHeight() == 0) {
            if (bitmap != null) {
                AT0 at0 = new AT0(bitmap, this);
                this.A02 = at0;
                addOnLayoutChangeListener(at0);
                return;
            }
            return;
        }
        if (bitmap == null) {
            return;
        }
        setDrawable(bitmap);
    }

    public final void setBitmapMirrored(boolean z) {
        this.A05 = z;
    }

    public final void setBitmapShaderRotation(int i) {
        this.A01 = i;
    }

    public final void setOnTouchListener(MN2 mn2) {
        this.A04 = mn2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoundedCornerImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        this.A0C = new Paint(1);
        this.A0D = new RectF();
        this.A0B = true;
        this.A03 = C3OB.A03;
        A04(attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoundedCornerImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C14360o3.A0B(context, 1);
        this.A0C = new Paint(1);
        this.A0D = new RectF();
        this.A0B = true;
        this.A03 = C3OB.A03;
        A04(attributeSet);
    }
}
