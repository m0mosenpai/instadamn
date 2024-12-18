package X;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import com.facebook.R;

/* renamed from: X.8G4, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8G4 {
    public Drawable A00;
    public Drawable A01;
    public C8G8 A02;
    public Integer A03;
    public Integer A04;
    public Integer A05;
    public Integer A06;
    public Integer A07;
    public Integer A08;
    public Integer A09;
    public Integer A0A;
    public Integer A0B;
    public Integer A0C;
    public Integer A0D;
    public boolean A0E;
    public Integer A0F;
    public final Context A0G;

    public C8G4(Context context) {
        C14360o3.A0B(context, 1);
        this.A0G = context;
    }

    public final C8G6 A00() {
        int i;
        int dimensionPixelSize;
        int dimensionPixelSize2;
        int dimensionPixelSize3;
        int dimensionPixelSize4;
        int intValue;
        int intValue2;
        int dimensionPixelSize5;
        int dimensionPixelSize6;
        int i2;
        C8G5 c8g5;
        Context context = this.A0G;
        int color = context.getColor(AbstractC53242c7.A0H(context, R.attr.musicCreationPlayIconColor));
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        Integer num = this.A03;
        if (num != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        paint.setColor(i);
        Integer num2 = this.A04;
        if (num2 != null) {
            dimensionPixelSize = num2.intValue();
        } else {
            dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.abc_dropdownitem_icon_width);
        }
        Integer num3 = this.A09;
        if (num3 != null) {
            dimensionPixelSize2 = num3.intValue();
        } else {
            dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.abc_dialog_padding_material);
        }
        Integer num4 = this.A0B;
        if (num4 != null) {
            dimensionPixelSize3 = num4.intValue();
        } else {
            dimensionPixelSize3 = context.getResources().getDimensionPixelSize(R.dimen.afi_indicator_arrow_margin_top);
        }
        Integer num5 = this.A0A;
        if (num5 != null) {
            dimensionPixelSize4 = num5.intValue();
        } else {
            dimensionPixelSize4 = context.getResources().getDimensionPixelSize(R.dimen.action_bar_item_spacing_left);
        }
        Integer num6 = this.A06;
        if (num6 == null && (num6 = this.A0F) == null) {
            intValue = color;
        } else {
            intValue = num6.intValue();
        }
        Integer num7 = this.A0C;
        if (num7 == null && (num7 = this.A0F) == null) {
            intValue2 = color;
        } else {
            intValue2 = num7.intValue();
        }
        Integer num8 = this.A08;
        Drawable drawable = this.A00;
        if (drawable == null) {
            drawable = new C65937Twi(context);
        }
        Drawable drawable2 = this.A01;
        if (drawable2 == null) {
            drawable2 = context.getDrawable(R.drawable.stop);
        }
        Integer num9 = this.A07;
        if (num9 != null) {
            dimensionPixelSize5 = num9.intValue();
        } else {
            dimensionPixelSize5 = context.getResources().getDimensionPixelSize(R.dimen.abc_button_padding_horizontal_material);
        }
        Integer num10 = this.A0D;
        if (num10 != null) {
            dimensionPixelSize6 = num10.intValue();
        } else {
            dimensionPixelSize6 = context.getResources().getDimensionPixelSize(R.dimen.abc_button_padding_horizontal_material);
        }
        Integer num11 = this.A0F;
        if (num11 != null) {
            i2 = num11.intValue();
        } else {
            i2 = color;
        }
        Integer num12 = this.A05;
        if (num12 != null) {
            color = num12.intValue();
        }
        if (this.A0E) {
            c8g5 = C8G5.A02;
        } else {
            c8g5 = C8G5.A04;
        }
        return new C8G6(context, paint, drawable, drawable2, this.A02, c8g5, num8, dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize3, dimensionPixelSize4, intValue, intValue2, dimensionPixelSize5, dimensionPixelSize6, i2, color);
    }

    public final void A01(int i) {
        this.A0F = Integer.valueOf(i);
    }

    public final void A02(int i) {
        Integer valueOf = Integer.valueOf(i);
        this.A07 = valueOf;
        this.A0D = valueOf;
    }
}
