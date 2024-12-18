package X;

import java.net.InetSocketAddress;
import java.net.Proxy;

/* loaded from: classes10.dex */
public final class SP2 {
    public final InetSocketAddress A00;
    public final Proxy A01;
    public final C62756SPn A02;

    public final boolean equals(Object obj) {
        if (obj instanceof SP2) {
            SP2 sp2 = (SP2) obj;
            if (sp2.A02.equals(this.A02) && sp2.A01.equals(this.A01) && sp2.A00.equals(this.A00)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A00, AbstractC166997dE.A0J(this.A01, JQ0.A01(this.A02.hashCode())));
    }

    public SP2(InetSocketAddress inetSocketAddress, Proxy proxy, C62756SPn c62756SPn) {
        if (inetSocketAddress != null) {
            this.A02 = c62756SPn;
            this.A01 = proxy;
            this.A00 = inetSocketAddress;
            return;
        }
        throw AbstractC166987dD.A15("inetSocketAddress == null");
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("Route{");
        return JQ0.A0l(this.A00, A1C);
    }
}
