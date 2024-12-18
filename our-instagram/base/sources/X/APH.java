package X;

import android.media.ImageReader;

/* loaded from: classes4.dex */
public final class APH implements ImageReader.OnImageAvailableListener {
    public final /* synthetic */ C81N A00;

    public APH(C81N c81n) {
        this.A00 = c81n;
    }

    @Override // android.media.ImageReader.OnImageAvailableListener
    public final void onImageAvailable(ImageReader imageReader) {
        C81N.A01(this.A00);
    }
}
