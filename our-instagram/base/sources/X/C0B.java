package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.drawable.GradientDrawable;
import com.facebook.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.igds.components.gradient.IGGradientView;
import kotlin.Deprecated;
import kotlin.ReplaceWith;

/* loaded from: classes5.dex */
public final class C0B extends BOM {
    public Path A00;
    public final int A01;
    public final GradientDrawable A02;

    public C0B(Context context, ImageUrl imageUrl, boolean z) {
        super(context, null, context.getResources().getDimensionPixelSize(R.dimen.intent_aware_ad_rifu_card_large_width), 0, 0, 0, 0, -1, z);
        this.A00 = AbstractC166987dD.A0T();
        A04(imageUrl, null);
        this.A01 = AbstractC167017dG.A06(context);
        this.A02 = IGGradientView.A00.A01(GradientDrawable.Orientation.BOTTOM_TOP, 178);
    }

    @Override // X.BOM, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        int save = canvas.save();
        canvas.clipPath(this.A00);
        super.draw(canvas);
        this.A02.draw(canvas);
        canvas.restoreToCount(save);
    }

    @Override // X.BOM, android.graphics.drawable.Drawable
    @Deprecated(message = "Use the version that takes a ColorFilter instead.", replaceWith = @ReplaceWith(expression = "setColorFilter", imports = {}))
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        this.A02.setBounds(i, (this.A09 / 3) + i2, i3, i4);
        float f = i;
        float f2 = i2;
        float f3 = i3;
        float f4 = i4;
        Path A0T = AbstractC166987dD.A0T();
        float f5 = this.A01;
        float f6 = f5 + f;
        A0T.moveTo(f6, f2);
        A0T.lineTo(f3 - f5, f2);
        float f7 = f5 + f2;
        A0T.quadTo(f3, f2, f3, f7);
        A0T.lineTo(f3, f4);
        A0T.lineTo(f, f4);
        A0T.lineTo(f, f7);
        A0T.quadTo(f, f2, f6, f2);
        this.A00 = A0T;
    }
}
