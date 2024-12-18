package X;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.2y6, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C65692y6 implements InterfaceC65702y7 {
    @Override // X.InterfaceC65702y7
    public final void EGm(Bitmap bitmap, IgImageView igImageView) {
        Drawable drawable = igImageView.getDrawable();
        if (!(drawable instanceof BitmapDrawable) && !(drawable instanceof C80753j5)) {
            igImageView.setImageBitmap(bitmap);
            return;
        }
        C80753j5 c80753j5 = new C80753j5(drawable, new BitmapDrawable(igImageView.getResources(), bitmap));
        igImageView.setImageDrawable(c80753j5);
        c80753j5.A04.setDuration(200L).start();
    }
}
