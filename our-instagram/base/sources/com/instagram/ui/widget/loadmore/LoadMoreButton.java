package com.instagram.ui.widget.loadmore;

import X.AbstractC55922hc;
import X.C05F;
import X.InterfaceC62602sz;
import X.InterfaceC64472w6;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ViewAnimator;
import com.facebook.R;
import com.instagram.ui.widget.loadmore.LoadMoreButton;
import com.instagram.ui.widget.spinner.SpinnerImageView;

/* loaded from: classes2.dex */
public class LoadMoreButton extends ViewAnimator {
    public InterfaceC62602sz A00;
    public final float A01;

    public LoadMoreButton(Context context) {
        this(context, null);
    }

    public final void A04(final InterfaceC62602sz interfaceC62602sz, final InterfaceC64472w6 interfaceC64472w6) {
        String str;
        this.A00 = interfaceC62602sz;
        getChildAt(2).setOnClickListener(new View.OnClickListener() { // from class: X.48g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int A05 = C0f9.A05(-197086373);
                LoadMoreButton loadMoreButton = this;
                InterfaceC62602sz interfaceC62602sz2 = loadMoreButton.A00;
                interfaceC62602sz2.getClass();
                interfaceC62602sz2.Chd();
                loadMoreButton.setViewType(interfaceC62602sz, interfaceC64472w6);
                C0f9.A0C(328258499, A05);
            }
        });
        getChildAt(3).setOnClickListener(new View.OnClickListener() { // from class: X.48h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int A05 = C0f9.A05(-718497519);
                LoadMoreButton loadMoreButton = this;
                InterfaceC62602sz interfaceC62602sz2 = loadMoreButton.A00;
                interfaceC62602sz2.getClass();
                interfaceC62602sz2.Chd();
                loadMoreButton.setViewType(interfaceC62602sz, interfaceC64472w6);
                C0f9.A0C(-661335250, A05);
            }
        });
        if (!A03(interfaceC62602sz)) {
            setVisibility(8);
            return;
        }
        setVisibility(0);
        if (interfaceC64472w6 != null) {
            switch (A01(this.A00).intValue()) {
                case 0:
                    str = "INDEX_NO_ITEMS";
                    break;
                case 1:
                    str = "INDEX_LOADING";
                    break;
                case 2:
                    str = "INDEX_LOAD_MORE";
                    break;
                case 3:
                    str = "INDEX_RETRY";
                    break;
                default:
                    str = "UNKNOWN";
                    break;
            }
            interfaceC64472w6.DPp(str);
        }
        setViewType(interfaceC62602sz, interfaceC64472w6);
    }

    public static View A00(Context context, int i, ViewGroup viewGroup) {
        LayoutInflater from = LayoutInflater.from(context);
        View inflate = from.inflate(R.layout.row_load_more, viewGroup, false);
        View findViewById = inflate.findViewById(R.id.row_load_more_button);
        findViewById.getClass();
        ViewGroup viewGroup2 = (ViewGroup) findViewById;
        View inflate2 = from.inflate(i, viewGroup2, false);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, 17);
        SpinnerImageView spinnerImageView = new SpinnerImageView(context);
        spinnerImageView.setBackgroundResource(R.drawable.spinner_large);
        spinnerImageView.setLayoutParams(layoutParams);
        spinnerImageView.setContentDescription(context.getResources().getString(2131965660));
        ImageView imageView = new ImageView(context);
        imageView.setImageDrawable(context.getDrawable(R.drawable.loadmore_add_compound));
        imageView.setLayoutParams(layoutParams);
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageDrawable(context.getDrawable(R.drawable.loadmore_icon_refresh_compound));
        imageView2.setContentDescription(context.getResources().getString(2131972568));
        imageView2.setLayoutParams(layoutParams);
        viewGroup2.addView(inflate2, 0);
        viewGroup2.addView(spinnerImageView, 1);
        viewGroup2.addView(imageView, 2);
        viewGroup2.addView(imageView2, 3);
        return inflate;
    }

    public static Integer A01(InterfaceC62602sz interfaceC62602sz) {
        if (interfaceC62602sz.isLoading()) {
            return C05F.A01;
        }
        if (interfaceC62602sz.CUG()) {
            return C05F.A0N;
        }
        if (!interfaceC62602sz.CL7()) {
            return C05F.A00;
        }
        if (interfaceC62602sz.CLJ()) {
            return C05F.A0C;
        }
        return C05F.A0Y;
    }

    public static boolean A03(InterfaceC62602sz interfaceC62602sz) {
        if (interfaceC62602sz.CXf()) {
            if (interfaceC62602sz.isLoading() || interfaceC62602sz.CUG() || interfaceC62602sz.CLJ() || !interfaceC62602sz.CL7()) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setViewType(InterfaceC62602sz interfaceC62602sz, InterfaceC64472w6 interfaceC64472w6) {
        if (interfaceC62602sz.isLoading() && interfaceC64472w6 != null) {
            interfaceC64472w6.Dky();
        }
        Integer A01 = A01(interfaceC62602sz);
        if (C05F.A0Y != A01) {
            setDisplayedChild(A01.intValue());
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int round;
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        float f = this.A01;
        if (f == -1.0f) {
            round = getMeasuredHeight();
        } else {
            round = Math.round(getMeasuredWidth() / f);
        }
        setMeasuredDimension(measuredWidth, round);
    }

    public LoadMoreButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC55922hc.A1g);
        this.A01 = obtainStyledAttributes.getFloat(0, -1.0f);
        obtainStyledAttributes.recycle();
    }
}
