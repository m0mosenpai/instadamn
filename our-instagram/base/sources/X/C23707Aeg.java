package X;

import android.graphics.Bitmap;
import com.instagram.common.ui.blur.BlurUtil;

/* renamed from: X.Aeg, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23707Aeg implements InterfaceC59142nF {
    public static final C23707Aeg A00 = new C23707Aeg();

    @Override // X.InterfaceC59142nF
    public final Bitmap renderImage(Bitmap bitmap) {
        C14360o3.A0B(bitmap, 0);
        return BlurUtil.blur(bitmap, 0.25f, 24);
    }
}
