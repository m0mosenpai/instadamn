package X;

import com.instagram.realtimeclient.RealtimeSubscription;

/* renamed from: X.HDm, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38960HDm extends C124275jh {
    @Override // X.C124275jh, X.InterfaceC124295jj
    public final InterfaceC111084zP BbA() {
        C125905mf A00 = InterfaceC111084zP.A00.A00(true);
        A00.A00 = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
        return A00.A00();
    }

    @Override // X.C124275jh, X.InterfaceC74303Vl
    public final boolean CQG() {
        return true;
    }

    @Override // X.C124275jh, X.InterfaceC74303Vl
    public final String getNextMaxId() {
        return RealtimeSubscription.GRAPHQL_MQTT_VERSION;
    }

    public final void A01() {
        super.A00();
    }
}
