package X;

import android.graphics.Bitmap;
import com.instagram.common.ui.blur.BlurUtil;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.Ldj, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48546Ldj implements InterfaceC65702y7 {
    public static final C48546Ldj A00 = new C48546Ldj();

    @Override // X.InterfaceC65702y7
    public final void EGm(Bitmap bitmap, IgImageView igImageView) {
        AbstractC167017dG.A1N(igImageView, bitmap);
        igImageView.setImageBitmap(BlurUtil.blur(bitmap, 0.85f, 40));
    }
}
