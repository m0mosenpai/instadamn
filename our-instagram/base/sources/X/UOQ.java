package X;

import java.nio.ByteBuffer;

/* loaded from: classes11.dex */
public final class UOQ extends C3Q9 {
    public final AbstractC56582ir A00;
    public final ByteBuffer A01;
    public final AbstractC56602it A02;

    @Override // X.C3QA, X.C3QB
    public final int getSizeInBytes() {
        return 0;
    }

    @Override // X.C3QA, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // X.C3QA, X.C3QB
    public final int getHeight() {
        return (int) this.A02.A00;
    }

    @Override // X.C3QA, X.C3QB
    public final int getWidth() {
        return (int) this.A02.A01;
    }

    public UOQ(AbstractC56582ir abstractC56582ir, ByteBuffer byteBuffer) {
        this.A01 = byteBuffer;
        this.A00 = abstractC56582ir;
        this.A02 = abstractC56582ir.A04[abstractC56582ir.A00].A03;
    }

    @Override // X.C3QA
    public final boolean isClosed() {
        throw C00O.createAndThrow();
    }
}
