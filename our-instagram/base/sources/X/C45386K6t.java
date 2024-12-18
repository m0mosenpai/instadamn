package X;

import com.instagram.direct.armadilloexpress.transportpayload.CommonMediaTransport;
import com.instagram.direct.armadilloexpress.transportpayload.Thumbnail;
import com.instagram.direct.armadilloexpress.transportpayload.Video;
import com.instagram.direct.armadilloexpress.transportpayload.VideoExtraMetadata;

/* renamed from: X.K6t, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45386K6t extends AbstractC60877RXa implements InterfaceC65445TkH {
    public C45386K6t() {
        super(Video.DEFAULT_INSTANCE);
    }

    public final void A06(int i) {
        Video video = (Video) AbstractC43592JPx.A0K(this);
        video.bitField0_ |= 2;
        video.height_ = i;
    }

    public final void A07(int i) {
        Video video = (Video) AbstractC43592JPx.A0K(this);
        video.bitField0_ |= 4;
        video.width_ = i;
    }

    public final void A08(CommonMediaTransport commonMediaTransport) {
        Video video = (Video) AbstractC43592JPx.A0K(this);
        commonMediaTransport.getClass();
        video.mediaTransport_ = commonMediaTransport;
        video.bitField0_ |= 1;
    }

    public final void A09(C45382K6p c45382K6p) {
        Video video = (Video) AbstractC43592JPx.A0K(this);
        Thumbnail thumbnail = (Thumbnail) c45382K6p.A02();
        thumbnail.getClass();
        video.thumbnail_ = thumbnail;
        video.bitField0_ |= 8;
    }

    public final void A0A(C45372K6f c45372K6f) {
        Video video = (Video) AbstractC43592JPx.A0K(this);
        VideoExtraMetadata videoExtraMetadata = (VideoExtraMetadata) c45372K6f.A02();
        videoExtraMetadata.getClass();
        video.videoExtraMetadata_ = videoExtraMetadata;
        video.bitField0_ |= 16;
    }
}
