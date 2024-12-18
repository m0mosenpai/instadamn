package X;

import com.instagram.direct.armadilloexpress.transportpayload.TransportPayload;
import com.instagram.model.direct.DirectThreadKey;

/* loaded from: classes8.dex */
public final class L4J {
    public final long A00;
    public final TransportPayload A01;
    public final InterfaceC37261GbE A02;
    public final C1OW A03;
    public final DirectThreadKey A04;
    public final String A05;

    public L4J(TransportPayload transportPayload, InterfaceC37261GbE interfaceC37261GbE, C1OW c1ow, DirectThreadKey directThreadKey, String str, long j) {
        this.A02 = interfaceC37261GbE;
        this.A04 = directThreadKey;
        this.A01 = transportPayload;
        this.A00 = j;
        this.A05 = str;
        this.A03 = c1ow;
    }
}
