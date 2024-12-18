package X;

import android.graphics.Bitmap;
import android.widget.FrameLayout;
import android.widget.ImageView;

/* renamed from: X.LzS, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC49821LzS implements Runnable {
    public final /* synthetic */ K5S A00;

    public RunnableC49821LzS(K5S k5s) {
        this.A00 = k5s;
    }

    @Override // java.lang.Runnable
    public final void run() {
        K5S k5s = this.A00;
        Bitmap bitmap = k5s.A06;
        if (bitmap != null) {
            FrameLayout frameLayout = k5s.A0B;
            C14360o3.A0A(frameLayout);
            float A07 = AbstractC166987dD.A07(frameLayout);
            k5s.A01 = A07;
            k5s.A00 = (A07 / bitmap.getWidth()) * bitmap.getHeight();
            ImageView imageView = k5s.A0G;
            C14360o3.A0A(imageView);
            imageView.setImageBitmap(bitmap);
        }
    }
}
