package X;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.instagram.common.ui.widget.imageview.ConstrainedImageView;

/* renamed from: X.AxZ, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24751AxZ implements Runnable {
    public final /* synthetic */ Drawable A00;
    public final /* synthetic */ C210959Us A01;
    public final /* synthetic */ C148276lx A02;

    public RunnableC24751AxZ(Drawable drawable, C210959Us c210959Us, C148276lx c148276lx) {
        this.A01 = c210959Us;
        this.A00 = drawable;
        this.A02 = c148276lx;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C210959Us c210959Us = this.A01;
        ConstrainedImageView constrainedImageView = c210959Us.A03;
        int width = constrainedImageView.getWidth();
        int height = constrainedImageView.getHeight();
        constrainedImageView.setScaleType(ImageView.ScaleType.MATRIX);
        ALo.A01(this.A00, c210959Us, this.A02, width, height);
    }
}
