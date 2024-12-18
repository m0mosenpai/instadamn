package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import com.facebook.R;
import java.util.List;

/* renamed from: X.Bwx, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27073Bwx extends C5RN {
    public final int A00;
    public final int A01;
    public final Context A02;
    public final Resources A03;
    public final Drawable A04;
    public final Drawable A05;

    public C27073Bwx(Context context, int i) {
        Bitmap bitmap;
        this.A02 = context;
        Resources resources = context.getResources();
        this.A03 = resources;
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.abc_control_corner_material);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_icon_width);
        this.A00 = dimensionPixelSize2;
        this.A01 = resources.getDimensionPixelSize(i);
        C89533yt c89533yt = new C89533yt(null, null, dimensionPixelSize2, dimensionPixelSize, -1, context.getColor(AbstractC53242c7.A0B(context)));
        Drawable drawable = context.getDrawable(R.raw.meta_ai_icon_gradient_background);
        if (drawable != null) {
            bitmap = AbstractC27488CBj.A00(drawable, dimensionPixelSize2, dimensionPixelSize2);
        } else {
            bitmap = null;
        }
        c89533yt.A01(bitmap);
        c89533yt.setCallback(this);
        this.A04 = c89533yt;
        Drawable drawable2 = context.getDrawable(R.drawable.instagram_icons_exceptions_genai_agent_profile_filled_24);
        if (drawable2 != null) {
            drawable2.setCallback(this);
            this.A05 = drawable2;
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        this.A04.draw(canvas);
        this.A05.draw(canvas);
    }

    @Override // X.C5RN
    public final List A07() {
        return AbstractC16960so.A1Q(this.A04, this.A05);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.A00;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.A00;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        float f = (i + i3) / 2.0f;
        float f2 = (i2 + i4) / 2.0f;
        this.A04.setBounds(i, i2, i3, i4);
        Drawable drawable = this.A05;
        float f3 = this.A01 / 2;
        drawable.setBounds((int) (f - f3), (int) (f2 - f3), (int) (f + f3), (int) (f2 + f3));
    }
}
