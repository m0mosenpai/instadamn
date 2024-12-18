package X;

import com.facebook.videolite.instagram.VideoIngestionStep;

/* loaded from: classes9.dex */
public final class OKQ {
    public final InterfaceC19630xq A00 = AbstractC19750y3.A01("video_upload_network_preference");
    public final /* synthetic */ VideoIngestionStep A01;

    public OKQ(VideoIngestionStep videoIngestionStep) {
        this.A01 = videoIngestionStep;
    }

    public final double A01() {
        if (!C18U.A06(C06090Tz.A05, this.A01.A02, 36329758262379022L)) {
            return -1.0d;
        }
        double A01 = C23231Bc.A00().A01();
        if (A01 < 0.0d) {
            return -1.0d;
        }
        return 8.0d * A01;
    }

    public final double A00() {
        double A01 = C1BU.A00().A01();
        if (A01 > 0.0d) {
            InterfaceC19610xo ARD = this.A00.ARD();
            ARD.E7A("last_measured_positive_bandwidth_for_upload", (float) A01);
            ARD.apply();
        } else if (A01 <= 0.0d) {
            A01 = this.A00.getFloat("last_measured_positive_bandwidth_for_upload", 0.0f);
        }
        if (A01 < 0.0d) {
            return -1.0d;
        }
        return A01 * 8.0d;
    }
}
