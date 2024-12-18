package X;

/* renamed from: X.OsY, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55940OsY implements InterfaceC65613To4 {
    public long A00;
    public final AbstractC53638Nnj A01;

    @Override // X.InterfaceC65613To4
    public final void onBytesTransferred(long j, long j2) {
        long max = Math.max(j - this.A00, 0L);
        this.A00 = j;
        this.A01.A00((int) max);
    }

    public C55940OsY(AbstractC53638Nnj abstractC53638Nnj) {
        this.A01 = abstractC53638Nnj;
    }
}
