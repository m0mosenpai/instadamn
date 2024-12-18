package com.instagram.ui.widget.selectableview;

import X.AbstractC167017dG;
import X.AbstractC31173DnH;
import X.AbstractC31177DnL;
import X.AbstractC31776DxZ;
import X.AbstractC55922hc;
import X.C14360o3;
import X.C58932mr;
import X.InterfaceC11380iw;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.facebook.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.CircularImageView;

/* loaded from: classes6.dex */
public class SingleSelectableAvatar extends AbstractC31776DxZ {
    public ImageView A00;
    public CircularImageView A01;

    private void A00(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC55922hc.A2C);
        int i = 0;
        if (obtainStyledAttributes.hasValue(0)) {
            i = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        }
        obtainStyledAttributes.recycle();
        Context context2 = getContext();
        View inflate = LayoutInflater.from(context2).inflate(R.layout.selectable_avatar_single, (ViewGroup) this, true);
        this.A01 = AbstractC31173DnH.A0T(inflate, R.id.selectable_avatar);
        ImageView A0I = AbstractC31173DnH.A0I(inflate, R.id.select_check_mark);
        this.A00 = A0I;
        AbstractC31177DnL.A0p(context2, A0I, R.color.design_dark_default_color_on_background);
        if (i != 0) {
            this.A01.getLayoutParams().width = i;
            this.A01.getLayoutParams().height = i;
        }
    }

    public void setCheckmark(boolean z) {
        ImageView imageView;
        int i;
        CircularImageView circularImageView = this.A01;
        if (z) {
            AbstractC31177DnL.A0p(getContext(), circularImageView, R.color.black_60_transparent);
            imageView = this.A00;
            i = 0;
        } else {
            circularImageView.setColorFilter((ColorFilter) null);
            imageView = this.A00;
            i = 8;
        }
        imageView.setVisibility(i);
    }

    public void setImageDrawable(Drawable drawable) {
        this.A01.setImageDrawable(drawable);
    }

    public void setUrl(ImageUrl imageUrl, InterfaceC11380iw interfaceC11380iw) {
        this.A01.setUrl(imageUrl, interfaceC11380iw);
    }

    public SingleSelectableAvatar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00(context, attributeSet);
    }

    @Override // X.AbstractC31776DxZ, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.A01.setAlpha(255);
    }

    @Override // X.AbstractC31776DxZ
    public Drawable getStrokeDrawable() {
        Context context = getContext();
        return new C58932mr(AbstractC167017dG.A07(context), AbstractC31173DnH.A02(context));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleSelectableAvatar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        C14360o3.A0B(context, 1);
        A00(context, attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleSelectableAvatar(Context context) {
        super(context, null, 0);
        C14360o3.A0B(context, 1);
        A00(context, null);
    }
}
