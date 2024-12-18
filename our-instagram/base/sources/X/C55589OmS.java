package X;

import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineViewController;

/* renamed from: X.OmS, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55589OmS implements C7LD {
    public final /* synthetic */ C008102v A00;
    public final /* synthetic */ OXZ A01;

    @Override // X.C7LD
    public final boolean DMd(MotionEvent motionEvent, RecyclerView recyclerView) {
        C187358Sd c187358Sd;
        C14360o3.A0B(motionEvent, 1);
        OXZ oxz = this.A01;
        if (oxz instanceof NI6) {
            c187358Sd = ((NI6) oxz).A0H;
        } else if (oxz instanceof NI7) {
            c187358Sd = ((NI7) oxz).A0G;
        } else if (oxz instanceof ClipsStackedTimelineViewController) {
            c187358Sd = ((ClipsStackedTimelineViewController) oxz).A0G;
        } else {
            c187358Sd = ((NI5) oxz).A0J;
        }
        if (!(c187358Sd.A0E() instanceof C187538Sv) && !oxz.A0M() && oxz.A02 && motionEvent.getPointerCount() == 1) {
            this.A00.A00.onTouchEvent(motionEvent);
        }
        return !oxz.A02;
    }

    @Override // X.C7LD
    public final void Dfm(boolean z) {
    }

    @Override // X.C7LD
    public final void Du8(MotionEvent motionEvent, RecyclerView recyclerView) {
    }

    public C55589OmS(C008102v c008102v, OXZ oxz) {
        this.A01 = oxz;
        this.A00 = c008102v;
    }
}
