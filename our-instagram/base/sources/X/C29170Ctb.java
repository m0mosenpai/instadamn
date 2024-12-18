package X;

import android.graphics.Bitmap;
import com.instagram.common.ui.blur.BlurUtil;

/* renamed from: X.Ctb, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29170Ctb implements InterfaceC59142nF {
    public static final C29170Ctb A00 = new C29170Ctb();

    @Override // X.InterfaceC59142nF
    public final Bitmap renderImage(Bitmap bitmap) {
        C14360o3.A0B(bitmap, 0);
        return BlurUtil.blur(bitmap, 0.1f, 6);
    }
}
