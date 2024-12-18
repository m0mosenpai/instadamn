package X;

/* loaded from: classes11.dex */
public abstract class UOO extends UOP {
    public C68675VaB A00;

    @Override // X.C3QA, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            C68675VaB c68675VaB = this.A00;
            if (c68675VaB == null) {
                return;
            }
            this.A00 = null;
            synchronized (c68675VaB) {
            }
        }
    }

    @Override // X.C3QA, X.C3QB
    public final synchronized int getHeight() {
        int height;
        C68675VaB c68675VaB = this.A00;
        if (c68675VaB != null) {
            height = c68675VaB.A00.getHeight();
        } else {
            height = 0;
        }
        return height;
    }

    @Override // X.C3QA, X.C3QB
    public final synchronized int getSizeInBytes() {
        int sizeInBytes;
        C68675VaB c68675VaB = this.A00;
        if (c68675VaB != null) {
            sizeInBytes = c68675VaB.A00.getSizeInBytes();
        } else {
            sizeInBytes = 0;
        }
        return sizeInBytes;
    }

    @Override // X.C3QA, X.C3QB
    public final synchronized int getWidth() {
        int width;
        C68675VaB c68675VaB = this.A00;
        if (c68675VaB != null) {
            width = c68675VaB.A00.getWidth();
        } else {
            width = 0;
        }
        return width;
    }

    @Override // X.C3QA
    public final synchronized boolean isClosed() {
        return AbstractC25229BEm.A1Z(this.A00);
    }

    public UOO(C68675VaB c68675VaB) {
        this.A00 = c68675VaB;
    }
}
