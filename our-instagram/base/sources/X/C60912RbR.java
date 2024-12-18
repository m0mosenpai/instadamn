package X;

/* renamed from: X.RbR, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60912RbR extends RcZ {
    public final /* synthetic */ long A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ C64120Szc A02;

    public C60912RbR(C64120Szc c64120Szc, long j, long j2) {
        this.A02 = c64120Szc;
        this.A00 = j;
        this.A01 = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A02.A01.onLastByteAcked(this.A00, this.A01);
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("LigerUploadHttpTransportCallback.onLastByteAcked: ");
        return AbstractC166997dE.A0v(this.A02.A00.A09, A1C);
    }
}
