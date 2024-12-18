package X;

import android.graphics.Bitmap;
import android.view.PixelCopy;

/* loaded from: classes4.dex */
public final class APw implements PixelCopy.OnPixelCopyFinishedListener {
    public final /* synthetic */ Bitmap A00;
    public final /* synthetic */ InterfaceC16660sJ A01;

    public APw(Bitmap bitmap, InterfaceC16660sJ interfaceC16660sJ) {
        this.A00 = bitmap;
        this.A01 = interfaceC16660sJ;
    }

    @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
    public final void onPixelCopyFinished(int i) {
        if (i != 0) {
            this.A00.eraseColor(-16777216);
            AbstractC12120kG.A07("ConstrainedViewHolder", "Failed to get Bitmap from Surface.", null);
        }
        this.A01.invoke(this.A00);
    }
}
