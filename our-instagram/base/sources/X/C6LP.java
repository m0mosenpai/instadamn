package X;

/* renamed from: X.6LP, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6LP extends AbstractC75003Yq {
    public long A00;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.3Yq, X.6LP] */
    @Override // X.AbstractC75003Yq
    public final AbstractC75003Yq A00() {
        long j = this.A00;
        ?? abstractC75003Yq = new AbstractC75003Yq();
        abstractC75003Yq.A00 = j;
        return abstractC75003Yq;
    }

    @Override // X.AbstractC75003Yq
    public final void A01(AbstractC75003Yq abstractC75003Yq) {
        C14360o3.A0C(abstractC75003Yq, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord");
        this.A00 = ((C6LP) abstractC75003Yq).A00;
    }
}
