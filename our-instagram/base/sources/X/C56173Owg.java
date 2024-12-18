package X;

import android.graphics.Bitmap;
import com.instagram.common.ui.blur.BlurUtil;

/* renamed from: X.Owg, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56173Owg implements InterfaceC59142nF {
    public static final C56173Owg A00 = new C56173Owg();

    @Override // X.InterfaceC59142nF
    public final Bitmap renderImage(Bitmap bitmap) {
        C14360o3.A0B(bitmap, 0);
        return BlurUtil.blur(bitmap, 0.85f, 25);
    }
}
