package com.instagram.ui.widget.selectableview;

import X.AbstractC166987dD;
import X.AbstractC167007dF;
import X.AbstractC31177DnL;
import X.AbstractC43592JPx;
import X.AbstractC53242c7;
import X.AbstractC55922hc;
import X.C3DY;
import X.C55942hf;
import X.C55982hj;
import X.InterfaceC11380iw;
import X.Ut0;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.facebook.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerMediaFrameLayout;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes11.dex */
public class RoundedCornerCheckMarkSelectableImageView extends FrameLayout {
    public static final C55942hf A07 = C55942hf.A04(250.0d, 16.0d);
    public static final C55942hf A08 = C55942hf.A04(40.0d, 9.0d);
    public ImageView A00;
    public boolean A01;
    public int A02;
    public ImageView A03;
    public C55982hj A04;
    public RoundedCornerMediaFrameLayout A05;
    public final List A06;

    private void A01(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC55922hc.A22);
        if (obtainStyledAttributes.hasValue(2) && obtainStyledAttributes.hasValue(1)) {
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(2, 0);
            int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(1, 0);
            if (obtainStyledAttributes.hasValue(0)) {
                this.A02 = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            }
            obtainStyledAttributes.recycle();
            Context context2 = getContext();
            RoundedCornerMediaFrameLayout roundedCornerMediaFrameLayout = (RoundedCornerMediaFrameLayout) LayoutInflater.from(context2).inflate(R.layout.rounded_corner_check_mark_selectable_image_view, (ViewGroup) this, false);
            this.A05 = roundedCornerMediaFrameLayout;
            if (dimensionPixelSize != 0) {
                roundedCornerMediaFrameLayout.getLayoutParams().width = dimensionPixelSize;
                AbstractC43592JPx.A1F(this.A05, dimensionPixelSize2);
            }
            this.A05.setRadius(this.A02);
            this.A06.add(this.A05.findViewById(R.id.selectable_image));
            ImageView imageView = (ImageView) this.A05.requireViewById(R.id.select_check_mark);
            this.A00 = imageView;
            AbstractC31177DnL.A0p(context2, imageView, R.color.design_dark_default_color_on_background);
            this.A03 = (ImageView) this.A05.requireViewById(R.id.type_icon);
            addView(this.A05);
            return;
        }
        throw new RuntimeException("Width and height required");
    }

    public final void A02() {
        List list = this.A06;
        ((ImageView) list.get(0)).setImageDrawable(null);
        ((View) list.get(0)).setBackgroundResource(AbstractC53242c7.A0H(getContext(), R.attr.elevatedImagePlaceholderColor));
    }

    public int getDisabledAlpha() {
        return 0;
    }

    public List getImageViews() {
        return this.A06;
    }

    public ImageView getOverlayImage() {
        return this.A00;
    }

    public void setImageDrawable(Drawable drawable) {
        ((ImageView) AbstractC166987dD.A16(this.A06)).setImageDrawable(drawable);
    }

    @Override // android.view.View
    public void setSelected(boolean z) {
        ColorFilter colorFilter;
        for (ImageView imageView : this.A06) {
            if (z) {
                colorFilter = getColorFilter();
            } else {
                colorFilter = null;
            }
            imageView.setColorFilter(colorFilter);
        }
        ImageView imageView2 = this.A00;
        if (imageView2 != null) {
            imageView2.setVisibility(AbstractC167007dF.A05(z ? 1 : 0));
        }
        invalidate();
        requestLayout();
    }

    public void setTypeIconDrawable(Drawable drawable) {
        ImageView imageView;
        int i;
        if (drawable != null) {
            this.A03.setImageDrawable(drawable);
            imageView = this.A03;
            i = 0;
        } else {
            imageView = this.A03;
            i = 8;
        }
        imageView.setVisibility(i);
    }

    public void setUrl(ImageUrl imageUrl, InterfaceC11380iw interfaceC11380iw) {
        ((IgImageView) AbstractC166987dD.A16(this.A06)).setUrl(imageUrl, interfaceC11380iw);
    }

    public RoundedCornerCheckMarkSelectableImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A01 = false;
        A00();
        this.A06 = new ArrayList();
        A01(context, attributeSet);
    }

    private void A00() {
        C55982hj A0R = AbstractC167007dF.A0R();
        A0R.A00 = 0.01d;
        A0R.A0A(new Ut0(this));
        this.A04 = A0R;
    }

    public ColorFilter getColorFilter() {
        return C3DY.A00(getContext().getColor(R.color.black_60_transparent));
    }

    public void setAnimatePress(boolean z) {
        this.A01 = z;
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        double d;
        super.setPressed(z);
        if (this.A01) {
            C55982hj c55982hj = this.A04;
            if (z) {
                c55982hj.A09(A07);
                d = 1.0d;
            } else {
                c55982hj.A09(A08);
                d = 0.0d;
            }
            c55982hj.A06(d);
        }
    }

    public RoundedCornerCheckMarkSelectableImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A01 = false;
        A00();
        this.A06 = new ArrayList();
        A01(context, attributeSet);
    }

    public RoundedCornerCheckMarkSelectableImageView(Context context) {
        super(context);
        this.A01 = false;
        A00();
        this.A06 = new ArrayList();
        A01(context, null);
    }
}
