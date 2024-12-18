package X;

import com.instagram.direct.armadilloexpress.transportpayload.CommonMediaTransport;
import com.instagram.direct.armadilloexpress.transportpayload.Thumbnail;

/* renamed from: X.K6p, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45382K6p extends AbstractC60877RXa implements InterfaceC65445TkH {
    public C45382K6p() {
        super(Thumbnail.DEFAULT_INSTANCE);
    }

    public final void A06(int i) {
        Thumbnail thumbnail = (Thumbnail) AbstractC43592JPx.A0K(this);
        thumbnail.bitField0_ |= 2;
        thumbnail.height_ = i;
    }

    public final void A07(int i) {
        Thumbnail thumbnail = (Thumbnail) AbstractC43592JPx.A0K(this);
        thumbnail.bitField0_ |= 4;
        thumbnail.width_ = i;
    }

    public final void A08(CommonMediaTransport commonMediaTransport) {
        Thumbnail thumbnail = (Thumbnail) AbstractC43592JPx.A0K(this);
        thumbnail.mediaTransport_ = commonMediaTransport;
        thumbnail.bitField0_ |= 1;
    }
}
