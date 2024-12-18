package X;

import com.facebook.mediastreaming.opt.transport.videoprotocolimpl.TransportEventBaseProvider;

/* renamed from: X.SJn, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62630SJn {
    public final synchronized Object provideEventBase() {
        TransportEventBaseProvider transportEventBaseProvider;
        transportEventBaseProvider = TransportEventBaseProvider.provider;
        if (transportEventBaseProvider == null) {
            transportEventBaseProvider = new TransportEventBaseProvider();
            TransportEventBaseProvider.provider = transportEventBaseProvider;
        }
        return transportEventBaseProvider.eventBase;
    }
}
