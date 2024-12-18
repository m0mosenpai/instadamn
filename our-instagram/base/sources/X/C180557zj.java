package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import com.facebook.R;
import java.util.List;

/* renamed from: X.7zj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C180557zj extends C5RN {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final Context A04;
    public final Resources A05;
    public final Drawable A06;
    public final GradientDrawable A07;

    public C180557zj(Context context, Integer num, int i, int i2) {
        int i3;
        int i4;
        C14360o3.A0B(context, 1);
        this.A04 = context;
        this.A03 = i;
        Resources resources = context.getResources();
        this.A05 = resources;
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.abc_control_corner_material);
        this.A01 = dimensionPixelSize;
        int intValue = num.intValue();
        if (intValue != 0) {
            if (intValue != 1) {
                if (intValue == 2) {
                    i3 = R.dimen.asset_picker_section_title_horizontal_padding;
                } else {
                    throw new RuntimeException();
                }
            } else {
                i3 = R.dimen.abc_select_dialog_padding_start_material;
            }
        } else {
            i3 = R.dimen.abc_alert_dialog_button_dimen;
        }
        this.A00 = resources.getDimensionPixelSize(i3);
        if (intValue != 0) {
            i4 = R.dimen.afi_margin_top;
            if (intValue != 1) {
                i4 = R.dimen.account_discovery_bottom_gap;
            }
        } else {
            i4 = R.dimen.abc_dialog_padding_material;
        }
        this.A02 = resources.getDimensionPixelSize(i4);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_gradient_pink)));
        gradientDrawable.setCallback(this);
        gradientDrawable.setStroke(dimensionPixelSize, i);
        this.A07 = gradientDrawable;
        Drawable drawable = context.getDrawable(i2);
        if (drawable != null) {
            drawable.setColorFilter(C3DY.A00(-1));
            drawable.setCallback(this);
            this.A06 = drawable;
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        this.A07.draw(canvas);
        this.A06.draw(canvas);
    }

    @Override // X.C5RN
    public final List A07() {
        return AbstractC16960so.A1Q(this.A07, this.A06);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.A00;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.A00;
    }

    @Override // X.C5RN, android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        int color;
        super.setAlpha(i);
        GradientDrawable gradientDrawable = this.A07;
        int i2 = this.A01;
        if (i == C1H4.A01(255.0f)) {
            color = this.A03;
        } else {
            color = this.A04.getColor(R.color.primary_text_disabled_material_dark);
        }
        gradientDrawable.setStroke(i2, color);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        float f = (i + i3) / 2.0f;
        float f2 = (i2 + i4) / 2.0f;
        this.A07.setBounds(i, i2, i3, i4);
        Drawable drawable = this.A06;
        float f3 = this.A02 / 2;
        drawable.setBounds((int) (f - f3), (int) (f2 - f3), (int) (f + f3), (int) (f2 + f3));
    }
}
