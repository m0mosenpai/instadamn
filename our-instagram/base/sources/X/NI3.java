package X;

import android.view.MotionEvent;
import com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment;

/* loaded from: classes9.dex */
public final class NI3 extends AbstractC55637OnM {
    public final /* synthetic */ ClipsStackedTimelineFragment A00;

    public NI3(ClipsStackedTimelineFragment clipsStackedTimelineFragment) {
        this.A00 = clipsStackedTimelineFragment;
    }

    @Override // X.AbstractC55637OnM, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        C50868Mdz c50868Mdz = this.A00.A0h;
        if (c50868Mdz == null) {
            C14360o3.A0F("stackedTimelineViewModel");
            throw C00O.createAndThrow();
        }
        c50868Mdz.A0J();
        return false;
    }
}
