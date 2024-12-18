package X;

import android.graphics.Bitmap;
import com.instagram.common.ui.blur.BlurUtil;

/* renamed from: X.Owj, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56176Owj implements InterfaceC59142nF {
    public static final C56176Owj A00 = new C56176Owj();

    @Override // X.InterfaceC59142nF
    public final Bitmap renderImage(Bitmap bitmap) {
        C14360o3.A0B(bitmap, 0);
        return BlurUtil.blur(bitmap, 0.1f, 1);
    }
}
