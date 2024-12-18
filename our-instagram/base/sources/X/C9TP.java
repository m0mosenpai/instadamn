package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.facebook.R;

/* renamed from: X.9TP, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9TP extends View {
    public boolean A00;
    public final float A01;
    public final int A02;
    public final Paint A03;
    public final Path A04;
    public final Drawable A05;

    public C9TP(Context context) {
        super(context, null, 0);
        this.A02 = context.getColor(R.color.black_40_transparent);
        Resources resources = getResources();
        this.A01 = resources.getDimension(R.dimen.abc_dialog_padding_material);
        Paint A0R = AbstractC166987dD.A0R();
        AbstractC166987dD.A1N(context, A0R, R.color.badge_color);
        A0R.setStrokeWidth(resources.getDimension(R.dimen.abc_control_corner_material));
        this.A03 = A0R;
        this.A05 = context.getDrawable(R.drawable.clips_stacked_timeline_video_preview_border);
        this.A04 = AbstractC166987dD.A0T();
        this.A00 = true;
    }

    public final boolean getShowGuide() {
        return this.A00;
    }

    public final void setShowGuide(boolean z) {
        this.A00 = z;
        invalidate();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int A0N = AbstractC167017dG.A0N(canvas, 645368815);
        super.draw(canvas);
        canvas.save();
        Path path = this.A04;
        C14360o3.A0B(path, 1);
        canvas.clipOutPath(path);
        canvas.drawColor(this.A02);
        canvas.restore();
        if (this.A00) {
            float A08 = AbstractC166987dD.A08(this) / 2.0f;
            float A07 = AbstractC166987dD.A07(this);
            float A082 = AbstractC166987dD.A08(this) / 2.0f;
            Paint paint = this.A03;
            canvas.drawLine(0.0f, A08, A07, A082, paint);
            canvas.drawLine(AbstractC166987dD.A07(this) / 2.0f, 0.0f, AbstractC166987dD.A07(this) / 2.0f, AbstractC166987dD.A08(this), paint);
            Drawable drawable = this.A05;
            if (drawable != null) {
                drawable.draw(canvas);
            }
        }
        C0f9.A0A(-2077100106, A0N);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Drawable drawable = this.A05;
        if (drawable != null) {
            drawable.setBounds(new Rect(0, 0, getWidth(), getHeight()));
        }
        Path path = this.A04;
        path.reset();
        float A07 = AbstractC166987dD.A07(this);
        float A08 = AbstractC166987dD.A08(this);
        float f = this.A01;
        path.addRoundRect(0.0f, 0.0f, A07, A08, f, f, Path.Direction.CW);
    }
}
