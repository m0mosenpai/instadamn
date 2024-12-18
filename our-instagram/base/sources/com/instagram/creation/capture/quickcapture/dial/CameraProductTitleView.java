package com.instagram.creation.capture.quickcapture.dial;

import X.AbstractC1566271k;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC55922hc;
import X.C14360o3;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.user.model.Product;
import java.util.Locale;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class CameraProductTitleView extends LinearLayout {
    public Drawable A00;
    public boolean A01;
    public boolean A02;
    public TextView A03;
    public TextView A04;
    public Integer A05;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CameraProductTitleView(Context context) {
        this(context, null);
        C14360o3.A0B(context, 1);
    }

    public final void setProduct(Product product) {
        TextView textView;
        String str;
        int i = 8;
        if (product != null) {
            TextView textView2 = this.A04;
            String str2 = product.A0J;
            if (str2 != null) {
                str = AbstractC166997dE.A10(Locale.ROOT, str2);
            } else {
                str = null;
            }
            textView2.setText(str);
            if (this.A01) {
                this.A03.setText(TextUtils.concat(" · ", AbstractC1566271k.A08(getContext(), product, this.A05, null)));
            }
            textView = this.A03;
            if (this.A02) {
                textView2.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
                textView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, this.A00, (Drawable) null);
            }
            textView2.setGravity(8388611);
            if (this.A01) {
                i = 0;
            }
        } else {
            TextView textView3 = this.A04;
            textView3.setText(2131976057);
            textView = this.A03;
            if (this.A02) {
                textView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
                textView3.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, this.A00, (Drawable) null);
            }
            textView3.setGravity(17);
        }
        textView.setVisibility(i);
    }

    public final void setPriceVisibility(boolean z) {
        this.A01 = z;
    }

    public /* synthetic */ CameraProductTitleView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CameraProductTitleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C14360o3.A0B(context, 1);
        this.A01 = true;
        LayoutInflater.from(context).inflate(R.layout.camera_product_title_view, this);
        this.A04 = AbstractC166987dD.A0e(this, R.id.title);
        this.A03 = AbstractC166997dE.A0T(this, R.id.price);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC55922hc.A0C);
            C14360o3.A07(obtainStyledAttributes);
            boolean z = obtainStyledAttributes.getBoolean(0, false);
            this.A02 = z;
            if (z) {
                this.A00 = context.getDrawable(R.drawable.dial_element_title_chevron);
                this.A03.setCompoundDrawablePadding(context.getResources().getDimensionPixelSize(R.dimen.afi_indicator_arrow_margin_top));
            }
            if (obtainStyledAttributes.hasValue(1)) {
                int resourceId = obtainStyledAttributes.getResourceId(1, R.style.TextViewStyle);
                Integer valueOf = Integer.valueOf(resourceId);
                this.A05 = valueOf;
                if (valueOf != null) {
                    this.A04.setTextAppearance(resourceId);
                }
                Integer num = this.A05;
                if (num != null) {
                    this.A03.setTextAppearance(num.intValue());
                }
            }
            obtainStyledAttributes.recycle();
        }
    }
}
