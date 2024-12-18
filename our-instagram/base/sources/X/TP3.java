package X;

import android.graphics.Bitmap;
import android.widget.ImageView;

/* loaded from: classes10.dex */
public final class TP3 implements Runnable {
    public final /* synthetic */ Bitmap A00;
    public final /* synthetic */ SJ6 A01;

    public TP3(Bitmap bitmap, SJ6 sj6) {
        this.A01 = sj6;
        this.A00 = bitmap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ImageView imageView = this.A01.A03;
        if (imageView != null) {
            imageView.setImageBitmap(this.A00);
        }
    }
}
