package X;

import android.view.MotionEvent;
import com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment;

/* loaded from: classes9.dex */
public final class NI4 extends AbstractC55637OnM {
    public boolean A00;
    public final /* synthetic */ ClipsStackedTimelineFragment A01;

    @Override // X.AbstractC55637OnM, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        C14360o3.A0B(motionEvent, 0);
        ClipsStackedTimelineFragment clipsStackedTimelineFragment = this.A01;
        C187358Sd c187358Sd = clipsStackedTimelineFragment.A0d;
        if (c187358Sd != null) {
            if (c187358Sd.A0E() instanceof C187508Ss) {
                clipsStackedTimelineFragment.A0Q();
                return true;
            }
            C187358Sd c187358Sd2 = clipsStackedTimelineFragment.A0d;
            if (c187358Sd2 != null) {
                if (c187358Sd2.A0E() instanceof C187538Sv) {
                    clipsStackedTimelineFragment.A0P();
                    return true;
                }
                this.A00 = false;
                return super.onSingleTapUp(motionEvent);
            }
        }
        C14360o3.A0F("clipsTimelineEditorViewModel");
        throw C00O.createAndThrow();
    }

    public NI4(ClipsStackedTimelineFragment clipsStackedTimelineFragment) {
        this.A01 = clipsStackedTimelineFragment;
    }
}
