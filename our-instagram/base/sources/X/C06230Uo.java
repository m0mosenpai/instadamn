package X;

/* renamed from: X.0Uo, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C06230Uo implements C0SJ {
    public final C0SJ A00;

    @Override // X.C0SJ
    public final Object BYU(int i, int i2) {
        return this.A00.BYU(i, 1);
    }

    @Override // X.C0SJ, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // X.C0SJ
    public final boolean CLk(C0SJ c0sj) {
        return this.A00.CLk(c0sj);
    }

    @Override // X.C0SJ
    public final String getTag() {
        return this.A00.getTag();
    }

    @Override // X.C0SJ
    public final int getType() {
        return this.A00.getType();
    }

    public C06230Uo(C0SJ c0sj) {
        this.A00 = c0sj instanceof C06230Uo ? ((C06230Uo) c0sj).A00 : c0sj;
    }

    @Override // X.C0SJ
    public final long BP6(long j, int i, int i2) {
        return this.A00.BP6(79L, 131073, 1);
    }
}
