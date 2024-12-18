package X;

import android.app.Activity;
import com.instagram.ui.mediaactions.VideoScrubberSeekBar;

/* loaded from: classes5.dex */
public final class D2G implements Runnable {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ BLI A01;
    public final /* synthetic */ Long A02;

    public D2G(Activity activity, BLI bli, Long l) {
        this.A00 = activity;
        this.A01 = bli;
        this.A02 = l;
    }

    @Override // java.lang.Runnable
    public final void run() {
        CTW ctw = BPE.A0G;
        Activity activity = this.A00;
        C120985dq c120985dq = this.A01.A06;
        VideoScrubberSeekBar A00 = ctw.A00(activity, c120985dq);
        if (A00 != null) {
            A00.setupKeyFrameMarkersForAds(activity, c120985dq.getId(), AbstractC25226BEj.A0y(c120985dq).A0C.CF8(), this.A02);
        }
    }
}
