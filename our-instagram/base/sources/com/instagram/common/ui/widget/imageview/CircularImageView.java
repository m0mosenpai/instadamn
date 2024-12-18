package com.instagram.common.ui.widget.imageview;

import X.AbstractC55922hc;
import X.C0f9;
import X.C14360o3;
import X.C1WA;
import X.C1WX;
import X.C27771Wf;
import X.C27811Wj;
import X.C3DY;
import X.C58922mq;
import X.C58932mr;
import X.C73053Pg;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public class CircularImageView extends IgImageView {
    public int A00;
    public boolean A01;
    public boolean A02;
    public int A03;
    public int A04;
    public C58932mr A05;
    public boolean A06;
    public boolean A07;
    public final Rect A08;
    public final C58922mq A09;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CircularImageView(Context context) {
        this(context, null, 0);
        C14360o3.A0B(context, 1);
    }

    @Override // com.instagram.common.ui.widget.imageview.IgImageView, android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        super.onDraw(canvas);
        C58932mr c58932mr = this.A05;
        if (c58932mr != null) {
            c58932mr.draw(canvas);
        }
    }

    private final Rect getPaddingAffordanceRect() {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        if (this.A07) {
            i = getPaddingLeft();
            i2 = getPaddingTop();
            i3 = getPaddingRight();
            i4 = getPaddingBottom();
        } else {
            i = 0;
            i2 = 0;
            i3 = 0;
        }
        return new Rect(i, i2, i3, i4);
    }

    public final void A0H(int i, int i2) {
        if (i != 0) {
            this.A04 = i;
            C58932mr c58932mr = this.A05;
            if (c58932mr == null) {
                C58932mr c58932mr2 = new C58932mr(i, i2);
                this.A05 = c58932mr2;
                this.A00 = c58932mr2.A00.getAlpha();
            } else {
                c58932mr.A00.setStrokeWidth(i);
                C58932mr c58932mr3 = this.A05;
                if (c58932mr3 != null) {
                    c58932mr3.A00.setColor(i2);
                }
            }
        }
        invalidate();
    }

    public final int getStrokeWidth() {
        return this.A04;
    }

    @Override // com.instagram.common.ui.widget.imageview.IgImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        C73053Pg c73053Pg;
        if (bitmap != null) {
            c73053Pg = new C73053Pg(bitmap, this.A01);
        } else {
            c73053Pg = null;
        }
        super.setImageDrawable(c73053Pg);
    }

    @Override // com.instagram.common.ui.widget.imageview.IgImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        boolean z = drawable instanceof ColorDrawable;
        Drawable drawable2 = drawable;
        if (z) {
            int color = ((ColorDrawable) drawable).getColor();
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(color);
            gradientDrawable.setShape(1);
            drawable2 = gradientDrawable;
        }
        super.setImageDrawable(drawable2);
        A00(getPaddingAffordanceRect());
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        throw new UnsupportedOperationException("Use setImageDrawable or setImageBitmap");
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        throw new UnsupportedOperationException("Use setImageDrawable or setImageBitmap");
    }

    public final void setStrokeAlpha(int i) {
        C58932mr c58932mr = this.A05;
        if (c58932mr != null) {
            c58932mr.setAlpha(i);
        }
    }

    private final void A00(Rect rect) {
        Drawable drawable = getDrawable();
        if (this.A02 && drawable != null) {
            Rect bounds = drawable.getBounds();
            C14360o3.A07(bounds);
            int i = rect.left + bounds.left;
            int i2 = this.A04;
            drawable.setBounds(i + i2, rect.top + bounds.top + i2, (bounds.right - rect.right) - i2, (bounds.bottom - rect.bottom) - i2);
        }
    }

    @Override // com.instagram.common.ui.widget.imageview.IgImageView
    public final C27771Wf A07(C1WX c1wx) {
        C27811Wj c27811Wj = new C27811Wj(super.A07(c1wx));
        c27811Wj.A0I = this.A09;
        return new C27771Wf(c27811Wj);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        Rect rect;
        int A06 = C0f9.A06(229240072);
        super.onSizeChanged(i, i2, i3, i4);
        if (this.A05 != null) {
            if (getBackground() != null) {
                Drawable background = getBackground();
                rect = this.A08;
                background.getPadding(rect);
            } else {
                rect = this.A08;
                rect.set(0, 0, 0, 0);
            }
            Rect paddingAffordanceRect = getPaddingAffordanceRect();
            A00(paddingAffordanceRect);
            Rect rect2 = new Rect(paddingAffordanceRect.left + rect.left, paddingAffordanceRect.top + rect.top, (getWidth() - paddingAffordanceRect.bottom) - rect.right, (getHeight() - paddingAffordanceRect.top) - rect.bottom);
            C58932mr c58932mr = this.A05;
            if (c58932mr != null) {
                c58932mr.setBounds(rect2);
            }
        }
        C0f9.A0D(1332306114, A06);
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        super.setPressed(z);
        if (this.A06 && z) {
            setColorFilter(C3DY.A00(this.A03));
        }
    }

    public final void setCenterCrop(boolean z) {
        this.A01 = z;
    }

    public final void setDarkenOnPress(boolean z) {
        this.A06 = z;
    }

    public final void setFitImageInsideStroke(boolean z) {
        this.A02 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.2mq] */
    public CircularImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        this.A08 = new Rect();
        this.A09 = new C1WA() { // from class: X.2mq
            @Override // X.C1WA
            public final Drawable AM6(Resources resources, C27771Wf c27771Wf, C3QA c3qa) {
                C14360o3.A0B(c3qa, 1);
                if (c3qa instanceof C3QE) {
                    Bitmap CCP = ((C3QE) c3qa).CCP();
                    C14360o3.A07(CCP);
                    return new C73053Pg(CCP, CircularImageView.this.A01);
                }
                return null;
            }
        };
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC55922hc.A0F);
            C14360o3.A07(obtainStyledAttributes);
            int color = obtainStyledAttributes.getColor(2, 0);
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(5, 0);
            this.A07 = obtainStyledAttributes.getBoolean(3, false);
            this.A02 = obtainStyledAttributes.getBoolean(4, false);
            this.A03 = obtainStyledAttributes.getColor(1, 1711276032);
            this.A01 = obtainStyledAttributes.getBoolean(0, false);
            this.A06 = false;
            obtainStyledAttributes.recycle();
            A0H(dimensionPixelSize, color);
        }
        setOutlineProvider(new ViewOutlineProvider() { // from class: X.2ms
            @Override // android.view.ViewOutlineProvider
            public final void getOutline(View view, Outline outline) {
                C14360o3.A0B(view, 0);
                C14360o3.A0B(outline, 1);
                outline.setOval(0, 0, view.getWidth(), view.getHeight());
            }
        });
        setClipToOutline(true);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CircularImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C14360o3.A0B(context, 1);
    }

    public /* synthetic */ CircularImageView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
