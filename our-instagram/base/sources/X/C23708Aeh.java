package X;

import android.graphics.Bitmap;
import com.instagram.common.ui.blur.BlurUtil;

/* renamed from: X.Aeh, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23708Aeh implements InterfaceC59142nF {
    public static final C23708Aeh A00 = new C23708Aeh();

    @Override // X.InterfaceC59142nF
    public final Bitmap renderImage(Bitmap bitmap) {
        C14360o3.A0B(bitmap, 0);
        return BlurUtil.blur(bitmap, 0.1f, 9);
    }
}
