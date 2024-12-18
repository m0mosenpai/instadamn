package X;

import android.graphics.Bitmap;

/* loaded from: classes12.dex */
public final class YH7 implements Runnable {
    public final /* synthetic */ Bitmap A00;
    public final /* synthetic */ C72827XoH A01;

    public YH7(Bitmap bitmap, C72827XoH c72827XoH) {
        this.A01 = c72827XoH;
        this.A00 = bitmap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A01.A00.D2Q(this.A00, "MediaPipelineController");
    }
}
