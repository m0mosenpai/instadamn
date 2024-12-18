package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.widget.ImageView;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.Bx4, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC27080Bx4 extends IgImageView {
    public C210209Rj A00;
    public AbstractC25398BLp A01;
    public final float A02;
    public final float A03;
    public final C28904CpC A04;

    public void A0H() {
        this.A00 = null;
        this.A01 = null;
        A09();
    }

    public void A0I(InterfaceC11380iw interfaceC11380iw, ImageUrl imageUrl, AbstractC25398BLp abstractC25398BLp, int i) {
        AbstractC25233BEq.A0v(0, imageUrl, interfaceC11380iw, abstractC25398BLp);
        setUrl(imageUrl, interfaceC11380iw);
        setScaleType(ImageView.ScaleType.CENTER_CROP);
        this.A01 = abstractC25398BLp;
    }

    @Override // com.instagram.common.ui.widget.imageview.IgImageView, android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        if (this.A00 == null) {
            super.onDraw(canvas);
        }
        C210209Rj c210209Rj = this.A00;
        if (c210209Rj != null) {
            c210209Rj.draw(canvas);
        }
    }

    @Override // com.instagram.common.ui.widget.imageview.IgImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        C210209Rj c210209Rj;
        if (bitmap != null) {
            c210209Rj = new C210209Rj(AbstractC166997dE.A0L(this), bitmap, 16.0f, (int) (this.A03 + this.A02));
        } else {
            c210209Rj = null;
        }
        this.A00 = c210209Rj;
        super.setImageDrawable(c210209Rj);
    }

    public AbstractC27080Bx4(Context context) {
        super(context);
        this.A03 = AbstractC13690mv.A00(context, 2.0f);
        this.A02 = AbstractC13690mv.A00(context, 1.0f);
        this.A04 = new C28904CpC(this);
    }

    @Override // com.instagram.common.ui.widget.imageview.IgImageView
    public final C27771Wf A07(C1WX c1wx) {
        C27811Wj c27811Wj = new C27811Wj(super.A07(c1wx));
        c27811Wj.A0I = this.A04;
        return new C27771Wf(c27811Wj);
    }

    public final C210209Rj getCarouselThumbnailDrawable() {
        return this.A00;
    }

    public final float getPadding() {
        return this.A02;
    }

    public final float getSpace() {
        return this.A03;
    }

    public final AbstractC25398BLp getViewModel() {
        return this.A01;
    }

    public final void setCarouselThumbnailDrawable(C210209Rj c210209Rj) {
        this.A00 = c210209Rj;
    }

    public final void setViewModel(AbstractC25398BLp abstractC25398BLp) {
        this.A01 = abstractC25398BLp;
    }
}
