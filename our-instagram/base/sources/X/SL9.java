package X;

import java.net.InetAddress;

/* loaded from: classes10.dex */
public final class SL9 {
    public final long A00;
    public final InetAddress A01;

    public SL9(InetAddress inetAddress, long j) {
        this.A01 = inetAddress;
        this.A00 = j;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("InetAddress (");
        A1C.append(this.A01);
        A1C.append(", expiry: ");
        A1C.append(this.A00);
        return AbstractC166997dE.A0x(" ms", A1C);
    }
}
