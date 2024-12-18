package X;

import android.media.Image;
import android.media.ImageReader;

/* loaded from: classes4.dex */
public final class API implements ImageReader.OnImageAvailableListener {
    public final int A00;
    public final Object A01;

    public API(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // android.media.ImageReader.OnImageAvailableListener
    public final void onImageAvailable(ImageReader imageReader) {
        int i = this.A00;
        Object obj = this.A01;
        if (i != 0) {
            C23454AaR c23454AaR = (C23454AaR) obj;
            Image image = c23454AaR.A00;
            if (image != null) {
                image.close();
            }
            try {
                c23454AaR.A00 = imageReader.acquireNextImage();
                C23454AaR.A01(c23454AaR);
                return;
            } catch (Throwable unused) {
                return;
            }
        }
        C23453AaQ c23453AaQ = (C23453AaQ) obj;
        Image image2 = c23453AaQ.A00;
        if (image2 != null) {
            image2.close();
        }
        c23453AaQ.A00 = imageReader.acquireNextImage();
        C23453AaQ.A00(c23453AaQ);
    }
}
