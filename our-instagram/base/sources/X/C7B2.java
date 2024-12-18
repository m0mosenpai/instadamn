package X;

import android.graphics.Bitmap;
import com.instagram.common.ui.blur.BlurUtil;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.7B2, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7B2 implements InterfaceC65702y7 {
    public static final C7B2 A00 = new C7B2();

    @Override // X.InterfaceC65702y7
    public final void EGm(Bitmap bitmap, IgImageView igImageView) {
        C14360o3.A0B(igImageView, 0);
        C14360o3.A0B(bitmap, 1);
        igImageView.setImageBitmap(BlurUtil.blur(bitmap, 0.3f, 20));
    }
}
