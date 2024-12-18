package X;

import com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment;

/* renamed from: X.PLw, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC56877PLw implements Runnable {
    public final /* synthetic */ ClipsStackedTimelineFragment A00;

    public RunnableC56877PLw(ClipsStackedTimelineFragment clipsStackedTimelineFragment) {
        this.A00 = clipsStackedTimelineFragment;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        ClipsStackedTimelineFragment clipsStackedTimelineFragment = this.A00;
        C87H c87h = clipsStackedTimelineFragment.A0j;
        if (c87h == null) {
            C14360o3.A0F("videoPlaybackViewModel");
            throw C00O.createAndThrow();
        }
        C87J A0P = MSX.A0P(c87h);
        if (A0P != null) {
            i = A0P.CFM();
        } else {
            i = 0;
        }
        ClipsStackedTimelineFragment.A0C(clipsStackedTimelineFragment, i);
    }
}
