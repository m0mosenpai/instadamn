package X;

import android.graphics.Bitmap;
import android.view.PixelCopy;

/* renamed from: X.WKx, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class PixelCopyOnPixelCopyFinishedListenerC70226WKx implements PixelCopy.OnPixelCopyFinishedListener {
    public final /* synthetic */ Bitmap A00;
    public final /* synthetic */ C14510oO A01;

    public PixelCopyOnPixelCopyFinishedListenerC70226WKx(Bitmap bitmap, C14510oO c14510oO) {
        this.A01 = c14510oO;
        this.A00 = bitmap;
    }

    @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
    public final void onPixelCopyFinished(int i) {
        if (i != 0) {
            this.A01.A00 = true;
            this.A00.recycle();
        }
    }
}
