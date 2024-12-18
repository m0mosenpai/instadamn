package X;

import com.instagram.direct.armadilloexpress.transportpayload.AvatarSticker;
import com.instagram.direct.armadilloexpress.transportpayload.CommonMediaTransport;

/* renamed from: X.K6r, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45384K6r extends AbstractC60877RXa implements InterfaceC65445TkH {
    public C45384K6r() {
        super(AvatarSticker.DEFAULT_INSTANCE);
    }

    public final void A06(CommonMediaTransport commonMediaTransport) {
        AvatarSticker avatarSticker = (AvatarSticker) AbstractC43592JPx.A0K(this);
        commonMediaTransport.getClass();
        avatarSticker.mediaTransport_ = commonMediaTransport;
        avatarSticker.bitField0_ |= 1;
    }

    public final void A07(String str) {
        AvatarSticker avatarSticker = (AvatarSticker) AbstractC43592JPx.A0K(this);
        str.getClass();
        avatarSticker.bitField0_ |= 4;
        avatarSticker.stickerId_ = str;
    }

    public final void A08(String str) {
        AvatarSticker avatarSticker = (AvatarSticker) AbstractC43592JPx.A0K(this);
        str.getClass();
        avatarSticker.bitField0_ |= 8;
        avatarSticker.stickerTemplate_ = str;
    }

    public final void A09(boolean z) {
        AvatarSticker avatarSticker = (AvatarSticker) AbstractC43592JPx.A0K(this);
        avatarSticker.bitField0_ |= 2;
        avatarSticker.isAnimated_ = z;
    }
}
