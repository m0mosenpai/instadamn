package X;

import com.instagram.direct.armadilloexpress.transportpayload.SupplementMessageContent;
import com.instagram.direct.armadilloexpress.transportpayload.SupplementMessagePayload;

/* renamed from: X.K6s, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45385K6s extends AbstractC60877RXa implements InterfaceC65445TkH {
    public C45385K6s() {
        super(SupplementMessagePayload.DEFAULT_INSTANCE);
    }

    public final void A06(C45370K6d c45370K6d) {
        SupplementMessagePayload supplementMessagePayload = (SupplementMessagePayload) AbstractC43592JPx.A0K(this);
        SupplementMessageContent supplementMessageContent = (SupplementMessageContent) c45370K6d.A02();
        supplementMessageContent.getClass();
        supplementMessagePayload.content_ = supplementMessageContent;
        supplementMessagePayload.bitField0_ |= 4;
    }

    public final void A07(String str) {
        SupplementMessagePayload supplementMessagePayload = (SupplementMessagePayload) AbstractC43592JPx.A0K(this);
        str.getClass();
        supplementMessagePayload.bitField0_ |= 1;
        supplementMessagePayload.targetMessageOtid_ = str;
    }

    public final void A08(String str) {
        SupplementMessagePayload supplementMessagePayload = (SupplementMessagePayload) AbstractC43592JPx.A0K(this);
        supplementMessagePayload.bitField0_ |= 8;
        supplementMessagePayload.targetMessageWaServerTimeSec_ = str;
    }

    public final void A09(String str) {
        SupplementMessagePayload supplementMessagePayload = (SupplementMessagePayload) AbstractC43592JPx.A0K(this);
        str.getClass();
        supplementMessagePayload.bitField0_ |= 2;
        supplementMessagePayload.uniquingKeyForSupplementalData_ = str;
    }
}
