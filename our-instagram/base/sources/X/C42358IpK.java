package X;

import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import com.facebook.R;
import com.instagram.common.ui.blur.BlurUtil;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.IpK, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42358IpK implements InterfaceC65702y7 {
    public static final C42358IpK A00 = new C42358IpK();

    @Override // X.InterfaceC65702y7
    public final void EGm(Bitmap bitmap, IgImageView igImageView) {
        AbstractC167017dG.A1N(igImageView, bitmap);
        igImageView.setImageBitmap(BlurUtil.blur(bitmap, 0.5f, 25));
        igImageView.setColorFilter(AbstractC167007dF.A09(igImageView.getContext(), R.attr.igds_color_legibility_gradient), PorterDuff.Mode.SRC_OVER);
    }
}
