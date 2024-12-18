package X;

import android.graphics.Bitmap;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.Owf, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56172Owf implements InterfaceC65702y7 {
    public static final C56172Owf A00 = new C56172Owf();

    @Override // X.InterfaceC65702y7
    public final void EGm(Bitmap bitmap, IgImageView igImageView) {
        C14360o3.A0B(igImageView, 0);
        C8FY c8fy = new C8FY(igImageView.getResources(), bitmap);
        c8fy.A00();
        igImageView.setImageDrawable(c8fy);
    }
}
