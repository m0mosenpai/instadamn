package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import com.facebook.R;

/* renamed from: X.9Ss, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C210539Ss extends Drawable implements BD2 {
    public final C210559Su A00;
    public final C6RB A01;

    @Override // X.BD2
    public final float Arr() {
        return 0.0f;
    }

    @Override // X.BD2
    public final void ESD(float f) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        this.A00.draw(canvas);
        this.A01.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        C14360o3.A0B(rect, 0);
        this.A00.setBounds(rect);
        C6RB c6rb = this.A01;
        c6rb.A0E(rect.width());
        int i = c6rb.A0A;
        int width = rect.left + ((rect.width() - i) / 2);
        int i2 = rect.top;
        AbstractC166997dE.A1G(c6rb, width, i2, i + width, c6rb.A06 + i2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public C210539Ss(Context context) {
        this.A00 = new C210559Su(context);
        C6RB A0z = AbstractC166987dD.A0z(context, 0);
        Resources resources = context.getResources();
        AbstractC166997dE.A1C(resources, A0z, 2131976917);
        A0z.A0K(Layout.Alignment.ALIGN_CENTER);
        float A08 = AbstractC166997dE.A08(resources);
        Typeface A0R = AbstractC167017dG.A0R(context);
        if (A0R != null) {
            float A04 = AbstractC166987dD.A04(resources, R.dimen.add_payment_bottom_sheet_row_subtitle_size);
            A0z.A0I(A0R);
            AbstractC167007dF.A19(A0z, A04, A08);
            this.A01 = A0z;
            return;
        }
        throw AbstractC166997dE.A0g();
    }
}
