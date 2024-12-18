package com.instagram.ui.widget.loadmore2;

import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.EnumC33419Epq;
import X.GX0;
import X.ViewOnClickListenerC35682FpH;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ViewAnimator;
import com.facebook.R;
import com.instagram.ui.widget.spinner.SpinnerImageView;

/* loaded from: classes6.dex */
public class LoadMoreButton extends ViewAnimator {
    public View A00;
    public ImageView A01;
    public ImageView A02;
    public GX0 A03;

    public LoadMoreButton(Context context) {
        this(context, null);
    }

    public void setState(EnumC33419Epq enumC33419Epq) {
        this.A00.setVisibility(AbstractC167007dF.A05(enumC33419Epq.A01 ? 1 : 0));
        this.A01.setVisibility(AbstractC167007dF.A05(enumC33419Epq.A00 ? 1 : 0));
        this.A02.setVisibility(AbstractC167007dF.A05(enumC33419Epq.A02 ? 1 : 0));
        if (enumC33419Epq == EnumC33419Epq.NONE) {
            setVisibility(8);
        } else {
            setVisibility(0);
        }
    }

    public void setDelegate(GX0 gx0) {
        this.A03 = gx0;
    }

    public LoadMoreButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, 17);
        Context context2 = getContext();
        SpinnerImageView spinnerImageView = new SpinnerImageView(context2);
        this.A00 = spinnerImageView;
        spinnerImageView.setBackgroundResource(R.drawable.spinner_large);
        this.A00.setLayoutParams(layoutParams);
        addView(this.A00);
        ImageView imageView = new ImageView(context2);
        this.A01 = imageView;
        AbstractC166997dE.A19(context2, imageView, R.drawable.loadmore_add_compound);
        this.A01.setLayoutParams(layoutParams);
        addView(this.A01);
        ImageView imageView2 = new ImageView(context2);
        this.A02 = imageView2;
        AbstractC166997dE.A19(context2, imageView2, R.drawable.loadmore_icon_refresh_compound);
        this.A02.setLayoutParams(layoutParams);
        addView(this.A02);
        ViewOnClickListenerC35682FpH A00 = ViewOnClickListenerC35682FpH.A00(this, 20);
        this.A01.setOnClickListener(A00);
        this.A02.setOnClickListener(A00);
        setState(EnumC33419Epq.NONE);
    }
}
