package X;

import android.graphics.Bitmap;
import android.view.PixelCopy;

/* loaded from: classes4.dex */
public final class APu implements PixelCopy.OnPixelCopyFinishedListener {
    public final /* synthetic */ Bitmap A00;

    public APu(Bitmap bitmap) {
        this.A00 = bitmap;
    }

    @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
    public final void onPixelCopyFinished(int i) {
        if (i != 0) {
            this.A00.eraseColor(-16777216);
            AbstractC12120kG.A07("ConstrainedViewHolder", "Failed to get Bitmap from Surface.", null);
        }
    }
}
