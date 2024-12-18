package X;

import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import com.facebook.R;
import com.instagram.common.ui.blur.BlurUtil;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.IpJ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42357IpJ implements InterfaceC65702y7 {
    public static final C42357IpJ A00 = new C42357IpJ();

    @Override // X.InterfaceC65702y7
    public final void EGm(Bitmap bitmap, IgImageView igImageView) {
        AbstractC167017dG.A1N(igImageView, bitmap);
        igImageView.setImageBitmap(BlurUtil.blur(bitmap, 0.1f, 6));
        igImageView.setColorFilter(igImageView.getContext().getColor(R.color.black_25_transparent), PorterDuff.Mode.SRC_OVER);
        igImageView.setImageAlpha(128);
    }
}
