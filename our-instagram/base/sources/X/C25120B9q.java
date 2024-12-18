package X;

import com.instagram.realtimeclient.RealtimeSubscription;

/* renamed from: X.B9q, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C25120B9q extends C0YY implements InterfaceC16660sJ {
    public static final C25120B9q A00 = new C25120B9q();

    public C25120B9q() {
        super(1);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AbstractC23721Ec abstractC23721Ec = (AbstractC23721Ec) obj;
        C14360o3.A0B(abstractC23721Ec, 0);
        abstractC23721Ec.A09 = C05F.A00;
        abstractC23721Ec.A9s("is_prefetch", RealtimeSubscription.GRAPHQL_MQTT_VERSION);
        return abstractC23721Ec;
    }
}
