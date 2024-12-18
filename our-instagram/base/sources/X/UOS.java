package X;

import android.graphics.Bitmap;

/* loaded from: classes11.dex */
public abstract class UOS extends C3Q9 implements C3QE {
    public C1VO A00;
    public final C3QQ A01;
    public volatile Bitmap A02;

    @Override // X.C3QA, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        C1VO c1vo;
        synchronized (this) {
            c1vo = this.A00;
            this.A00 = null;
            this.A02 = null;
        }
        if (c1vo != null) {
            c1vo.close();
        }
    }

    @Override // X.C3QA
    public final synchronized boolean isClosed() {
        return AbstractC25229BEm.A1Z(this.A00);
    }

    @Override // X.C3Q9, X.C3QA, X.C3QB
    public final C3QQ BjM() {
        return this.A01;
    }

    @Override // X.C3QE
    public final Bitmap CCP() {
        return this.A02;
    }

    @Override // X.C3QA, X.C3QB
    public final int getHeight() {
        Bitmap bitmap = this.A02;
        if (bitmap == null) {
            return 0;
        }
        return bitmap.getHeight();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [android.graphics.Bitmap] */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    @Override // X.C3QA, X.C3QB
    public final int getSizeInBytes() {
        Bitmap bitmap = this.A02;
        if (bitmap == 0) {
            return 0;
        }
        try {
            bitmap = bitmap.getAllocationByteCount();
            return bitmap;
        } catch (NullPointerException unused) {
            return bitmap.getByteCount();
        }
    }

    @Override // X.C3QA, X.C3QB
    public final int getWidth() {
        Bitmap bitmap = this.A02;
        if (bitmap == null) {
            return 0;
        }
        return bitmap.getWidth();
    }

    public UOS(Bitmap bitmap, C1VS c1vs, C3QQ c3qq) {
        this.A02 = bitmap;
        this.A00 = C1VO.A00(C1VO.A05, c1vs, this.A02);
        this.A01 = c3qq;
    }

    public UOS(C1VO c1vo, C3QQ c3qq) {
        C1VO A03 = c1vo.A03();
        A03.getClass();
        this.A00 = A03;
        this.A02 = (Bitmap) A03.A04();
        this.A01 = c3qq;
    }
}
