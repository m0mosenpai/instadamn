package X;

/* loaded from: classes10.dex */
public final class RFS extends C4C1 {
    public android.net.Uri A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RFS() {
        super(false);
        Object obj = null;
        obj.getClass();
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC92354Bq
    public final void close() {
        this.A00 = null;
    }

    @Override // X.InterfaceC92364Br
    public final int read(byte[] bArr, int i, int i2) {
        return i2 == 0 ? 0 : -1;
    }

    @Override // X.InterfaceC92354Bq
    public final android.net.Uri getUri() {
        return this.A00;
    }

    @Override // X.InterfaceC92354Bq
    public final long open(C4C7 c4c7) {
        this.A00 = c4c7.A06;
        A02();
        throw AbstractC166987dD.A15("array-length");
    }
}
