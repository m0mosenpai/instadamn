package com.instagram.arcommerce.view;

import X.BBL;
import X.C14360o3;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.facebook.R;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class IgCommerceCameraToggleButton extends FrameLayout implements BBL {
    public Drawable A00;
    public Drawable A01;
    public View A02;
    public ImageView A03;
    public View A04;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IgCommerceCameraToggleButton(Context context) {
        this(context, null, 0);
        C14360o3.A0B(context, 1);
    }

    @Override // X.BBL
    public void setOnClick(View.OnClickListener onClickListener) {
        C14360o3.A0B(onClickListener, 0);
        setOnClickListener(onClickListener);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IgCommerceCameraToggleButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        View inflate = LayoutInflater.from(context).inflate(R.layout.camera_toggle_layout, this);
        this.A04 = inflate;
        if (inflate != null) {
            this.A03 = (ImageView) inflate.requireViewById(R.id.toggle_button_icon);
            this.A02 = inflate.requireViewById(R.id.toggle_selected_background);
        }
    }

    public /* synthetic */ IgCommerceCameraToggleButton(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IgCommerceCameraToggleButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C14360o3.A0B(context, 1);
    }
}
