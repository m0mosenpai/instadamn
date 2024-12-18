package X;

import com.instagram.creation.activity.MediaCaptureActivity;

/* loaded from: classes9.dex */
public final class NGC extends AbstractRunnableC14200nk {
    public final /* synthetic */ MediaCaptureActivity A00;

    @Override // java.lang.Runnable
    public final void run() {
        MediaCaptureActivity mediaCaptureActivity = this.A00;
        OJQ ojq = mediaCaptureActivity.A02;
        if (ojq != null) {
            OLV olv = new OLV(new C50665MYi(mediaCaptureActivity.A04), mediaCaptureActivity.A02.A01);
            C54585O9m c54585O9m = ojq.A00;
            new C55097Ob8(olv, c54585O9m.A00, c54585O9m.A01, c54585O9m.A02).A02();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NGC(MediaCaptureActivity mediaCaptureActivity) {
        super(1749066752);
        this.A00 = mediaCaptureActivity;
    }
}
