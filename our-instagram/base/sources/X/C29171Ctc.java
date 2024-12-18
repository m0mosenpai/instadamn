package X;

import android.graphics.Bitmap;
import com.instagram.common.ui.blur.BlurUtil;

/* renamed from: X.Ctc, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29171Ctc implements InterfaceC59142nF {
    public static final C29171Ctc A00 = new C29171Ctc();

    @Override // X.InterfaceC59142nF
    public final Bitmap renderImage(Bitmap bitmap) {
        C14360o3.A0B(bitmap, 0);
        return BlurUtil.blurWithAlpha(bitmap, 0.1f, 6, 128);
    }
}
