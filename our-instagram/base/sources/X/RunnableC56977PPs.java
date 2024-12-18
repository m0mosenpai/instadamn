package X;

import com.instagram.creation.activity.MediaCaptureActivity;

/* renamed from: X.PPs, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC56977PPs implements Runnable {
    public final /* synthetic */ MediaCaptureActivity A00;
    public final /* synthetic */ boolean A01;

    public RunnableC56977PPs(MediaCaptureActivity mediaCaptureActivity, boolean z) {
        this.A00 = mediaCaptureActivity;
        this.A01 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MediaCaptureActivity mediaCaptureActivity = this.A00;
        C50693MZn c50693MZn = mediaCaptureActivity.A0A;
        if (c50693MZn != null && c50693MZn.A02.size() > 1 && mediaCaptureActivity.getSupportFragmentManager().A0L() != 0 && !this.A01) {
            AbstractC43593JPy.A1P(mediaCaptureActivity.A04);
            return;
        }
        C50699MZu A00 = AbstractC50666MYj.A00(mediaCaptureActivity.A04);
        A00.A09(A00.A01, 4);
        mediaCaptureActivity.finish();
    }
}
