package com.facebook.smartcapture.components;

import X.AbstractC47961LGz;
import X.AbstractC47994LKy;
import X.C14360o3;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;

/* loaded from: classes8.dex */
public final class ContourView extends FrameLayout {
    public int A00;
    public int A01;
    public boolean A02;
    public final float A03;
    public final float A04;
    public final int A05;
    public final ImageView A06;
    public final ImageView A07;
    public final ImageView A08;
    public final ImageView A09;
    public final TextView A0A;
    public final DarkenedFrameView A0B;
    public final DottedAlignmentView A0C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContourView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C14360o3.A0B(context, 1);
        View.inflate(getContext(), R.layout.contour_view, this);
        this.A0C = (DottedAlignmentView) AbstractC47961LGz.A00(this, R.id.dotted_alignment_view);
        this.A0B = (DarkenedFrameView) AbstractC47961LGz.A00(this, R.id.darkened_frame_view);
        this.A08 = AbstractC47961LGz.A01(this, R.id.iv_contour_top_left);
        this.A09 = AbstractC47961LGz.A01(this, R.id.iv_contour_top_right);
        this.A06 = AbstractC47961LGz.A01(this, R.id.iv_contour_bottom_left);
        this.A07 = AbstractC47961LGz.A01(this, R.id.iv_contour_bottom_right);
        this.A0A = AbstractC47961LGz.A02(this, R.id.tv_text_tip);
        Resources resources = getResources();
        this.A03 = resources.getDimension(R.dimen.abc_action_bar_elevation_material);
        this.A04 = resources.getDimension(R.dimen.abc_control_corner_material);
        this.A05 = AbstractC47994LKy.A01(context, R.attr.sc_positive);
        this.A01 = 0;
        this.A00 = 0;
        setAlpha(0.0f);
        this.A02 = true;
    }

    public final View getTextTip() {
        return this.A0A;
    }

    public final void setTextTip(CharSequence charSequence) {
        this.A0A.setText(charSequence);
    }
}
