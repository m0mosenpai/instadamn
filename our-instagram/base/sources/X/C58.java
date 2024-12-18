package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.facebook.R;
import com.instagram.common.typedurl.ImageUrl;

/* loaded from: classes5.dex */
public final class C58 extends C59 {
    public int A00;
    public int A01;
    public final float A02;
    public final float A03;
    public final Paint A04;
    public final Path A05;

    public C58(Context context) {
        super(context);
        int color = context.getColor(R.color.design_dark_default_color_on_background);
        this.A02 = 16.0f;
        this.A03 = AbstractC13690mv.A00(context, 1.0f);
        this.A05 = AbstractC166987dD.A0T();
        Paint A0S = AbstractC166987dD.A0S(1);
        this.A04 = A0S;
        A0S.setColor(color);
        A0S.setStyle(Paint.Style.STROKE);
        A0S.setStrokeCap(Paint.Cap.ROUND);
        A0S.setStrokeWidth(this.A03);
    }

    @Override // X.AbstractC27080Bx4
    public final void A0H() {
        this.A01 = 0;
        this.A00 = 0;
        super.A0H();
    }

    @Override // X.AbstractC27080Bx4
    public final void A0I(InterfaceC11380iw interfaceC11380iw, ImageUrl imageUrl, AbstractC25398BLp abstractC25398BLp, int i) {
        AbstractC25233BEq.A0v(0, imageUrl, interfaceC11380iw, abstractC25398BLp);
        super.A0I(interfaceC11380iw, imageUrl, abstractC25398BLp, i);
        this.A01 = i;
    }

    @Override // X.AbstractC27080Bx4, com.instagram.common.ui.widget.imageview.IgImageView, android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        super.onDraw(canvas);
        if (this.A01 == this.A00) {
            canvas.drawPath(this.A05, this.A04);
        }
    }

    @Override // X.AbstractC27080Bx4, com.instagram.common.ui.widget.imageview.IgImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        C210209Rj c210209Rj;
        if (bitmap != null) {
            c210209Rj = new C210209Rj(AbstractC166997dE.A0L(this), bitmap, this.A02, (int) (this.A03 + ((AbstractC27080Bx4) this).A03 + ((AbstractC27080Bx4) this).A02));
        } else {
            c210209Rj = null;
        }
        ((AbstractC27080Bx4) this).A00 = c210209Rj;
        super.setImageDrawable(c210209Rj);
    }

    public final Paint getActiveProgressBarPaint() {
        return this.A04;
    }

    public final int getCurrentIndex() {
        return this.A00;
    }

    public final float getProgressBarWidth() {
        return this.A03;
    }

    public final Path getStaticProgressBarPath() {
        return this.A05;
    }

    public final int getThumbnailIndex() {
        return this.A01;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int A06 = C0f9.A06(1750541693);
        float f = ((AbstractC27080Bx4) this).A02;
        float f2 = this.A03;
        float f3 = (i - f) - f2;
        float f4 = (i2 - f) - f2;
        Path path = this.A05;
        float f5 = f + f2;
        float f6 = this.A02 + ((AbstractC27080Bx4) this).A03 + f2;
        path.moveTo(f3 / 2.0f, f5);
        float f7 = f3 - f6;
        path.lineTo(f7, f5);
        path.cubicTo(f7, f5, f3, f5, f3, f6);
        float f8 = f4 - f6;
        path.lineTo(f3, f8);
        path.cubicTo(f3, f8, f3, f4, f7, f4);
        path.lineTo(f6, f4);
        path.cubicTo(f6, f4, f5, f4, f5, f8);
        path.lineTo(f5, f6);
        path.cubicTo(f5, f6, f5, f5, f6, f5);
        path.close();
        C0f9.A0D(-322390283, A06);
    }

    public final void setCurrentIndex(int i) {
        this.A00 = i;
    }

    public final void setThumbnailIndex(int i) {
        this.A01 = i;
    }
}
