package com.instagram.business.ui;

import X.AbstractC111324zv;
import X.AbstractC12990ll;
import X.AbstractC1567472a;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC167027dH;
import X.AbstractC31172DnG;
import X.AbstractC31173DnH;
import X.AbstractC55922hc;
import X.C14360o3;
import X.ViewTreeObserverOnGlobalLayoutListenerC35716Fpq;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.text.TitleTextView;
import com.instagram.ui.widget.spinner.RefreshSpinner;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class BusinessNavBar extends LinearLayout {
    public View A00;
    public View A01;
    public LinearLayout A02;
    public TitleTextView A03;
    public View A04;
    public TextView A05;
    public TextView A06;
    public RefreshSpinner A07;
    public CharSequence A08;
    public boolean A09;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BusinessNavBar(Context context) {
        this(context, null);
        C14360o3.A0B(context, 1);
    }

    public final void setFooterTerms(AbstractC12990ll abstractC12990ll, String str, String str2) {
        AbstractC167027dH.A12(abstractC12990ll, str, str2);
        AbstractC1567472a.A07(getContext(), this.A05, abstractC12990ll, str, str2, AbstractC111324zv.A00(437));
    }

    public final void A00() {
        View view = this.A04;
        if (view != null) {
            boolean z = true;
            int i = 0;
            boolean A1P = AbstractC167007dF.A1P(this.A03.getVisibility(), 8);
            if (this.A02.getVisibility() != 8) {
                z = false;
            }
            if (!A1P || !z) {
                i = 8;
            }
            view.setVisibility(i);
        }
    }

    public final void A02(boolean z) {
        this.A03.setVisibility(AbstractC167007dF.A05(z ? 1 : 0));
        A00();
    }

    public final void setPrimaryButtonEnabled(boolean z) {
        this.A06.setEnabled(z);
        View view = this.A01;
        if (view.getBackground() != null) {
            Drawable background = view.getBackground();
            int i = 64;
            if (z) {
                i = 255;
            }
            background.setAlpha(i);
        }
    }

    public final void setPrimaryButtonOnclickListeners(View.OnClickListener onClickListener) {
        this.A06.setOnClickListener(onClickListener);
    }

    public final void setSecondaryButtonEnabled(boolean z) {
        TitleTextView titleTextView = this.A03;
        titleTextView.setEnabled(z);
        int i = 64;
        if (z) {
            i = 255;
        }
        titleTextView.setAlpha(i);
    }

    public final void setSecondaryButtonOnclickListeners(View.OnClickListener onClickListener) {
        this.A03.setOnClickListener(onClickListener);
    }

    public final void setSecondaryButtonText(int i) {
        AbstractC31173DnH.A19(getResources(), this.A03, i);
    }

    public final void setShowProgressBarOnPrimaryButton(boolean z) {
        CharSequence charSequence;
        if (this.A09 != z) {
            this.A09 = z;
            RefreshSpinner refreshSpinner = this.A07;
            int i = 4;
            if (z) {
                i = 0;
            }
            refreshSpinner.setVisibility(i);
            TextView textView = this.A06;
            if (z) {
                charSequence = "";
            } else {
                charSequence = this.A08;
            }
            textView.setText(charSequence);
            setPrimaryButtonEnabled(!z);
        }
    }

    public final void A01(View view) {
        getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC35716Fpq(0, view, this));
    }

    public final void setPrimaryButtonText(int i) {
        setPrimaryButtonText(AbstractC166997dE.A0q(getResources(), i));
    }

    public final void setFooterTerms(AbstractC12990ll abstractC12990ll, String str, String str2, String str3) {
        C14360o3.A0B(abstractC12990ll, 0);
        AbstractC167027dH.A13(str, str2, str3);
        AbstractC1567472a.A07(getContext(), this.A05, abstractC12990ll, str, str2, str3);
    }

    public final void setPrimaryButtonText(CharSequence charSequence) {
        C14360o3.A0B(charSequence, 0);
        this.A08 = charSequence;
        this.A06.setText(charSequence);
    }

    public final void setSecondaryButtonText(CharSequence charSequence) {
        this.A03.setText(charSequence);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BusinessNavBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int resourceId;
        int resourceId2;
        C14360o3.A0B(context, 1);
        Context context2 = getContext();
        View inflate = LayoutInflater.from(context2).inflate(R.layout.business_nav_bar, this);
        this.A01 = inflate.requireViewById(R.id.primary_button_container);
        this.A06 = AbstractC166997dE.A0T(inflate, R.id.primary_button_text);
        this.A07 = (RefreshSpinner) inflate.requireViewById(R.id.primary_button_progress);
        this.A03 = (TitleTextView) inflate.requireViewById(R.id.secondary_button);
        this.A02 = AbstractC31172DnG.A0B(inflate, R.id.business_fb_page_footer);
        this.A05 = AbstractC166997dE.A0T(inflate, R.id.business_fb_page_footer_text);
        this.A00 = inflate.requireViewById(R.id.divider_line);
        this.A04 = inflate.requireViewById(R.id.bb_extra_padding);
        this.A08 = "";
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, AbstractC55922hc.A0B);
            C14360o3.A07(obtainStyledAttributes);
            if (obtainStyledAttributes.hasValue(0) && (resourceId2 = obtainStyledAttributes.getResourceId(0, 0)) != 0) {
                setPrimaryButtonText(AbstractC166997dE.A0p(context, resourceId2));
            }
            if (obtainStyledAttributes.hasValue(1) && (resourceId = obtainStyledAttributes.getResourceId(1, 0)) != 0) {
                setSecondaryButtonText(context.getString(resourceId));
            }
            if (obtainStyledAttributes.hasValue(2) && obtainStyledAttributes.getBoolean(2, false)) {
                this.A03.setVisibility(0);
            }
            if (obtainStyledAttributes.hasValue(3) && obtainStyledAttributes.getBoolean(3, false)) {
                this.A02.setVisibility(0);
            }
            A00();
            obtainStyledAttributes.recycle();
        }
    }

    public /* synthetic */ BusinessNavBar(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    public final void setFooterTerms(CharSequence charSequence) {
        this.A05.setText(charSequence);
    }
}
