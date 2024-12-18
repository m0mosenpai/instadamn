package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import com.facebook.R;

/* renamed from: X.9S7, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9S7 extends Drawable {
    public int A00;
    public Paint A01;
    public RectF A02;
    public int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final int A0A;
    public final C6RB A0B;
    public final C6RB A0C;
    public final Context A0D;
    public final Resources A0E;
    public final String A0F;

    public C9S7(Context context, String str, int i) {
        C14360o3.A0B(str, 3);
        this.A0D = context;
        this.A0F = str;
        Resources resources = context.getResources();
        this.A0E = resources;
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.action_button_settings_height);
        this.A05 = dimensionPixelSize;
        this.A04 = resources.getDimensionPixelSize(R.dimen.accent_edge_thickness);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.add_to_story_dual_destination_share_sheet_avatar_icon_size);
        this.A07 = dimensionPixelSize2;
        int A07 = AbstractC166997dE.A07(resources);
        this.A06 = A07;
        int A0A = AbstractC166997dE.A0A(resources);
        this.A08 = A0A;
        this.A09 = AbstractC166997dE.A0D(resources);
        int i2 = A07 + dimensionPixelSize2 + A0A + A0A;
        this.A0A = i2;
        int i3 = i - i2;
        this.A03 = -1;
        C6RB A0z = AbstractC166987dD.A0z(context, i3);
        AbstractC166997dE.A1B(resources, A0z, R.dimen.action_bar_item_spacing_right);
        A0z.A0J(Typeface.SANS_SERIF, 1);
        A0z.A0G(1, "…");
        this.A0B = A0z;
        C6RB A0z2 = AbstractC166987dD.A0z(context, i3);
        AbstractC166997dE.A1B(resources, A0z2, R.dimen.action_bar_item_spacing_right);
        A0z2.A0J(Typeface.SANS_SERIF, 0);
        A0z2.A0G(1, "…");
        this.A0C = A0z2;
        int i4 = i2 + dimensionPixelSize2 + A0z.A0A;
        this.A00 = i4;
        this.A02 = AbstractC166987dD.A0Y(i4, dimensionPixelSize);
        A00();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        A00();
        canvas.save();
        AbstractC167007dF.A0s(canvas, AbstractC166987dD.A0W(this));
        RectF rectF = this.A02;
        float f = this.A04;
        Paint paint = this.A01;
        if (paint == null) {
            C14360o3.A0F("backgroundPaint");
            throw C00O.createAndThrow();
        }
        canvas.drawRoundRect(rectF, f, f, paint);
        canvas.save();
        float f2 = this.A06 + this.A07 + this.A08;
        int i = this.A05;
        C6RB c6rb = this.A0B;
        int i2 = c6rb.A06;
        int i3 = this.A09;
        C6RB c6rb2 = this.A0C;
        canvas.translate(f2, AbstractC166987dD.A02(i - ((i2 + i3) + c6rb2.A06)));
        c6rb.draw(canvas);
        AbstractC167007dF.A0u(canvas, c6rb2, 0.0f, c6rb.A06 + i3);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        C14360o3.A0B(rect, 0);
        super.onBoundsChange(rect);
    }

    private final void A00() {
        String str = this.A0F;
        if (C14360o3.A0K(str, "product_item_list_cell_sticker_subtle")) {
            this.A0B.A0F(-1);
            this.A0C.A0F(-1);
            this.A03 = this.A0D.getColor(R.color.sticker_subtle_light_background);
        } else if (C14360o3.A0K(str, "product_item_list_cell_sticker_black_white")) {
            this.A0B.A0F(-16777216);
            this.A0C.A0F(-7829368);
            this.A03 = -1;
        }
        Paint A0R = AbstractC166987dD.A0R();
        A0R.setColor(this.A03);
        this.A01 = A0R;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.A05;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.A00;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Paint paint = this.A01;
        if (paint == null) {
            C14360o3.A0F("backgroundPaint");
            throw C00O.createAndThrow();
        }
        paint.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        invalidateSelf();
    }
}
