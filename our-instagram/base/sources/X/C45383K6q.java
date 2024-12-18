package X;

import com.instagram.direct.armadilloexpress.transportpayload.TransportPayload;

/* renamed from: X.K6q, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45383K6q extends AbstractC60877RXa implements InterfaceC65445TkH {
    public C45383K6q() {
        super(TransportPayload.DEFAULT_INSTANCE);
    }

    public final void A06(K6H k6h) {
        JQ1.A0D(this, k6h).transportPayloadCase_ = 2;
    }

    public final void A07(C45385K6s c45385K6s) {
        JQ1.A0D(this, c45385K6s).transportPayloadCase_ = 3;
    }

    public final void A08(boolean z) {
        TransportPayload transportPayload = (TransportPayload) AbstractC43592JPx.A0K(this);
        transportPayload.bitField0_ |= 16;
        transportPayload.openEb_ = z;
    }
}
