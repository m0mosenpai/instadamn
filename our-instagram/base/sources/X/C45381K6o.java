package X;

import com.instagram.direct.armadilloexpress.transportpayload.CommonMediaTransport;
import com.instagram.direct.armadilloexpress.transportpayload.StaticPhoto;

/* renamed from: X.K6o, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45381K6o extends AbstractC60877RXa implements InterfaceC65445TkH {
    public C45381K6o() {
        super(StaticPhoto.DEFAULT_INSTANCE);
    }

    public final void A06(int i) {
        StaticPhoto staticPhoto = (StaticPhoto) AbstractC43592JPx.A0K(this);
        int i2 = StaticPhoto.HEIGHT_FIELD_NUMBER;
        staticPhoto.bitField0_ |= 2;
        staticPhoto.height_ = i;
    }

    public final void A07(int i) {
        StaticPhoto staticPhoto = (StaticPhoto) AbstractC43592JPx.A0K(this);
        int i2 = StaticPhoto.HEIGHT_FIELD_NUMBER;
        staticPhoto.bitField0_ |= 4;
        staticPhoto.width_ = i;
    }

    public final void A08(CommonMediaTransport commonMediaTransport) {
        StaticPhoto staticPhoto = (StaticPhoto) AbstractC43592JPx.A0K(this);
        int i = StaticPhoto.HEIGHT_FIELD_NUMBER;
        commonMediaTransport.getClass();
        staticPhoto.mediaTransport_ = commonMediaTransport;
        staticPhoto.bitField0_ |= 1;
    }
}
