package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import com.facebook.R;

/* renamed from: X.9Rm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C210239Rm extends Drawable {
    public boolean A00 = false;
    public boolean A01;
    public Bitmap A02;
    public final float A03;
    public final float A04;
    public final float A05;
    public final Paint A06;
    public final Paint A07;

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.A02 == null) {
            Bitmap createBitmap = Bitmap.createBitmap(canvas.getWidth(), canvas.getHeight(), Bitmap.Config.ALPHA_8);
            this.A02 = createBitmap;
            Canvas canvas2 = new Canvas(createBitmap);
            if (this.A00) {
                Path A0T = AbstractC166987dD.A0T();
                int i = 1;
                if (this.A01) {
                    i = -1;
                }
                float f = this.A03;
                float f2 = i * f;
                float f3 = this.A04;
                Path.Direction direction = Path.Direction.CW;
                A0T.addCircle((canvas2.getWidth() / 2.0f) - f2, (canvas2.getHeight() / 2.0f) - f, f3, direction);
                A0T.addCircle((canvas2.getWidth() / 2.0f) + f2, (canvas2.getHeight() / 2.0f) + f, f3, direction);
                A0T.setFillType(Path.FillType.WINDING);
                canvas2.drawPath(A0T, this.A06);
            } else {
                canvas2.drawCircle(canvas2.getWidth() / 2.0f, canvas2.getHeight() / 2.0f, this.A05, this.A06);
            }
        }
        canvas.drawBitmap(this.A02, 0.0f, 0.0f, this.A07);
    }

    public C210239Rm(Context context) {
        Resources resources = context.getResources();
        this.A05 = AbstractC166987dD.A04(resources, R.dimen.abc_dialog_padding_material) + AbstractC166987dD.A04(resources, R.dimen.captions_context_menu_gap);
        this.A04 = AbstractC166987dD.A04(resources, R.dimen.bubble_external_padding) + AbstractC166997dE.A0D(resources);
        this.A03 = resources.getDimensionPixelOffset(R.dimen.direct_reply_avatar_button_double_overlap_offset);
        float A06 = AbstractC166997dE.A06(resources);
        int color = resources.getColor(R.color.black_40_transparent);
        Paint A0S = AbstractC166987dD.A0S(1);
        this.A06 = A0S;
        A0S.setShadowLayer(A06, 0.0f, 0.0f, color);
        Paint A0S2 = AbstractC166987dD.A0S(1);
        this.A07 = A0S2;
        A0S2.setColorFilter(C3DY.A00(-16777216));
        this.A01 = AbstractC13620mo.A02(context);
    }
}
