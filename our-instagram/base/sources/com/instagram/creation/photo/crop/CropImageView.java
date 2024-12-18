package com.instagram.creation.photo.crop;

import X.AbstractC166987dD;
import X.AbstractC43828JZr;
import X.C131515wl;
import X.C14360o3;
import X.C1H4;
import X.C43843Ja7;
import X.C43844Ja8;
import X.C82P;
import X.JQ0;
import X.MNA;
import X.MQU;
import X.U7F;
import X.XEM;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes8.dex */
public final class CropImageView extends AbstractC43828JZr {
    public RectF A00;
    public U7F A01;
    public MNA A02;
    public MQU A03;
    public C82P A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public final Rect A08;
    public final RectF A09;
    public final C43843Ja7 A0A;
    public final Point A0B;
    public final XEM A0C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CropImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C14360o3.A0B(context, 1);
        this.A0B = new Point(1, 1);
        this.A0A = new C43843Ja7(this);
        this.A07 = true;
        this.A05 = true;
        this.A09 = AbstractC166987dD.A0X();
        this.A08 = AbstractC166987dD.A0U();
        this.A0C = new C43844Ja8(this);
    }

    @Override // com.instagram.common.ui.widget.imageview.IgImageView, android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        int i;
        int i2;
        int i3;
        int i4;
        C14360o3.A0B(canvas, 0);
        super.onDraw(canvas);
        MQU mqu = this.A03;
        if (mqu != null) {
            Matrix imageMatrix = getImageMatrix();
            C14360o3.A07(imageMatrix);
            double A00 = AbstractC43828JZr.A00(imageMatrix, this) / AbstractC43828JZr.A00(((AbstractC43828JZr) this).A07, this);
            boolean z = false;
            if (A00 >= 1.0d) {
                z = true;
            }
            mqu.DCF(z);
        }
        C82P c82p = this.A04;
        if (c82p != null) {
            RectF rectF = this.A00;
            if (rectF != null) {
                this.A09.set(rectF);
            }
            Matrix imageMatrix2 = getImageMatrix();
            RectF rectF2 = this.A09;
            imageMatrix2.mapRect(rectF2);
            Rect rect = this.A08;
            try {
                i = C1H4.A01(rectF2.left);
            } catch (IllegalArgumentException unused) {
                i = 0;
            }
            rect.left = Math.max(i, 0);
            try {
                i2 = C1H4.A01(rectF2.top);
            } catch (IllegalArgumentException unused2) {
                i2 = 0;
            }
            rect.top = Math.max(i2, 0);
            try {
                i3 = C1H4.A01(rectF2.right);
            } catch (IllegalArgumentException unused3) {
                i3 = 0;
            }
            rect.right = Math.min(i3, getWidth());
            try {
                i4 = C1H4.A01(rectF2.bottom);
            } catch (IllegalArgumentException unused4) {
                i4 = 0;
            }
            rect.bottom = Math.min(i4, getHeight());
            if (this.A06) {
                int i5 = rect.left;
                if (i5 > 0) {
                    rect.right = (int) (i5 + Math.min(rectF2.width(), AbstractC166987dD.A07(this)));
                } else if (rect.right < getWidth()) {
                    rect.left = (int) (rect.right - Math.min(rectF2.width(), AbstractC166987dD.A07(this)));
                }
                int i6 = rect.top;
                if (i6 > 0) {
                    rect.bottom = (int) (i6 + Math.min(rectF2.height(), AbstractC166987dD.A08(this)));
                } else if (rect.bottom < getHeight()) {
                    rect.top = (int) (rect.bottom - Math.min(rectF2.height(), AbstractC166987dD.A08(this)));
                }
            }
            C131515wl c131515wl = c82p.A01;
            if (c131515wl != null) {
                if (c131515wl.A01 != 3 || c131515wl.A00 != 3) {
                    c131515wl.A01 = 3;
                    c131515wl.A00 = 3;
                    c131515wl.A02 = new float[2];
                    c131515wl.A03 = new float[2];
                }
                c131515wl.A03(rect);
            }
            c82p.A00(canvas);
        }
    }

    public final void setHighlightView(C82P c82p) {
        C14360o3.A0B(c82p, 0);
        this.A04 = c82p;
        invalidate();
    }

    @Override // X.AbstractC43828JZr
    public final void A0M(boolean z) {
        if (z != this.A07) {
            this.A07 = z;
            super.A0M(z);
            A0P(!this.A07, true);
        }
    }

    public final void A0O() {
        if (this.A05) {
            U7F u7f = new U7F();
            this.A01 = u7f;
            u7f.A00 = 1.0f;
            setOnTouchListener(u7f);
            U7F u7f2 = this.A01;
            if (u7f2 != null) {
                u7f2.A02 = this.A0C;
            }
        }
    }

    public final void A0P(boolean z, boolean z2) {
        float f;
        C82P c82p = this.A04;
        if (c82p != null && c82p.A01 != null) {
            C43843Ja7 c43843Ja7 = this.A0A;
            c43843Ja7.cancel();
            if (!z) {
                if (z2) {
                    C43843Ja7 c43843Ja72 = c43843Ja7.A01.A0A;
                    c43843Ja72.setStartTime(-1L);
                    c43843Ja72.setStartOffset(500L);
                    c43843Ja72.setDuration(250L);
                    startAnimation(c43843Ja7);
                    return;
                }
                f = 0.0f;
            } else {
                f = 1.0f;
            }
            C131515wl c131515wl = c82p.A01;
            if (c131515wl == null || !c131515wl.A04(f)) {
                return;
            }
            invalidate();
        }
    }

    public final C82P getHighlightView() {
        return this.A04;
    }

    public final void setGridLinesNumberProvider(MNA mna) {
        this.A02 = mna;
    }

    public final void setListener(MQU mqu) {
        this.A03 = mqu;
    }

    public final void setSameProportionalGrid(boolean z) {
        this.A06 = z;
        invalidate();
    }

    public final void setTouchEnabled(boolean z) {
        this.A05 = z;
    }

    public /* synthetic */ CropImageView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JQ0.A0C(attributeSet, i));
    }
}
