package com.instagram.creation.capture.quickcapture.direct.view;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC25231BEo;
import X.AbstractC53242c7;
import X.C14360o3;
import X.C28514Ci8;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.R;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class ReshareTogglePickerView extends LinearLayout {
    public ObjectAnimator A00;
    public final ImageView A01;
    public final TextView A02;
    public final long A03;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ReshareTogglePickerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C14360o3.A0B(context, 1);
    }

    public final void A00(Integer num) {
        int i;
        C14360o3.A0B(num, 0);
        Context A0L = AbstractC166997dE.A0L(this);
        if (num.intValue() != 0) {
            i = R.drawable.instagram_reshare_off_pano_outline_24;
        } else {
            i = R.drawable.instagram_reshare_pano_outline_24;
        }
        Drawable drawable = A0L.getDrawable(i);
        if (drawable != null) {
            AbstractC25231BEo.A0x(A0L, drawable, AbstractC53242c7.A0H(A0L, R.attr.igds_color_primary_button_on_media));
        }
        ObjectAnimator objectAnimator = this.A00;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.A01, (Property<ImageView, Float>) View.ROTATION, -90.0f, 0.0f);
        ofFloat.setDuration(this.A03);
        this.A00 = ofFloat;
        ofFloat.start();
        ObjectAnimator objectAnimator2 = this.A00;
        if (objectAnimator2 != null) {
            objectAnimator2.addListener(new C28514Ci8(1, this, drawable, num));
        }
    }

    public /* synthetic */ ReshareTogglePickerView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReshareTogglePickerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        this.A03 = 100L;
        View inflate = LayoutInflater.from(context).inflate(R.layout.igd_ephemeral_toggle_view, (ViewGroup) this, true);
        this.A02 = AbstractC166987dD.A0e(inflate, R.id.label);
        this.A01 = (ImageView) inflate.findViewById(R.id.icon);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ReshareTogglePickerView(Context context) {
        this(context, null, 0);
        C14360o3.A0B(context, 1);
    }
}
