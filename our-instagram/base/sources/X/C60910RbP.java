package X;

/* renamed from: X.RbP, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60910RbP extends RcZ {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C64120Szc A01;

    public C60910RbP(C64120Szc c64120Szc, long j) {
        this.A01 = c64120Szc;
        this.A00 = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A01.A01.onFirstByteFlushed(this.A00);
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("LigerUploadHttpTransportCallback.firstByteFlushed: ");
        return AbstractC166997dE.A0v(this.A01.A00.A09, A1C);
    }
}
