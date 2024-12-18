package X;

/* loaded from: classes10.dex */
public final class SMD {
    public final int A00;
    public final AbstractC64515THi A01;
    public final Integer A02;
    public final boolean A03;

    public final String toString() {
        String localizedMessage;
        AbstractC64515THi abstractC64515THi = this.A01;
        if (abstractC64515THi instanceof C60546R6j) {
            localizedMessage = "None";
        } else {
            localizedMessage = ((Throwable) abstractC64515THi.A01()).getLocalizedMessage();
        }
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("NetworkState{mConnected=");
        A1C.append(this.A03);
        A1C.append(", mConnectionType=");
        A1C.append(S11.A00(this.A02));
        A1C.append(", mNetworkType=");
        A1C.append(this.A00);
        A1C.append(", mThrowable=");
        A1C.append(localizedMessage);
        return AbstractC167027dH.A0R(A1C);
    }

    public SMD(Integer num, Throwable th, int i, boolean z) {
        AbstractC64515THi c60547R6k;
        this.A03 = z;
        this.A02 = num;
        this.A00 = i;
        if (th == null) {
            c60547R6k = C60546R6j.A00;
        } else {
            c60547R6k = new C60547R6k(th);
        }
        this.A01 = c60547R6k;
    }
}
