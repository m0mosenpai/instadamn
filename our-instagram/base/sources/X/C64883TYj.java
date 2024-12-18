package X;

import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.util.Collections;
import java.util.List;

/* renamed from: X.TYj, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64883TYj extends ProxySelector {
    @Override // java.net.ProxySelector
    public final void connectFailed(java.net.URI uri, SocketAddress socketAddress, IOException iOException) {
    }

    @Override // java.net.ProxySelector
    public final List select(java.net.URI uri) {
        if (uri != null) {
            return Collections.singletonList(Proxy.NO_PROXY);
        }
        throw AbstractC166987dD.A12("uri must not be null");
    }
}
