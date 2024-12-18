package com.instagram.creation.capture.quickcapture.ephemeralmediatoggle;

import X.AN6;
import X.C14360o3;
import X.C199038r6;
import X.C9C4;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.R;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class EphemeralMediaToggleView extends LinearLayout {
    public final ImageView A00;
    public final ImageView A01;
    public final TextView A02;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EphemeralMediaToggleView(Context context) {
        this(context, null, 0);
        C14360o3.A0B(context, 1);
    }

    public final void A00(C9C4 c9c4) {
        ImageView imageView;
        this.A02.setText(c9c4.A04);
        ImageView imageView2 = this.A01;
        Drawable drawable = (Drawable) c9c4.A02;
        imageView2.setImageDrawable(drawable);
        if (drawable instanceof C199038r6) {
            ((C199038r6) drawable).start();
            int intValue = ((Number) c9c4.A01).intValue();
            if (intValue != 0) {
                if (intValue != 2 && intValue != 1) {
                    throw new RuntimeException();
                }
                ImageView imageView3 = this.A00;
                if (imageView3.getRotation() == 0.0f) {
                    imageView3.setImageDrawable((Drawable) c9c4.A03);
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(imageView3, (Property<ImageView, Float>) View.ROTATION, 0.0f, -90.0f);
                    ofFloat.setDuration(250L);
                    ofFloat.setInterpolator(new OvershootInterpolator(1.0f));
                    ofFloat.start();
                    return;
                }
                return;
            }
            imageView = this.A00;
            if (imageView.getRotation() != 0.0f) {
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) View.ROTATION, -90.0f, 0.0f);
                ofFloat2.setDuration(250L);
                ofFloat2.start();
                ofFloat2.addListener(new AN6(c9c4, this));
                return;
            }
        } else {
            imageView = this.A00;
        }
        imageView.setImageDrawable((Drawable) c9c4.A03);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EphemeralMediaToggleView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        View inflate = LayoutInflater.from(context).inflate(R.layout.igd_ephemeral_toggle_view, (ViewGroup) this, true);
        this.A02 = (TextView) inflate.findViewById(R.id.label);
        this.A01 = (ImageView) inflate.findViewById(R.id.icon);
        this.A00 = (ImageView) inflate.findViewById(R.id.outline);
    }

    public /* synthetic */ EphemeralMediaToggleView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EphemeralMediaToggleView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C14360o3.A0B(context, 1);
    }
}
