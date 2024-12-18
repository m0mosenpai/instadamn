package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.ImageView;

/* renamed from: X.WZv, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70514WZv implements InterfaceC72024XFm {
    public final int A00;
    public final int A01;
    public final Integer A02;
    public final Integer A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C70514WZv) {
                C70514WZv c70514WZv = (C70514WZv) obj;
                if (this.A00 != c70514WZv.A00 || !C14360o3.A0K(this.A02, c70514WZv.A02) || !C14360o3.A0K(this.A03, c70514WZv.A03) || this.A01 != c70514WZv.A01) {
                }
            }
            return false;
        }
        return true;
    }

    private final Drawable A00(Context context) {
        Integer num;
        Integer num2;
        Drawable drawable = context.getDrawable(this.A00);
        if (drawable != null && (num2 = this.A02) != null) {
            drawable.setTint(C2FP.A02().A07().A00(context, num2.intValue()));
        }
        if ((drawable instanceof GradientDrawable) && (num = this.A03) != null) {
            ((GradientDrawable) drawable).setStroke((int) context.getResources().getDimension(this.A01), C2FP.A02().A07().A00(context, num.intValue()));
        }
        return drawable;
    }

    @Override // X.InterfaceC72024XFm
    public final void ChW(ImageView imageView) {
        Drawable drawable;
        if (this.A00 != 0) {
            drawable = A00(AbstractC166997dE.A0L(imageView));
        } else {
            drawable = null;
        }
        imageView.setImageDrawable(drawable);
    }

    @Override // X.InterfaceC72024XFm
    public final void EPs(View view) {
        Drawable drawable;
        if (this.A00 != 0) {
            drawable = A00(AbstractC166997dE.A0L(view));
        } else {
            drawable = null;
        }
        view.setBackground(drawable);
    }

    public final int hashCode() {
        int i = 0;
        int A0M = ((this.A00 * 31) + AbstractC167017dG.A0M(this.A02)) * 31;
        Integer num = this.A03;
        if (num != null) {
            i = num.hashCode();
        }
        return ((A0M + i) * 31) + this.A01;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DrawableResImageResource(drawableRes=");
        sb.append(this.A00);
        sb.append(", colorType=");
        sb.append(this.A02);
        sb.append(", strokeColorType=");
        sb.append(this.A03);
        sb.append(", strokeWidthRes=");
        return AbstractC25236BEt.A0Z(sb, this.A01);
    }

    public C70514WZv(Integer num, Integer num2, int i, int i2) {
        this.A00 = i;
        this.A02 = num;
        this.A03 = num2;
        this.A01 = i2;
    }
}
