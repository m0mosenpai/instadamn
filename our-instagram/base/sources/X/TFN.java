package X;

/* loaded from: classes10.dex */
public final class TFN implements InterfaceC65613To4 {
    public final /* synthetic */ TFS A00;

    public TFN(TFS tfs) {
        this.A00 = tfs;
    }

    @Override // X.InterfaceC65613To4
    public final void onBytesTransferred(long j, long j2) {
        this.A00.A02.onBytesTransferred(j + r3.A01, r3.A00);
    }
}
