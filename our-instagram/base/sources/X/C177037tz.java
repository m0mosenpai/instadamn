package X;

import android.media.Image;
import android.media.ImageReader;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;

/* renamed from: X.7tz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C177037tz implements InterfaceC177027ty {
    public ImageReader A00;
    public final int A01;
    public final ImageReader.OnImageAvailableListener A02 = new ImageReader.OnImageAvailableListener() { // from class: X.9Js
        @Override // android.media.ImageReader.OnImageAvailableListener
        public final void onImageAvailable(ImageReader imageReader) {
            C177037tz c177037tz = C177037tz.this;
            ImageReader imageReader2 = c177037tz.A00;
            byte[] bArr = null;
            if (imageReader2 != null) {
                imageReader2.setOnImageAvailableListener(null, null);
            }
            C196668mw c196668mw = c177037tz.A03;
            c177037tz.A03 = null;
            try {
                if (c196668mw != null) {
                    try {
                        Image acquireNextImage = imageReader.acquireNextImage();
                        if (acquireNextImage != null) {
                            try {
                                Image.Plane[] planes = acquireNextImage.getPlanes();
                                if (planes != null && planes.length > 0) {
                                    ByteBuffer buffer = planes[0].getBuffer();
                                    buffer.rewind();
                                    bArr = new byte[buffer.remaining()];
                                    buffer.get(bArr);
                                }
                                acquireNextImage.close();
                            } catch (Throwable th) {
                                try {
                                    acquireNextImage.close();
                                } catch (Throwable th2) {
                                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                                }
                                throw th;
                            }
                        }
                    } catch (Exception e) {
                        android.util.Log.e("DefaultPhotoProcessor", AbstractC166997dE.A0y("Failed to acquire image: ", e), e);
                    }
                }
            } finally {
                if (C178607wY.A00()) {
                    bArr = C178607wY.A01();
                }
                c196668mw.A00(new C196698mz(bArr, c177037tz.A01));
            }
        }
    };
    public volatile C196668mw A03;

    @Override // X.InterfaceC177027ty
    public final int BGf() {
        return this.A01;
    }

    @Override // X.InterfaceC177027ty
    public final void CNa(int i, int i2, int i3) {
        this.A00 = ImageReader.newInstance(i, i2, this.A01, 1);
    }

    @Override // X.InterfaceC177027ty
    public final void E5b(Handler handler, C196668mw c196668mw) {
        if (this.A00 != null) {
            this.A03 = c196668mw;
            this.A00.setOnImageAvailableListener(this.A02, handler);
        }
    }

    @Override // X.InterfaceC177027ty
    public final Surface getSurface() {
        ImageReader imageReader = this.A00;
        if (imageReader != null) {
            return imageReader.getSurface();
        }
        return null;
    }

    @Override // X.InterfaceC177027ty
    public final boolean isEnabled() {
        if (this.A00 == null) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC177027ty
    public final void release() {
        ImageReader imageReader = this.A00;
        if (imageReader != null) {
            imageReader.setOnImageAvailableListener(null, null);
            this.A00.close();
            this.A00 = null;
        }
        this.A03 = null;
    }

    public C177037tz(int i) {
        this.A01 = i;
    }
}
