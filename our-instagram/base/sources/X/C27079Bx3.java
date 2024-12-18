package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.Bx3, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27079Bx3 extends IgImageView {
    public float A00;
    public PathMeasure A01;
    public final float A02;
    public final Path A03;
    public final ShapeDrawable A04;
    public final Paint A05;

    public C27079Bx3(Context context) {
        super(context);
        this.A04 = new ShapeDrawable(new OvalShape());
        int color = context.getColor(R.color.gallery_item_selection_circle_default_color);
        this.A03 = AbstractC166987dD.A0T();
        Paint A0S = AbstractC166987dD.A0S(1);
        this.A05 = A0S;
        this.A02 = AbstractC13690mv.A00(context, 4.0f);
        this.A00 = AbstractC13690mv.A00(context, 0.15f);
        A0S.setColor(color);
        A0S.setStyle(Paint.Style.STROKE);
        A0S.setStrokeWidth(this.A02);
        A0S.setStrokeCap(Paint.Cap.BUTT);
    }

    @Override // com.instagram.common.ui.widget.imageview.IgImageView, android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        super.onDraw(canvas);
        canvas.drawPath(this.A03, this.A05);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int A06 = C0f9.A06(275216834);
        Path path = this.A03;
        path.reset();
        float f = i;
        float f2 = (f - this.A02) / 2.0f;
        float f3 = f / 2.0f;
        float f4 = i2 / 2.0f;
        path.addArc(new RectF(f3 - f2, f4 - f2, f3 + f2, f4 + f2), 270.0f, 360.0f);
        this.A01 = new PathMeasure(path, true);
        C0f9.A0D(203046375, A06);
    }
}
