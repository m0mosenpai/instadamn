package com.instagram.ui.widget.stackedavatar;

import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC25228BEl;
import X.AbstractC31173DnH;
import X.AbstractC43592JPx;
import X.AbstractC55922hc;
import X.AbstractC81033jX;
import X.C3DY;
import X.C70823Whg;
import X.InterfaceC11380iw;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.facebook.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.base.IgFrameLayout;
import com.instagram.common.ui.widget.imageview.CircularImageView;

/* loaded from: classes8.dex */
public class StackedAvatarView extends IgFrameLayout {
    public int A00;
    public int A01;
    public int A02;
    public View A03;
    public View A04;
    public CircularImageView A05;
    public int A06;
    public ViewGroup A07;
    public CircularImageView A08;
    public boolean A09;

    private void A00() {
        this.A05.getLayoutParams().width = this.A00;
        this.A05.getLayoutParams().height = this.A00;
        this.A08.getLayoutParams().width = this.A00;
        this.A08.getLayoutParams().height = this.A00;
    }

    private void A01(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC55922hc.A2E);
        try {
            int A0C = AbstractC167017dG.A0C(context);
            this.A00 = A0C;
            if (obtainStyledAttributes.hasValue(0)) {
                this.A00 = obtainStyledAttributes.getDimensionPixelSize(0, this.A00);
            }
            if (obtainStyledAttributes.hasValue(2)) {
                this.A06 = obtainStyledAttributes.getDimensionPixelSize(2, AbstractC167017dG.A06(context));
            }
            if (obtainStyledAttributes.hasValue(3)) {
                this.A02 = obtainStyledAttributes.getDimensionPixelSize(3, AbstractC167017dG.A06(context));
            }
            this.A09 = obtainStyledAttributes.getBoolean(5, true);
            View inflate = AbstractC25228BEl.A0P(this).inflate(R.layout.stacked_avatar, (ViewGroup) this, true);
            this.A05 = AbstractC31173DnH.A0T(inflate, R.id.avatar_front);
            this.A08 = AbstractC31173DnH.A0T(inflate, R.id.avatar_back);
            this.A04 = inflate.requireViewById(R.id.avatar_front_background);
            this.A03 = inflate.requireViewById(R.id.avatar_back_background);
            this.A07 = AbstractC31173DnH.A0F(inflate, R.id.avatar_front_container);
            if (this.A00 != A0C || this.A06 != -1 || this.A02 != -1) {
                A00();
                A02(true);
                int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(1, AbstractC167017dG.A07(context));
                this.A01 = dimensionPixelSize;
                int i = this.A00 + (dimensionPixelSize * 2);
                AbstractC43592JPx.A1G(this.A04, i);
                AbstractC43592JPx.A1F(this.A04, i);
                AbstractC43592JPx.A1G(this.A03, i);
                AbstractC43592JPx.A1F(this.A03, i);
            }
            View view = this.A03;
            int i2 = 0;
            if (!obtainStyledAttributes.getBoolean(4, false)) {
                i2 = 8;
            }
            view.setVisibility(i2);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    private void A02(boolean z) {
        int i;
        int i2;
        this.A08.setVisibility(AbstractC167007dF.A05(z ? 1 : 0));
        int i3 = this.A02;
        if (i3 != -1) {
            i = 0;
        } else {
            if (z) {
                i3 = this.A06;
                if (i3 == -1) {
                    int A08 = AbstractC166997dE.A08(getResources());
                    i3 = (int) Math.floor((A08 * this.A00) / r1.getDimensionPixelSize(R.dimen.abc_star_medium));
                }
                i2 = i3;
                i = 0;
                ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(this.A07.getLayoutParams());
                marginLayoutParams.setMargins(i3, i2, 0, 0);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(marginLayoutParams);
                layoutParams.gravity = i;
                this.A07.setLayoutParams(layoutParams);
            }
            i = 17;
            i3 = 0;
        }
        i2 = 0;
        ViewGroup.MarginLayoutParams marginLayoutParams2 = new ViewGroup.MarginLayoutParams(this.A07.getLayoutParams());
        marginLayoutParams2.setMargins(i3, i2, 0, 0);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(marginLayoutParams2);
        layoutParams2.gravity = i;
        this.A07.setLayoutParams(layoutParams2);
    }

    public void setBackAvatarDrawable(Drawable drawable) {
        CircularImageView circularImageView = this.A08;
        if (drawable != null) {
            circularImageView.setImageDrawable(drawable);
        } else {
            circularImageView.A09();
        }
    }

    public void setBorderSize(int i) {
        this.A01 = i;
    }

    public void setColorFilterOnFrontIcon(ColorFilter colorFilter) {
        if (this.A05.getDrawable() != null) {
            AbstractC167027dH.A0d(colorFilter, this.A05.getDrawable());
        }
        this.A05.A0E = new C70823Whg(4, colorFilter, this);
    }

    public void setFrontAvatarDrawable(Drawable drawable) {
        CircularImageView circularImageView = this.A05;
        if (drawable != null) {
            circularImageView.setImageDrawable(drawable);
        } else {
            circularImageView.A09();
        }
    }

    public void setHorizontalAvatarOffset(int i) {
        this.A02 = i;
    }

    public StackedAvatarView(Context context) {
        super(context);
        this.A06 = -1;
        this.A02 = -1;
        A01(context, null);
    }

    public final void A03(Context context, int i) {
        this.A00 = AbstractC166997dE.A04(context, i);
        A00();
        int i2 = this.A00 + (this.A01 * 2);
        AbstractC43592JPx.A1G(this.A04, i2);
        AbstractC43592JPx.A1F(this.A04, i2);
        AbstractC43592JPx.A1G(this.A03, i2);
        AbstractC43592JPx.A1F(this.A03, i2);
    }

    public void setBackAvatarUrl(ImageUrl imageUrl, InterfaceC11380iw interfaceC11380iw) {
        boolean z;
        if (!AbstractC81033jX.A03(imageUrl)) {
            this.A08.setUrl(imageUrl, interfaceC11380iw);
            z = true;
        } else {
            this.A08.A09();
            z = this.A09;
        }
        A02(z);
    }

    public void setRingColor(int i) {
        ColorFilter A00 = C3DY.A00(i);
        Drawable background = this.A04.getBackground();
        background.getClass();
        background.setColorFilter(A00);
        Drawable background2 = this.A03.getBackground();
        background2.getClass();
        background2.setColorFilter(A00);
    }

    public void setUrls(ImageUrl imageUrl, ImageUrl imageUrl2, InterfaceC11380iw interfaceC11380iw) {
        boolean z;
        if (!AbstractC81033jX.A03(imageUrl)) {
            this.A05.setUrl(imageUrl, interfaceC11380iw);
        } else {
            this.A05.A09();
        }
        boolean A03 = AbstractC81033jX.A03(imageUrl2);
        CircularImageView circularImageView = this.A08;
        if (!A03) {
            circularImageView.setUrl(imageUrl2, interfaceC11380iw);
            z = true;
        } else {
            circularImageView.A09();
            z = this.A09;
        }
        A02(z);
    }

    public StackedAvatarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A06 = -1;
        this.A02 = -1;
        A01(context, attributeSet);
    }

    public StackedAvatarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A06 = -1;
        this.A02 = -1;
        A01(context, attributeSet);
    }
}
