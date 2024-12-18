package com.instagram.ui.widget.selectableview;

import X.AbstractC13880nE;
import X.AbstractC167017dG;
import X.AbstractC31173DnH;
import X.AbstractC31174DnI;
import X.AbstractC31177DnL;
import X.AbstractC31776DxZ;
import X.AbstractC55922hc;
import X.C14360o3;
import X.U8N;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;

/* loaded from: classes6.dex */
public class DoubleSelectableAvatar extends AbstractC31776DxZ {
    public int A00;
    public ImageView A01;
    public CircularImageView A02;
    public CircularImageView A03;

    private void A00(Context context, AttributeSet attributeSet) {
        boolean z;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC55922hc.A0S);
        Context context2 = getContext();
        int dimensionPixelSize = context2.getResources().getDimensionPixelSize(R.dimen.abc_alert_dialog_button_dimen);
        this.A00 = dimensionPixelSize;
        if (obtainStyledAttributes.hasValue(0)) {
            this.A00 = obtainStyledAttributes.getDimensionPixelSize(0, this.A00);
        }
        if (obtainStyledAttributes.hasValue(1)) {
            z = obtainStyledAttributes.getBoolean(1, true);
        } else {
            z = true;
        }
        obtainStyledAttributes.recycle();
        View inflate = LayoutInflater.from(context2).inflate(R.layout.selectable_avatar_double, (ViewGroup) this, true);
        this.A03 = AbstractC31173DnH.A0T(inflate, R.id.selectable_avatar_front);
        this.A02 = AbstractC31173DnH.A0T(inflate, R.id.selectable_avatar_back);
        ImageView A0I = AbstractC31173DnH.A0I(inflate, R.id.select_check_mark);
        this.A01 = A0I;
        AbstractC31177DnL.A0p(context2, A0I, R.color.design_dark_default_color_on_background);
        if (this.A00 != dimensionPixelSize) {
            this.A00 = (int) Math.floor((this.A00 * dimensionPixelSize) / context2.getResources().getDimensionPixelSize(R.dimen.action_bar_plus_shadow_height));
            this.A03.getLayoutParams().width = this.A00;
            this.A03.getLayoutParams().height = this.A00;
            this.A02.getLayoutParams().width = this.A00;
            this.A02.getLayoutParams().height = this.A00;
            View requireViewById = inflate.requireViewById(R.id.selectable_avatar_front_container);
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            RectF rectF = AbstractC13880nE.A01;
            int floor = (int) Math.floor((((int) TypedValue.applyDimension(1, 10.0f, displayMetrics)) * this.A00) / dimensionPixelSize);
            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(requireViewById.getLayoutParams());
            marginLayoutParams.setMargins(floor, floor, 0, 0);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(marginLayoutParams);
            layoutParams.gravity = 0;
            requireViewById.setLayoutParams(layoutParams);
            View requireViewById2 = inflate.requireViewById(R.id.selectable_avatar_front_background);
            int A07 = this.A00 + (AbstractC167017dG.A07(context2) * 2);
            requireViewById2.getLayoutParams().width = A07;
            requireViewById2.getLayoutParams().height = A07;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.A02.getLayoutParams();
        if (z) {
            int A072 = AbstractC167017dG.A07(context2);
            marginLayoutParams2.setMargins(A072, A072, 0, 0);
        } else {
            super.A01 = 0;
            marginLayoutParams2.setMargins(0, 0, 0, 0);
        }
        super.A02 = getStrokeDrawable();
    }

    public void setCheckmark(boolean z) {
        ImageView imageView;
        int i;
        if (z) {
            ColorFilter A09 = AbstractC31174DnI.A09(getContext(), R.color.black_60_transparent);
            this.A03.setColorFilter(A09);
            this.A02.setColorFilter(A09);
            imageView = this.A01;
            i = 0;
        } else {
            this.A03.setColorFilter((ColorFilter) null);
            this.A02.setColorFilter((ColorFilter) null);
            imageView = this.A01;
            i = 8;
        }
        imageView.setVisibility(i);
    }

    public DoubleSelectableAvatar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00(context, attributeSet);
    }

    @Override // X.AbstractC31776DxZ, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.A03.setAlpha(255);
        this.A02.setAlpha(255);
    }

    @Override // X.AbstractC31776DxZ
    public Drawable getStrokeDrawable() {
        Context context = getContext();
        return new U8N(AbstractC167017dG.A07(context), AbstractC31173DnH.A02(context), this.A00, AbstractC167017dG.A04(context));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DoubleSelectableAvatar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        C14360o3.A0B(context, 1);
        A00(context, attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DoubleSelectableAvatar(Context context) {
        super(context, null, 0);
        C14360o3.A0B(context, 1);
        A00(context, null);
    }
}
