package X;

import android.graphics.Bitmap;
import com.instagram.common.ui.blur.BlurUtil;

/* renamed from: X.Owi, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56175Owi implements InterfaceC59142nF {
    public static final C56175Owi A00 = new C56175Owi();

    @Override // X.InterfaceC59142nF
    public final Bitmap renderImage(Bitmap bitmap) {
        C14360o3.A0B(bitmap, 0);
        Bitmap.Config config = bitmap.getConfig();
        C14360o3.A0A(config);
        Bitmap copy = bitmap.copy(config, bitmap.isMutable());
        C14360o3.A0A(copy);
        return BlurUtil.blur(copy, 1.0f, 3);
    }
}
