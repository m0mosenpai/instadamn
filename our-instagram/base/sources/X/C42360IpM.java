package X;

import android.graphics.Bitmap;
import com.instagram.common.ui.blur.BlurUtil;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.IpM, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42360IpM implements InterfaceC65702y7 {
    public static final C42360IpM A00 = new C42360IpM();

    @Override // X.InterfaceC65702y7
    public final void EGm(Bitmap bitmap, IgImageView igImageView) {
        AbstractC167017dG.A1N(igImageView, bitmap);
        igImageView.setImageBitmap(BlurUtil.blur(bitmap, 0.5f, 14));
    }
}
