package X;

import android.graphics.Bitmap;
import com.instagram.common.ui.blur.BlurUtil;

/* renamed from: X.Aef, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23706Aef implements InterfaceC59142nF {
    public static final C23706Aef A00 = new C23706Aef();

    @Override // X.InterfaceC59142nF
    public final Bitmap renderImage(Bitmap bitmap) {
        C14360o3.A0B(bitmap, 0);
        return BlurUtil.blur(bitmap, 0.1f, 10);
    }
}
