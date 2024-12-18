package X;

import android.graphics.Bitmap;
import com.instagram.common.ui.blur.BlurUtil;

/* renamed from: X.Owh, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56174Owh implements InterfaceC59142nF {
    public static final C56174Owh A00 = new C56174Owh();

    @Override // X.InterfaceC59142nF
    public final Bitmap renderImage(Bitmap bitmap) {
        C14360o3.A0B(bitmap, 0);
        return BlurUtil.blur(bitmap, 0.1f, 3);
    }
}
