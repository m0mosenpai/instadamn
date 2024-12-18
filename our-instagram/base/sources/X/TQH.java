package X;

import android.graphics.Bitmap;
import android.widget.ImageView;

/* loaded from: classes10.dex */
public final class TQH implements Runnable {
    public final /* synthetic */ Bitmap A00;
    public final /* synthetic */ Bitmap A01;
    public final /* synthetic */ SJ6 A02;

    public TQH(Bitmap bitmap, Bitmap bitmap2, SJ6 sj6) {
        this.A00 = bitmap;
        this.A01 = bitmap2;
        this.A02 = sj6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ImageView imageView;
        ImageView imageView2;
        Bitmap bitmap = this.A00;
        if (bitmap != null) {
            SJ6 sj6 = this.A02;
            Bitmap A05 = C1NC.A05(bitmap);
            if (A05 != null && (imageView2 = sj6.A02) != null) {
                imageView2.setImageBitmap(A05);
            }
        }
        Bitmap bitmap2 = this.A01;
        if (bitmap2 != null) {
            SJ6 sj62 = this.A02;
            Bitmap A052 = C1NC.A05(bitmap2);
            if (A052 != null && (imageView = sj62.A01) != null) {
                imageView.setImageBitmap(A052);
            }
        }
    }
}
