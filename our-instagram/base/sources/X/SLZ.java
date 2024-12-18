package X;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkRequest;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes10.dex */
public abstract class SLZ {
    public final InterfaceC65488Tl8 A00;
    public final C62476SDd A01;
    public final Context A02;

    public final void A00() {
        ConnectivityManager connectivityManager;
        Object systemService = this.A02.getSystemService("connectivity");
        if ((systemService instanceof ConnectivityManager) && (connectivityManager = (ConnectivityManager) systemService) != null) {
            connectivityManager.requestNetwork(new NetworkRequest.Builder().addTransportType(0).addCapability(12).build(), new C58699Q2a(connectivityManager, this, new AtomicBoolean(false)), this.A01.A00);
        } else {
            this.A00.DG0(new C58915QJt());
        }
    }

    public SLZ(Context context, InterfaceC65488Tl8 interfaceC65488Tl8, C62476SDd c62476SDd) {
        this.A02 = context;
        this.A00 = interfaceC65488Tl8;
        this.A01 = c62476SDd;
    }
}
