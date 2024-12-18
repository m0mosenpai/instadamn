package X;

import android.graphics.Bitmap;
import android.view.View;
import com.instagram.common.ui.widget.imageview.RoundedCornerImageView;

/* loaded from: classes4.dex */
public final class AT0 implements View.OnLayoutChangeListener {
    public final /* synthetic */ Bitmap A00;
    public final /* synthetic */ RoundedCornerImageView A01;

    public AT0(Bitmap bitmap, RoundedCornerImageView roundedCornerImageView) {
        this.A01 = roundedCornerImageView;
        this.A00 = bitmap;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        RoundedCornerImageView roundedCornerImageView = this.A01;
        roundedCornerImageView.setDrawable(this.A00);
        roundedCornerImageView.removeOnLayoutChangeListener(roundedCornerImageView.A02);
        roundedCornerImageView.A02 = null;
    }
}
