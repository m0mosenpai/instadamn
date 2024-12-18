package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.widget.TextView;

/* loaded from: classes11.dex */
public final class W4X {
    public final Rect A00;
    public final int A01;
    public final ColorStateList A02;
    public final ColorStateList A03;
    public final ColorStateList A04;
    public final C65Q A05;

    public static W4X A00(Context context, int i) {
        C02R.A06(AbstractC167007dF.A1M(i), "Cannot create a CalendarItemStyle with a styleResId of 0");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, C65N.A0M);
        Rect rect = new Rect(obtainStyledAttributes.getDimensionPixelOffset(0, 0), obtainStyledAttributes.getDimensionPixelOffset(2, 0), obtainStyledAttributes.getDimensionPixelOffset(1, 0), obtainStyledAttributes.getDimensionPixelOffset(3, 0));
        ColorStateList A01 = AbstractC1567371w.A01(context, obtainStyledAttributes, 4);
        ColorStateList A012 = AbstractC1567371w.A01(context, obtainStyledAttributes, 9);
        ColorStateList A013 = AbstractC1567371w.A01(context, obtainStyledAttributes, 7);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(8, 0);
        C65Q c65q = new C65Q(C65Q.A02(context, new C65T(0.0f), obtainStyledAttributes.getResourceId(5, 0), obtainStyledAttributes.getResourceId(6, 0)));
        obtainStyledAttributes.recycle();
        return new W4X(A01, A012, A013, rect, c65q, dimensionPixelSize);
    }

    public final void A01(TextView textView) {
        C65O c65o = new C65O();
        C65O c65o2 = new C65O();
        C65Q c65q = this.A05;
        c65o.setShapeAppearanceModel(c65q);
        c65o2.setShapeAppearanceModel(c65q);
        c65o.A0F(this.A02);
        c65o.A0H(this.A03, this.A01);
        ColorStateList colorStateList = this.A04;
        textView.setTextColor(colorStateList);
        RippleDrawable rippleDrawable = new RippleDrawable(colorStateList.withAlpha(30), c65o, c65o2);
        Rect rect = this.A00;
        textView.setBackground(new InsetDrawable((Drawable) rippleDrawable, rect.left, rect.top, rect.right, rect.bottom));
    }

    public W4X(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, Rect rect, C65Q c65q, int i) {
        C02R.A00(rect.left);
        C02R.A00(rect.top);
        C02R.A00(rect.right);
        C02R.A00(rect.bottom);
        this.A00 = rect;
        this.A04 = colorStateList2;
        this.A02 = colorStateList;
        this.A03 = colorStateList3;
        this.A01 = i;
        this.A05 = c65q;
    }
}
