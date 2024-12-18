package X;

import android.graphics.Bitmap;
import com.instagram.common.ui.blur.BlurUtil;

/* renamed from: X.6az, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C141826az implements InterfaceC59142nF {
    public static final C141826az A00 = new C141826az();

    @Override // X.InterfaceC59142nF
    public final Bitmap renderImage(Bitmap bitmap) {
        C14360o3.A0B(bitmap, 0);
        return BlurUtil.blur(bitmap, 0.25f, 10);
    }
}
