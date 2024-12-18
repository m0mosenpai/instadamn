package X;

/* loaded from: classes10.dex */
public final class Q67 extends AbstractC75003Yq {
    public int A00;
    public C57N A01;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.Q67, X.3Yq] */
    @Override // X.AbstractC75003Yq
    public final AbstractC75003Yq A00() {
        C57N c57n = this.A01;
        ?? abstractC75003Yq = new AbstractC75003Yq();
        abstractC75003Yq.A01 = c57n;
        return abstractC75003Yq;
    }

    @Override // X.AbstractC75003Yq
    public final void A01(AbstractC75003Yq abstractC75003Yq) {
        C14360o3.A0C(abstractC75003Yq, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord, V of androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord>");
        Q67 q67 = (Q67) abstractC75003Yq;
        synchronized (ST4.A00) {
            this.A01 = q67.A01;
            this.A00 = q67.A00;
        }
    }
}
