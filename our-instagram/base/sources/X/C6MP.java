package X;

/* renamed from: X.6MP, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6MP extends AbstractC75003Yq {
    public int A00;
    public int A01;
    public C6MN A02;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.3Yq, X.6MP] */
    @Override // X.AbstractC75003Yq
    public final AbstractC75003Yq A00() {
        C6MN c6mn = this.A02;
        ?? abstractC75003Yq = new AbstractC75003Yq();
        abstractC75003Yq.A02 = c6mn;
        return abstractC75003Yq;
    }

    @Override // X.AbstractC75003Yq
    public final void A01(AbstractC75003Yq abstractC75003Yq) {
        synchronized (ST3.A00) {
            C14360o3.A0C(abstractC75003Yq, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord.assign$lambda$0>");
            C6MP c6mp = (C6MP) abstractC75003Yq;
            this.A02 = c6mp.A02;
            this.A00 = c6mp.A00;
            this.A01 = c6mp.A01;
        }
    }
}
