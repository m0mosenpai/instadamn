package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.Layout;
import com.facebook.R;

/* renamed from: X.9pd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C221159pd extends AbstractC210159Re {
    public final int A00;
    public final int A01;
    public final int A02;
    public final RectF A03;
    public final RectF A04;
    public final C6RB A05;
    public final int A06;

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.A01;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.A06;
    }

    public C221159pd(Context context, String str, int i) {
        this.A06 = i;
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.abc_select_dialog_padding_start_material);
        int A09 = AbstractC167007dF.A09(context, R.attr.igds_color_media_background);
        int A08 = AbstractC167007dF.A08(context);
        this.A02 = AbstractC166997dE.A05(resources);
        this.A00 = AbstractC166997dE.A0A(resources);
        Paint paint = super.A00;
        AbstractC166987dD.A1R(paint);
        paint.setColor(A09);
        C6RB A0X = AbstractC167007dF.A0X(context, dimensionPixelSize, i);
        AbstractC166997dE.A1B(resources, A0X, R.dimen.abc_text_size_menu_header_material);
        A0X.A0M(str);
        A0X.A0F(A08);
        A0X.A0K(Layout.Alignment.ALIGN_CENTER);
        AEZ.A00(context, A0X);
        this.A05 = A0X;
        int i2 = this.A02;
        int i3 = A0X.A06 + i2 + i2;
        this.A01 = i3;
        float f = i;
        this.A04 = AbstractC166987dD.A0Y(f, i3);
        this.A03 = new RectF(0.0f, this.A00, f, this.A01);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        AbstractC167017dG.A11(canvas, AbstractC167017dG.A0Q(this, canvas));
        RectF rectF = this.A04;
        float f = this.A00;
        Paint paint = super.A00;
        canvas.drawRoundRect(rectF, f, f, paint);
        canvas.drawRect(this.A03, paint);
        int i = this.A06;
        AbstractC167007dF.A0u(canvas, this.A05, (i - r2.A0A) / 2, this.A02);
    }
}
