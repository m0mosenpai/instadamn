package X;

import android.graphics.Bitmap;
import com.instagram.common.ui.blur.BlurUtil;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.Whi, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70825Whi implements InterfaceC65702y7 {
    public static final C70825Whi A00 = new C70825Whi();

    @Override // X.InterfaceC65702y7
    public final void EGm(Bitmap bitmap, IgImageView igImageView) {
        AbstractC167017dG.A1N(igImageView, bitmap);
        igImageView.setImageBitmap(BlurUtil.blur(bitmap, 0.1f, 6));
    }
}
