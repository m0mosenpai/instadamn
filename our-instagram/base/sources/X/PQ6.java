package X;

import com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment;

/* loaded from: classes9.dex */
public final class PQ6 implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ ClipsStackedTimelineFragment A01;

    public PQ6(ClipsStackedTimelineFragment clipsStackedTimelineFragment, int i) {
        this.A01 = clipsStackedTimelineFragment;
        this.A00 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ClipsStackedTimelineFragment.A0C(this.A01, this.A00);
    }
}
