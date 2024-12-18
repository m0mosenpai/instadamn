package X;

/* renamed from: X.0SN, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0SN extends AbstractC02970Bv {
    public volatile C0C7 A00;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0Bu, java.lang.Object] */
    @Override // X.AbstractC02970Bv
    public final /* bridge */ /* synthetic */ AbstractC02960Bu A03() {
        return new Object();
    }

    @Override // X.AbstractC02970Bv
    public final /* bridge */ /* synthetic */ boolean A04(AbstractC02960Bu abstractC02960Bu) {
        boolean By4;
        C0SO c0so = (C0SO) abstractC02960Bu;
        synchronized (this) {
            if (c0so != null) {
                if (this.A00 != null) {
                    By4 = this.A00.By4(c0so);
                } else {
                    By4 = false;
                }
            } else {
                throw new IllegalArgumentException("Null value passed to getSnapshot!");
            }
        }
        return By4;
    }
}
