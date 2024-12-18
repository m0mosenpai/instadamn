package com.instagram.ui.widget.slideouticon;

import X.AbstractC13620mo;
import X.AbstractC53242c7;
import X.AbstractC55922hc;
import X.C0f9;
import X.C30Q;
import X.C3WC;
import X.C3WD;
import X.C43801JYo;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.facebook.R;
import com.instagram.common.ui.text.TitleTextView;

/* loaded from: classes2.dex */
public class SlideInAndOutIconView extends LinearLayout implements C3WC {
    public float A00;
    public C43801JYo A01;
    public C30Q A02;
    public C3WD A03;
    public String A04;
    public boolean A05;
    public int A06;
    public int A07;
    public int A08;
    public GradientDrawable A09;
    public final RectF A0A;
    public final ImageView A0B;
    public final TitleTextView A0C;
    public final Paint A0D;
    public final boolean A0E;

    public SlideInAndOutIconView(Context context) {
        this(context, null);
    }

    public static void A00(SlideInAndOutIconView slideInAndOutIconView, float f, float f2, float f3) {
        slideInAndOutIconView.A0A.set(f, 0.0f, f2, f3);
        slideInAndOutIconView.A09.setBounds((int) f, 0, (int) f2, (int) f3);
    }

    public final void A01() {
        setVisibility(8);
        setAlpha(1.0f);
        TitleTextView titleTextView = this.A0C;
        titleTextView.setScaleX(1.0f);
        titleTextView.setScaleY(1.0f);
        titleTextView.setVisibility(8);
    }

    public final void A02(int i, int i2) {
        if (this.A08 == i && this.A07 == i2) {
            return;
        }
        this.A08 = i;
        this.A07 = i2;
        this.A09.setColors(new int[]{i, i2});
    }

    public final void A03(Drawable drawable, int i, int i2) {
        ImageView imageView = this.A0B;
        imageView.getLayoutParams().width = i;
        imageView.getLayoutParams().height = i2;
        imageView.setImageDrawable(drawable);
    }

    public int getLineHeight() {
        return this.A0C.getLineHeight();
    }

    public void setBackgroundAlpha(float f) {
        this.A09.setAlpha((int) (f * 255.0f));
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        this.A09.setColorFilter(i, PorterDuff.Mode.SRC_IN);
    }

    public void setIcon(Drawable drawable) {
        this.A0B.setImageDrawable(drawable);
    }

    public void setIconColor(int i) {
        this.A0B.setColorFilter(i, PorterDuff.Mode.SRC_ATOP);
    }

    public void setIconScale(float f) {
        ImageView imageView = this.A0B;
        imageView.setScaleX(f);
        imageView.setScaleY(f);
    }

    public void setText(String str) {
        TitleTextView titleTextView;
        int i;
        this.A04 = str;
        if (str != null && !str.isEmpty()) {
            titleTextView = this.A0C;
            titleTextView.setText(str);
            i = 0;
        } else {
            titleTextView = this.A0C;
            i = 8;
        }
        titleTextView.setVisibility(i);
    }

    public void setTextBold(boolean z) {
        this.A0C.setIsBold(z);
    }

    public void setTextCapitalization(boolean z) {
        this.A0C.setIsCapitalized(z);
    }

    public void setTextColor(int i) {
        this.A0C.setTextColor(i);
    }

    public void setTextSize(float f) {
        this.A0C.setTextSize(0, f);
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.A09 && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        GradientDrawable gradientDrawable = this.A09;
        RectF rectF = this.A0A;
        gradientDrawable.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        gradientDrawable.draw(canvas);
        if (this.A0E) {
            canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, this.A0D);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int A06 = C0f9.A06(-1561329543);
        super.onSizeChanged(i, i2, i3, i4);
        float f = i2;
        A00(this, 0.0f, i, f);
        if (this.A02 == C30Q.SLIDE_IN) {
            A00(this, 0.0f, f, f);
        }
        this.A09.setCornerRadius(this.A0A.height() / 2.0f);
        C0f9.A0D(2017869721, A06);
    }

    public void setSlideDirection(C3WD c3wd) {
        this.A03 = c3wd;
    }

    public void setSlideEffect(C30Q c30q) {
        this.A02 = c30q;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
    }

    public SlideInAndOutIconView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Paint paint = new Paint(1);
        this.A0D = paint;
        this.A0A = new RectF();
        this.A03 = C3WD.START;
        this.A02 = C30Q.SLIDE_OUT;
        setOrientation(0);
        Resources resources = getResources();
        Context context2 = getContext();
        int color = context2.getColor(R.color.audio_bar_action_color_enabled);
        this.A06 = context2.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_secondary_button_on_media_panavision_updated));
        int color2 = context2.getColor(R.color.default_slideout_icon_background_border);
        float dimension = resources.getDimension(R.dimen.button_text_size);
        LayoutInflater.from(context).inflate(R.layout.slideout_icon, this);
        this.A0B = (ImageView) requireViewById(R.id.slideout_iconview_icon);
        TitleTextView titleTextView = (TitleTextView) requireViewById(R.id.slideout_iconview_text);
        this.A0C = titleTextView;
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, AbstractC55922hc.A2D);
        setText(obtainStyledAttributes.getResourceId(6, 0));
        setTextSize(obtainStyledAttributes.getDimension(10, dimension));
        titleTextView.setTextColor(obtainStyledAttributes.getColor(7, color));
        titleTextView.setPivotX(0.0f);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(8, 0);
        int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(9, 0);
        boolean A02 = AbstractC13620mo.A02(context2);
        this.A05 = A02;
        int i2 = dimensionPixelSize2;
        if (!A02) {
            i2 = dimensionPixelSize;
            dimensionPixelSize = dimensionPixelSize2;
        }
        titleTextView.setPadding(i2, 0, dimensionPixelSize, 0);
        setIcon(obtainStyledAttributes.getDrawable(5));
        this.A08 = obtainStyledAttributes.getColor(3, this.A06);
        int color3 = obtainStyledAttributes.getColor(2, this.A06);
        this.A07 = color3;
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{this.A08, color3});
        this.A09 = gradientDrawable;
        gradientDrawable.mutate();
        this.A09.setCallback(this);
        this.A0E = obtainStyledAttributes.getBoolean(1, false);
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(obtainStyledAttributes.getColor(0, color2));
        paint.setStrokeWidth(1.0f);
        paint.setAntiAlias(true);
        if (obtainStyledAttributes.hasValue(4)) {
            setIconColor(obtainStyledAttributes.getColor(4, context2.getColor(R.color.audio_bar_action_color_enabled)));
        }
        obtainStyledAttributes.recycle();
        setWillNotDraw(false);
    }

    public void setText(int i) {
        String str;
        if (i != 0) {
            str = getContext().getString(i);
        } else {
            str = null;
        }
        setText(str);
    }

    public SlideInAndOutIconView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
