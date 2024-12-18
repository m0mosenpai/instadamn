package X;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.instagram.common.ui.widget.imageview.ConstrainedImageView;

/* renamed from: X.AxY, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24750AxY implements Runnable {
    public final /* synthetic */ Drawable A00;
    public final /* synthetic */ C210949Ur A01;
    public final /* synthetic */ C148276lx A02;

    public RunnableC24750AxY(Drawable drawable, C210949Ur c210949Ur, C148276lx c148276lx) {
        this.A01 = c210949Ur;
        this.A00 = drawable;
        this.A02 = c148276lx;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C210949Ur c210949Ur = this.A01;
        ConstrainedImageView constrainedImageView = c210949Ur.A03;
        int width = constrainedImageView.getWidth();
        int height = constrainedImageView.getHeight();
        constrainedImageView.setScaleType(ImageView.ScaleType.MATRIX);
        AbstractC23078AFk.A00(this.A00, c210949Ur, this.A02, width, height);
    }
}
