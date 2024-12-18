package X;

import android.graphics.Bitmap;

/* renamed from: X.3Q8, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3Q8 extends C3Q9 implements C3QE {
    public Bitmap A00;
    public final int A01;

    public C3Q8(Bitmap bitmap, EnumC59482nr enumC59482nr, String str, int i, int i2) {
        C14360o3.A0B(str, 5);
        this.A00 = bitmap;
        this.A01 = i;
        A00("ENCODED_IMAGE_SIZE", Integer.valueOf(i2));
        A00("IMAGE_RENDERED", enumC59482nr);
        A00("IMAGE_LOADED_SCANS", Integer.valueOf(i));
        A00("LOAD_SOURCE", str);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.3QQ, java.lang.Object] */
    @Override // X.C3Q9, X.C3QA, X.C3QB
    public final synchronized C3QQ BjM() {
        C3QQ c3qq;
        int i = this.A01;
        if (i == -1) {
            C3QQ c3qq2 = C3QQ.A03;
            C14360o3.A08(c3qq2);
            c3qq = c3qq2;
        } else {
            ?? obj = new Object();
            obj.A00 = i;
            obj.A02 = true;
            obj.A01 = false;
            c3qq = obj;
        }
        return c3qq;
    }

    @Override // X.C3QE
    public final synchronized Bitmap CCP() {
        Bitmap bitmap;
        bitmap = this.A00;
        if (bitmap == null) {
            throw new IllegalStateException("IgCloseableStaticBitmap has been closed already and the bitmap is no longer available.");
        }
        return bitmap;
    }

    @Override // X.C3QA, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.A00 = null;
    }

    @Override // X.C3QA, X.C3QB
    public final synchronized int getHeight() {
        int i;
        Bitmap bitmap = this.A00;
        if (bitmap != null) {
            i = bitmap.getHeight();
        } else {
            i = 0;
        }
        return i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.graphics.Bitmap] */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    @Override // X.C3QA, X.C3QB
    public final synchronized int getSizeInBytes() {
        int i;
        Bitmap bitmap = this.A00;
        if (bitmap != 0) {
            try {
                bitmap = bitmap.getAllocationByteCount();
                i = bitmap;
            } catch (NullPointerException unused) {
                i = bitmap.getByteCount();
            }
        } else {
            i = 0;
        }
        return i;
    }

    @Override // X.C3QA, X.C3QB
    public final synchronized int getWidth() {
        int i;
        Bitmap bitmap = this.A00;
        if (bitmap != null) {
            i = bitmap.getWidth();
        } else {
            i = 0;
        }
        return i;
    }

    @Override // X.C3QA
    public final synchronized boolean isClosed() {
        throw C00O.createAndThrow();
    }
}
